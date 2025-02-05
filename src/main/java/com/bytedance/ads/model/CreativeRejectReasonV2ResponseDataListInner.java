/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeRejectReasonV2ResponseDataListInnerMaterialRejectInner;
import com.bytedance.ads.model.CreativeRejectReasonV2ResponseDataListInnerRejectDataInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * CreativeRejectReasonV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class CreativeRejectReasonV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_MATERIAL_REJECT = "material_reject";
  @SerializedName(SERIALIZED_NAME_MATERIAL_REJECT)
  private List<CreativeRejectReasonV2ResponseDataListInnerMaterialRejectInner> materialReject = null;

  public static final String SERIALIZED_NAME_REJECT_DATA = "reject_data";
  @SerializedName(SERIALIZED_NAME_REJECT_DATA)
  private List<CreativeRejectReasonV2ResponseDataListInnerRejectDataInner> rejectData = null;

  public CreativeRejectReasonV2ResponseDataListInner() {
  }

  public CreativeRejectReasonV2ResponseDataListInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public CreativeRejectReasonV2ResponseDataListInner materialReject(List<CreativeRejectReasonV2ResponseDataListInnerMaterialRejectInner> materialReject) {
    
    this.materialReject = materialReject;
    return this;
  }

  public CreativeRejectReasonV2ResponseDataListInner addMaterialRejectItem(CreativeRejectReasonV2ResponseDataListInnerMaterialRejectInner materialRejectItem) {
    if (this.materialReject == null) {
      this.materialReject = new ArrayList<>();
    }
    this.materialReject.add(materialRejectItem);
    return this;
  }

   /**
   * 
   * @return materialReject
  **/
  @javax.annotation.Nullable
  public List<CreativeRejectReasonV2ResponseDataListInnerMaterialRejectInner> getMaterialReject() {
    return materialReject;
  }


  public void setMaterialReject(List<CreativeRejectReasonV2ResponseDataListInnerMaterialRejectInner> materialReject) {
    this.materialReject = materialReject;
  }


  public CreativeRejectReasonV2ResponseDataListInner rejectData(List<CreativeRejectReasonV2ResponseDataListInnerRejectDataInner> rejectData) {
    
    this.rejectData = rejectData;
    return this;
  }

  public CreativeRejectReasonV2ResponseDataListInner addRejectDataItem(CreativeRejectReasonV2ResponseDataListInnerRejectDataInner rejectDataItem) {
    if (this.rejectData == null) {
      this.rejectData = new ArrayList<>();
    }
    this.rejectData.add(rejectDataItem);
    return this;
  }

   /**
   * 
   * @return rejectData
  **/
  @javax.annotation.Nullable
  public List<CreativeRejectReasonV2ResponseDataListInnerRejectDataInner> getRejectData() {
    return rejectData;
  }


  public void setRejectData(List<CreativeRejectReasonV2ResponseDataListInnerRejectDataInner> rejectData) {
    this.rejectData = rejectData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeRejectReasonV2ResponseDataListInner creativeRejectReasonV2ResponseDataListInner = (CreativeRejectReasonV2ResponseDataListInner) o;
    return Objects.equals(this.creativeId, creativeRejectReasonV2ResponseDataListInner.creativeId) &&
        Objects.equals(this.materialReject, creativeRejectReasonV2ResponseDataListInner.materialReject) &&
        Objects.equals(this.rejectData, creativeRejectReasonV2ResponseDataListInner.rejectData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeId, materialReject, rejectData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeRejectReasonV2ResponseDataListInner {\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    materialReject: ").append(toIndentedString(materialReject)).append("\n");
    sb.append("    rejectData: ").append(toIndentedString(rejectData)).append("\n");
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
    openapiFields.add("creative_id");
    openapiFields.add("material_reject");
    openapiFields.add("reject_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeRejectReasonV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeRejectReasonV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeRejectReasonV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeRejectReasonV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeRejectReasonV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, CreativeRejectReasonV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeRejectReasonV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeRejectReasonV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeRejectReasonV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to CreativeRejectReasonV2ResponseDataListInner
  */
  public static CreativeRejectReasonV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeRejectReasonV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of CreativeRejectReasonV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

