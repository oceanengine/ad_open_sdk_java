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
 * StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner {
  public static final String SERIALIZED_NAME_IP_ACT_ID = "ip_act_id";
  @SerializedName(SERIALIZED_NAME_IP_ACT_ID)
  private Long ipActId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner() {
  }

  public StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner ipActId(Long ipActId) {
    
    this.ipActId = ipActId;
    return this;
  }

   /**
   * 
   * @return ipActId
  **/
  @javax.annotation.Nullable
  public Long getIpActId() {
    return ipActId;
  }


  public void setIpActId(Long ipActId) {
    this.ipActId = ipActId;
  }


  public StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner name(String name) {
    
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
    StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner starDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner = (StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner) o;
    return Objects.equals(this.ipActId, starDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner.ipActId) &&
        Objects.equals(this.name, starDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipActId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner {\n");
    sb.append("    ipActId: ").append(toIndentedString(ipActId)).append("\n");
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
    openapiFields.add("ip_act_id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ip_act_id");
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner>() {
           @Override
           public void write(JsonWriter out, StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner
  * @throws IOException if the JSON string is invalid with respect to StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner
  */
  public static StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner.class);
  }

 /**
  * Convert an instance of StarDemanderGetRegisteredIpActsV2ResponseDataIpActivityListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

