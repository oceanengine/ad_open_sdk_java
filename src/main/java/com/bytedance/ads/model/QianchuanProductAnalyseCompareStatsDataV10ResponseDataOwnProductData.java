/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData {
  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Double ctr = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_COST = "direct_order_pay_cost";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_COST)
  private Double directOrderPayCost = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_COST_PER_ORDER = "direct_order_pay_cost_per_order";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_COST_PER_ORDER)
  private Double directOrderPayCostPerOrder = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_COUNT = "direct_order_pay_count";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_COUNT)
  private Long directOrderPayCount = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_GMV = "direct_order_pay_gmv";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_GMV)
  private Double directOrderPayGmv = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_RATE = "direct_order_pay_rate";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_RATE)
  private Double directOrderPayRate = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PREPAY_AND_PAY_ROI = "direct_order_prepay_and_pay_roi";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PREPAY_AND_PAY_ROI)
  private Double directOrderPrepayAndPayRoi = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData() {
  }

  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData ctr(Double ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * 
   * @return ctr
  **/
  @javax.annotation.Nullable
  public Double getCtr() {
    return ctr;
  }


  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData directOrderPayCost(Double directOrderPayCost) {
    
    this.directOrderPayCost = directOrderPayCost;
    return this;
  }

   /**
   * 
   * @return directOrderPayCost
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPayCost() {
    return directOrderPayCost;
  }


  public void setDirectOrderPayCost(Double directOrderPayCost) {
    this.directOrderPayCost = directOrderPayCost;
  }


  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData directOrderPayCostPerOrder(Double directOrderPayCostPerOrder) {
    
    this.directOrderPayCostPerOrder = directOrderPayCostPerOrder;
    return this;
  }

   /**
   * 
   * @return directOrderPayCostPerOrder
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPayCostPerOrder() {
    return directOrderPayCostPerOrder;
  }


  public void setDirectOrderPayCostPerOrder(Double directOrderPayCostPerOrder) {
    this.directOrderPayCostPerOrder = directOrderPayCostPerOrder;
  }


  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData directOrderPayCount(Long directOrderPayCount) {
    
    this.directOrderPayCount = directOrderPayCount;
    return this;
  }

   /**
   * 
   * @return directOrderPayCount
  **/
  @javax.annotation.Nullable
  public Long getDirectOrderPayCount() {
    return directOrderPayCount;
  }


  public void setDirectOrderPayCount(Long directOrderPayCount) {
    this.directOrderPayCount = directOrderPayCount;
  }


  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData directOrderPayGmv(Double directOrderPayGmv) {
    
    this.directOrderPayGmv = directOrderPayGmv;
    return this;
  }

   /**
   * 
   * @return directOrderPayGmv
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPayGmv() {
    return directOrderPayGmv;
  }


  public void setDirectOrderPayGmv(Double directOrderPayGmv) {
    this.directOrderPayGmv = directOrderPayGmv;
  }


  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData directOrderPayRate(Double directOrderPayRate) {
    
    this.directOrderPayRate = directOrderPayRate;
    return this;
  }

   /**
   * 
   * @return directOrderPayRate
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPayRate() {
    return directOrderPayRate;
  }


  public void setDirectOrderPayRate(Double directOrderPayRate) {
    this.directOrderPayRate = directOrderPayRate;
  }


  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData directOrderPrepayAndPayRoi(Double directOrderPrepayAndPayRoi) {
    
    this.directOrderPrepayAndPayRoi = directOrderPrepayAndPayRoi;
    return this;
  }

   /**
   * 
   * @return directOrderPrepayAndPayRoi
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPrepayAndPayRoi() {
    return directOrderPrepayAndPayRoi;
  }


  public void setDirectOrderPrepayAndPayRoi(Double directOrderPrepayAndPayRoi) {
    this.directOrderPrepayAndPayRoi = directOrderPrepayAndPayRoi;
  }


  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
    this.statCost = statCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData qianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData = (QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData) o;
    return Objects.equals(this.ctr, qianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData.ctr) &&
        Objects.equals(this.directOrderPayCost, qianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData.directOrderPayCost) &&
        Objects.equals(this.directOrderPayCostPerOrder, qianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData.directOrderPayCostPerOrder) &&
        Objects.equals(this.directOrderPayCount, qianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData.directOrderPayCount) &&
        Objects.equals(this.directOrderPayGmv, qianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData.directOrderPayGmv) &&
        Objects.equals(this.directOrderPayRate, qianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData.directOrderPayRate) &&
        Objects.equals(this.directOrderPrepayAndPayRoi, qianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData.directOrderPrepayAndPayRoi) &&
        Objects.equals(this.statCost, qianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData.statCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ctr, directOrderPayCost, directOrderPayCostPerOrder, directOrderPayCount, directOrderPayGmv, directOrderPayRate, directOrderPrepayAndPayRoi, statCost);
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
    sb.append("class QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData {\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    directOrderPayCost: ").append(toIndentedString(directOrderPayCost)).append("\n");
    sb.append("    directOrderPayCostPerOrder: ").append(toIndentedString(directOrderPayCostPerOrder)).append("\n");
    sb.append("    directOrderPayCount: ").append(toIndentedString(directOrderPayCount)).append("\n");
    sb.append("    directOrderPayGmv: ").append(toIndentedString(directOrderPayGmv)).append("\n");
    sb.append("    directOrderPayRate: ").append(toIndentedString(directOrderPayRate)).append("\n");
    sb.append("    directOrderPrepayAndPayRoi: ").append(toIndentedString(directOrderPrepayAndPayRoi)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
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
    openapiFields.add("ctr");
    openapiFields.add("direct_order_pay_cost");
    openapiFields.add("direct_order_pay_cost_per_order");
    openapiFields.add("direct_order_pay_count");
    openapiFields.add("direct_order_pay_gmv");
    openapiFields.add("direct_order_pay_rate");
    openapiFields.add("direct_order_prepay_and_pay_roi");
    openapiFields.add("stat_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData>() {
           @Override
           public void write(JsonWriter out, QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData
  * @throws IOException if the JSON string is invalid with respect to QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData
  */
  public static QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData.class);
  }

 /**
  * Convert an instance of QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

