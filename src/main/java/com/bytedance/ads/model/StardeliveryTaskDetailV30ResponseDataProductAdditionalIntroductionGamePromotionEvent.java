/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-01-10T18:43:14.581253177+08:00[Asia/Shanghai]")
public class StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent {
  public static final String SERIALIZED_NAME_PROMOTION_DATE = "promotion_date";
  @SerializedName(SERIALIZED_NAME_PROMOTION_DATE)
  private String promotionDate = null;

  public static final String SERIALIZED_NAME_PROMOTION_TYPE = "promotion_type";
  @SerializedName(SERIALIZED_NAME_PROMOTION_TYPE)
  private StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType promotionType = null;

  public StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent() {
  }

  public StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent promotionDate(String promotionDate) {
    
    this.promotionDate = promotionDate;
    return this;
  }

   /**
   * 
   * @return promotionDate
  **/
  @javax.annotation.Nullable
  public String getPromotionDate() {
    return promotionDate;
  }


  public void setPromotionDate(String promotionDate) {
    this.promotionDate = promotionDate;
  }


  public StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent promotionType(StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType promotionType) {
    
    this.promotionType = promotionType;
    return this;
  }

   /**
   * Get promotionType
   * @return promotionType
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType getPromotionType() {
    return promotionType;
  }


  public void setPromotionType(StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType promotionType) {
    this.promotionType = promotionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent stardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent = (StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent) o;
    return Objects.equals(this.promotionDate, stardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent.promotionDate) &&
        Objects.equals(this.promotionType, stardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent.promotionType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionDate, promotionType);
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
    sb.append("class StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent {\n");
    sb.append("    promotionDate: ").append(toIndentedString(promotionDate)).append("\n");
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
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
    openapiFields.add("promotion_date");
    openapiFields.add("promotion_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent
  */
  public static StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent.class);
  }

 /**
  * Convert an instance of StardeliveryTaskDetailV30ResponseDataProductAdditionalIntroductionGamePromotionEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
