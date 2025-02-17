/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag;
import com.bytedance.ads.model.LocalLifeAdvertiserListV30DataAdvListLocalAccountRole;
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
 * LocalLifeAdvertiserListV30ResponseDataAdvListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class LocalLifeAdvertiserListV30ResponseDataAdvListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_MAIN_COPY_TAG = "account_main_copy_tag";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_MAIN_COPY_TAG)
  private LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag accountMainCopyTag = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ROLE = "local_account_role";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ROLE)
  private LocalLifeAdvertiserListV30DataAdvListLocalAccountRole localAccountRole = null;

  public LocalLifeAdvertiserListV30ResponseDataAdvListInner() {
  }

  public LocalLifeAdvertiserListV30ResponseDataAdvListInner accountMainCopyTag(LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag accountMainCopyTag) {
    
    this.accountMainCopyTag = accountMainCopyTag;
    return this;
  }

   /**
   * Get accountMainCopyTag
   * @return accountMainCopyTag
  **/
  @javax.annotation.Nullable
  public LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag getAccountMainCopyTag() {
    return accountMainCopyTag;
  }


  public void setAccountMainCopyTag(LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag accountMainCopyTag) {
    this.accountMainCopyTag = accountMainCopyTag;
  }


  public LocalLifeAdvertiserListV30ResponseDataAdvListInner localAccountId(Long localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 账户ID
   * @return localAccountId
  **/
  @javax.annotation.Nullable
  public Long getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(Long localAccountId) {
    this.localAccountId = localAccountId;
  }


  public LocalLifeAdvertiserListV30ResponseDataAdvListInner localAccountRole(LocalLifeAdvertiserListV30DataAdvListLocalAccountRole localAccountRole) {
    
    this.localAccountRole = localAccountRole;
    return this;
  }

   /**
   * Get localAccountRole
   * @return localAccountRole
  **/
  @javax.annotation.Nullable
  public LocalLifeAdvertiserListV30DataAdvListLocalAccountRole getLocalAccountRole() {
    return localAccountRole;
  }


  public void setLocalAccountRole(LocalLifeAdvertiserListV30DataAdvListLocalAccountRole localAccountRole) {
    this.localAccountRole = localAccountRole;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalLifeAdvertiserListV30ResponseDataAdvListInner localLifeAdvertiserListV30ResponseDataAdvListInner = (LocalLifeAdvertiserListV30ResponseDataAdvListInner) o;
    return Objects.equals(this.accountMainCopyTag, localLifeAdvertiserListV30ResponseDataAdvListInner.accountMainCopyTag) &&
        Objects.equals(this.localAccountId, localLifeAdvertiserListV30ResponseDataAdvListInner.localAccountId) &&
        Objects.equals(this.localAccountRole, localLifeAdvertiserListV30ResponseDataAdvListInner.localAccountRole);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountMainCopyTag, localAccountId, localAccountRole);
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
    sb.append("class LocalLifeAdvertiserListV30ResponseDataAdvListInner {\n");
    sb.append("    accountMainCopyTag: ").append(toIndentedString(accountMainCopyTag)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
    sb.append("    localAccountRole: ").append(toIndentedString(localAccountRole)).append("\n");
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
    openapiFields.add("account_main_copy_tag");
    openapiFields.add("local_account_id");
    openapiFields.add("local_account_role");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalLifeAdvertiserListV30ResponseDataAdvListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalLifeAdvertiserListV30ResponseDataAdvListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalLifeAdvertiserListV30ResponseDataAdvListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalLifeAdvertiserListV30ResponseDataAdvListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalLifeAdvertiserListV30ResponseDataAdvListInner>() {
           @Override
           public void write(JsonWriter out, LocalLifeAdvertiserListV30ResponseDataAdvListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalLifeAdvertiserListV30ResponseDataAdvListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalLifeAdvertiserListV30ResponseDataAdvListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalLifeAdvertiserListV30ResponseDataAdvListInner
  * @throws IOException if the JSON string is invalid with respect to LocalLifeAdvertiserListV30ResponseDataAdvListInner
  */
  public static LocalLifeAdvertiserListV30ResponseDataAdvListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalLifeAdvertiserListV30ResponseDataAdvListInner.class);
  }

 /**
  * Convert an instance of LocalLifeAdvertiserListV30ResponseDataAdvListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

