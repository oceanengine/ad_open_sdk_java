/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
 * ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner {
  public static final String SERIALIZED_NAME_ERROR_REASON = "error_reason";
  @SerializedName(SERIALIZED_NAME_ERROR_REASON)
  private String errorReason = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner() {
  }

  public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner errorReason(String errorReason) {
    
    this.errorReason = errorReason;
    return this;
  }

   /**
   * 获取一键起量状态失败的错误原因
   * @return errorReason
  **/
  @javax.annotation.Nullable
  public String getErrorReason() {
    return errorReason;
  }


  public void setErrorReason(String errorReason) {
    this.errorReason = errorReason;
  }


  public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 获取一键起量状态失败的广告ID
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner toolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner = (ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner) o;
    return Objects.equals(this.errorReason, toolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner.errorReason) &&
        Objects.equals(this.promotionId, toolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner.promotionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorReason, promotionId);
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
    sb.append("class ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner {\n");
    sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
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
    openapiFields.add("error_reason");
    openapiFields.add("promotion_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner
  */
  public static ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner.class);
  }

 /**
  * Convert an instance of ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataErrorListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

