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
 * ToolsEventAssetsGetV2ResponseDataQuickAppInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsEventAssetsGetV2ResponseDataQuickAppInner {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_ASSET_NAME = "asset_name";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName = null;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName = null;

  public static final String SERIALIZED_NAME_QUICK_APP_ID = "quick_app_id";
  @SerializedName(SERIALIZED_NAME_QUICK_APP_ID)
  private Long quickAppId = null;

  public ToolsEventAssetsGetV2ResponseDataQuickAppInner() {
  }

  public ToolsEventAssetsGetV2ResponseDataQuickAppInner assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 快应用资产ID
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public ToolsEventAssetsGetV2ResponseDataQuickAppInner assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * 快应用名称
   * @return assetName
  **/
  @javax.annotation.Nullable
  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public ToolsEventAssetsGetV2ResponseDataQuickAppInner packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * 快应用包名
   * @return packageName
  **/
  @javax.annotation.Nullable
  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public ToolsEventAssetsGetV2ResponseDataQuickAppInner quickAppId(Long quickAppId) {
    
    this.quickAppId = quickAppId;
    return this;
  }

   /**
   * 快应用ID
   * @return quickAppId
  **/
  @javax.annotation.Nullable
  public Long getQuickAppId() {
    return quickAppId;
  }


  public void setQuickAppId(Long quickAppId) {
    this.quickAppId = quickAppId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventAssetsGetV2ResponseDataQuickAppInner toolsEventAssetsGetV2ResponseDataQuickAppInner = (ToolsEventAssetsGetV2ResponseDataQuickAppInner) o;
    return Objects.equals(this.assetId, toolsEventAssetsGetV2ResponseDataQuickAppInner.assetId) &&
        Objects.equals(this.assetName, toolsEventAssetsGetV2ResponseDataQuickAppInner.assetName) &&
        Objects.equals(this.packageName, toolsEventAssetsGetV2ResponseDataQuickAppInner.packageName) &&
        Objects.equals(this.quickAppId, toolsEventAssetsGetV2ResponseDataQuickAppInner.quickAppId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetName, packageName, quickAppId);
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
    sb.append("class ToolsEventAssetsGetV2ResponseDataQuickAppInner {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    quickAppId: ").append(toIndentedString(quickAppId)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("asset_name");
    openapiFields.add("package_name");
    openapiFields.add("quick_app_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventAssetsGetV2ResponseDataQuickAppInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventAssetsGetV2ResponseDataQuickAppInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventAssetsGetV2ResponseDataQuickAppInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventAssetsGetV2ResponseDataQuickAppInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventAssetsGetV2ResponseDataQuickAppInner>() {
           @Override
           public void write(JsonWriter out, ToolsEventAssetsGetV2ResponseDataQuickAppInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventAssetsGetV2ResponseDataQuickAppInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventAssetsGetV2ResponseDataQuickAppInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventAssetsGetV2ResponseDataQuickAppInner
  * @throws IOException if the JSON string is invalid with respect to ToolsEventAssetsGetV2ResponseDataQuickAppInner
  */
  public static ToolsEventAssetsGetV2ResponseDataQuickAppInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventAssetsGetV2ResponseDataQuickAppInner.class);
  }

 /**
  * Convert an instance of ToolsEventAssetsGetV2ResponseDataQuickAppInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

