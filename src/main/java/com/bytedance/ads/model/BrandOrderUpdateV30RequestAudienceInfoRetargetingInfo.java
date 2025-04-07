/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandOrderUpdateV30AudienceInfoRetargetingInfoRetargetingType;
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
 * 人群包
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo {
  public static final String SERIALIZED_NAME_RETARGETING_TAGS = "retargeting_tags";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS)
  private List<Long> retargetingTags = null;

  public static final String SERIALIZED_NAME_RETARGETING_TYPE = "retargeting_type";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TYPE)
  private BrandOrderUpdateV30AudienceInfoRetargetingInfoRetargetingType retargetingType = null;

  public BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo() {
  }

  public BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo retargetingTags(List<Long> retargetingTags) {
    
    this.retargetingTags = retargetingTags;
    return this;
  }

  public BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo addRetargetingTagsItem(Long retargetingTagsItem) {
    if (this.retargetingTags == null) {
      this.retargetingTags = new ArrayList<>();
    }
    this.retargetingTags.add(retargetingTagsItem);
    return this;
  }

   /**
   * 人群包ID列表
   * @return retargetingTags
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTags() {
    return retargetingTags;
  }


  public void setRetargetingTags(List<Long> retargetingTags) {
    this.retargetingTags = retargetingTags;
  }


  public BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo retargetingType(BrandOrderUpdateV30AudienceInfoRetargetingInfoRetargetingType retargetingType) {
    
    this.retargetingType = retargetingType;
    return this;
  }

   /**
   * Get retargetingType
   * @return retargetingType
  **/
  @javax.annotation.Nullable
  public BrandOrderUpdateV30AudienceInfoRetargetingInfoRetargetingType getRetargetingType() {
    return retargetingType;
  }


  public void setRetargetingType(BrandOrderUpdateV30AudienceInfoRetargetingInfoRetargetingType retargetingType) {
    this.retargetingType = retargetingType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo brandOrderUpdateV30RequestAudienceInfoRetargetingInfo = (BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo) o;
    return Objects.equals(this.retargetingTags, brandOrderUpdateV30RequestAudienceInfoRetargetingInfo.retargetingTags) &&
        Objects.equals(this.retargetingType, brandOrderUpdateV30RequestAudienceInfoRetargetingInfo.retargetingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retargetingTags, retargetingType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo {\n");
    sb.append("    retargetingTags: ").append(toIndentedString(retargetingTags)).append("\n");
    sb.append("    retargetingType: ").append(toIndentedString(retargetingType)).append("\n");
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
    openapiFields.add("retargeting_tags");
    openapiFields.add("retargeting_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo>() {
           @Override
           public void write(JsonWriter out, BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo
  * @throws IOException if the JSON string is invalid with respect to BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo
  */
  public static BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo.class);
  }

 /**
  * Convert an instance of BrandOrderUpdateV30RequestAudienceInfoRetargetingInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

