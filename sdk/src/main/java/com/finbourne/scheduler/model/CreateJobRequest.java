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
import com.finbourne.scheduler.model.ArgumentDefinition;
import com.finbourne.scheduler.model.RequiredResources;
import com.finbourne.scheduler.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Definition of a job
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateJobRequest {
  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private ResourceId jobId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IMAGE_NAME = "imageName";
  @SerializedName(SERIALIZED_NAME_IMAGE_NAME)
  private String imageName;

  public static final String SERIALIZED_NAME_IMAGE_TAG = "imageTag";
  @SerializedName(SERIALIZED_NAME_IMAGE_TAG)
  private String imageTag;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Integer ttl;

  public static final String SERIALIZED_NAME_MIN_CPU = "minCpu";
  @SerializedName(SERIALIZED_NAME_MIN_CPU)
  private String minCpu;

  public static final String SERIALIZED_NAME_MAX_CPU = "maxCpu";
  @SerializedName(SERIALIZED_NAME_MAX_CPU)
  private String maxCpu;

  public static final String SERIALIZED_NAME_MIN_MEMORY = "minMemory";
  @SerializedName(SERIALIZED_NAME_MIN_MEMORY)
  private String minMemory;

  public static final String SERIALIZED_NAME_MAX_MEMORY = "maxMemory";
  @SerializedName(SERIALIZED_NAME_MAX_MEMORY)
  private String maxMemory;

  public static final String SERIALIZED_NAME_ARGUMENT_DEFINITIONS = "argumentDefinitions";
  @SerializedName(SERIALIZED_NAME_ARGUMENT_DEFINITIONS)
  private Map<String, ArgumentDefinition> argumentDefinitions = new HashMap<>();

  public static final String SERIALIZED_NAME_COMMAND_LINE_ARGUMENT_SEPARATOR = "commandLineArgumentSeparator";
  @SerializedName(SERIALIZED_NAME_COMMAND_LINE_ARGUMENT_SEPARATOR)
  private String commandLineArgumentSeparator;

  public static final String SERIALIZED_NAME_REQUIRED_RESOURCES = "requiredResources";
  @SerializedName(SERIALIZED_NAME_REQUIRED_RESOURCES)
  private RequiredResources requiredResources;

  public CreateJobRequest() {
  }

  public CreateJobRequest jobId(ResourceId jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getJobId() {
    return jobId;
  }


  public void setJobId(ResourceId jobId) {
    this.jobId = jobId;
  }


  public CreateJobRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the job
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateJobRequest author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * Author of the job
   * @return author
  **/
  @jakarta.annotation.Nullable
  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public CreateJobRequest dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Date when job was created. Defaults to now.
   * @return dateCreated
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public CreateJobRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of this job
   * @return description
  **/
  @jakarta.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateJobRequest imageName(String imageName) {
    
    this.imageName = imageName;
    return this;
  }

   /**
   * The name of the Docker image that contains this job
   * @return imageName
  **/
  @jakarta.annotation.Nonnull
  public String getImageName() {
    return imageName;
  }


  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public CreateJobRequest imageTag(String imageTag) {
    
    this.imageTag = imageTag;
    return this;
  }

   /**
   * The tag of the Docker image that contains this job
   * @return imageTag
  **/
  @jakarta.annotation.Nonnull
  public String getImageTag() {
    return imageTag;
  }


  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }


  public CreateJobRequest ttl(Integer ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Time To Live of the job run in seconds  Defaults to 5 minutes(300)
   * minimum: 0
   * maximum: 18000
   * @return ttl
  **/
  @jakarta.annotation.Nullable
  public Integer getTtl() {
    return ttl;
  }


  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }


  public CreateJobRequest minCpu(String minCpu) {
    
    this.minCpu = minCpu;
    return this;
  }

   /**
   * Specifies minimum number of CPUs to be allocated for the job  Default to 2
   * @return minCpu
  **/
  @jakarta.annotation.Nullable
  public String getMinCpu() {
    return minCpu;
  }


  public void setMinCpu(String minCpu) {
    this.minCpu = minCpu;
  }


  public CreateJobRequest maxCpu(String maxCpu) {
    
    this.maxCpu = maxCpu;
    return this;
  }

   /**
   * Specifies maximum number of CPUs to be allocated for the job
   * @return maxCpu
  **/
  @jakarta.annotation.Nullable
  public String getMaxCpu() {
    return maxCpu;
  }


  public void setMaxCpu(String maxCpu) {
    this.maxCpu = maxCpu;
  }


  public CreateJobRequest minMemory(String minMemory) {
    
    this.minMemory = minMemory;
    return this;
  }

   /**
   * Specifies the minimum amount of memory to be allocated for the job
   * @return minMemory
  **/
  @jakarta.annotation.Nullable
  public String getMinMemory() {
    return minMemory;
  }


  public void setMinMemory(String minMemory) {
    this.minMemory = minMemory;
  }


  public CreateJobRequest maxMemory(String maxMemory) {
    
    this.maxMemory = maxMemory;
    return this;
  }

   /**
   * Specifies the maximum amount of memory to be allocated for the job
   * @return maxMemory
  **/
  @jakarta.annotation.Nullable
  public String getMaxMemory() {
    return maxMemory;
  }


  public void setMaxMemory(String maxMemory) {
    this.maxMemory = maxMemory;
  }


  public CreateJobRequest argumentDefinitions(Map<String, ArgumentDefinition> argumentDefinitions) {
    
    this.argumentDefinitions = argumentDefinitions;
    return this;
  }

  public CreateJobRequest putArgumentDefinitionsItem(String key, ArgumentDefinition argumentDefinitionsItem) {
    if (this.argumentDefinitions == null) {
      this.argumentDefinitions = new HashMap<>();
    }
    this.argumentDefinitions.put(key, argumentDefinitionsItem);
    return this;
  }

   /**
   * All arguments for this job to run
   * @return argumentDefinitions
  **/
  @jakarta.annotation.Nonnull
  public Map<String, ArgumentDefinition> getArgumentDefinitions() {
    return argumentDefinitions;
  }


  public void setArgumentDefinitions(Map<String, ArgumentDefinition> argumentDefinitions) {
    this.argumentDefinitions = argumentDefinitions;
  }


  public CreateJobRequest commandLineArgumentSeparator(String commandLineArgumentSeparator) {
    
    this.commandLineArgumentSeparator = commandLineArgumentSeparator;
    return this;
  }

   /**
   * Value to separate command line arguments  e.g : If a job has a command line argument named &#39;folder&#39; and the runtime value is &#39;s3://path&#39; then this  would be supplied to the command as &#39;folder{separatorValue}s3://path&#39;  Default to a space
   * @return commandLineArgumentSeparator
  **/
  @jakarta.annotation.Nullable
  public String getCommandLineArgumentSeparator() {
    return commandLineArgumentSeparator;
  }


  public void setCommandLineArgumentSeparator(String commandLineArgumentSeparator) {
    this.commandLineArgumentSeparator = commandLineArgumentSeparator;
  }


  public CreateJobRequest requiredResources(RequiredResources requiredResources) {
    
    this.requiredResources = requiredResources;
    return this;
  }

   /**
   * Get requiredResources
   * @return requiredResources
  **/
  @jakarta.annotation.Nullable
  public RequiredResources getRequiredResources() {
    return requiredResources;
  }


  public void setRequiredResources(RequiredResources requiredResources) {
    this.requiredResources = requiredResources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateJobRequest createJobRequest = (CreateJobRequest) o;
    return Objects.equals(this.jobId, createJobRequest.jobId) &&
        Objects.equals(this.name, createJobRequest.name) &&
        Objects.equals(this.author, createJobRequest.author) &&
        Objects.equals(this.dateCreated, createJobRequest.dateCreated) &&
        Objects.equals(this.description, createJobRequest.description) &&
        Objects.equals(this.imageName, createJobRequest.imageName) &&
        Objects.equals(this.imageTag, createJobRequest.imageTag) &&
        Objects.equals(this.ttl, createJobRequest.ttl) &&
        Objects.equals(this.minCpu, createJobRequest.minCpu) &&
        Objects.equals(this.maxCpu, createJobRequest.maxCpu) &&
        Objects.equals(this.minMemory, createJobRequest.minMemory) &&
        Objects.equals(this.maxMemory, createJobRequest.maxMemory) &&
        Objects.equals(this.argumentDefinitions, createJobRequest.argumentDefinitions) &&
        Objects.equals(this.commandLineArgumentSeparator, createJobRequest.commandLineArgumentSeparator) &&
        Objects.equals(this.requiredResources, createJobRequest.requiredResources);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, name, author, dateCreated, description, imageName, imageTag, ttl, minCpu, maxCpu, minMemory, maxMemory, argumentDefinitions, commandLineArgumentSeparator, requiredResources);
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
    sb.append("class CreateJobRequest {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    minCpu: ").append(toIndentedString(minCpu)).append("\n");
    sb.append("    maxCpu: ").append(toIndentedString(maxCpu)).append("\n");
    sb.append("    minMemory: ").append(toIndentedString(minMemory)).append("\n");
    sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
    sb.append("    argumentDefinitions: ").append(toIndentedString(argumentDefinitions)).append("\n");
    sb.append("    commandLineArgumentSeparator: ").append(toIndentedString(commandLineArgumentSeparator)).append("\n");
    sb.append("    requiredResources: ").append(toIndentedString(requiredResources)).append("\n");
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
    openapiFields.add("jobId");
    openapiFields.add("name");
    openapiFields.add("author");
    openapiFields.add("dateCreated");
    openapiFields.add("description");
    openapiFields.add("imageName");
    openapiFields.add("imageTag");
    openapiFields.add("ttl");
    openapiFields.add("minCpu");
    openapiFields.add("maxCpu");
    openapiFields.add("minMemory");
    openapiFields.add("maxMemory");
    openapiFields.add("argumentDefinitions");
    openapiFields.add("commandLineArgumentSeparator");
    openapiFields.add("requiredResources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("jobId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("imageName");
    openapiRequiredFields.add("imageTag");
    openapiRequiredFields.add("argumentDefinitions");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateJobRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateJobRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateJobRequest is not found in the empty JSON string", CreateJobRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateJobRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `jobId`
      ResourceId.validateJsonElement(jsonObj.get("jobId"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) && !jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("imageName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageName").toString()));
      }
      if (!jsonObj.get("imageTag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageTag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageTag").toString()));
      }
      if ((jsonObj.get("minCpu") != null && !jsonObj.get("minCpu").isJsonNull()) && !jsonObj.get("minCpu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minCpu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minCpu").toString()));
      }
      if ((jsonObj.get("maxCpu") != null && !jsonObj.get("maxCpu").isJsonNull()) && !jsonObj.get("maxCpu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxCpu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxCpu").toString()));
      }
      if ((jsonObj.get("minMemory") != null && !jsonObj.get("minMemory").isJsonNull()) && !jsonObj.get("minMemory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minMemory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minMemory").toString()));
      }
      if ((jsonObj.get("maxMemory") != null && !jsonObj.get("maxMemory").isJsonNull()) && !jsonObj.get("maxMemory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxMemory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxMemory").toString()));
      }
      if ((jsonObj.get("commandLineArgumentSeparator") != null && !jsonObj.get("commandLineArgumentSeparator").isJsonNull()) && !jsonObj.get("commandLineArgumentSeparator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commandLineArgumentSeparator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commandLineArgumentSeparator").toString()));
      }
      // validate the optional field `requiredResources`
      if (jsonObj.get("requiredResources") != null && !jsonObj.get("requiredResources").isJsonNull()) {
        RequiredResources.validateJsonElement(jsonObj.get("requiredResources"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateJobRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateJobRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateJobRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateJobRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateJobRequest>() {
           @Override
           public void write(JsonWriter out, CreateJobRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateJobRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateJobRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateJobRequest
  * @throws IOException if the JSON string is invalid with respect to CreateJobRequest
  */
  public static CreateJobRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateJobRequest.class);
  }

 /**
  * Convert an instance of CreateJobRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
