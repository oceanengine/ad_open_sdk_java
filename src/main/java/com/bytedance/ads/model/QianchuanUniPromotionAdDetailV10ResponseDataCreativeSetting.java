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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting {
  public static final String SERIALIZED_NAME_CREATIVE_COMBINE_TYPE = "creative_combine_type";
  @SerializedName(SERIALIZED_NAME_CREATIVE_COMBINE_TYPE)
  private Boolean creativeCombineType = null;

  public static final String SERIALIZED_NAME_CREATIVE_COMBINE_TYPELIVE = "creative_combine_typelive";
  @SerializedName(SERIALIZED_NAME_CREATIVE_COMBINE_TYPELIVE)
  private Boolean creativeCombineTypelive = null;

  public static final String SERIALIZED_NAME_HIDE_IN_AWEME = "hide_in_aweme";
  @SerializedName(SERIALIZED_NAME_HIDE_IN_AWEME)
  private Boolean hideInAweme = null;

  public static final String SERIALIZED_NAME_SMART_SELECT_MATERIAL = "smart_select_material";
  @SerializedName(SERIALIZED_NAME_SMART_SELECT_MATERIAL)
  private Boolean smartSelectMaterial = null;

  public QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting() {
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting creativeCombineType(Boolean creativeCombineType) {
    
    this.creativeCombineType = creativeCombineType;
    return this;
  }

   /**
   * 
   * @return creativeCombineType
  **/
  @javax.annotation.Nullable
  public Boolean getCreativeCombineType() {
    return creativeCombineType;
  }


  public void setCreativeCombineType(Boolean creativeCombineType) {
    this.creativeCombineType = creativeCombineType;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting creativeCombineTypelive(Boolean creativeCombineTypelive) {
    
    this.creativeCombineTypelive = creativeCombineTypelive;
    return this;
  }

   /**
   * 
   * @return creativeCombineTypelive
  **/
  @javax.annotation.Nullable
  public Boolean getCreativeCombineTypelive() {
    return creativeCombineTypelive;
  }


  public void setCreativeCombineTypelive(Boolean creativeCombineTypelive) {
    this.creativeCombineTypelive = creativeCombineTypelive;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting hideInAweme(Boolean hideInAweme) {
    
    this.hideInAweme = hideInAweme;
    return this;
  }

   /**
   * 
   * @return hideInAweme
  **/
  @javax.annotation.Nullable
  public Boolean getHideInAweme() {
    return hideInAweme;
  }


  public void setHideInAweme(Boolean hideInAweme) {
    this.hideInAweme = hideInAweme;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting smartSelectMaterial(Boolean smartSelectMaterial) {
    
    this.smartSelectMaterial = smartSelectMaterial;
    return this;
  }

   /**
   * 
   * @return smartSelectMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getSmartSelectMaterial() {
    return smartSelectMaterial;
  }


  public void setSmartSelectMaterial(Boolean smartSelectMaterial) {
    this.smartSelectMaterial = smartSelectMaterial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting qianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting = (QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting) o;
    return Objects.equals(this.creativeCombineType, qianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting.creativeCombineType) &&
        Objects.equals(this.creativeCombineTypelive, qianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting.creativeCombineTypelive) &&
        Objects.equals(this.hideInAweme, qianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting.hideInAweme) &&
        Objects.equals(this.smartSelectMaterial, qianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting.smartSelectMaterial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeCombineType, creativeCombineTypelive, hideInAweme, smartSelectMaterial);
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
    sb.append("class QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting {\n");
    sb.append("    creativeCombineType: ").append(toIndentedString(creativeCombineType)).append("\n");
    sb.append("    creativeCombineTypelive: ").append(toIndentedString(creativeCombineTypelive)).append("\n");
    sb.append("    hideInAweme: ").append(toIndentedString(hideInAweme)).append("\n");
    sb.append("    smartSelectMaterial: ").append(toIndentedString(smartSelectMaterial)).append("\n");
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
    openapiFields.add("creative_combine_type");
    openapiFields.add("creative_combine_typelive");
    openapiFields.add("hide_in_aweme");
    openapiFields.add("smart_select_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting
  */
  public static QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

