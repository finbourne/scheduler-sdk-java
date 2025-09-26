# com.finbourne.scheduler.model.ArgumentDefinition
Job argument definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataType** | **String** | Data type of the argument | [default to String]
**required** | **Boolean** | Optionality of the argument | [optional] [default to Boolean]
**description** | **String** | Argument description | [default to String]
**order** | **Integer** | The order of the argument | [default to Integer]
**constraints** | **String** | Constrains of the argument value | [optional] [default to String]
**passedAs** | **String** | Specifies how this argument should be passed in Allowed values are: CommandLine or EnvironmentVariable  Defaults to: CommandLine | [default to String]
**defaultValue** | **String** | Specify a default value for this argument if no value is provided The value needs to be convertible to the associated data type | [optional] [default to String]

```java
import com.finbourne.scheduler.model.ArgumentDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DataType = "example DataType";
Boolean Required = true;
String Description = "example Description";
Integer Order = new Integer("100.00");
@jakarta.annotation.Nullable String Constraints = "example Constraints";
String PassedAs = "example PassedAs";
@jakarta.annotation.Nullable String DefaultValue = "example DefaultValue";


ArgumentDefinition argumentDefinitionInstance = new ArgumentDefinition()
    .DataType(DataType)
    .Required(Required)
    .Description(Description)
    .Order(Order)
    .Constraints(Constraints)
    .PassedAs(PassedAs)
    .DefaultValue(DefaultValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
