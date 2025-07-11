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
import com.bytedance.ads.model.CreativeStrategyListV2DataStrategyModelsType;
import com.bytedance.ads.model.CreativeStrategyListV2ResponseDataStrategyModelsInnerInfo;
import com.bytedance.ads.model.CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner;
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
 * CreativeStrategyListV2ResponseDataStrategyModelsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class CreativeStrategyListV2ResponseDataStrategyModelsInner {
  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private CreativeStrategyListV2ResponseDataStrategyModelsInnerInfo info = null;

  public static final String SERIALIZED_NAME_STATE_LIST = "state_list";
  @SerializedName(SERIALIZED_NAME_STATE_LIST)
  private List<CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner> stateList = null;

  public static final String SERIALIZED_NAME_STRATEGY_ID = "strategy_id";
  @SerializedName(SERIALIZED_NAME_STRATEGY_ID)
  private Long strategyId = null;

  public static final String SERIALIZED_NAME_STRATEGY_NAME = "strategy_name";
  @SerializedName(SERIALIZED_NAME_STRATEGY_NAME)
  private String strategyName = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CreativeStrategyListV2DataStrategyModelsType type = null;

  public CreativeStrategyListV2ResponseDataStrategyModelsInner() {
  }

  public CreativeStrategyListV2ResponseDataStrategyModelsInner info(CreativeStrategyListV2ResponseDataStrategyModelsInnerInfo info) {
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nullable
  public CreativeStrategyListV2ResponseDataStrategyModelsInnerInfo getInfo() {
    return info;
  }


  public void setInfo(CreativeStrategyListV2ResponseDataStrategyModelsInnerInfo info) {
    this.info = info;
  }


  public CreativeStrategyListV2ResponseDataStrategyModelsInner stateList(List<CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner> stateList) {
    
    this.stateList = stateList;
    return this;
  }

  public CreativeStrategyListV2ResponseDataStrategyModelsInner addStateListItem(CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner stateListItem) {
    if (this.stateList == null) {
      this.stateList = new ArrayList<>();
    }
    this.stateList.add(stateListItem);
    return this;
  }

   /**
   * 策略配置项列表
   * @return stateList
  **/
  @javax.annotation.Nullable
  public List<CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner> getStateList() {
    return stateList;
  }


  public void setStateList(List<CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInner> stateList) {
    this.stateList = stateList;
  }


  public CreativeStrategyListV2ResponseDataStrategyModelsInner strategyId(Long strategyId) {
    
    this.strategyId = strategyId;
    return this;
  }

   /**
   * 策略id
   * @return strategyId
  **/
  @javax.annotation.Nullable
  public Long getStrategyId() {
    return strategyId;
  }


  public void setStrategyId(Long strategyId) {
    this.strategyId = strategyId;
  }


  public CreativeStrategyListV2ResponseDataStrategyModelsInner strategyName(String strategyName) {
    
    this.strategyName = strategyName;
    return this;
  }

   /**
   * 策略名称
   * @return strategyName
  **/
  @javax.annotation.Nullable
  public String getStrategyName() {
    return strategyName;
  }


  public void setStrategyName(String strategyName) {
    this.strategyName = strategyName;
  }


  public CreativeStrategyListV2ResponseDataStrategyModelsInner type(CreativeStrategyListV2DataStrategyModelsType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public CreativeStrategyListV2DataStrategyModelsType getType() {
    return type;
  }


  public void setType(CreativeStrategyListV2DataStrategyModelsType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeStrategyListV2ResponseDataStrategyModelsInner creativeStrategyListV2ResponseDataStrategyModelsInner = (CreativeStrategyListV2ResponseDataStrategyModelsInner) o;
    return Objects.equals(this.info, creativeStrategyListV2ResponseDataStrategyModelsInner.info) &&
        Objects.equals(this.stateList, creativeStrategyListV2ResponseDataStrategyModelsInner.stateList) &&
        Objects.equals(this.strategyId, creativeStrategyListV2ResponseDataStrategyModelsInner.strategyId) &&
        Objects.equals(this.strategyName, creativeStrategyListV2ResponseDataStrategyModelsInner.strategyName) &&
        Objects.equals(this.type, creativeStrategyListV2ResponseDataStrategyModelsInner.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, stateList, strategyId, strategyName, type);
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
    sb.append("class CreativeStrategyListV2ResponseDataStrategyModelsInner {\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    stateList: ").append(toIndentedString(stateList)).append("\n");
    sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
    sb.append("    strategyName: ").append(toIndentedString(strategyName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("info");
    openapiFields.add("state_list");
    openapiFields.add("strategy_id");
    openapiFields.add("strategy_name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("strategy_id");
    openapiRequiredFields.add("type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeStrategyListV2ResponseDataStrategyModelsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeStrategyListV2ResponseDataStrategyModelsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeStrategyListV2ResponseDataStrategyModelsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeStrategyListV2ResponseDataStrategyModelsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeStrategyListV2ResponseDataStrategyModelsInner>() {
           @Override
           public void write(JsonWriter out, CreativeStrategyListV2ResponseDataStrategyModelsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeStrategyListV2ResponseDataStrategyModelsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeStrategyListV2ResponseDataStrategyModelsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeStrategyListV2ResponseDataStrategyModelsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeStrategyListV2ResponseDataStrategyModelsInner
  */
  public static CreativeStrategyListV2ResponseDataStrategyModelsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeStrategyListV2ResponseDataStrategyModelsInner.class);
  }

 /**
  * Convert an instance of CreativeStrategyListV2ResponseDataStrategyModelsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

