/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult {
  public static final String SERIALIZED_NAME_CTR_CONCLUSION_DETAIL = "ctr_conclusion_detail";
  @SerializedName(SERIALIZED_NAME_CTR_CONCLUSION_DETAIL)
  private String ctrConclusionDetail = null;

  public static final String SERIALIZED_NAME_CTR_CONCLUSION_TAG = "ctr_conclusion_tag";
  @SerializedName(SERIALIZED_NAME_CTR_CONCLUSION_TAG)
  private String ctrConclusionTag = null;

  public static final String SERIALIZED_NAME_CTR_SUGGESTION = "ctr_suggestion";
  @SerializedName(SERIALIZED_NAME_CTR_SUGGESTION)
  private List<String> ctrSuggestion = null;

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult() {
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult ctrConclusionDetail(String ctrConclusionDetail) {
    
    this.ctrConclusionDetail = ctrConclusionDetail;
    return this;
  }

   /**
   * 
   * @return ctrConclusionDetail
  **/
  @javax.annotation.Nullable
  public String getCtrConclusionDetail() {
    return ctrConclusionDetail;
  }


  public void setCtrConclusionDetail(String ctrConclusionDetail) {
    this.ctrConclusionDetail = ctrConclusionDetail;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult ctrConclusionTag(String ctrConclusionTag) {
    
    this.ctrConclusionTag = ctrConclusionTag;
    return this;
  }

   /**
   * 
   * @return ctrConclusionTag
  **/
  @javax.annotation.Nullable
  public String getCtrConclusionTag() {
    return ctrConclusionTag;
  }


  public void setCtrConclusionTag(String ctrConclusionTag) {
    this.ctrConclusionTag = ctrConclusionTag;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult ctrSuggestion(List<String> ctrSuggestion) {
    
    this.ctrSuggestion = ctrSuggestion;
    return this;
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult addCtrSuggestionItem(String ctrSuggestionItem) {
    if (this.ctrSuggestion == null) {
      this.ctrSuggestion = new ArrayList<>();
    }
    this.ctrSuggestion.add(ctrSuggestionItem);
    return this;
  }

   /**
   * 
   * @return ctrSuggestion
  **/
  @javax.annotation.Nullable
  public List<String> getCtrSuggestion() {
    return ctrSuggestion;
  }


  public void setCtrSuggestion(List<String> ctrSuggestion) {
    this.ctrSuggestion = ctrSuggestion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult toolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult = (ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult) o;
    return Objects.equals(this.ctrConclusionDetail, toolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult.ctrConclusionDetail) &&
        Objects.equals(this.ctrConclusionTag, toolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult.ctrConclusionTag) &&
        Objects.equals(this.ctrSuggestion, toolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult.ctrSuggestion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ctrConclusionDetail, ctrConclusionTag, ctrSuggestion);
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
    sb.append("class ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult {\n");
    sb.append("    ctrConclusionDetail: ").append(toIndentedString(ctrConclusionDetail)).append("\n");
    sb.append("    ctrConclusionTag: ").append(toIndentedString(ctrConclusionTag)).append("\n");
    sb.append("    ctrSuggestion: ").append(toIndentedString(ctrSuggestion)).append("\n");
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
    openapiFields.add("ctr_conclusion_detail");
    openapiFields.add("ctr_conclusion_tag");
    openapiFields.add("ctr_suggestion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult
  */
  public static ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerCtrResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

