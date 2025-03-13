/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
import java.util.HashMap;
import java.util.Map;
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
 * StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_CHALLENGE_STATUS = "challenge_status";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_STATUS)
  private Long challengeStatus = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_DEMAND_NAME = "demand_name";
  @SerializedName(SERIALIZED_NAME_DEMAND_NAME)
  private String demandName = null;

  public static final String SERIALIZED_NAME_PAY_TYPE = "pay_type";
  @SerializedName(SERIALIZED_NAME_PAY_TYPE)
  private Long payType = null;

  public static final String SERIALIZED_NAME_PROVIDER_ORDER_TASK_STATUS = "provider_order_task_status";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ORDER_TASK_STATUS)
  private Long providerOrderTaskStatus = null;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER_PROFIT_RATE = "service_provider_profit_rate";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER_PROFIT_RATE)
  private Long serviceProviderProfitRate = null;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER_PROFIT_RATE_CHANNEL = "service_provider_profit_rate_channel";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER_PROFIT_RATE_CHANNEL)
  private Map<String, Long> serviceProviderProfitRateChannel = null;

  public StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner() {
  }

  public StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner challengeStatus(Long challengeStatus) {
    
    this.challengeStatus = challengeStatus;
    return this;
  }

   /**
   * 
   * @return challengeStatus
  **/
  @javax.annotation.Nullable
  public Long getChallengeStatus() {
    return challengeStatus;
  }


  public void setChallengeStatus(Long challengeStatus) {
    this.challengeStatus = challengeStatus;
  }


  public StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner createTime(String createTime) {
    
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


  public StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner demandName(String demandName) {
    
    this.demandName = demandName;
    return this;
  }

   /**
   * 
   * @return demandName
  **/
  @javax.annotation.Nullable
  public String getDemandName() {
    return demandName;
  }


  public void setDemandName(String demandName) {
    this.demandName = demandName;
  }


  public StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner payType(Long payType) {
    
    this.payType = payType;
    return this;
  }

   /**
   * 
   * @return payType
  **/
  @javax.annotation.Nullable
  public Long getPayType() {
    return payType;
  }


  public void setPayType(Long payType) {
    this.payType = payType;
  }


  public StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner providerOrderTaskStatus(Long providerOrderTaskStatus) {
    
    this.providerOrderTaskStatus = providerOrderTaskStatus;
    return this;
  }

   /**
   * 
   * @return providerOrderTaskStatus
  **/
  @javax.annotation.Nullable
  public Long getProviderOrderTaskStatus() {
    return providerOrderTaskStatus;
  }


  public void setProviderOrderTaskStatus(Long providerOrderTaskStatus) {
    this.providerOrderTaskStatus = providerOrderTaskStatus;
  }


  public StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner serviceProviderProfitRate(Long serviceProviderProfitRate) {
    
    this.serviceProviderProfitRate = serviceProviderProfitRate;
    return this;
  }

   /**
   * 0-1000，撮合服务商兜底抽佣比例。千分之一，例如50%，写入500
   * @return serviceProviderProfitRate
  **/
  @javax.annotation.Nullable
  public Long getServiceProviderProfitRate() {
    return serviceProviderProfitRate;
  }


  public void setServiceProviderProfitRate(Long serviceProviderProfitRate) {
    this.serviceProviderProfitRate = serviceProviderProfitRate;
  }


  public StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner serviceProviderProfitRateChannel(Map<String, Long> serviceProviderProfitRateChannel) {
    
    this.serviceProviderProfitRateChannel = serviceProviderProfitRateChannel;
    return this;
  }

  public StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner putServiceProviderProfitRateChannelItem(String key, Long serviceProviderProfitRateChannelItem) {
    if (this.serviceProviderProfitRateChannel == null) {
      this.serviceProviderProfitRateChannel = new HashMap<>();
    }
    this.serviceProviderProfitRateChannel.put(key, serviceProviderProfitRateChannelItem);
    return this;
  }

   /**
   * 0-1000，撮合服务商分渠道抽佣比例，千分之一
   * @return serviceProviderProfitRateChannel
  **/
  @javax.annotation.Nullable
  public Map<String, Long> getServiceProviderProfitRateChannel() {
    return serviceProviderProfitRateChannel;
  }


  public void setServiceProviderProfitRateChannel(Map<String, Long> serviceProviderProfitRateChannel) {
    this.serviceProviderProfitRateChannel = serviceProviderProfitRateChannel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner starMcnProviderGetParticipatedTaskV2ResponseDataDataInner = (StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner) o;
    return Objects.equals(this.challengeStatus, starMcnProviderGetParticipatedTaskV2ResponseDataDataInner.challengeStatus) &&
        Objects.equals(this.createTime, starMcnProviderGetParticipatedTaskV2ResponseDataDataInner.createTime) &&
        Objects.equals(this.demandId, starMcnProviderGetParticipatedTaskV2ResponseDataDataInner.demandId) &&
        Objects.equals(this.demandName, starMcnProviderGetParticipatedTaskV2ResponseDataDataInner.demandName) &&
        Objects.equals(this.payType, starMcnProviderGetParticipatedTaskV2ResponseDataDataInner.payType) &&
        Objects.equals(this.providerOrderTaskStatus, starMcnProviderGetParticipatedTaskV2ResponseDataDataInner.providerOrderTaskStatus) &&
        Objects.equals(this.serviceProviderProfitRate, starMcnProviderGetParticipatedTaskV2ResponseDataDataInner.serviceProviderProfitRate) &&
        Objects.equals(this.serviceProviderProfitRateChannel, starMcnProviderGetParticipatedTaskV2ResponseDataDataInner.serviceProviderProfitRateChannel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeStatus, createTime, demandId, demandName, payType, providerOrderTaskStatus, serviceProviderProfitRate, serviceProviderProfitRateChannel);
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
    sb.append("class StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner {\n");
    sb.append("    challengeStatus: ").append(toIndentedString(challengeStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    demandName: ").append(toIndentedString(demandName)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
    sb.append("    providerOrderTaskStatus: ").append(toIndentedString(providerOrderTaskStatus)).append("\n");
    sb.append("    serviceProviderProfitRate: ").append(toIndentedString(serviceProviderProfitRate)).append("\n");
    sb.append("    serviceProviderProfitRateChannel: ").append(toIndentedString(serviceProviderProfitRateChannel)).append("\n");
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
    openapiFields.add("challenge_status");
    openapiFields.add("create_time");
    openapiFields.add("demand_id");
    openapiFields.add("demand_name");
    openapiFields.add("pay_type");
    openapiFields.add("provider_order_task_status");
    openapiFields.add("service_provider_profit_rate");
    openapiFields.add("service_provider_profit_rate_channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("create_time");
    openapiRequiredFields.add("demand_id");
    openapiRequiredFields.add("demand_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner
  */
  public static StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of StarMcnProviderGetParticipatedTaskV2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

