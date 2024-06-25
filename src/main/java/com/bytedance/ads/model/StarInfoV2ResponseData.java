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
import com.bytedance.ads.model.StarInfoV2ResponseDataInfoListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class StarInfoV2ResponseData {
  public static final String SERIALIZED_NAME_INFO_LIST = "info_list";
  @SerializedName(SERIALIZED_NAME_INFO_LIST)
  private List<StarInfoV2ResponseDataInfoListInner> infoList = null;

  public StarInfoV2ResponseData() {
  }

  public StarInfoV2ResponseData infoList(List<StarInfoV2ResponseDataInfoListInner> infoList) {
    
    this.infoList = infoList;
    return this;
  }

  public StarInfoV2ResponseData addInfoListItem(StarInfoV2ResponseDataInfoListInner infoListItem) {
    if (this.infoList == null) {
      this.infoList = new ArrayList<>();
    }
    this.infoList.add(infoListItem);
    return this;
  }

   /**
   * 
   * @return infoList
  **/
  @javax.annotation.Nullable
  public List<StarInfoV2ResponseDataInfoListInner> getInfoList() {
    return infoList;
  }


  public void setInfoList(List<StarInfoV2ResponseDataInfoListInner> infoList) {
    this.infoList = infoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarInfoV2ResponseData starInfoV2ResponseData = (StarInfoV2ResponseData) o;
    return Objects.equals(this.infoList, starInfoV2ResponseData.infoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarInfoV2ResponseData {\n");
    sb.append("    infoList: ").append(toIndentedString(infoList)).append("\n");
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
    openapiFields.add("info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("info_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarInfoV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarInfoV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarInfoV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarInfoV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarInfoV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarInfoV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarInfoV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarInfoV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarInfoV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarInfoV2ResponseData
  */
  public static StarInfoV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarInfoV2ResponseData.class);
  }

 /**
  * Convert an instance of StarInfoV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

