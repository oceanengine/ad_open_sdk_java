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
import com.bytedance.ads.model.SecurityScoreDisposalInfoGetV30FilteringDisposalAction;
import com.bytedance.ads.model.SecurityScoreDisposalInfoGetV30FilteringDisposalStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class SecurityScoreDisposalInfoGetV30Filtering {
  public static final String SERIALIZED_NAME_DISPOSAL_ACTION = "disposal_action";
  @SerializedName(SERIALIZED_NAME_DISPOSAL_ACTION)
  private SecurityScoreDisposalInfoGetV30FilteringDisposalAction disposalAction = null;

  public static final String SERIALIZED_NAME_DISPOSAL_STATUS = "disposal_status";
  @SerializedName(SERIALIZED_NAME_DISPOSAL_STATUS)
  private SecurityScoreDisposalInfoGetV30FilteringDisposalStatus disposalStatus = null;

  public SecurityScoreDisposalInfoGetV30Filtering() {
  }

  public SecurityScoreDisposalInfoGetV30Filtering disposalAction(SecurityScoreDisposalInfoGetV30FilteringDisposalAction disposalAction) {
    
    this.disposalAction = disposalAction;
    return this;
  }

   /**
   * Get disposalAction
   * @return disposalAction
  **/
  @javax.annotation.Nullable
  public SecurityScoreDisposalInfoGetV30FilteringDisposalAction getDisposalAction() {
    return disposalAction;
  }


  public void setDisposalAction(SecurityScoreDisposalInfoGetV30FilteringDisposalAction disposalAction) {
    this.disposalAction = disposalAction;
  }


  public SecurityScoreDisposalInfoGetV30Filtering disposalStatus(SecurityScoreDisposalInfoGetV30FilteringDisposalStatus disposalStatus) {
    
    this.disposalStatus = disposalStatus;
    return this;
  }

   /**
   * Get disposalStatus
   * @return disposalStatus
  **/
  @javax.annotation.Nullable
  public SecurityScoreDisposalInfoGetV30FilteringDisposalStatus getDisposalStatus() {
    return disposalStatus;
  }


  public void setDisposalStatus(SecurityScoreDisposalInfoGetV30FilteringDisposalStatus disposalStatus) {
    this.disposalStatus = disposalStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScoreDisposalInfoGetV30Filtering securityScoreDisposalInfoGetV30Filtering = (SecurityScoreDisposalInfoGetV30Filtering) o;
    return Objects.equals(this.disposalAction, securityScoreDisposalInfoGetV30Filtering.disposalAction) &&
        Objects.equals(this.disposalStatus, securityScoreDisposalInfoGetV30Filtering.disposalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disposalAction, disposalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScoreDisposalInfoGetV30Filtering {\n");
    sb.append("    disposalAction: ").append(toIndentedString(disposalAction)).append("\n");
    sb.append("    disposalStatus: ").append(toIndentedString(disposalStatus)).append("\n");
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
    openapiFields.add("disposal_action");
    openapiFields.add("disposal_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityScoreDisposalInfoGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityScoreDisposalInfoGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityScoreDisposalInfoGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityScoreDisposalInfoGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityScoreDisposalInfoGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, SecurityScoreDisposalInfoGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityScoreDisposalInfoGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityScoreDisposalInfoGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityScoreDisposalInfoGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to SecurityScoreDisposalInfoGetV30Filtering
  */
  public static SecurityScoreDisposalInfoGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityScoreDisposalInfoGetV30Filtering.class);
  }

 /**
  * Convert an instance of SecurityScoreDisposalInfoGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

