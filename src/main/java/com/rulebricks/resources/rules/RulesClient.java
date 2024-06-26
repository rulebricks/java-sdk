/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.rules;

import com.fasterxml.jackson.core.type.TypeReference;
import core.ApiError;
import core.ClientOptions;
import core.MediaTypes;
import core.ObjectMappers;
import core.RequestOptions;
import java.io.IOException;
import java.lang.Exception;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import resources.rules.types.ListResponseItem;
import resources.rules.types.UsageResponse;

public class RulesClient {
  protected final ClientOptions clientOptions;

  public RulesClient(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  /**
   * Executes a single rule identified by a unique slug. The request and response formats are dynamic, dependent on the rule configuration.
   */
  public Map<String, Object> solve(String slug, Map<String, Object> request) {
    return solve(slug,request,null);
  }

  /**
   * Executes a single rule identified by a unique slug. The request and response formats are dynamic, dependent on the rule configuration.
   */
  public Map<String, Object> solve(String slug, Map<String, Object> request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()

      .addPathSegments("api/v1/solve")
      .addPathSegment(slug)
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(Exception e) {
      throw new RuntimeException(e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response response = clientOptions.httpClient().newCall(okhttpRequest).execute();
      if (response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), new TypeReference<Map<String, Object>>() {});
      }
      throw new ApiError(response.code(), ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Executes a particular rule against multiple request data payloads provided in a list.
   */
  public List<Map<String, Object>> bulkSolve(String slug, List<Map<String, Object>> request) {
    return bulkSolve(slug,request,null);
  }

  /**
   * Executes a particular rule against multiple request data payloads provided in a list.
   */
  public List<Map<String, Object>> bulkSolve(String slug, List<Map<String, Object>> request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()

      .addPathSegments("api/v1/bulk-solve")
      .addPathSegment(slug)
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(Exception e) {
      throw new RuntimeException(e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response response = clientOptions.httpClient().newCall(okhttpRequest).execute();
      if (response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), new TypeReference<List<Map<String, Object>>>() {});
      }
      throw new ApiError(response.code(), ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Executes multiple rules in parallel based on a provided mapping of rule slugs to payloads.
   */
  public Map<String, Object> parallelSolve(Map<String, Object> request) {
    return parallelSolve(request,null);
  }

  /**
   * Executes multiple rules in parallel based on a provided mapping of rule slugs to payloads.
   */
  public Map<String, Object> parallelSolve(Map<String, Object> request,
      RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()

      .addPathSegments("api/v1/parallel-solve")
      .build();
    RequestBody body;
    try {
      body = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
    }
    catch(Exception e) {
      throw new RuntimeException(e);
    }
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("POST", body)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response response = clientOptions.httpClient().newCall(okhttpRequest).execute();
      if (response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), new TypeReference<Map<String, Object>>() {});
      }
      throw new ApiError(response.code(), ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * List all rules in the organization.
   */
  public List<ListResponseItem> list() {
    return list(null);
  }

  /**
   * List all rules in the organization.
   */
  public List<ListResponseItem> list(RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()

      .addPathSegments("api/v1/list")
      .build();
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response response = clientOptions.httpClient().newCall(okhttpRequest).execute();
      if (response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), new TypeReference<List<ListResponseItem>>() {});
      }
      throw new ApiError(response.code(), ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Get the rule execution usage of your organization.
   */
  public UsageResponse usage() {
    return usage(null);
  }

  /**
   * Get the rule execution usage of your organization.
   */
  public UsageResponse usage(RequestOptions requestOptions) {
    HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()

      .addPathSegments("api/v1/usage")
      .build();
    Request okhttpRequest = new Request.Builder()
      .url(httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers(requestOptions)))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response response = clientOptions.httpClient().newCall(okhttpRequest).execute();
      if (response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), UsageResponse.class);
      }
      throw new ApiError(response.code(), ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
