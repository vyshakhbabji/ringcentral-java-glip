# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CompanyApi;

import java.io.File;
import java.util.*;

public class CompanyApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://platform.devtest.ringcentral.com/restapi/v1.0/glip*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CompanyApi* | [**companiesCompanyIdGet**](docs/CompanyApi.md#companiesCompanyIdGet) | **GET** /companies/{companyId} | Get Company Info
*GroupApi* | [**groupsGet**](docs/GroupApi.md#groupsGet) | **GET** /groups | Return groups associated with current user
*GroupApi* | [**groupsGroupIdGet**](docs/GroupApi.md#groupsGroupIdGet) | **GET** /groups/{groupId} | Returns a group by id
*PersonApi* | [**personsPersonIdGet**](docs/PersonApi.md#personsPersonIdGet) | **GET** /persons/{personId} | Get Person by ID
*PostApi* | [**postsGet**](docs/PostApi.md#postsGet) | **GET** /posts | Get User Posts
*PostApi* | [**postsPost**](docs/PostApi.md#postsPost) | **POST** /posts | Send New Message
*PostApi* | [**postsPostIdGet**](docs/PostApi.md#postsPostIdGet) | **GET** /posts/{postId} | Get Post By Id


## Documentation for Models

 - [Body](docs/Body.md)
 - [Company](docs/Company.md)
 - [CreatePostRequest](docs/CreatePostRequest.md)
 - [Group](docs/Group.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2002Navigation](docs/InlineResponse2002Navigation.md)
 - [InlineResponse2002Records](docs/InlineResponse2002Records.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2003Records](docs/InlineResponse2003Records.md)
 - [Navigation](docs/Navigation.md)
 - [Person](docs/Person.md)
 - [Post](docs/Post.md)
 - [ReadGroupsResponse](docs/ReadGroupsResponse.md)
 - [ReadPostsResponse](docs/ReadPostsResponse.md)
 - [Team](docs/Team.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### OauthSecurity

- **Type**: OAuth
- **Flow**: accessCode
- **Authorizatoin URL**: https://platform.devtest.ringcentral.com/restapi/oauth/authorize
- **Scopes**: 
  - default: default permissions


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author
Vyshakh Babji


