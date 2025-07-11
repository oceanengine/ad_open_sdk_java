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
import com.bytedance.ads.model.QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner;
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
public class QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative {
  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_CARD = "programmatic_creative_card";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_CARD)
  private QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard programmaticCreativeCard = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST = "programmatic_creative_media_list";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST)
  private List<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner> programmaticCreativeMediaList = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_TITLE_LIST = "programmatic_creative_title_list";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_TITLE_LIST)
  private List<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner> programmaticCreativeTitleList = null;

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative() {
  }

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative programmaticCreativeCard(QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard programmaticCreativeCard) {
    
    this.programmaticCreativeCard = programmaticCreativeCard;
    return this;
  }

   /**
   * Get programmaticCreativeCard
   * @return programmaticCreativeCard
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard getProgrammaticCreativeCard() {
    return programmaticCreativeCard;
  }


  public void setProgrammaticCreativeCard(QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard programmaticCreativeCard) {
    this.programmaticCreativeCard = programmaticCreativeCard;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative programmaticCreativeMediaList(List<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner> programmaticCreativeMediaList) {
    
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
    return this;
  }

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative addProgrammaticCreativeMediaListItem(QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner programmaticCreativeMediaListItem) {
    if (this.programmaticCreativeMediaList == null) {
      this.programmaticCreativeMediaList = new ArrayList<>();
    }
    this.programmaticCreativeMediaList.add(programmaticCreativeMediaListItem);
    return this;
  }

   /**
   * 
   * @return programmaticCreativeMediaList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner> getProgrammaticCreativeMediaList() {
    return programmaticCreativeMediaList;
  }


  public void setProgrammaticCreativeMediaList(List<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner> programmaticCreativeMediaList) {
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative programmaticCreativeTitleList(List<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner> programmaticCreativeTitleList) {
    
    this.programmaticCreativeTitleList = programmaticCreativeTitleList;
    return this;
  }

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative addProgrammaticCreativeTitleListItem(QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner programmaticCreativeTitleListItem) {
    if (this.programmaticCreativeTitleList == null) {
      this.programmaticCreativeTitleList = new ArrayList<>();
    }
    this.programmaticCreativeTitleList.add(programmaticCreativeTitleListItem);
    return this;
  }

   /**
   * 
   * @return programmaticCreativeTitleList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner> getProgrammaticCreativeTitleList() {
    return programmaticCreativeTitleList;
  }


  public void setProgrammaticCreativeTitleList(List<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner> programmaticCreativeTitleList) {
    this.programmaticCreativeTitleList = programmaticCreativeTitleList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative = (QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative) o;
    return Objects.equals(this.programmaticCreativeCard, qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative.programmaticCreativeCard) &&
        Objects.equals(this.programmaticCreativeMediaList, qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative.programmaticCreativeMediaList) &&
        Objects.equals(this.programmaticCreativeTitleList, qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative.programmaticCreativeTitleList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programmaticCreativeCard, programmaticCreativeMediaList, programmaticCreativeTitleList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative {\n");
    sb.append("    programmaticCreativeCard: ").append(toIndentedString(programmaticCreativeCard)).append("\n");
    sb.append("    programmaticCreativeMediaList: ").append(toIndentedString(programmaticCreativeMediaList)).append("\n");
    sb.append("    programmaticCreativeTitleList: ").append(toIndentedString(programmaticCreativeTitleList)).append("\n");
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
    openapiFields.add("programmatic_creative_card");
    openapiFields.add("programmatic_creative_media_list");
    openapiFields.add("programmatic_creative_title_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative
  */
  public static QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

