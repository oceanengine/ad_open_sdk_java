/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportBrandDataV30FilterAdForm;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class ReportBrandDataV30Filter {
  public static final String SERIALIZED_NAME_AD_FORM = "ad_form";
  @SerializedName(SERIALIZED_NAME_AD_FORM)
  private ReportBrandDataV30FilterAdForm adForm = null;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Long> ids = null;

  public static final String SERIALIZED_NAME_IS_BAND_AD_OVERFLOW = "is_band_ad_overflow";
  @SerializedName(SERIALIZED_NAME_IS_BAND_AD_OVERFLOW)
  private Boolean isBandAdOverflow = null;

  public ReportBrandDataV30Filter() {
  }

  public ReportBrandDataV30Filter adForm(ReportBrandDataV30FilterAdForm adForm) {
    
    this.adForm = adForm;
    return this;
  }

   /**
   * Get adForm
   * @return adForm
  **/
  @javax.annotation.Nullable
  public ReportBrandDataV30FilterAdForm getAdForm() {
    return adForm;
  }


  public void setAdForm(ReportBrandDataV30FilterAdForm adForm) {
    this.adForm = adForm;
  }


  public ReportBrandDataV30Filter ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public ReportBrandDataV30Filter addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * 
   * @return ids
  **/
  @javax.annotation.Nullable
  public List<Long> getIds() {
    return ids;
  }


  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public ReportBrandDataV30Filter isBandAdOverflow(Boolean isBandAdOverflow) {
    
    this.isBandAdOverflow = isBandAdOverflow;
    return this;
  }

   /**
   * 
   * @return isBandAdOverflow
  **/
  @javax.annotation.Nullable
  public Boolean getIsBandAdOverflow() {
    return isBandAdOverflow;
  }


  public void setIsBandAdOverflow(Boolean isBandAdOverflow) {
    this.isBandAdOverflow = isBandAdOverflow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportBrandDataV30Filter reportBrandDataV30Filter = (ReportBrandDataV30Filter) o;
    return Objects.equals(this.adForm, reportBrandDataV30Filter.adForm) &&
        Objects.equals(this.ids, reportBrandDataV30Filter.ids) &&
        Objects.equals(this.isBandAdOverflow, reportBrandDataV30Filter.isBandAdOverflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adForm, ids, isBandAdOverflow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportBrandDataV30Filter {\n");
    sb.append("    adForm: ").append(toIndentedString(adForm)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    isBandAdOverflow: ").append(toIndentedString(isBandAdOverflow)).append("\n");
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
    openapiFields.add("ad_form");
    openapiFields.add("ids");
    openapiFields.add("is_band_ad_overflow");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportBrandDataV30Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportBrandDataV30Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportBrandDataV30Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportBrandDataV30Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportBrandDataV30Filter>() {
           @Override
           public void write(JsonWriter out, ReportBrandDataV30Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportBrandDataV30Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportBrandDataV30Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportBrandDataV30Filter
  * @throws IOException if the JSON string is invalid with respect to ReportBrandDataV30Filter
  */
  public static ReportBrandDataV30Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportBrandDataV30Filter.class);
  }

 /**
  * Convert an instance of ReportBrandDataV30Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

