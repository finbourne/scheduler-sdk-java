# com.finbourne.scheduler.model.ScanReport
Represents the details of a security scan of an image

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**severity** | **String** | The overall severity. For example : \&quot;High\&quot; or \&quot;None\&quot; | [optional] [default to String]
**status** | **String** | The status of the report | [optional] [default to String]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | The start time of the scanning process | [optional] [default to OffsetDateTime]
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | The end time of the scanning process | [optional] [default to OffsetDateTime]
**scanDuration** | **Integer** | The duration of the scan in seconds | [optional] [default to Integer]
**summary** | [**ScanSummary**](ScanSummary.md) |  | [optional] [default to ScanSummary]
**vulnerabilities** | [**List&lt;Vulnerability&gt;**](Vulnerability.md) | List of Finbourne.Scheduler.WebApi.Dtos.Images.Vulnerability | [optional] [default to List<Vulnerability>]

```java
import com.finbourne.scheduler.model.ScanReport;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Severity = "example Severity";
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable OffsetDateTime StartTime = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EndTime = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer ScanDuration = new Integer("100.00");
ScanSummary Summary = new ScanSummary();
@jakarta.annotation.Nullable List<Vulnerability> Vulnerabilities = new List<Vulnerability>();


ScanReport scanReportInstance = new ScanReport()
    .Severity(Severity)
    .Status(Status)
    .StartTime(StartTime)
    .EndTime(EndTime)
    .ScanDuration(ScanDuration)
    .Summary(Summary)
    .Vulnerabilities(Vulnerabilities);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
