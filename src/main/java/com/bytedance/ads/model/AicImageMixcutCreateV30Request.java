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
import com.bytedance.ads.model.AicImageMixcutCreateV30AccountType;
import com.bytedance.ads.model.AicImageMixcutCreateV30RequestAudioOption;
import com.bytedance.ads.model.AicImageMixcutCreateV30RequestGenElement;
import com.bytedance.ads.model.AicImageMixcutCreateV30RequestProductInfo;
import com.bytedance.ads.model.AicImageMixcutCreateV30RequestRenderOption;
import com.bytedance.ads.model.AicImageMixcutCreateV30RequestSubtitleStyle;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AicImageMixcutCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class AicImageMixcutCreateV30Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AicImageMixcutCreateV30AccountType accountType = null;

  public static final String SERIALIZED_NAME_AUDIO_OPTION = "audio_option";
  @SerializedName(SERIALIZED_NAME_AUDIO_OPTION)
  private AicImageMixcutCreateV30RequestAudioOption audioOption = null;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count = null;

  public static final String SERIALIZED_NAME_GEN_ELEMENT = "gen_element";
  @SerializedName(SERIALIZED_NAME_GEN_ELEMENT)
  private AicImageMixcutCreateV30RequestGenElement genElement = null;

  public static final String SERIALIZED_NAME_IMAGE_ELEMENT_IDS = "image_element_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_ELEMENT_IDS)
  private List<Long> imageElementIds = null;

  public static final String SERIALIZED_NAME_IS_AUTO_SAVE_ALL_RESULT = "is_auto_save_all_result";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_SAVE_ALL_RESULT)
  private Boolean isAutoSaveAllResult = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "product_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private AicImageMixcutCreateV30RequestProductInfo productInfo = null;

  public static final String SERIALIZED_NAME_RENDER_OPTION = "render_option";
  @SerializedName(SERIALIZED_NAME_RENDER_OPTION)
  private AicImageMixcutCreateV30RequestRenderOption renderOption = null;

  public static final String SERIALIZED_NAME_SUBTITLE_STYLE = "subtitle_style";
  @SerializedName(SERIALIZED_NAME_SUBTITLE_STYLE)
  private AicImageMixcutCreateV30RequestSubtitleStyle subtitleStyle = null;

  public static final String SERIALIZED_NAME_TASK_NAME = "task_name";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName = null;

  public AicImageMixcutCreateV30Request() {
  }

  public AicImageMixcutCreateV30Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * BP账户体系:组织id，Agent账户体系:代理商id
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AicImageMixcutCreateV30Request accountType(AicImageMixcutCreateV30AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public AicImageMixcutCreateV30AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(AicImageMixcutCreateV30AccountType accountType) {
    this.accountType = accountType;
  }


  public AicImageMixcutCreateV30Request audioOption(AicImageMixcutCreateV30RequestAudioOption audioOption) {
    
    this.audioOption = audioOption;
    return this;
  }

   /**
   * Get audioOption
   * @return audioOption
  **/
  @javax.annotation.Nullable
  public AicImageMixcutCreateV30RequestAudioOption getAudioOption() {
    return audioOption;
  }


  public void setAudioOption(AicImageMixcutCreateV30RequestAudioOption audioOption) {
    this.audioOption = audioOption;
  }


  public AicImageMixcutCreateV30Request count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * 生成成片的数量，最大值5
   * minimum: 1
   * maximum: 5
   * @return count
  **/
  @javax.annotation.Nullable
  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public AicImageMixcutCreateV30Request genElement(AicImageMixcutCreateV30RequestGenElement genElement) {
    
    this.genElement = genElement;
    return this;
  }

   /**
   * Get genElement
   * @return genElement
  **/
  @javax.annotation.Nullable
  public AicImageMixcutCreateV30RequestGenElement getGenElement() {
    return genElement;
  }


  public void setGenElement(AicImageMixcutCreateV30RequestGenElement genElement) {
    this.genElement = genElement;
  }


  public AicImageMixcutCreateV30Request imageElementIds(List<Long> imageElementIds) {
    
    this.imageElementIds = imageElementIds;
    return this;
  }

  public AicImageMixcutCreateV30Request addImageElementIdsItem(Long imageElementIdsItem) {
    if (this.imageElementIds == null) {
      this.imageElementIds = new ArrayList<>();
    }
    this.imageElementIds.add(imageElementIdsItem);
    return this;
  }

   /**
   * 图片元素id，用于视频生成，最多20个
   * @return imageElementIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getImageElementIds() {
    return imageElementIds;
  }


  public void setImageElementIds(List<Long> imageElementIds) {
    this.imageElementIds = imageElementIds;
  }


  public AicImageMixcutCreateV30Request isAutoSaveAllResult(Boolean isAutoSaveAllResult) {
    
    this.isAutoSaveAllResult = isAutoSaveAllResult;
    return this;
  }

   /**
   * 是否由自动保存所有生成结果 - true：在视频生成完成后，系统将自动保存所有结果至即创素材库；所属组织/代理下，均可见视频结果 - false：不会自动保存，后续需调用「保存任务生成的素材」保存生成结果
   * @return isAutoSaveAllResult
  **/
  @javax.annotation.Nullable
  public Boolean getIsAutoSaveAllResult() {
    return isAutoSaveAllResult;
  }


  public void setIsAutoSaveAllResult(Boolean isAutoSaveAllResult) {
    this.isAutoSaveAllResult = isAutoSaveAllResult;
  }


  public AicImageMixcutCreateV30Request productInfo(AicImageMixcutCreateV30RequestProductInfo productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

   /**
   * Get productInfo
   * @return productInfo
  **/
  @javax.annotation.Nullable
  public AicImageMixcutCreateV30RequestProductInfo getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(AicImageMixcutCreateV30RequestProductInfo productInfo) {
    this.productInfo = productInfo;
  }


  public AicImageMixcutCreateV30Request renderOption(AicImageMixcutCreateV30RequestRenderOption renderOption) {
    
    this.renderOption = renderOption;
    return this;
  }

   /**
   * Get renderOption
   * @return renderOption
  **/
  @javax.annotation.Nullable
  public AicImageMixcutCreateV30RequestRenderOption getRenderOption() {
    return renderOption;
  }


  public void setRenderOption(AicImageMixcutCreateV30RequestRenderOption renderOption) {
    this.renderOption = renderOption;
  }


  public AicImageMixcutCreateV30Request subtitleStyle(AicImageMixcutCreateV30RequestSubtitleStyle subtitleStyle) {
    
    this.subtitleStyle = subtitleStyle;
    return this;
  }

   /**
   * Get subtitleStyle
   * @return subtitleStyle
  **/
  @javax.annotation.Nullable
  public AicImageMixcutCreateV30RequestSubtitleStyle getSubtitleStyle() {
    return subtitleStyle;
  }


  public void setSubtitleStyle(AicImageMixcutCreateV30RequestSubtitleStyle subtitleStyle) {
    this.subtitleStyle = subtitleStyle;
  }


  public AicImageMixcutCreateV30Request taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * 可自定义任务名称，生成的成片均以此名称命名，最多50字，多个视频命名规则为任务名称_1-n。不传入，默认使用product_name+时间戳命名 示例:洗衣凝珠_20240809_152301
   * @return taskName
  **/
  @javax.annotation.Nullable
  public String getTaskName() {
    return taskName;
  }


  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicImageMixcutCreateV30Request aicImageMixcutCreateV30Request = (AicImageMixcutCreateV30Request) o;
    return Objects.equals(this.accountId, aicImageMixcutCreateV30Request.accountId) &&
        Objects.equals(this.accountType, aicImageMixcutCreateV30Request.accountType) &&
        Objects.equals(this.audioOption, aicImageMixcutCreateV30Request.audioOption) &&
        Objects.equals(this.count, aicImageMixcutCreateV30Request.count) &&
        Objects.equals(this.genElement, aicImageMixcutCreateV30Request.genElement) &&
        Objects.equals(this.imageElementIds, aicImageMixcutCreateV30Request.imageElementIds) &&
        Objects.equals(this.isAutoSaveAllResult, aicImageMixcutCreateV30Request.isAutoSaveAllResult) &&
        Objects.equals(this.productInfo, aicImageMixcutCreateV30Request.productInfo) &&
        Objects.equals(this.renderOption, aicImageMixcutCreateV30Request.renderOption) &&
        Objects.equals(this.subtitleStyle, aicImageMixcutCreateV30Request.subtitleStyle) &&
        Objects.equals(this.taskName, aicImageMixcutCreateV30Request.taskName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, audioOption, count, genElement, imageElementIds, isAutoSaveAllResult, productInfo, renderOption, subtitleStyle, taskName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicImageMixcutCreateV30Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    audioOption: ").append(toIndentedString(audioOption)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    genElement: ").append(toIndentedString(genElement)).append("\n");
    sb.append("    imageElementIds: ").append(toIndentedString(imageElementIds)).append("\n");
    sb.append("    isAutoSaveAllResult: ").append(toIndentedString(isAutoSaveAllResult)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    renderOption: ").append(toIndentedString(renderOption)).append("\n");
    sb.append("    subtitleStyle: ").append(toIndentedString(subtitleStyle)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");
    openapiFields.add("audio_option");
    openapiFields.add("count");
    openapiFields.add("gen_element");
    openapiFields.add("image_element_ids");
    openapiFields.add("is_auto_save_all_result");
    openapiFields.add("product_info");
    openapiFields.add("render_option");
    openapiFields.add("subtitle_style");
    openapiFields.add("task_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("image_element_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicImageMixcutCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicImageMixcutCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicImageMixcutCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicImageMixcutCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AicImageMixcutCreateV30Request>() {
           @Override
           public void write(JsonWriter out, AicImageMixcutCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicImageMixcutCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicImageMixcutCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicImageMixcutCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to AicImageMixcutCreateV30Request
  */
  public static AicImageMixcutCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicImageMixcutCreateV30Request.class);
  }

 /**
  * Convert an instance of AicImageMixcutCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

