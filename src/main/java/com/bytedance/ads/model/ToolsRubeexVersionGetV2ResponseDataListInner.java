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
 * ToolsRubeexVersionGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class ToolsRubeexVersionGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_DATA_MD5 = "data_md5";
  @SerializedName(SERIALIZED_NAME_DATA_MD5)
  private String dataMd5 = null;

  public static final String SERIALIZED_NAME_FIRST_LAUNCH_DATE = "first_launch_date";
  @SerializedName(SERIALIZED_NAME_FIRST_LAUNCH_DATE)
  private String firstLaunchDate = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public ToolsRubeexVersionGetV2ResponseDataListInner() {
  }

  public ToolsRubeexVersionGetV2ResponseDataListInner dataMd5(String dataMd5) {
    
    this.dataMd5 = dataMd5;
    return this;
  }

   /**
   * data_md5指rubeex工具产出的试玩素材作品版本，一个rubeex试玩素材可能有多个作品版本
   * @return dataMd5
  **/
  @javax.annotation.Nullable
  public String getDataMd5() {
    return dataMd5;
  }


  public void setDataMd5(String dataMd5) {
    this.dataMd5 = dataMd5;
  }


  public ToolsRubeexVersionGetV2ResponseDataListInner firstLaunchDate(String firstLaunchDate) {
    
    this.firstLaunchDate = firstLaunchDate;
    return this;
  }

   /**
   * 首次创建时间
   * @return firstLaunchDate
  **/
  @javax.annotation.Nullable
  public String getFirstLaunchDate() {
    return firstLaunchDate;
  }


  public void setFirstLaunchDate(String firstLaunchDate) {
    this.firstLaunchDate = firstLaunchDate;
  }


  public ToolsRubeexVersionGetV2ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 版本对应作品名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsRubeexVersionGetV2ResponseDataListInner playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 素材url
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsRubeexVersionGetV2ResponseDataListInner toolsRubeexVersionGetV2ResponseDataListInner = (ToolsRubeexVersionGetV2ResponseDataListInner) o;
    return Objects.equals(this.dataMd5, toolsRubeexVersionGetV2ResponseDataListInner.dataMd5) &&
        Objects.equals(this.firstLaunchDate, toolsRubeexVersionGetV2ResponseDataListInner.firstLaunchDate) &&
        Objects.equals(this.name, toolsRubeexVersionGetV2ResponseDataListInner.name) &&
        Objects.equals(this.playableUrl, toolsRubeexVersionGetV2ResponseDataListInner.playableUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataMd5, firstLaunchDate, name, playableUrl);
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
    sb.append("class ToolsRubeexVersionGetV2ResponseDataListInner {\n");
    sb.append("    dataMd5: ").append(toIndentedString(dataMd5)).append("\n");
    sb.append("    firstLaunchDate: ").append(toIndentedString(firstLaunchDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
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
    openapiFields.add("data_md5");
    openapiFields.add("first_launch_date");
    openapiFields.add("name");
    openapiFields.add("playable_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsRubeexVersionGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsRubeexVersionGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsRubeexVersionGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsRubeexVersionGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsRubeexVersionGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsRubeexVersionGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsRubeexVersionGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsRubeexVersionGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsRubeexVersionGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsRubeexVersionGetV2ResponseDataListInner
  */
  public static ToolsRubeexVersionGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsRubeexVersionGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsRubeexVersionGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

