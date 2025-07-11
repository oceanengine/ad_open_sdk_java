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
import com.bytedance.ads.model.ProjectListV30DataListKeywordsBidType;
import com.bytedance.ads.model.ProjectListV30DataListKeywordsMatchType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * ProjectListV30ResponseDataListInnerKeywordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ProjectListV30ResponseDataListInnerKeywordsInner {
  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private ProjectListV30DataListKeywordsBidType bidType = null;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private ProjectListV30DataListKeywordsMatchType matchType = null;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word = null;

  public ProjectListV30ResponseDataListInnerKeywordsInner() {
  }

  public ProjectListV30ResponseDataListInnerKeywordsInner bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * @return bid
  **/
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public ProjectListV30ResponseDataListInnerKeywordsInner bidType(ProjectListV30DataListKeywordsBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListKeywordsBidType getBidType() {
    return bidType;
  }


  public void setBidType(ProjectListV30DataListKeywordsBidType bidType) {
    this.bidType = bidType;
  }


  public ProjectListV30ResponseDataListInnerKeywordsInner matchType(ProjectListV30DataListKeywordsMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListKeywordsMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(ProjectListV30DataListKeywordsMatchType matchType) {
    this.matchType = matchType;
  }


  public ProjectListV30ResponseDataListInnerKeywordsInner word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * 关键名称
   * @return word
  **/
  @javax.annotation.Nullable
  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    this.word = word;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectListV30ResponseDataListInnerKeywordsInner projectListV30ResponseDataListInnerKeywordsInner = (ProjectListV30ResponseDataListInnerKeywordsInner) o;
    return Objects.equals(this.bid, projectListV30ResponseDataListInnerKeywordsInner.bid) &&
        Objects.equals(this.bidType, projectListV30ResponseDataListInnerKeywordsInner.bidType) &&
        Objects.equals(this.matchType, projectListV30ResponseDataListInnerKeywordsInner.matchType) &&
        Objects.equals(this.word, projectListV30ResponseDataListInnerKeywordsInner.word);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, bidType, matchType, word);
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
    sb.append("class ProjectListV30ResponseDataListInnerKeywordsInner {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
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
    openapiFields.add("bid");
    openapiFields.add("bid_type");
    openapiFields.add("match_type");
    openapiFields.add("word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectListV30ResponseDataListInnerKeywordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectListV30ResponseDataListInnerKeywordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectListV30ResponseDataListInnerKeywordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectListV30ResponseDataListInnerKeywordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectListV30ResponseDataListInnerKeywordsInner>() {
           @Override
           public void write(JsonWriter out, ProjectListV30ResponseDataListInnerKeywordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectListV30ResponseDataListInnerKeywordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectListV30ResponseDataListInnerKeywordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectListV30ResponseDataListInnerKeywordsInner
  * @throws IOException if the JSON string is invalid with respect to ProjectListV30ResponseDataListInnerKeywordsInner
  */
  public static ProjectListV30ResponseDataListInnerKeywordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectListV30ResponseDataListInnerKeywordsInner.class);
  }

 /**
  * Convert an instance of ProjectListV30ResponseDataListInnerKeywordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

