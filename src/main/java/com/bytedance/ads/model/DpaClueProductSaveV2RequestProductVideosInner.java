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
 * DpaClueProductSaveV2RequestProductVideosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class DpaClueProductSaveV2RequestProductVideosInner {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public DpaClueProductSaveV2RequestProductVideosInner() {
  }

  public DpaClueProductSaveV2RequestProductVideosInner templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 视频模板ID
   * @return templateId
  **/
  @javax.annotation.Nullable
  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public DpaClueProductSaveV2RequestProductVideosInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 视频ID
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
    DpaClueProductSaveV2RequestProductVideosInner dpaClueProductSaveV2RequestProductVideosInner = (DpaClueProductSaveV2RequestProductVideosInner) o;
    return Objects.equals(this.templateId, dpaClueProductSaveV2RequestProductVideosInner.templateId) &&
        Objects.equals(this.url, dpaClueProductSaveV2RequestProductVideosInner.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, url);
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
    sb.append("class DpaClueProductSaveV2RequestProductVideosInner {\n");
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
       if (!DpaClueProductSaveV2RequestProductVideosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaClueProductSaveV2RequestProductVideosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaClueProductSaveV2RequestProductVideosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaClueProductSaveV2RequestProductVideosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaClueProductSaveV2RequestProductVideosInner>() {
           @Override
           public void write(JsonWriter out, DpaClueProductSaveV2RequestProductVideosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaClueProductSaveV2RequestProductVideosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaClueProductSaveV2RequestProductVideosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaClueProductSaveV2RequestProductVideosInner
  * @throws IOException if the JSON string is invalid with respect to DpaClueProductSaveV2RequestProductVideosInner
  */
  public static DpaClueProductSaveV2RequestProductVideosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaClueProductSaveV2RequestProductVideosInner.class);
  }

 /**
  * Convert an instance of DpaClueProductSaveV2RequestProductVideosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

