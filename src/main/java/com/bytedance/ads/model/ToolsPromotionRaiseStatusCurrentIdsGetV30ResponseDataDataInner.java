/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus;
import com.bytedance.ads.model.ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo;
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
 * ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner {
  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_RAISE_INFO = "raise_info";
  @SerializedName(SERIALIZED_NAME_RAISE_INFO)
  private ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo raiseInfo = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus status = null;

  public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner() {
  }

  public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 广告ID
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner raiseInfo(ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo raiseInfo) {
    
    this.raiseInfo = raiseInfo;
    return this;
  }

   /**
   * Get raiseInfo
   * @return raiseInfo
  **/
  @javax.annotation.Nullable
  public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo getRaiseInfo() {
    return raiseInfo;
  }


  public void setRaiseInfo(ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo raiseInfo) {
    this.raiseInfo = raiseInfo;
  }


  public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner status(ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsPromotionRaiseStatusCurrentIdsGetV30DataDataStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner toolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner = (ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner) o;
    return Objects.equals(this.promotionId, toolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner.promotionId) &&
        Objects.equals(this.raiseInfo, toolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner.raiseInfo) &&
        Objects.equals(this.status, toolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionId, raiseInfo, status);
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
    sb.append("class ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner {\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    raiseInfo: ").append(toIndentedString(raiseInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("promotion_id");
    openapiFields.add("raise_info");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner
  */
  public static ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

