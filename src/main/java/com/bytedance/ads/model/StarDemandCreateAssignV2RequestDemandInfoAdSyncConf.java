/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestDemandInfoAdSyncConfContentMarketing;
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestDemandInfoAdSyncConfDouPlus;
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestDemandInfoAdSyncConfEcomShop;
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestDemandInfoAdSyncConfLocalPromotion;
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestDemandInfoAdSyncConfOceanEngine;
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan;
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
 * 广告推送配置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class StarDemandCreateAssignV2RequestDemandInfoAdSyncConf {
  public static final String SERIALIZED_NAME_CONTENT_MARKETING = "content_marketing";
  @SerializedName(SERIALIZED_NAME_CONTENT_MARKETING)
  private StarDemandCreateAssignV2RequestDemandInfoAdSyncConfContentMarketing contentMarketing = null;

  public static final String SERIALIZED_NAME_DOU_PLUS = "dou_plus";
  @SerializedName(SERIALIZED_NAME_DOU_PLUS)
  private StarDemandCreateAssignV2RequestDemandInfoAdSyncConfDouPlus douPlus = null;

  public static final String SERIALIZED_NAME_ECOM_SHOP = "ecom_shop";
  @SerializedName(SERIALIZED_NAME_ECOM_SHOP)
  private StarDemandCreateAssignV2RequestDemandInfoAdSyncConfEcomShop ecomShop = null;

  public static final String SERIALIZED_NAME_LOCAL_PROMOTION = "local_promotion";
  @SerializedName(SERIALIZED_NAME_LOCAL_PROMOTION)
  private StarDemandCreateAssignV2RequestDemandInfoAdSyncConfLocalPromotion localPromotion = null;

  public static final String SERIALIZED_NAME_OCEAN_ENGINE = "ocean_engine";
  @SerializedName(SERIALIZED_NAME_OCEAN_ENGINE)
  private StarDemandCreateAssignV2RequestDemandInfoAdSyncConfOceanEngine oceanEngine = null;

  public static final String SERIALIZED_NAME_QIANCHUAN = "qianchuan";
  @SerializedName(SERIALIZED_NAME_QIANCHUAN)
  private StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan qianchuan = null;

  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConf() {
  }

  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConf contentMarketing(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfContentMarketing contentMarketing) {
    
    this.contentMarketing = contentMarketing;
    return this;
  }

   /**
   * Get contentMarketing
   * @return contentMarketing
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfContentMarketing getContentMarketing() {
    return contentMarketing;
  }


  public void setContentMarketing(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfContentMarketing contentMarketing) {
    this.contentMarketing = contentMarketing;
  }


  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConf douPlus(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfDouPlus douPlus) {
    
    this.douPlus = douPlus;
    return this;
  }

   /**
   * Get douPlus
   * @return douPlus
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfDouPlus getDouPlus() {
    return douPlus;
  }


  public void setDouPlus(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfDouPlus douPlus) {
    this.douPlus = douPlus;
  }


  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConf ecomShop(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfEcomShop ecomShop) {
    
    this.ecomShop = ecomShop;
    return this;
  }

   /**
   * Get ecomShop
   * @return ecomShop
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfEcomShop getEcomShop() {
    return ecomShop;
  }


  public void setEcomShop(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfEcomShop ecomShop) {
    this.ecomShop = ecomShop;
  }


  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConf localPromotion(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfLocalPromotion localPromotion) {
    
    this.localPromotion = localPromotion;
    return this;
  }

   /**
   * Get localPromotion
   * @return localPromotion
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfLocalPromotion getLocalPromotion() {
    return localPromotion;
  }


  public void setLocalPromotion(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfLocalPromotion localPromotion) {
    this.localPromotion = localPromotion;
  }


  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConf oceanEngine(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfOceanEngine oceanEngine) {
    
    this.oceanEngine = oceanEngine;
    return this;
  }

   /**
   * Get oceanEngine
   * @return oceanEngine
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfOceanEngine getOceanEngine() {
    return oceanEngine;
  }


  public void setOceanEngine(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfOceanEngine oceanEngine) {
    this.oceanEngine = oceanEngine;
  }


  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConf qianchuan(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan qianchuan) {
    
    this.qianchuan = qianchuan;
    return this;
  }

   /**
   * Get qianchuan
   * @return qianchuan
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan getQianchuan() {
    return qianchuan;
  }


  public void setQianchuan(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan qianchuan) {
    this.qianchuan = qianchuan;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateAssignV2RequestDemandInfoAdSyncConf starDemandCreateAssignV2RequestDemandInfoAdSyncConf = (StarDemandCreateAssignV2RequestDemandInfoAdSyncConf) o;
    return Objects.equals(this.contentMarketing, starDemandCreateAssignV2RequestDemandInfoAdSyncConf.contentMarketing) &&
        Objects.equals(this.douPlus, starDemandCreateAssignV2RequestDemandInfoAdSyncConf.douPlus) &&
        Objects.equals(this.ecomShop, starDemandCreateAssignV2RequestDemandInfoAdSyncConf.ecomShop) &&
        Objects.equals(this.localPromotion, starDemandCreateAssignV2RequestDemandInfoAdSyncConf.localPromotion) &&
        Objects.equals(this.oceanEngine, starDemandCreateAssignV2RequestDemandInfoAdSyncConf.oceanEngine) &&
        Objects.equals(this.qianchuan, starDemandCreateAssignV2RequestDemandInfoAdSyncConf.qianchuan);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentMarketing, douPlus, ecomShop, localPromotion, oceanEngine, qianchuan);
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
    sb.append("class StarDemandCreateAssignV2RequestDemandInfoAdSyncConf {\n");
    sb.append("    contentMarketing: ").append(toIndentedString(contentMarketing)).append("\n");
    sb.append("    douPlus: ").append(toIndentedString(douPlus)).append("\n");
    sb.append("    ecomShop: ").append(toIndentedString(ecomShop)).append("\n");
    sb.append("    localPromotion: ").append(toIndentedString(localPromotion)).append("\n");
    sb.append("    oceanEngine: ").append(toIndentedString(oceanEngine)).append("\n");
    sb.append("    qianchuan: ").append(toIndentedString(qianchuan)).append("\n");
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
    openapiFields.add("content_marketing");
    openapiFields.add("dou_plus");
    openapiFields.add("ecom_shop");
    openapiFields.add("local_promotion");
    openapiFields.add("ocean_engine");
    openapiFields.add("qianchuan");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateAssignV2RequestDemandInfoAdSyncConf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateAssignV2RequestDemandInfoAdSyncConf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateAssignV2RequestDemandInfoAdSyncConf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateAssignV2RequestDemandInfoAdSyncConf.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateAssignV2RequestDemandInfoAdSyncConf>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateAssignV2RequestDemandInfoAdSyncConf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateAssignV2RequestDemandInfoAdSyncConf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateAssignV2RequestDemandInfoAdSyncConf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateAssignV2RequestDemandInfoAdSyncConf
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateAssignV2RequestDemandInfoAdSyncConf
  */
  public static StarDemandCreateAssignV2RequestDemandInfoAdSyncConf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateAssignV2RequestDemandInfoAdSyncConf.class);
  }

 /**
  * Convert an instance of StarDemandCreateAssignV2RequestDemandInfoAdSyncConf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

