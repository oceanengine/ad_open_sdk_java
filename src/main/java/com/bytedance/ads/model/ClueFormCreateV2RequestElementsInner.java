/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueFormCreateV2ElementsAllowEmpty;
import com.bytedance.ads.model.ClueFormCreateV2ElementsElementType;
import com.bytedance.ads.model.ClueFormCreateV2ElementsIsUnique;
import com.bytedance.ads.model.ClueFormCreateV2ElementsLayer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * ClueFormCreateV2RequestElementsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ClueFormCreateV2RequestElementsInner {
  public static final String SERIALIZED_NAME_ALLOW_EMPTY = "allow_empty";
  @SerializedName(SERIALIZED_NAME_ALLOW_EMPTY)
  private ClueFormCreateV2ElementsAllowEmpty allowEmpty = null;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private Long defaultValue = null;

  public static final String SERIALIZED_NAME_ELEMENT_TYPE = "element_type";
  @SerializedName(SERIALIZED_NAME_ELEMENT_TYPE)
  private ClueFormCreateV2ElementsElementType elementType = null;

  public static final String SERIALIZED_NAME_IS_UNIQUE = "is_unique";
  @SerializedName(SERIALIZED_NAME_IS_UNIQUE)
  private ClueFormCreateV2ElementsIsUnique isUnique = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label = null;

  public static final String SERIALIZED_NAME_LAYER = "layer";
  @SerializedName(SERIALIZED_NAME_LAYER)
  private ClueFormCreateV2ElementsLayer layer = null;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Long sequence = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public ClueFormCreateV2RequestElementsInner() {
  }

  public ClueFormCreateV2RequestElementsInner allowEmpty(ClueFormCreateV2ElementsAllowEmpty allowEmpty) {
    
    this.allowEmpty = allowEmpty;
    return this;
  }

   /**
   * Get allowEmpty
   * @return allowEmpty
  **/
  @javax.annotation.Nullable
  public ClueFormCreateV2ElementsAllowEmpty getAllowEmpty() {
    return allowEmpty;
  }


  public void setAllowEmpty(ClueFormCreateV2ElementsAllowEmpty allowEmpty) {
    this.allowEmpty = allowEmpty;
  }


  public ClueFormCreateV2RequestElementsInner defaultValue(Long defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * 
   * minimum: -2147483648
   * maximum: 2147483647
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  public Long getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(Long defaultValue) {
    this.defaultValue = defaultValue;
  }


  public ClueFormCreateV2RequestElementsInner elementType(ClueFormCreateV2ElementsElementType elementType) {
    
    this.elementType = elementType;
    return this;
  }

   /**
   * Get elementType
   * @return elementType
  **/
  @javax.annotation.Nonnull
  public ClueFormCreateV2ElementsElementType getElementType() {
    return elementType;
  }


  public void setElementType(ClueFormCreateV2ElementsElementType elementType) {
    this.elementType = elementType;
  }


  public ClueFormCreateV2RequestElementsInner isUnique(ClueFormCreateV2ElementsIsUnique isUnique) {
    
    this.isUnique = isUnique;
    return this;
  }

   /**
   * Get isUnique
   * @return isUnique
  **/
  @javax.annotation.Nullable
  public ClueFormCreateV2ElementsIsUnique getIsUnique() {
    return isUnique;
  }


  public void setIsUnique(ClueFormCreateV2ElementsIsUnique isUnique) {
    this.isUnique = isUnique;
  }


  public ClueFormCreateV2RequestElementsInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @javax.annotation.Nonnull
  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ClueFormCreateV2RequestElementsInner layer(ClueFormCreateV2ElementsLayer layer) {
    
    this.layer = layer;
    return this;
  }

   /**
   * Get layer
   * @return layer
  **/
  @javax.annotation.Nullable
  public ClueFormCreateV2ElementsLayer getLayer() {
    return layer;
  }


  public void setLayer(ClueFormCreateV2ElementsLayer layer) {
    this.layer = layer;
  }


  public ClueFormCreateV2RequestElementsInner sequence(Long sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * 
   * @return sequence
  **/
  @javax.annotation.Nullable
  public Long getSequence() {
    return sequence;
  }


  public void setSequence(Long sequence) {
    this.sequence = sequence;
  }


  public ClueFormCreateV2RequestElementsInner value(String value) {
    
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
    ClueFormCreateV2RequestElementsInner clueFormCreateV2RequestElementsInner = (ClueFormCreateV2RequestElementsInner) o;
    return Objects.equals(this.allowEmpty, clueFormCreateV2RequestElementsInner.allowEmpty) &&
        Objects.equals(this.defaultValue, clueFormCreateV2RequestElementsInner.defaultValue) &&
        Objects.equals(this.elementType, clueFormCreateV2RequestElementsInner.elementType) &&
        Objects.equals(this.isUnique, clueFormCreateV2RequestElementsInner.isUnique) &&
        Objects.equals(this.label, clueFormCreateV2RequestElementsInner.label) &&
        Objects.equals(this.layer, clueFormCreateV2RequestElementsInner.layer) &&
        Objects.equals(this.sequence, clueFormCreateV2RequestElementsInner.sequence) &&
        Objects.equals(this.value, clueFormCreateV2RequestElementsInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmpty, defaultValue, elementType, isUnique, label, layer, sequence, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueFormCreateV2RequestElementsInner {\n");
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
    openapiFields.add("default_value");
    openapiFields.add("element_type");
    openapiFields.add("is_unique");
    openapiFields.add("label");
    openapiFields.add("layer");
    openapiFields.add("sequence");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("element_type");
    openapiRequiredFields.add("label");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueFormCreateV2RequestElementsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueFormCreateV2RequestElementsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueFormCreateV2RequestElementsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueFormCreateV2RequestElementsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueFormCreateV2RequestElementsInner>() {
           @Override
           public void write(JsonWriter out, ClueFormCreateV2RequestElementsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueFormCreateV2RequestElementsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueFormCreateV2RequestElementsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueFormCreateV2RequestElementsInner
  * @throws IOException if the JSON string is invalid with respect to ClueFormCreateV2RequestElementsInner
  */
  public static ClueFormCreateV2RequestElementsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueFormCreateV2RequestElementsInner.class);
  }

 /**
  * Convert an instance of ClueFormCreateV2RequestElementsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

