# JobsApi

All URIs are relative to *https://fbn-ci.lusid.com/scheduler2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJob**](JobsApi.md#createJob) | **POST** /api/jobs | [EXPERIMENTAL] CreateJob: Create a new job |
| [**deleteJob**](JobsApi.md#deleteJob) | **DELETE** /api/jobs/{scope}/{code} | [EXPERIMENTAL] DeleteJob: Delete a job |
| [**getHistory**](JobsApi.md#getHistory) | **GET** /api/jobs/history | [EXPERIMENTAL] GetHistory: Get the history of job runs |
| [**getJobConsoleOutput**](JobsApi.md#getJobConsoleOutput) | **GET** /api/jobs/history/{runId}/console | [EXPERIMENTAL] GetJobConsoleOutput: Gets the console output of a specific job run |
| [**getRunHistory**](JobsApi.md#getRunHistory) | **GET** /api/jobs/history/{runId} | [EXPERIMENTAL] GetRunHistory: Get the history for a single job run |
| [**getSchedulesForAJob**](JobsApi.md#getSchedulesForAJob) | **GET** /api/jobs/{scope}/{code}/schedules | [EXPERIMENTAL] GetSchedulesForAJob: Get all the schedules for a single job |
| [**listJobs**](JobsApi.md#listJobs) | **GET** /api/jobs | [EXPERIMENTAL] ListJobs: List the available jobs |
| [**runJob**](JobsApi.md#runJob) | **POST** /api/jobs/{scope}/{code}/$run | [EXPERIMENTAL] RunJob: Run a job immediately |
| [**updateJob**](JobsApi.md#updateJob) | **PUT** /api/jobs/{scope}/{code} | [EXPERIMENTAL] UpdateJob: Update a JobDefinition |


<a id="createJob"></a>
# **createJob**
> JobDefinition createJob(createJobRequest).execute();

[EXPERIMENTAL] CreateJob: Create a new job

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    CreateJobRequest createJobRequest = new CreateJobRequest(); // CreateJobRequest | The request to create a new job
    try {
      JobDefinition result = apiInstance.createJob(createJobRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#createJob");
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
| **createJobRequest** | [**CreateJobRequest**](CreateJobRequest.md)| The request to create a new job | |

### Return type

[**JobDefinition**](JobDefinition.md)

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

<a id="deleteJob"></a>
# **deleteJob**
> ResourceListOfScheduleDefinition deleteJob(scope, code).execute();

[EXPERIMENTAL] DeleteJob: Delete a job

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the job
    String code = "code_example"; // String | The code of the job
    try {
      ResourceListOfScheduleDefinition result = apiInstance.deleteJob(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#deleteJob");
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
| **scope** | **String**| The scope of the job | |
| **code** | **String**| The code of the job | |

### Return type

[**ResourceListOfScheduleDefinition**](ResourceListOfScheduleDefinition.md)

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

<a id="getHistory"></a>
# **getHistory**
> ResourceListOfJobHistory getHistory().page(page).sortBy(sortBy).start(start).limit(limit).filter(filter).execute();

[EXPERIMENTAL] GetHistory: Get the history of job runs

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String page = "page_example"; // String | The pagination token to use to continue listing instruments from a previous call to list instruments.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
    List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
    Integer start = 56; // Integer | This field is obsolete, the value of this field would not be considered.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000.
    String filter = "filter_example"; // String | Expression to filter the result set.
    try {
      ResourceListOfJobHistory result = apiInstance.getHistory()
            .page(page)
            .sortBy(sortBy)
            .start(start)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getHistory");
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
| **page** | **String**| The pagination token to use to continue listing instruments from a previous call to list instruments.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. | [optional] |
| **start** | **Integer**| This field is obsolete, the value of this field would not be considered. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000. | [optional] |
| **filter** | **String**| Expression to filter the result set. | [optional] |

### Return type

[**ResourceListOfJobHistory**](ResourceListOfJobHistory.md)

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

<a id="getJobConsoleOutput"></a>
# **getJobConsoleOutput**
> String getJobConsoleOutput(runId).execute();

[EXPERIMENTAL] GetJobConsoleOutput: Gets the console output of a specific job run

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String runId = "runId_example"; // String | The RunId of the job run
    try {
      String result = apiInstance.getJobConsoleOutput(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getJobConsoleOutput");
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
| **runId** | **String**| The RunId of the job run | |

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getRunHistory"></a>
# **getRunHistory**
> JobRunResult getRunHistory(runId).execute();

[EXPERIMENTAL] GetRunHistory: Get the history for a single job run

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String runId = "runId_example"; // String | The unique ID of the run
    try {
      JobRunResult result = apiInstance.getRunHistory(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getRunHistory");
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
| **runId** | **String**| The unique ID of the run | |

### Return type

[**JobRunResult**](JobRunResult.md)

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

<a id="getSchedulesForAJob"></a>
# **getSchedulesForAJob**
> ResourceListOfScheduleDefinition getSchedulesForAJob(scope, code).execute();

[EXPERIMENTAL] GetSchedulesForAJob: Get all the schedules for a single job

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the job
    String code = "code_example"; // String | The code of the job
    try {
      ResourceListOfScheduleDefinition result = apiInstance.getSchedulesForAJob(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getSchedulesForAJob");
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
| **scope** | **String**| The scope of the job | |
| **code** | **String**| The code of the job | |

### Return type

[**ResourceListOfScheduleDefinition**](ResourceListOfScheduleDefinition.md)

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

<a id="listJobs"></a>
# **listJobs**
> ResourceListOfJobDefinition listJobs().page(page).sortBy(sortBy).start(start).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListJobs: List the available jobs

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String page = "page_example"; // String | The pagination token to use to continue listing instruments from a previous call to list instruments.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
    List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 2000; // Integer | When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000.
    String filter = "filter_example"; // String | Expression to filter the result set.
    try {
      ResourceListOfJobDefinition result = apiInstance.listJobs()
            .page(page)
            .sortBy(sortBy)
            .start(start)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#listJobs");
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
| **page** | **String**| The pagination token to use to continue listing instruments from a previous call to list instruments.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000. | [optional] [default to 2000] |
| **filter** | **String**| Expression to filter the result set. | [optional] |

### Return type

[**ResourceListOfJobDefinition**](ResourceListOfJobDefinition.md)

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

<a id="runJob"></a>
# **runJob**
> StartJobResponse runJob(scope, code, startJobRequest).execute();

[EXPERIMENTAL] RunJob: Run a job immediately

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the job
    String code = "code_example"; // String | The code of the job
    StartJobRequest startJobRequest = new StartJobRequest(); // StartJobRequest | The request for starting job
    try {
      StartJobResponse result = apiInstance.runJob(scope, code, startJobRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#runJob");
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
| **scope** | **String**| The scope of the job | |
| **code** | **String**| The code of the job | |
| **startJobRequest** | [**StartJobRequest**](StartJobRequest.md)| The request for starting job | |

### Return type

[**StartJobResponse**](StartJobResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateJob"></a>
# **updateJob**
> JobDefinition updateJob(scope, code, updateJobRequest).execute();

[EXPERIMENTAL] UpdateJob: Update a JobDefinition

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.JobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    JobsApi apiInstance = new JobsApi(defaultClient);
    String scope = "scope_example"; // String | 
    String code = "code_example"; // String | 
    UpdateJobRequest updateJobRequest = new UpdateJobRequest(); // UpdateJobRequest | 
    try {
      JobDefinition result = apiInstance.updateJob(scope, code, updateJobRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#updateJob");
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
| **scope** | **String**|  | |
| **code** | **String**|  | |
| **updateJobRequest** | [**UpdateJobRequest**](UpdateJobRequest.md)|  | |

### Return type

[**JobDefinition**](JobDefinition.md)

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

