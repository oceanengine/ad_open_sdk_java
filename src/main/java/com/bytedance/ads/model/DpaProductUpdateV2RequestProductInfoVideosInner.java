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
 * DpaProductUpdateV2RequestProductInfoVideosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class DpaProductUpdateV2RequestProductInfoVideosInner {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public DpaProductUpdateV2RequestProductInfoVideosInner() {
  }

  public DpaProductUpdateV2RequestProductInfoVideosInner templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 
   * @return templateId
  **/
  @javax.annotation.Nullable
  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public DpaProductUpdateV2RequestProductInfoVideosInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaProductUpdateV2RequestProductInfoVideosInner dpaProductUpdateV2RequestProductInfoVideosInner = (DpaProductUpdateV2RequestProductInfoVideosInner) o;
    return Objects.equals(this.templateId, dpaProductUpdateV2RequestProductInfoVideosInner.templateId) &&
        Objects.equals(this.url, dpaProductUpdateV2RequestProductInfoVideosInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaProductUpdateV2RequestProductInfoVideosInner {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("template_id");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaProductUpdateV2RequestProductInfoVideosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaProductUpdateV2RequestProductInfoVideosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaProductUpdateV2RequestProductInfoVideosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaProductUpdateV2RequestProductInfoVideosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaProductUpdateV2RequestProductInfoVideosInner>() {
           @Override
           public void write(JsonWriter out, DpaProductUpdateV2RequestProductInfoVideosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaProductUpdateV2RequestProductInfoVideosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaProductUpdateV2RequestProductInfoVideosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaProductUpdateV2RequestProductInfoVideosInner
  * @throws IOException if the JSON string is invalid with respect to DpaProductUpdateV2RequestProductInfoVideosInner
  */
  public static DpaProductUpdateV2RequestProductInfoVideosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaProductUpdateV2RequestProductInfoVideosInner.class);
  }

 /**
  * Convert an instance of DpaProductUpdateV2RequestProductInfoVideosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

