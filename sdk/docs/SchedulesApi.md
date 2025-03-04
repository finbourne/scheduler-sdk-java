# SchedulesApi

All URIs are relative to *https://fbn-prd.lusid.com/scheduler2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSchedule**](SchedulesApi.md#createSchedule) | **POST** /api/schedules | CreateSchedule: Create a Schedule for a job |
| [**deleteSchedule**](SchedulesApi.md#deleteSchedule) | **DELETE** /api/schedules/{scope}/{code} | DeleteSchedule: Delete a schedule |
| [**enabledSchedule**](SchedulesApi.md#enabledSchedule) | **PUT** /api/schedules/{scope}/{code}/enabled | EnabledSchedule: Enable/disable a schedule |
| [**getSchedule**](SchedulesApi.md#getSchedule) | **GET** /api/schedules/{scope}/{code} | GetSchedule: Get a single Schedule |
| [**listSchedules**](SchedulesApi.md#listSchedules) | **GET** /api/schedules | ListSchedules: List the available Schedules |
| [**runSchedule**](SchedulesApi.md#runSchedule) | **POST** /api/schedules/{scope}/{code}/$run | RunSchedule: Run a schedule immediately |
| [**updateSchedule**](SchedulesApi.md#updateSchedule) | **PUT** /api/schedules/{scope}/{code} | UpdateSchedule: Update a schedule. |



## createSchedule

> ScheduleDefinition createSchedule(createScheduleRequest)

CreateSchedule: Create a Schedule for a job

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.SchedulesApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SchedulesApiExample {

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
        // SchedulesApi apiInstance = apiFactory.build(SchedulesApi.class);

        SchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SchedulesApi.class);
        CreateScheduleRequest createScheduleRequest = new CreateScheduleRequest(); // CreateScheduleRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // ScheduleDefinition result = apiInstance.createSchedule(createScheduleRequest).execute(opts);

            ScheduleDefinition result = apiInstance.createSchedule(createScheduleRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchedulesApi#createSchedule");
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
| **createScheduleRequest** | [**CreateScheduleRequest**](CreateScheduleRequest.md)|  | |

### Return type

[**ScheduleDefinition**](ScheduleDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created schedule |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteSchedule

> deleteSchedule(scope, code)

DeleteSchedule: Delete a schedule

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.SchedulesApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SchedulesApiExample {

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
        // SchedulesApi apiInstance = apiFactory.build(SchedulesApi.class);

        SchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SchedulesApi.class);
        String scope = "scope_example"; // String | Scope of the schedule to be deleted
        String code = "code_example"; // String | Code of the schedule to be deleted
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.deleteSchedule(scope, code).execute(opts);

            apiInstance.deleteSchedule(scope, code).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling SchedulesApi#deleteSchedule");
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
| **scope** | **String**| Scope of the schedule to be deleted | |
| **code** | **String**| Code of the schedule to be deleted | |

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## enabledSchedule

> ScheduleDefinition enabledSchedule(scope, code, enable)

EnabledSchedule: Enable/disable a schedule

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.SchedulesApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SchedulesApiExample {

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
        // SchedulesApi apiInstance = apiFactory.build(SchedulesApi.class);

        SchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SchedulesApi.class);
        String scope = "scope_example"; // String | Scope of the schedule to be enabled/disabled
        String code = "code_example"; // String | Code of the schedule to be enabled/disabled
        Boolean enable = true; // Boolean | Specify whether to enable or disable the schedule
        try {
            // uncomment the below to set overrides at the request level
            // ScheduleDefinition result = apiInstance.enabledSchedule(scope, code, enable).execute(opts);

            ScheduleDefinition result = apiInstance.enabledSchedule(scope, code, enable).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchedulesApi#enabledSchedule");
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
| **scope** | **String**| Scope of the schedule to be enabled/disabled | |
| **code** | **String**| Code of the schedule to be enabled/disabled | |
| **enable** | **Boolean**| Specify whether to enable or disable the schedule | |

### Return type

[**ScheduleDefinition**](ScheduleDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSchedule

> ScheduleDefinition getSchedule(scope, code)

GetSchedule: Get a single Schedule

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.SchedulesApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SchedulesApiExample {

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
        // SchedulesApi apiInstance = apiFactory.build(SchedulesApi.class);

        SchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SchedulesApi.class);
        String scope = "scope_example"; // String | The scope of Schedule
        String code = "code_example"; // String | The code of the Schedule
        try {
            // uncomment the below to set overrides at the request level
            // ScheduleDefinition result = apiInstance.getSchedule(scope, code).execute(opts);

            ScheduleDefinition result = apiInstance.getSchedule(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchedulesApi#getSchedule");
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
| **scope** | **String**| The scope of Schedule | |
| **code** | **String**| The code of the Schedule | |

### Return type

[**ScheduleDefinition**](ScheduleDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listSchedules

> ResourceListOfScheduleDefinition listSchedules(page, sortBy, start, limit, filter)

ListSchedules: List the available Schedules

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.SchedulesApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SchedulesApiExample {

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
        // SchedulesApi apiInstance = apiFactory.build(SchedulesApi.class);

        SchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SchedulesApi.class);
        String page = "page_example"; // String | The pagination token to use to continue listing instruments from a previous call to list instruments.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
        List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
        Integer start = 56; // Integer | When paginating, skip this number of results.
        Integer limit = 2000; // Integer | When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000.
        String filter = "filter_example"; // String | Expression to filter the result set.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfScheduleDefinition result = apiInstance.listSchedules(page, sortBy, start, limit, filter).execute(opts);

            ResourceListOfScheduleDefinition result = apiInstance.listSchedules(page, sortBy, start, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchedulesApi#listSchedules");
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
| **page** | **String**| The pagination token to use to continue listing instruments from a previous call to list instruments.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000. | [optional] [default to 2000] |
| **filter** | **String**| Expression to filter the result set. | [optional] |

### Return type

[**ResourceListOfScheduleDefinition**](ResourceListOfScheduleDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## runSchedule

> StartScheduleResponse runSchedule(scope, code)

RunSchedule: Run a schedule immediately

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.SchedulesApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SchedulesApiExample {

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
        // SchedulesApi apiInstance = apiFactory.build(SchedulesApi.class);

        SchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SchedulesApi.class);
        String scope = "scope_example"; // String | The schedule scope
        String code = "code_example"; // String | The schedule cde
        try {
            // uncomment the below to set overrides at the request level
            // StartScheduleResponse result = apiInstance.runSchedule(scope, code).execute(opts);

            StartScheduleResponse result = apiInstance.runSchedule(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchedulesApi#runSchedule");
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
| **scope** | **String**| The schedule scope | |
| **code** | **String**| The schedule cde | |

### Return type

[**StartScheduleResponse**](StartScheduleResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateSchedule

> ScheduleDefinition updateSchedule(scope, code, updateScheduleRequest)

UpdateSchedule: Update a schedule.

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.SchedulesApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SchedulesApiExample {

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
        // SchedulesApi apiInstance = apiFactory.build(SchedulesApi.class);

        SchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SchedulesApi.class);
        String scope = "scope_example"; // String | Scope of the schedule to be updated
        String code = "code_example"; // String | Code of the schedule to be updated
        UpdateScheduleRequest updateScheduleRequest = new UpdateScheduleRequest(); // UpdateScheduleRequest | The updated schedule
        try {
            // uncomment the below to set overrides at the request level
            // ScheduleDefinition result = apiInstance.updateSchedule(scope, code, updateScheduleRequest).execute(opts);

            ScheduleDefinition result = apiInstance.updateSchedule(scope, code, updateScheduleRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchedulesApi#updateSchedule");
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
| **scope** | **String**| Scope of the schedule to be updated | |
| **code** | **String**| Code of the schedule to be updated | |
| **updateScheduleRequest** | [**UpdateScheduleRequest**](UpdateScheduleRequest.md)| The updated schedule | |

### Return type

[**ScheduleDefinition**](ScheduleDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

