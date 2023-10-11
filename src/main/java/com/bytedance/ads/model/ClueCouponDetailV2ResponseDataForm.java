/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueCouponDetailV2DataFormEnableLayer;
import com.bytedance.ads.model.ClueCouponDetailV2DataFormFormType;
import com.bytedance.ads.model.ClueCouponDetailV2DataFormValidateType;
import com.bytedance.ads.model.ClueCouponDetailV2ResponseDataFormElementsInner;
import com.bytedance.ads.model.ClueCouponDetailV2ResponseDataFormExtendInfo;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-11T18:54:06.224549627+08:00[PRC]")
public class ClueCouponDetailV2ResponseDataForm {
  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<ClueCouponDetailV2ResponseDataFormElementsInner> elements = null;

  public static final String SERIALIZED_NAME_ENABLE_LAYER = "enable_layer";
  @SerializedName(SERIALIZED_NAME_ENABLE_LAYER)
  private ClueCouponDetailV2DataFormEnableLayer enableLayer = null;

  public static final String SERIALIZED_NAME_EXTEND_INFO = "extend_info";
  @SerializedName(SERIALIZED_NAME_EXTEND_INFO)
  private ClueCouponDetailV2ResponseDataFormExtendInfo extendInfo = null;

  public static final String SERIALIZED_NAME_FORM_TYPE = "form_type";
  @SerializedName(SERIALIZED_NAME_FORM_TYPE)
  private ClueCouponDetailV2DataFormFormType formType = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_LAYER_SUBMIT_TEXT = "layer_submit_text";
  @SerializedName(SERIALIZED_NAME_LAYER_SUBMIT_TEXT)
  private String layerSubmitText = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SUBMIT_TEXT = "submit_text";
  @SerializedName(SERIALIZED_NAME_SUBMIT_TEXT)
  private String submitText = null;

  public static final String SERIALIZED_NAME_VALIDATE_TYPE = "validate_type";
  @SerializedName(SERIALIZED_NAME_VALIDATE_TYPE)
  private ClueCouponDetailV2DataFormValidateType validateType = null;

  public ClueCouponDetailV2ResponseDataForm() {
  }

  public ClueCouponDetailV2ResponseDataForm elements(List<ClueCouponDetailV2ResponseDataFormElementsInner> elements) {
    
    this.elements = elements;
    return this;
  }

  public ClueCouponDetailV2ResponseDataForm addElementsItem(ClueCouponDetailV2ResponseDataFormElementsInner elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * 
   * @return elements
  **/
  @javax.annotation.Nullable
  public List<ClueCouponDetailV2ResponseDataFormElementsInner> getElements() {
    return elements;
  }


  public void setElements(List<ClueCouponDetailV2ResponseDataFormElementsInner> elements) {
    this.elements = elements;
  }


  public ClueCouponDetailV2ResponseDataForm enableLayer(ClueCouponDetailV2DataFormEnableLayer enableLayer) {
    
    this.enableLayer = enableLayer;
    return this;
  }

   /**
   * Get enableLayer
   * @return enableLayer
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataFormEnableLayer getEnableLayer() {
    return enableLayer;
  }


  public void setEnableLayer(ClueCouponDetailV2DataFormEnableLayer enableLayer) {
    this.enableLayer = enableLayer;
  }


  public ClueCouponDetailV2ResponseDataForm extendInfo(ClueCouponDetailV2ResponseDataFormExtendInfo extendInfo) {
    
    this.extendInfo = extendInfo;
    return this;
  }

   /**
   * Get extendInfo
   * @return extendInfo
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2ResponseDataFormExtendInfo getExtendInfo() {
    return extendInfo;
  }


  public void setExtendInfo(ClueCouponDetailV2ResponseDataFormExtendInfo extendInfo) {
    this.extendInfo = extendInfo;
  }


  public ClueCouponDetailV2ResponseDataForm formType(ClueCouponDetailV2DataFormFormType formType) {
    
    this.formType = formType;
    return this;
  }

   /**
   * Get formType
   * @return formType
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataFormFormType getFormType() {
    return formType;
  }


  public void setFormType(ClueCouponDetailV2DataFormFormType formType) {
    this.formType = formType;
  }


  public ClueCouponDetailV2ResponseDataForm instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ClueCouponDetailV2ResponseDataForm layerSubmitText(String layerSubmitText) {
    
    this.layerSubmitText = layerSubmitText;
    return this;
  }

   /**
   * 
   * @return layerSubmitText
  **/
  @javax.annotation.Nullable
  public String getLayerSubmitText() {
    return layerSubmitText;
  }


  public void setLayerSubmitText(String layerSubmitText) {
    this.layerSubmitText = layerSubmitText;
  }


  public ClueCouponDetailV2ResponseDataForm name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ClueCouponDetailV2ResponseDataForm submitText(String submitText) {
    
    this.submitText = submitText;
    return this;
  }

   /**
   * 
   * @return submitText
  **/
  @javax.annotation.Nullable
  public String getSubmitText() {
    return submitText;
  }


  public void setSubmitText(String submitText) {
    this.submitText = submitText;
  }


  public ClueCouponDetailV2ResponseDataForm validateType(ClueCouponDetailV2DataFormValidateType validateType) {
    
    this.validateType = validateType;
    return this;
  }

   /**
   * Get validateType
   * @return validateType
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataFormValidateType getValidateType() {
    return validateType;
  }


  public void setValidateType(ClueCouponDetailV2DataFormValidateType validateType) {
    this.validateType = validateType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponDetailV2ResponseDataForm clueCouponDetailV2ResponseDataForm = (ClueCouponDetailV2ResponseDataForm) o;
    return Objects.equals(this.elements, clueCouponDetailV2ResponseDataForm.elements) &&
        Objects.equals(this.enableLayer, clueCouponDetailV2ResponseDataForm.enableLayer) &&
        Objects.equals(this.extendInfo, clueCouponDetailV2ResponseDataForm.extendInfo) &&
        Objects.equals(this.formType, clueCouponDetailV2ResponseDataForm.formType) &&
        Objects.equals(this.instanceId, clueCouponDetailV2ResponseDataForm.instanceId) &&
        Objects.equals(this.layerSubmitText, clueCouponDetailV2ResponseDataForm.layerSubmitText) &&
        Objects.equals(this.name, clueCouponDetailV2ResponseDataForm.name) &&
        Objects.equals(this.submitText, clueCouponDetailV2ResponseDataForm.submitText) &&
        Objects.equals(this.validateType, clueCouponDetailV2ResponseDataForm.validateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, enableLayer, extendInfo, formType, instanceId, layerSubmitText, name, submitText, validateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponDetailV2ResponseDataForm {\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    enableLayer: ").append(toIndentedString(enableLayer)).append("\n");
    sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
    sb.append("    formType: ").append(toIndentedString(formType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    layerSubmitText: ").append(toIndentedString(layerSubmitText)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    submitText: ").append(toIndentedString(submitText)).append("\n");
    sb.append("    validateType: ").append(toIndentedString(validateType)).append("\n");
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
    openapiFields.add("elements");
    openapiFields.add("enable_layer");
    openapiFields.add("extend_info");
    openapiFields.add("form_type");
    openapiFields.add("instance_id");
    openapiFields.add("layer_submit_text");
    openapiFields.add("name");
    openapiFields.add("submit_text");
    openapiFields.add("validate_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponDetailV2ResponseDataForm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponDetailV2ResponseDataForm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponDetailV2ResponseDataForm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponDetailV2ResponseDataForm.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponDetailV2ResponseDataForm>() {
           @Override
           public void write(JsonWriter out, ClueCouponDetailV2ResponseDataForm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponDetailV2ResponseDataForm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponDetailV2ResponseDataForm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponDetailV2ResponseDataForm
  * @throws IOException if the JSON string is invalid with respect to ClueCouponDetailV2ResponseDataForm
  */
  public static ClueCouponDetailV2ResponseDataForm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponDetailV2ResponseDataForm.class);
  }

 /**
  * Convert an instance of ClueCouponDetailV2ResponseDataForm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

