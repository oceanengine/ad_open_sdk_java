/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
 * StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner {
  public static final String SERIALIZED_NAME_CANCEL_ROLE = "cancel_role";
  @SerializedName(SERIALIZED_NAME_CANCEL_ROLE)
  private Long cancelRole = null;

  public static final String SERIALIZED_NAME_PARTICIPATE_STATUS = "participate_status";
  @SerializedName(SERIALIZED_NAME_PARTICIPATE_STATUS)
  private Long participateStatus = null;

  public static final String SERIALIZED_NAME_UNIQUE_ID = "unique_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ID)
  private String uniqueId = null;

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner() {
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner cancelRole(Long cancelRole) {
    
    this.cancelRole = cancelRole;
    return this;
  }

   /**
   * - 取消方：1-开发者，2-达人，3-平台
   * @return cancelRole
  **/
  @javax.annotation.Nullable
  public Long getCancelRole() {
    return cancelRole;
  }


  public void setCancelRole(Long cancelRole) {
    this.cancelRole = cancelRole;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner participateStatus(Long participateStatus) {
    
    this.participateStatus = participateStatus;
    return this;
  }

   /**
   * - 合作状态，1-已发布视频 2-待发布视频 3-合作已取消
   * @return participateStatus
  **/
  @javax.annotation.Nullable
  public Long getParticipateStatus() {
    return participateStatus;
  }


  public void setParticipateStatus(Long participateStatus) {
    this.participateStatus = participateStatus;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner uniqueId(String uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * - 达人抖音号
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  public String getUniqueId() {
    return uniqueId;
  }


  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner = (StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner) o;
    return Objects.equals(this.cancelRole, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner.cancelRole) &&
        Objects.equals(this.participateStatus, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner.participateStatus) &&
        Objects.equals(this.uniqueId, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner.uniqueId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelRole, participateStatus, uniqueId);
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
    sb.append("class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner {\n");
    sb.append("    cancelRole: ").append(toIndentedString(cancelRole)).append("\n");
    sb.append("    participateStatus: ").append(toIndentedString(participateStatus)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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
    openapiFields.add("cancel_role");
    openapiFields.add("participate_status");
    openapiFields.add("unique_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner
  */
  public static StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner.class);
  }

 /**
  * Convert an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

