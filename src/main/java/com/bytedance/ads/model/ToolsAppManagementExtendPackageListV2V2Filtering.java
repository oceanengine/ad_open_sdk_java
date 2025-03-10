/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2V2FilteringStatus;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2V2FilteringUpdateTime;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class ToolsAppManagementExtendPackageListV2V2Filtering {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private List<String> channelId = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsAppManagementExtendPackageListV2V2FilteringStatus status = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private ToolsAppManagementExtendPackageListV2V2FilteringUpdateTime updateTime = null;

  public ToolsAppManagementExtendPackageListV2V2Filtering() {
  }

  public ToolsAppManagementExtendPackageListV2V2Filtering channelId(List<String> channelId) {
    
    this.channelId = channelId;
    return this;
  }

  public ToolsAppManagementExtendPackageListV2V2Filtering addChannelIdItem(String channelIdItem) {
    if (this.channelId == null) {
      this.channelId = new ArrayList<>();
    }
    this.channelId.add(channelIdItem);
    return this;
  }

   /**
   * 渠道号 可通过渠道号筛选应用分包，单次支持传入渠道号个数&lt;&#x3D;50
   * @return channelId
  **/
  @javax.annotation.Nullable
  public List<String> getChannelId() {
    return channelId;
  }


  public void setChannelId(List<String> channelId) {
    this.channelId = channelId;
  }


  public ToolsAppManagementExtendPackageListV2V2Filtering status(ToolsAppManagementExtendPackageListV2V2FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementExtendPackageListV2V2FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsAppManagementExtendPackageListV2V2FilteringStatus status) {
    this.status = status;
  }


  public ToolsAppManagementExtendPackageListV2V2Filtering updateTime(ToolsAppManagementExtendPackageListV2V2FilteringUpdateTime updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementExtendPackageListV2V2FilteringUpdateTime getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(ToolsAppManagementExtendPackageListV2V2FilteringUpdateTime updateTime) {
    this.updateTime = updateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementExtendPackageListV2V2Filtering toolsAppManagementExtendPackageListV2V2Filtering = (ToolsAppManagementExtendPackageListV2V2Filtering) o;
    return Objects.equals(this.channelId, toolsAppManagementExtendPackageListV2V2Filtering.channelId) &&
        Objects.equals(this.status, toolsAppManagementExtendPackageListV2V2Filtering.status) &&
        Objects.equals(this.updateTime, toolsAppManagementExtendPackageListV2V2Filtering.updateTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, status, updateTime);
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
    sb.append("class ToolsAppManagementExtendPackageListV2V2Filtering {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("channel_id");
    openapiFields.add("status");
    openapiFields.add("update_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementExtendPackageListV2V2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementExtendPackageListV2V2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementExtendPackageListV2V2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementExtendPackageListV2V2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementExtendPackageListV2V2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementExtendPackageListV2V2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementExtendPackageListV2V2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementExtendPackageListV2V2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementExtendPackageListV2V2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementExtendPackageListV2V2Filtering
  */
  public static ToolsAppManagementExtendPackageListV2V2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementExtendPackageListV2V2Filtering.class);
  }

 /**
  * Convert an instance of ToolsAppManagementExtendPackageListV2V2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

