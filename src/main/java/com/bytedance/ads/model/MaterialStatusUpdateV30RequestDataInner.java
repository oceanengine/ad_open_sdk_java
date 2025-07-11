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
import com.bytedance.ads.model.MaterialStatusUpdateV30DataOptStatus;
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
 * MaterialStatusUpdateV30RequestDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class MaterialStatusUpdateV30RequestDataInner {
  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private MaterialStatusUpdateV30DataOptStatus optStatus = null;

  public MaterialStatusUpdateV30RequestDataInner() {
  }

  public MaterialStatusUpdateV30RequestDataInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public MaterialStatusUpdateV30RequestDataInner optStatus(MaterialStatusUpdateV30DataOptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nullable
  public MaterialStatusUpdateV30DataOptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(MaterialStatusUpdateV30DataOptStatus optStatus) {
    this.optStatus = optStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialStatusUpdateV30RequestDataInner materialStatusUpdateV30RequestDataInner = (MaterialStatusUpdateV30RequestDataInner) o;
    return Objects.equals(this.materialId, materialStatusUpdateV30RequestDataInner.materialId) &&
        Objects.equals(this.optStatus, materialStatusUpdateV30RequestDataInner.optStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialId, optStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialStatusUpdateV30RequestDataInner {\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
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
    openapiFields.add("material_id");
    openapiFields.add("opt_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("material_id");
    openapiRequiredFields.add("opt_status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MaterialStatusUpdateV30RequestDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MaterialStatusUpdateV30RequestDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MaterialStatusUpdateV30RequestDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MaterialStatusUpdateV30RequestDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<MaterialStatusUpdateV30RequestDataInner>() {
           @Override
           public void write(JsonWriter out, MaterialStatusUpdateV30RequestDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MaterialStatusUpdateV30RequestDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MaterialStatusUpdateV30RequestDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MaterialStatusUpdateV30RequestDataInner
  * @throws IOException if the JSON string is invalid with respect to MaterialStatusUpdateV30RequestDataInner
  */
  public static MaterialStatusUpdateV30RequestDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MaterialStatusUpdateV30RequestDataInner.class);
  }

 /**
  * Convert an instance of MaterialStatusUpdateV30RequestDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

