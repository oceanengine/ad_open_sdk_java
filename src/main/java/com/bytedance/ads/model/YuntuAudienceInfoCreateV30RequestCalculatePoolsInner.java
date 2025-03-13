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
import com.bytedance.ads.model.YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner;
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
 * YuntuAudienceInfoCreateV30RequestCalculatePoolsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class YuntuAudienceInfoCreateV30RequestCalculatePoolsInner {
  public static final String SERIALIZED_NAME_INNER_OP = "inner_op";
  @SerializedName(SERIALIZED_NAME_INNER_OP)
  private String innerOp = null;

  public static final String SERIALIZED_NAME_OUTER_OP = "outer_op";
  @SerializedName(SERIALIZED_NAME_OUTER_OP)
  private String outerOp = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner> tags = null;

  public YuntuAudienceInfoCreateV30RequestCalculatePoolsInner() {
  }

  public YuntuAudienceInfoCreateV30RequestCalculatePoolsInner innerOp(String innerOp) {
    
    this.innerOp = innerOp;
    return this;
  }

   /**
   * 池内运算符，枚举值\&quot;|\&quot;或\&quot;&amp;\&quot;，当运算池内只有一个标签/人群包时，该运算符必须为空字符串
   * @return innerOp
  **/
  @javax.annotation.Nonnull
  public String getInnerOp() {
    return innerOp;
  }


  public void setInnerOp(String innerOp) {
    this.innerOp = innerOp;
  }


  public YuntuAudienceInfoCreateV30RequestCalculatePoolsInner outerOp(String outerOp) {
    
    this.outerOp = outerOp;
    return this;
  }

   /**
   * 池间运算符，枚举值\&quot;|\&quot;或\&quot;&amp;\&quot;或\&quot;~\&quot;，第0个运算池的池间运算符必须为空字符串
   * @return outerOp
  **/
  @javax.annotation.Nonnull
  public String getOuterOp() {
    return outerOp;
  }


  public void setOuterOp(String outerOp) {
    this.outerOp = outerOp;
  }


  public YuntuAudienceInfoCreateV30RequestCalculatePoolsInner tags(List<YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner> tags) {
    
    this.tags = tags;
    return this;
  }

  public YuntuAudienceInfoCreateV30RequestCalculatePoolsInner addTagsItem(YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 运算池中人群包/标签数组
   * @return tags
  **/
  @javax.annotation.Nonnull
  public List<YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner> getTags() {
    return tags;
  }


  public void setTags(List<YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YuntuAudienceInfoCreateV30RequestCalculatePoolsInner yuntuAudienceInfoCreateV30RequestCalculatePoolsInner = (YuntuAudienceInfoCreateV30RequestCalculatePoolsInner) o;
    return Objects.equals(this.innerOp, yuntuAudienceInfoCreateV30RequestCalculatePoolsInner.innerOp) &&
        Objects.equals(this.outerOp, yuntuAudienceInfoCreateV30RequestCalculatePoolsInner.outerOp) &&
        Objects.equals(this.tags, yuntuAudienceInfoCreateV30RequestCalculatePoolsInner.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(innerOp, outerOp, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YuntuAudienceInfoCreateV30RequestCalculatePoolsInner {\n");
    sb.append("    innerOp: ").append(toIndentedString(innerOp)).append("\n");
    sb.append("    outerOp: ").append(toIndentedString(outerOp)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("inner_op");
    openapiFields.add("outer_op");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inner_op");
    openapiRequiredFields.add("outer_op");
    openapiRequiredFields.add("tags");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YuntuAudienceInfoCreateV30RequestCalculatePoolsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YuntuAudienceInfoCreateV30RequestCalculatePoolsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YuntuAudienceInfoCreateV30RequestCalculatePoolsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YuntuAudienceInfoCreateV30RequestCalculatePoolsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<YuntuAudienceInfoCreateV30RequestCalculatePoolsInner>() {
           @Override
           public void write(JsonWriter out, YuntuAudienceInfoCreateV30RequestCalculatePoolsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YuntuAudienceInfoCreateV30RequestCalculatePoolsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of YuntuAudienceInfoCreateV30RequestCalculatePoolsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of YuntuAudienceInfoCreateV30RequestCalculatePoolsInner
  * @throws IOException if the JSON string is invalid with respect to YuntuAudienceInfoCreateV30RequestCalculatePoolsInner
  */
  public static YuntuAudienceInfoCreateV30RequestCalculatePoolsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YuntuAudienceInfoCreateV30RequestCalculatePoolsInner.class);
  }

 /**
  * Convert an instance of YuntuAudienceInfoCreateV30RequestCalculatePoolsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

