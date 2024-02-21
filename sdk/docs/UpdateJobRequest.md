

# UpdateJobRequest

A request to update a job

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the job |  |
|**author** | **String** | Author of the job |  [optional] |
|**description** | **String** | Description of this job |  |
|**imageName** | **String** | The name of the Docker image that contains this job |  |
|**imageTag** | **String** | The tag of the Docker image that contains this job |  |
|**ttl** | **Integer** | Time To Live of the job run in seconds  Defaults to 5 minutes(300) |  [optional] |
|**minCpu** | **String** | Specifies minimum number of CPUs to be allocated for the job  Default to 2 |  [optional] |
|**maxCpu** | **String** | Specifies maximum number of CPUs to be allocated for the job |  [optional] |
|**minMemory** | **String** | Specifies the minimum amount of memory to be allocated for the job |  [optional] |
|**maxMemory** | **String** | Specifies the maximum amount of memory to be allocated for the job |  [optional] |
|**argumentDefinitions** | [**Map&lt;String, ArgumentDefinition&gt;**](ArgumentDefinition.md) | All arguments for this job to run |  |
|**commandLineArgumentSeparator** | **String** | Value to separate command line arguments  e.g : If a job has a command line argument named &#39;folder&#39; and the runtime value is &#39;s3://path&#39; then this  would be supplied to the command as &#39;folder{separatorValue}s3://path&#39;  Default to a space |  [optional] |
|**requiredResources** | [**RequiredResources**](RequiredResources.md) |  |  [optional] |



