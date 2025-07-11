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
 * 星广联投短剧版任务小程序相关信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo {
  public static final String SERIALIZED_NAME_MICRO_APP_ID = "micro_app_id";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_ID)
  private String microAppId = null;

  public static final String SERIALIZED_NAME_MICRO_APP_NAME = "micro_app_name";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_NAME)
  private String microAppName = null;

  public static final String SERIALIZED_NAME_MICRO_APP_PATH = "micro_app_path";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_PATH)
  private String microAppPath = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ALBUM_ID = "star_task_album_id";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ALBUM_ID)
  private String starTaskAlbumId = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ALBUM_NAME = "star_task_album_name";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ALBUM_NAME)
  private String starTaskAlbumName = null;

  public StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo() {
  }

  public StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo microAppId(String microAppId) {
    
    this.microAppId = microAppId;
    return this;
  }

   /**
   * 星图任务内的字节小程序ID
   * @return microAppId
  **/
  @javax.annotation.Nullable
  public String getMicroAppId() {
    return microAppId;
  }


  public void setMicroAppId(String microAppId) {
    this.microAppId = microAppId;
  }


  public StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo microAppName(String microAppName) {
    
    this.microAppName = microAppName;
    return this;
  }

   /**
   * 字节小程序名称，即星图任务内的组件标题
   * @return microAppName
  **/
  @javax.annotation.Nullable
  public String getMicroAppName() {
    return microAppName;
  }


  public void setMicroAppName(String microAppName) {
    this.microAppName = microAppName;
  }


  public StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo microAppPath(String microAppPath) {
    
    this.microAppPath = microAppPath;
    return this;
  }

   /**
   * 小程序页面地址
   * @return microAppPath
  **/
  @javax.annotation.Nullable
  public String getMicroAppPath() {
    return microAppPath;
  }


  public void setMicroAppPath(String microAppPath) {
    this.microAppPath = microAppPath;
  }


  public StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo starTaskAlbumId(String starTaskAlbumId) {
    
    this.starTaskAlbumId = starTaskAlbumId;
    return this;
  }

   /**
   * 短剧剧目id
   * @return starTaskAlbumId
  **/
  @javax.annotation.Nullable
  public String getStarTaskAlbumId() {
    return starTaskAlbumId;
  }


  public void setStarTaskAlbumId(String starTaskAlbumId) {
    this.starTaskAlbumId = starTaskAlbumId;
  }


  public StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo starTaskAlbumName(String starTaskAlbumName) {
    
    this.starTaskAlbumName = starTaskAlbumName;
    return this;
  }

   /**
   * 短剧剧目名称
   * @return starTaskAlbumName
  **/
  @javax.annotation.Nullable
  public String getStarTaskAlbumName() {
    return starTaskAlbumName;
  }


  public void setStarTaskAlbumName(String starTaskAlbumName) {
    this.starTaskAlbumName = starTaskAlbumName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo stardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo = (StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo) o;
    return Objects.equals(this.microAppId, stardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo.microAppId) &&
        Objects.equals(this.microAppName, stardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo.microAppName) &&
        Objects.equals(this.microAppPath, stardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo.microAppPath) &&
        Objects.equals(this.starTaskAlbumId, stardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo.starTaskAlbumId) &&
        Objects.equals(this.starTaskAlbumName, stardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo.starTaskAlbumName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(microAppId, microAppName, microAppPath, starTaskAlbumId, starTaskAlbumName);
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
    sb.append("class StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo {\n");
    sb.append("    microAppId: ").append(toIndentedString(microAppId)).append("\n");
    sb.append("    microAppName: ").append(toIndentedString(microAppName)).append("\n");
    sb.append("    microAppPath: ").append(toIndentedString(microAppPath)).append("\n");
    sb.append("    starTaskAlbumId: ").append(toIndentedString(starTaskAlbumId)).append("\n");
    sb.append("    starTaskAlbumName: ").append(toIndentedString(starTaskAlbumName)).append("\n");
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
    openapiFields.add("micro_app_id");
    openapiFields.add("micro_app_name");
    openapiFields.add("micro_app_path");
    openapiFields.add("star_task_album_id");
    openapiFields.add("star_task_album_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo
  */
  public static StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo.class);
  }

 /**
  * Convert an instance of StardeliveryTaskDetailV30ResponseDataStarTaskAlbumMicroAppInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

