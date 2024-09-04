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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ReportProductDailyAsyncTaskCreateV30RequestFiltering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private String deepExternalAction = null;

  public static final String SERIALIZED_NAME_DPA_VIDEO_TID = "dpa_video_tid";
  @SerializedName(SERIALIZED_NAME_DPA_VIDEO_TID)
  private Long dpaVideoTid = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private String externalAction = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_SHOW_APP_NAME = "show_app_name";
  @SerializedName(SERIALIZED_NAME_SHOW_APP_NAME)
  private String showAppName = null;

  public ReportProductDailyAsyncTaskCreateV30RequestFiltering() {
  }

  public ReportProductDailyAsyncTaskCreateV30RequestFiltering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public ReportProductDailyAsyncTaskCreateV30RequestFiltering addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public ReportProductDailyAsyncTaskCreateV30RequestFiltering deepExternalAction(String deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * 
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public String getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(String deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public ReportProductDailyAsyncTaskCreateV30RequestFiltering dpaVideoTid(Long dpaVideoTid) {
    
    this.dpaVideoTid = dpaVideoTid;
    return this;
  }

   /**
   * 
   * @return dpaVideoTid
  **/
  @javax.annotation.Nullable
  public Long getDpaVideoTid() {
    return dpaVideoTid;
  }


  public void setDpaVideoTid(Long dpaVideoTid) {
    this.dpaVideoTid = dpaVideoTid;
  }


  public ReportProductDailyAsyncTaskCreateV30RequestFiltering externalAction(String externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * 
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public String getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(String externalAction) {
    this.externalAction = externalAction;
  }


  public ReportProductDailyAsyncTaskCreateV30RequestFiltering productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public ReportProductDailyAsyncTaskCreateV30RequestFiltering showAppName(String showAppName) {
    
    this.showAppName = showAppName;
    return this;
  }

   /**
   * 
   * @return showAppName
  **/
  @javax.annotation.Nullable
  public String getShowAppName() {
    return showAppName;
  }


  public void setShowAppName(String showAppName) {
    this.showAppName = showAppName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportProductDailyAsyncTaskCreateV30RequestFiltering reportProductDailyAsyncTaskCreateV30RequestFiltering = (ReportProductDailyAsyncTaskCreateV30RequestFiltering) o;
    return Objects.equals(this.adIds, reportProductDailyAsyncTaskCreateV30RequestFiltering.adIds) &&
        Objects.equals(this.deepExternalAction, reportProductDailyAsyncTaskCreateV30RequestFiltering.deepExternalAction) &&
        Objects.equals(this.dpaVideoTid, reportProductDailyAsyncTaskCreateV30RequestFiltering.dpaVideoTid) &&
        Objects.equals(this.externalAction, reportProductDailyAsyncTaskCreateV30RequestFiltering.externalAction) &&
        Objects.equals(this.productId, reportProductDailyAsyncTaskCreateV30RequestFiltering.productId) &&
        Objects.equals(this.showAppName, reportProductDailyAsyncTaskCreateV30RequestFiltering.showAppName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, deepExternalAction, dpaVideoTid, externalAction, productId, showAppName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportProductDailyAsyncTaskCreateV30RequestFiltering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    dpaVideoTid: ").append(toIndentedString(dpaVideoTid)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    showAppName: ").append(toIndentedString(showAppName)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("deep_external_action");
    openapiFields.add("dpa_video_tid");
    openapiFields.add("external_action");
    openapiFields.add("product_id");
    openapiFields.add("show_app_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportProductDailyAsyncTaskCreateV30RequestFiltering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportProductDailyAsyncTaskCreateV30RequestFiltering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportProductDailyAsyncTaskCreateV30RequestFiltering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportProductDailyAsyncTaskCreateV30RequestFiltering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportProductDailyAsyncTaskCreateV30RequestFiltering>() {
           @Override
           public void write(JsonWriter out, ReportProductDailyAsyncTaskCreateV30RequestFiltering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportProductDailyAsyncTaskCreateV30RequestFiltering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportProductDailyAsyncTaskCreateV30RequestFiltering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportProductDailyAsyncTaskCreateV30RequestFiltering
  * @throws IOException if the JSON string is invalid with respect to ReportProductDailyAsyncTaskCreateV30RequestFiltering
  */
  public static ReportProductDailyAsyncTaskCreateV30RequestFiltering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportProductDailyAsyncTaskCreateV30RequestFiltering.class);
  }

 /**
  * Convert an instance of ReportProductDailyAsyncTaskCreateV30RequestFiltering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

