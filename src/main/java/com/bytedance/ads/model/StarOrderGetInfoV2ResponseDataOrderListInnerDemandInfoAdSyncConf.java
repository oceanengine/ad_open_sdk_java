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
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfContentMarketing;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfDouPlus;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfEcomShop;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfLocalPromotion;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfQianchuan;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf {
  public static final String SERIALIZED_NAME_CONTENT_MARKETING = "content_marketing";
  @SerializedName(SERIALIZED_NAME_CONTENT_MARKETING)
  private StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfContentMarketing contentMarketing = null;

  public static final String SERIALIZED_NAME_DOU_PLUS = "dou_plus";
  @SerializedName(SERIALIZED_NAME_DOU_PLUS)
  private StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfDouPlus douPlus = null;

  public static final String SERIALIZED_NAME_ECOM_SHOP = "ecom_shop";
  @SerializedName(SERIALIZED_NAME_ECOM_SHOP)
  private StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfEcomShop ecomShop = null;

  public static final String SERIALIZED_NAME_LOCAL_PROMOTION = "local_promotion";
  @SerializedName(SERIALIZED_NAME_LOCAL_PROMOTION)
  private StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfLocalPromotion localPromotion = null;

  public static final String SERIALIZED_NAME_OCEAN_ENGINE = "ocean_engine";
  @SerializedName(SERIALIZED_NAME_OCEAN_ENGINE)
  private StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine oceanEngine = null;

  public static final String SERIALIZED_NAME_QIANCHUAN = "qianchuan";
  @SerializedName(SERIALIZED_NAME_QIANCHUAN)
  private StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfQianchuan qianchuan = null;

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf() {
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf contentMarketing(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfContentMarketing contentMarketing) {
    
    this.contentMarketing = contentMarketing;
    return this;
  }

   /**
   * Get contentMarketing
   * @return contentMarketing
  **/
  @javax.annotation.Nullable
  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfContentMarketing getContentMarketing() {
    return contentMarketing;
  }


  public void setContentMarketing(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfContentMarketing contentMarketing) {
    this.contentMarketing = contentMarketing;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf douPlus(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfDouPlus douPlus) {
    
    this.douPlus = douPlus;
    return this;
  }

   /**
   * Get douPlus
   * @return douPlus
  **/
  @javax.annotation.Nullable
  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfDouPlus getDouPlus() {
    return douPlus;
  }


  public void setDouPlus(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfDouPlus douPlus) {
    this.douPlus = douPlus;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf ecomShop(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfEcomShop ecomShop) {
    
    this.ecomShop = ecomShop;
    return this;
  }

   /**
   * Get ecomShop
   * @return ecomShop
  **/
  @javax.annotation.Nullable
  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfEcomShop getEcomShop() {
    return ecomShop;
  }


  public void setEcomShop(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfEcomShop ecomShop) {
    this.ecomShop = ecomShop;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf localPromotion(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfLocalPromotion localPromotion) {
    
    this.localPromotion = localPromotion;
    return this;
  }

   /**
   * Get localPromotion
   * @return localPromotion
  **/
  @javax.annotation.Nullable
  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfLocalPromotion getLocalPromotion() {
    return localPromotion;
  }


  public void setLocalPromotion(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfLocalPromotion localPromotion) {
    this.localPromotion = localPromotion;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf oceanEngine(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine oceanEngine) {
    
    this.oceanEngine = oceanEngine;
    return this;
  }

   /**
   * Get oceanEngine
   * @return oceanEngine
  **/
  @javax.annotation.Nullable
  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine getOceanEngine() {
    return oceanEngine;
  }


  public void setOceanEngine(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine oceanEngine) {
    this.oceanEngine = oceanEngine;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf qianchuan(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfQianchuan qianchuan) {
    
    this.qianchuan = qianchuan;
    return this;
  }

   /**
   * Get qianchuan
   * @return qianchuan
  **/
  @javax.annotation.Nullable
  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfQianchuan getQianchuan() {
    return qianchuan;
  }


  public void setQianchuan(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfQianchuan qianchuan) {
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
    StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf = (StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf) o;
    return Objects.equals(this.contentMarketing, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf.contentMarketing) &&
        Objects.equals(this.douPlus, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf.douPlus) &&
        Objects.equals(this.ecomShop, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf.ecomShop) &&
        Objects.equals(this.localPromotion, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf.localPromotion) &&
        Objects.equals(this.oceanEngine, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf.oceanEngine) &&
        Objects.equals(this.qianchuan, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf.qianchuan);
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
    sb.append("class StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf {\n");
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
       if (!StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf>() {
           @Override
           public void write(JsonWriter out, StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf
  */
  public static StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf.class);
  }

 /**
  * Convert an instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

