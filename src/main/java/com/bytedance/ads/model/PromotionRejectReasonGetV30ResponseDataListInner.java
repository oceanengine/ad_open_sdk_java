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
import com.bytedance.ads.model.PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner;
import com.bytedance.ads.model.PromotionRejectReasonGetV30ResponseDataListInnerPromotionRejectInner;
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
 * PromotionRejectReasonGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class PromotionRejectReasonGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_MATERIAL_REJECT = "material_reject";
  @SerializedName(SERIALIZED_NAME_MATERIAL_REJECT)
  private List<PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner> materialReject = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_PROMOTION_REJECT = "promotion_reject";
  @SerializedName(SERIALIZED_NAME_PROMOTION_REJECT)
  private List<PromotionRejectReasonGetV30ResponseDataListInnerPromotionRejectInner> promotionReject = null;

  public PromotionRejectReasonGetV30ResponseDataListInner() {
  }

  public PromotionRejectReasonGetV30ResponseDataListInner materialReject(List<PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner> materialReject) {
    
    this.materialReject = materialReject;
    return this;
  }

  public PromotionRejectReasonGetV30ResponseDataListInner addMaterialRejectItem(PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner materialRejectItem) {
    if (this.materialReject == null) {
      this.materialReject = new ArrayList<>();
    }
    this.materialReject.add(materialRejectItem);
    return this;
  }

   /**
   * 素材维度审核建议列表
   * @return materialReject
  **/
  @javax.annotation.Nullable
  public List<PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner> getMaterialReject() {
    return materialReject;
  }


  public void setMaterialReject(List<PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner> materialReject) {
    this.materialReject = materialReject;
  }


  public PromotionRejectReasonGetV30ResponseDataListInner promotionId(Long promotionId) {
    
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


  public PromotionRejectReasonGetV30ResponseDataListInner promotionReject(List<PromotionRejectReasonGetV30ResponseDataListInnerPromotionRejectInner> promotionReject) {
    
    this.promotionReject = promotionReject;
    return this;
  }

  public PromotionRejectReasonGetV30ResponseDataListInner addPromotionRejectItem(PromotionRejectReasonGetV30ResponseDataListInnerPromotionRejectInner promotionRejectItem) {
    if (this.promotionReject == null) {
      this.promotionReject = new ArrayList<>();
    }
    this.promotionReject.add(promotionRejectItem);
    return this;
  }

   /**
   * 广告维度审核建议列表
   * @return promotionReject
  **/
  @javax.annotation.Nullable
  public List<PromotionRejectReasonGetV30ResponseDataListInnerPromotionRejectInner> getPromotionReject() {
    return promotionReject;
  }


  public void setPromotionReject(List<PromotionRejectReasonGetV30ResponseDataListInnerPromotionRejectInner> promotionReject) {
    this.promotionReject = promotionReject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionRejectReasonGetV30ResponseDataListInner promotionRejectReasonGetV30ResponseDataListInner = (PromotionRejectReasonGetV30ResponseDataListInner) o;
    return Objects.equals(this.materialReject, promotionRejectReasonGetV30ResponseDataListInner.materialReject) &&
        Objects.equals(this.promotionId, promotionRejectReasonGetV30ResponseDataListInner.promotionId) &&
        Objects.equals(this.promotionReject, promotionRejectReasonGetV30ResponseDataListInner.promotionReject);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialReject, promotionId, promotionReject);
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
    sb.append("class PromotionRejectReasonGetV30ResponseDataListInner {\n");
    sb.append("    materialReject: ").append(toIndentedString(materialReject)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionReject: ").append(toIndentedString(promotionReject)).append("\n");
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
    openapiFields.add("material_reject");
    openapiFields.add("promotion_id");
    openapiFields.add("promotion_reject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionRejectReasonGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionRejectReasonGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionRejectReasonGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionRejectReasonGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionRejectReasonGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, PromotionRejectReasonGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionRejectReasonGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionRejectReasonGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionRejectReasonGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionRejectReasonGetV30ResponseDataListInner
  */
  public static PromotionRejectReasonGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionRejectReasonGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of PromotionRejectReasonGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

