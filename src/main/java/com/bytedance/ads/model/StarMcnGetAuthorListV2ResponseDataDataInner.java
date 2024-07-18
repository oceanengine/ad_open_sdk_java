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
 * StarMcnGetAuthorListV2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class StarMcnGetAuthorListV2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Long authorId = null;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName = null;

  public static final String SERIALIZED_NAME_IS_BLOCK = "is_block";
  @SerializedName(SERIALIZED_NAME_IS_BLOCK)
  private Boolean isBlock = null;

  public static final String SERIALIZED_NAME_IS_CONTRACTED = "is_contracted";
  @SerializedName(SERIALIZED_NAME_IS_CONTRACTED)
  private Boolean isContracted = null;

  public static final String SERIALIZED_NAME_IS_REAL_NAME = "is_real_name";
  @SerializedName(SERIALIZED_NAME_IS_REAL_NAME)
  private Boolean isRealName = null;

  public static final String SERIALIZED_NAME_VALID_FANS_AMOUNT = "valid_fans_amount";
  @SerializedName(SERIALIZED_NAME_VALID_FANS_AMOUNT)
  private Long validFansAmount = null;

  public StarMcnGetAuthorListV2ResponseDataDataInner() {
  }

  public StarMcnGetAuthorListV2ResponseDataDataInner authorId(Long authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * 
   * @return authorId
  **/
  @javax.annotation.Nullable
  public Long getAuthorId() {
    return authorId;
  }


  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }


  public StarMcnGetAuthorListV2ResponseDataDataInner authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * 
   * @return authorName
  **/
  @javax.annotation.Nullable
  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public StarMcnGetAuthorListV2ResponseDataDataInner isBlock(Boolean isBlock) {
    
    this.isBlock = isBlock;
    return this;
  }

   /**
   * 
   * @return isBlock
  **/
  @javax.annotation.Nullable
  public Boolean getIsBlock() {
    return isBlock;
  }


  public void setIsBlock(Boolean isBlock) {
    this.isBlock = isBlock;
  }


  public StarMcnGetAuthorListV2ResponseDataDataInner isContracted(Boolean isContracted) {
    
    this.isContracted = isContracted;
    return this;
  }

   /**
   * 
   * @return isContracted
  **/
  @javax.annotation.Nullable
  public Boolean getIsContracted() {
    return isContracted;
  }


  public void setIsContracted(Boolean isContracted) {
    this.isContracted = isContracted;
  }


  public StarMcnGetAuthorListV2ResponseDataDataInner isRealName(Boolean isRealName) {
    
    this.isRealName = isRealName;
    return this;
  }

   /**
   * 
   * @return isRealName
  **/
  @javax.annotation.Nullable
  public Boolean getIsRealName() {
    return isRealName;
  }


  public void setIsRealName(Boolean isRealName) {
    this.isRealName = isRealName;
  }


  public StarMcnGetAuthorListV2ResponseDataDataInner validFansAmount(Long validFansAmount) {
    
    this.validFansAmount = validFansAmount;
    return this;
  }

   /**
   * 
   * @return validFansAmount
  **/
  @javax.annotation.Nullable
  public Long getValidFansAmount() {
    return validFansAmount;
  }


  public void setValidFansAmount(Long validFansAmount) {
    this.validFansAmount = validFansAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnGetAuthorListV2ResponseDataDataInner starMcnGetAuthorListV2ResponseDataDataInner = (StarMcnGetAuthorListV2ResponseDataDataInner) o;
    return Objects.equals(this.authorId, starMcnGetAuthorListV2ResponseDataDataInner.authorId) &&
        Objects.equals(this.authorName, starMcnGetAuthorListV2ResponseDataDataInner.authorName) &&
        Objects.equals(this.isBlock, starMcnGetAuthorListV2ResponseDataDataInner.isBlock) &&
        Objects.equals(this.isContracted, starMcnGetAuthorListV2ResponseDataDataInner.isContracted) &&
        Objects.equals(this.isRealName, starMcnGetAuthorListV2ResponseDataDataInner.isRealName) &&
        Objects.equals(this.validFansAmount, starMcnGetAuthorListV2ResponseDataDataInner.validFansAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, authorName, isBlock, isContracted, isRealName, validFansAmount);
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
    sb.append("class StarMcnGetAuthorListV2ResponseDataDataInner {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    isBlock: ").append(toIndentedString(isBlock)).append("\n");
    sb.append("    isContracted: ").append(toIndentedString(isContracted)).append("\n");
    sb.append("    isRealName: ").append(toIndentedString(isRealName)).append("\n");
    sb.append("    validFansAmount: ").append(toIndentedString(validFansAmount)).append("\n");
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
    openapiFields.add("author_id");
    openapiFields.add("author_name");
    openapiFields.add("is_block");
    openapiFields.add("is_contracted");
    openapiFields.add("is_real_name");
    openapiFields.add("valid_fans_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnGetAuthorListV2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnGetAuthorListV2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnGetAuthorListV2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnGetAuthorListV2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnGetAuthorListV2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, StarMcnGetAuthorListV2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnGetAuthorListV2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnGetAuthorListV2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnGetAuthorListV2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to StarMcnGetAuthorListV2ResponseDataDataInner
  */
  public static StarMcnGetAuthorListV2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnGetAuthorListV2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of StarMcnGetAuthorListV2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

