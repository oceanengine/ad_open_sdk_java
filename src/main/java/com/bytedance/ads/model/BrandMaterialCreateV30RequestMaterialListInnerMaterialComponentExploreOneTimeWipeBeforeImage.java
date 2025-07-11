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
 * 擦前展示动画
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage {
  public static final String SERIALIZED_NAME_WEB_URI = "web_uri";
  @SerializedName(SERIALIZED_NAME_WEB_URI)
  private String webUri = null;

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage() {
  }

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage webUri(String webUri) {
    
    this.webUri = webUri;
    return this;
  }

   /**
   * 
   * @return webUri
  **/
  @javax.annotation.Nullable
  public String getWebUri() {
    return webUri;
  }


  public void setWebUri(String webUri) {
    this.webUri = webUri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage brandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage = (BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage) o;
    return Objects.equals(this.webUri, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage.webUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage {\n");
    sb.append("    webUri: ").append(toIndentedString(webUri)).append("\n");
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
    openapiFields.add("web_uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage>() {
           @Override
           public void write(JsonWriter out, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage
  */
  public static BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage.class);
  }

 /**
  * Convert an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTimeWipeBeforeImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

