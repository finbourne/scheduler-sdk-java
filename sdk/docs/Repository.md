# com.finbourne.scheduler.model.Repository
An object representation of a repository

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The identifier of the repository | [optional] [default to String]
**creationTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date of repository creation | [optional] [default to OffsetDateTime]
**lastUpdate** | [**OffsetDateTime**](OffsetDateTime.md) | The last update of the repository | [optional] [default to OffsetDateTime]
**description** | **String** | Description of the repository | [optional] [default to String]
**pullCount** | **Long** | Number of times images were pulled from this repository | [optional] [default to Long]
**imageCount** | **Long** | The number of versions of this image | [optional] [default to Long]
**images** | [**Link**](Link.md) |  | [optional] [default to Link]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.scheduler.model.Repository;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Name = "example Name";
OffsetDateTime CreationTime = OffsetDateTime.now();
OffsetDateTime LastUpdate = OffsetDateTime.now();
@jakarta.annotation.Nullable String Description = "example Description";
Long PullCount = new Long("100.00");
Long ImageCount = new Long("100.00");
Link Images = new Link();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Repository repositoryInstance = new Repository()
    .Name(Name)
    .CreationTime(CreationTime)
    .LastUpdate(LastUpdate)
    .Description(Description)
    .PullCount(PullCount)
    .ImageCount(ImageCount)
    .Images(Images)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
