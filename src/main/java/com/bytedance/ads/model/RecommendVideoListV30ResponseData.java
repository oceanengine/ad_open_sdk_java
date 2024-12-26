/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.RecommendVideoListV30ResponseDataRecommendVideoListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class RecommendVideoListV30ResponseData {
  public static final String SERIALIZED_NAME_RECOMMEND_VIDEO_LIST = "recommend_video_list";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_VIDEO_LIST)
  private List<RecommendVideoListV30ResponseDataRecommendVideoListInner> recommendVideoList = null;

  public RecommendVideoListV30ResponseData() {
  }

  public RecommendVideoListV30ResponseData recommendVideoList(List<RecommendVideoListV30ResponseDataRecommendVideoListInner> recommendVideoList) {
    
    this.recommendVideoList = recommendVideoList;
    return this;
  }

  public RecommendVideoListV30ResponseData addRecommendVideoListItem(RecommendVideoListV30ResponseDataRecommendVideoListInner recommendVideoListItem) {
    if (this.recommendVideoList == null) {
      this.recommendVideoList = new ArrayList<>();
    }
    this.recommendVideoList.add(recommendVideoListItem);
    return this;
  }

   /**
   * 
   * @return recommendVideoList
  **/
  @javax.annotation.Nullable
  public List<RecommendVideoListV30ResponseDataRecommendVideoListInner> getRecommendVideoList() {
    return recommendVideoList;
  }


  public void setRecommendVideoList(List<RecommendVideoListV30ResponseDataRecommendVideoListInner> recommendVideoList) {
    this.recommendVideoList = recommendVideoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendVideoListV30ResponseData recommendVideoListV30ResponseData = (RecommendVideoListV30ResponseData) o;
    return Objects.equals(this.recommendVideoList, recommendVideoListV30ResponseData.recommendVideoList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendVideoList);
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
    sb.append("class RecommendVideoListV30ResponseData {\n");
    sb.append("    recommendVideoList: ").append(toIndentedString(recommendVideoList)).append("\n");
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
    openapiFields.add("recommend_video_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecommendVideoListV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecommendVideoListV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecommendVideoListV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecommendVideoListV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<RecommendVideoListV30ResponseData>() {
           @Override
           public void write(JsonWriter out, RecommendVideoListV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecommendVideoListV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecommendVideoListV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecommendVideoListV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to RecommendVideoListV30ResponseData
  */
  public static RecommendVideoListV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecommendVideoListV30ResponseData.class);
  }

 /**
  * Convert an instance of RecommendVideoListV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

