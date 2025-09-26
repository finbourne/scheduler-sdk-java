# com.finbourne.scheduler.model.StartJobResponse
Response from starting a job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**runId** | **String** | Unique RunId of the started job run | [optional] [default to String]
**status** | **String** | Link to the status of the started job | [optional] [default to String]
**result** | **String** | Link to the result of the job run when completed | [optional] [default to String]

```java
import com.finbourne.scheduler.model.StartJobResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId JobId = new ResourceId();
@jakarta.annotation.Nullable String RunId = "example RunId";
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable String Result = "example Result";


StartJobResponse startJobResponseInstance = new StartJobResponse()
    .JobId(JobId)
    .RunId(RunId)
    .Status(Status)
    .Result(Result);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
