/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates;
import com.bytedance.ads.model.ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState;
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
 * 线索后效转化信息，对于投放有优化效果
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo {
  public static final String SERIALIZED_NAME_CLUE_BIZ_STATES = "clue_biz_states";
  @SerializedName(SERIALIZED_NAME_CLUE_BIZ_STATES)
  private List<ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates> clueBizStates = null;

  public static final String SERIALIZED_NAME_CLUE_CONVERT_STATE = "clue_convert_state";
  @SerializedName(SERIALIZED_NAME_CLUE_CONVERT_STATE)
  private ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState clueConvertState = null;

  public ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo() {
  }

  public ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo clueBizStates(List<ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates> clueBizStates) {
    
    this.clueBizStates = clueBizStates;
    return this;
  }

  public ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo addClueBizStatesItem(ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates clueBizStatesItem) {
    if (this.clueBizStates == null) {
      this.clueBizStates = new ArrayList<>();
    }
    this.clueBizStates.add(clueBizStatesItem);
    return this;
  }

   /**
   * 平台定义的行业节点枚举值
   * @return clueBizStates
  **/
  @javax.annotation.Nullable
  public List<ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates> getClueBizStates() {
    return clueBizStates;
  }


  public void setClueBizStates(List<ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueBizStates> clueBizStates) {
    this.clueBizStates = clueBizStates;
  }


  public ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo clueConvertState(ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState clueConvertState) {
    
    this.clueConvertState = clueConvertState;
    return this;
  }

   /**
   * Get clueConvertState
   * @return clueConvertState
  **/
  @javax.annotation.Nonnull
  public ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState getClueConvertState() {
    return clueConvertState;
  }


  public void setClueConvertState(ToolsCluePrivateMessageCallbackV2ClueConvertInfoClueConvertState clueConvertState) {
    this.clueConvertState = clueConvertState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo toolsCluePrivateMessageCallbackV2RequestClueConvertInfo = (ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo) o;
    return Objects.equals(this.clueBizStates, toolsCluePrivateMessageCallbackV2RequestClueConvertInfo.clueBizStates) &&
        Objects.equals(this.clueConvertState, toolsCluePrivateMessageCallbackV2RequestClueConvertInfo.clueConvertState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clueBizStates, clueConvertState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo {\n");
    sb.append("    clueBizStates: ").append(toIndentedString(clueBizStates)).append("\n");
    sb.append("    clueConvertState: ").append(toIndentedString(clueConvertState)).append("\n");
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
    openapiFields.add("clue_biz_states");
    openapiFields.add("clue_convert_state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clue_convert_state");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo>() {
           @Override
           public void write(JsonWriter out, ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo
  * @throws IOException if the JSON string is invalid with respect to ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo
  */
  public static ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo.class);
  }

 /**
  * Convert an instance of ToolsCluePrivateMessageCallbackV2RequestClueConvertInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

