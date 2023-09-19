/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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
 * 配置项限制条件
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit {
  public static final String SERIALIZED_NAME_IMG_HEIGHT = "img_height";
  @SerializedName(SERIALIZED_NAME_IMG_HEIGHT)
  private Long imgHeight = null;

  public static final String SERIALIZED_NAME_IMG_WIDTH = "img_width";
  @SerializedName(SERIALIZED_NAME_IMG_WIDTH)
  private Long imgWidth = null;

  public static final String SERIALIZED_NAME_TEXT_MAX_LENGTH = "text_max_length";
  @SerializedName(SERIALIZED_NAME_TEXT_MAX_LENGTH)
  private Long textMaxLength = null;

  public static final String SERIALIZED_NAME_TEXT_MIN_LENGTH = "text_min_length";
  @SerializedName(SERIALIZED_NAME_TEXT_MIN_LENGTH)
  private Long textMinLength = null;

  public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit() {
  }

  public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit imgHeight(Long imgHeight) {
    
    this.imgHeight = imgHeight;
    return this;
  }

   /**
   * 图片高度(仅对state_type&#x3D;Image有效)
   * @return imgHeight
  **/
  @javax.annotation.Nullable
  public Long getImgHeight() {
    return imgHeight;
  }


  public void setImgHeight(Long imgHeight) {
    this.imgHeight = imgHeight;
  }


  public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit imgWidth(Long imgWidth) {
    
    this.imgWidth = imgWidth;
    return this;
  }

   /**
   * 图片宽度(仅对state_type&#x3D;Image有效)
   * @return imgWidth
  **/
  @javax.annotation.Nullable
  public Long getImgWidth() {
    return imgWidth;
  }


  public void setImgWidth(Long imgWidth) {
    this.imgWidth = imgWidth;
  }


  public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit textMaxLength(Long textMaxLength) {
    
    this.textMaxLength = textMaxLength;
    return this;
  }

   /**
   * 文案最大长度(仅对state_type&#x3D;Text有效)
   * @return textMaxLength
  **/
  @javax.annotation.Nullable
  public Long getTextMaxLength() {
    return textMaxLength;
  }


  public void setTextMaxLength(Long textMaxLength) {
    this.textMaxLength = textMaxLength;
  }


  public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit textMinLength(Long textMinLength) {
    
    this.textMinLength = textMinLength;
    return this;
  }

   /**
   * 文案最小长度(仅对state_type&#x3D;Text有效)
   * @return textMinLength
  **/
  @javax.annotation.Nullable
  public Long getTextMinLength() {
    return textMinLength;
  }


  public void setTextMinLength(Long textMinLength) {
    this.textMinLength = textMinLength;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit creativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit = (CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit) o;
    return Objects.equals(this.imgHeight, creativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit.imgHeight) &&
        Objects.equals(this.imgWidth, creativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit.imgWidth) &&
        Objects.equals(this.textMaxLength, creativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit.textMaxLength) &&
        Objects.equals(this.textMinLength, creativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit.textMinLength);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imgHeight, imgWidth, textMaxLength, textMinLength);
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
    sb.append("class CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit {\n");
    sb.append("    imgHeight: ").append(toIndentedString(imgHeight)).append("\n");
    sb.append("    imgWidth: ").append(toIndentedString(imgWidth)).append("\n");
    sb.append("    textMaxLength: ").append(toIndentedString(textMaxLength)).append("\n");
    sb.append("    textMinLength: ").append(toIndentedString(textMinLength)).append("\n");
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
    openapiFields.add("img_height");
    openapiFields.add("img_width");
    openapiFields.add("text_max_length");
    openapiFields.add("text_min_length");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit>() {
           @Override
           public void write(JsonWriter out, CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit
  * @throws IOException if the JSON string is invalid with respect to CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit
  */
  public static CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit.class);
  }

 /**
  * Convert an instance of CreativeStrategyListV2ResponseDataStrategyModelsInnerStateListInnerLimit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

