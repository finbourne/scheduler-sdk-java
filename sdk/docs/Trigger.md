# com.finbourne.scheduler.model.Trigger
Holds different kinds of triggers A schedule may only have one type of trigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeTrigger** | [**TimeTrigger**](TimeTrigger.md) |  | [optional] [default to TimeTrigger]

```java
import com.finbourne.scheduler.model.Trigger;
import java.util.*;
import java.lang.System;
import java.net.URI;

TimeTrigger TimeTrigger = new TimeTrigger();


Trigger triggerInstance = new Trigger()
    .TimeTrigger(TimeTrigger);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
