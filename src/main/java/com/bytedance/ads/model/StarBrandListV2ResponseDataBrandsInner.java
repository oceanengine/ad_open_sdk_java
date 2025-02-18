/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner;
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
 * StarBrandListV2ResponseDataBrandsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class StarBrandListV2ResponseDataBrandsInner {
  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Long brandId = null;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public static final String SERIALIZED_NAME_YUNTU_BRAND_ID = "yuntu_brand_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_BRAND_ID)
  private Long yuntuBrandId = null;

  public static final String SERIALIZED_NAME_YUNTU_INDUSTRY = "yuntu_industry";
  @SerializedName(SERIALIZED_NAME_YUNTU_INDUSTRY)
  private List<StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner> yuntuIndustry = null;

  public StarBrandListV2ResponseDataBrandsInner() {
  }

  public StarBrandListV2ResponseDataBrandsInner brandId(Long brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Long getBrandId() {
    return brandId;
  }


  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }


  public StarBrandListV2ResponseDataBrandsInner brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public StarBrandListV2ResponseDataBrandsInner yuntuBrandId(Long yuntuBrandId) {
    
    this.yuntuBrandId = yuntuBrandId;
    return this;
  }

   /**
   * 
   * @return yuntuBrandId
  **/
  @javax.annotation.Nullable
  public Long getYuntuBrandId() {
    return yuntuBrandId;
  }


  public void setYuntuBrandId(Long yuntuBrandId) {
    this.yuntuBrandId = yuntuBrandId;
  }


  public StarBrandListV2ResponseDataBrandsInner yuntuIndustry(List<StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner> yuntuIndustry) {
    
    this.yuntuIndustry = yuntuIndustry;
    return this;
  }

  public StarBrandListV2ResponseDataBrandsInner addYuntuIndustryItem(StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner yuntuIndustryItem) {
    if (this.yuntuIndustry == null) {
      this.yuntuIndustry = new ArrayList<>();
    }
    this.yuntuIndustry.add(yuntuIndustryItem);
    return this;
  }

   /**
   * 
   * @return yuntuIndustry
  **/
  @javax.annotation.Nullable
  public List<StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner> getYuntuIndustry() {
    return yuntuIndustry;
  }


  public void setYuntuIndustry(List<StarBrandListV2ResponseDataBrandsInnerYuntuIndustryInner> yuntuIndustry) {
    this.yuntuIndustry = yuntuIndustry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarBrandListV2ResponseDataBrandsInner starBrandListV2ResponseDataBrandsInner = (StarBrandListV2ResponseDataBrandsInner) o;
    return Objects.equals(this.brandId, starBrandListV2ResponseDataBrandsInner.brandId) &&
        Objects.equals(this.brandName, starBrandListV2ResponseDataBrandsInner.brandName) &&
        Objects.equals(this.yuntuBrandId, starBrandListV2ResponseDataBrandsInner.yuntuBrandId) &&
        Objects.equals(this.yuntuIndustry, starBrandListV2ResponseDataBrandsInner.yuntuIndustry);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, brandName, yuntuBrandId, yuntuIndustry);
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
    sb.append("class StarBrandListV2ResponseDataBrandsInner {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    yuntuBrandId: ").append(toIndentedString(yuntuBrandId)).append("\n");
    sb.append("    yuntuIndustry: ").append(toIndentedString(yuntuIndustry)).append("\n");
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
    openapiFields.add("brand_id");
    openapiFields.add("brand_name");
    openapiFields.add("yuntu_brand_id");
    openapiFields.add("yuntu_industry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("brand_id");
    openapiRequiredFields.add("brand_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarBrandListV2ResponseDataBrandsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarBrandListV2ResponseDataBrandsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarBrandListV2ResponseDataBrandsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarBrandListV2ResponseDataBrandsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarBrandListV2ResponseDataBrandsInner>() {
           @Override
           public void write(JsonWriter out, StarBrandListV2ResponseDataBrandsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarBrandListV2ResponseDataBrandsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarBrandListV2ResponseDataBrandsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarBrandListV2ResponseDataBrandsInner
  * @throws IOException if the JSON string is invalid with respect to StarBrandListV2ResponseDataBrandsInner
  */
  public static StarBrandListV2ResponseDataBrandsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarBrandListV2ResponseDataBrandsInner.class);
  }

 /**
  * Convert an instance of StarBrandListV2ResponseDataBrandsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

