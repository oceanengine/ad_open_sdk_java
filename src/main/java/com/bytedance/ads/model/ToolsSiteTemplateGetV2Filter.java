/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateGetV2Filter {
  public static final String SERIALIZED_NAME_KEYWORD_OF_NAME = "keyword_of_name";
  @SerializedName(SERIALIZED_NAME_KEYWORD_OF_NAME)
  private String keywordOfName = null;

  public static final String SERIALIZED_NAME_SITE_IDS = "site_ids";
  @SerializedName(SERIALIZED_NAME_SITE_IDS)
  private List<Long> siteIds = null;

  public static final String SERIALIZED_NAME_TEMPLATE_IDS = "template_ids";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IDS)
  private List<Long> templateIds = null;

  public ToolsSiteTemplateGetV2Filter() {
  }

  public ToolsSiteTemplateGetV2Filter keywordOfName(String keywordOfName) {
    
    this.keywordOfName = keywordOfName;
    return this;
  }

   /**
   * 模板名称关键词
   * @return keywordOfName
  **/
  @javax.annotation.Nullable
  public String getKeywordOfName() {
    return keywordOfName;
  }


  public void setKeywordOfName(String keywordOfName) {
    this.keywordOfName = keywordOfName;
  }


  public ToolsSiteTemplateGetV2Filter siteIds(List<Long> siteIds) {
    
    this.siteIds = siteIds;
    return this;
  }

  public ToolsSiteTemplateGetV2Filter addSiteIdsItem(Long siteIdsItem) {
    if (this.siteIds == null) {
      this.siteIds = new ArrayList<>();
    }
    this.siteIds.add(siteIdsItem);
    return this;
  }

   /**
   * 站点ID，可通过[【橙子建站】（https://www.chengzijianzhan.com/）]平台或[【获取橙子建站站点列表】](https://open.oceanengine.com/doc/index.html?key&#x3D;ad&amp;type&#x3D;api&amp;id&#x3D;1696710620579852#item-link-%E8%AF%B7%E6%B1%82%E5%9C%B0%E5%9D%80)获取
   * @return siteIds
  **/
  @javax.annotation.Nullable
  public List<Long> getSiteIds() {
    return siteIds;
  }


  public void setSiteIds(List<Long> siteIds) {
    this.siteIds = siteIds;
  }


  public ToolsSiteTemplateGetV2Filter templateIds(List<Long> templateIds) {
    
    this.templateIds = templateIds;
    return this;
  }

  public ToolsSiteTemplateGetV2Filter addTemplateIdsItem(Long templateIdsItem) {
    if (this.templateIds == null) {
      this.templateIds = new ArrayList<>();
    }
    this.templateIds.add(templateIdsItem);
    return this;
  }

   /**
   * 模板ID数组，【基于站点创建模板】接口创建的模板ID
   * @return templateIds
  **/
  @javax.annotation.Nullable
  public List<Long> getTemplateIds() {
    return templateIds;
  }


  public void setTemplateIds(List<Long> templateIds) {
    this.templateIds = templateIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateGetV2Filter toolsSiteTemplateGetV2Filter = (ToolsSiteTemplateGetV2Filter) o;
    return Objects.equals(this.keywordOfName, toolsSiteTemplateGetV2Filter.keywordOfName) &&
        Objects.equals(this.siteIds, toolsSiteTemplateGetV2Filter.siteIds) &&
        Objects.equals(this.templateIds, toolsSiteTemplateGetV2Filter.templateIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordOfName, siteIds, templateIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteTemplateGetV2Filter {\n");
    sb.append("    keywordOfName: ").append(toIndentedString(keywordOfName)).append("\n");
    sb.append("    siteIds: ").append(toIndentedString(siteIds)).append("\n");
    sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
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
    openapiFields.add("keyword_of_name");
    openapiFields.add("site_ids");
    openapiFields.add("template_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateGetV2Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateGetV2Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateGetV2Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateGetV2Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateGetV2Filter>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateGetV2Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateGetV2Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateGetV2Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateGetV2Filter
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateGetV2Filter
  */
  public static ToolsSiteTemplateGetV2Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateGetV2Filter.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateGetV2Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

