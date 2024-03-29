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
import com.finbourne.scheduler.model.Notification;
import com.finbourne.scheduler.model.ResourceId;
import com.finbourne.scheduler.model.Trigger;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * Create a schedule definition
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateScheduleRequest {
  public static final String SERIALIZED_NAME_SCHEDULE_ID = "scheduleId";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_ID)
  private ResourceId scheduleId;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private ResourceId jobId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Map<String, String> arguments;

  public static final String SERIALIZED_NAME_TRIGGER = "trigger";
  @SerializedName(SERIALIZED_NAME_TRIGGER)
  private Trigger trigger;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<Notification> notifications;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_USE_AS_AUTH = "useAsAuth";
  @SerializedName(SERIALIZED_NAME_USE_AS_AUTH)
  private String useAsAuth;

  public CreateScheduleRequest() {
  }

  public CreateScheduleRequest scheduleId(ResourceId scheduleId) {
    
    this.scheduleId = scheduleId;
    return this;
  }

   /**
   * Get scheduleId
   * @return scheduleId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getScheduleId() {
    return scheduleId;
  }


  public void setScheduleId(ResourceId scheduleId) {
    this.scheduleId = scheduleId;
  }


  public CreateScheduleRequest jobId(ResourceId jobId) {
    
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


  public CreateScheduleRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A display name for this Schedule
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateScheduleRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the Schedule
   * @return description
  **/
  @jakarta.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateScheduleRequest author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * Name of the author of this schedule
   * @return author
  **/
  @jakarta.annotation.Nullable
  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public CreateScheduleRequest owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Name of owner of this schedule
   * @return owner
  **/
  @jakarta.annotation.Nullable
  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public CreateScheduleRequest arguments(Map<String, String> arguments) {
    
    this.arguments = arguments;
    return this;
  }

  public CreateScheduleRequest putArgumentsItem(String key, String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new HashMap<>();
    }
    this.arguments.put(key, argumentsItem);
    return this;
  }

   /**
   * All arguments specified by this Schedule that will be passed in to the Job
   * @return arguments
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getArguments() {
    return arguments;
  }


  public void setArguments(Map<String, String> arguments) {
    this.arguments = arguments;
  }


  public CreateScheduleRequest trigger(Trigger trigger) {
    
    this.trigger = trigger;
    return this;
  }

   /**
   * Get trigger
   * @return trigger
  **/
  @jakarta.annotation.Nullable
  public Trigger getTrigger() {
    return trigger;
  }


  public void setTrigger(Trigger trigger) {
    this.trigger = trigger;
  }


  public CreateScheduleRequest notifications(List<Notification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public CreateScheduleRequest addNotificationsItem(Notification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Notifications for this Schedule
   * @return notifications
  **/
  @jakarta.annotation.Nullable
  public List<Notification> getNotifications() {
    return notifications;
  }


  public void setNotifications(List<Notification> notifications) {
    this.notifications = notifications;
  }


  public CreateScheduleRequest enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Specify whether schedule is enabled or not  Defaults to true
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CreateScheduleRequest useAsAuth(String useAsAuth) {
    
    this.useAsAuth = useAsAuth;
    return this;
  }

   /**
   * Id of user associated with schedule. All calls to FINBOURNE services  as part of execution of this schedule will be authenticated as this   user. Can be null, in which case we&#39;ll default to that of the user   making this request
   * @return useAsAuth
  **/
  @jakarta.annotation.Nullable
  public String getUseAsAuth() {
    return useAsAuth;
  }


  public void setUseAsAuth(String useAsAuth) {
    this.useAsAuth = useAsAuth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateScheduleRequest createScheduleRequest = (CreateScheduleRequest) o;
    return Objects.equals(this.scheduleId, createScheduleRequest.scheduleId) &&
        Objects.equals(this.jobId, createScheduleRequest.jobId) &&
        Objects.equals(this.name, createScheduleRequest.name) &&
        Objects.equals(this.description, createScheduleRequest.description) &&
        Objects.equals(this.author, createScheduleRequest.author) &&
        Objects.equals(this.owner, createScheduleRequest.owner) &&
        Objects.equals(this.arguments, createScheduleRequest.arguments) &&
        Objects.equals(this.trigger, createScheduleRequest.trigger) &&
        Objects.equals(this.notifications, createScheduleRequest.notifications) &&
        Objects.equals(this.enabled, createScheduleRequest.enabled) &&
        Objects.equals(this.useAsAuth, createScheduleRequest.useAsAuth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId, jobId, name, description, author, owner, arguments, trigger, notifications, enabled, useAsAuth);
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
    sb.append("class CreateScheduleRequest {\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    useAsAuth: ").append(toIndentedString(useAsAuth)).append("\n");
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
    openapiFields.add("scheduleId");
    openapiFields.add("jobId");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("author");
    openapiFields.add("owner");
    openapiFields.add("arguments");
    openapiFields.add("trigger");
    openapiFields.add("notifications");
    openapiFields.add("enabled");
    openapiFields.add("useAsAuth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scheduleId");
    openapiRequiredFields.add("jobId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateScheduleRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateScheduleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateScheduleRequest is not found in the empty JSON string", CreateScheduleRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateScheduleRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `scheduleId`
      ResourceId.validateJsonElement(jsonObj.get("scheduleId"));
      // validate the required field `jobId`
      ResourceId.validateJsonElement(jsonObj.get("jobId"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) && !jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      // validate the optional field `trigger`
      if (jsonObj.get("trigger") != null && !jsonObj.get("trigger").isJsonNull()) {
        Trigger.validateJsonElement(jsonObj.get("trigger"));
      }
      if (jsonObj.get("notifications") != null && !jsonObj.get("notifications").isJsonNull()) {
        JsonArray jsonArraynotifications = jsonObj.getAsJsonArray("notifications");
        if (jsonArraynotifications != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notifications").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notifications` to be an array in the JSON string but got `%s`", jsonObj.get("notifications").toString()));
          }

          // validate the optional field `notifications` (array)
          for (int i = 0; i < jsonArraynotifications.size(); i++) {
            Notification.validateJsonElement(jsonArraynotifications.get(i));
          };
        }
      }
      if ((jsonObj.get("useAsAuth") != null && !jsonObj.get("useAsAuth").isJsonNull()) && !jsonObj.get("useAsAuth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `useAsAuth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("useAsAuth").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateScheduleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateScheduleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateScheduleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateScheduleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateScheduleRequest>() {
           @Override
           public void write(JsonWriter out, CreateScheduleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateScheduleRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateScheduleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateScheduleRequest
  * @throws IOException if the JSON string is invalid with respect to CreateScheduleRequest
  */
  public static CreateScheduleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateScheduleRequest.class);
  }

 /**
  * Convert an instance of CreateScheduleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
