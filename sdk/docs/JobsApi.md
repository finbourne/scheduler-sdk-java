# JobsApi

All URIs are relative to *https://fbn-prd.lusid.com/scheduler2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJob**](JobsApi.md#createJob) | **POST** /api/jobs | [EXPERIMENTAL] CreateJob: Create a new job |
| [**deleteJob**](JobsApi.md#deleteJob) | **DELETE** /api/jobs/{scope}/{code} | [EXPERIMENTAL] DeleteJob: Delete a job |
| [**getHistory**](JobsApi.md#getHistory) | **GET** /api/jobs/history | [EXPERIMENTAL] GetHistory: Get the history of job runs |
| [**getJobConsoleOutput**](JobsApi.md#getJobConsoleOutput) | **GET** /api/jobs/history/{runId}/console | [EXPERIMENTAL] GetJobConsoleOutput: Gets the console output of a specific job run |
| [**getRunHistory**](JobsApi.md#getRunHistory) | **GET** /api/jobs/history/{runId} | [EXPERIMENTAL] GetRunHistory: Get the history for a single job run |
| [**getSchedulesForAJob**](JobsApi.md#getSchedulesForAJob) | **GET** /api/jobs/{scope}/{code}/schedules | [EXPERIMENTAL] GetSchedulesForAJob: Get all the schedules for a single job |
| [**listJobs**](JobsApi.md#listJobs) | **GET** /api/jobs | [EXPERIMENTAL] ListJobs: List the available jobs |
| [**runJob**](JobsApi.md#runJob) | **POST** /api/jobs/{scope}/{code}/$run | RunJob: Run a job immediately |
| [**updateJob**](JobsApi.md#updateJob) | **PUT** /api/jobs/{scope}/{code} | [EXPERIMENTAL] UpdateJob: Update a JobDefinition |



## createJob

> JobDefinition createJob(createJobRequest)

[EXPERIMENTAL] CreateJob: Create a new job

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.JobsApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class JobsApiExample {

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
        // JobsApi apiInstance = apiFactory.build(JobsApi.class);

        JobsApi apiInstance = ApiFactoryBuilder.build(fileName).build(JobsApi.class);
        CreateJobRequest createJobRequest = new CreateJobRequest(); // CreateJobRequest | The request to create a new job
        try {
            // uncomment the below to set overrides at the request level
            // JobDefinition result = apiInstance.createJob(createJobRequest).execute(opts);

            JobDefinition result = apiInstance.createJob(createJobRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#createJob");
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
| **createJobRequest** | [**CreateJobRequest**](CreateJobRequest.md)| The request to create a new job | |

### Return type

[**JobDefinition**](JobDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteJob

> ResourceListOfScheduleDefinition deleteJob(scope, code)

[EXPERIMENTAL] DeleteJob: Delete a job

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.JobsApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class JobsApiExample {

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
        // JobsApi apiInstance = apiFactory.build(JobsApi.class);

        JobsApi apiInstance = ApiFactoryBuilder.build(fileName).build(JobsApi.class);
        String scope = "scope_example"; // String | The scope of the job
        String code = "code_example"; // String | The code of the job
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfScheduleDefinition result = apiInstance.deleteJob(scope, code).execute(opts);

            ResourceListOfScheduleDefinition result = apiInstance.deleteJob(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#deleteJob");
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
| **scope** | **String**| The scope of the job | |
| **code** | **String**| The code of the job | |

### Return type

[**ResourceListOfScheduleDefinition**](ResourceListOfScheduleDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getHistory

> ResourceListOfJobHistory getHistory(page, sortBy, start, limit, filter)

[EXPERIMENTAL] GetHistory: Get the history of job runs

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.JobsApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class JobsApiExample {

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
        // JobsApi apiInstance = apiFactory.build(JobsApi.class);

        JobsApi apiInstance = ApiFactoryBuilder.build(fileName).build(JobsApi.class);
        String page = "page_example"; // String | The pagination token to use to continue listing instruments from a previous call to list instruments.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
        List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
        Integer start = 56; // Integer | This field is obsolete, the value of this field would not be considered.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000.
        String filter = "filter_example"; // String | Expression to filter the result set.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfJobHistory result = apiInstance.getHistory(page, sortBy, start, limit, filter).execute(opts);

            ResourceListOfJobHistory result = apiInstance.getHistory(page, sortBy, start, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#getHistory");
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
| **start** | **Integer**| This field is obsolete, the value of this field would not be considered. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000. | [optional] |
| **filter** | **String**| Expression to filter the result set. | [optional] |

### Return type

[**ResourceListOfJobHistory**](ResourceListOfJobHistory.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getJobConsoleOutput

> String getJobConsoleOutput(runId)

[EXPERIMENTAL] GetJobConsoleOutput: Gets the console output of a specific job run

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.JobsApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class JobsApiExample {

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
        // JobsApi apiInstance = apiFactory.build(JobsApi.class);

        JobsApi apiInstance = ApiFactoryBuilder.build(fileName).build(JobsApi.class);
        String runId = "runId_example"; // String | The RunId of the job run
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getJobConsoleOutput(runId).execute(opts);

            String result = apiInstance.getJobConsoleOutput(runId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#getJobConsoleOutput");
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
| **runId** | **String**| The RunId of the job run | |

### Return type

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getRunHistory

> JobRunResult getRunHistory(runId)

[EXPERIMENTAL] GetRunHistory: Get the history for a single job run

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.JobsApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class JobsApiExample {

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
        // JobsApi apiInstance = apiFactory.build(JobsApi.class);

        JobsApi apiInstance = ApiFactoryBuilder.build(fileName).build(JobsApi.class);
        String runId = "runId_example"; // String | The unique ID of the run
        try {
            // uncomment the below to set overrides at the request level
            // JobRunResult result = apiInstance.getRunHistory(runId).execute(opts);

            JobRunResult result = apiInstance.getRunHistory(runId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#getRunHistory");
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
| **runId** | **String**| The unique ID of the run | |

### Return type

[**JobRunResult**](JobRunResult.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSchedulesForAJob

> ResourceListOfScheduleDefinition getSchedulesForAJob(scope, code)

[EXPERIMENTAL] GetSchedulesForAJob: Get all the schedules for a single job

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.JobsApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class JobsApiExample {

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
        // JobsApi apiInstance = apiFactory.build(JobsApi.class);

        JobsApi apiInstance = ApiFactoryBuilder.build(fileName).build(JobsApi.class);
        String scope = "scope_example"; // String | The scope of the job
        String code = "code_example"; // String | The code of the job
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfScheduleDefinition result = apiInstance.getSchedulesForAJob(scope, code).execute(opts);

            ResourceListOfScheduleDefinition result = apiInstance.getSchedulesForAJob(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#getSchedulesForAJob");
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
| **scope** | **String**| The scope of the job | |
| **code** | **String**| The code of the job | |

### Return type

[**ResourceListOfScheduleDefinition**](ResourceListOfScheduleDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listJobs

> ResourceListOfJobDefinition listJobs(page, sortBy, start, limit, filter)

[EXPERIMENTAL] ListJobs: List the available jobs

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.JobsApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class JobsApiExample {

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
        // JobsApi apiInstance = apiFactory.build(JobsApi.class);

        JobsApi apiInstance = ApiFactoryBuilder.build(fileName).build(JobsApi.class);
        String page = "page_example"; // String | The pagination token to use to continue listing instruments from a previous call to list instruments.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
        List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
        Integer start = 56; // Integer | When paginating, skip this number of results.
        Integer limit = 2000; // Integer | When paginating, limit the number of returned results to this many. Defaults to 2000 if not specified. Maximum is 5000.
        String filter = "filter_example"; // String | Expression to filter the result set.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfJobDefinition result = apiInstance.listJobs(page, sortBy, start, limit, filter).execute(opts);

            ResourceListOfJobDefinition result = apiInstance.listJobs(page, sortBy, start, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#listJobs");
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

[**ResourceListOfJobDefinition**](ResourceListOfJobDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## runJob

> StartJobResponse runJob(scope, code, startJobRequest)

RunJob: Run a job immediately

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.JobsApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class JobsApiExample {

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
        // JobsApi apiInstance = apiFactory.build(JobsApi.class);

        JobsApi apiInstance = ApiFactoryBuilder.build(fileName).build(JobsApi.class);
        String scope = "scope_example"; // String | The scope of the job
        String code = "code_example"; // String | The code of the job
        StartJobRequest startJobRequest = new StartJobRequest(); // StartJobRequest | The request for starting job
        try {
            // uncomment the below to set overrides at the request level
            // StartJobResponse result = apiInstance.runJob(scope, code, startJobRequest).execute(opts);

            StartJobResponse result = apiInstance.runJob(scope, code, startJobRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#runJob");
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
| **scope** | **String**| The scope of the job | |
| **code** | **String**| The code of the job | |
| **startJobRequest** | [**StartJobRequest**](StartJobRequest.md)| The request for starting job | |

### Return type

[**StartJobResponse**](StartJobResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateJob

> JobDefinition updateJob(scope, code, updateJobRequest)

[EXPERIMENTAL] UpdateJob: Update a JobDefinition

### Example

```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.JobsApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class JobsApiExample {

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
        // JobsApi apiInstance = apiFactory.build(JobsApi.class);

        JobsApi apiInstance = ApiFactoryBuilder.build(fileName).build(JobsApi.class);
        String scope = "scope_example"; // String | 
        String code = "code_example"; // String | 
        UpdateJobRequest updateJobRequest = new UpdateJobRequest(); // UpdateJobRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // JobDefinition result = apiInstance.updateJob(scope, code, updateJobRequest).execute(opts);

            JobDefinition result = apiInstance.updateJob(scope, code, updateJobRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#updateJob");
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
| **scope** | **String**|  | |
| **code** | **String**|  | |
| **updateJobRequest** | [**UpdateJobRequest**](UpdateJobRequest.md)|  | |

### Return type

[**JobDefinition**](JobDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

