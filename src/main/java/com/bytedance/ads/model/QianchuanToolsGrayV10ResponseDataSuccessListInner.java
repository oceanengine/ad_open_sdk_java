/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
 * QianchuanToolsGrayV10ResponseDataSuccessListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class QianchuanToolsGrayV10ResponseDataSuccessListInner {
  public static final String SERIALIZED_NAME_AWEME_IDS = "aweme_ids";
  @SerializedName(SERIALIZED_NAME_AWEME_IDS)
  private List<Long> awemeIds = null;

  public static final String SERIALIZED_NAME_GRAY_KEY = "gray_key";
  @SerializedName(SERIALIZED_NAME_GRAY_KEY)
  private String grayKey = null;

  public static final String SERIALIZED_NAME_IN_GRAY = "in_gray";
  @SerializedName(SERIALIZED_NAME_IN_GRAY)
  private Boolean inGray = null;

  public static final String SERIALIZED_NAME_IN_WHITELIST = "in_whitelist";
  @SerializedName(SERIALIZED_NAME_IN_WHITELIST)
  private Boolean inWhitelist = null;

  public QianchuanToolsGrayV10ResponseDataSuccessListInner() {
  }

  public QianchuanToolsGrayV10ResponseDataSuccessListInner awemeIds(List<Long> awemeIds) {
    
    this.awemeIds = awemeIds;
    return this;
  }

  public QianchuanToolsGrayV10ResponseDataSuccessListInner addAwemeIdsItem(Long awemeIdsItem) {
    if (this.awemeIds == null) {
      this.awemeIds = new ArrayList<>();
    }
    this.awemeIds.add(awemeIdsItem);
    return this;
  }

   /**
   * 
   * @return awemeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeIds() {
    return awemeIds;
  }


  public void setAwemeIds(List<Long> awemeIds) {
    this.awemeIds = awemeIds;
  }


  public QianchuanToolsGrayV10ResponseDataSuccessListInner grayKey(String grayKey) {
    
    this.grayKey = grayKey;
    return this;
  }

   /**
   * 
   * @return grayKey
  **/
  @javax.annotation.Nullable
  public String getGrayKey() {
    return grayKey;
  }


  public void setGrayKey(String grayKey) {
    this.grayKey = grayKey;
  }


  public QianchuanToolsGrayV10ResponseDataSuccessListInner inGray(Boolean inGray) {
    
    this.inGray = inGray;
    return this;
  }

   /**
   * 
   * @return inGray
  **/
  @javax.annotation.Nullable
  public Boolean getInGray() {
    return inGray;
  }


  public void setInGray(Boolean inGray) {
    this.inGray = inGray;
  }


  public QianchuanToolsGrayV10ResponseDataSuccessListInner inWhitelist(Boolean inWhitelist) {
    
    this.inWhitelist = inWhitelist;
    return this;
  }

   /**
   * 
   * @return inWhitelist
  **/
  @javax.annotation.Nullable
  public Boolean getInWhitelist() {
    return inWhitelist;
  }


  public void setInWhitelist(Boolean inWhitelist) {
    this.inWhitelist = inWhitelist;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanToolsGrayV10ResponseDataSuccessListInner qianchuanToolsGrayV10ResponseDataSuccessListInner = (QianchuanToolsGrayV10ResponseDataSuccessListInner) o;
    return Objects.equals(this.awemeIds, qianchuanToolsGrayV10ResponseDataSuccessListInner.awemeIds) &&
        Objects.equals(this.grayKey, qianchuanToolsGrayV10ResponseDataSuccessListInner.grayKey) &&
        Objects.equals(this.inGray, qianchuanToolsGrayV10ResponseDataSuccessListInner.inGray) &&
        Objects.equals(this.inWhitelist, qianchuanToolsGrayV10ResponseDataSuccessListInner.inWhitelist);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeIds, grayKey, inGray, inWhitelist);
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
    sb.append("class QianchuanToolsGrayV10ResponseDataSuccessListInner {\n");
    sb.append("    awemeIds: ").append(toIndentedString(awemeIds)).append("\n");
    sb.append("    grayKey: ").append(toIndentedString(grayKey)).append("\n");
    sb.append("    inGray: ").append(toIndentedString(inGray)).append("\n");
    sb.append("    inWhitelist: ").append(toIndentedString(inWhitelist)).append("\n");
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
    openapiFields.add("aweme_ids");
    openapiFields.add("gray_key");
    openapiFields.add("in_gray");
    openapiFields.add("in_whitelist");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("gray_key");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanToolsGrayV10ResponseDataSuccessListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanToolsGrayV10ResponseDataSuccessListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanToolsGrayV10ResponseDataSuccessListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanToolsGrayV10ResponseDataSuccessListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanToolsGrayV10ResponseDataSuccessListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanToolsGrayV10ResponseDataSuccessListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanToolsGrayV10ResponseDataSuccessListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanToolsGrayV10ResponseDataSuccessListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanToolsGrayV10ResponseDataSuccessListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanToolsGrayV10ResponseDataSuccessListInner
  */
  public static QianchuanToolsGrayV10ResponseDataSuccessListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanToolsGrayV10ResponseDataSuccessListInner.class);
  }

 /**
  * Convert an instance of QianchuanToolsGrayV10ResponseDataSuccessListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

