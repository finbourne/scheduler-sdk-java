/*
 * FINBOURNE Scheduler API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.scheduler.model;

import java.util.Objects;
import com.finbourne.scheduler.model.ScanSummary;
import com.finbourne.scheduler.model.Vulnerability;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.scheduler.JSON;

/**
 * Represents the details of a security scan of an image
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScanReport {
  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_SCAN_DURATION = "scanDuration";
  @SerializedName(SERIALIZED_NAME_SCAN_DURATION)
  private Integer scanDuration;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private ScanSummary summary;

  public static final String SERIALIZED_NAME_VULNERABILITIES = "vulnerabilities";
  @SerializedName(SERIALIZED_NAME_VULNERABILITIES)
  private List<Vulnerability> vulnerabilities;

  public ScanReport() {
  }

  public ScanReport severity(String severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * The overall severity. For example : \&quot;High\&quot; or \&quot;None\&quot;
   * @return severity
  **/
  @jakarta.annotation.Nullable
  public String getSeverity() {
    return severity;
  }


  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public ScanReport status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the report
   * @return status
  **/
  @jakarta.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ScanReport startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time of the scanning process
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public ScanReport endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * The end time of the scanning process
   * @return endTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public ScanReport scanDuration(Integer scanDuration) {
    
    this.scanDuration = scanDuration;
    return this;
  }

   /**
   * The duration of the scan in seconds
   * @return scanDuration
  **/
  @jakarta.annotation.Nullable
  public Integer getScanDuration() {
    return scanDuration;
  }


  public void setScanDuration(Integer scanDuration) {
    this.scanDuration = scanDuration;
  }


  public ScanReport summary(ScanSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @jakarta.annotation.Nullable
  public ScanSummary getSummary() {
    return summary;
  }


  public void setSummary(ScanSummary summary) {
    this.summary = summary;
  }


  public ScanReport vulnerabilities(List<Vulnerability> vulnerabilities) {
    
    this.vulnerabilities = vulnerabilities;
    return this;
  }

  public ScanReport addVulnerabilitiesItem(Vulnerability vulnerabilitiesItem) {
    if (this.vulnerabilities == null) {
      this.vulnerabilities = new ArrayList<>();
    }
    this.vulnerabilities.add(vulnerabilitiesItem);
    return this;
  }

   /**
   * List of Finbourne.Scheduler.WebApi.Dtos.Images.Vulnerability
   * @return vulnerabilities
  **/
  @jakarta.annotation.Nullable
  public List<Vulnerability> getVulnerabilities() {
    return vulnerabilities;
  }


  public void setVulnerabilities(List<Vulnerability> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScanReport scanReport = (ScanReport) o;
    return Objects.equals(this.severity, scanReport.severity) &&
        Objects.equals(this.status, scanReport.status) &&
        Objects.equals(this.startTime, scanReport.startTime) &&
        Objects.equals(this.endTime, scanReport.endTime) &&
        Objects.equals(this.scanDuration, scanReport.scanDuration) &&
        Objects.equals(this.summary, scanReport.summary) &&
        Objects.equals(this.vulnerabilities, scanReport.vulnerabilities);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, status, startTime, endTime, scanDuration, summary, vulnerabilities);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanReport {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    scanDuration: ").append(toIndentedString(scanDuration)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("severity");
    openapiFields.add("status");
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("scanDuration");
    openapiFields.add("summary");
    openapiFields.add("vulnerabilities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ScanReport
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScanReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScanReport is not found in the empty JSON string", ScanReport.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `summary`
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        ScanSummary.validateJsonElement(jsonObj.get("summary"));
      }
      if (jsonObj.get("vulnerabilities") != null && !jsonObj.get("vulnerabilities").isJsonNull()) {
        JsonArray jsonArrayvulnerabilities = jsonObj.getAsJsonArray("vulnerabilities");
        if (jsonArrayvulnerabilities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vulnerabilities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vulnerabilities` to be an array in the JSON string but got `%s`", jsonObj.get("vulnerabilities").toString()));
          }

          // validate the optional field `vulnerabilities` (array)
          for (int i = 0; i < jsonArrayvulnerabilities.size(); i++) {
            Vulnerability.validateJsonElement(jsonArrayvulnerabilities.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScanReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScanReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScanReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScanReport.class));

       return (TypeAdapter<T>) new TypeAdapter<ScanReport>() {
           @Override
           public void write(JsonWriter out, ScanReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScanReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScanReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScanReport
  * @throws IOException if the JSON string is invalid with respect to ScanReport
  */
  public static ScanReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScanReport.class);
  }

 /**
  * Convert an instance of ScanReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
