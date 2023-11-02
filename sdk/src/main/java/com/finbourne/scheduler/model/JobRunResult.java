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
import com.finbourne.scheduler.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
 * Represent a specific job&#39;s run
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobRunResult {
  public static final String SERIALIZED_NAME_CONSOLE_OUTPUT_URL = "consoleOutputUrl";
  @SerializedName(SERIALIZED_NAME_CONSOLE_OUTPUT_URL)
  private String consoleOutputUrl;

  public static final String SERIALIZED_NAME_RUN_ID = "runId";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private String runId;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private ResourceId jobId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INITIALISED_DATE = "initialisedDate";
  @SerializedName(SERIALIZED_NAME_INITIALISED_DATE)
  private OffsetDateTime initialisedDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Map<String, String> arguments;

  public static final String SERIALIZED_NAME_ENVIRONMENT_VARIABLES = "environmentVariables";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_VARIABLES)
  private Map<String, String> environmentVariables;

  public static final String SERIALIZED_NAME_JOB_STATUS = "jobStatus";
  @SerializedName(SERIALIZED_NAME_JOB_STATUS)
  private String jobStatus;

  public static final String SERIALIZED_NAME_JOB_RESULT = "jobResult";
  @SerializedName(SERIALIZED_NAME_JOB_RESULT)
  private String jobResult;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEDULE_ID = "scheduleId";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_ID)
  private ResourceId scheduleId;

  public static final String SERIALIZED_NAME_RESULT_URL = "resultUrl";
  @SerializedName(SERIALIZED_NAME_RESULT_URL)
  private URI resultUrl;

  public static final String SERIALIZED_NAME_MANUALLY_TRIGGERED_BY = "manuallyTriggeredBy";
  @SerializedName(SERIALIZED_NAME_MANUALLY_TRIGGERED_BY)
  private String manuallyTriggeredBy;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public JobRunResult() {
  }

  
  public JobRunResult(
     String jobResult
  ) {
    this();
    this.jobResult = jobResult;
  }

  public JobRunResult consoleOutputUrl(String consoleOutputUrl) {
    
    this.consoleOutputUrl = consoleOutputUrl;
    return this;
  }

   /**
   * The URL for the console output of the job run
   * @return consoleOutputUrl
  **/
  @jakarta.annotation.Nullable
  public String getConsoleOutputUrl() {
    return consoleOutputUrl;
  }


  public void setConsoleOutputUrl(String consoleOutputUrl) {
    this.consoleOutputUrl = consoleOutputUrl;
  }


  public JobRunResult runId(String runId) {
    
    this.runId = runId;
    return this;
  }

   /**
   * Unique id of the job run
   * @return runId
  **/
  @jakarta.annotation.Nullable
  public String getRunId() {
    return runId;
  }


  public void setRunId(String runId) {
    this.runId = runId;
  }


  public JobRunResult jobId(ResourceId jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @jakarta.annotation.Nullable
  public ResourceId getJobId() {
    return jobId;
  }


  public void setJobId(ResourceId jobId) {
    this.jobId = jobId;
  }


  public JobRunResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the job
   * @return name
  **/
  @jakarta.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JobRunResult initialisedDate(OffsetDateTime initialisedDate) {
    
    this.initialisedDate = initialisedDate;
    return this;
  }

   /**
   * The date when the job was initialised
   * @return initialisedDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getInitialisedDate() {
    return initialisedDate;
  }


  public void setInitialisedDate(OffsetDateTime initialisedDate) {
    this.initialisedDate = initialisedDate;
  }


  public JobRunResult startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The date when the job started running in Scheduler
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public JobRunResult endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the job  Defaults to null if the job has not started or not completed yet  If value is null and job has not started, status will be &#x60;Pending&#x60;  If value is null and job has not completed, but is running, status will be &#x60;Running&#x60;
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public JobRunResult arguments(Map<String, String> arguments) {
    
    this.arguments = arguments;
    return this;
  }

  public JobRunResult putArgumentsItem(String key, String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new HashMap<>();
    }
    this.arguments.put(key, argumentsItem);
    return this;
  }

   /**
   * All arguments used in in this job run
   * @return arguments
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getArguments() {
    return arguments;
  }


  public void setArguments(Map<String, String> arguments) {
    this.arguments = arguments;
  }


  public JobRunResult environmentVariables(Map<String, String> environmentVariables) {
    
    this.environmentVariables = environmentVariables;
    return this;
  }

  public JobRunResult putEnvironmentVariablesItem(String key, String environmentVariablesItem) {
    if (this.environmentVariables == null) {
      this.environmentVariables = new HashMap<>();
    }
    this.environmentVariables.put(key, environmentVariablesItem);
    return this;
  }

   /**
   * All environment variables used in this job run
   * @return environmentVariables
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getEnvironmentVariables() {
    return environmentVariables;
  }


  public void setEnvironmentVariables(Map<String, String> environmentVariables) {
    this.environmentVariables = environmentVariables;
  }


  public JobRunResult jobStatus(String jobStatus) {
    
    this.jobStatus = jobStatus;
    return this;
  }

   /**
   * Current job status
   * @return jobStatus
  **/
  @jakarta.annotation.Nullable
  public String getJobStatus() {
    return jobStatus;
  }


  public void setJobStatus(String jobStatus) {
    this.jobStatus = jobStatus;
  }


   /**
   * Description of the job result
   * @return jobResult
  **/
  @jakarta.annotation.Nullable
  public String getJobResult() {
    return jobResult;
  }




  public JobRunResult description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the job
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public JobRunResult scheduleId(ResourceId scheduleId) {
    
    this.scheduleId = scheduleId;
    return this;
  }

   /**
   * Get scheduleId
   * @return scheduleId
  **/
  @jakarta.annotation.Nullable
  public ResourceId getScheduleId() {
    return scheduleId;
  }


  public void setScheduleId(ResourceId scheduleId) {
    this.scheduleId = scheduleId;
  }


  public JobRunResult resultUrl(URI resultUrl) {
    
    this.resultUrl = resultUrl;
    return this;
  }

   /**
   * URI to results. Defaults to null if not available
   * @return resultUrl
  **/
  @jakarta.annotation.Nullable
  public URI getResultUrl() {
    return resultUrl;
  }


  public void setResultUrl(URI resultUrl) {
    this.resultUrl = resultUrl;
  }


  public JobRunResult manuallyTriggeredBy(String manuallyTriggeredBy) {
    
    this.manuallyTriggeredBy = manuallyTriggeredBy;
    return this;
  }

   /**
   * UserId of the user that triggered the job.  Defaults to null if job was ran on a Schedule
   * @return manuallyTriggeredBy
  **/
  @jakarta.annotation.Nullable
  public String getManuallyTriggeredBy() {
    return manuallyTriggeredBy;
  }


  public void setManuallyTriggeredBy(String manuallyTriggeredBy) {
    this.manuallyTriggeredBy = manuallyTriggeredBy;
  }


  public JobRunResult message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Output message generated by the job runner  Value will be null when the job is in a &#x60;Running&#x60; or &#x60;Pending&#x60; status
   * @return message
  **/
  @jakarta.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobRunResult jobRunResult = (JobRunResult) o;
    return Objects.equals(this.consoleOutputUrl, jobRunResult.consoleOutputUrl) &&
        Objects.equals(this.runId, jobRunResult.runId) &&
        Objects.equals(this.jobId, jobRunResult.jobId) &&
        Objects.equals(this.name, jobRunResult.name) &&
        Objects.equals(this.initialisedDate, jobRunResult.initialisedDate) &&
        Objects.equals(this.startDate, jobRunResult.startDate) &&
        Objects.equals(this.endDate, jobRunResult.endDate) &&
        Objects.equals(this.arguments, jobRunResult.arguments) &&
        Objects.equals(this.environmentVariables, jobRunResult.environmentVariables) &&
        Objects.equals(this.jobStatus, jobRunResult.jobStatus) &&
        Objects.equals(this.jobResult, jobRunResult.jobResult) &&
        Objects.equals(this.description, jobRunResult.description) &&
        Objects.equals(this.scheduleId, jobRunResult.scheduleId) &&
        Objects.equals(this.resultUrl, jobRunResult.resultUrl) &&
        Objects.equals(this.manuallyTriggeredBy, jobRunResult.manuallyTriggeredBy) &&
        Objects.equals(this.message, jobRunResult.message);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(consoleOutputUrl, runId, jobId, name, initialisedDate, startDate, endDate, arguments, environmentVariables, jobStatus, jobResult, description, scheduleId, resultUrl, manuallyTriggeredBy, message);
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
    sb.append("class JobRunResult {\n");
    sb.append("    consoleOutputUrl: ").append(toIndentedString(consoleOutputUrl)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    initialisedDate: ").append(toIndentedString(initialisedDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    environmentVariables: ").append(toIndentedString(environmentVariables)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    resultUrl: ").append(toIndentedString(resultUrl)).append("\n");
    sb.append("    manuallyTriggeredBy: ").append(toIndentedString(manuallyTriggeredBy)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("consoleOutputUrl");
    openapiFields.add("runId");
    openapiFields.add("jobId");
    openapiFields.add("name");
    openapiFields.add("initialisedDate");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("arguments");
    openapiFields.add("environmentVariables");
    openapiFields.add("jobStatus");
    openapiFields.add("jobResult");
    openapiFields.add("description");
    openapiFields.add("scheduleId");
    openapiFields.add("resultUrl");
    openapiFields.add("manuallyTriggeredBy");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to JobRunResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JobRunResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobRunResult is not found in the empty JSON string", JobRunResult.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("consoleOutputUrl") != null && !jsonObj.get("consoleOutputUrl").isJsonNull()) && !jsonObj.get("consoleOutputUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consoleOutputUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consoleOutputUrl").toString()));
      }
      if ((jsonObj.get("runId") != null && !jsonObj.get("runId").isJsonNull()) && !jsonObj.get("runId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runId").toString()));
      }
      // validate the optional field `jobId`
      if (jsonObj.get("jobId") != null && !jsonObj.get("jobId").isJsonNull()) {
        ResourceId.validateJsonElement(jsonObj.get("jobId"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("jobStatus") != null && !jsonObj.get("jobStatus").isJsonNull()) && !jsonObj.get("jobStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobStatus").toString()));
      }
      if ((jsonObj.get("jobResult") != null && !jsonObj.get("jobResult").isJsonNull()) && !jsonObj.get("jobResult").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobResult` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobResult").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `scheduleId`
      if (jsonObj.get("scheduleId") != null && !jsonObj.get("scheduleId").isJsonNull()) {
        ResourceId.validateJsonElement(jsonObj.get("scheduleId"));
      }
      if ((jsonObj.get("resultUrl") != null && !jsonObj.get("resultUrl").isJsonNull()) && !jsonObj.get("resultUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultUrl").toString()));
      }
      if ((jsonObj.get("manuallyTriggeredBy") != null && !jsonObj.get("manuallyTriggeredBy").isJsonNull()) && !jsonObj.get("manuallyTriggeredBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manuallyTriggeredBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manuallyTriggeredBy").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobRunResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobRunResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobRunResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobRunResult.class));

       return (TypeAdapter<T>) new TypeAdapter<JobRunResult>() {
           @Override
           public void write(JsonWriter out, JobRunResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobRunResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobRunResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobRunResult
  * @throws IOException if the JSON string is invalid with respect to JobRunResult
  */
  public static JobRunResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobRunResult.class);
  }

 /**
  * Convert an instance of JobRunResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
