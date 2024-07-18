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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class UserInfoV2ResponseData {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Long appId = null;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_MATERIAL_AUTH_STATUS = "material_auth_status";
  @SerializedName(SERIALIZED_NAME_MATERIAL_AUTH_STATUS)
  private Boolean materialAuthStatus = null;

  public static final String SERIALIZED_NAME_TOKEN_API_LIST = "token_api_list";
  @SerializedName(SERIALIZED_NAME_TOKEN_API_LIST)
  private List<String> tokenApiList = null;

  public static final String SERIALIZED_NAME_TOKEN_SCOPE_LIST = "token_scope_list";
  @SerializedName(SERIALIZED_NAME_TOKEN_SCOPE_LIST)
  private List<Long> tokenScopeList = null;

  public UserInfoV2ResponseData() {
  }

  public UserInfoV2ResponseData appId(Long appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 授权的应用id
   * @return appId
  **/
  @javax.annotation.Nullable
  public Long getAppId() {
    return appId;
  }


  public void setAppId(Long appId) {
    this.appId = appId;
  }


  public UserInfoV2ResponseData displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * 
   * @return displayName
  **/
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UserInfoV2ResponseData email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 邮箱（已经脱敏处理）
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserInfoV2ResponseData id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 用户id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public UserInfoV2ResponseData materialAuthStatus(Boolean materialAuthStatus) {
    
    this.materialAuthStatus = materialAuthStatus;
    return this;
  }

   /**
   * 是否敏感物料授权, true 已敏感物料授权, false 未敏感物料授权
   * @return materialAuthStatus
  **/
  @javax.annotation.Nullable
  public Boolean getMaterialAuthStatus() {
    return materialAuthStatus;
  }


  public void setMaterialAuthStatus(Boolean materialAuthStatus) {
    this.materialAuthStatus = materialAuthStatus;
  }


  public UserInfoV2ResponseData tokenApiList(List<String> tokenApiList) {
    
    this.tokenApiList = tokenApiList;
    return this;
  }

  public UserInfoV2ResponseData addTokenApiListItem(String tokenApiListItem) {
    if (this.tokenApiList == null) {
      this.tokenApiList = new ArrayList<>();
    }
    this.tokenApiList.add(tokenApiListItem);
    return this;
  }

   /**
   * 当前token可操作的api接口列表
   * @return tokenApiList
  **/
  @javax.annotation.Nullable
  public List<String> getTokenApiList() {
    return tokenApiList;
  }


  public void setTokenApiList(List<String> tokenApiList) {
    this.tokenApiList = tokenApiList;
  }


  public UserInfoV2ResponseData tokenScopeList(List<Long> tokenScopeList) {
    
    this.tokenScopeList = tokenScopeList;
    return this;
  }

  public UserInfoV2ResponseData addTokenScopeListItem(Long tokenScopeListItem) {
    if (this.tokenScopeList == null) {
      this.tokenScopeList = new ArrayList<>();
    }
    this.tokenScopeList.add(tokenScopeListItem);
    return this;
  }

   /**
   * 权限点list
   * @return tokenScopeList
  **/
  @javax.annotation.Nullable
  public List<Long> getTokenScopeList() {
    return tokenScopeList;
  }


  public void setTokenScopeList(List<Long> tokenScopeList) {
    this.tokenScopeList = tokenScopeList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoV2ResponseData userInfoV2ResponseData = (UserInfoV2ResponseData) o;
    return Objects.equals(this.appId, userInfoV2ResponseData.appId) &&
        Objects.equals(this.displayName, userInfoV2ResponseData.displayName) &&
        Objects.equals(this.email, userInfoV2ResponseData.email) &&
        Objects.equals(this.id, userInfoV2ResponseData.id) &&
        Objects.equals(this.materialAuthStatus, userInfoV2ResponseData.materialAuthStatus) &&
        Objects.equals(this.tokenApiList, userInfoV2ResponseData.tokenApiList) &&
        Objects.equals(this.tokenScopeList, userInfoV2ResponseData.tokenScopeList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, displayName, email, id, materialAuthStatus, tokenApiList, tokenScopeList);
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
    sb.append("class UserInfoV2ResponseData {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    materialAuthStatus: ").append(toIndentedString(materialAuthStatus)).append("\n");
    sb.append("    tokenApiList: ").append(toIndentedString(tokenApiList)).append("\n");
    sb.append("    tokenScopeList: ").append(toIndentedString(tokenScopeList)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("display_name");
    openapiFields.add("email");
    openapiFields.add("id");
    openapiFields.add("material_auth_status");
    openapiFields.add("token_api_list");
    openapiFields.add("token_scope_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserInfoV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserInfoV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserInfoV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserInfoV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<UserInfoV2ResponseData>() {
           @Override
           public void write(JsonWriter out, UserInfoV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserInfoV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserInfoV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserInfoV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to UserInfoV2ResponseData
  */
  public static UserInfoV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserInfoV2ResponseData.class);
  }

 /**
  * Convert an instance of UserInfoV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

