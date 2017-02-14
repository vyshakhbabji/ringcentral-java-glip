# GroupApi

All URIs are relative to *https://platform.devtest.ringcentral.com/restapi/v1.0/glip*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupsGet**](GroupApi.md#groupsGet) | **GET** /groups | Return groups associated with current user
[**groupsGroupIdGet**](GroupApi.md#groupsGroupIdGet) | **GET** /groups/{groupId} | Returns a group by id


<a name="groupsGet"></a>
# **groupsGet**
> InlineResponse2002 groupsGet(type, pageToken, recordCount)

Return groups associated with current user

Return groups associated with current user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OauthSecurity
OAuth OauthSecurity = (OAuth) defaultClient.getAuthentication("OauthSecurity");
OauthSecurity.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
String type = "type_example"; // String | Type of groups to be fetched
String pageToken = "pageToken_example"; // String | Pagination token
Integer recordCount = 250; // Integer | Max number of records to return.
try {
    InlineResponse2002 result = apiInstance.groupsGet(type, pageToken, recordCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#groupsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Type of groups to be fetched | [optional] [enum: Group, Team]
 **pageToken** | **String**| Pagination token | [optional]
 **recordCount** | **Integer**| Max number of records to return. | [optional] [default to 250]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupsGroupIdGet"></a>
# **groupsGroupIdGet**
> InlineResponse2002Records groupsGroupIdGet(groupId)

Returns a group by id

Returns a group by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OauthSecurity
OAuth OauthSecurity = (OAuth) defaultClient.getAuthentication("OauthSecurity");
OauthSecurity.setAccessToken("YOUR ACCESS TOKEN");

GroupApi apiInstance = new GroupApi();
String groupId = "groupId_example"; // String | Id of a group to be fetched
try {
    InlineResponse2002Records result = apiInstance.groupsGroupIdGet(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#groupsGroupIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| Id of a group to be fetched |

### Return type

[**InlineResponse2002Records**](InlineResponse2002Records.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

