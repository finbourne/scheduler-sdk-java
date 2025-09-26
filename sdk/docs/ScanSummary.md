# com.finbourne.scheduler.model.ScanSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fixable** | **Integer** | The number of vulnerabilities that have a known fix | [optional] [default to Integer]
**total** | **Integer** | The total number of vulnerabilities | [optional] [default to Integer]
**critical** | **Integer** | The number of Critical severity vulnerabilities | [optional] [default to Integer]
**high** | **Integer** | The number of High severity vulnerabilities | [optional] [default to Integer]
**medium** | **Integer** | The number of Medium severity vulnerabilities | [optional] [default to Integer]
**low** | **Integer** | The number of Low severity vulnerabilities | [optional] [default to Integer]
**negligible** | **Integer** | The number of Negligible severity vulnerabilities | [optional] [default to Integer]
**unknown** | **Integer** | The number of Unknown severity vulnerabilities | [optional] [default to Integer]

```java
import com.finbourne.scheduler.model.ScanSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Integer Fixable = new Integer("100.00");
@jakarta.annotation.Nullable Integer Total = new Integer("100.00");
@jakarta.annotation.Nullable Integer Critical = new Integer("100.00");
@jakarta.annotation.Nullable Integer High = new Integer("100.00");
@jakarta.annotation.Nullable Integer Medium = new Integer("100.00");
@jakarta.annotation.Nullable Integer Low = new Integer("100.00");
@jakarta.annotation.Nullable Integer Negligible = new Integer("100.00");
@jakarta.annotation.Nullable Integer Unknown = new Integer("100.00");


ScanSummary scanSummaryInstance = new ScanSummary()
    .Fixable(Fixable)
    .Total(Total)
    .Critical(Critical)
    .High(High)
    .Medium(Medium)
    .Low(Low)
    .Negligible(Negligible)
    .Unknown(Unknown);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
