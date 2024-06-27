/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileMaterialBindV2ResponseDataFailListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class FileMaterialBindV2ResponseData {
  public static final String SERIALIZED_NAME_FAIL_LIST = "fail_list";
  @SerializedName(SERIALIZED_NAME_FAIL_LIST)
  private List<FileMaterialBindV2ResponseDataFailListInner> failList = null;

  public FileMaterialBindV2ResponseData() {
  }

  public FileMaterialBindV2ResponseData failList(List<FileMaterialBindV2ResponseDataFailListInner> failList) {
    
    this.failList = failList;
    return this;
  }

  public FileMaterialBindV2ResponseData addFailListItem(FileMaterialBindV2ResponseDataFailListInner failListItem) {
    if (this.failList == null) {
      this.failList = new ArrayList<>();
    }
    this.failList.add(failListItem);
    return this;
  }

   /**
   * 推送失败列表
   * @return failList
  **/
  @javax.annotation.Nullable
  public List<FileMaterialBindV2ResponseDataFailListInner> getFailList() {
    return failList;
  }


  public void setFailList(List<FileMaterialBindV2ResponseDataFailListInner> failList) {
    this.failList = failList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMaterialBindV2ResponseData fileMaterialBindV2ResponseData = (FileMaterialBindV2ResponseData) o;
    return Objects.equals(this.failList, fileMaterialBindV2ResponseData.failList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failList);
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
    sb.append("class FileMaterialBindV2ResponseData {\n");
    sb.append("    failList: ").append(toIndentedString(failList)).append("\n");
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
    openapiFields.add("fail_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileMaterialBindV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileMaterialBindV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileMaterialBindV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileMaterialBindV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<FileMaterialBindV2ResponseData>() {
           @Override
           public void write(JsonWriter out, FileMaterialBindV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileMaterialBindV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileMaterialBindV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileMaterialBindV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to FileMaterialBindV2ResponseData
  */
  public static FileMaterialBindV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileMaterialBindV2ResponseData.class);
  }

 /**
  * Convert an instance of FileMaterialBindV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

