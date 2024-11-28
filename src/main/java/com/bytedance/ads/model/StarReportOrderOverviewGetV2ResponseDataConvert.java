/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class StarReportOrderOverviewGetV2ResponseDataConvert {
  public static final String SERIALIZED_NAME_CLICK = "click";
  @SerializedName(SERIALIZED_NAME_CLICK)
  private Long click = null;

  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Long ctr = null;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private Long show = null;

  public StarReportOrderOverviewGetV2ResponseDataConvert() {
  }

  public StarReportOrderOverviewGetV2ResponseDataConvert click(Long click) {
    
    this.click = click;
    return this;
  }

   /**
   * 
   * @return click
  **/
  @javax.annotation.Nullable
  public Long getClick() {
    return click;
  }


  public void setClick(Long click) {
    this.click = click;
  }


  public StarReportOrderOverviewGetV2ResponseDataConvert ctr(Long ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * 
   * @return ctr
  **/
  @javax.annotation.Nullable
  public Long getCtr() {
    return ctr;
  }


  public void setCtr(Long ctr) {
    this.ctr = ctr;
  }


  public StarReportOrderOverviewGetV2ResponseDataConvert show(Long show) {
    
    this.show = show;
    return this;
  }

   /**
   * 
   * @return show
  **/
  @javax.annotation.Nullable
  public Long getShow() {
    return show;
  }


  public void setShow(Long show) {
    this.show = show;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewGetV2ResponseDataConvert starReportOrderOverviewGetV2ResponseDataConvert = (StarReportOrderOverviewGetV2ResponseDataConvert) o;
    return Objects.equals(this.click, starReportOrderOverviewGetV2ResponseDataConvert.click) &&
        Objects.equals(this.ctr, starReportOrderOverviewGetV2ResponseDataConvert.ctr) &&
        Objects.equals(this.show, starReportOrderOverviewGetV2ResponseDataConvert.show);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(click, ctr, show);
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
    sb.append("class StarReportOrderOverviewGetV2ResponseDataConvert {\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
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
    openapiFields.add("click");
    openapiFields.add("ctr");
    openapiFields.add("show");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewGetV2ResponseDataConvert.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewGetV2ResponseDataConvert' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewGetV2ResponseDataConvert> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewGetV2ResponseDataConvert.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewGetV2ResponseDataConvert>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewGetV2ResponseDataConvert value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewGetV2ResponseDataConvert read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewGetV2ResponseDataConvert given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewGetV2ResponseDataConvert
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewGetV2ResponseDataConvert
  */
  public static StarReportOrderOverviewGetV2ResponseDataConvert fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewGetV2ResponseDataConvert.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewGetV2ResponseDataConvert to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

