# com.finbourne.scheduler.model.CreateScheduleRequest
Create a schedule definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**jobId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** | A display name for this Schedule | [default to String]
**description** | **String** | A description of the Schedule | [default to String]
**author** | **String** | Name of the author of this schedule | [optional] [default to String]
**owner** | **String** | Name of owner of this schedule | [optional] [default to String]
**arguments** | **Map&lt;String, String&gt;** | All arguments specified by this Schedule that will be passed in to the Job | [optional] [default to Map<String, String>]
**trigger** | [**Trigger**](Trigger.md) |  | [optional] [default to Trigger]
**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Notifications for this Schedule | [optional] [default to List<Notification>]
**enabled** | **Boolean** | Specify whether schedule is enabled or not Defaults to true | [optional] [default to Boolean]
**useAsAuth** | **String** | Id of user associated with schedule. All calls to FINBOURNE services as part of execution of this schedule will be authenticated as this  user. Can be null, in which case we&#39;ll default to that of the user  making this request | [optional] [default to String]

```java
import com.finbourne.scheduler.model.CreateScheduleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId ScheduleId = new ResourceId();
ResourceId JobId = new ResourceId();
String Name = "example Name";
String Description = "example Description";
@jakarta.annotation.Nullable String Author = "example Author";
@jakarta.annotation.Nullable String Owner = "example Owner";
@jakarta.annotation.Nullable Map<String, String> Arguments = new Map<String, String>();
Trigger Trigger = new Trigger();
@jakarta.annotation.Nullable List<Notification> Notifications = new List<Notification>();
Boolean Enabled = true;
@jakarta.annotation.Nullable String UseAsAuth = "example UseAsAuth";


CreateScheduleRequest createScheduleRequestInstance = new CreateScheduleRequest()
    .ScheduleId(ScheduleId)
    .JobId(JobId)
    .Name(Name)
    .Description(Description)
    .Author(Author)
    .Owner(Owner)
    .Arguments(Arguments)
    .Trigger(Trigger)
    .Notifications(Notifications)
    .Enabled(Enabled)
    .UseAsAuth(UseAsAuth);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
