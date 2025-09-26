# com.finbourne.scheduler.model.JobDefinition
Definition of a job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** | Name of the job | [optional] [default to String]
**author** | **String** | Author of the job | [optional] [default to String]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) | Date when job was created | [optional] [default to OffsetDateTime]
**description** | **String** | Description of this job | [optional] [default to String]
**dockerImage** | **String** | Information about the docker image in the format “image_source/image_name:image_tag” | [optional] [default to String]
**ttl** | **Integer** | Time To Live of the job run in seconds Defaults to 5 minutes(300) | [optional] [default to Integer]
**minCpu** | **String** | Specifies minimum number of CPUs to be allocated for the job Default to 2 | [optional] [default to String]
**maxCpu** | **String** | Specifies maximum number of CPUs to be allocated for the job | [optional] [default to String]
**minMemory** | **String** | Specifies the minimum amount of memory (in GiB) to be allocated for the job | [optional] [default to String]
**maxMemory** | **String** | Specifies the maximum amount of memory (in GiB) to be allocated for the job | [optional] [default to String]
**argumentDefinitions** | [**Map&lt;String, ArgumentDefinition&gt;**](ArgumentDefinition.md) | All arguments for this job to run | [optional] [default to Map<String, ArgumentDefinition>]
**commandLineArgumentSeparator** | **String** | Value to separate command line arguments e.g : If a job has a command line argument named &#39;folder&#39; and the runtime value is &#39;s3://path&#39; then this would be supplied to the command as &#39;folder{separatorValue}s3://path&#39; Default to a space | [optional] [default to String]
**requiredResources** | [**RequiredResources**](RequiredResources.md) |  | [optional] [default to RequiredResources]

```java
import com.finbourne.scheduler.model.JobDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId JobId = new ResourceId();
@jakarta.annotation.Nullable String Name = "example Name";
@jakarta.annotation.Nullable String Author = "example Author";
OffsetDateTime DateCreated = OffsetDateTime.now();
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String DockerImage = "example DockerImage";
Integer Ttl = new Integer("100.00");
@jakarta.annotation.Nullable String MinCpu = "example MinCpu";
@jakarta.annotation.Nullable String MaxCpu = "example MaxCpu";
@jakarta.annotation.Nullable String MinMemory = "example MinMemory";
@jakarta.annotation.Nullable String MaxMemory = "example MaxMemory";
@jakarta.annotation.Nullable Map<String, ArgumentDefinition> ArgumentDefinitions = new Map<String, ArgumentDefinition>();
@jakarta.annotation.Nullable String CommandLineArgumentSeparator = "example CommandLineArgumentSeparator";
RequiredResources RequiredResources = new RequiredResources();


JobDefinition jobDefinitionInstance = new JobDefinition()
    .JobId(JobId)
    .Name(Name)
    .Author(Author)
    .DateCreated(DateCreated)
    .Description(Description)
    .DockerImage(DockerImage)
    .Ttl(Ttl)
    .MinCpu(MinCpu)
    .MaxCpu(MaxCpu)
    .MinMemory(MinMemory)
    .MaxMemory(MaxMemory)
    .ArgumentDefinitions(ArgumentDefinitions)
    .CommandLineArgumentSeparator(CommandLineArgumentSeparator)
    .RequiredResources(RequiredResources);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
