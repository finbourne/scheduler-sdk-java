# com.finbourne.scheduler.model.RequiredResources
Information related to a jobs required access to resources

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidApis** | **List&lt;String&gt;** | List of LUSID APIs the job needs access to | [optional] [default to List<String>]
**lusidFileSystem** | **List&lt;String&gt;** | List of S3 bucket or folder names that the job can access | [optional] [default to List<String>]
**externalCalls** | **List&lt;String&gt;** | External URLs that the job can call | [optional] [default to List<String>]

```java
import com.finbourne.scheduler.model.RequiredResources;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> LusidApis = new List<String>();
@jakarta.annotation.Nullable List<String> LusidFileSystem = new List<String>();
@jakarta.annotation.Nullable List<String> ExternalCalls = new List<String>();


RequiredResources requiredResourcesInstance = new RequiredResources()
    .LusidApis(LusidApis)
    .LusidFileSystem(LusidFileSystem)
    .ExternalCalls(ExternalCalls);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
