/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EnterpriseCommentReplyListV10ResponseDataReplyListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class EnterpriseCommentReplyListV10ResponseData {
  public static final String SERIALIZED_NAME_REPLY_LIST = "reply_list";
  @SerializedName(SERIALIZED_NAME_REPLY_LIST)
  private List<EnterpriseCommentReplyListV10ResponseDataReplyListInner> replyList = null;

  public EnterpriseCommentReplyListV10ResponseData() {
  }

  public EnterpriseCommentReplyListV10ResponseData replyList(List<EnterpriseCommentReplyListV10ResponseDataReplyListInner> replyList) {
    
    this.replyList = replyList;
    return this;
  }

  public EnterpriseCommentReplyListV10ResponseData addReplyListItem(EnterpriseCommentReplyListV10ResponseDataReplyListInner replyListItem) {
    if (this.replyList == null) {
      this.replyList = new ArrayList<>();
    }
    this.replyList.add(replyListItem);
    return this;
  }

   /**
   * 
   * @return replyList
  **/
  @javax.annotation.Nullable
  public List<EnterpriseCommentReplyListV10ResponseDataReplyListInner> getReplyList() {
    return replyList;
  }


  public void setReplyList(List<EnterpriseCommentReplyListV10ResponseDataReplyListInner> replyList) {
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
    EnterpriseCommentReplyListV10ResponseData enterpriseCommentReplyListV10ResponseData = (EnterpriseCommentReplyListV10ResponseData) o;
    return Objects.equals(this.replyList, enterpriseCommentReplyListV10ResponseData.replyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseCommentReplyListV10ResponseData {\n");
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
    openapiFields.add("reply_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseCommentReplyListV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseCommentReplyListV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseCommentReplyListV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseCommentReplyListV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseCommentReplyListV10ResponseData>() {
           @Override
           public void write(JsonWriter out, EnterpriseCommentReplyListV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseCommentReplyListV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseCommentReplyListV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseCommentReplyListV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to EnterpriseCommentReplyListV10ResponseData
  */
  public static EnterpriseCommentReplyListV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseCommentReplyListV10ResponseData.class);
  }

 /**
  * Convert an instance of EnterpriseCommentReplyListV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

