/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
 * QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner {
  public static final String SERIALIZED_NAME_ANCHOR_AVATAR = "anchor_avatar";
  @SerializedName(SERIALIZED_NAME_ANCHOR_AVATAR)
  private String anchorAvatar = null;

  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private Long anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_NAME = "anchor_name";
  @SerializedName(SERIALIZED_NAME_ANCHOR_NAME)
  private String anchorName = null;

  public QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner() {
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner anchorAvatar(String anchorAvatar) {
    
    this.anchorAvatar = anchorAvatar;
    return this;
  }

   /**
   * 
   * @return anchorAvatar
  **/
  @javax.annotation.Nullable
  public String getAnchorAvatar() {
    return anchorAvatar;
  }


  public void setAnchorAvatar(String anchorAvatar) {
    this.anchorAvatar = anchorAvatar;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner anchorId(Long anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 
   * @return anchorId
  **/
  @javax.annotation.Nullable
  public Long getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(Long anchorId) {
    this.anchorId = anchorId;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner anchorName(String anchorName) {
    
    this.anchorName = anchorName;
    return this;
  }

   /**
   * 
   * @return anchorName
  **/
  @javax.annotation.Nullable
  public String getAnchorName() {
    return anchorName;
  }


  public void setAnchorName(String anchorName) {
    this.anchorName = anchorName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner qianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner = (QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner) o;
    return Objects.equals(this.anchorAvatar, qianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner.anchorAvatar) &&
        Objects.equals(this.anchorId, qianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner.anchorId) &&
        Objects.equals(this.anchorName, qianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner.anchorName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorAvatar, anchorId, anchorName);
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
    sb.append("class QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner {\n");
    sb.append("    anchorAvatar: ").append(toIndentedString(anchorAvatar)).append("\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorName: ").append(toIndentedString(anchorName)).append("\n");
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
    openapiFields.add("anchor_avatar");
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner
  */
  public static QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

