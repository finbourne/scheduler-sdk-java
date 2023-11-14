# SchedulesApi

All URIs are relative to *https://fbn-prd.lusid.com/scheduler2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSchedule**](SchedulesApi.md#createSchedule) | **POST** /api/schedules | [EXPERIMENTAL] CreateSchedule: Create a Schedule for a job |
| [**deleteSchedule**](SchedulesApi.md#deleteSchedule) | **DELETE** /api/schedules/{scope}/{code} | [EXPERIMENTAL] DeleteSchedule: Delete a schedule |
| [**enabledSchedule**](SchedulesApi.md#enabledSchedule) | **PUT** /api/schedules/{scope}/{code}/enabled | [EXPERIMENTAL] EnabledSchedule: Enable/disable a schedule |
| [**getSchedule**](SchedulesApi.md#getSchedule) | **GET** /api/schedules/{scope}/{code} | [EXPERIMENTAL] GetSchedule: Get a single Schedule |
| [**listSchedules**](SchedulesApi.md#listSchedules) | **GET** /api/schedules | [EXPERIMENTAL] ListSchedules: List the available Schedules |
| [**runSchedule**](SchedulesApi.md#runSchedule) | **POST** /api/schedules/{scope}/{code}/$run | [EXPERIMENTAL] RunSchedule: Run a schedule immediately |
| [**updateSchedule**](SchedulesApi.md#updateSchedule) | **PUT** /api/schedules/{scope}/{code} | [EXPERIMENTAL] UpdateSchedule: Update a schedule. |


<a id="createSchedule"></a>
# **createSchedule**
> ScheduleDefinition createSchedule(createScheduleRequest).execute();

[EXPERIMENTAL] CreateSchedule: Create a Schedule for a job

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    CreateScheduleRequest createScheduleRequest = new CreateScheduleRequest(); // CreateScheduleRequest | 
    try {
      ScheduleDefinition result = apiInstance.createSchedule(createScheduleRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#createSchedule");
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
| **createScheduleRequest** | [**CreateScheduleRequest**](CreateScheduleRequest.md)|  | |

### Return type

[**ScheduleDefinition**](ScheduleDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created schedule |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteSchedule"></a>
# **deleteSchedule**
> deleteSchedule(scope, code).execute();

[EXPERIMENTAL] DeleteSchedule: Delete a schedule

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the schedule to be deleted
    String code = "code_example"; // String | Code of the schedule to be deleted
    try {
      apiInstance.deleteSchedule(scope, code)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#deleteSchedule");
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
| **scope** | **String**| Scope of the schedule to be deleted | |
| **code** | **String**| Code of the schedule to be deleted | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="enabledSchedule"></a>
# **enabledSchedule**
> ScheduleDefinition enabledSchedule(scope, code, enable).execute();

[EXPERIMENTAL] EnabledSchedule: Enable/disable a schedule

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the schedule to be enabled/disabled
    String code = "code_example"; // String | Code of the schedule to be enabled/disabled
    Boolean enable = true; // Boolean | Specify whether to enable or disable the schedule
    try {
      ScheduleDefinition result = apiInstance.enabledSchedule(scope, code, enable)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#enabledSchedule");
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
| **scope** | **String**| Scope of the schedule to be enabled/disabled | |
| **code** | **String**| Code of the schedule to be enabled/disabled | |
| **enable** | **Boolean**| Specify whether to enable or disable the schedule | |

### Return type

[**ScheduleDefinition**](ScheduleDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getSchedule"></a>
# **getSchedule**
> ScheduleDefinition getSchedule(scope, code).execute();

[EXPERIMENTAL] GetSchedule: Get a single Schedule

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of Schedule
    String code = "code_example"; // String | The code of the Schedule
    try {
      ScheduleDefinition result = apiInstance.getSchedule(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#getSchedule");
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
| **scope** | **String**| The scope of Schedule | |
| **code** | **String**| The code of the Schedule | |

### Return type

[**ScheduleDefinition**](ScheduleDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listSchedules"></a>
# **listSchedules**
> ResourceListOfScheduleDefinition listSchedules().page(page).sortBy(sortBy).start(start).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListSchedules: List the available Schedules

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String page = "page_example"; // String | The pagination token to use to continue listing instruments from a previous call to list instruments.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
    List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 2000; // Integer | When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000.
    String filter = "filter_example"; // String | Expression to filter the result set.
    try {
      ResourceListOfScheduleDefinition result = apiInstance.listSchedules()
            .page(page)
            .sortBy(sortBy)
            .start(start)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#listSchedules");
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

[**ResourceListOfScheduleDefinition**](ResourceListOfScheduleDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="runSchedule"></a>
# **runSchedule**
> StartScheduleResponse runSchedule(scope, code).execute();

[EXPERIMENTAL] RunSchedule: Run a schedule immediately

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String scope = "scope_example"; // String | The schedule scope
    String code = "code_example"; // String | The schedule cde
    try {
      StartScheduleResponse result = apiInstance.runSchedule(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#runSchedule");
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
| **scope** | **String**| The schedule scope | |
| **code** | **String**| The schedule cde | |

### Return type

[**StartScheduleResponse**](StartScheduleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateSchedule"></a>
# **updateSchedule**
> ScheduleDefinition updateSchedule(scope, code, updateScheduleRequest).execute();

[EXPERIMENTAL] UpdateSchedule: Update a schedule.

### Example
```java
// Import classes:
import com.finbourne.scheduler.ApiClient;
import com.finbourne.scheduler.ApiException;
import com.finbourne.scheduler.Configuration;
import com.finbourne.scheduler.auth.*;
import com.finbourne.scheduler.models.*;
import com.finbourne.scheduler.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/scheduler2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the schedule to be updated
    String code = "code_example"; // String | Code of the schedule to be updated
    UpdateScheduleRequest updateScheduleRequest = new UpdateScheduleRequest(); // UpdateScheduleRequest | The updated schedule
    try {
      ScheduleDefinition result = apiInstance.updateSchedule(scope, code, updateScheduleRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#updateSchedule");
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
| **scope** | **String**| Scope of the schedule to be updated | |
| **code** | **String**| Code of the schedule to be updated | |
| **updateScheduleRequest** | [**UpdateScheduleRequest**](UpdateScheduleRequest.md)| The updated schedule | |

### Return type

[**ScheduleDefinition**](ScheduleDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

