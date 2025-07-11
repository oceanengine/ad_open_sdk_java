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
import com.bytedance.ads.model.BrandOrderListV30DataOrdersAudienceInfoRetargetingInfoRetargetingType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
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

import com.bytedance.ads.JSON;

/**
 * 人群包
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo {
  public static final String SERIALIZED_NAME_RETARGETING_TAGS = "retargeting_tags";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS)
  private List<Long> retargetingTags = null;

  public static final String SERIALIZED_NAME_RETARGETING_TYPE = "retargeting_type";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TYPE)
  private BrandOrderListV30DataOrdersAudienceInfoRetargetingInfoRetargetingType retargetingType = null;

  public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo() {
  }

  public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo retargetingTags(List<Long> retargetingTags) {
    
    this.retargetingTags = retargetingTags;
    return this;
  }

  public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo addRetargetingTagsItem(Long retargetingTagsItem) {
    if (this.retargetingTags == null) {
      this.retargetingTags = new ArrayList<>();
    }
    this.retargetingTags.add(retargetingTagsItem);
    return this;
  }

   /**
   * 
   * @return retargetingTags
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTags() {
    return retargetingTags;
  }


  public void setRetargetingTags(List<Long> retargetingTags) {
    this.retargetingTags = retargetingTags;
  }


  public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo retargetingType(BrandOrderListV30DataOrdersAudienceInfoRetargetingInfoRetargetingType retargetingType) {
    
    this.retargetingType = retargetingType;
    return this;
  }

   /**
   * Get retargetingType
   * @return retargetingType
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30DataOrdersAudienceInfoRetargetingInfoRetargetingType getRetargetingType() {
    return retargetingType;
  }


  public void setRetargetingType(BrandOrderListV30DataOrdersAudienceInfoRetargetingInfoRetargetingType retargetingType) {
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
    BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo brandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo = (BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo) o;
    return Objects.equals(this.retargetingTags, brandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo.retargetingTags) &&
        Objects.equals(this.retargetingType, brandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo.retargetingType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(retargetingTags, retargetingType);
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
    sb.append("class BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo {\n");
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
       if (!BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo>() {
           @Override
           public void write(JsonWriter out, BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo
  * @throws IOException if the JSON string is invalid with respect to BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo
  */
  public static BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo.class);
  }

 /**
  * Convert an instance of BrandOrderListV30ResponseDataOrdersInnerAudienceInfoRetargetingInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

