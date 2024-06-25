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
import com.bytedance.ads.model.ToolsClueRobotScriptQueryV2ResponseDataDataInner;
import com.bytedance.ads.model.ToolsClueRobotScriptQueryV2ResponseDataPage;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class ToolsClueRobotScriptQueryV2ResponseData {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ToolsClueRobotScriptQueryV2ResponseDataDataInner> data = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private ToolsClueRobotScriptQueryV2ResponseDataPage page = null;

  public ToolsClueRobotScriptQueryV2ResponseData() {
  }

  public ToolsClueRobotScriptQueryV2ResponseData data(List<ToolsClueRobotScriptQueryV2ResponseDataDataInner> data) {
    
    this.data = data;
    return this;
  }

  public ToolsClueRobotScriptQueryV2ResponseData addDataItem(ToolsClueRobotScriptQueryV2ResponseDataDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * 列表数据
   * @return data
  **/
  @javax.annotation.Nullable
  public List<ToolsClueRobotScriptQueryV2ResponseDataDataInner> getData() {
    return data;
  }


  public void setData(List<ToolsClueRobotScriptQueryV2ResponseDataDataInner> data) {
    this.data = data;
  }


  public ToolsClueRobotScriptQueryV2ResponseData page(ToolsClueRobotScriptQueryV2ResponseDataPage page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  public ToolsClueRobotScriptQueryV2ResponseDataPage getPage() {
    return page;
  }


  public void setPage(ToolsClueRobotScriptQueryV2ResponseDataPage page) {
    this.page = page;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRobotScriptQueryV2ResponseData toolsClueRobotScriptQueryV2ResponseData = (ToolsClueRobotScriptQueryV2ResponseData) o;
    return Objects.equals(this.data, toolsClueRobotScriptQueryV2ResponseData.data) &&
        Objects.equals(this.page, toolsClueRobotScriptQueryV2ResponseData.page);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, page);
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
    sb.append("class ToolsClueRobotScriptQueryV2ResponseData {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRobotScriptQueryV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRobotScriptQueryV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRobotScriptQueryV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRobotScriptQueryV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRobotScriptQueryV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsClueRobotScriptQueryV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRobotScriptQueryV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRobotScriptQueryV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRobotScriptQueryV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRobotScriptQueryV2ResponseData
  */
  public static ToolsClueRobotScriptQueryV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRobotScriptQueryV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsClueRobotScriptQueryV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

