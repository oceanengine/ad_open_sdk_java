/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo {
  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Long authorId = null;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName = null;

  public static final String SERIALIZED_NAME_DOUYIN_ID = "douyin_id";
  @SerializedName(SERIALIZED_NAME_DOUYIN_ID)
  private String douyinId = null;

  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo() {
  }

  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo authorId(Long authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * 达人ID
   * @return authorId
  **/
  @javax.annotation.Nullable
  public Long getAuthorId() {
    return authorId;
  }


  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * 达人名称
   * @return authorName
  **/
  @javax.annotation.Nullable
  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo douyinId(String douyinId) {
    
    this.douyinId = douyinId;
    return this;
  }

   /**
   * 抖音号
   * @return douyinId
  **/
  @javax.annotation.Nullable
  public String getDouyinId() {
    return douyinId;
  }


  public void setDouyinId(String douyinId) {
    this.douyinId = douyinId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo starChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo = (StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo) o;
    return Objects.equals(this.authorId, starChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo.authorId) &&
        Objects.equals(this.authorName, starChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo.authorName) &&
        Objects.equals(this.douyinId, starChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo.douyinId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, authorName, douyinId);
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
    sb.append("class StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    douyinId: ").append(toIndentedString(douyinId)).append("\n");
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
    openapiFields.add("author_id");
    openapiFields.add("author_name");
    openapiFields.add("douyin_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo>() {
           @Override
           public void write(JsonWriter out, StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo
  * @throws IOException if the JSON string is invalid with respect to StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo
  */
  public static StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo.class);
  }

 /**
  * Convert an instance of StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

