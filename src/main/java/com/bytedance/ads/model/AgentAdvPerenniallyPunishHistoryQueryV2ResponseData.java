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
import com.bytedance.ads.model.AgentAdvPerenniallyPunishHistoryQueryV2ResponseDataPunishListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class AgentAdvPerenniallyPunishHistoryQueryV2ResponseData {
  public static final String SERIALIZED_NAME_PUNISH_LIST = "punish_list";
  @SerializedName(SERIALIZED_NAME_PUNISH_LIST)
  private List<AgentAdvPerenniallyPunishHistoryQueryV2ResponseDataPunishListInner> punishList = null;

  public AgentAdvPerenniallyPunishHistoryQueryV2ResponseData() {
  }

  public AgentAdvPerenniallyPunishHistoryQueryV2ResponseData punishList(List<AgentAdvPerenniallyPunishHistoryQueryV2ResponseDataPunishListInner> punishList) {
    
    this.punishList = punishList;
    return this;
  }

  public AgentAdvPerenniallyPunishHistoryQueryV2ResponseData addPunishListItem(AgentAdvPerenniallyPunishHistoryQueryV2ResponseDataPunishListInner punishListItem) {
    if (this.punishList == null) {
      this.punishList = new ArrayList<>();
    }
    this.punishList.add(punishListItem);
    return this;
  }

   /**
   * 
   * @return punishList
  **/
  @javax.annotation.Nullable
  public List<AgentAdvPerenniallyPunishHistoryQueryV2ResponseDataPunishListInner> getPunishList() {
    return punishList;
  }


  public void setPunishList(List<AgentAdvPerenniallyPunishHistoryQueryV2ResponseDataPunishListInner> punishList) {
    this.punishList = punishList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvPerenniallyPunishHistoryQueryV2ResponseData agentAdvPerenniallyPunishHistoryQueryV2ResponseData = (AgentAdvPerenniallyPunishHistoryQueryV2ResponseData) o;
    return Objects.equals(this.punishList, agentAdvPerenniallyPunishHistoryQueryV2ResponseData.punishList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(punishList);
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
    sb.append("class AgentAdvPerenniallyPunishHistoryQueryV2ResponseData {\n");
    sb.append("    punishList: ").append(toIndentedString(punishList)).append("\n");
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
    openapiFields.add("punish_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvPerenniallyPunishHistoryQueryV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvPerenniallyPunishHistoryQueryV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvPerenniallyPunishHistoryQueryV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvPerenniallyPunishHistoryQueryV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvPerenniallyPunishHistoryQueryV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AgentAdvPerenniallyPunishHistoryQueryV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvPerenniallyPunishHistoryQueryV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvPerenniallyPunishHistoryQueryV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvPerenniallyPunishHistoryQueryV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AgentAdvPerenniallyPunishHistoryQueryV2ResponseData
  */
  public static AgentAdvPerenniallyPunishHistoryQueryV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvPerenniallyPunishHistoryQueryV2ResponseData.class);
  }

 /**
  * Convert an instance of AgentAdvPerenniallyPunishHistoryQueryV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

