/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner {
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

  public static final String SERIALIZED_NAME_HAS_ROI2_DELIVERY_LIMIT = "has_roi2_delivery_limit";
  @SerializedName(SERIALIZED_NAME_HAS_ROI2_DELIVERY_LIMIT)
  private Boolean hasRoi2DeliveryLimit = null;

  public static final String SERIALIZED_NAME_HAS_ROI2_GROUP_CREATED = "has_roi2_group_created";
  @SerializedName(SERIALIZED_NAME_HAS_ROI2_GROUP_CREATED)
  private Boolean hasRoi2GroupCreated = null;

  public QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner() {
  }

  public QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeAvatar(String awemeAvatar) {
    
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


  public QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeId(Long awemeId) {
    
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


  public QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeName(String awemeName) {
    
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


  public QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeShowId(String awemeShowId) {
    
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


  public QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner hasRoi2DeliveryLimit(Boolean hasRoi2DeliveryLimit) {
    
    this.hasRoi2DeliveryLimit = hasRoi2DeliveryLimit;
    return this;
  }

   /**
   * 
   * @return hasRoi2DeliveryLimit
  **/
  @javax.annotation.Nullable
  public Boolean getHasRoi2DeliveryLimit() {
    return hasRoi2DeliveryLimit;
  }


  public void setHasRoi2DeliveryLimit(Boolean hasRoi2DeliveryLimit) {
    this.hasRoi2DeliveryLimit = hasRoi2DeliveryLimit;
  }


  public QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner hasRoi2GroupCreated(Boolean hasRoi2GroupCreated) {
    
    this.hasRoi2GroupCreated = hasRoi2GroupCreated;
    return this;
  }

   /**
   * 
   * @return hasRoi2GroupCreated
  **/
  @javax.annotation.Nullable
  public Boolean getHasRoi2GroupCreated() {
    return hasRoi2GroupCreated;
  }


  public void setHasRoi2GroupCreated(Boolean hasRoi2GroupCreated) {
    this.hasRoi2GroupCreated = hasRoi2GroupCreated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner qianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner = (QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner) o;
    return Objects.equals(this.awemeAvatar, qianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeAvatar) &&
        Objects.equals(this.awemeId, qianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeId) &&
        Objects.equals(this.awemeName, qianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeName) &&
        Objects.equals(this.awemeShowId, qianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeShowId) &&
        Objects.equals(this.hasRoi2DeliveryLimit, qianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.hasRoi2DeliveryLimit) &&
        Objects.equals(this.hasRoi2GroupCreated, qianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.hasRoi2GroupCreated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeAvatar, awemeId, awemeName, awemeShowId, hasRoi2DeliveryLimit, hasRoi2GroupCreated);
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
    sb.append("class QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner {\n");
    sb.append("    awemeAvatar: ").append(toIndentedString(awemeAvatar)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    awemeShowId: ").append(toIndentedString(awemeShowId)).append("\n");
    sb.append("    hasRoi2DeliveryLimit: ").append(toIndentedString(hasRoi2DeliveryLimit)).append("\n");
    sb.append("    hasRoi2GroupCreated: ").append(toIndentedString(hasRoi2GroupCreated)).append("\n");
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
    openapiFields.add("has_roi2_delivery_limit");
    openapiFields.add("has_roi2_group_created");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner
  */
  public static QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

