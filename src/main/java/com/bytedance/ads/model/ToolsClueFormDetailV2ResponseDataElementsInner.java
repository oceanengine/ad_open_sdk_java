/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsClueFormDetailV2DataElementsAllowEmpty;
import com.bytedance.ads.model.ToolsClueFormDetailV2DataElementsIsUnique;
import com.bytedance.ads.model.ToolsClueFormDetailV2DataElementsType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.bytedance.ads.JSON;

/**
 * ToolsClueFormDetailV2ResponseDataElementsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsClueFormDetailV2ResponseDataElementsInner {
  public static final String SERIALIZED_NAME_ALLOW_EMPTY = "allow_empty";
  @SerializedName(SERIALIZED_NAME_ALLOW_EMPTY)
  private ToolsClueFormDetailV2DataElementsAllowEmpty allowEmpty = null;

  public static final String SERIALIZED_NAME_ELEMENT_ID = "element_id";
  @SerializedName(SERIALIZED_NAME_ELEMENT_ID)
  private Long elementId = null;

  public static final String SERIALIZED_NAME_IS_UNIQUE = "is_unique";
  @SerializedName(SERIALIZED_NAME_IS_UNIQUE)
  private ToolsClueFormDetailV2DataElementsIsUnique isUnique = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ToolsClueFormDetailV2DataElementsType type = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public ToolsClueFormDetailV2ResponseDataElementsInner() {
  }

  public ToolsClueFormDetailV2ResponseDataElementsInner allowEmpty(ToolsClueFormDetailV2DataElementsAllowEmpty allowEmpty) {
    
    this.allowEmpty = allowEmpty;
    return this;
  }

   /**
   * Get allowEmpty
   * @return allowEmpty
  **/
  @javax.annotation.Nullable
  public ToolsClueFormDetailV2DataElementsAllowEmpty getAllowEmpty() {
    return allowEmpty;
  }


  public void setAllowEmpty(ToolsClueFormDetailV2DataElementsAllowEmpty allowEmpty) {
    this.allowEmpty = allowEmpty;
  }


  public ToolsClueFormDetailV2ResponseDataElementsInner elementId(Long elementId) {
    
    this.elementId = elementId;
    return this;
  }

   /**
   * 
   * @return elementId
  **/
  @javax.annotation.Nullable
  public Long getElementId() {
    return elementId;
  }


  public void setElementId(Long elementId) {
    this.elementId = elementId;
  }


  public ToolsClueFormDetailV2ResponseDataElementsInner isUnique(ToolsClueFormDetailV2DataElementsIsUnique isUnique) {
    
    this.isUnique = isUnique;
    return this;
  }

   /**
   * Get isUnique
   * @return isUnique
  **/
  @javax.annotation.Nullable
  public ToolsClueFormDetailV2DataElementsIsUnique getIsUnique() {
    return isUnique;
  }


  public void setIsUnique(ToolsClueFormDetailV2DataElementsIsUnique isUnique) {
    this.isUnique = isUnique;
  }


  public ToolsClueFormDetailV2ResponseDataElementsInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ToolsClueFormDetailV2ResponseDataElementsInner type(ToolsClueFormDetailV2DataElementsType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public ToolsClueFormDetailV2DataElementsType getType() {
    return type;
  }


  public void setType(ToolsClueFormDetailV2DataElementsType type) {
    this.type = type;
  }


  public ToolsClueFormDetailV2ResponseDataElementsInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueFormDetailV2ResponseDataElementsInner toolsClueFormDetailV2ResponseDataElementsInner = (ToolsClueFormDetailV2ResponseDataElementsInner) o;
    return Objects.equals(this.allowEmpty, toolsClueFormDetailV2ResponseDataElementsInner.allowEmpty) &&
        Objects.equals(this.elementId, toolsClueFormDetailV2ResponseDataElementsInner.elementId) &&
        Objects.equals(this.isUnique, toolsClueFormDetailV2ResponseDataElementsInner.isUnique) &&
        Objects.equals(this.label, toolsClueFormDetailV2ResponseDataElementsInner.label) &&
        Objects.equals(this.type, toolsClueFormDetailV2ResponseDataElementsInner.type) &&
        Objects.equals(this.value, toolsClueFormDetailV2ResponseDataElementsInner.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmpty, elementId, isUnique, label, type, value);
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
    sb.append("class ToolsClueFormDetailV2ResponseDataElementsInner {\n");
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("allow_empty");
    openapiFields.add("element_id");
    openapiFields.add("is_unique");
    openapiFields.add("label");
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueFormDetailV2ResponseDataElementsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueFormDetailV2ResponseDataElementsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueFormDetailV2ResponseDataElementsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueFormDetailV2ResponseDataElementsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueFormDetailV2ResponseDataElementsInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueFormDetailV2ResponseDataElementsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueFormDetailV2ResponseDataElementsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueFormDetailV2ResponseDataElementsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueFormDetailV2ResponseDataElementsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueFormDetailV2ResponseDataElementsInner
  */
  public static ToolsClueFormDetailV2ResponseDataElementsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueFormDetailV2ResponseDataElementsInner.class);
  }

 /**
  * Convert an instance of ToolsClueFormDetailV2ResponseDataElementsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

