/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAwemeBannedCreateV30ResponseDataFailInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsAwemeBannedCreateV30ResponseData {
  public static final String SERIALIZED_NAME_FAIL = "fail";
  @SerializedName(SERIALIZED_NAME_FAIL)
  private List<ToolsAwemeBannedCreateV30ResponseDataFailInner> fail = null;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private List<String> success = null;

  public ToolsAwemeBannedCreateV30ResponseData() {
  }

  public ToolsAwemeBannedCreateV30ResponseData fail(List<ToolsAwemeBannedCreateV30ResponseDataFailInner> fail) {
    
    this.fail = fail;
    return this;
  }

  public ToolsAwemeBannedCreateV30ResponseData addFailItem(ToolsAwemeBannedCreateV30ResponseDataFailInner failItem) {
    if (this.fail == null) {
      this.fail = new ArrayList<>();
    }
    this.fail.add(failItem);
    return this;
  }

   /**
   * 添加失败的结果
   * @return fail
  **/
  @javax.annotation.Nullable
  public List<ToolsAwemeBannedCreateV30ResponseDataFailInner> getFail() {
    return fail;
  }


  public void setFail(List<ToolsAwemeBannedCreateV30ResponseDataFailInner> fail) {
    this.fail = fail;
  }


  public ToolsAwemeBannedCreateV30ResponseData success(List<String> success) {
    
    this.success = success;
    return this;
  }

  public ToolsAwemeBannedCreateV30ResponseData addSuccessItem(String successItem) {
    if (this.success == null) {
      this.success = new ArrayList<>();
    }
    this.success.add(successItem);
    return this;
  }

   /**
   * 添加成功的结果
   * @return success
  **/
  @javax.annotation.Nullable
  public List<String> getSuccess() {
    return success;
  }


  public void setSuccess(List<String> success) {
    this.success = success;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeBannedCreateV30ResponseData toolsAwemeBannedCreateV30ResponseData = (ToolsAwemeBannedCreateV30ResponseData) o;
    return Objects.equals(this.fail, toolsAwemeBannedCreateV30ResponseData.fail) &&
        Objects.equals(this.success, toolsAwemeBannedCreateV30ResponseData.success);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fail, success);
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
    sb.append("class ToolsAwemeBannedCreateV30ResponseData {\n");
    sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("fail");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeBannedCreateV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeBannedCreateV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeBannedCreateV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeBannedCreateV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeBannedCreateV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeBannedCreateV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeBannedCreateV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeBannedCreateV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeBannedCreateV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeBannedCreateV30ResponseData
  */
  public static ToolsAwemeBannedCreateV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeBannedCreateV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAwemeBannedCreateV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

