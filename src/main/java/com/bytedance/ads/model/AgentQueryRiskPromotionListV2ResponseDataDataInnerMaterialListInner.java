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
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2DataDataMaterialListType;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner;
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
 * AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_REF_PROMOTION_IDS = "ref_promotion_ids";
  @SerializedName(SERIALIZED_NAME_REF_PROMOTION_IDS)
  private List<Long> refPromotionIds = null;

  public static final String SERIALIZED_NAME_REF_PROMOTION_LIST = "ref_promotion_list";
  @SerializedName(SERIALIZED_NAME_REF_PROMOTION_LIST)
  private List<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner> refPromotionList = null;

  public static final String SERIALIZED_NAME_RISK_CONTENT = "risk_content";
  @SerializedName(SERIALIZED_NAME_RISK_CONTENT)
  private List<String> riskContent = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AgentQueryRiskPromotionListV2DataDataMaterialListType type = null;

  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner() {
  }

  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 素材ID（落地页站点ID）
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner refPromotionIds(List<Long> refPromotionIds) {
    
    this.refPromotionIds = refPromotionIds;
    return this;
  }

  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner addRefPromotionIdsItem(Long refPromotionIdsItem) {
    if (this.refPromotionIds == null) {
      this.refPromotionIds = new ArrayList<>();
    }
    this.refPromotionIds.add(refPromotionIdsItem);
    return this;
  }

   /**
   * 同代理商账户下的其他关联广告ID（废弃，使用ref_promotion_list字段替代）
   * @return refPromotionIds
  **/
  @javax.annotation.Nullable
  public List<Long> getRefPromotionIds() {
    return refPromotionIds;
  }


  public void setRefPromotionIds(List<Long> refPromotionIds) {
    this.refPromotionIds = refPromotionIds;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner refPromotionList(List<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner> refPromotionList) {
    
    this.refPromotionList = refPromotionList;
    return this;
  }

  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner addRefPromotionListItem(AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner refPromotionListItem) {
    if (this.refPromotionList == null) {
      this.refPromotionList = new ArrayList<>();
    }
    this.refPromotionList.add(refPromotionListItem);
    return this;
  }

   /**
   * 同代理商账户下的其他关联广告信息
   * @return refPromotionList
  **/
  @javax.annotation.Nullable
  public List<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner> getRefPromotionList() {
    return refPromotionList;
  }


  public void setRefPromotionList(List<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInnerRefPromotionListInner> refPromotionList) {
    this.refPromotionList = refPromotionList;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner riskContent(List<String> riskContent) {
    
    this.riskContent = riskContent;
    return this;
  }

  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner addRiskContentItem(String riskContentItem) {
    if (this.riskContent == null) {
      this.riskContent = new ArrayList<>();
    }
    this.riskContent.add(riskContentItem);
    return this;
  }

   /**
   * 素材违规原因，比如：[\&quot;违规内容1\&quot;, \&quot;违规内容2\&quot;]
   * @return riskContent
  **/
  @javax.annotation.Nullable
  public List<String> getRiskContent() {
    return riskContent;
  }


  public void setRiskContent(List<String> riskContent) {
    this.riskContent = riskContent;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner type(AgentQueryRiskPromotionListV2DataDataMaterialListType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public AgentQueryRiskPromotionListV2DataDataMaterialListType getType() {
    return type;
  }


  public void setType(AgentQueryRiskPromotionListV2DataDataMaterialListType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner agentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner = (AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner) o;
    return Objects.equals(this.id, agentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner.id) &&
        Objects.equals(this.refPromotionIds, agentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner.refPromotionIds) &&
        Objects.equals(this.refPromotionList, agentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner.refPromotionList) &&
        Objects.equals(this.riskContent, agentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner.riskContent) &&
        Objects.equals(this.type, agentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, refPromotionIds, refPromotionList, riskContent, type);
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
    sb.append("class AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    refPromotionIds: ").append(toIndentedString(refPromotionIds)).append("\n");
    sb.append("    refPromotionList: ").append(toIndentedString(refPromotionList)).append("\n");
    sb.append("    riskContent: ").append(toIndentedString(riskContent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("ref_promotion_ids");
    openapiFields.add("ref_promotion_list");
    openapiFields.add("risk_content");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner>() {
           @Override
           public void write(JsonWriter out, AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner
  */
  public static AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner.class);
  }

 /**
  * Convert an instance of AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

