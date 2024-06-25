/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner;
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
 * ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private String adId = null;

  public static final String SERIALIZED_NAME_SCENE_LIST = "scene_list";
  @SerializedName(SERIALIZED_NAME_SCENE_LIST)
  private List<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner> sceneList = null;

  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner() {
  }

  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner adId(String adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划ID
   * @return adId
  **/
  @javax.annotation.Nullable
  public String getAdId() {
    return adId;
  }


  public void setAdId(String adId) {
    this.adId = adId;
  }


  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner sceneList(List<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner> sceneList) {
    
    this.sceneList = sceneList;
    return this;
  }

  public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner addSceneListItem(ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner sceneListItem) {
    if (this.sceneList == null) {
      this.sceneList = new ArrayList<>();
    }
    this.sceneList.add(sceneListItem);
    return this;
  }

   /**
   * 建议列表
   * @return sceneList
  **/
  @javax.annotation.Nullable
  public List<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner> getSceneList() {
    return sceneList;
  }


  public void setSceneList(List<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInnerSceneListInner> sceneList) {
    this.sceneList = sceneList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner toolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner = (ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner) o;
    return Objects.equals(this.adId, toolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner.adId) &&
        Objects.equals(this.sceneList, toolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner.sceneList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, sceneList);
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
    sb.append("class ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    sceneList: ").append(toIndentedString(sceneList)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("scene_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner
  */
  public static ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisSuggestionGetV2ResponseDataSuggestionListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

