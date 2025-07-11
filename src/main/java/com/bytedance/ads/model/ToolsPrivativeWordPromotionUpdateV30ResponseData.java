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
import com.bytedance.ads.model.ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsPrivativeWordPromotionUpdateV30ResponseData {
  public static final String SERIALIZED_NAME_ERROR_LIST = "error_list";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner> errorList = null;

  public static final String SERIALIZED_NAME_PROMOTION_ERROR_LIST = "promotion_error_list";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ERROR_LIST)
  private List<Long> promotionErrorList = null;

  public static final String SERIALIZED_NAME_PROMOTION_LIST = "promotion_list";
  @SerializedName(SERIALIZED_NAME_PROMOTION_LIST)
  private List<Object> promotionList = null;

  public ToolsPrivativeWordPromotionUpdateV30ResponseData() {
  }

  public ToolsPrivativeWordPromotionUpdateV30ResponseData errorList(List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public ToolsPrivativeWordPromotionUpdateV30ResponseData addErrorListItem(ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * 
   * @return errorList
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner> errorList) {
    this.errorList = errorList;
  }


  public ToolsPrivativeWordPromotionUpdateV30ResponseData promotionErrorList(List<Long> promotionErrorList) {
    
    this.promotionErrorList = promotionErrorList;
    return this;
  }

  public ToolsPrivativeWordPromotionUpdateV30ResponseData addPromotionErrorListItem(Long promotionErrorListItem) {
    if (this.promotionErrorList == null) {
      this.promotionErrorList = new ArrayList<>();
    }
    this.promotionErrorList.add(promotionErrorListItem);
    return this;
  }

   /**
   * 
   * @return promotionErrorList
  **/
  @javax.annotation.Nullable
  public List<Long> getPromotionErrorList() {
    return promotionErrorList;
  }


  public void setPromotionErrorList(List<Long> promotionErrorList) {
    this.promotionErrorList = promotionErrorList;
  }


  public ToolsPrivativeWordPromotionUpdateV30ResponseData promotionList(List<Object> promotionList) {
    
    this.promotionList = promotionList;
    return this;
  }

  public ToolsPrivativeWordPromotionUpdateV30ResponseData addPromotionListItem(Object promotionListItem) {
    if (this.promotionList == null) {
      this.promotionList = new ArrayList<>();
    }
    this.promotionList.add(promotionListItem);
    return this;
  }

   /**
   * 
   * @return promotionList
  **/
  @javax.annotation.Nullable
  public List<Object> getPromotionList() {
    return promotionList;
  }


  public void setPromotionList(List<Object> promotionList) {
    this.promotionList = promotionList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordPromotionUpdateV30ResponseData toolsPrivativeWordPromotionUpdateV30ResponseData = (ToolsPrivativeWordPromotionUpdateV30ResponseData) o;
    return Objects.equals(this.errorList, toolsPrivativeWordPromotionUpdateV30ResponseData.errorList) &&
        Objects.equals(this.promotionErrorList, toolsPrivativeWordPromotionUpdateV30ResponseData.promotionErrorList) &&
        Objects.equals(this.promotionList, toolsPrivativeWordPromotionUpdateV30ResponseData.promotionList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorList, promotionErrorList, promotionList);
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
    sb.append("class ToolsPrivativeWordPromotionUpdateV30ResponseData {\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
    sb.append("    promotionErrorList: ").append(toIndentedString(promotionErrorList)).append("\n");
    sb.append("    promotionList: ").append(toIndentedString(promotionList)).append("\n");
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
    openapiFields.add("error_list");
    openapiFields.add("promotion_error_list");
    openapiFields.add("promotion_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordPromotionUpdateV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordPromotionUpdateV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordPromotionUpdateV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordPromotionUpdateV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordPromotionUpdateV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordPromotionUpdateV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordPromotionUpdateV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordPromotionUpdateV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordPromotionUpdateV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordPromotionUpdateV30ResponseData
  */
  public static ToolsPrivativeWordPromotionUpdateV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordPromotionUpdateV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordPromotionUpdateV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

