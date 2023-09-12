/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryType;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoDeliveryRangeUnionVideoType;
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
 * 广告版位
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-12T21:46:42.940450772+08:00[Asia/Shanghai]")
public class AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange {
  public static final String SERIALIZED_NAME_INVENTORY_CATALOG = "inventory_catalog";
  @SerializedName(SERIALIZED_NAME_INVENTORY_CATALOG)
  private AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog inventoryCatalog = null;

  public static final String SERIALIZED_NAME_INVENTORY_TYPE = "inventory_type";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TYPE)
  private List<AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryType> inventoryType = null;

  public static final String SERIALIZED_NAME_UNION_VIDEO_TYPE = "union_video_type";
  @SerializedName(SERIALIZED_NAME_UNION_VIDEO_TYPE)
  private AdlabGroupDetailV30DataDataAdInfoDeliveryRangeUnionVideoType unionVideoType = null;

  public AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange() {
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange inventoryCatalog(AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog inventoryCatalog) {
    
    this.inventoryCatalog = inventoryCatalog;
    return this;
  }

   /**
   * Get inventoryCatalog
   * @return inventoryCatalog
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog getInventoryCatalog() {
    return inventoryCatalog;
  }


  public void setInventoryCatalog(AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog inventoryCatalog) {
    this.inventoryCatalog = inventoryCatalog;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange inventoryType(List<AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryType> inventoryType) {
    
    this.inventoryType = inventoryType;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange addInventoryTypeItem(AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryType inventoryTypeItem) {
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
  public List<AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryType> getInventoryType() {
    return inventoryType;
  }


  public void setInventoryType(List<AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryType> inventoryType) {
    this.inventoryType = inventoryType;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange unionVideoType(AdlabGroupDetailV30DataDataAdInfoDeliveryRangeUnionVideoType unionVideoType) {
    
    this.unionVideoType = unionVideoType;
    return this;
  }

   /**
   * Get unionVideoType
   * @return unionVideoType
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoDeliveryRangeUnionVideoType getUnionVideoType() {
    return unionVideoType;
  }


  public void setUnionVideoType(AdlabGroupDetailV30DataDataAdInfoDeliveryRangeUnionVideoType unionVideoType) {
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
    AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange adlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange = (AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange) o;
    return Objects.equals(this.inventoryCatalog, adlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange.inventoryCatalog) &&
        Objects.equals(this.inventoryType, adlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange.inventoryType) &&
        Objects.equals(this.unionVideoType, adlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange.unionVideoType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryCatalog, inventoryType, unionVideoType);
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
    sb.append("class AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange
  */
  public static AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataDataAdInfoDeliveryRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

