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
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggFarImage;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggMediumImage;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggNearImage;
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
 * 静态扭转
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable = null;

  public static final String SERIALIZED_NAME_FAR_IMAGE = "far_image";
  @SerializedName(SERIALIZED_NAME_FAR_IMAGE)
  private BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggFarImage farImage = null;

  public static final String SERIALIZED_NAME_MEDIUM_IMAGE = "medium_image";
  @SerializedName(SERIALIZED_NAME_MEDIUM_IMAGE)
  private BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggMediumImage mediumImage = null;

  public static final String SERIALIZED_NAME_NEAR_IMAGE = "near_image";
  @SerializedName(SERIALIZED_NAME_NEAR_IMAGE)
  private BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggNearImage nearImage = null;

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * 是否开启
   * @return enable
  **/
  @javax.annotation.Nullable
  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg farImage(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggFarImage farImage) {
    
    this.farImage = farImage;
    return this;
  }

   /**
   * Get farImage
   * @return farImage
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggFarImage getFarImage() {
    return farImage;
  }


  public void setFarImage(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggFarImage farImage) {
    this.farImage = farImage;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg mediumImage(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggMediumImage mediumImage) {
    
    this.mediumImage = mediumImage;
    return this;
  }

   /**
   * Get mediumImage
   * @return mediumImage
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggMediumImage getMediumImage() {
    return mediumImage;
  }


  public void setMediumImage(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggMediumImage mediumImage) {
    this.mediumImage = mediumImage;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg nearImage(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggNearImage nearImage) {
    
    this.nearImage = nearImage;
    return this;
  }

   /**
   * Get nearImage
   * @return nearImage
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggNearImage getNearImage() {
    return nearImage;
  }


  public void setNearImage(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEggNearImage nearImage) {
    this.nearImage = nearImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg = (BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg) o;
    return Objects.equals(this.enable, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg.enable) &&
        Objects.equals(this.farImage, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg.farImage) &&
        Objects.equals(this.mediumImage, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg.mediumImage) &&
        Objects.equals(this.nearImage, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg.nearImage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, farImage, mediumImage, nearImage);
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
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    farImage: ").append(toIndentedString(farImage)).append("\n");
    sb.append("    mediumImage: ").append(toIndentedString(mediumImage)).append("\n");
    sb.append("    nearImage: ").append(toIndentedString(nearImage)).append("\n");
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
    openapiFields.add("enable");
    openapiFields.add("far_image");
    openapiFields.add("medium_image");
    openapiFields.add("near_image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg
  */
  public static BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentStaticTwistEgg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

