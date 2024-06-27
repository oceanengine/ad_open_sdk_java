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
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class ToolsAppManagementBpShareCancelV2ResponseData {
  public static final String SERIALIZED_NAME_ERROR_LIST = "error_list";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner> errorList = null;

  public static final String SERIALIZED_NAME_SUCCESS_LIST = "success_list";
  @SerializedName(SERIALIZED_NAME_SUCCESS_LIST)
  private List<ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner> successList = null;

  public ToolsAppManagementBpShareCancelV2ResponseData() {
  }

  public ToolsAppManagementBpShareCancelV2ResponseData errorList(List<ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public ToolsAppManagementBpShareCancelV2ResponseData addErrorListItem(ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner errorListItem) {
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
  public List<ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<ToolsAppManagementBpShareCancelV2ResponseDataErrorListInner> errorList) {
    this.errorList = errorList;
  }


  public ToolsAppManagementBpShareCancelV2ResponseData successList(List<ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner> successList) {
    
    this.successList = successList;
    return this;
  }

  public ToolsAppManagementBpShareCancelV2ResponseData addSuccessListItem(ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner successListItem) {
    if (this.successList == null) {
      this.successList = new ArrayList<>();
    }
    this.successList.add(successListItem);
    return this;
  }

   /**
   * 
   * @return successList
  **/
  @javax.annotation.Nullable
  public List<ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner> getSuccessList() {
    return successList;
  }


  public void setSuccessList(List<ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner> successList) {
    this.successList = successList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementBpShareCancelV2ResponseData toolsAppManagementBpShareCancelV2ResponseData = (ToolsAppManagementBpShareCancelV2ResponseData) o;
    return Objects.equals(this.errorList, toolsAppManagementBpShareCancelV2ResponseData.errorList) &&
        Objects.equals(this.successList, toolsAppManagementBpShareCancelV2ResponseData.successList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorList, successList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementBpShareCancelV2ResponseData {\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
    sb.append("    successList: ").append(toIndentedString(successList)).append("\n");
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
    openapiFields.add("success_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementBpShareCancelV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementBpShareCancelV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementBpShareCancelV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementBpShareCancelV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementBpShareCancelV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementBpShareCancelV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementBpShareCancelV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementBpShareCancelV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementBpShareCancelV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementBpShareCancelV2ResponseData
  */
  public static ToolsAppManagementBpShareCancelV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementBpShareCancelV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAppManagementBpShareCancelV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

