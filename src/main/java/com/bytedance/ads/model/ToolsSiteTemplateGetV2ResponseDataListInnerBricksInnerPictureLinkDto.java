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
import com.bytedance.ads.model.ToolsSiteTemplateGetV2DataListBricksPictureLinkDtoLinkType;
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
 * 图片跳转链接信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto {
  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private ToolsSiteTemplateGetV2DataListBricksPictureLinkDtoLinkType linkType = null;

  public static final String SERIALIZED_NAME_QUICK_APP = "quick_app";
  @SerializedName(SERIALIZED_NAME_QUICK_APP)
  private String quickApp = null;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto() {
  }

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto linkType(ToolsSiteTemplateGetV2DataListBricksPictureLinkDtoLinkType linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * Get linkType
   * @return linkType
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2DataListBricksPictureLinkDtoLinkType getLinkType() {
    return linkType;
  }


  public void setLinkType(ToolsSiteTemplateGetV2DataListBricksPictureLinkDtoLinkType linkType) {
    this.linkType = linkType;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto quickApp(String quickApp) {
    
    this.quickApp = quickApp;
    return this;
  }

   /**
   * 快应用地址，当&#x60;link_type&#x60;等于&#x60;QUICK_APP&#x60;时，有值
   * @return quickApp
  **/
  @javax.annotation.Nullable
  public String getQuickApp() {
    return quickApp;
  }


  public void setQuickApp(String quickApp) {
    this.quickApp = quickApp;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * scheme地址，当&#x60;link_type&#x60;等于&#x60;SCHEME&#x60;时，有值
   * @return scheme
  **/
  @javax.annotation.Nullable
  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 链接地址，当&#x60;link_type&#x60;等于&#x60;URL&#x60;时，有值
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
    ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto = (ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto) o;
    return Objects.equals(this.linkType, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto.linkType) &&
        Objects.equals(this.quickApp, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto.quickApp) &&
        Objects.equals(this.scheme, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto.scheme) &&
        Objects.equals(this.url, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkType, quickApp, scheme, url);
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
    sb.append("class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto {\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    quickApp: ").append(toIndentedString(quickApp)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
    openapiFields.add("link_type");
    openapiFields.add("quick_app");
    openapiFields.add("scheme");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("link_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto
  */
  public static ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureLinkDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

