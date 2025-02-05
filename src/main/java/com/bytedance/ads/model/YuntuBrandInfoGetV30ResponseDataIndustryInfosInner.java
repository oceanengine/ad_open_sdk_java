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
 * YuntuBrandInfoGetV30ResponseDataIndustryInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class YuntuBrandInfoGetV30ResponseDataIndustryInfosInner {
  public static final String SERIALIZED_NAME_INDUSTRY_ID = "industry_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_ID)
  private Long industryId = null;

  public static final String SERIALIZED_NAME_INDUSTRY_NAME = "industry_name";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_NAME)
  private String industryName = null;

  public YuntuBrandInfoGetV30ResponseDataIndustryInfosInner() {
  }

  public YuntuBrandInfoGetV30ResponseDataIndustryInfosInner industryId(Long industryId) {
    
    this.industryId = industryId;
    return this;
  }

   /**
   * 行业ID
   * @return industryId
  **/
  @javax.annotation.Nullable
  public Long getIndustryId() {
    return industryId;
  }


  public void setIndustryId(Long industryId) {
    this.industryId = industryId;
  }


  public YuntuBrandInfoGetV30ResponseDataIndustryInfosInner industryName(String industryName) {
    
    this.industryName = industryName;
    return this;
  }

   /**
   * 行业名称
   * @return industryName
  **/
  @javax.annotation.Nullable
  public String getIndustryName() {
    return industryName;
  }


  public void setIndustryName(String industryName) {
    this.industryName = industryName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YuntuBrandInfoGetV30ResponseDataIndustryInfosInner yuntuBrandInfoGetV30ResponseDataIndustryInfosInner = (YuntuBrandInfoGetV30ResponseDataIndustryInfosInner) o;
    return Objects.equals(this.industryId, yuntuBrandInfoGetV30ResponseDataIndustryInfosInner.industryId) &&
        Objects.equals(this.industryName, yuntuBrandInfoGetV30ResponseDataIndustryInfosInner.industryName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(industryId, industryName);
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
    sb.append("class YuntuBrandInfoGetV30ResponseDataIndustryInfosInner {\n");
    sb.append("    industryId: ").append(toIndentedString(industryId)).append("\n");
    sb.append("    industryName: ").append(toIndentedString(industryName)).append("\n");
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
    openapiFields.add("industry_id");
    openapiFields.add("industry_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YuntuBrandInfoGetV30ResponseDataIndustryInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YuntuBrandInfoGetV30ResponseDataIndustryInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YuntuBrandInfoGetV30ResponseDataIndustryInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YuntuBrandInfoGetV30ResponseDataIndustryInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<YuntuBrandInfoGetV30ResponseDataIndustryInfosInner>() {
           @Override
           public void write(JsonWriter out, YuntuBrandInfoGetV30ResponseDataIndustryInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YuntuBrandInfoGetV30ResponseDataIndustryInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of YuntuBrandInfoGetV30ResponseDataIndustryInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of YuntuBrandInfoGetV30ResponseDataIndustryInfosInner
  * @throws IOException if the JSON string is invalid with respect to YuntuBrandInfoGetV30ResponseDataIndustryInfosInner
  */
  public static YuntuBrandInfoGetV30ResponseDataIndustryInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YuntuBrandInfoGetV30ResponseDataIndustryInfosInner.class);
  }

 /**
  * Convert an instance of YuntuBrandInfoGetV30ResponseDataIndustryInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

