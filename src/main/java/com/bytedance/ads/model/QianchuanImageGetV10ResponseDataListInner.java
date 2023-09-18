/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanImageGetV10DataListImageMode;
import com.bytedance.ads.model.QianchuanImageGetV10DataListSource;
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
 * QianchuanImageGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-18T11:13:59.161423804+08:00[Asia/Shanghai]")
public class QianchuanImageGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanImageGetV10DataListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_IS_AI_CREATE = "is_ai_create";
  @SerializedName(SERIALIZED_NAME_IS_AI_CREATE)
  private Boolean isAiCreate = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private QianchuanImageGetV10DataListSource source = null;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private List<String> tag = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public QianchuanImageGetV10ResponseDataListInner() {
  }

  public QianchuanImageGetV10ResponseDataListInner createTime(String createTime) {
    
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


  public QianchuanImageGetV10ResponseDataListInner filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * 
   * @return filename
  **/
  @javax.annotation.Nullable
  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public QianchuanImageGetV10ResponseDataListInner height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public QianchuanImageGetV10ResponseDataListInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public QianchuanImageGetV10ResponseDataListInner imageMode(QianchuanImageGetV10DataListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanImageGetV10DataListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanImageGetV10DataListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanImageGetV10ResponseDataListInner isAiCreate(Boolean isAiCreate) {
    
    this.isAiCreate = isAiCreate;
    return this;
  }

   /**
   * 
   * @return isAiCreate
  **/
  @javax.annotation.Nullable
  public Boolean getIsAiCreate() {
    return isAiCreate;
  }


  public void setIsAiCreate(Boolean isAiCreate) {
    this.isAiCreate = isAiCreate;
  }


  public QianchuanImageGetV10ResponseDataListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public QianchuanImageGetV10ResponseDataListInner signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * 
   * @return signature
  **/
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public QianchuanImageGetV10ResponseDataListInner size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * 
   * @return size
  **/
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public QianchuanImageGetV10ResponseDataListInner source(QianchuanImageGetV10DataListSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public QianchuanImageGetV10DataListSource getSource() {
    return source;
  }


  public void setSource(QianchuanImageGetV10DataListSource source) {
    this.source = source;
  }


  public QianchuanImageGetV10ResponseDataListInner tag(List<String> tag) {
    
    this.tag = tag;
    return this;
  }

  public QianchuanImageGetV10ResponseDataListInner addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * 
   * @return tag
  **/
  @javax.annotation.Nullable
  public List<String> getTag() {
    return tag;
  }


  public void setTag(List<String> tag) {
    this.tag = tag;
  }


  public QianchuanImageGetV10ResponseDataListInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public QianchuanImageGetV10ResponseDataListInner width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 
   * @return width
  **/
  @javax.annotation.Nullable
  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanImageGetV10ResponseDataListInner qianchuanImageGetV10ResponseDataListInner = (QianchuanImageGetV10ResponseDataListInner) o;
    return Objects.equals(this.createTime, qianchuanImageGetV10ResponseDataListInner.createTime) &&
        Objects.equals(this.filename, qianchuanImageGetV10ResponseDataListInner.filename) &&
        Objects.equals(this.height, qianchuanImageGetV10ResponseDataListInner.height) &&
        Objects.equals(this.id, qianchuanImageGetV10ResponseDataListInner.id) &&
        Objects.equals(this.imageMode, qianchuanImageGetV10ResponseDataListInner.imageMode) &&
        Objects.equals(this.isAiCreate, qianchuanImageGetV10ResponseDataListInner.isAiCreate) &&
        Objects.equals(this.materialId, qianchuanImageGetV10ResponseDataListInner.materialId) &&
        Objects.equals(this.signature, qianchuanImageGetV10ResponseDataListInner.signature) &&
        Objects.equals(this.size, qianchuanImageGetV10ResponseDataListInner.size) &&
        Objects.equals(this.source, qianchuanImageGetV10ResponseDataListInner.source) &&
        Objects.equals(this.tag, qianchuanImageGetV10ResponseDataListInner.tag) &&
        Objects.equals(this.url, qianchuanImageGetV10ResponseDataListInner.url) &&
        Objects.equals(this.width, qianchuanImageGetV10ResponseDataListInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, filename, height, id, imageMode, isAiCreate, materialId, signature, size, source, tag, url, width);
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
    sb.append("class QianchuanImageGetV10ResponseDataListInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    isAiCreate: ").append(toIndentedString(isAiCreate)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("filename");
    openapiFields.add("height");
    openapiFields.add("id");
    openapiFields.add("image_mode");
    openapiFields.add("is_ai_create");
    openapiFields.add("material_id");
    openapiFields.add("signature");
    openapiFields.add("size");
    openapiFields.add("source");
    openapiFields.add("tag");
    openapiFields.add("url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanImageGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanImageGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanImageGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanImageGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanImageGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanImageGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanImageGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanImageGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanImageGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanImageGetV10ResponseDataListInner
  */
  public static QianchuanImageGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanImageGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanImageGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
