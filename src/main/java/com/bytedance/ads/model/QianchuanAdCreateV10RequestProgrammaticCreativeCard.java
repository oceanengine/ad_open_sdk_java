/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdCreateV10ProgrammaticCreativeCardPromotionCardButtonSmartOptimization;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-18T11:13:59.161423804+08:00[Asia/Shanghai]")
public class QianchuanAdCreateV10RequestProgrammaticCreativeCard {
  public static final String SERIALIZED_NAME_PROMOTION_CARD_ACTION_BUTTON = "promotion_card_action_button";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_ACTION_BUTTON)
  private String promotionCardActionButton = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_BUTTON_SMART_OPTIMIZATION = "promotion_card_button_smart_optimization";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_BUTTON_SMART_OPTIMIZATION)
  private QianchuanAdCreateV10ProgrammaticCreativeCardPromotionCardButtonSmartOptimization promotionCardButtonSmartOptimization = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_IMAGE_ID = "promotion_card_image_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_IMAGE_ID)
  private String promotionCardImageId = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_SELLING_POINTS = "promotion_card_selling_points";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_SELLING_POINTS)
  private List<String> promotionCardSellingPoints = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_TITLE = "promotion_card_title";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_TITLE)
  private String promotionCardTitle = null;

  public QianchuanAdCreateV10RequestProgrammaticCreativeCard() {
  }

  public QianchuanAdCreateV10RequestProgrammaticCreativeCard promotionCardActionButton(String promotionCardActionButton) {
    
    this.promotionCardActionButton = promotionCardActionButton;
    return this;
  }

   /**
   * 
   * @return promotionCardActionButton
  **/
  @javax.annotation.Nullable
  public String getPromotionCardActionButton() {
    return promotionCardActionButton;
  }


  public void setPromotionCardActionButton(String promotionCardActionButton) {
    this.promotionCardActionButton = promotionCardActionButton;
  }


  public QianchuanAdCreateV10RequestProgrammaticCreativeCard promotionCardButtonSmartOptimization(QianchuanAdCreateV10ProgrammaticCreativeCardPromotionCardButtonSmartOptimization promotionCardButtonSmartOptimization) {
    
    this.promotionCardButtonSmartOptimization = promotionCardButtonSmartOptimization;
    return this;
  }

   /**
   * Get promotionCardButtonSmartOptimization
   * @return promotionCardButtonSmartOptimization
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10ProgrammaticCreativeCardPromotionCardButtonSmartOptimization getPromotionCardButtonSmartOptimization() {
    return promotionCardButtonSmartOptimization;
  }


  public void setPromotionCardButtonSmartOptimization(QianchuanAdCreateV10ProgrammaticCreativeCardPromotionCardButtonSmartOptimization promotionCardButtonSmartOptimization) {
    this.promotionCardButtonSmartOptimization = promotionCardButtonSmartOptimization;
  }


  public QianchuanAdCreateV10RequestProgrammaticCreativeCard promotionCardImageId(String promotionCardImageId) {
    
    this.promotionCardImageId = promotionCardImageId;
    return this;
  }

   /**
   * 
   * @return promotionCardImageId
  **/
  @javax.annotation.Nullable
  public String getPromotionCardImageId() {
    return promotionCardImageId;
  }


  public void setPromotionCardImageId(String promotionCardImageId) {
    this.promotionCardImageId = promotionCardImageId;
  }


  public QianchuanAdCreateV10RequestProgrammaticCreativeCard promotionCardSellingPoints(List<String> promotionCardSellingPoints) {
    
    this.promotionCardSellingPoints = promotionCardSellingPoints;
    return this;
  }

  public QianchuanAdCreateV10RequestProgrammaticCreativeCard addPromotionCardSellingPointsItem(String promotionCardSellingPointsItem) {
    if (this.promotionCardSellingPoints == null) {
      this.promotionCardSellingPoints = new ArrayList<>();
    }
    this.promotionCardSellingPoints.add(promotionCardSellingPointsItem);
    return this;
  }

   /**
   * 
   * @return promotionCardSellingPoints
  **/
  @javax.annotation.Nullable
  public List<String> getPromotionCardSellingPoints() {
    return promotionCardSellingPoints;
  }


  public void setPromotionCardSellingPoints(List<String> promotionCardSellingPoints) {
    this.promotionCardSellingPoints = promotionCardSellingPoints;
  }


  public QianchuanAdCreateV10RequestProgrammaticCreativeCard promotionCardTitle(String promotionCardTitle) {
    
    this.promotionCardTitle = promotionCardTitle;
    return this;
  }

   /**
   * 
   * @return promotionCardTitle
  **/
  @javax.annotation.Nullable
  public String getPromotionCardTitle() {
    return promotionCardTitle;
  }


  public void setPromotionCardTitle(String promotionCardTitle) {
    this.promotionCardTitle = promotionCardTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10RequestProgrammaticCreativeCard qianchuanAdCreateV10RequestProgrammaticCreativeCard = (QianchuanAdCreateV10RequestProgrammaticCreativeCard) o;
    return Objects.equals(this.promotionCardActionButton, qianchuanAdCreateV10RequestProgrammaticCreativeCard.promotionCardActionButton) &&
        Objects.equals(this.promotionCardButtonSmartOptimization, qianchuanAdCreateV10RequestProgrammaticCreativeCard.promotionCardButtonSmartOptimization) &&
        Objects.equals(this.promotionCardImageId, qianchuanAdCreateV10RequestProgrammaticCreativeCard.promotionCardImageId) &&
        Objects.equals(this.promotionCardSellingPoints, qianchuanAdCreateV10RequestProgrammaticCreativeCard.promotionCardSellingPoints) &&
        Objects.equals(this.promotionCardTitle, qianchuanAdCreateV10RequestProgrammaticCreativeCard.promotionCardTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionCardActionButton, promotionCardButtonSmartOptimization, promotionCardImageId, promotionCardSellingPoints, promotionCardTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestProgrammaticCreativeCard {\n");
    sb.append("    promotionCardActionButton: ").append(toIndentedString(promotionCardActionButton)).append("\n");
    sb.append("    promotionCardButtonSmartOptimization: ").append(toIndentedString(promotionCardButtonSmartOptimization)).append("\n");
    sb.append("    promotionCardImageId: ").append(toIndentedString(promotionCardImageId)).append("\n");
    sb.append("    promotionCardSellingPoints: ").append(toIndentedString(promotionCardSellingPoints)).append("\n");
    sb.append("    promotionCardTitle: ").append(toIndentedString(promotionCardTitle)).append("\n");
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
    openapiFields.add("promotion_card_action_button");
    openapiFields.add("promotion_card_button_smart_optimization");
    openapiFields.add("promotion_card_image_id");
    openapiFields.add("promotion_card_selling_points");
    openapiFields.add("promotion_card_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestProgrammaticCreativeCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestProgrammaticCreativeCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestProgrammaticCreativeCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestProgrammaticCreativeCard.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestProgrammaticCreativeCard>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestProgrammaticCreativeCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestProgrammaticCreativeCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestProgrammaticCreativeCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestProgrammaticCreativeCard
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestProgrammaticCreativeCard
  */
  public static QianchuanAdCreateV10RequestProgrammaticCreativeCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestProgrammaticCreativeCard.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestProgrammaticCreativeCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
