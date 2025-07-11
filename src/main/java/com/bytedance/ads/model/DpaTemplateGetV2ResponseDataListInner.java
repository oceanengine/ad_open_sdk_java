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
import com.bytedance.ads.model.DpaTemplateGetV2DataListTemplateMode;
import com.bytedance.ads.model.DpaTemplateGetV2ResponseDataListInnerTemplateDataListInner;
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
 * DpaTemplateGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class DpaTemplateGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_INDUSTRY = "industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private Long industry = null;

  public static final String SERIALIZED_NAME_IS_PUBLIC = "is_public";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private Boolean isPublic = null;

  public static final String SERIALIZED_NAME_TEMPLATE_DATA_LIST = "template_data_list";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_DATA_LIST)
  private List<DpaTemplateGetV2ResponseDataListInnerTemplateDataListInner> templateDataList = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Long templateId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_MODE = "template_mode";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_MODE)
  private DpaTemplateGetV2DataListTemplateMode templateMode = null;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "template_name";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName = null;

  public DpaTemplateGetV2ResponseDataListInner() {
  }

  public DpaTemplateGetV2ResponseDataListInner industry(Long industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * 
   * @return industry
  **/
  @javax.annotation.Nullable
  public Long getIndustry() {
    return industry;
  }


  public void setIndustry(Long industry) {
    this.industry = industry;
  }


  public DpaTemplateGetV2ResponseDataListInner isPublic(Boolean isPublic) {
    
    this.isPublic = isPublic;
    return this;
  }

   /**
   * 
   * @return isPublic
  **/
  @javax.annotation.Nullable
  public Boolean getIsPublic() {
    return isPublic;
  }


  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public DpaTemplateGetV2ResponseDataListInner templateDataList(List<DpaTemplateGetV2ResponseDataListInnerTemplateDataListInner> templateDataList) {
    
    this.templateDataList = templateDataList;
    return this;
  }

  public DpaTemplateGetV2ResponseDataListInner addTemplateDataListItem(DpaTemplateGetV2ResponseDataListInnerTemplateDataListInner templateDataListItem) {
    if (this.templateDataList == null) {
      this.templateDataList = new ArrayList<>();
    }
    this.templateDataList.add(templateDataListItem);
    return this;
  }

   /**
   * 
   * @return templateDataList
  **/
  @javax.annotation.Nullable
  public List<DpaTemplateGetV2ResponseDataListInnerTemplateDataListInner> getTemplateDataList() {
    return templateDataList;
  }


  public void setTemplateDataList(List<DpaTemplateGetV2ResponseDataListInnerTemplateDataListInner> templateDataList) {
    this.templateDataList = templateDataList;
  }


  public DpaTemplateGetV2ResponseDataListInner templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 
   * @return templateId
  **/
  @javax.annotation.Nullable
  public Long getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }


  public DpaTemplateGetV2ResponseDataListInner templateMode(DpaTemplateGetV2DataListTemplateMode templateMode) {
    
    this.templateMode = templateMode;
    return this;
  }

   /**
   * Get templateMode
   * @return templateMode
  **/
  @javax.annotation.Nullable
  public DpaTemplateGetV2DataListTemplateMode getTemplateMode() {
    return templateMode;
  }


  public void setTemplateMode(DpaTemplateGetV2DataListTemplateMode templateMode) {
    this.templateMode = templateMode;
  }


  public DpaTemplateGetV2ResponseDataListInner templateName(String templateName) {
    
    this.templateName = templateName;
    return this;
  }

   /**
   * 
   * @return templateName
  **/
  @javax.annotation.Nullable
  public String getTemplateName() {
    return templateName;
  }


  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaTemplateGetV2ResponseDataListInner dpaTemplateGetV2ResponseDataListInner = (DpaTemplateGetV2ResponseDataListInner) o;
    return Objects.equals(this.industry, dpaTemplateGetV2ResponseDataListInner.industry) &&
        Objects.equals(this.isPublic, dpaTemplateGetV2ResponseDataListInner.isPublic) &&
        Objects.equals(this.templateDataList, dpaTemplateGetV2ResponseDataListInner.templateDataList) &&
        Objects.equals(this.templateId, dpaTemplateGetV2ResponseDataListInner.templateId) &&
        Objects.equals(this.templateMode, dpaTemplateGetV2ResponseDataListInner.templateMode) &&
        Objects.equals(this.templateName, dpaTemplateGetV2ResponseDataListInner.templateName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(industry, isPublic, templateDataList, templateId, templateMode, templateName);
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
    sb.append("class DpaTemplateGetV2ResponseDataListInner {\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    templateDataList: ").append(toIndentedString(templateDataList)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateMode: ").append(toIndentedString(templateMode)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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
    openapiFields.add("industry");
    openapiFields.add("is_public");
    openapiFields.add("template_data_list");
    openapiFields.add("template_id");
    openapiFields.add("template_mode");
    openapiFields.add("template_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaTemplateGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaTemplateGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaTemplateGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaTemplateGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaTemplateGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, DpaTemplateGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaTemplateGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaTemplateGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaTemplateGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to DpaTemplateGetV2ResponseDataListInner
  */
  public static DpaTemplateGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaTemplateGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of DpaTemplateGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

