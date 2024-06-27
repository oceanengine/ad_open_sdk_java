/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
 * 商品类目信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class DpaClueProductDetailV2ResponseDataProductsInnerCategory {
  public static final String SERIALIZED_NAME_FIRST_CATEGORY_ID = "first_category_id";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY_ID)
  private Long firstCategoryId = null;

  public static final String SERIALIZED_NAME_FIRST_CATEGORY_NAME = "first_category_name";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY_NAME)
  private String firstCategoryName = null;

  public static final String SERIALIZED_NAME_FOURTH_CATEGORY_ID = "fourth_category_id";
  @SerializedName(SERIALIZED_NAME_FOURTH_CATEGORY_ID)
  private Long fourthCategoryId = null;

  public static final String SERIALIZED_NAME_FOURTH_CATEGORY_NAME = "fourth_category_name";
  @SerializedName(SERIALIZED_NAME_FOURTH_CATEGORY_NAME)
  private String fourthCategoryName = null;

  public static final String SERIALIZED_NAME_SECOND_CATEGORY_ID = "second_category_id";
  @SerializedName(SERIALIZED_NAME_SECOND_CATEGORY_ID)
  private Long secondCategoryId = null;

  public static final String SERIALIZED_NAME_SECOND_CATEGORY_NAME = "second_category_name";
  @SerializedName(SERIALIZED_NAME_SECOND_CATEGORY_NAME)
  private String secondCategoryName = null;

  public static final String SERIALIZED_NAME_THIRD_CATEGORY_ID = "third_category_id";
  @SerializedName(SERIALIZED_NAME_THIRD_CATEGORY_ID)
  private Long thirdCategoryId = null;

  public static final String SERIALIZED_NAME_THIRD_CATEGORY_NAME = "third_category_name";
  @SerializedName(SERIALIZED_NAME_THIRD_CATEGORY_NAME)
  private String thirdCategoryName = null;

  public DpaClueProductDetailV2ResponseDataProductsInnerCategory() {
  }

  public DpaClueProductDetailV2ResponseDataProductsInnerCategory firstCategoryId(Long firstCategoryId) {
    
    this.firstCategoryId = firstCategoryId;
    return this;
  }

   /**
   * 一级类目ID
   * @return firstCategoryId
  **/
  @javax.annotation.Nullable
  public Long getFirstCategoryId() {
    return firstCategoryId;
  }


  public void setFirstCategoryId(Long firstCategoryId) {
    this.firstCategoryId = firstCategoryId;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerCategory firstCategoryName(String firstCategoryName) {
    
    this.firstCategoryName = firstCategoryName;
    return this;
  }

   /**
   * 一级类目名称
   * @return firstCategoryName
  **/
  @javax.annotation.Nullable
  public String getFirstCategoryName() {
    return firstCategoryName;
  }


  public void setFirstCategoryName(String firstCategoryName) {
    this.firstCategoryName = firstCategoryName;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerCategory fourthCategoryId(Long fourthCategoryId) {
    
    this.fourthCategoryId = fourthCategoryId;
    return this;
  }

   /**
   * 四级类目ID
   * @return fourthCategoryId
  **/
  @javax.annotation.Nullable
  public Long getFourthCategoryId() {
    return fourthCategoryId;
  }


  public void setFourthCategoryId(Long fourthCategoryId) {
    this.fourthCategoryId = fourthCategoryId;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerCategory fourthCategoryName(String fourthCategoryName) {
    
    this.fourthCategoryName = fourthCategoryName;
    return this;
  }

   /**
   * 四级类目名称
   * @return fourthCategoryName
  **/
  @javax.annotation.Nullable
  public String getFourthCategoryName() {
    return fourthCategoryName;
  }


  public void setFourthCategoryName(String fourthCategoryName) {
    this.fourthCategoryName = fourthCategoryName;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerCategory secondCategoryId(Long secondCategoryId) {
    
    this.secondCategoryId = secondCategoryId;
    return this;
  }

   /**
   * 二级类目ID
   * @return secondCategoryId
  **/
  @javax.annotation.Nullable
  public Long getSecondCategoryId() {
    return secondCategoryId;
  }


  public void setSecondCategoryId(Long secondCategoryId) {
    this.secondCategoryId = secondCategoryId;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerCategory secondCategoryName(String secondCategoryName) {
    
    this.secondCategoryName = secondCategoryName;
    return this;
  }

   /**
   * 二级类目名称
   * @return secondCategoryName
  **/
  @javax.annotation.Nullable
  public String getSecondCategoryName() {
    return secondCategoryName;
  }


  public void setSecondCategoryName(String secondCategoryName) {
    this.secondCategoryName = secondCategoryName;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerCategory thirdCategoryId(Long thirdCategoryId) {
    
    this.thirdCategoryId = thirdCategoryId;
    return this;
  }

   /**
   * 三级类目ID
   * @return thirdCategoryId
  **/
  @javax.annotation.Nullable
  public Long getThirdCategoryId() {
    return thirdCategoryId;
  }


  public void setThirdCategoryId(Long thirdCategoryId) {
    this.thirdCategoryId = thirdCategoryId;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerCategory thirdCategoryName(String thirdCategoryName) {
    
    this.thirdCategoryName = thirdCategoryName;
    return this;
  }

   /**
   * 三级类目名称
   * @return thirdCategoryName
  **/
  @javax.annotation.Nullable
  public String getThirdCategoryName() {
    return thirdCategoryName;
  }


  public void setThirdCategoryName(String thirdCategoryName) {
    this.thirdCategoryName = thirdCategoryName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaClueProductDetailV2ResponseDataProductsInnerCategory dpaClueProductDetailV2ResponseDataProductsInnerCategory = (DpaClueProductDetailV2ResponseDataProductsInnerCategory) o;
    return Objects.equals(this.firstCategoryId, dpaClueProductDetailV2ResponseDataProductsInnerCategory.firstCategoryId) &&
        Objects.equals(this.firstCategoryName, dpaClueProductDetailV2ResponseDataProductsInnerCategory.firstCategoryName) &&
        Objects.equals(this.fourthCategoryId, dpaClueProductDetailV2ResponseDataProductsInnerCategory.fourthCategoryId) &&
        Objects.equals(this.fourthCategoryName, dpaClueProductDetailV2ResponseDataProductsInnerCategory.fourthCategoryName) &&
        Objects.equals(this.secondCategoryId, dpaClueProductDetailV2ResponseDataProductsInnerCategory.secondCategoryId) &&
        Objects.equals(this.secondCategoryName, dpaClueProductDetailV2ResponseDataProductsInnerCategory.secondCategoryName) &&
        Objects.equals(this.thirdCategoryId, dpaClueProductDetailV2ResponseDataProductsInnerCategory.thirdCategoryId) &&
        Objects.equals(this.thirdCategoryName, dpaClueProductDetailV2ResponseDataProductsInnerCategory.thirdCategoryName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstCategoryId, firstCategoryName, fourthCategoryId, fourthCategoryName, secondCategoryId, secondCategoryName, thirdCategoryId, thirdCategoryName);
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
    sb.append("class DpaClueProductDetailV2ResponseDataProductsInnerCategory {\n");
    sb.append("    firstCategoryId: ").append(toIndentedString(firstCategoryId)).append("\n");
    sb.append("    firstCategoryName: ").append(toIndentedString(firstCategoryName)).append("\n");
    sb.append("    fourthCategoryId: ").append(toIndentedString(fourthCategoryId)).append("\n");
    sb.append("    fourthCategoryName: ").append(toIndentedString(fourthCategoryName)).append("\n");
    sb.append("    secondCategoryId: ").append(toIndentedString(secondCategoryId)).append("\n");
    sb.append("    secondCategoryName: ").append(toIndentedString(secondCategoryName)).append("\n");
    sb.append("    thirdCategoryId: ").append(toIndentedString(thirdCategoryId)).append("\n");
    sb.append("    thirdCategoryName: ").append(toIndentedString(thirdCategoryName)).append("\n");
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
    openapiFields.add("first_category_id");
    openapiFields.add("first_category_name");
    openapiFields.add("fourth_category_id");
    openapiFields.add("fourth_category_name");
    openapiFields.add("second_category_id");
    openapiFields.add("second_category_name");
    openapiFields.add("third_category_id");
    openapiFields.add("third_category_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaClueProductDetailV2ResponseDataProductsInnerCategory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaClueProductDetailV2ResponseDataProductsInnerCategory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaClueProductDetailV2ResponseDataProductsInnerCategory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaClueProductDetailV2ResponseDataProductsInnerCategory.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaClueProductDetailV2ResponseDataProductsInnerCategory>() {
           @Override
           public void write(JsonWriter out, DpaClueProductDetailV2ResponseDataProductsInnerCategory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaClueProductDetailV2ResponseDataProductsInnerCategory read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaClueProductDetailV2ResponseDataProductsInnerCategory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaClueProductDetailV2ResponseDataProductsInnerCategory
  * @throws IOException if the JSON string is invalid with respect to DpaClueProductDetailV2ResponseDataProductsInnerCategory
  */
  public static DpaClueProductDetailV2ResponseDataProductsInnerCategory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaClueProductDetailV2ResponseDataProductsInnerCategory.class);
  }

 /**
  * Convert an instance of DpaClueProductDetailV2ResponseDataProductsInnerCategory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

