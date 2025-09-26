# com.finbourne.scheduler.model.ResourceId
Resource Id

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | Scope of the resource | [default to String]
**code** | **String** | Code of the resource | [default to String]

```java
import com.finbourne.scheduler.model.ResourceId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";


ResourceId resourceIdInstance = new ResourceId()
    .Scope(Scope)
    .Code(Code);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
