/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryFirstCategoryDataInner;
import com.bytedance.ads.model.BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategorySecondCategoryDataValueInner;
import com.bytedance.ads.model.BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryThirdCategoryDataValueInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * 行业三级分类集合
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory {
  public static final String SERIALIZED_NAME_FIRST_CATEGORY_DATA = "first_category_data";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY_DATA)
  private List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryFirstCategoryDataInner> firstCategoryData = null;

  public static final String SERIALIZED_NAME_SECOND_CATEGORY_DATA = "second_category_data";
  @SerializedName(SERIALIZED_NAME_SECOND_CATEGORY_DATA)
  private Map<String, List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategorySecondCategoryDataValueInner>> secondCategoryData = null;

  public static final String SERIALIZED_NAME_THIRD_CATEGORY_DATA = "third_category_data";
  @SerializedName(SERIALIZED_NAME_THIRD_CATEGORY_DATA)
  private Map<String, List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryThirdCategoryDataValueInner>> thirdCategoryData = null;

  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory() {
  }

  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory firstCategoryData(List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryFirstCategoryDataInner> firstCategoryData) {
    
    this.firstCategoryData = firstCategoryData;
    return this;
  }

  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory addFirstCategoryDataItem(BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryFirstCategoryDataInner firstCategoryDataItem) {
    if (this.firstCategoryData == null) {
      this.firstCategoryData = new ArrayList<>();
    }
    this.firstCategoryData.add(firstCategoryDataItem);
    return this;
  }

   /**
   * 一级行业分类集合
   * @return firstCategoryData
  **/
  @javax.annotation.Nullable
  public List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryFirstCategoryDataInner> getFirstCategoryData() {
    return firstCategoryData;
  }


  public void setFirstCategoryData(List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryFirstCategoryDataInner> firstCategoryData) {
    this.firstCategoryData = firstCategoryData;
  }


  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory secondCategoryData(Map<String, List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategorySecondCategoryDataValueInner>> secondCategoryData) {
    
    this.secondCategoryData = secondCategoryData;
    return this;
  }

  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory putSecondCategoryDataItem(String key, List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategorySecondCategoryDataValueInner> secondCategoryDataItem) {
    if (this.secondCategoryData == null) {
      this.secondCategoryData = new HashMap<>();
    }
    this.secondCategoryData.put(key, secondCategoryDataItem);
    return this;
  }

   /**
   * 二级行业分类集合
   * @return secondCategoryData
  **/
  @javax.annotation.Nullable
  public Map<String, List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategorySecondCategoryDataValueInner>> getSecondCategoryData() {
    return secondCategoryData;
  }


  public void setSecondCategoryData(Map<String, List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategorySecondCategoryDataValueInner>> secondCategoryData) {
    this.secondCategoryData = secondCategoryData;
  }


  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory thirdCategoryData(Map<String, List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryThirdCategoryDataValueInner>> thirdCategoryData) {
    
    this.thirdCategoryData = thirdCategoryData;
    return this;
  }

  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory putThirdCategoryDataItem(String key, List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryThirdCategoryDataValueInner> thirdCategoryDataItem) {
    if (this.thirdCategoryData == null) {
      this.thirdCategoryData = new HashMap<>();
    }
    this.thirdCategoryData.put(key, thirdCategoryDataItem);
    return this;
  }

   /**
   * 三级级行业分类集合
   * @return thirdCategoryData
  **/
  @javax.annotation.Nullable
  public Map<String, List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryThirdCategoryDataValueInner>> getThirdCategoryData() {
    return thirdCategoryData;
  }


  public void setThirdCategoryData(Map<String, List<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategoryThirdCategoryDataValueInner>> thirdCategoryData) {
    this.thirdCategoryData = thirdCategoryData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory brandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory = (BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory) o;
    return Objects.equals(this.firstCategoryData, brandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory.firstCategoryData) &&
        Objects.equals(this.secondCategoryData, brandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory.secondCategoryData) &&
        Objects.equals(this.thirdCategoryData, brandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory.thirdCategoryData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstCategoryData, secondCategoryData, thirdCategoryData);
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
    sb.append("class BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory {\n");
    sb.append("    firstCategoryData: ").append(toIndentedString(firstCategoryData)).append("\n");
    sb.append("    secondCategoryData: ").append(toIndentedString(secondCategoryData)).append("\n");
    sb.append("    thirdCategoryData: ").append(toIndentedString(thirdCategoryData)).append("\n");
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
    openapiFields.add("first_category_data");
    openapiFields.add("second_category_data");
    openapiFields.add("third_category_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory>() {
           @Override
           public void write(JsonWriter out, BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory
  * @throws IOException if the JSON string is invalid with respect to BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory
  */
  public static BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory.class);
  }

 /**
  * Convert an instance of BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoYuntuCategory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

