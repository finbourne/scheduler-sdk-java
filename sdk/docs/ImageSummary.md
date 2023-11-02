

# ImageSummary

Represents the metadata of an image

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the image |  [optional] |
|**pushTime** | **OffsetDateTime** | The push time of the image |  [optional] |
|**pullTime** | **OffsetDateTime** | The latest pull time of the image |  [optional] |
|**digest** | **String** | The digest of the image |  [optional] |
|**size** | **Long** | The size of the image (in bytes) |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | The tags of the image |  [optional] |
|**scanStatus** | **String** | The Scan Status of the stated image |  [optional] |
|**scanSummary** | [**ScanSummary**](ScanSummary.md) |  |  [optional] |
|**link** | [**Link**](Link.md) |  |  [optional] |



