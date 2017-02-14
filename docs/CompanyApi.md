# CompanyApi

All URIs are relative to *https://platform.devtest.ringcentral.com/restapi/v1.0/glip*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdGet**](CompanyApi.md#companiesCompanyIdGet) | **GET** /companies/{companyId} | Get Company Info


<a name="companiesCompanyIdGet"></a>
# **companiesCompanyIdGet**
> InlineResponse2001 companiesCompanyIdGet(companyId)

Get Company Info

Returns a company by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OauthSecurity
OAuth OauthSecurity = (OAuth) defaultClient.getAuthentication("OauthSecurity");
OauthSecurity.setAccessToken("YOUR ACCESS TOKEN");

CompanyApi apiInstance = new CompanyApi();
String companyId = "companyId_example"; // String | The id of the company being queried. Can be '~' for company the current user belongs to.
try {
    InlineResponse2001 result = apiInstance.companiesCompanyIdGet(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companiesCompanyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| The id of the company being queried. Can be &#39;~&#39; for company the current user belongs to. |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

