/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-18T11:13:59.161423804+08:00[Asia/Shanghai]")
public class ToolsPromotionDiagnosisSuggestionGetV30ResponseData {
  public static final String SERIALIZED_NAME_DIAGNOSIS_ID = "diagnosis_id";
  @SerializedName(SERIALIZED_NAME_DIAGNOSIS_ID)
  private String diagnosisId = null;

  public static final String SERIALIZED_NAME_EXPIRE_TIMESTAMP = "expire_timestamp";
  @SerializedName(SERIALIZED_NAME_EXPIRE_TIMESTAMP)
  private String expireTimestamp = null;

  public static final String SERIALIZED_NAME_SUGGESTION_LIST = "suggestion_list";
  @SerializedName(SERIALIZED_NAME_SUGGESTION_LIST)
  private List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner> suggestionList = null;

  public ToolsPromotionDiagnosisSuggestionGetV30ResponseData() {
  }

  public ToolsPromotionDiagnosisSuggestionGetV30ResponseData diagnosisId(String diagnosisId) {
    
    this.diagnosisId = diagnosisId;
    return this;
  }

   /**
   * 
   * @return diagnosisId
  **/
  @javax.annotation.Nullable
  public String getDiagnosisId() {
    return diagnosisId;
  }


  public void setDiagnosisId(String diagnosisId) {
    this.diagnosisId = diagnosisId;
  }


  public ToolsPromotionDiagnosisSuggestionGetV30ResponseData expireTimestamp(String expireTimestamp) {
    
    this.expireTimestamp = expireTimestamp;
    return this;
  }

   /**
   * 
   * @return expireTimestamp
  **/
  @javax.annotation.Nullable
  public String getExpireTimestamp() {
    return expireTimestamp;
  }


  public void setExpireTimestamp(String expireTimestamp) {
    this.expireTimestamp = expireTimestamp;
  }


  public ToolsPromotionDiagnosisSuggestionGetV30ResponseData suggestionList(List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner> suggestionList) {
    
    this.suggestionList = suggestionList;
    return this;
  }

  public ToolsPromotionDiagnosisSuggestionGetV30ResponseData addSuggestionListItem(ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner suggestionListItem) {
    if (this.suggestionList == null) {
      this.suggestionList = new ArrayList<>();
    }
    this.suggestionList.add(suggestionListItem);
    return this;
  }

   /**
   * 
   * @return suggestionList
  **/
  @javax.annotation.Nullable
  public List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner> getSuggestionList() {
    return suggestionList;
  }


  public void setSuggestionList(List<ToolsPromotionDiagnosisSuggestionGetV30ResponseDataSuggestionListInner> suggestionList) {
    this.suggestionList = suggestionList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionDiagnosisSuggestionGetV30ResponseData toolsPromotionDiagnosisSuggestionGetV30ResponseData = (ToolsPromotionDiagnosisSuggestionGetV30ResponseData) o;
    return Objects.equals(this.diagnosisId, toolsPromotionDiagnosisSuggestionGetV30ResponseData.diagnosisId) &&
        Objects.equals(this.expireTimestamp, toolsPromotionDiagnosisSuggestionGetV30ResponseData.expireTimestamp) &&
        Objects.equals(this.suggestionList, toolsPromotionDiagnosisSuggestionGetV30ResponseData.suggestionList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnosisId, expireTimestamp, suggestionList);
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
    sb.append("class ToolsPromotionDiagnosisSuggestionGetV30ResponseData {\n");
    sb.append("    diagnosisId: ").append(toIndentedString(diagnosisId)).append("\n");
    sb.append("    expireTimestamp: ").append(toIndentedString(expireTimestamp)).append("\n");
    sb.append("    suggestionList: ").append(toIndentedString(suggestionList)).append("\n");
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
    openapiFields.add("diagnosis_id");
    openapiFields.add("expire_timestamp");
    openapiFields.add("suggestion_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionDiagnosisSuggestionGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionDiagnosisSuggestionGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionDiagnosisSuggestionGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionDiagnosisSuggestionGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionDiagnosisSuggestionGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionDiagnosisSuggestionGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionDiagnosisSuggestionGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionDiagnosisSuggestionGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionDiagnosisSuggestionGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionDiagnosisSuggestionGetV30ResponseData
  */
  public static ToolsPromotionDiagnosisSuggestionGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionDiagnosisSuggestionGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsPromotionDiagnosisSuggestionGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
