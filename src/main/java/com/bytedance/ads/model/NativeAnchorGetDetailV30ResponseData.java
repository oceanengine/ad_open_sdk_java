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
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataErrorListInner;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class NativeAnchorGetDetailV30ResponseData {
  public static final String SERIALIZED_NAME_ERROR_LIST = "error_list";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<NativeAnchorGetDetailV30ResponseDataErrorListInner> errorList = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<NativeAnchorGetDetailV30ResponseDataListInner> _list = null;

  public NativeAnchorGetDetailV30ResponseData() {
  }

  public NativeAnchorGetDetailV30ResponseData errorList(List<NativeAnchorGetDetailV30ResponseDataErrorListInner> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseData addErrorListItem(NativeAnchorGetDetailV30ResponseDataErrorListInner errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * 
   * @return errorList
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetDetailV30ResponseDataErrorListInner> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<NativeAnchorGetDetailV30ResponseDataErrorListInner> errorList) {
    this.errorList = errorList;
  }


  public NativeAnchorGetDetailV30ResponseData _list(List<NativeAnchorGetDetailV30ResponseDataListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseData addListItem(NativeAnchorGetDetailV30ResponseDataListInner _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * 
   * @return _list
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetDetailV30ResponseDataListInner> getList() {
    return _list;
  }


  public void setList(List<NativeAnchorGetDetailV30ResponseDataListInner> _list) {
    this._list = _list;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorGetDetailV30ResponseData nativeAnchorGetDetailV30ResponseData = (NativeAnchorGetDetailV30ResponseData) o;
    return Objects.equals(this.errorList, nativeAnchorGetDetailV30ResponseData.errorList) &&
        Objects.equals(this._list, nativeAnchorGetDetailV30ResponseData._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorList, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorGetDetailV30ResponseData {\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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
    openapiFields.add("error_list");
    openapiFields.add("list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("error_list");
    openapiRequiredFields.add("list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorGetDetailV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseData>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseData
  */
  public static NativeAnchorGetDetailV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseData.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

