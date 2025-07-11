/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
 * QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner {
  public static final String SERIALIZED_NAME_ATTACH_ID = "attach_id";
  @SerializedName(SERIALIZED_NAME_ATTACH_ID)
  private Long attachId = null;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName = null;

  public QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner() {
  }

  public QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner attachId(Long attachId) {
    
    this.attachId = attachId;
    return this;
  }

   /**
   * 附件id
   * @return attachId
  **/
  @javax.annotation.Nullable
  public Long getAttachId() {
    return attachId;
  }


  public void setAttachId(Long attachId) {
    this.attachId = attachId;
  }


  public QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 文件名称
   * @return fileName
  **/
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner queryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner = (QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner) o;
    return Objects.equals(this.attachId, queryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner.attachId) &&
        Objects.equals(this.fileName, queryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner.fileName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachId, fileName);
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
    sb.append("class QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner {\n");
    sb.append("    attachId: ").append(toIndentedString(attachId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
    openapiFields.add("attach_id");
    openapiFields.add("file_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner>() {
           @Override
           public void write(JsonWriter out, QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner
  * @throws IOException if the JSON string is invalid with respect to QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner
  */
  public static QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner.class);
  }

 /**
  * Convert an instance of QueryStatementV2ResponseDataProjectRefStatementListInnerAttachListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

