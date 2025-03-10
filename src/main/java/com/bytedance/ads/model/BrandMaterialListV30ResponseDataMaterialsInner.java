/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandMaterialListV30DataMaterialsCreativeTemplate;
import com.bytedance.ads.model.BrandMaterialListV30DataMaterialsMaterialStatus;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerCategoryInfo;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponent;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo;
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
 * BrandMaterialListV30ResponseDataMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class BrandMaterialListV30ResponseDataMaterialsInner {
  public static final String SERIALIZED_NAME_CATEGORY_INFO = "category_info";
  @SerializedName(SERIALIZED_NAME_CATEGORY_INFO)
  private BrandMaterialListV30ResponseDataMaterialsInnerCategoryInfo categoryInfo = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CREATIVE_DISPLAY_MODE = "creative_display_mode";
  @SerializedName(SERIALIZED_NAME_CREATIVE_DISPLAY_MODE)
  private String creativeDisplayMode = null;

  public static final String SERIALIZED_NAME_CREATIVE_IS_AIGC = "creative_is_aigc";
  @SerializedName(SERIALIZED_NAME_CREATIVE_IS_AIGC)
  private String creativeIsAigc = null;

  public static final String SERIALIZED_NAME_CREATIVE_TEMPLATE = "creative_template";
  @SerializedName(SERIALIZED_NAME_CREATIVE_TEMPLATE)
  private BrandMaterialListV30DataMaterialsCreativeTemplate creativeTemplate = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private List<String> date = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_MATERIAL_COMPONENT = "material_component";
  @SerializedName(SERIALIZED_NAME_MATERIAL_COMPONENT)
  private BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponent materialComponent = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_NAME = "material_name";
  @SerializedName(SERIALIZED_NAME_MATERIAL_NAME)
  private String materialName = null;

  public static final String SERIALIZED_NAME_MATERIAL_STATUS = "material_status";
  @SerializedName(SERIALIZED_NAME_MATERIAL_STATUS)
  private BrandMaterialListV30DataMaterialsMaterialStatus materialStatus = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_TRACK_URL_INFO = "track_url_info";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_INFO)
  private BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo trackUrlInfo = null;

  public BrandMaterialListV30ResponseDataMaterialsInner() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInner categoryInfo(BrandMaterialListV30ResponseDataMaterialsInnerCategoryInfo categoryInfo) {
    
    this.categoryInfo = categoryInfo;
    return this;
  }

   /**
   * Get categoryInfo
   * @return categoryInfo
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30ResponseDataMaterialsInnerCategoryInfo getCategoryInfo() {
    return categoryInfo;
  }


  public void setCategoryInfo(BrandMaterialListV30ResponseDataMaterialsInnerCategoryInfo categoryInfo) {
    this.categoryInfo = categoryInfo;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner createTime(String createTime) {
    
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


  public BrandMaterialListV30ResponseDataMaterialsInner creativeDisplayMode(String creativeDisplayMode) {
    
    this.creativeDisplayMode = creativeDisplayMode;
    return this;
  }

   /**
   * 
   * @return creativeDisplayMode
  **/
  @javax.annotation.Nullable
  public String getCreativeDisplayMode() {
    return creativeDisplayMode;
  }


  public void setCreativeDisplayMode(String creativeDisplayMode) {
    this.creativeDisplayMode = creativeDisplayMode;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner creativeIsAigc(String creativeIsAigc) {
    
    this.creativeIsAigc = creativeIsAigc;
    return this;
  }

   /**
   * 
   * @return creativeIsAigc
  **/
  @javax.annotation.Nullable
  public String getCreativeIsAigc() {
    return creativeIsAigc;
  }


  public void setCreativeIsAigc(String creativeIsAigc) {
    this.creativeIsAigc = creativeIsAigc;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner creativeTemplate(BrandMaterialListV30DataMaterialsCreativeTemplate creativeTemplate) {
    
    this.creativeTemplate = creativeTemplate;
    return this;
  }

   /**
   * Get creativeTemplate
   * @return creativeTemplate
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30DataMaterialsCreativeTemplate getCreativeTemplate() {
    return creativeTemplate;
  }


  public void setCreativeTemplate(BrandMaterialListV30DataMaterialsCreativeTemplate creativeTemplate) {
    this.creativeTemplate = creativeTemplate;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner date(List<String> date) {
    
    this.date = date;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInner addDateItem(String dateItem) {
    if (this.date == null) {
      this.date = new ArrayList<>();
    }
    this.date.add(dateItem);
    return this;
  }

   /**
   * 投放日期 2023-03-25
   * @return date
  **/
  @javax.annotation.Nullable
  public List<String> getDate() {
    return date;
  }


  public void setDate(List<String> date) {
    this.date = date;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 投放结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner materialComponent(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponent materialComponent) {
    
    this.materialComponent = materialComponent;
    return this;
  }

   /**
   * Get materialComponent
   * @return materialComponent
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponent getMaterialComponent() {
    return materialComponent;
  }


  public void setMaterialComponent(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponent materialComponent) {
    this.materialComponent = materialComponent;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 素材ID
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner materialName(String materialName) {
    
    this.materialName = materialName;
    return this;
  }

   /**
   * 素材名称
   * @return materialName
  **/
  @javax.annotation.Nullable
  public String getMaterialName() {
    return materialName;
  }


  public void setMaterialName(String materialName) {
    this.materialName = materialName;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner materialStatus(BrandMaterialListV30DataMaterialsMaterialStatus materialStatus) {
    
    this.materialStatus = materialStatus;
    return this;
  }

   /**
   * Get materialStatus
   * @return materialStatus
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30DataMaterialsMaterialStatus getMaterialStatus() {
    return materialStatus;
  }


  public void setMaterialStatus(BrandMaterialListV30DataMaterialsMaterialStatus materialStatus) {
    this.materialStatus = materialStatus;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 预订单ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 投放开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public BrandMaterialListV30ResponseDataMaterialsInner trackUrlInfo(BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo trackUrlInfo) {
    
    this.trackUrlInfo = trackUrlInfo;
    return this;
  }

   /**
   * Get trackUrlInfo
   * @return trackUrlInfo
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo getTrackUrlInfo() {
    return trackUrlInfo;
  }


  public void setTrackUrlInfo(BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo trackUrlInfo) {
    this.trackUrlInfo = trackUrlInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialListV30ResponseDataMaterialsInner brandMaterialListV30ResponseDataMaterialsInner = (BrandMaterialListV30ResponseDataMaterialsInner) o;
    return Objects.equals(this.categoryInfo, brandMaterialListV30ResponseDataMaterialsInner.categoryInfo) &&
        Objects.equals(this.createTime, brandMaterialListV30ResponseDataMaterialsInner.createTime) &&
        Objects.equals(this.creativeDisplayMode, brandMaterialListV30ResponseDataMaterialsInner.creativeDisplayMode) &&
        Objects.equals(this.creativeIsAigc, brandMaterialListV30ResponseDataMaterialsInner.creativeIsAigc) &&
        Objects.equals(this.creativeTemplate, brandMaterialListV30ResponseDataMaterialsInner.creativeTemplate) &&
        Objects.equals(this.date, brandMaterialListV30ResponseDataMaterialsInner.date) &&
        Objects.equals(this.endTime, brandMaterialListV30ResponseDataMaterialsInner.endTime) &&
        Objects.equals(this.materialComponent, brandMaterialListV30ResponseDataMaterialsInner.materialComponent) &&
        Objects.equals(this.materialId, brandMaterialListV30ResponseDataMaterialsInner.materialId) &&
        Objects.equals(this.materialName, brandMaterialListV30ResponseDataMaterialsInner.materialName) &&
        Objects.equals(this.materialStatus, brandMaterialListV30ResponseDataMaterialsInner.materialStatus) &&
        Objects.equals(this.orderId, brandMaterialListV30ResponseDataMaterialsInner.orderId) &&
        Objects.equals(this.startTime, brandMaterialListV30ResponseDataMaterialsInner.startTime) &&
        Objects.equals(this.trackUrlInfo, brandMaterialListV30ResponseDataMaterialsInner.trackUrlInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryInfo, createTime, creativeDisplayMode, creativeIsAigc, creativeTemplate, date, endTime, materialComponent, materialId, materialName, materialStatus, orderId, startTime, trackUrlInfo);
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
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInner {\n");
    sb.append("    categoryInfo: ").append(toIndentedString(categoryInfo)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creativeDisplayMode: ").append(toIndentedString(creativeDisplayMode)).append("\n");
    sb.append("    creativeIsAigc: ").append(toIndentedString(creativeIsAigc)).append("\n");
    sb.append("    creativeTemplate: ").append(toIndentedString(creativeTemplate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    materialComponent: ").append(toIndentedString(materialComponent)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialName: ").append(toIndentedString(materialName)).append("\n");
    sb.append("    materialStatus: ").append(toIndentedString(materialStatus)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    trackUrlInfo: ").append(toIndentedString(trackUrlInfo)).append("\n");
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
    openapiFields.add("category_info");
    openapiFields.add("create_time");
    openapiFields.add("creative_display_mode");
    openapiFields.add("creative_is_aigc");
    openapiFields.add("creative_template");
    openapiFields.add("date");
    openapiFields.add("end_time");
    openapiFields.add("material_component");
    openapiFields.add("material_id");
    openapiFields.add("material_name");
    openapiFields.add("material_status");
    openapiFields.add("order_id");
    openapiFields.add("start_time");
    openapiFields.add("track_url_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInner>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInner
  */
  public static BrandMaterialListV30ResponseDataMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInner.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

