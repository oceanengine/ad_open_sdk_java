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
import com.bytedance.ads.model.QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanReportAdMaterialGetV10ResponseData {
  public static final String SERIALIZED_NAME_MATERIAL_INFO = "material_info";
  @SerializedName(SERIALIZED_NAME_MATERIAL_INFO)
  private List<QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner> materialInfo = null;

  public QianchuanReportAdMaterialGetV10ResponseData() {
  }

  public QianchuanReportAdMaterialGetV10ResponseData materialInfo(List<QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner> materialInfo) {
    
    this.materialInfo = materialInfo;
    return this;
  }

  public QianchuanReportAdMaterialGetV10ResponseData addMaterialInfoItem(QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner materialInfoItem) {
    if (this.materialInfo == null) {
      this.materialInfo = new ArrayList<>();
    }
    this.materialInfo.add(materialInfoItem);
    return this;
  }

   /**
   * 素材信息
   * @return materialInfo
  **/
  @javax.annotation.Nullable
  public List<QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner> getMaterialInfo() {
    return materialInfo;
  }


  public void setMaterialInfo(List<QianchuanReportAdMaterialGetV10ResponseDataMaterialInfoInner> materialInfo) {
    this.materialInfo = materialInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportAdMaterialGetV10ResponseData qianchuanReportAdMaterialGetV10ResponseData = (QianchuanReportAdMaterialGetV10ResponseData) o;
    return Objects.equals(this.materialInfo, qianchuanReportAdMaterialGetV10ResponseData.materialInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanReportAdMaterialGetV10ResponseData {\n");
    sb.append("    materialInfo: ").append(toIndentedString(materialInfo)).append("\n");
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
    openapiFields.add("material_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("material_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportAdMaterialGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportAdMaterialGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportAdMaterialGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportAdMaterialGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportAdMaterialGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanReportAdMaterialGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportAdMaterialGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportAdMaterialGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportAdMaterialGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportAdMaterialGetV10ResponseData
  */
  public static QianchuanReportAdMaterialGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportAdMaterialGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanReportAdMaterialGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

