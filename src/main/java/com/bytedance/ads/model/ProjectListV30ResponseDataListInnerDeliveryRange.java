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
import com.bytedance.ads.model.ProjectListV30DataListDeliveryRangeInventoryCatalog;
import com.bytedance.ads.model.ProjectListV30DataListDeliveryRangeInventoryType;
import com.bytedance.ads.model.ProjectListV30DataListDeliveryRangeUnionVideoType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ProjectListV30ResponseDataListInnerDeliveryRange {
  public static final String SERIALIZED_NAME_INVENTORY_CATALOG = "inventory_catalog";
  @SerializedName(SERIALIZED_NAME_INVENTORY_CATALOG)
  private ProjectListV30DataListDeliveryRangeInventoryCatalog inventoryCatalog = null;

  public static final String SERIALIZED_NAME_INVENTORY_TYPE = "inventory_type";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TYPE)
  private List<ProjectListV30DataListDeliveryRangeInventoryType> inventoryType = null;

  public static final String SERIALIZED_NAME_UNION_VIDEO_TYPE = "union_video_type";
  @SerializedName(SERIALIZED_NAME_UNION_VIDEO_TYPE)
  private ProjectListV30DataListDeliveryRangeUnionVideoType unionVideoType = null;

  public ProjectListV30ResponseDataListInnerDeliveryRange() {
  }

  public ProjectListV30ResponseDataListInnerDeliveryRange inventoryCatalog(ProjectListV30DataListDeliveryRangeInventoryCatalog inventoryCatalog) {
    
    this.inventoryCatalog = inventoryCatalog;
    return this;
  }

   /**
   * Get inventoryCatalog
   * @return inventoryCatalog
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListDeliveryRangeInventoryCatalog getInventoryCatalog() {
    return inventoryCatalog;
  }


  public void setInventoryCatalog(ProjectListV30DataListDeliveryRangeInventoryCatalog inventoryCatalog) {
    this.inventoryCatalog = inventoryCatalog;
  }


  public ProjectListV30ResponseDataListInnerDeliveryRange inventoryType(List<ProjectListV30DataListDeliveryRangeInventoryType> inventoryType) {
    
    this.inventoryType = inventoryType;
    return this;
  }

  public ProjectListV30ResponseDataListInnerDeliveryRange addInventoryTypeItem(ProjectListV30DataListDeliveryRangeInventoryType inventoryTypeItem) {
    if (this.inventoryType == null) {
      this.inventoryType = new ArrayList<>();
    }
    this.inventoryType.add(inventoryTypeItem);
    return this;
  }

   /**
   * 
   * @return inventoryType
  **/
  @javax.annotation.Nullable
  public List<ProjectListV30DataListDeliveryRangeInventoryType> getInventoryType() {
    return inventoryType;
  }


  public void setInventoryType(List<ProjectListV30DataListDeliveryRangeInventoryType> inventoryType) {
    this.inventoryType = inventoryType;
  }


  public ProjectListV30ResponseDataListInnerDeliveryRange unionVideoType(ProjectListV30DataListDeliveryRangeUnionVideoType unionVideoType) {
    
    this.unionVideoType = unionVideoType;
    return this;
  }

   /**
   * Get unionVideoType
   * @return unionVideoType
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListDeliveryRangeUnionVideoType getUnionVideoType() {
    return unionVideoType;
  }


  public void setUnionVideoType(ProjectListV30DataListDeliveryRangeUnionVideoType unionVideoType) {
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
    ProjectListV30ResponseDataListInnerDeliveryRange projectListV30ResponseDataListInnerDeliveryRange = (ProjectListV30ResponseDataListInnerDeliveryRange) o;
    return Objects.equals(this.inventoryCatalog, projectListV30ResponseDataListInnerDeliveryRange.inventoryCatalog) &&
        Objects.equals(this.inventoryType, projectListV30ResponseDataListInnerDeliveryRange.inventoryType) &&
        Objects.equals(this.unionVideoType, projectListV30ResponseDataListInnerDeliveryRange.unionVideoType);
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
    sb.append("class ProjectListV30ResponseDataListInnerDeliveryRange {\n");
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
       if (!ProjectListV30ResponseDataListInnerDeliveryRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectListV30ResponseDataListInnerDeliveryRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectListV30ResponseDataListInnerDeliveryRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectListV30ResponseDataListInnerDeliveryRange.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectListV30ResponseDataListInnerDeliveryRange>() {
           @Override
           public void write(JsonWriter out, ProjectListV30ResponseDataListInnerDeliveryRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectListV30ResponseDataListInnerDeliveryRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectListV30ResponseDataListInnerDeliveryRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectListV30ResponseDataListInnerDeliveryRange
  * @throws IOException if the JSON string is invalid with respect to ProjectListV30ResponseDataListInnerDeliveryRange
  */
  public static ProjectListV30ResponseDataListInnerDeliveryRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectListV30ResponseDataListInnerDeliveryRange.class);
  }

 /**
  * Convert an instance of ProjectListV30ResponseDataListInnerDeliveryRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

