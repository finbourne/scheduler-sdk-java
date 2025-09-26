# com.finbourne.scheduler.model.Notification
Notification type

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fireOn** | **String** | Condition for the notification | [optional] [readonly] [default to String]
**transport** | **String** | The type of the notification | [optional] [default to String]
**destination** | **List&lt;String&gt;** | Where the notification should be sent | [optional] [default to List<String>]

```java
import com.finbourne.scheduler.model.Notification;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String FireOn = "example FireOn";
@jakarta.annotation.Nullable String Transport = "example Transport";
@jakarta.annotation.Nullable List<String> Destination = new List<String>();


Notification notificationInstance = new Notification()
    .FireOn(FireOn)
    .Transport(Transport)
    .Destination(Destination);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
