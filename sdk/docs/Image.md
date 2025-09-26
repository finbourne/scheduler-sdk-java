# com.finbourne.scheduler.model.Image
Represents the metadata of an image

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the image | [optional] [default to String]
**pushTime** | [**OffsetDateTime**](OffsetDateTime.md) | The push time of the image | [optional] [default to OffsetDateTime]
**pullTime** | [**OffsetDateTime**](OffsetDateTime.md) | The latest pull time of the image | [optional] [default to OffsetDateTime]
**digest** | **String** | The digest of the image | [optional] [default to String]
**size** | **Long** | The size of the image (in bytes) | [optional] [default to Long]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags of the image | [optional] [default to List<Tag>]
**scanReport** | [**ScanReport**](ScanReport.md) |  | [optional] [default to ScanReport]

```java
import com.finbourne.scheduler.model.Image;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable OffsetDateTime PushTime = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime PullTime = OffsetDateTime.now();
@jakarta.annotation.Nullable String Digest = "example Digest";
@jakarta.annotation.Nullable Long Size = new Long("100.00");
@jakarta.annotation.Nullable List<Tag> Tags = new List<Tag>();
ScanReport ScanReport = new ScanReport();


Image imageInstance = new Image()
    .Name(Name)
    .PushTime(PushTime)
    .PullTime(PullTime)
    .Digest(Digest)
    .Size(Size)
    .Tags(Tags)
    .ScanReport(ScanReport);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
