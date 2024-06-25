/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAudienceListGetV10DataAudiencesListAudienceSource;
import com.bytedance.ads.model.QianchuanAudienceListGetV10DataAudiencesListAudienceType;
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
 * QianchuanAudienceListGetV10ResponseDataAudiencesListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class QianchuanAudienceListGetV10ResponseDataAudiencesListInner {
  public static final String SERIALIZED_NAME_AUDIENCE_GROUP = "audience_group";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_GROUP)
  private String audienceGroup = null;

  public static final String SERIALIZED_NAME_AUDIENCE_ID = "audience_id";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_ID)
  private Long audienceId = null;

  public static final String SERIALIZED_NAME_AUDIENCE_NAME = "audience_name";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_NAME)
  private String audienceName = null;

  public static final String SERIALIZED_NAME_AUDIENCE_SOURCE = "audience_source";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_SOURCE)
  private QianchuanAudienceListGetV10DataAudiencesListAudienceSource audienceSource = null;

  public static final String SERIALIZED_NAME_AUDIENCE_TYPE = "audience_type";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_TYPE)
  private QianchuanAudienceListGetV10DataAudiencesListAudienceType audienceType = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_PUSH_PRODUCT = "push_product";
  @SerializedName(SERIALIZED_NAME_PUSH_PRODUCT)
  private String pushProduct = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status = null;

  public static final String SERIALIZED_NAME_STOCK_NUM = "stock_num";
  @SerializedName(SERIALIZED_NAME_STOCK_NUM)
  private Long stockNum = null;

  public static final String SERIALIZED_NAME_STOCK_STATUS = "stock_status";
  @SerializedName(SERIALIZED_NAME_STOCK_STATUS)
  private Integer stockStatus = null;

  public QianchuanAudienceListGetV10ResponseDataAudiencesListInner() {
  }

  public QianchuanAudienceListGetV10ResponseDataAudiencesListInner audienceGroup(String audienceGroup) {
    
    this.audienceGroup = audienceGroup;
    return this;
  }

   /**
   * 
   * @return audienceGroup
  **/
  @javax.annotation.Nullable
  public String getAudienceGroup() {
    return audienceGroup;
  }


  public void setAudienceGroup(String audienceGroup) {
    this.audienceGroup = audienceGroup;
  }


  public QianchuanAudienceListGetV10ResponseDataAudiencesListInner audienceId(Long audienceId) {
    
    this.audienceId = audienceId;
    return this;
  }

   /**
   * 
   * @return audienceId
  **/
  @javax.annotation.Nullable
  public Long getAudienceId() {
    return audienceId;
  }


  public void setAudienceId(Long audienceId) {
    this.audienceId = audienceId;
  }


  public QianchuanAudienceListGetV10ResponseDataAudiencesListInner audienceName(String audienceName) {
    
    this.audienceName = audienceName;
    return this;
  }

   /**
   * 
   * @return audienceName
  **/
  @javax.annotation.Nullable
  public String getAudienceName() {
    return audienceName;
  }


  public void setAudienceName(String audienceName) {
    this.audienceName = audienceName;
  }


  public QianchuanAudienceListGetV10ResponseDataAudiencesListInner audienceSource(QianchuanAudienceListGetV10DataAudiencesListAudienceSource audienceSource) {
    
    this.audienceSource = audienceSource;
    return this;
  }

   /**
   * Get audienceSource
   * @return audienceSource
  **/
  @javax.annotation.Nullable
  public QianchuanAudienceListGetV10DataAudiencesListAudienceSource getAudienceSource() {
    return audienceSource;
  }


  public void setAudienceSource(QianchuanAudienceListGetV10DataAudiencesListAudienceSource audienceSource) {
    this.audienceSource = audienceSource;
  }


  public QianchuanAudienceListGetV10ResponseDataAudiencesListInner audienceType(QianchuanAudienceListGetV10DataAudiencesListAudienceType audienceType) {
    
    this.audienceType = audienceType;
    return this;
  }

   /**
   * Get audienceType
   * @return audienceType
  **/
  @javax.annotation.Nullable
  public QianchuanAudienceListGetV10DataAudiencesListAudienceType getAudienceType() {
    return audienceType;
  }


  public void setAudienceType(QianchuanAudienceListGetV10DataAudiencesListAudienceType audienceType) {
    this.audienceType = audienceType;
  }


  public QianchuanAudienceListGetV10ResponseDataAudiencesListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public QianchuanAudienceListGetV10ResponseDataAudiencesListInner pushProduct(String pushProduct) {
    
    this.pushProduct = pushProduct;
    return this;
  }

   /**
   * 
   * @return pushProduct
  **/
  @javax.annotation.Nullable
  public String getPushProduct() {
    return pushProduct;
  }


  public void setPushProduct(String pushProduct) {
    this.pushProduct = pushProduct;
  }


  public QianchuanAudienceListGetV10ResponseDataAudiencesListInner status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public QianchuanAudienceListGetV10ResponseDataAudiencesListInner stockNum(Long stockNum) {
    
    this.stockNum = stockNum;
    return this;
  }

   /**
   * 
   * @return stockNum
  **/
  @javax.annotation.Nullable
  public Long getStockNum() {
    return stockNum;
  }


  public void setStockNum(Long stockNum) {
    this.stockNum = stockNum;
  }


  public QianchuanAudienceListGetV10ResponseDataAudiencesListInner stockStatus(Integer stockStatus) {
    
    this.stockStatus = stockStatus;
    return this;
  }

   /**
   * 
   * @return stockStatus
  **/
  @javax.annotation.Nullable
  public Integer getStockStatus() {
    return stockStatus;
  }


  public void setStockStatus(Integer stockStatus) {
    this.stockStatus = stockStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAudienceListGetV10ResponseDataAudiencesListInner qianchuanAudienceListGetV10ResponseDataAudiencesListInner = (QianchuanAudienceListGetV10ResponseDataAudiencesListInner) o;
    return Objects.equals(this.audienceGroup, qianchuanAudienceListGetV10ResponseDataAudiencesListInner.audienceGroup) &&
        Objects.equals(this.audienceId, qianchuanAudienceListGetV10ResponseDataAudiencesListInner.audienceId) &&
        Objects.equals(this.audienceName, qianchuanAudienceListGetV10ResponseDataAudiencesListInner.audienceName) &&
        Objects.equals(this.audienceSource, qianchuanAudienceListGetV10ResponseDataAudiencesListInner.audienceSource) &&
        Objects.equals(this.audienceType, qianchuanAudienceListGetV10ResponseDataAudiencesListInner.audienceType) &&
        Objects.equals(this.createTime, qianchuanAudienceListGetV10ResponseDataAudiencesListInner.createTime) &&
        Objects.equals(this.pushProduct, qianchuanAudienceListGetV10ResponseDataAudiencesListInner.pushProduct) &&
        Objects.equals(this.status, qianchuanAudienceListGetV10ResponseDataAudiencesListInner.status) &&
        Objects.equals(this.stockNum, qianchuanAudienceListGetV10ResponseDataAudiencesListInner.stockNum) &&
        Objects.equals(this.stockStatus, qianchuanAudienceListGetV10ResponseDataAudiencesListInner.stockStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceGroup, audienceId, audienceName, audienceSource, audienceType, createTime, pushProduct, status, stockNum, stockStatus);
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
    sb.append("class QianchuanAudienceListGetV10ResponseDataAudiencesListInner {\n");
    sb.append("    audienceGroup: ").append(toIndentedString(audienceGroup)).append("\n");
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
    sb.append("    audienceName: ").append(toIndentedString(audienceName)).append("\n");
    sb.append("    audienceSource: ").append(toIndentedString(audienceSource)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    pushProduct: ").append(toIndentedString(pushProduct)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stockNum: ").append(toIndentedString(stockNum)).append("\n");
    sb.append("    stockStatus: ").append(toIndentedString(stockStatus)).append("\n");
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
    openapiFields.add("audience_group");
    openapiFields.add("audience_id");
    openapiFields.add("audience_name");
    openapiFields.add("audience_source");
    openapiFields.add("audience_type");
    openapiFields.add("create_time");
    openapiFields.add("push_product");
    openapiFields.add("status");
    openapiFields.add("stock_num");
    openapiFields.add("stock_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAudienceListGetV10ResponseDataAudiencesListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAudienceListGetV10ResponseDataAudiencesListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAudienceListGetV10ResponseDataAudiencesListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAudienceListGetV10ResponseDataAudiencesListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAudienceListGetV10ResponseDataAudiencesListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAudienceListGetV10ResponseDataAudiencesListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAudienceListGetV10ResponseDataAudiencesListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAudienceListGetV10ResponseDataAudiencesListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAudienceListGetV10ResponseDataAudiencesListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAudienceListGetV10ResponseDataAudiencesListInner
  */
  public static QianchuanAudienceListGetV10ResponseDataAudiencesListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAudienceListGetV10ResponseDataAudiencesListInner.class);
  }

 /**
  * Convert an instance of QianchuanAudienceListGetV10ResponseDataAudiencesListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

