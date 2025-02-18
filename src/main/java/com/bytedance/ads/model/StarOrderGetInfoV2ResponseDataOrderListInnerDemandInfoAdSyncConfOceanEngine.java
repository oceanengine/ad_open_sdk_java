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
 * 产出物推送巨量引擎配置信息 投放效果广告（竞价广告）
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine {
  public static final String SERIALIZED_NAME_AD_SYNC = "ad_sync";
  @SerializedName(SERIALIZED_NAME_AD_SYNC)
  private Long adSync = null;

  public static final String SERIALIZED_NAME_AD_SYNC_ORIGIN = "ad_sync_origin";
  @SerializedName(SERIALIZED_NAME_AD_SYNC_ORIGIN)
  private Long adSyncOrigin = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTO_SYNC = "auto_sync";
  @SerializedName(SERIALIZED_NAME_AUTO_SYNC)
  private Long autoSync = null;

  public static final String SERIALIZED_NAME_AUTO_SYNC_SPECIFY_MATERIAL_PLATFORMS = "auto_sync_specify_material_platforms";
  @SerializedName(SERIALIZED_NAME_AUTO_SYNC_SPECIFY_MATERIAL_PLATFORMS)
  private List<Long> autoSyncSpecifyMaterialPlatforms = null;

  public static final String SERIALIZED_NAME_DOU_PLUS_UID = "dou_plus_uid";
  @SerializedName(SERIALIZED_NAME_DOU_PLUS_UID)
  private Long douPlusUid = null;

  public static final String SERIALIZED_NAME_PRODUCT_LINK = "product_link";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINK)
  private String productLink = null;

  public static final String SERIALIZED_NAME_PRODUCT_PICS = "product_pics";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PICS)
  private List<String> productPics = null;

  public static final String SERIALIZED_NAME_SHOP_IDS = "shop_ids";
  @SerializedName(SERIALIZED_NAME_SHOP_IDS)
  private List<Long> shopIds = null;

  public static final String SERIALIZED_NAME_SYNC_DURATION = "sync_duration";
  @SerializedName(SERIALIZED_NAME_SYNC_DURATION)
  private Long syncDuration = null;

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine() {
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine adSync(Long adSync) {
    
    this.adSync = adSync;
    return this;
  }

   /**
   * 用于视频素材投放（头像跳落地页） 2&#x3D;是；1&#x3D;否
   * @return adSync
  **/
  @javax.annotation.Nullable
  public Long getAdSync() {
    return adSync;
  }


  public void setAdSync(Long adSync) {
    this.adSync = adSync;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine adSyncOrigin(Long adSyncOrigin) {
    
    this.adSyncOrigin = adSyncOrigin;
    return this;
  }

   /**
   * 是否投放原生视频 0或不填 &#x3D; 否；1 &#x3D; 是
   * @return adSyncOrigin
  **/
  @javax.annotation.Nullable
  public Long getAdSyncOrigin() {
    return adSyncOrigin;
  }


  public void setAdSyncOrigin(Long adSyncOrigin) {
    this.adSyncOrigin = adSyncOrigin;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine autoSync(Long autoSync) {
    
    this.autoSync = autoSync;
    return this;
  }

   /**
   * 是否自动投放 0或不填 &#x3D; 否；1 &#x3D; 是
   * @return autoSync
  **/
  @javax.annotation.Nullable
  public Long getAutoSync() {
    return autoSync;
  }


  public void setAutoSync(Long autoSync) {
    this.autoSync = autoSync;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine autoSyncSpecifyMaterialPlatforms(List<Long> autoSyncSpecifyMaterialPlatforms) {
    
    this.autoSyncSpecifyMaterialPlatforms = autoSyncSpecifyMaterialPlatforms;
    return this;
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine addAutoSyncSpecifyMaterialPlatformsItem(Long autoSyncSpecifyMaterialPlatformsItem) {
    if (this.autoSyncSpecifyMaterialPlatforms == null) {
      this.autoSyncSpecifyMaterialPlatforms = new ArrayList<>();
    }
    this.autoSyncSpecifyMaterialPlatforms.add(autoSyncSpecifyMaterialPlatformsItem);
    return this;
  }

   /**
   * 自动推送素材包的平台 2-内容热推；3-内容服务 
   * @return autoSyncSpecifyMaterialPlatforms
  **/
  @javax.annotation.Nullable
  public List<Long> getAutoSyncSpecifyMaterialPlatforms() {
    return autoSyncSpecifyMaterialPlatforms;
  }


  public void setAutoSyncSpecifyMaterialPlatforms(List<Long> autoSyncSpecifyMaterialPlatforms) {
    this.autoSyncSpecifyMaterialPlatforms = autoSyncSpecifyMaterialPlatforms;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine douPlusUid(Long douPlusUid) {
    
    this.douPlusUid = douPlusUid;
    return this;
  }

   /**
   * 推DOU+时可以使用此字段完成抖音UID至广告主ID的转换。若存在advertiser_id则忽略该参数。
   * @return douPlusUid
  **/
  @javax.annotation.Nullable
  public Long getDouPlusUid() {
    return douPlusUid;
  }


  public void setDouPlusUid(Long douPlusUid) {
    this.douPlusUid = douPlusUid;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine productLink(String productLink) {
    
    this.productLink = productLink;
    return this;
  }

   /**
   * 推广产品链接
   * @return productLink
  **/
  @javax.annotation.Nullable
  public String getProductLink() {
    return productLink;
  }


  public void setProductLink(String productLink) {
    this.productLink = productLink;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine productPics(List<String> productPics) {
    
    this.productPics = productPics;
    return this;
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine addProductPicsItem(String productPicsItem) {
    if (this.productPics == null) {
      this.productPics = new ArrayList<>();
    }
    this.productPics.add(productPicsItem);
    return this;
  }

   /**
   * 推广产品图片文件名（材料上传接口中使用到的文件名）
   * @return productPics
  **/
  @javax.annotation.Nullable
  public List<String> getProductPics() {
    return productPics;
  }


  public void setProductPics(List<String> productPics) {
    this.productPics = productPics;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine shopIds(List<Long> shopIds) {
    
    this.shopIds = shopIds;
    return this;
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine addShopIdsItem(Long shopIdsItem) {
    if (this.shopIds == null) {
      this.shopIds = new ArrayList<>();
    }
    this.shopIds.add(shopIdsItem);
    return this;
  }

   /**
   * 抖店商家后台店铺ID列表
   * @return shopIds
  **/
  @javax.annotation.Nullable
  public List<Long> getShopIds() {
    return shopIds;
  }


  public void setShopIds(List<Long> shopIds) {
    this.shopIds = shopIds;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine syncDuration(Long syncDuration) {
    
    this.syncDuration = syncDuration;
    return this;
  }

   /**
   * 投放原生视频的投放时间（单位：天）
   * @return syncDuration
  **/
  @javax.annotation.Nullable
  public Long getSyncDuration() {
    return syncDuration;
  }


  public void setSyncDuration(Long syncDuration) {
    this.syncDuration = syncDuration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine = (StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine) o;
    return Objects.equals(this.adSync, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.adSync) &&
        Objects.equals(this.adSyncOrigin, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.adSyncOrigin) &&
        Objects.equals(this.advertiserId, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.advertiserId) &&
        Objects.equals(this.autoSync, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.autoSync) &&
        Objects.equals(this.autoSyncSpecifyMaterialPlatforms, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.autoSyncSpecifyMaterialPlatforms) &&
        Objects.equals(this.douPlusUid, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.douPlusUid) &&
        Objects.equals(this.productLink, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.productLink) &&
        Objects.equals(this.productPics, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.productPics) &&
        Objects.equals(this.shopIds, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.shopIds) &&
        Objects.equals(this.syncDuration, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.syncDuration);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adSync, adSyncOrigin, advertiserId, autoSync, autoSyncSpecifyMaterialPlatforms, douPlusUid, productLink, productPics, shopIds, syncDuration);
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
    sb.append("class StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine {\n");
    sb.append("    adSync: ").append(toIndentedString(adSync)).append("\n");
    sb.append("    adSyncOrigin: ").append(toIndentedString(adSyncOrigin)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    autoSync: ").append(toIndentedString(autoSync)).append("\n");
    sb.append("    autoSyncSpecifyMaterialPlatforms: ").append(toIndentedString(autoSyncSpecifyMaterialPlatforms)).append("\n");
    sb.append("    douPlusUid: ").append(toIndentedString(douPlusUid)).append("\n");
    sb.append("    productLink: ").append(toIndentedString(productLink)).append("\n");
    sb.append("    productPics: ").append(toIndentedString(productPics)).append("\n");
    sb.append("    shopIds: ").append(toIndentedString(shopIds)).append("\n");
    sb.append("    syncDuration: ").append(toIndentedString(syncDuration)).append("\n");
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
    openapiFields.add("ad_sync");
    openapiFields.add("ad_sync_origin");
    openapiFields.add("advertiser_id");
    openapiFields.add("auto_sync");
    openapiFields.add("auto_sync_specify_material_platforms");
    openapiFields.add("dou_plus_uid");
    openapiFields.add("product_link");
    openapiFields.add("product_pics");
    openapiFields.add("shop_ids");
    openapiFields.add("sync_duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine>() {
           @Override
           public void write(JsonWriter out, StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine
  */
  public static StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine.class);
  }

 /**
  * Convert an instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConfOceanEngine to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

