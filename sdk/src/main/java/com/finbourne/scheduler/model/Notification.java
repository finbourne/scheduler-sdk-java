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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Notification type
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Notification {
  public static final String SERIALIZED_NAME_FIRE_ON = "fireOn";
  @SerializedName(SERIALIZED_NAME_FIRE_ON)
  private String fireOn;

  public static final String SERIALIZED_NAME_TRANSPORT = "transport";
  @SerializedName(SERIALIZED_NAME_TRANSPORT)
  private String transport;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private List<String> destination;

  public Notification() {
  }

  
  public Notification(
     String fireOn
  ) {
    this();
    this.fireOn = fireOn;
  }

   /**
   * Condition for the notification
   * @return fireOn
  **/
  @jakarta.annotation.Nullable
  public String getFireOn() {
    return fireOn;
  }




  public Notification transport(String transport) {
    
    this.transport = transport;
    return this;
  }

   /**
   * The type of the notification
   * @return transport
  **/
  @jakarta.annotation.Nullable
  public String getTransport() {
    return transport;
  }


  public void setTransport(String transport) {
    this.transport = transport;
  }


  public Notification destination(List<String> destination) {
    
    this.destination = destination;
    return this;
  }

  public Notification addDestinationItem(String destinationItem) {
    if (this.destination == null) {
      this.destination = new ArrayList<>();
    }
    this.destination.add(destinationItem);
    return this;
  }

   /**
   * Where the notification should be sent
   * @return destination
  **/
  @jakarta.annotation.Nullable
  public List<String> getDestination() {
    return destination;
  }


  public void setDestination(List<String> destination) {
    this.destination = destination;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.fireOn, notification.fireOn) &&
        Objects.equals(this.transport, notification.transport) &&
        Objects.equals(this.destination, notification.destination);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fireOn, transport, destination);
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
    sb.append("class Notification {\n");
    sb.append("    fireOn: ").append(toIndentedString(fireOn)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
    openapiFields.add("fireOn");
    openapiFields.add("transport");
    openapiFields.add("destination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Notification
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Notification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Notification is not found in the empty JSON string", Notification.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fireOn") != null && !jsonObj.get("fireOn").isJsonNull()) && !jsonObj.get("fireOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fireOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fireOn").toString()));
      }
      if ((jsonObj.get("transport") != null && !jsonObj.get("transport").isJsonNull()) && !jsonObj.get("transport").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transport` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transport").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull() && !jsonObj.get("destination").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination` to be an array in the JSON string but got `%s`", jsonObj.get("destination").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Notification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Notification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Notification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Notification.class));

       return (TypeAdapter<T>) new TypeAdapter<Notification>() {
           @Override
           public void write(JsonWriter out, Notification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Notification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Notification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notification
  * @throws IOException if the JSON string is invalid with respect to Notification
  */
  public static Notification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notification.class);
  }

 /**
  * Convert an instance of Notification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
