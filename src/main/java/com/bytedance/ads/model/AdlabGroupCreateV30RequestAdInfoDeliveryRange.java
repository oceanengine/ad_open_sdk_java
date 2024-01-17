/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoDeliveryRangeInventoryCatalog;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoDeliveryRangeInventoryType;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoDeliveryRangeUnionVideoType;
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
 * 广告版位
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class AdlabGroupCreateV30RequestAdInfoDeliveryRange {
  public static final String SERIALIZED_NAME_INVENTORY_CATALOG = "inventory_catalog";
  @SerializedName(SERIALIZED_NAME_INVENTORY_CATALOG)
  private AdlabGroupCreateV30AdInfoDeliveryRangeInventoryCatalog inventoryCatalog = null;

  public static final String SERIALIZED_NAME_INVENTORY_TYPE = "inventory_type";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TYPE)
  private List<AdlabGroupCreateV30AdInfoDeliveryRangeInventoryType> inventoryType = null;

  public static final String SERIALIZED_NAME_UNION_VIDEO_TYPE = "union_video_type";
  @SerializedName(SERIALIZED_NAME_UNION_VIDEO_TYPE)
  private AdlabGroupCreateV30AdInfoDeliveryRangeUnionVideoType unionVideoType = null;

  public AdlabGroupCreateV30RequestAdInfoDeliveryRange() {
  }

  public AdlabGroupCreateV30RequestAdInfoDeliveryRange inventoryCatalog(AdlabGroupCreateV30AdInfoDeliveryRangeInventoryCatalog inventoryCatalog) {
    
    this.inventoryCatalog = inventoryCatalog;
    return this;
  }

   /**
   * Get inventoryCatalog
   * @return inventoryCatalog
  **/
  @javax.annotation.Nonnull
  public AdlabGroupCreateV30AdInfoDeliveryRangeInventoryCatalog getInventoryCatalog() {
    return inventoryCatalog;
  }


  public void setInventoryCatalog(AdlabGroupCreateV30AdInfoDeliveryRangeInventoryCatalog inventoryCatalog) {
    this.inventoryCatalog = inventoryCatalog;
  }


  public AdlabGroupCreateV30RequestAdInfoDeliveryRange inventoryType(List<AdlabGroupCreateV30AdInfoDeliveryRangeInventoryType> inventoryType) {
    
    this.inventoryType = inventoryType;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfoDeliveryRange addInventoryTypeItem(AdlabGroupCreateV30AdInfoDeliveryRangeInventoryType inventoryTypeItem) {
    if (this.inventoryType == null) {
      this.inventoryType = new ArrayList<>();
    }
    this.inventoryType.add(inventoryTypeItem);
    return this;
  }

   /**
   * 广告投放位置（首选媒体）
   * @return inventoryType
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupCreateV30AdInfoDeliveryRangeInventoryType> getInventoryType() {
    return inventoryType;
  }


  public void setInventoryType(List<AdlabGroupCreateV30AdInfoDeliveryRangeInventoryType> inventoryType) {
    this.inventoryType = inventoryType;
  }


  public AdlabGroupCreateV30RequestAdInfoDeliveryRange unionVideoType(AdlabGroupCreateV30AdInfoDeliveryRangeUnionVideoType unionVideoType) {
    
    this.unionVideoType = unionVideoType;
    return this;
  }

   /**
   * Get unionVideoType
   * @return unionVideoType
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoDeliveryRangeUnionVideoType getUnionVideoType() {
    return unionVideoType;
  }


  public void setUnionVideoType(AdlabGroupCreateV30AdInfoDeliveryRangeUnionVideoType unionVideoType) {
    this.unionVideoType = unionVideoType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupCreateV30RequestAdInfoDeliveryRange adlabGroupCreateV30RequestAdInfoDeliveryRange = (AdlabGroupCreateV30RequestAdInfoDeliveryRange) o;
    return Objects.equals(this.inventoryCatalog, adlabGroupCreateV30RequestAdInfoDeliveryRange.inventoryCatalog) &&
        Objects.equals(this.inventoryType, adlabGroupCreateV30RequestAdInfoDeliveryRange.inventoryType) &&
        Objects.equals(this.unionVideoType, adlabGroupCreateV30RequestAdInfoDeliveryRange.unionVideoType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryCatalog, inventoryType, unionVideoType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupCreateV30RequestAdInfoDeliveryRange {\n");
    sb.append("    inventoryCatalog: ").append(toIndentedString(inventoryCatalog)).append("\n");
    sb.append("    inventoryType: ").append(toIndentedString(inventoryType)).append("\n");
    sb.append("    unionVideoType: ").append(toIndentedString(unionVideoType)).append("\n");
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
    openapiFields.add("inventory_catalog");
    openapiFields.add("inventory_type");
    openapiFields.add("union_video_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inventory_catalog");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupCreateV30RequestAdInfoDeliveryRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupCreateV30RequestAdInfoDeliveryRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupCreateV30RequestAdInfoDeliveryRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupCreateV30RequestAdInfoDeliveryRange.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupCreateV30RequestAdInfoDeliveryRange>() {
           @Override
           public void write(JsonWriter out, AdlabGroupCreateV30RequestAdInfoDeliveryRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupCreateV30RequestAdInfoDeliveryRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupCreateV30RequestAdInfoDeliveryRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupCreateV30RequestAdInfoDeliveryRange
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupCreateV30RequestAdInfoDeliveryRange
  */
  public static AdlabGroupCreateV30RequestAdInfoDeliveryRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupCreateV30RequestAdInfoDeliveryRange.class);
  }

 /**
  * Convert an instance of AdlabGroupCreateV30RequestAdInfoDeliveryRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

