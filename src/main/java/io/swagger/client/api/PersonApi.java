/*
 * RingCentral Glip REST API
 * API Explorer for RingCentral Glip Messaging API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.InlineResponse200;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonApi {
    private ApiClient apiClient;

    public PersonApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PersonApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for personsPersonIdGet */
    private com.squareup.okhttp.Call personsPersonIdGetCall(String personId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/persons/{personId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OauthSecurity" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call personsPersonIdGetValidateBeforeCall(String personId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new ApiException("Missing the required parameter 'personId' when calling personsPersonIdGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = personsPersonIdGetCall(personId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Person by ID
     * Returns a person by id. If the person cannot be accessed by current user, API must return HTTP 404.
     * @param personId The personId being requested. Can be &#x60;~&#x60; for current user. (required)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 personsPersonIdGet(String personId) throws ApiException {
        ApiResponse<InlineResponse200> resp = personsPersonIdGetWithHttpInfo(personId);
        return resp.getData();
    }

    /**
     * Get Person by ID
     * Returns a person by id. If the person cannot be accessed by current user, API must return HTTP 404.
     * @param personId The personId being requested. Can be &#x60;~&#x60; for current user. (required)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> personsPersonIdGetWithHttpInfo(String personId) throws ApiException {
        com.squareup.okhttp.Call call = personsPersonIdGetValidateBeforeCall(personId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Person by ID (asynchronously)
     * Returns a person by id. If the person cannot be accessed by current user, API must return HTTP 404.
     * @param personId The personId being requested. Can be &#x60;~&#x60; for current user. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call personsPersonIdGetAsync(String personId, final ApiCallback<InlineResponse200> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = personsPersonIdGetValidateBeforeCall(personId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}