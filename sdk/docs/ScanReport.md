

# ScanReport

Represents the details of a security scan of an image

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**severity** | **String** | The overall severity. For example : \&quot;High\&quot; or \&quot;None\&quot; |  [optional] |
|**status** | **String** | The status of the report |  [optional] |
|**startTime** | **OffsetDateTime** | The start time of the scanning process |  [optional] |
|**endTime** | **OffsetDateTime** | The end time of the scanning process |  [optional] |
|**scanDuration** | **Integer** | The duration of the scan in seconds |  [optional] |
|**summary** | [**ScanSummary**](ScanSummary.md) |  |  [optional] |
|**vulnerabilities** | [**List&lt;Vulnerability&gt;**](Vulnerability.md) | List of Finbourne.Scheduler.WebApi.Dtos.Images.Vulnerability |  [optional] |



