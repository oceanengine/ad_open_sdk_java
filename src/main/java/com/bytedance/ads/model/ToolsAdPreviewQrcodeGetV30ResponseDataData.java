/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsAdPreviewQrcodeGetV30ResponseDataData {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ID_TYPE = "id_type";
  @SerializedName(SERIALIZED_NAME_ID_TYPE)
  private String idType = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_QRCODE_MSG_URL = "qrcode_msg_url";
  @SerializedName(SERIALIZED_NAME_QRCODE_MSG_URL)
  private String qrcodeMsgUrl = null;

  public ToolsAdPreviewQrcodeGetV30ResponseDataData() {
  }

  public ToolsAdPreviewQrcodeGetV30ResponseDataData advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsAdPreviewQrcodeGetV30ResponseDataData idType(String idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * 
   * @return idType
  **/
  @javax.annotation.Nullable
  public String getIdType() {
    return idType;
  }


  public void setIdType(String idType) {
    this.idType = idType;
  }


  public ToolsAdPreviewQrcodeGetV30ResponseDataData materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public ToolsAdPreviewQrcodeGetV30ResponseDataData promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public ToolsAdPreviewQrcodeGetV30ResponseDataData qrcodeMsgUrl(String qrcodeMsgUrl) {
    
    this.qrcodeMsgUrl = qrcodeMsgUrl;
    return this;
  }

   /**
   * 
   * @return qrcodeMsgUrl
  **/
  @javax.annotation.Nullable
  public String getQrcodeMsgUrl() {
    return qrcodeMsgUrl;
  }


  public void setQrcodeMsgUrl(String qrcodeMsgUrl) {
    this.qrcodeMsgUrl = qrcodeMsgUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdPreviewQrcodeGetV30ResponseDataData toolsAdPreviewQrcodeGetV30ResponseDataData = (ToolsAdPreviewQrcodeGetV30ResponseDataData) o;
    return Objects.equals(this.advertiserId, toolsAdPreviewQrcodeGetV30ResponseDataData.advertiserId) &&
        Objects.equals(this.idType, toolsAdPreviewQrcodeGetV30ResponseDataData.idType) &&
        Objects.equals(this.materialId, toolsAdPreviewQrcodeGetV30ResponseDataData.materialId) &&
        Objects.equals(this.promotionId, toolsAdPreviewQrcodeGetV30ResponseDataData.promotionId) &&
        Objects.equals(this.qrcodeMsgUrl, toolsAdPreviewQrcodeGetV30ResponseDataData.qrcodeMsgUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, idType, materialId, promotionId, qrcodeMsgUrl);
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
    sb.append("class ToolsAdPreviewQrcodeGetV30ResponseDataData {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    qrcodeMsgUrl: ").append(toIndentedString(qrcodeMsgUrl)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("id_type");
    openapiFields.add("material_id");
    openapiFields.add("promotion_id");
    openapiFields.add("qrcode_msg_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("id_type");
    openapiRequiredFields.add("promotion_id");
    openapiRequiredFields.add("qrcode_msg_url");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdPreviewQrcodeGetV30ResponseDataData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdPreviewQrcodeGetV30ResponseDataData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdPreviewQrcodeGetV30ResponseDataData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdPreviewQrcodeGetV30ResponseDataData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdPreviewQrcodeGetV30ResponseDataData>() {
           @Override
           public void write(JsonWriter out, ToolsAdPreviewQrcodeGetV30ResponseDataData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdPreviewQrcodeGetV30ResponseDataData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdPreviewQrcodeGetV30ResponseDataData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdPreviewQrcodeGetV30ResponseDataData
  * @throws IOException if the JSON string is invalid with respect to ToolsAdPreviewQrcodeGetV30ResponseDataData
  */
  public static ToolsAdPreviewQrcodeGetV30ResponseDataData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdPreviewQrcodeGetV30ResponseDataData.class);
  }

 /**
  * Convert an instance of ToolsAdPreviewQrcodeGetV30ResponseDataData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

