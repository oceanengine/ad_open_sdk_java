/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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
 * ToolsRubeexRemarkV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsRubeexRemarkV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_DATA_MD5 = "data_md5";
  @SerializedName(SERIALIZED_NAME_DATA_MD5)
  private String dataMd5 = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Double projectId = null;

  public static final String SERIALIZED_NAME_SECTION = "section";
  @SerializedName(SERIALIZED_NAME_SECTION)
  private String section = null;

  public static final String SERIALIZED_NAME_SECTION_AREA = "section_area";
  @SerializedName(SERIALIZED_NAME_SECTION_AREA)
  private String sectionArea = null;

  public static final String SERIALIZED_NAME_SECTION_AREA_REMARK = "section_area_remark";
  @SerializedName(SERIALIZED_NAME_SECTION_AREA_REMARK)
  private String sectionAreaRemark = null;

  public static final String SERIALIZED_NAME_SECTION_REMARK = "section_remark";
  @SerializedName(SERIALIZED_NAME_SECTION_REMARK)
  private String sectionRemark = null;

  public ToolsRubeexRemarkV2ResponseDataListInner() {
  }

  public ToolsRubeexRemarkV2ResponseDataListInner dataMd5(String dataMd5) {
    
    this.dataMd5 = dataMd5;
    return this;
  }

   /**
   * data_md5指rubeex工具产出的试玩素材作品版本，一个rubeex试玩素材可能有多个作品版本
   * @return dataMd5
  **/
  @javax.annotation.Nullable
  public String getDataMd5() {
    return dataMd5;
  }


  public void setDataMd5(String dataMd5) {
    this.dataMd5 = dataMd5;
  }


  public ToolsRubeexRemarkV2ResponseDataListInner projectId(Double projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 作品id即试玩素材id，属于试玩素材唯一标识
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Double getProjectId() {
    return projectId;
  }


  public void setProjectId(Double projectId) {
    this.projectId = projectId;
  }


  public ToolsRubeexRemarkV2ResponseDataListInner section(String section) {
    
    this.section = section;
    return this;
  }

   /**
   * 场景
   * @return section
  **/
  @javax.annotation.Nullable
  public String getSection() {
    return section;
  }


  public void setSection(String section) {
    this.section = section;
  }


  public ToolsRubeexRemarkV2ResponseDataListInner sectionArea(String sectionArea) {
    
    this.sectionArea = sectionArea;
    return this;
  }

   /**
   * 区域
   * @return sectionArea
  **/
  @javax.annotation.Nullable
  public String getSectionArea() {
    return sectionArea;
  }


  public void setSectionArea(String sectionArea) {
    this.sectionArea = sectionArea;
  }


  public ToolsRubeexRemarkV2ResponseDataListInner sectionAreaRemark(String sectionAreaRemark) {
    
    this.sectionAreaRemark = sectionAreaRemark;
    return this;
  }

   /**
   * 区域名称
   * @return sectionAreaRemark
  **/
  @javax.annotation.Nullable
  public String getSectionAreaRemark() {
    return sectionAreaRemark;
  }


  public void setSectionAreaRemark(String sectionAreaRemark) {
    this.sectionAreaRemark = sectionAreaRemark;
  }


  public ToolsRubeexRemarkV2ResponseDataListInner sectionRemark(String sectionRemark) {
    
    this.sectionRemark = sectionRemark;
    return this;
  }

   /**
   * 场景名称
   * @return sectionRemark
  **/
  @javax.annotation.Nullable
  public String getSectionRemark() {
    return sectionRemark;
  }


  public void setSectionRemark(String sectionRemark) {
    this.sectionRemark = sectionRemark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsRubeexRemarkV2ResponseDataListInner toolsRubeexRemarkV2ResponseDataListInner = (ToolsRubeexRemarkV2ResponseDataListInner) o;
    return Objects.equals(this.dataMd5, toolsRubeexRemarkV2ResponseDataListInner.dataMd5) &&
        Objects.equals(this.projectId, toolsRubeexRemarkV2ResponseDataListInner.projectId) &&
        Objects.equals(this.section, toolsRubeexRemarkV2ResponseDataListInner.section) &&
        Objects.equals(this.sectionArea, toolsRubeexRemarkV2ResponseDataListInner.sectionArea) &&
        Objects.equals(this.sectionAreaRemark, toolsRubeexRemarkV2ResponseDataListInner.sectionAreaRemark) &&
        Objects.equals(this.sectionRemark, toolsRubeexRemarkV2ResponseDataListInner.sectionRemark);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataMd5, projectId, section, sectionArea, sectionAreaRemark, sectionRemark);
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
    sb.append("class ToolsRubeexRemarkV2ResponseDataListInner {\n");
    sb.append("    dataMd5: ").append(toIndentedString(dataMd5)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    sectionArea: ").append(toIndentedString(sectionArea)).append("\n");
    sb.append("    sectionAreaRemark: ").append(toIndentedString(sectionAreaRemark)).append("\n");
    sb.append("    sectionRemark: ").append(toIndentedString(sectionRemark)).append("\n");
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
    openapiFields.add("data_md5");
    openapiFields.add("project_id");
    openapiFields.add("section");
    openapiFields.add("section_area");
    openapiFields.add("section_area_remark");
    openapiFields.add("section_remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsRubeexRemarkV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsRubeexRemarkV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsRubeexRemarkV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsRubeexRemarkV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsRubeexRemarkV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsRubeexRemarkV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsRubeexRemarkV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsRubeexRemarkV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsRubeexRemarkV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsRubeexRemarkV2ResponseDataListInner
  */
  public static ToolsRubeexRemarkV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsRubeexRemarkV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsRubeexRemarkV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

