/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial {
  public static final String SERIALIZED_NAME_SUB_TITLE = "sub_title";
  @SerializedName(SERIALIZED_NAME_SUB_TITLE)
  private String subTitle = null;

  public CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial() {
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial subTitle(String subTitle) {
    
    this.subTitle = subTitle;
    return this;
  }

   /**
   * 
   * @return subTitle
  **/
  @javax.annotation.Nonnull
  public String getSubTitle() {
    return subTitle;
  }


  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial creativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial = (CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial) o;
    return Objects.equals(this.subTitle, creativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial.subTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial {\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
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
    openapiFields.add("sub_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sub_title");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial
  */
  public static CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeUpdateV2RequestCreativeSubTitleMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

