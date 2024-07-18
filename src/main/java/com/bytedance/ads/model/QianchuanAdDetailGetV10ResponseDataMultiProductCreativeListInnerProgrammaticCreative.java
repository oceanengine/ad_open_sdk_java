/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative {
  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_CARD = "programmatic_creative_card";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_CARD)
  private QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard programmaticCreativeCard = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST = "programmatic_creative_media_list";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST)
  private List<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner> programmaticCreativeMediaList = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_TITLE_LIST = "programmatic_creative_title_list";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_TITLE_LIST)
  private List<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner> programmaticCreativeTitleList = null;

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative() {
  }

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative programmaticCreativeCard(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard programmaticCreativeCard) {
    
    this.programmaticCreativeCard = programmaticCreativeCard;
    return this;
  }

   /**
   * Get programmaticCreativeCard
   * @return programmaticCreativeCard
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard getProgrammaticCreativeCard() {
    return programmaticCreativeCard;
  }


  public void setProgrammaticCreativeCard(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard programmaticCreativeCard) {
    this.programmaticCreativeCard = programmaticCreativeCard;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative programmaticCreativeMediaList(List<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner> programmaticCreativeMediaList) {
    
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative addProgrammaticCreativeMediaListItem(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner programmaticCreativeMediaListItem) {
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
  public List<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner> getProgrammaticCreativeMediaList() {
    return programmaticCreativeMediaList;
  }


  public void setProgrammaticCreativeMediaList(List<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner> programmaticCreativeMediaList) {
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative programmaticCreativeTitleList(List<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner> programmaticCreativeTitleList) {
    
    this.programmaticCreativeTitleList = programmaticCreativeTitleList;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative addProgrammaticCreativeTitleListItem(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner programmaticCreativeTitleListItem) {
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
  public List<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner> getProgrammaticCreativeTitleList() {
    return programmaticCreativeTitleList;
  }


  public void setProgrammaticCreativeTitleList(List<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeTitleListInner> programmaticCreativeTitleList) {
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
    QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative = (QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative) o;
    return Objects.equals(this.programmaticCreativeCard, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative.programmaticCreativeCard) &&
        Objects.equals(this.programmaticCreativeMediaList, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative.programmaticCreativeMediaList) &&
        Objects.equals(this.programmaticCreativeTitleList, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative.programmaticCreativeTitleList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(programmaticCreativeCard, programmaticCreativeMediaList, programmaticCreativeTitleList);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative {\n");
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
       if (!QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative
  */
  public static QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreative to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

