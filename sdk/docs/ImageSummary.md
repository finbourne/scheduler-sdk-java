# com.finbourne.scheduler.model.ImageSummary
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
**scanStatus** | **String** | The Scan Status of the stated image | [optional] [default to String]
**scanSummary** | [**ScanSummary**](ScanSummary.md) |  | [optional] [default to ScanSummary]
**link** | [**Link**](Link.md) |  | [optional] [default to Link]

```java
import com.finbourne.scheduler.model.ImageSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable OffsetDateTime PushTime = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime PullTime = OffsetDateTime.now();
@jakarta.annotation.Nullable String Digest = "example Digest";
@jakarta.annotation.Nullable Long Size = new Long("100.00");
@jakarta.annotation.Nullable List<Tag> Tags = new List<Tag>();
@jakarta.annotation.Nullable String ScanStatus = "example ScanStatus";
ScanSummary ScanSummary = new ScanSummary();
Link Link = new Link();


ImageSummary imageSummaryInstance = new ImageSummary()
    .Name(Name)
    .PushTime(PushTime)
    .PullTime(PullTime)
    .Digest(Digest)
    .Size(Size)
    .Tags(Tags)
    .ScanStatus(ScanStatus)
    .ScanSummary(ScanSummary)
    .Link(Link);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
