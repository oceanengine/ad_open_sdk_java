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
import com.bytedance.ads.model.StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner;
import com.bytedance.ads.model.StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner;
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
 * StarOrderGetComponentV2ResponseDataOrderComponentListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class StarOrderGetComponentV2ResponseDataOrderComponentListInner {
  public static final String SERIALIZED_NAME_COCREATE_DOUYIN_ID = "cocreate_douyin_id";
  @SerializedName(SERIALIZED_NAME_COCREATE_DOUYIN_ID)
  private String cocreateDouyinId = null;

  public static final String SERIALIZED_NAME_ECOM_INFO = "ecom_info";
  @SerializedName(SERIALIZED_NAME_ECOM_INFO)
  private List<StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner> ecomInfo = null;

  public static final String SERIALIZED_NAME_INDUSTRY_COMPONENT_ID = "industry_component_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_COMPONENT_ID)
  private Long industryComponentId = null;

  public static final String SERIALIZED_NAME_LINK_COMPONENT_LIST = "link_component_list";
  @SerializedName(SERIALIZED_NAME_LINK_COMPONENT_LIST)
  private List<StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner> linkComponentList = null;

  public static final String SERIALIZED_NAME_LIVE_ATTRACT_COMPONENT_ID = "live_attract_component_id";
  @SerializedName(SERIALIZED_NAME_LIVE_ATTRACT_COMPONENT_ID)
  private Long liveAttractComponentId = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_SEARCH_WORD = "search_word";
  @SerializedName(SERIALIZED_NAME_SEARCH_WORD)
  private String searchWord = null;

  public StarOrderGetComponentV2ResponseDataOrderComponentListInner() {
  }

  public StarOrderGetComponentV2ResponseDataOrderComponentListInner cocreateDouyinId(String cocreateDouyinId) {
    
    this.cocreateDouyinId = cocreateDouyinId;
    return this;
  }

   /**
   * 
   * @return cocreateDouyinId
  **/
  @javax.annotation.Nullable
  public String getCocreateDouyinId() {
    return cocreateDouyinId;
  }


  public void setCocreateDouyinId(String cocreateDouyinId) {
    this.cocreateDouyinId = cocreateDouyinId;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInner ecomInfo(List<StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner> ecomInfo) {
    
    this.ecomInfo = ecomInfo;
    return this;
  }

  public StarOrderGetComponentV2ResponseDataOrderComponentListInner addEcomInfoItem(StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner ecomInfoItem) {
    if (this.ecomInfo == null) {
      this.ecomInfo = new ArrayList<>();
    }
    this.ecomInfo.add(ecomInfoItem);
    return this;
  }

   /**
   * 
   * @return ecomInfo
  **/
  @javax.annotation.Nullable
  public List<StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner> getEcomInfo() {
    return ecomInfo;
  }


  public void setEcomInfo(List<StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner> ecomInfo) {
    this.ecomInfo = ecomInfo;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInner industryComponentId(Long industryComponentId) {
    
    this.industryComponentId = industryComponentId;
    return this;
  }

   /**
   * 
   * @return industryComponentId
  **/
  @javax.annotation.Nullable
  public Long getIndustryComponentId() {
    return industryComponentId;
  }


  public void setIndustryComponentId(Long industryComponentId) {
    this.industryComponentId = industryComponentId;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInner linkComponentList(List<StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner> linkComponentList) {
    
    this.linkComponentList = linkComponentList;
    return this;
  }

  public StarOrderGetComponentV2ResponseDataOrderComponentListInner addLinkComponentListItem(StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner linkComponentListItem) {
    if (this.linkComponentList == null) {
      this.linkComponentList = new ArrayList<>();
    }
    this.linkComponentList.add(linkComponentListItem);
    return this;
  }

   /**
   * 常规组件信息
   * @return linkComponentList
  **/
  @javax.annotation.Nullable
  public List<StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner> getLinkComponentList() {
    return linkComponentList;
  }


  public void setLinkComponentList(List<StarOrderGetComponentV2ResponseDataOrderComponentListInnerLinkComponentListInner> linkComponentList) {
    this.linkComponentList = linkComponentList;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInner liveAttractComponentId(Long liveAttractComponentId) {
    
    this.liveAttractComponentId = liveAttractComponentId;
    return this;
  }

   /**
   * 
   * @return liveAttractComponentId
  **/
  @javax.annotation.Nullable
  public Long getLiveAttractComponentId() {
    return liveAttractComponentId;
  }


  public void setLiveAttractComponentId(Long liveAttractComponentId) {
    this.liveAttractComponentId = liveAttractComponentId;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 任务ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInner searchWord(String searchWord) {
    
    this.searchWord = searchWord;
    return this;
  }

   /**
   * 
   * @return searchWord
  **/
  @javax.annotation.Nullable
  public String getSearchWord() {
    return searchWord;
  }


  public void setSearchWord(String searchWord) {
    this.searchWord = searchWord;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetComponentV2ResponseDataOrderComponentListInner starOrderGetComponentV2ResponseDataOrderComponentListInner = (StarOrderGetComponentV2ResponseDataOrderComponentListInner) o;
    return Objects.equals(this.cocreateDouyinId, starOrderGetComponentV2ResponseDataOrderComponentListInner.cocreateDouyinId) &&
        Objects.equals(this.ecomInfo, starOrderGetComponentV2ResponseDataOrderComponentListInner.ecomInfo) &&
        Objects.equals(this.industryComponentId, starOrderGetComponentV2ResponseDataOrderComponentListInner.industryComponentId) &&
        Objects.equals(this.linkComponentList, starOrderGetComponentV2ResponseDataOrderComponentListInner.linkComponentList) &&
        Objects.equals(this.liveAttractComponentId, starOrderGetComponentV2ResponseDataOrderComponentListInner.liveAttractComponentId) &&
        Objects.equals(this.orderId, starOrderGetComponentV2ResponseDataOrderComponentListInner.orderId) &&
        Objects.equals(this.searchWord, starOrderGetComponentV2ResponseDataOrderComponentListInner.searchWord);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cocreateDouyinId, ecomInfo, industryComponentId, linkComponentList, liveAttractComponentId, orderId, searchWord);
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
    sb.append("class StarOrderGetComponentV2ResponseDataOrderComponentListInner {\n");
    sb.append("    cocreateDouyinId: ").append(toIndentedString(cocreateDouyinId)).append("\n");
    sb.append("    ecomInfo: ").append(toIndentedString(ecomInfo)).append("\n");
    sb.append("    industryComponentId: ").append(toIndentedString(industryComponentId)).append("\n");
    sb.append("    linkComponentList: ").append(toIndentedString(linkComponentList)).append("\n");
    sb.append("    liveAttractComponentId: ").append(toIndentedString(liveAttractComponentId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    searchWord: ").append(toIndentedString(searchWord)).append("\n");
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
    openapiFields.add("cocreate_douyin_id");
    openapiFields.add("ecom_info");
    openapiFields.add("industry_component_id");
    openapiFields.add("link_component_list");
    openapiFields.add("live_attract_component_id");
    openapiFields.add("order_id");
    openapiFields.add("search_word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetComponentV2ResponseDataOrderComponentListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetComponentV2ResponseDataOrderComponentListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetComponentV2ResponseDataOrderComponentListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetComponentV2ResponseDataOrderComponentListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetComponentV2ResponseDataOrderComponentListInner>() {
           @Override
           public void write(JsonWriter out, StarOrderGetComponentV2ResponseDataOrderComponentListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetComponentV2ResponseDataOrderComponentListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetComponentV2ResponseDataOrderComponentListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetComponentV2ResponseDataOrderComponentListInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetComponentV2ResponseDataOrderComponentListInner
  */
  public static StarOrderGetComponentV2ResponseDataOrderComponentListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetComponentV2ResponseDataOrderComponentListInner.class);
  }

 /**
  * Convert an instance of StarOrderGetComponentV2ResponseDataOrderComponentListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

