/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.flows;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import core.ClientOptions;
import core.MediaTypes;
import core.ObjectMappers;
import core.RequestOptions;
import core.RulebricksApiApiException;
import core.RulebricksApiException;
import errors.BadRequestError;
import errors.InternalServerError;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

public class AsyncFlowsClient {
  protected final ClientOptions clientOptions;

  public AsyncFlowsClient(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  /**
   * Execute a flow by its slug.
   */
  public CompletableFuture<Map<String, Object>> executeFlow(String slug,
      Map<String, Object> request) {
    return executeFlow(slug,request,null);
  }

  /**
   * Execute a flow by its slug.
   */
  public CompletableFuture<Map<String, Object>> executeFlow(String slug,
      Map<String, Object> request, RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()

      .addPathSegments("api/v1/flows")
      .addPathSegment(slug)
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(JsonProcessingException e) {
      throw new RulebricksApiException("Failed to serialize request", e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .addHeader("Accept", "application/json")
      .build();
    OkHttpClient client = clientOptions.httpClient();
    if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
      client = clientOptions.httpClientWithTimeout(requestOptions);
    }
    CompletableFuture<Map<String, Object>> future = new CompletableFuture<>();
    client.newCall(okhttpRequest).enqueue(new Callback() {
      @Override
      public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
        try (ResponseBody responseBody = response.body()) {
          if (response.isSuccessful()) {
            future.complete(ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), new TypeReference<Map<String, Object>>() {}));
            return;
          }
          String responseBodyString = responseBody != null ? responseBody.string() : "{}";
          try {
            switch (response.code()) {
              case 400:future.completeExceptionally(new BadRequestError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class)));
              return;
              case 500:future.completeExceptionally(new InternalServerError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class)));
              return;
            }
          }
          catch (JsonProcessingException ignored) {
            // unable to map error response, throwing generic error
          }
          future.completeExceptionally(new RulebricksApiApiException("Error with status code " + response.code(), response.code(), ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class)));
          return;
        }
        catch (IOException e) {
          future.completeExceptionally(new RulebricksApiException("Network error executing HTTP request", e));
        }
      }

      @Override
      public void onFailure(@NotNull Call call, @NotNull IOException e) {
        future.completeExceptionally(new RulebricksApiException("Network error executing HTTP request", e));
      }
    });
    return future;
  }
}
