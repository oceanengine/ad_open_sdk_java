/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionListV30DataListBlueFlowPackageBlueFlowPackageSetting;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class PromotionListV30ResponseDataListInnerBlueFlowPackage {
  public static final String SERIALIZED_NAME_BLUE_FLOW_PACKAGE_ID = "blue_flow_package_id";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_PACKAGE_ID)
  private Long blueFlowPackageId = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_PACKAGE_SETTING = "blue_flow_package_setting";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_PACKAGE_SETTING)
  private PromotionListV30DataListBlueFlowPackageBlueFlowPackageSetting blueFlowPackageSetting = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_SUGGESTION = "blue_flow_suggestion";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_SUGGESTION)
  private String blueFlowSuggestion = null;

  public PromotionListV30ResponseDataListInnerBlueFlowPackage() {
  }

  public PromotionListV30ResponseDataListInnerBlueFlowPackage blueFlowPackageId(Long blueFlowPackageId) {
    
    this.blueFlowPackageId = blueFlowPackageId;
    return this;
  }

   /**
   * 
   * @return blueFlowPackageId
  **/
  @javax.annotation.Nullable
  public Long getBlueFlowPackageId() {
    return blueFlowPackageId;
  }


  public void setBlueFlowPackageId(Long blueFlowPackageId) {
    this.blueFlowPackageId = blueFlowPackageId;
  }


  public PromotionListV30ResponseDataListInnerBlueFlowPackage blueFlowPackageSetting(PromotionListV30DataListBlueFlowPackageBlueFlowPackageSetting blueFlowPackageSetting) {
    
    this.blueFlowPackageSetting = blueFlowPackageSetting;
    return this;
  }

   /**
   * Get blueFlowPackageSetting
   * @return blueFlowPackageSetting
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListBlueFlowPackageBlueFlowPackageSetting getBlueFlowPackageSetting() {
    return blueFlowPackageSetting;
  }


  public void setBlueFlowPackageSetting(PromotionListV30DataListBlueFlowPackageBlueFlowPackageSetting blueFlowPackageSetting) {
    this.blueFlowPackageSetting = blueFlowPackageSetting;
  }


  public PromotionListV30ResponseDataListInnerBlueFlowPackage blueFlowSuggestion(String blueFlowSuggestion) {
    
    this.blueFlowSuggestion = blueFlowSuggestion;
    return this;
  }

   /**
   * 
   * @return blueFlowSuggestion
  **/
  @javax.annotation.Nullable
  public String getBlueFlowSuggestion() {
    return blueFlowSuggestion;
  }


  public void setBlueFlowSuggestion(String blueFlowSuggestion) {
    this.blueFlowSuggestion = blueFlowSuggestion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionListV30ResponseDataListInnerBlueFlowPackage promotionListV30ResponseDataListInnerBlueFlowPackage = (PromotionListV30ResponseDataListInnerBlueFlowPackage) o;
    return Objects.equals(this.blueFlowPackageId, promotionListV30ResponseDataListInnerBlueFlowPackage.blueFlowPackageId) &&
        Objects.equals(this.blueFlowPackageSetting, promotionListV30ResponseDataListInnerBlueFlowPackage.blueFlowPackageSetting) &&
        Objects.equals(this.blueFlowSuggestion, promotionListV30ResponseDataListInnerBlueFlowPackage.blueFlowSuggestion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueFlowPackageId, blueFlowPackageSetting, blueFlowSuggestion);
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
    sb.append("class PromotionListV30ResponseDataListInnerBlueFlowPackage {\n");
    sb.append("    blueFlowPackageId: ").append(toIndentedString(blueFlowPackageId)).append("\n");
    sb.append("    blueFlowPackageSetting: ").append(toIndentedString(blueFlowPackageSetting)).append("\n");
    sb.append("    blueFlowSuggestion: ").append(toIndentedString(blueFlowSuggestion)).append("\n");
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
    openapiFields.add("blue_flow_package_id");
    openapiFields.add("blue_flow_package_setting");
    openapiFields.add("blue_flow_suggestion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerBlueFlowPackage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerBlueFlowPackage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerBlueFlowPackage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerBlueFlowPackage.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerBlueFlowPackage>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerBlueFlowPackage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerBlueFlowPackage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerBlueFlowPackage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerBlueFlowPackage
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerBlueFlowPackage
  */
  public static PromotionListV30ResponseDataListInnerBlueFlowPackage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerBlueFlowPackage.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerBlueFlowPackage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

