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
import com.bytedance.ads.model.ClueCouponCodeConsumeV2EmployeeUserType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class ClueCouponCodeConsumeV2RequestEmployee {
  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private Long storeId = null;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId = null;

  public static final String SERIALIZED_NAME_USER_TYPE = "user_type";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private ClueCouponCodeConsumeV2EmployeeUserType userType = null;

  public ClueCouponCodeConsumeV2RequestEmployee() {
  }

  public ClueCouponCodeConsumeV2RequestEmployee storeId(Long storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 9223372036854775807
   * @return storeId
  **/
  @javax.annotation.Nullable
  public Long getStoreId() {
    return storeId;
  }


  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }


  public ClueCouponCodeConsumeV2RequestEmployee userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return userId
  **/
  @javax.annotation.Nonnull
  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public ClueCouponCodeConsumeV2RequestEmployee userType(ClueCouponCodeConsumeV2EmployeeUserType userType) {
    
    this.userType = userType;
    return this;
  }

   /**
   * Get userType
   * @return userType
  **/
  @javax.annotation.Nonnull
  public ClueCouponCodeConsumeV2EmployeeUserType getUserType() {
    return userType;
  }


  public void setUserType(ClueCouponCodeConsumeV2EmployeeUserType userType) {
    this.userType = userType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponCodeConsumeV2RequestEmployee clueCouponCodeConsumeV2RequestEmployee = (ClueCouponCodeConsumeV2RequestEmployee) o;
    return Objects.equals(this.storeId, clueCouponCodeConsumeV2RequestEmployee.storeId) &&
        Objects.equals(this.userId, clueCouponCodeConsumeV2RequestEmployee.userId) &&
        Objects.equals(this.userType, clueCouponCodeConsumeV2RequestEmployee.userType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, userId, userType);
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
    sb.append("class ClueCouponCodeConsumeV2RequestEmployee {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
    openapiFields.add("store_id");
    openapiFields.add("user_id");
    openapiFields.add("user_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_id");
    openapiRequiredFields.add("user_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponCodeConsumeV2RequestEmployee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponCodeConsumeV2RequestEmployee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponCodeConsumeV2RequestEmployee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponCodeConsumeV2RequestEmployee.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponCodeConsumeV2RequestEmployee>() {
           @Override
           public void write(JsonWriter out, ClueCouponCodeConsumeV2RequestEmployee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponCodeConsumeV2RequestEmployee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponCodeConsumeV2RequestEmployee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponCodeConsumeV2RequestEmployee
  * @throws IOException if the JSON string is invalid with respect to ClueCouponCodeConsumeV2RequestEmployee
  */
  public static ClueCouponCodeConsumeV2RequestEmployee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponCodeConsumeV2RequestEmployee.class);
  }

 /**
  * Convert an instance of ClueCouponCodeConsumeV2RequestEmployee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

