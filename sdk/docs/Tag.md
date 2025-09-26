# com.finbourne.scheduler.model.Tag
Represents data of an image's tag

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the tag | [optional] [default to String]
**pullTime** | [**OffsetDateTime**](OffsetDateTime.md) | The latest pull time | [optional] [default to OffsetDateTime]
**pushTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the tag&#39;s push | [optional] [default to OffsetDateTime]
**signed** | **Boolean** | Indicates whether the tag is signed | [optional] [default to Boolean]
**immutable** | **Boolean** | Indicates whether the tag is immutable | [optional] [default to Boolean]

```java
import com.finbourne.scheduler.model.Tag;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
OffsetDateTime PullTime = OffsetDateTime.now();
OffsetDateTime PushTime = OffsetDateTime.now();
Boolean Signed = true;
Boolean Immutable = true;


Tag tagInstance = new Tag()
    .Name(Name)
    .PullTime(PullTime)
    .PushTime(PushTime)
    .Signed(Signed)
    .Immutable(Immutable);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
