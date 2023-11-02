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
 * LusidValidationProblemDetails
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LusidValidationProblemDetails {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "errorDetails";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private List<Map<String, String>> errorDetails;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Map<String, List<String>> errors;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public LusidValidationProblemDetails() {
  }

  public LusidValidationProblemDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LusidValidationProblemDetails errorDetails(List<Map<String, String>> errorDetails) {
    
    this.errorDetails = errorDetails;
    return this;
  }

  public LusidValidationProblemDetails addErrorDetailsItem(Map<String, String> errorDetailsItem) {
    if (this.errorDetails == null) {
      this.errorDetails = new ArrayList<>();
    }
    this.errorDetails.add(errorDetailsItem);
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @jakarta.annotation.Nullable
  public List<Map<String, String>> getErrorDetails() {
    return errorDetails;
  }


  public void setErrorDetails(List<Map<String, String>> errorDetails) {
    this.errorDetails = errorDetails;
  }


  public LusidValidationProblemDetails code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @jakarta.annotation.Nonnull
  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public LusidValidationProblemDetails errors(Map<String, List<String>> errors) {
    
    this.errors = errors;
    return this;
  }

  public LusidValidationProblemDetails putErrorsItem(String key, List<String> errorsItem) {
    if (this.errors == null) {
      this.errors = new HashMap<>();
    }
    this.errors.put(key, errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nullable
  public Map<String, List<String>> getErrors() {
    return errors;
  }


  public void setErrors(Map<String, List<String>> errors) {
    this.errors = errors;
  }


  public LusidValidationProblemDetails type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public LusidValidationProblemDetails title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public LusidValidationProblemDetails status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public LusidValidationProblemDetails detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @jakarta.annotation.Nullable
  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public LusidValidationProblemDetails instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * Get instance
   * @return instance
  **/
  @jakarta.annotation.Nullable
  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LusidValidationProblemDetails lusidValidationProblemDetails = (LusidValidationProblemDetails) o;
    return Objects.equals(this.name, lusidValidationProblemDetails.name) &&
        Objects.equals(this.errorDetails, lusidValidationProblemDetails.errorDetails) &&
        Objects.equals(this.code, lusidValidationProblemDetails.code) &&
        Objects.equals(this.errors, lusidValidationProblemDetails.errors) &&
        Objects.equals(this.type, lusidValidationProblemDetails.type) &&
        Objects.equals(this.title, lusidValidationProblemDetails.title) &&
        Objects.equals(this.status, lusidValidationProblemDetails.status) &&
        Objects.equals(this.detail, lusidValidationProblemDetails.detail) &&
        Objects.equals(this.instance, lusidValidationProblemDetails.instance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, errorDetails, code, errors, type, title, status, detail, instance);
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
    sb.append("class LusidValidationProblemDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("errorDetails");
    openapiFields.add("code");
    openapiFields.add("errors");
    openapiFields.add("type");
    openapiFields.add("title");
    openapiFields.add("status");
    openapiFields.add("detail");
    openapiFields.add("instance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("code");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LusidValidationProblemDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LusidValidationProblemDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LusidValidationProblemDetails is not found in the empty JSON string", LusidValidationProblemDetails.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LusidValidationProblemDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("errorDetails") != null && !jsonObj.get("errorDetails").isJsonNull() && !jsonObj.get("errorDetails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDetails` to be an array in the JSON string but got `%s`", jsonObj.get("errorDetails").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonNull()) && !jsonObj.get("detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail").toString()));
      }
      if ((jsonObj.get("instance") != null && !jsonObj.get("instance").isJsonNull()) && !jsonObj.get("instance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LusidValidationProblemDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LusidValidationProblemDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LusidValidationProblemDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LusidValidationProblemDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<LusidValidationProblemDetails>() {
           @Override
           public void write(JsonWriter out, LusidValidationProblemDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LusidValidationProblemDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LusidValidationProblemDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LusidValidationProblemDetails
  * @throws IOException if the JSON string is invalid with respect to LusidValidationProblemDetails
  */
  public static LusidValidationProblemDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LusidValidationProblemDetails.class);
  }

 /**
  * Convert an instance of LusidValidationProblemDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
