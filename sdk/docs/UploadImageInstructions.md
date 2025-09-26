# com.finbourne.scheduler.model.UploadImageInstructions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dockerLoginCommand** | **String** |  | [default to String]
**buildVersionedDockerImageCommand** | **String** |  | [default to String]
**tagVersionedDockerImageCommand** | **String** |  | [default to String]
**pushVersionedDockerImageCommand** | **String** |  | [default to String]
**tagLatestDockerImageCommand** | **String** |  | [optional] [default to String]
**pushLatestDockerImageCommand** | **String** |  | [optional] [default to String]
**expiryTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.scheduler.model.UploadImageInstructions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DockerLoginCommand = "example DockerLoginCommand";
String BuildVersionedDockerImageCommand = "example BuildVersionedDockerImageCommand";
String TagVersionedDockerImageCommand = "example TagVersionedDockerImageCommand";
String PushVersionedDockerImageCommand = "example PushVersionedDockerImageCommand";
@jakarta.annotation.Nullable String TagLatestDockerImageCommand = "example TagLatestDockerImageCommand";
@jakarta.annotation.Nullable String PushLatestDockerImageCommand = "example PushLatestDockerImageCommand";
@jakarta.annotation.Nullable OffsetDateTime ExpiryTime = OffsetDateTime.now();


UploadImageInstructions uploadImageInstructionsInstance = new UploadImageInstructions()
    .DockerLoginCommand(DockerLoginCommand)
    .BuildVersionedDockerImageCommand(BuildVersionedDockerImageCommand)
    .TagVersionedDockerImageCommand(TagVersionedDockerImageCommand)
    .PushVersionedDockerImageCommand(PushVersionedDockerImageCommand)
    .TagLatestDockerImageCommand(TagLatestDockerImageCommand)
    .PushLatestDockerImageCommand(PushLatestDockerImageCommand)
    .ExpiryTime(ExpiryTime);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
