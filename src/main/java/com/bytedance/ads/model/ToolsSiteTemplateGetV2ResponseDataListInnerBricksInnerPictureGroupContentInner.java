/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInnerLinkDto;
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
 * ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner {
  public static final String SERIALIZED_NAME_LINK_DTO = "link_dto";
  @SerializedName(SERIALIZED_NAME_LINK_DTO)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInnerLinkDto linkDto = null;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner() {
  }

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner linkDto(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInnerLinkDto linkDto) {
    
    this.linkDto = linkDto;
    return this;
  }

   /**
   * Get linkDto
   * @return linkDto
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInnerLinkDto getLinkDto() {
    return linkDto;
  }


  public void setLinkDto(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInnerLinkDto linkDto) {
    this.linkDto = linkDto;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 标签
   * @return tag
  **/
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 用户自行上传的图片url，当content不为空时，有值
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner = (ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner) o;
    return Objects.equals(this.linkDto, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner.linkDto) &&
        Objects.equals(this.tag, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner.tag) &&
        Objects.equals(this.url, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkDto, tag, url);
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
    sb.append("class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner {\n");
    sb.append("    linkDto: ").append(toIndentedString(linkDto)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("link_dto");
    openapiFields.add("tag");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner
  */
  public static ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroupContentInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

