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
 * QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner {
  public static final String SERIALIZED_NAME_AWEME_AVATAR = "aweme_avatar";
  @SerializedName(SERIALIZED_NAME_AWEME_AVATAR)
  private String awemeAvatar = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_AWEME_SHOW_ID = "aweme_show_id";
  @SerializedName(SERIALIZED_NAME_AWEME_SHOW_ID)
  private String awemeShowId = null;

  public QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner() {
  }

  public QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner awemeAvatar(String awemeAvatar) {
    
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


  public QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }


  public QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner awemeShowId(String awemeShowId) {
    
    this.awemeShowId = awemeShowId;
    return this;
  }

   /**
   * 
   * @return awemeShowId
  **/
  @javax.annotation.Nullable
  public String getAwemeShowId() {
    return awemeShowId;
  }


  public void setAwemeShowId(String awemeShowId) {
    this.awemeShowId = awemeShowId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner qianchuanAdGetV10ResponseDataListInnerAwemeInfoInner = (QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner) o;
    return Objects.equals(this.awemeAvatar, qianchuanAdGetV10ResponseDataListInnerAwemeInfoInner.awemeAvatar) &&
        Objects.equals(this.awemeId, qianchuanAdGetV10ResponseDataListInnerAwemeInfoInner.awemeId) &&
        Objects.equals(this.awemeName, qianchuanAdGetV10ResponseDataListInnerAwemeInfoInner.awemeName) &&
        Objects.equals(this.awemeShowId, qianchuanAdGetV10ResponseDataListInnerAwemeInfoInner.awemeShowId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeAvatar, awemeId, awemeName, awemeShowId);
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
    sb.append("class QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner {\n");
    sb.append("    awemeAvatar: ").append(toIndentedString(awemeAvatar)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    awemeShowId: ").append(toIndentedString(awemeShowId)).append("\n");
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
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("aweme_show_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner
  */
  public static QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner.class);
  }

 /**
  * Convert an instance of QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

