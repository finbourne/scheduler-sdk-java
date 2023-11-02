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
import java.util.Arrays;
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
 * Job argument definition
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArgumentDefinition {
  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_CONSTRAINTS = "constraints";
  @SerializedName(SERIALIZED_NAME_CONSTRAINTS)
  private String constraints;

  public static final String SERIALIZED_NAME_PASSED_AS = "passedAs";
  @SerializedName(SERIALIZED_NAME_PASSED_AS)
  private String passedAs;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public ArgumentDefinition() {
  }

  public ArgumentDefinition dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Data type of the argument
   * @return dataType
  **/
  @jakarta.annotation.Nonnull
  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public ArgumentDefinition required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Optionality of the argument
   * @return required
  **/
  @jakarta.annotation.Nullable
  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public ArgumentDefinition description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Argument description
   * @return description
  **/
  @jakarta.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ArgumentDefinition order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * The order of the argument
   * @return order
  **/
  @jakarta.annotation.Nonnull
  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public ArgumentDefinition constraints(String constraints) {
    
    this.constraints = constraints;
    return this;
  }

   /**
   * Constrains of the argument value
   * @return constraints
  **/
  @jakarta.annotation.Nullable
  public String getConstraints() {
    return constraints;
  }


  public void setConstraints(String constraints) {
    this.constraints = constraints;
  }


  public ArgumentDefinition passedAs(String passedAs) {
    
    this.passedAs = passedAs;
    return this;
  }

   /**
   * Specifies how this argument should be passed in  Allowed values are: CommandLine or EnvironmentVariable    Defaults to: CommandLine
   * @return passedAs
  **/
  @jakarta.annotation.Nonnull
  public String getPassedAs() {
    return passedAs;
  }


  public void setPassedAs(String passedAs) {
    this.passedAs = passedAs;
  }


  public ArgumentDefinition defaultValue(String defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Specify a default value for this argument if no value is provided  The value needs to be convertible to the associated data type
   * @return defaultValue
  **/
  @jakarta.annotation.Nullable
  public String getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArgumentDefinition argumentDefinition = (ArgumentDefinition) o;
    return Objects.equals(this.dataType, argumentDefinition.dataType) &&
        Objects.equals(this.required, argumentDefinition.required) &&
        Objects.equals(this.description, argumentDefinition.description) &&
        Objects.equals(this.order, argumentDefinition.order) &&
        Objects.equals(this.constraints, argumentDefinition.constraints) &&
        Objects.equals(this.passedAs, argumentDefinition.passedAs) &&
        Objects.equals(this.defaultValue, argumentDefinition.defaultValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, required, description, order, constraints, passedAs, defaultValue);
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
    sb.append("class ArgumentDefinition {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    passedAs: ").append(toIndentedString(passedAs)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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
    openapiFields.add("dataType");
    openapiFields.add("required");
    openapiFields.add("description");
    openapiFields.add("order");
    openapiFields.add("constraints");
    openapiFields.add("passedAs");
    openapiFields.add("defaultValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dataType");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("order");
    openapiRequiredFields.add("passedAs");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ArgumentDefinition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ArgumentDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArgumentDefinition is not found in the empty JSON string", ArgumentDefinition.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ArgumentDefinition.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("constraints") != null && !jsonObj.get("constraints").isJsonNull()) && !jsonObj.get("constraints").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `constraints` to be a primitive type in the JSON string but got `%s`", jsonObj.get("constraints").toString()));
      }
      if (!jsonObj.get("passedAs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passedAs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passedAs").toString()));
      }
      if ((jsonObj.get("defaultValue") != null && !jsonObj.get("defaultValue").isJsonNull()) && !jsonObj.get("defaultValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArgumentDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArgumentDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArgumentDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArgumentDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<ArgumentDefinition>() {
           @Override
           public void write(JsonWriter out, ArgumentDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ArgumentDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ArgumentDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArgumentDefinition
  * @throws IOException if the JSON string is invalid with respect to ArgumentDefinition
  */
  public static ArgumentDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArgumentDefinition.class);
  }

 /**
  * Convert an instance of ArgumentDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
