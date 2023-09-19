/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsCommentReplyGetV30ResponseDataPageInfo;
import com.bytedance.ads.model.ToolsCommentReplyGetV30ResponseDataReplyListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsCommentReplyGetV30ResponseData {
  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ToolsCommentReplyGetV30ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_REPLY_LIST = "reply_list";
  @SerializedName(SERIALIZED_NAME_REPLY_LIST)
  private List<ToolsCommentReplyGetV30ResponseDataReplyListInner> replyList = null;

  public ToolsCommentReplyGetV30ResponseData() {
  }

  public ToolsCommentReplyGetV30ResponseData pageInfo(ToolsCommentReplyGetV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ToolsCommentReplyGetV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ToolsCommentReplyGetV30ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public ToolsCommentReplyGetV30ResponseData replyList(List<ToolsCommentReplyGetV30ResponseDataReplyListInner> replyList) {
    
    this.replyList = replyList;
    return this;
  }

  public ToolsCommentReplyGetV30ResponseData addReplyListItem(ToolsCommentReplyGetV30ResponseDataReplyListInner replyListItem) {
    if (this.replyList == null) {
      this.replyList = new ArrayList<>();
    }
    this.replyList.add(replyListItem);
    return this;
  }

   /**
   * 回复列表
   * @return replyList
  **/
  @javax.annotation.Nullable
  public List<ToolsCommentReplyGetV30ResponseDataReplyListInner> getReplyList() {
    return replyList;
  }


  public void setReplyList(List<ToolsCommentReplyGetV30ResponseDataReplyListInner> replyList) {
    this.replyList = replyList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentReplyGetV30ResponseData toolsCommentReplyGetV30ResponseData = (ToolsCommentReplyGetV30ResponseData) o;
    return Objects.equals(this.pageInfo, toolsCommentReplyGetV30ResponseData.pageInfo) &&
        Objects.equals(this.replyList, toolsCommentReplyGetV30ResponseData.replyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, replyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCommentReplyGetV30ResponseData {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    replyList: ").append(toIndentedString(replyList)).append("\n");
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
    openapiFields.add("page_info");
    openapiFields.add("reply_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page_info");
    openapiRequiredFields.add("reply_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentReplyGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentReplyGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentReplyGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentReplyGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentReplyGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsCommentReplyGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentReplyGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentReplyGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentReplyGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentReplyGetV30ResponseData
  */
  public static ToolsCommentReplyGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentReplyGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsCommentReplyGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

