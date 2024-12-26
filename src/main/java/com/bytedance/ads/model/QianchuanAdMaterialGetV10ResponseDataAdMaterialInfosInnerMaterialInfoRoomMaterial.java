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
 * 直播间画面用户信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial {
  public static final String SERIALIZED_NAME_AWEME_AVATAR = "aweme_avatar";
  @SerializedName(SERIALIZED_NAME_AWEME_AVATAR)
  private String awemeAvatar = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial() {
  }

  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial awemeAvatar(String awemeAvatar) {
    
    this.awemeAvatar = awemeAvatar;
    return this;
  }

   /**
   * 
   * @return awemeAvatar
  **/
  @javax.annotation.Nullable
  public String getAwemeAvatar() {
    return awemeAvatar;
  }


  public void setAwemeAvatar(String awemeAvatar) {
    this.awemeAvatar = awemeAvatar;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial = (QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial) o;
    return Objects.equals(this.awemeAvatar, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.awemeAvatar) &&
        Objects.equals(this.id, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.id) &&
        Objects.equals(this.name, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeAvatar, id, name);
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
    sb.append("class QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial {\n");
    sb.append("    awemeAvatar: ").append(toIndentedString(awemeAvatar)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("aweme_avatar");
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial
  */
  public static QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial.class);
  }

 /**
  * Convert an instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

