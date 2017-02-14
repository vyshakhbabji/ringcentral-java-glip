# PostApi

All URIs are relative to *https://platform.devtest.ringcentral.com/restapi/v1.0/glip*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postsGet**](PostApi.md#postsGet) | **GET** /posts | Get User Posts
[**postsPost**](PostApi.md#postsPost) | **POST** /posts | Send New Message
[**postsPostIdGet**](PostApi.md#postsPostIdGet) | **GET** /posts/{postId} | Get Post By Id


<a name="postsGet"></a>
# **postsGet**
> InlineResponse2003 postsGet(groupId, pageToken, recordCount)

Get User Posts

Return posts which are available for current user. Not more than 250 records to be returned in one request. If posts cannot be viewed by current user (fro example, user is not member of group), API must return HTTP 404.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PostApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OauthSecurity
OAuth OauthSecurity = (OAuth) defaultClient.getAuthentication("OauthSecurity");
OauthSecurity.setAccessToken("YOUR ACCESS TOKEN");

PostApi apiInstance = new PostApi();
String groupId = "groupId_example"; // String | Id of a group to filter posts
String pageToken = "pageToken_example"; // String | Pagination token
String recordCount = "recordCount_example"; // String | Max number of records to return
try {
    InlineResponse2003 result = apiInstance.postsGet(groupId, pageToken, recordCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| Id of a group to filter posts |
 **pageToken** | **String**| Pagination token | [optional]
 **recordCount** | **String**| Max number of records to return | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPost"></a>
# **postsPost**
> InlineResponse2003Records postsPost(body)

Send New Message

Creates post and send it to specified Group and returns it.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PostApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OauthSecurity
OAuth OauthSecurity = (OAuth) defaultClient.getAuthentication("OauthSecurity");
OauthSecurity.setAccessToken("YOUR ACCESS TOKEN");

PostApi apiInstance = new PostApi();
Body body = new Body(); // Body | Create post JSON body
try {
    InlineResponse2003Records result = apiInstance.postsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)| Create post JSON body |

### Return type

[**InlineResponse2003Records**](InlineResponse2003Records.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postsPostIdGet"></a>
# **postsPostIdGet**
> InlineResponse2003Records postsPostIdGet(postId)

Get Post By Id

Returns post with given id. If a post cannot be viewed by current user, API must return HTTP 404.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PostApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OauthSecurity
OAuth OauthSecurity = (OAuth) defaultClient.getAuthentication("OauthSecurity");
OauthSecurity.setAccessToken("YOUR ACCESS TOKEN");

PostApi apiInstance = new PostApi();
String postId = "postId_example"; // String | Id of a post to be fetched
try {
    InlineResponse2003Records result = apiInstance.postsPostIdGet(postId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostApi#postsPostIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postId** | **String**| Id of a post to be fetched |

### Return type

[**InlineResponse2003Records**](InlineResponse2003Records.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

