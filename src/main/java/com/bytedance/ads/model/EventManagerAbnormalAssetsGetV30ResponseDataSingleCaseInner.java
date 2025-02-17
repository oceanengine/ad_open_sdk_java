/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EventManagerAbnormalAssetsGetV30DataSingleCaseAppType;
import com.bytedance.ads.model.EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner;
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
 * EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner {
  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private EventManagerAbnormalAssetsGetV30DataSingleCaseAppType appType = null;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private String _package = null;

  public static final String SERIALIZED_NAME_SUGGESTION = "suggestion";
  @SerializedName(SERIALIZED_NAME_SUGGESTION)
  private List<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner> suggestion = null;

  public EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner() {
  }

  public EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner appType(EventManagerAbnormalAssetsGetV30DataSingleCaseAppType appType) {
    
    this.appType = appType;
    return this;
  }

   /**
   * Get appType
   * @return appType
  **/
  @javax.annotation.Nullable
  public EventManagerAbnormalAssetsGetV30DataSingleCaseAppType getAppType() {
    return appType;
  }


  public void setAppType(EventManagerAbnormalAssetsGetV30DataSingleCaseAppType appType) {
    this.appType = appType;
  }


  public EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner _package(String _package) {
    
    this._package = _package;
    return this;
  }

   /**
   * 包名
   * @return _package
  **/
  @javax.annotation.Nullable
  public String getPackage() {
    return _package;
  }


  public void setPackage(String _package) {
    this._package = _package;
  }


  public EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner suggestion(List<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner> suggestion) {
    
    this.suggestion = suggestion;
    return this;
  }

  public EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner addSuggestionItem(EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner suggestionItem) {
    if (this.suggestion == null) {
      this.suggestion = new ArrayList<>();
    }
    this.suggestion.add(suggestionItem);
    return this;
  }

   /**
   * 建议和明细信息
   * @return suggestion
  **/
  @javax.annotation.Nullable
  public List<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner> getSuggestion() {
    return suggestion;
  }


  public void setSuggestion(List<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner> suggestion) {
    this.suggestion = suggestion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner eventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner = (EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner) o;
    return Objects.equals(this.appType, eventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner.appType) &&
        Objects.equals(this._package, eventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner._package) &&
        Objects.equals(this.suggestion, eventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner.suggestion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appType, _package, suggestion);
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
    sb.append("class EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner {\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
    openapiFields.add("app_type");
    openapiFields.add("package");
    openapiFields.add("suggestion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner>() {
           @Override
           public void write(JsonWriter out, EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner
  */
  public static EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner.class);
  }

 /**
  * Convert an instance of EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

