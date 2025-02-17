/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CdpBrandGetV30ResponseDataBrandCategoryInfoInner;
import com.bytedance.ads.model.CdpBrandGetV30ResponseDataBrandInfoDataInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class CdpBrandGetV30ResponseData {
  public static final String SERIALIZED_NAME_BRAND_CATEGORY_INFO = "brand_category_info";
  @SerializedName(SERIALIZED_NAME_BRAND_CATEGORY_INFO)
  private List<CdpBrandGetV30ResponseDataBrandCategoryInfoInner> brandCategoryInfo = null;

  public static final String SERIALIZED_NAME_BRAND_INFO_DATA = "brand_info_data";
  @SerializedName(SERIALIZED_NAME_BRAND_INFO_DATA)
  private List<CdpBrandGetV30ResponseDataBrandInfoDataInner> brandInfoData = null;

  public CdpBrandGetV30ResponseData() {
  }

  public CdpBrandGetV30ResponseData brandCategoryInfo(List<CdpBrandGetV30ResponseDataBrandCategoryInfoInner> brandCategoryInfo) {
    
    this.brandCategoryInfo = brandCategoryInfo;
    return this;
  }

  public CdpBrandGetV30ResponseData addBrandCategoryInfoItem(CdpBrandGetV30ResponseDataBrandCategoryInfoInner brandCategoryInfoItem) {
    if (this.brandCategoryInfo == null) {
      this.brandCategoryInfo = new ArrayList<>();
    }
    this.brandCategoryInfo.add(brandCategoryInfoItem);
    return this;
  }

   /**
   * 品牌所属类别
   * @return brandCategoryInfo
  **/
  @javax.annotation.Nullable
  public List<CdpBrandGetV30ResponseDataBrandCategoryInfoInner> getBrandCategoryInfo() {
    return brandCategoryInfo;
  }


  public void setBrandCategoryInfo(List<CdpBrandGetV30ResponseDataBrandCategoryInfoInner> brandCategoryInfo) {
    this.brandCategoryInfo = brandCategoryInfo;
  }


  public CdpBrandGetV30ResponseData brandInfoData(List<CdpBrandGetV30ResponseDataBrandInfoDataInner> brandInfoData) {
    
    this.brandInfoData = brandInfoData;
    return this;
  }

  public CdpBrandGetV30ResponseData addBrandInfoDataItem(CdpBrandGetV30ResponseDataBrandInfoDataInner brandInfoDataItem) {
    if (this.brandInfoData == null) {
      this.brandInfoData = new ArrayList<>();
    }
    this.brandInfoData.add(brandInfoDataItem);
    return this;
  }

   /**
   * 
   * @return brandInfoData
  **/
  @javax.annotation.Nullable
  public List<CdpBrandGetV30ResponseDataBrandInfoDataInner> getBrandInfoData() {
    return brandInfoData;
  }


  public void setBrandInfoData(List<CdpBrandGetV30ResponseDataBrandInfoDataInner> brandInfoData) {
    this.brandInfoData = brandInfoData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdpBrandGetV30ResponseData cdpBrandGetV30ResponseData = (CdpBrandGetV30ResponseData) o;
    return Objects.equals(this.brandCategoryInfo, cdpBrandGetV30ResponseData.brandCategoryInfo) &&
        Objects.equals(this.brandInfoData, cdpBrandGetV30ResponseData.brandInfoData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandCategoryInfo, brandInfoData);
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
    sb.append("class CdpBrandGetV30ResponseData {\n");
    sb.append("    brandCategoryInfo: ").append(toIndentedString(brandCategoryInfo)).append("\n");
    sb.append("    brandInfoData: ").append(toIndentedString(brandInfoData)).append("\n");
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
    openapiFields.add("brand_category_info");
    openapiFields.add("brand_info_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CdpBrandGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CdpBrandGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CdpBrandGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CdpBrandGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CdpBrandGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, CdpBrandGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CdpBrandGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CdpBrandGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CdpBrandGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to CdpBrandGetV30ResponseData
  */
  public static CdpBrandGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CdpBrandGetV30ResponseData.class);
  }

 /**
  * Convert an instance of CdpBrandGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

