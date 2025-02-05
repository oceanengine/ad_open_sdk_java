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
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataMultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard {
  public static final String SERIALIZED_NAME_COMPONENT_ID = "component_id";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private Long componentId = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_ACTION_BUTTON = "promotion_card_action_button";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_ACTION_BUTTON)
  private String promotionCardActionButton = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_BUTTON_SMART_OPTIMIZATION = "promotion_card_button_smart_optimization";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_BUTTON_SMART_OPTIMIZATION)
  private QianchuanAdDetailGetV10DataMultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization promotionCardButtonSmartOptimization = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_ID = "promotion_card_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_ID)
  private Long promotionCardId = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_IMAGE_ID = "promotion_card_image_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_IMAGE_ID)
  private String promotionCardImageId = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_SELLING_POINTS = "promotion_card_selling_points";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_SELLING_POINTS)
  private List<String> promotionCardSellingPoints = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_TITLE = "promotion_card_title";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_TITLE)
  private String promotionCardTitle = null;

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard() {
  }

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard componentId(Long componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * 
   * @return componentId
  **/
  @javax.annotation.Nullable
  public Long getComponentId() {
    return componentId;
  }


  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard promotionCardActionButton(String promotionCardActionButton) {
    
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


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard promotionCardButtonSmartOptimization(QianchuanAdDetailGetV10DataMultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization promotionCardButtonSmartOptimization) {
    
    this.promotionCardButtonSmartOptimization = promotionCardButtonSmartOptimization;
    return this;
  }

   /**
   * Get promotionCardButtonSmartOptimization
   * @return promotionCardButtonSmartOptimization
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataMultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization getPromotionCardButtonSmartOptimization() {
    return promotionCardButtonSmartOptimization;
  }


  public void setPromotionCardButtonSmartOptimization(QianchuanAdDetailGetV10DataMultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization promotionCardButtonSmartOptimization) {
    this.promotionCardButtonSmartOptimization = promotionCardButtonSmartOptimization;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard promotionCardId(Long promotionCardId) {
    
    this.promotionCardId = promotionCardId;
    return this;
  }

   /**
   * 
   * @return promotionCardId
  **/
  @javax.annotation.Nullable
  public Long getPromotionCardId() {
    return promotionCardId;
  }


  public void setPromotionCardId(Long promotionCardId) {
    this.promotionCardId = promotionCardId;
  }


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard promotionCardImageId(String promotionCardImageId) {
    
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


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard promotionCardSellingPoints(List<String> promotionCardSellingPoints) {
    
    this.promotionCardSellingPoints = promotionCardSellingPoints;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard addPromotionCardSellingPointsItem(String promotionCardSellingPointsItem) {
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


  public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard promotionCardTitle(String promotionCardTitle) {
    
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
    QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard = (QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard) o;
    return Objects.equals(this.componentId, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.componentId) &&
        Objects.equals(this.promotionCardActionButton, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.promotionCardActionButton) &&
        Objects.equals(this.promotionCardButtonSmartOptimization, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.promotionCardButtonSmartOptimization) &&
        Objects.equals(this.promotionCardId, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.promotionCardId) &&
        Objects.equals(this.promotionCardImageId, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.promotionCardImageId) &&
        Objects.equals(this.promotionCardSellingPoints, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.promotionCardSellingPoints) &&
        Objects.equals(this.promotionCardTitle, qianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.promotionCardTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, promotionCardActionButton, promotionCardButtonSmartOptimization, promotionCardId, promotionCardImageId, promotionCardSellingPoints, promotionCardTitle);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard {\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    promotionCardActionButton: ").append(toIndentedString(promotionCardActionButton)).append("\n");
    sb.append("    promotionCardButtonSmartOptimization: ").append(toIndentedString(promotionCardButtonSmartOptimization)).append("\n");
    sb.append("    promotionCardId: ").append(toIndentedString(promotionCardId)).append("\n");
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
    openapiFields.add("component_id");
    openapiFields.add("promotion_card_action_button");
    openapiFields.add("promotion_card_button_smart_optimization");
    openapiFields.add("promotion_card_id");
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
       if (!QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard
  */
  public static QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

