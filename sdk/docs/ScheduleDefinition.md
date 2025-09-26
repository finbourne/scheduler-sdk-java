# com.finbourne.scheduler.model.ScheduleDefinition
Schedule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleIdentifier** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**jobId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**name** | **String** | A display name for this Schedule | [optional] [default to String]
**description** | **String** | A description of the Schedule | [optional] [default to String]
**author** | **String** | Name of the author of this schedule | [optional] [default to String]
**owner** | **String** | Name of owner of this schedule | [optional] [default to String]
**useAsAuth** | **String** | User to runs schedule when automatically run and authenticates  requests in the schedule | [optional] [default to String]
**arguments** | **Map&lt;String, String&gt;** | All arguments specified by this Schedule that will be passed in to the Job | [optional] [default to Map<String, String>]
**trigger** | [**Trigger**](Trigger.md) |  | [optional] [default to Trigger]
**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Notifications for this Schedule | [optional] [default to List<Notification>]
**enabled** | **Boolean** | The status of this schedule | [optional] [default to Boolean]

```java
import com.finbourne.scheduler.model.ScheduleDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId ScheduleIdentifier = new ResourceId();
ResourceId JobId = new ResourceId();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String Author = "example Author";
@jakarta.annotation.Nullable String Owner = "example Owner";
@jakarta.annotation.Nullable String UseAsAuth = "example UseAsAuth";
@jakarta.annotation.Nullable Map<String, String> Arguments = new Map<String, String>();
Trigger Trigger = new Trigger();
@jakarta.annotation.Nullable List<Notification> Notifications = new List<Notification>();
Boolean Enabled = true;


ScheduleDefinition scheduleDefinitionInstance = new ScheduleDefinition()
    .ScheduleIdentifier(ScheduleIdentifier)
    .JobId(JobId)
    .Name(Name)
    .Description(Description)
    .Author(Author)
    .Owner(Owner)
    .UseAsAuth(UseAsAuth)
    .Arguments(Arguments)
    .Trigger(Trigger)
    .Notifications(Notifications)
    .Enabled(Enabled);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
