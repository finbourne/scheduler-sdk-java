# ImagesApi

All URIs are relative to *https://fbn-prd.lusid.com/scheduler2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getImage**](ImagesApi.md#getImage) | **GET** /api/images/{name} | GetImage: Get metadata of a Docker Image |
| [**listImages**](ImagesApi.md#listImages) | **GET** /api/images/repository/{name} | ListImages: List all images under same image repository |
| [**listRepositories**](ImagesApi.md#listRepositories) | **GET** /api/images/repository | ListRepositories: List all Docker image repositories |
| [**uploadImage**](ImagesApi.md#uploadImage) | **POST** /api/images | UploadImage: Upload a Docker Image used for Scheduler jobs |



## getImage

> Image getImage(name)

GetImage: Get metadata of a Docker Image

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.ImagesApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ImagesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"schedulerUrl\": \"https://<your-domain>.lusid.com/scheduler2\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ImagesApi apiInstance = apiFactory.build(ImagesApi.class);

        ImagesApi apiInstance = ApiFactoryBuilder.build(fileName).build(ImagesApi.class);
        String name = "name_example"; // String | The name and tag of a Docker image. Format \"ExampleImageName:latest\"
        try {
            // uncomment the below to set overrides at the request level
            // Image result = apiInstance.getImage(name).execute(opts);

            Image result = apiInstance.getImage(name).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#getImage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listImages

> ResourceListOfImageSummary listImages(name, page, sortBy, start, limit, filter)

ListImages: List all images under same image repository

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.ImagesApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ImagesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"schedulerUrl\": \"https://<your-domain>.lusid.com/scheduler2\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ImagesApi apiInstance = apiFactory.build(ImagesApi.class);

        ImagesApi apiInstance = ApiFactoryBuilder.build(fileName).build(ImagesApi.class);
        String name = "name_example"; // String | The name of the Repository
        String page = "page_example"; // String | The pagination token to use to continue listing images from a previous call to list images.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
        List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
        Integer start = 56; // Integer | When paginating, skip this number of results.
        Integer limit = 2000; // Integer | When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000.
        String filter = "filter_example"; // String | Expression to filter the result set.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfImageSummary result = apiInstance.listImages(name, page, sortBy, start, limit, filter).execute(opts);

            ResourceListOfImageSummary result = apiInstance.listImages(name, page, sortBy, start, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#listImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listRepositories

> ResourceListOfRepository listRepositories(page, sortBy, start, limit, filter)

ListRepositories: List all Docker image repositories

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.ImagesApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ImagesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"schedulerUrl\": \"https://<your-domain>.lusid.com/scheduler2\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ImagesApi apiInstance = apiFactory.build(ImagesApi.class);

        ImagesApi apiInstance = ApiFactoryBuilder.build(fileName).build(ImagesApi.class);
        String page = "page_example"; // String | The pagination token to use to continue listing images from a previous call to list images.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
        List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
        Integer start = 56; // Integer | When paginating, skip this number of results.
        Integer limit = 2000; // Integer | When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000.
        String filter = "filter_example"; // String | Expression to filter the result set.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfRepository result = apiInstance.listRepositories(page, sortBy, start, limit, filter).execute(opts);

            ResourceListOfRepository result = apiInstance.listRepositories(page, sortBy, start, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#listRepositories");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## uploadImage

> UploadImageInstructions uploadImage(uploadImageRequest)

UploadImage: Upload a Docker Image used for Scheduler jobs

Every image must have at least one tag. Note: your image will not be available until the returned Docker commands are executed.

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.ImagesApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ImagesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"schedulerUrl\": \"https://<your-domain>.lusid.com/scheduler2\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ImagesApi apiInstance = apiFactory.build(ImagesApi.class);

        ImagesApi apiInstance = ApiFactoryBuilder.build(fileName).build(ImagesApi.class);
        UploadImageRequest uploadImageRequest = new UploadImageRequest(); // UploadImageRequest | Request to upload image
        try {
            // uncomment the below to set overrides at the request level
            // UploadImageInstructions result = apiInstance.uploadImage(uploadImageRequest).execute(opts);

            UploadImageInstructions result = apiInstance.uploadImage(uploadImageRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ImagesApi#uploadImage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

