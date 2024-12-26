/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalProjectListV30DataProjectListPoiInfoAllPoiMode;
import com.bytedance.ads.model.LocalProjectListV30DataProjectListPoiInfoAutoUpdatePois;
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
 * 门店信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class LocalProjectListV30ResponseDataProjectListInnerPoiInfo {
  public static final String SERIALIZED_NAME_ALL_POI_MODE = "all_poi_mode";
  @SerializedName(SERIALIZED_NAME_ALL_POI_MODE)
  private LocalProjectListV30DataProjectListPoiInfoAllPoiMode allPoiMode = null;

  public static final String SERIALIZED_NAME_AUTO_UPDATE_POIS = "auto_update_pois";
  @SerializedName(SERIALIZED_NAME_AUTO_UPDATE_POIS)
  private LocalProjectListV30DataProjectListPoiInfoAutoUpdatePois autoUpdatePois = null;

  public static final String SERIALIZED_NAME_MULTI_POI_NUM = "multi_poi_num";
  @SerializedName(SERIALIZED_NAME_MULTI_POI_NUM)
  private Long multiPoiNum = null;

  public static final String SERIALIZED_NAME_POI_ID = "poi_id";
  @SerializedName(SERIALIZED_NAME_POI_ID)
  private Long poiId = null;

  public static final String SERIALIZED_NAME_POI_IMAGE_URL = "poi_image_url";
  @SerializedName(SERIALIZED_NAME_POI_IMAGE_URL)
  private String poiImageUrl = null;

  public static final String SERIALIZED_NAME_POI_NAME = "poi_name";
  @SerializedName(SERIALIZED_NAME_POI_NAME)
  private String poiName = null;

  public LocalProjectListV30ResponseDataProjectListInnerPoiInfo() {
  }

  public LocalProjectListV30ResponseDataProjectListInnerPoiInfo allPoiMode(LocalProjectListV30DataProjectListPoiInfoAllPoiMode allPoiMode) {
    
    this.allPoiMode = allPoiMode;
    return this;
  }

   /**
   * Get allPoiMode
   * @return allPoiMode
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30DataProjectListPoiInfoAllPoiMode getAllPoiMode() {
    return allPoiMode;
  }


  public void setAllPoiMode(LocalProjectListV30DataProjectListPoiInfoAllPoiMode allPoiMode) {
    this.allPoiMode = allPoiMode;
  }


  public LocalProjectListV30ResponseDataProjectListInnerPoiInfo autoUpdatePois(LocalProjectListV30DataProjectListPoiInfoAutoUpdatePois autoUpdatePois) {
    
    this.autoUpdatePois = autoUpdatePois;
    return this;
  }

   /**
   * Get autoUpdatePois
   * @return autoUpdatePois
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30DataProjectListPoiInfoAutoUpdatePois getAutoUpdatePois() {
    return autoUpdatePois;
  }


  public void setAutoUpdatePois(LocalProjectListV30DataProjectListPoiInfoAutoUpdatePois autoUpdatePois) {
    this.autoUpdatePois = autoUpdatePois;
  }


  public LocalProjectListV30ResponseDataProjectListInnerPoiInfo multiPoiNum(Long multiPoiNum) {
    
    this.multiPoiNum = multiPoiNum;
    return this;
  }

   /**
   * 多门店推广门店数量，仅推广多门店时返回
   * @return multiPoiNum
  **/
  @javax.annotation.Nullable
  public Long getMultiPoiNum() {
    return multiPoiNum;
  }


  public void setMultiPoiNum(Long multiPoiNum) {
    this.multiPoiNum = multiPoiNum;
  }


  public LocalProjectListV30ResponseDataProjectListInnerPoiInfo poiId(Long poiId) {
    
    this.poiId = poiId;
    return this;
  }

   /**
   * 单门店id，仅单门店项目返回，多门店不返回
   * @return poiId
  **/
  @javax.annotation.Nullable
  public Long getPoiId() {
    return poiId;
  }


  public void setPoiId(Long poiId) {
    this.poiId = poiId;
  }


  public LocalProjectListV30ResponseDataProjectListInnerPoiInfo poiImageUrl(String poiImageUrl) {
    
    this.poiImageUrl = poiImageUrl;
    return this;
  }

   /**
   * 单门店头图
   * @return poiImageUrl
  **/
  @javax.annotation.Nullable
  public String getPoiImageUrl() {
    return poiImageUrl;
  }


  public void setPoiImageUrl(String poiImageUrl) {
    this.poiImageUrl = poiImageUrl;
  }


  public LocalProjectListV30ResponseDataProjectListInnerPoiInfo poiName(String poiName) {
    
    this.poiName = poiName;
    return this;
  }

   /**
   * 单门店名称，仅单门店项目返回，多门店不返回
   * @return poiName
  **/
  @javax.annotation.Nullable
  public String getPoiName() {
    return poiName;
  }


  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectListV30ResponseDataProjectListInnerPoiInfo localProjectListV30ResponseDataProjectListInnerPoiInfo = (LocalProjectListV30ResponseDataProjectListInnerPoiInfo) o;
    return Objects.equals(this.allPoiMode, localProjectListV30ResponseDataProjectListInnerPoiInfo.allPoiMode) &&
        Objects.equals(this.autoUpdatePois, localProjectListV30ResponseDataProjectListInnerPoiInfo.autoUpdatePois) &&
        Objects.equals(this.multiPoiNum, localProjectListV30ResponseDataProjectListInnerPoiInfo.multiPoiNum) &&
        Objects.equals(this.poiId, localProjectListV30ResponseDataProjectListInnerPoiInfo.poiId) &&
        Objects.equals(this.poiImageUrl, localProjectListV30ResponseDataProjectListInnerPoiInfo.poiImageUrl) &&
        Objects.equals(this.poiName, localProjectListV30ResponseDataProjectListInnerPoiInfo.poiName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allPoiMode, autoUpdatePois, multiPoiNum, poiId, poiImageUrl, poiName);
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
    sb.append("class LocalProjectListV30ResponseDataProjectListInnerPoiInfo {\n");
    sb.append("    allPoiMode: ").append(toIndentedString(allPoiMode)).append("\n");
    sb.append("    autoUpdatePois: ").append(toIndentedString(autoUpdatePois)).append("\n");
    sb.append("    multiPoiNum: ").append(toIndentedString(multiPoiNum)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiImageUrl: ").append(toIndentedString(poiImageUrl)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
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
    openapiFields.add("all_poi_mode");
    openapiFields.add("auto_update_pois");
    openapiFields.add("multi_poi_num");
    openapiFields.add("poi_id");
    openapiFields.add("poi_image_url");
    openapiFields.add("poi_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectListV30ResponseDataProjectListInnerPoiInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectListV30ResponseDataProjectListInnerPoiInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectListV30ResponseDataProjectListInnerPoiInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectListV30ResponseDataProjectListInnerPoiInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectListV30ResponseDataProjectListInnerPoiInfo>() {
           @Override
           public void write(JsonWriter out, LocalProjectListV30ResponseDataProjectListInnerPoiInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectListV30ResponseDataProjectListInnerPoiInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectListV30ResponseDataProjectListInnerPoiInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectListV30ResponseDataProjectListInnerPoiInfo
  * @throws IOException if the JSON string is invalid with respect to LocalProjectListV30ResponseDataProjectListInnerPoiInfo
  */
  public static LocalProjectListV30ResponseDataProjectListInnerPoiInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectListV30ResponseDataProjectListInnerPoiInfo.class);
  }

 /**
  * Convert an instance of LocalProjectListV30ResponseDataProjectListInnerPoiInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

