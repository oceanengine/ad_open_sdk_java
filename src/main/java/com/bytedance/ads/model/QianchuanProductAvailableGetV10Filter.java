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
import com.bytedance.ads.model.QianchuanProductAvailableGetV10FilterMarketingScene;
import com.bytedance.ads.model.QianchuanProductAvailableGetV10FilterTab;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanProductAvailableGetV10Filter {
  public static final String SERIALIZED_NAME_IS_ADLAB = "is_adlab";
  @SerializedName(SERIALIZED_NAME_IS_ADLAB)
  private Boolean isAdlab = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private QianchuanProductAvailableGetV10FilterMarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "product_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<Long> productIds = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_TAB = "tab";
  @SerializedName(SERIALIZED_NAME_TAB)
  private QianchuanProductAvailableGetV10FilterTab tab = null;

  public QianchuanProductAvailableGetV10Filter() {
  }

  public QianchuanProductAvailableGetV10Filter isAdlab(Boolean isAdlab) {
    
    this.isAdlab = isAdlab;
    return this;
  }

   /**
   * 是否托管
   * @return isAdlab
  **/
  @javax.annotation.Nullable
  public Boolean getIsAdlab() {
    return isAdlab;
  }


  public void setIsAdlab(Boolean isAdlab) {
    this.isAdlab = isAdlab;
  }


  public QianchuanProductAvailableGetV10Filter marketingScene(QianchuanProductAvailableGetV10FilterMarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public QianchuanProductAvailableGetV10FilterMarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(QianchuanProductAvailableGetV10FilterMarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public QianchuanProductAvailableGetV10Filter productIds(List<Long> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public QianchuanProductAvailableGetV10Filter addProductIdsItem(Long productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * 
   * @return productIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<Long> productIds) {
    this.productIds = productIds;
  }


  public QianchuanProductAvailableGetV10Filter productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public QianchuanProductAvailableGetV10Filter tab(QianchuanProductAvailableGetV10FilterTab tab) {
    
    this.tab = tab;
    return this;
  }

   /**
   * Get tab
   * @return tab
  **/
  @javax.annotation.Nullable
  public QianchuanProductAvailableGetV10FilterTab getTab() {
    return tab;
  }


  public void setTab(QianchuanProductAvailableGetV10FilterTab tab) {
    this.tab = tab;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanProductAvailableGetV10Filter qianchuanProductAvailableGetV10Filter = (QianchuanProductAvailableGetV10Filter) o;
    return Objects.equals(this.isAdlab, qianchuanProductAvailableGetV10Filter.isAdlab) &&
        Objects.equals(this.marketingScene, qianchuanProductAvailableGetV10Filter.marketingScene) &&
        Objects.equals(this.productIds, qianchuanProductAvailableGetV10Filter.productIds) &&
        Objects.equals(this.productName, qianchuanProductAvailableGetV10Filter.productName) &&
        Objects.equals(this.tab, qianchuanProductAvailableGetV10Filter.tab);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAdlab, marketingScene, productIds, productName, tab);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanProductAvailableGetV10Filter {\n");
    sb.append("    isAdlab: ").append(toIndentedString(isAdlab)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    tab: ").append(toIndentedString(tab)).append("\n");
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
    openapiFields.add("is_adlab");
    openapiFields.add("marketing_scene");
    openapiFields.add("product_ids");
    openapiFields.add("product_name");
    openapiFields.add("tab");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanProductAvailableGetV10Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanProductAvailableGetV10Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanProductAvailableGetV10Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanProductAvailableGetV10Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanProductAvailableGetV10Filter>() {
           @Override
           public void write(JsonWriter out, QianchuanProductAvailableGetV10Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanProductAvailableGetV10Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanProductAvailableGetV10Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanProductAvailableGetV10Filter
  * @throws IOException if the JSON string is invalid with respect to QianchuanProductAvailableGetV10Filter
  */
  public static QianchuanProductAvailableGetV10Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanProductAvailableGetV10Filter.class);
  }

 /**
  * Convert an instance of QianchuanProductAvailableGetV10Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

