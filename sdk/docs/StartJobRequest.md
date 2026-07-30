# com.finbourne.scheduler.model.StartJobRequest
Job start definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arguments** | **Map&lt;String, String&gt;** | All arguments needed for the Job to run | [optional] [default to Map<String, String>]
**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Notifications for this Job | [optional] [default to List<Notification>]
**useAsAuth** | **String** | Id of user associated with schedule. All calls to FINBOURNE services as part of execution of this schedule will be authenticated as this user. Can be null, in which case we&#39;ll default to that of the user making this request | [optional] [default to String]
**runId** | **String** | Optional pre-generated RunId (Guid format) for this job run. When provided, this is used as the RunId instead of generating a new one, allowing the caller to pre-generate and track the run before it starts. | [optional] [default to String]

```java
import com.finbourne.scheduler.model.StartJobRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, String> Arguments = new Map<String, String>();
@jakarta.annotation.Nullable List<Notification> Notifications = new List<Notification>();
@jakarta.annotation.Nullable String UseAsAuth = "example UseAsAuth";
@jakarta.annotation.Nullable String RunId = "example RunId";


StartJobRequest startJobRequestInstance = new StartJobRequest()
    .Arguments(Arguments)
    .Notifications(Notifications)
    .UseAsAuth(UseAsAuth)
    .RunId(RunId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
