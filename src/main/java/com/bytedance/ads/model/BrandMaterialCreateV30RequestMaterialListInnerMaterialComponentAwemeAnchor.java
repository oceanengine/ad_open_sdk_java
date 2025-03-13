/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandMaterialCreateV30MaterialListMaterialComponentAwemeAnchorAnchorType;
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
 * 抖音锚点
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor {
  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private String anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_TYPE = "anchor_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TYPE)
  private BrandMaterialCreateV30MaterialListMaterialComponentAwemeAnchorAnchorType anchorType = null;

  public static final String SERIALIZED_NAME_ENABLE_ANCHOR = "enable_anchor";
  @SerializedName(SERIALIZED_NAME_ENABLE_ANCHOR)
  private Long enableAnchor = null;

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor() {
  }

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor anchorId(String anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 锚点id
   * @return anchorId
  **/
  @javax.annotation.Nullable
  public String getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(String anchorId) {
    this.anchorId = anchorId;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor anchorType(BrandMaterialCreateV30MaterialListMaterialComponentAwemeAnchorAnchorType anchorType) {
    
    this.anchorType = anchorType;
    return this;
  }

   /**
   * Get anchorType
   * @return anchorType
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30MaterialListMaterialComponentAwemeAnchorAnchorType getAnchorType() {
    return anchorType;
  }


  public void setAnchorType(BrandMaterialCreateV30MaterialListMaterialComponentAwemeAnchorAnchorType anchorType) {
    this.anchorType = anchorType;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor enableAnchor(Long enableAnchor) {
    
    this.enableAnchor = enableAnchor;
    return this;
  }

   /**
   * 1 使用锚点 0关闭
   * @return enableAnchor
  **/
  @javax.annotation.Nullable
  public Long getEnableAnchor() {
    return enableAnchor;
  }


  public void setEnableAnchor(Long enableAnchor) {
    this.enableAnchor = enableAnchor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor brandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor = (BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor) o;
    return Objects.equals(this.anchorId, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor.anchorId) &&
        Objects.equals(this.anchorType, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor.anchorType) &&
        Objects.equals(this.enableAnchor, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor.enableAnchor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorId, anchorType, enableAnchor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor {\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorType: ").append(toIndentedString(anchorType)).append("\n");
    sb.append("    enableAnchor: ").append(toIndentedString(enableAnchor)).append("\n");
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
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_type");
    openapiFields.add("enable_anchor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor>() {
           @Override
           public void write(JsonWriter out, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor
  */
  public static BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor.class);
  }

 /**
  * Convert an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

