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
import com.bytedance.ads.model.ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner;
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
public class ToolsBlueFlowPackageListV30ResponseData {
  public static final String SERIALIZED_NAME_BLUE_FLOW_PACKAGES = "blue_flow_packages";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_PACKAGES)
  private List<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner> blueFlowPackages = null;

  public ToolsBlueFlowPackageListV30ResponseData() {
  }

  public ToolsBlueFlowPackageListV30ResponseData blueFlowPackages(List<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner> blueFlowPackages) {
    
    this.blueFlowPackages = blueFlowPackages;
    return this;
  }

  public ToolsBlueFlowPackageListV30ResponseData addBlueFlowPackagesItem(ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner blueFlowPackagesItem) {
    if (this.blueFlowPackages == null) {
      this.blueFlowPackages = new ArrayList<>();
    }
    this.blueFlowPackages.add(blueFlowPackagesItem);
    return this;
  }

   /**
   * 
   * @return blueFlowPackages
  **/
  @javax.annotation.Nullable
  public List<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner> getBlueFlowPackages() {
    return blueFlowPackages;
  }


  public void setBlueFlowPackages(List<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner> blueFlowPackages) {
    this.blueFlowPackages = blueFlowPackages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBlueFlowPackageListV30ResponseData toolsBlueFlowPackageListV30ResponseData = (ToolsBlueFlowPackageListV30ResponseData) o;
    return Objects.equals(this.blueFlowPackages, toolsBlueFlowPackageListV30ResponseData.blueFlowPackages);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueFlowPackages);
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
    sb.append("class ToolsBlueFlowPackageListV30ResponseData {\n");
    sb.append("    blueFlowPackages: ").append(toIndentedString(blueFlowPackages)).append("\n");
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
    openapiFields.add("blue_flow_packages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBlueFlowPackageListV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBlueFlowPackageListV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBlueFlowPackageListV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBlueFlowPackageListV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBlueFlowPackageListV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsBlueFlowPackageListV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBlueFlowPackageListV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBlueFlowPackageListV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBlueFlowPackageListV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsBlueFlowPackageListV30ResponseData
  */
  public static ToolsBlueFlowPackageListV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBlueFlowPackageListV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsBlueFlowPackageListV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

