/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
 * QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId = null;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage = null;

  public QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner() {
  }

  public QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner qianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner = (QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner) o;
    return Objects.equals(this.campaignId, qianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner.campaignId) &&
        Objects.equals(this.errorMessage, qianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner.errorMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, errorMessage);
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
    sb.append("class QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
    openapiFields.add("campaign_id");
    openapiFields.add("error_message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner
  */
  public static QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner.class);
  }

 /**
  * Convert an instance of QianchuanBatchCampaignStatusUpdateV10ResponseDataErrorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

