/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.decisions;

import com.fasterxml.jackson.core.JsonProcessingException;
import core.ClientOptions;
import core.ObjectMappers;
import core.QueryStringMapper;
import core.RequestOptions;
import core.RulebricksApiApiException;
import core.RulebricksApiException;
import errors.BadRequestError;
import errors.InternalServerError;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.CompletableFuture;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import resources.decisions.requests.DecisionsQueryRequest;
import types.DecisionLogResponse;

public class AsyncDecisionsClient {
  protected final ClientOptions clientOptions;

  public AsyncDecisionsClient(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  /**
   * Retrieve logs for a specific user and rule, with optional date range and pagination.
   */
  public CompletableFuture<DecisionLogResponse> query(DecisionsQueryRequest request) {
    return query(request,null);
  }

  /**
   * Retrieve logs for a specific user and rule, with optional date range and pagination.
   */
  public CompletableFuture<DecisionLogResponse> query(DecisionsQueryRequest request,
      RequestOptions requestOptions) {
    HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()

      .addPathSegments("decisions/query");QueryStringMapper.addQueryParameter(httpUrl, "slug", request.getSlug(), false);
      if (request.getFrom().isPresent()) {
        QueryStringMapper.addQueryParameter(httpUrl, "from", request.getFrom().get().toString(), false);
      }
      if (request.getTo().isPresent()) {
        QueryStringMapper.addQueryParameter(httpUrl, "to", request.getTo().get().toString(), false);
      }
      if (request.getCursor().isPresent()) {
        QueryStringMapper.addQueryParameter(httpUrl, "cursor", request.getCursor().get(), false);
      }
      if (request.getLimit().isPresent()) {
        QueryStringMapper.addQueryParameter(httpUrl, "limit", request.getLimit().get().toString(), false);
      }
      Request.Builder _requestBuilder = new Request.Builder()
        .url(httpUrl.build())
        .method("GET", null)
        .headers(Headers.of(clientOptions.headers(requestOptions)))
        .addHeader("Content-Type", "application/json")
        .addHeader("Accept", "application/json");
      Request okhttpRequest = _requestBuilder.build();
      OkHttpClient client = clientOptions.httpClient();
      if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
        client = clientOptions.httpClientWithTimeout(requestOptions);
      }
      CompletableFuture<DecisionLogResponse> future = new CompletableFuture<>();
      client.newCall(okhttpRequest).enqueue(new Callback() {
        @Override
        public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
          try (ResponseBody responseBody = response.body()) {
            if (response.isSuccessful()) {
              future.complete(ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), DecisionLogResponse.class));
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
