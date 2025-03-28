/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.assets.flows;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import core.ClientOptions;
import core.ObjectMappers;
import core.RequestOptions;
import core.RulebricksApiApiException;
import core.RulebricksApiException;
import errors.InternalServerError;
import java.io.IOException;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import types.FlowDetail;

public class FlowsClient {
  protected final ClientOptions clientOptions;

  public FlowsClient(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  /**
   * List all flows in the organization.
   */
  public List<FlowDetail> list() {
    return list(null);
  }

  /**
   * List all flows in the organization.
   */
  public List<FlowDetail> list(RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()

      .addPathSegments("admin/flows/list")
      .build();
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .addHeader("Accept", "application/json")
      .build();
    OkHttpClient client = clientOptions.httpClient();
    if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
      client = clientOptions.httpClientWithTimeout(requestOptions);
    }
    try (Response response = client.newCall(okhttpRequest).execute()) {
      ResponseBody responseBody = response.body();
      if (response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), new TypeReference<List<FlowDetail>>() {});
      }
      String responseBodyString = responseBody != null ? responseBody.string() : "{}";
      try {
        if (response.code() == 500) {
          throw new InternalServerError(ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        }
      }
      catch (JsonProcessingException ignored) {
        // unable to map error response, throwing generic error
      }
      throw new RulebricksApiApiException("Error with status code " + response.code(), response.code(), ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
    }
    catch (IOException e) {
      throw new RulebricksApiException("Network error executing HTTP request", e);
    }
  }
}
