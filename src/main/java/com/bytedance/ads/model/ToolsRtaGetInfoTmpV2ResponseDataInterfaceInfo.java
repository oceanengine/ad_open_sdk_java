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
import com.bytedance.ads.model.ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange;
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
 * RTA配置数据
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo {
  public static final String SERIALIZED_NAME_DELIVERY_RANGE = "delivery_range";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RANGE)
  private ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange deliveryRange = null;

  public static final String SERIALIZED_NAME_LOCAL_QPS = "local_qps";
  @SerializedName(SERIALIZED_NAME_LOCAL_QPS)
  private Long localQps = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public static final String SERIALIZED_NAME_UNION_QPS = "union_qps";
  @SerializedName(SERIALIZED_NAME_UNION_QPS)
  private Long unionQps = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo() {
  }

  public ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo deliveryRange(ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange deliveryRange) {
    
    this.deliveryRange = deliveryRange;
    return this;
  }

   /**
   * Get deliveryRange
   * @return deliveryRange
  **/
  @javax.annotation.Nullable
  public ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange getDeliveryRange() {
    return deliveryRange;
  }


  public void setDeliveryRange(ToolsRtaGetInfoTmpV2DataInterfaceInfoDeliveryRange deliveryRange) {
    this.deliveryRange = deliveryRange;
  }


  public ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo localQps(Long localQps) {
    
    this.localQps = localQps;
    return this;
  }

   /**
   * 站内QPS
   * @return localQps
  **/
  @javax.annotation.Nullable
  public Long getLocalQps() {
    return localQps;
  }


  public void setLocalQps(Long localQps) {
    this.localQps = localQps;
  }


  public ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 接口地址状态；1：生效 0：无效
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  public ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo unionQps(Long unionQps) {
    
    this.unionQps = unionQps;
    return this;
  }

   /**
   * 穿山甲QPS
   * @return unionQps
  **/
  @javax.annotation.Nullable
  public Long getUnionQps() {
    return unionQps;
  }


  public void setUnionQps(Long unionQps) {
    this.unionQps = unionQps;
  }


  public ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 接口地址
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo toolsRtaGetInfoTmpV2ResponseDataInterfaceInfo = (ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo) o;
    return Objects.equals(this.deliveryRange, toolsRtaGetInfoTmpV2ResponseDataInterfaceInfo.deliveryRange) &&
        Objects.equals(this.localQps, toolsRtaGetInfoTmpV2ResponseDataInterfaceInfo.localQps) &&
        Objects.equals(this.status, toolsRtaGetInfoTmpV2ResponseDataInterfaceInfo.status) &&
        Objects.equals(this.unionQps, toolsRtaGetInfoTmpV2ResponseDataInterfaceInfo.unionQps) &&
        Objects.equals(this.url, toolsRtaGetInfoTmpV2ResponseDataInterfaceInfo.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryRange, localQps, status, unionQps, url);
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
    sb.append("class ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo {\n");
    sb.append("    deliveryRange: ").append(toIndentedString(deliveryRange)).append("\n");
    sb.append("    localQps: ").append(toIndentedString(localQps)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    unionQps: ").append(toIndentedString(unionQps)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("delivery_range");
    openapiFields.add("local_qps");
    openapiFields.add("status");
    openapiFields.add("union_qps");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo>() {
           @Override
           public void write(JsonWriter out, ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo
  * @throws IOException if the JSON string is invalid with respect to ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo
  */
  public static ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo.class);
  }

 /**
  * Convert an instance of ToolsRtaGetInfoTmpV2ResponseDataInterfaceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

