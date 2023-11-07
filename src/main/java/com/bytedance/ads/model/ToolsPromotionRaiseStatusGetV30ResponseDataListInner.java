/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * ToolsPromotionRaiseStatusGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class ToolsPromotionRaiseStatusGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_RAISE_INFO = "raise_info";
  @SerializedName(SERIALIZED_NAME_RAISE_INFO)
  private List<ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner> raiseInfo = null;

  public ToolsPromotionRaiseStatusGetV30ResponseDataListInner() {
  }

  public ToolsPromotionRaiseStatusGetV30ResponseDataListInner raiseInfo(List<ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner> raiseInfo) {
    
    this.raiseInfo = raiseInfo;
    return this;
  }

  public ToolsPromotionRaiseStatusGetV30ResponseDataListInner addRaiseInfoItem(ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner raiseInfoItem) {
    if (this.raiseInfo == null) {
      this.raiseInfo = new ArrayList<>();
    }
    this.raiseInfo.add(raiseInfoItem);
    return this;
  }

   /**
   * 起量信息
   * @return raiseInfo
  **/
  @javax.annotation.Nullable
  public List<ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner> getRaiseInfo() {
    return raiseInfo;
  }


  public void setRaiseInfo(List<ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner> raiseInfo) {
    this.raiseInfo = raiseInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionRaiseStatusGetV30ResponseDataListInner toolsPromotionRaiseStatusGetV30ResponseDataListInner = (ToolsPromotionRaiseStatusGetV30ResponseDataListInner) o;
    return Objects.equals(this.raiseInfo, toolsPromotionRaiseStatusGetV30ResponseDataListInner.raiseInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(raiseInfo);
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
    sb.append("class ToolsPromotionRaiseStatusGetV30ResponseDataListInner {\n");
    sb.append("    raiseInfo: ").append(toIndentedString(raiseInfo)).append("\n");
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
    openapiFields.add("raise_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionRaiseStatusGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionRaiseStatusGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionRaiseStatusGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionRaiseStatusGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionRaiseStatusGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionRaiseStatusGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionRaiseStatusGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionRaiseStatusGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionRaiseStatusGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionRaiseStatusGetV30ResponseDataListInner
  */
  public static ToolsPromotionRaiseStatusGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionRaiseStatusGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsPromotionRaiseStatusGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

