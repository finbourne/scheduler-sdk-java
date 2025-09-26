# com.finbourne.scheduler.model.StartScheduleResponse
Response from a manual run of a schedule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**jobId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**runId** | **String** | Unique RunId of the started schedule | [optional] [default to String]
**status** | **String** | Status of the started schedule | [optional] [default to String]
**result** | **String** | Link to the result of the job run when completed | [optional] [default to String]

```java
import com.finbourne.scheduler.model.StartScheduleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId ScheduleId = new ResourceId();
ResourceId JobId = new ResourceId();
@jakarta.annotation.Nullable String RunId = "example RunId";
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable String Result = "example Result";


StartScheduleResponse startScheduleResponseInstance = new StartScheduleResponse()
    .ScheduleId(ScheduleId)
    .JobId(JobId)
    .RunId(RunId)
    .Status(Status)
    .Result(Result);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
