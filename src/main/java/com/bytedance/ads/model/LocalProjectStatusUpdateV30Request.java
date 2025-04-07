/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalProjectStatusUpdateV30RequestDataInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * LocalProjectStatusUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class LocalProjectStatusUpdateV30Request {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<LocalProjectStatusUpdateV30RequestDataInner> data = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public LocalProjectStatusUpdateV30Request() {
  }

  public LocalProjectStatusUpdateV30Request data(List<LocalProjectStatusUpdateV30RequestDataInner> data) {
    
    this.data = data;
    return this;
  }

  public LocalProjectStatusUpdateV30Request addDataItem(LocalProjectStatusUpdateV30RequestDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * 一次性最多处理50个项目
   * @return data
  **/
  @javax.annotation.Nonnull
  public List<LocalProjectStatusUpdateV30RequestDataInner> getData() {
    return data;
  }


  public void setData(List<LocalProjectStatusUpdateV30RequestDataInner> data) {
    this.data = data;
  }


  public LocalProjectStatusUpdateV30Request localAccountId(Long localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 
   * @return localAccountId
  **/
  @javax.annotation.Nonnull
  public Long getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(Long localAccountId) {
    this.localAccountId = localAccountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectStatusUpdateV30Request localProjectStatusUpdateV30Request = (LocalProjectStatusUpdateV30Request) o;
    return Objects.equals(this.data, localProjectStatusUpdateV30Request.data) &&
        Objects.equals(this.localAccountId, localProjectStatusUpdateV30Request.localAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, localAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalProjectStatusUpdateV30Request {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("local_account_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("local_account_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectStatusUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectStatusUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectStatusUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectStatusUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectStatusUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, LocalProjectStatusUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectStatusUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectStatusUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectStatusUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to LocalProjectStatusUpdateV30Request
  */
  public static LocalProjectStatusUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectStatusUpdateV30Request.class);
  }

 /**
  * Convert an instance of LocalProjectStatusUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

