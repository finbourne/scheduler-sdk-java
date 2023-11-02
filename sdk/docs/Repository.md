

# Repository

An object representation of a repository

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The identifier of the repository |  [optional] |
|**creationTime** | **OffsetDateTime** | Date of repository creation |  [optional] |
|**lastUpdate** | **OffsetDateTime** | The last update of the repository |  [optional] |
|**description** | **String** | Description of the repository |  [optional] |
|**pullCount** | **Long** | Number of times images were pulled from this repository |  [optional] |
|**imageCount** | **Long** | The number of versions of this image |  [optional] |
|**images** | [**Link**](Link.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



