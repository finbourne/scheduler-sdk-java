# com.finbourne.scheduler.model.TimeTrigger
Time-based trigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **String** | Cron expression | [optional] [default to String]
**timeZone** | **String** | Time zone of the Cron expression. If not provided, defaults to UTC | [optional] [default to String]

```java
import com.finbourne.scheduler.model.TimeTrigger;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Expression = "example Expression";
@jakarta.annotation.Nullable String TimeZone = "example TimeZone";


TimeTrigger timeTriggerInstance = new TimeTrigger()
    .Expression(Expression)
    .TimeZone(TimeZone);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
