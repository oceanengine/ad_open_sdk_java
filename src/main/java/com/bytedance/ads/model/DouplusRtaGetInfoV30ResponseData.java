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
import com.bytedance.ads.model.DouplusRtaGetInfoV30ResponseDataInterface;
import com.bytedance.ads.model.DouplusRtaGetInfoV30ResponseDataRtaListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class DouplusRtaGetInfoV30ResponseData {
  public static final String SERIALIZED_NAME_INTERFACE = "interface";
  @SerializedName(SERIALIZED_NAME_INTERFACE)
  private DouplusRtaGetInfoV30ResponseDataInterface _interface = null;

  public static final String SERIALIZED_NAME_RTA_LIST = "rta_list";
  @SerializedName(SERIALIZED_NAME_RTA_LIST)
  private List<DouplusRtaGetInfoV30ResponseDataRtaListInner> rtaList = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total = null;

  public DouplusRtaGetInfoV30ResponseData() {
  }

  public DouplusRtaGetInfoV30ResponseData _interface(DouplusRtaGetInfoV30ResponseDataInterface _interface) {
    
    this._interface = _interface;
    return this;
  }

   /**
   * Get _interface
   * @return _interface
  **/
  @javax.annotation.Nullable
  public DouplusRtaGetInfoV30ResponseDataInterface getInterface() {
    return _interface;
  }


  public void setInterface(DouplusRtaGetInfoV30ResponseDataInterface _interface) {
    this._interface = _interface;
  }


  public DouplusRtaGetInfoV30ResponseData rtaList(List<DouplusRtaGetInfoV30ResponseDataRtaListInner> rtaList) {
    
    this.rtaList = rtaList;
    return this;
  }

  public DouplusRtaGetInfoV30ResponseData addRtaListItem(DouplusRtaGetInfoV30ResponseDataRtaListInner rtaListItem) {
    if (this.rtaList == null) {
      this.rtaList = new ArrayList<>();
    }
    this.rtaList.add(rtaListItem);
    return this;
  }

   /**
   * 
   * @return rtaList
  **/
  @javax.annotation.Nullable
  public List<DouplusRtaGetInfoV30ResponseDataRtaListInner> getRtaList() {
    return rtaList;
  }


  public void setRtaList(List<DouplusRtaGetInfoV30ResponseDataRtaListInner> rtaList) {
    this.rtaList = rtaList;
  }


  public DouplusRtaGetInfoV30ResponseData total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * 
   * @return total
  **/
  @javax.annotation.Nullable
  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusRtaGetInfoV30ResponseData douplusRtaGetInfoV30ResponseData = (DouplusRtaGetInfoV30ResponseData) o;
    return Objects.equals(this._interface, douplusRtaGetInfoV30ResponseData._interface) &&
        Objects.equals(this.rtaList, douplusRtaGetInfoV30ResponseData.rtaList) &&
        Objects.equals(this.total, douplusRtaGetInfoV30ResponseData.total);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_interface, rtaList, total);
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
    sb.append("class DouplusRtaGetInfoV30ResponseData {\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    rtaList: ").append(toIndentedString(rtaList)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("interface");
    openapiFields.add("rta_list");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusRtaGetInfoV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusRtaGetInfoV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusRtaGetInfoV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusRtaGetInfoV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusRtaGetInfoV30ResponseData>() {
           @Override
           public void write(JsonWriter out, DouplusRtaGetInfoV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusRtaGetInfoV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusRtaGetInfoV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusRtaGetInfoV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to DouplusRtaGetInfoV30ResponseData
  */
  public static DouplusRtaGetInfoV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusRtaGetInfoV30ResponseData.class);
  }

 /**
  * Convert an instance of DouplusRtaGetInfoV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

