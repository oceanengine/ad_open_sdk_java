/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
 * AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-11T18:54:06.224549627+08:00[PRC]")
public class AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner {
  public static final String SERIALIZED_NAME_ATTACHMENT_ID = "attachment_id";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_ID)
  private String attachmentId = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_ID = "qualification_id";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_ID)
  private Long qualificationId = null;

  public AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner() {
  }

  public AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner attachmentId(String attachmentId) {
    
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * 资质图片附件id 
   * @return attachmentId
  **/
  @javax.annotation.Nonnull
  public String getAttachmentId() {
    return attachmentId;
  }


  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }


  public AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner qualificationId(Long qualificationId) {
    
    this.qualificationId = qualificationId;
    return this;
  }

   /**
   * 资质id 
   * @return qualificationId
  **/
  @javax.annotation.Nullable
  public Long getQualificationId() {
    return qualificationId;
  }


  public void setQualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner advertiserQualificationSubmitV30RequestIndustriesInnerOthersInner = (AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner) o;
    return Objects.equals(this.attachmentId, advertiserQualificationSubmitV30RequestIndustriesInnerOthersInner.attachmentId) &&
        Objects.equals(this.qualificationId, advertiserQualificationSubmitV30RequestIndustriesInnerOthersInner.qualificationId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, qualificationId);
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
    sb.append("class AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner {\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    qualificationId: ").append(toIndentedString(qualificationId)).append("\n");
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
    openapiFields.add("attachment_id");
    openapiFields.add("qualification_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attachment_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner
  */
  public static AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner.class);
  }

 /**
  * Convert an instance of AdvertiserQualificationSubmitV30RequestIndustriesInnerOthersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

