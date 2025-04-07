/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAdRaiseVersionGetV2ResponseDataAdRaiseVersionListInner;
import com.bytedance.ads.model.ToolsAdRaiseVersionGetV2ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ToolsAdRaiseVersionGetV2ResponseData {
  public static final String SERIALIZED_NAME_AD_RAISE_VERSION_LIST = "ad_raise_version_list";
  @SerializedName(SERIALIZED_NAME_AD_RAISE_VERSION_LIST)
  private List<ToolsAdRaiseVersionGetV2ResponseDataAdRaiseVersionListInner> adRaiseVersionList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ToolsAdRaiseVersionGetV2ResponseDataPageInfo pageInfo = null;

  public ToolsAdRaiseVersionGetV2ResponseData() {
  }

  public ToolsAdRaiseVersionGetV2ResponseData adRaiseVersionList(List<ToolsAdRaiseVersionGetV2ResponseDataAdRaiseVersionListInner> adRaiseVersionList) {
    
    this.adRaiseVersionList = adRaiseVersionList;
    return this;
  }

  public ToolsAdRaiseVersionGetV2ResponseData addAdRaiseVersionListItem(ToolsAdRaiseVersionGetV2ResponseDataAdRaiseVersionListInner adRaiseVersionListItem) {
    if (this.adRaiseVersionList == null) {
      this.adRaiseVersionList = new ArrayList<>();
    }
    this.adRaiseVersionList.add(adRaiseVersionListItem);
    return this;
  }

   /**
   * 
   * @return adRaiseVersionList
  **/
  @javax.annotation.Nullable
  public List<ToolsAdRaiseVersionGetV2ResponseDataAdRaiseVersionListInner> getAdRaiseVersionList() {
    return adRaiseVersionList;
  }


  public void setAdRaiseVersionList(List<ToolsAdRaiseVersionGetV2ResponseDataAdRaiseVersionListInner> adRaiseVersionList) {
    this.adRaiseVersionList = adRaiseVersionList;
  }


  public ToolsAdRaiseVersionGetV2ResponseData pageInfo(ToolsAdRaiseVersionGetV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ToolsAdRaiseVersionGetV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ToolsAdRaiseVersionGetV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdRaiseVersionGetV2ResponseData toolsAdRaiseVersionGetV2ResponseData = (ToolsAdRaiseVersionGetV2ResponseData) o;
    return Objects.equals(this.adRaiseVersionList, toolsAdRaiseVersionGetV2ResponseData.adRaiseVersionList) &&
        Objects.equals(this.pageInfo, toolsAdRaiseVersionGetV2ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adRaiseVersionList, pageInfo);
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
    sb.append("class ToolsAdRaiseVersionGetV2ResponseData {\n");
    sb.append("    adRaiseVersionList: ").append(toIndentedString(adRaiseVersionList)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("ad_raise_version_list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdRaiseVersionGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdRaiseVersionGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdRaiseVersionGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdRaiseVersionGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdRaiseVersionGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAdRaiseVersionGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdRaiseVersionGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdRaiseVersionGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdRaiseVersionGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAdRaiseVersionGetV2ResponseData
  */
  public static ToolsAdRaiseVersionGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdRaiseVersionGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAdRaiseVersionGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

