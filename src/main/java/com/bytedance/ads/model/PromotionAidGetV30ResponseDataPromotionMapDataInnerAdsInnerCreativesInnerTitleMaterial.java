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
public class PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial() {
  }

  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial = (PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial) o;
    return Objects.equals(this.content, promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial.content) &&
        Objects.equals(this.materialId, promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial.materialId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, materialId);
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
    sb.append("class PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("material_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial>() {
           @Override
           public void write(JsonWriter out, PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial
  * @throws IOException if the JSON string is invalid with respect to PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial
  */
  public static PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial.class);
  }

 /**
  * Convert an instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerTitleMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

