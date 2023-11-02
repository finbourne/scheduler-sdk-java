# ImagesApi

All URIs are relative to *https://fbn-ci.lusid.com/scheduler2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteImage**](ImagesApi.md#deleteImage) | **DELETE** /api/images/{name} | [EXPERIMENTAL] DeleteImage: Delete a Docker Image |
| [**downloadImage**](ImagesApi.md#downloadImage) | **GET** /api/images/{name}/contents | [EXPERIMENTAL] DownloadImage: Download Docker Image |
| [**getImage**](ImagesApi.md#getImage) | **GET** /api/images/{name} | [EXPERIMENTAL] GetImage: Get metadata of a Docker Image |
| [**listImages**](ImagesApi.md#listImages) | **GET** /api/images/repository/{name} | [EXPERIMENTAL] ListImages: List all images under same image repository |
| [**listRepositories**](ImagesApi.md#listRepositories) | **GET** /api/images/repository | [EXPERIMENTAL] ListRepositories: List all Docker image repositories |
| [**uploadImage**](ImagesApi.md#uploadImage) | **POST** /api/images | [EXPERIMENTAL] UploadImage: Upload a Docker Image used for Scheduler jobs |


<a id="deleteImage"></a>
# **deleteImage**
> String deleteImage(name).execute();

[EXPERIMENTAL] DeleteImage: Delete a Docker Image

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | The name and tag of the image. Format \"ExampleImageName:0.1\"
    try {
      String result = apiInstance.deleteImage(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#deleteImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| The name and tag of the image. Format \&quot;ExampleImageName:0.1\&quot; | |

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No image with this name and tag exists |  -  |
| **0** | Error response |  -  |

<a id="downloadImage"></a>
# **downloadImage**
> File downloadImage(name).execute();

[EXPERIMENTAL] DownloadImage: Download Docker Image

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | The name and tag of the image of the image. Format \"ExampleImageName:latest\"
    try {
      File result = apiInstance.downloadImage(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#downloadImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| The name and tag of the image of the image. Format \&quot;ExampleImageName:latest\&quot; | |

### Return type

[**File**](File.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getImage"></a>
# **getImage**
> Image getImage(name).execute();

[EXPERIMENTAL] GetImage: Get metadata of a Docker Image

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | The name and tag of a Docker image. Format \"ExampleImageName:latest\"
    try {
      Image result = apiInstance.getImage(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#getImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| The name and tag of a Docker image. Format \&quot;ExampleImageName:latest\&quot; | |

### Return type

[**Image**](Image.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listImages"></a>
# **listImages**
> ResourceListOfImageSummary listImages(name).page(page).sortBy(sortBy).start(start).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListImages: List all images under same image repository

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String name = "name_example"; // String | The name of the Repository
    String page = "page_example"; // String | The pagination token to use to continue listing images from a previous call to list images.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
    List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 2000; // Integer | When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000.
    String filter = "filter_example"; // String | Expression to filter the result set.
    try {
      ResourceListOfImageSummary result = apiInstance.listImages(name)
            .page(page)
            .sortBy(sortBy)
            .start(start)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listImages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| The name of the Repository | |
| **page** | **String**| The pagination token to use to continue listing images from a previous call to list images.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000. | [optional] [default to 2000] |
| **filter** | **String**| Expression to filter the result set. | [optional] |

### Return type

[**ResourceListOfImageSummary**](ResourceListOfImageSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listRepositories"></a>
# **listRepositories**
> ResourceListOfRepository listRepositories().page(page).sortBy(sortBy).start(start).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListRepositories: List all Docker image repositories

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String page = "page_example"; // String | The pagination token to use to continue listing images from a previous call to list images.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
    List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 2000; // Integer | When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000.
    String filter = "filter_example"; // String | Expression to filter the result set.
    try {
      ResourceListOfRepository result = apiInstance.listRepositories()
            .page(page)
            .sortBy(sortBy)
            .start(start)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listRepositories");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **String**| The pagination token to use to continue listing images from a previous call to list images.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000. | [optional] [default to 2000] |
| **filter** | **String**| Expression to filter the result set. | [optional] |

### Return type

[**ResourceListOfRepository**](ResourceListOfRepository.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="uploadImage"></a>
# **uploadImage**
> UploadImageInstructions uploadImage(uploadImageRequest).execute();

[EXPERIMENTAL] UploadImage: Upload a Docker Image used for Scheduler jobs

Every image must have at least one tag. Note: your image will not be available until the returned Docker commands are executed.

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ImagesApi apiInstance = new ImagesApi(defaultClient);
    UploadImageRequest uploadImageRequest = new UploadImageRequest(); // UploadImageRequest | Request to upload image
    try {
      UploadImageInstructions result = apiInstance.uploadImage(uploadImageRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#uploadImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadImageRequest** | [**UploadImageRequest**](UploadImageRequest.md)| Request to upload image | |

### Return type

[**UploadImageInstructions**](UploadImageInstructions.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

