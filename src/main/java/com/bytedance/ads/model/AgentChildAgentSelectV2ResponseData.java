/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentChildAgentSelectV2ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class AgentChildAgentSelectV2ResponseData {
  public static final String SERIALIZED_NAME_CHILD_AGENT_IDS = "child_agent_ids";
  @SerializedName(SERIALIZED_NAME_CHILD_AGENT_IDS)
  private List<Long> childAgentIds = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<Long> _list = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private AgentChildAgentSelectV2ResponseDataPageInfo pageInfo = null;

  public AgentChildAgentSelectV2ResponseData() {
  }

  public AgentChildAgentSelectV2ResponseData childAgentIds(List<Long> childAgentIds) {
    
    this.childAgentIds = childAgentIds;
    return this;
  }

  public AgentChildAgentSelectV2ResponseData addChildAgentIdsItem(Long childAgentIdsItem) {
    if (this.childAgentIds == null) {
      this.childAgentIds = new ArrayList<>();
    }
    this.childAgentIds.add(childAgentIdsItem);
    return this;
  }

   /**
   * 
   * @return childAgentIds
  **/
  @javax.annotation.Nullable
  public List<Long> getChildAgentIds() {
    return childAgentIds;
  }


  public void setChildAgentIds(List<Long> childAgentIds) {
    this.childAgentIds = childAgentIds;
  }


  public AgentChildAgentSelectV2ResponseData _list(List<Long> _list) {
    
    this._list = _list;
    return this;
  }

  public AgentChildAgentSelectV2ResponseData addListItem(Long _listItem) {
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
  public List<Long> getList() {
    return _list;
  }


  public void setList(List<Long> _list) {
    this._list = _list;
  }


  public AgentChildAgentSelectV2ResponseData pageInfo(AgentChildAgentSelectV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public AgentChildAgentSelectV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(AgentChildAgentSelectV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentChildAgentSelectV2ResponseData agentChildAgentSelectV2ResponseData = (AgentChildAgentSelectV2ResponseData) o;
    return Objects.equals(this.childAgentIds, agentChildAgentSelectV2ResponseData.childAgentIds) &&
        Objects.equals(this._list, agentChildAgentSelectV2ResponseData._list) &&
        Objects.equals(this.pageInfo, agentChildAgentSelectV2ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(childAgentIds, _list, pageInfo);
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
    sb.append("class AgentChildAgentSelectV2ResponseData {\n");
    sb.append("    childAgentIds: ").append(toIndentedString(childAgentIds)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("child_agent_ids");
    openapiFields.add("list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentChildAgentSelectV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentChildAgentSelectV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentChildAgentSelectV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentChildAgentSelectV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentChildAgentSelectV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AgentChildAgentSelectV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentChildAgentSelectV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentChildAgentSelectV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentChildAgentSelectV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AgentChildAgentSelectV2ResponseData
  */
  public static AgentChildAgentSelectV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentChildAgentSelectV2ResponseData.class);
  }

 /**
  * Convert an instance of AgentChildAgentSelectV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

