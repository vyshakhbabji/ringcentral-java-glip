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


import io.swagger.client.model.Body;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2003Records;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostApi {
    private ApiClient apiClient;

    public PostApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PostApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for postsGet */
    private com.squareup.okhttp.Call postsGetCall(String groupId, String pageToken, String recordCount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/posts".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupId", groupId));
        if (pageToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageToken", pageToken));
        if (recordCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordCount", recordCount));

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
    private com.squareup.okhttp.Call postsGetValidateBeforeCall(String groupId, String pageToken, String recordCount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling postsGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postsGetCall(groupId, pageToken, recordCount, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get User Posts
     * Return posts which are available for current user. Not more than 250 records to be returned in one request. If posts cannot be viewed by current user (fro example, user is not member of group), API must return HTTP 404.
     * @param groupId Id of a group to filter posts (required)
     * @param pageToken Pagination token (optional)
     * @param recordCount Max number of records to return (optional)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003 postsGet(String groupId, String pageToken, String recordCount) throws ApiException {
        ApiResponse<InlineResponse2003> resp = postsGetWithHttpInfo(groupId, pageToken, recordCount);
        return resp.getData();
    }

    /**
     * Get User Posts
     * Return posts which are available for current user. Not more than 250 records to be returned in one request. If posts cannot be viewed by current user (fro example, user is not member of group), API must return HTTP 404.
     * @param groupId Id of a group to filter posts (required)
     * @param pageToken Pagination token (optional)
     * @param recordCount Max number of records to return (optional)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003> postsGetWithHttpInfo(String groupId, String pageToken, String recordCount) throws ApiException {
        com.squareup.okhttp.Call call = postsGetValidateBeforeCall(groupId, pageToken, recordCount, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get User Posts (asynchronously)
     * Return posts which are available for current user. Not more than 250 records to be returned in one request. If posts cannot be viewed by current user (fro example, user is not member of group), API must return HTTP 404.
     * @param groupId Id of a group to filter posts (required)
     * @param pageToken Pagination token (optional)
     * @param recordCount Max number of records to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postsGetAsync(String groupId, String pageToken, String recordCount, final ApiCallback<InlineResponse2003> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postsGetValidateBeforeCall(groupId, pageToken, recordCount, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postsPost */
    private com.squareup.okhttp.Call postsPostCall(Body body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/posts".replaceAll("\\{format\\}","json");

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postsPostValidateBeforeCall(Body body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postsPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postsPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send New Message
     * Creates post and send it to specified Group and returns it.
     * @param body Create post JSON body (required)
     * @return InlineResponse2003Records
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003Records postsPost(Body body) throws ApiException {
        ApiResponse<InlineResponse2003Records> resp = postsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Send New Message
     * Creates post and send it to specified Group and returns it.
     * @param body Create post JSON body (required)
     * @return ApiResponse&lt;InlineResponse2003Records&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003Records> postsPostWithHttpInfo(Body body) throws ApiException {
        com.squareup.okhttp.Call call = postsPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003Records>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send New Message (asynchronously)
     * Creates post and send it to specified Group and returns it.
     * @param body Create post JSON body (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postsPostAsync(Body body, final ApiCallback<InlineResponse2003Records> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postsPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003Records>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postsPostIdGet */
    private com.squareup.okhttp.Call postsPostIdGetCall(String postId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/posts/{postId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "postId" + "\\}", apiClient.escapeString(postId.toString()));

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
    private com.squareup.okhttp.Call postsPostIdGetValidateBeforeCall(String postId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new ApiException("Missing the required parameter 'postId' when calling postsPostIdGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postsPostIdGetCall(postId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Post By Id
     * Returns post with given id. If a post cannot be viewed by current user, API must return HTTP 404.
     * @param postId Id of a post to be fetched (required)
     * @return InlineResponse2003Records
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003Records postsPostIdGet(String postId) throws ApiException {
        ApiResponse<InlineResponse2003Records> resp = postsPostIdGetWithHttpInfo(postId);
        return resp.getData();
    }

    /**
     * Get Post By Id
     * Returns post with given id. If a post cannot be viewed by current user, API must return HTTP 404.
     * @param postId Id of a post to be fetched (required)
     * @return ApiResponse&lt;InlineResponse2003Records&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003Records> postsPostIdGetWithHttpInfo(String postId) throws ApiException {
        com.squareup.okhttp.Call call = postsPostIdGetValidateBeforeCall(postId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003Records>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Post By Id (asynchronously)
     * Returns post with given id. If a post cannot be viewed by current user, API must return HTTP 404.
     * @param postId Id of a post to be fetched (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postsPostIdGetAsync(String postId, final ApiCallback<InlineResponse2003Records> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postsPostIdGetValidateBeforeCall(postId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003Records>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
