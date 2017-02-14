# PersonApi

All URIs are relative to *https://platform.devtest.ringcentral.com/restapi/v1.0/glip*

Method | HTTP request | Description
------------- | ------------- | -------------
[**personsPersonIdGet**](PersonApi.md#personsPersonIdGet) | **GET** /persons/{personId} | Get Person by ID


<a name="personsPersonIdGet"></a>
# **personsPersonIdGet**
> InlineResponse200 personsPersonIdGet(personId)

Get Person by ID

Returns a person by id. If the person cannot be accessed by current user, API must return HTTP 404.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OauthSecurity
OAuth OauthSecurity = (OAuth) defaultClient.getAuthentication("OauthSecurity");
OauthSecurity.setAccessToken("YOUR ACCESS TOKEN");

PersonApi apiInstance = new PersonApi();
String personId = "personId_example"; // String | The personId being requested. Can be `~` for current user.
try {
    InlineResponse200 result = apiInstance.personsPersonIdGet(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonApi#personsPersonIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The personId being requested. Can be &#x60;~&#x60; for current user. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

