/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfoEcomCartInner;
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
 * 组件信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo {
  public static final String SERIALIZED_NAME_COCREATE_DOUYIN_ID = "cocreate_douyin_id";
  @SerializedName(SERIALIZED_NAME_COCREATE_DOUYIN_ID)
  private String cocreateDouyinId = null;

  public static final String SERIALIZED_NAME_ECOM_CART = "ecom_cart";
  @SerializedName(SERIALIZED_NAME_ECOM_CART)
  private List<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfoEcomCartInner> ecomCart = null;

  public static final String SERIALIZED_NAME_INDUSTRY_COMPONENT_ID = "industry_component_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_COMPONENT_ID)
  private Long industryComponentId = null;

  public static final String SERIALIZED_NAME_LINK_COMPONENT_IDS = "link_component_ids";
  @SerializedName(SERIALIZED_NAME_LINK_COMPONENT_IDS)
  private List<Long> linkComponentIds = null;

  public static final String SERIALIZED_NAME_LIVE_ATTRACT_COMPONENT_ID = "live_attract_component_id";
  @SerializedName(SERIALIZED_NAME_LIVE_ATTRACT_COMPONENT_ID)
  private Long liveAttractComponentId = null;

  public static final String SERIALIZED_NAME_SEARCH_WORD = "search_word";
  @SerializedName(SERIALIZED_NAME_SEARCH_WORD)
  private String searchWord = null;

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo() {
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo cocreateDouyinId(String cocreateDouyinId) {
    
    this.cocreateDouyinId = cocreateDouyinId;
    return this;
  }

   /**
   * 共创品牌官方号（抖音号）
   * @return cocreateDouyinId
  **/
  @javax.annotation.Nullable
  public String getCocreateDouyinId() {
    return cocreateDouyinId;
  }


  public void setCocreateDouyinId(String cocreateDouyinId) {
    this.cocreateDouyinId = cocreateDouyinId;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo ecomCart(List<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfoEcomCartInner> ecomCart) {
    
    this.ecomCart = ecomCart;
    return this;
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo addEcomCartItem(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfoEcomCartInner ecomCartItem) {
    if (this.ecomCart == null) {
      this.ecomCart = new ArrayList<>();
    }
    this.ecomCart.add(ecomCartItem);
    return this;
  }

   /**
   * 购物车组件信息
   * @return ecomCart
  **/
  @javax.annotation.Nullable
  public List<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfoEcomCartInner> getEcomCart() {
    return ecomCart;
  }


  public void setEcomCart(List<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfoEcomCartInner> ecomCart) {
    this.ecomCart = ecomCart;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo industryComponentId(Long industryComponentId) {
    
    this.industryComponentId = industryComponentId;
    return this;
  }

   /**
   * 行业组件ID
   * @return industryComponentId
  **/
  @javax.annotation.Nullable
  public Long getIndustryComponentId() {
    return industryComponentId;
  }


  public void setIndustryComponentId(Long industryComponentId) {
    this.industryComponentId = industryComponentId;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo linkComponentIds(List<Long> linkComponentIds) {
    
    this.linkComponentIds = linkComponentIds;
    return this;
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo addLinkComponentIdsItem(Long linkComponentIdsItem) {
    if (this.linkComponentIds == null) {
      this.linkComponentIds = new ArrayList<>();
    }
    this.linkComponentIds.add(linkComponentIdsItem);
    return this;
  }

   /**
   * 常规组件ID（落地页组件）
   * @return linkComponentIds
  **/
  @javax.annotation.Nullable
  public List<Long> getLinkComponentIds() {
    return linkComponentIds;
  }


  public void setLinkComponentIds(List<Long> linkComponentIds) {
    this.linkComponentIds = linkComponentIds;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo liveAttractComponentId(Long liveAttractComponentId) {
    
    this.liveAttractComponentId = liveAttractComponentId;
    return this;
  }

   /**
   * 直播引流组件ID
   * @return liveAttractComponentId
  **/
  @javax.annotation.Nullable
  public Long getLiveAttractComponentId() {
    return liveAttractComponentId;
  }


  public void setLiveAttractComponentId(Long liveAttractComponentId) {
    this.liveAttractComponentId = liveAttractComponentId;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo searchWord(String searchWord) {
    
    this.searchWord = searchWord;
    return this;
  }

   /**
   * 挂载搜索词
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
    StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo = (StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo) o;
    return Objects.equals(this.cocreateDouyinId, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo.cocreateDouyinId) &&
        Objects.equals(this.ecomCart, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo.ecomCart) &&
        Objects.equals(this.industryComponentId, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo.industryComponentId) &&
        Objects.equals(this.linkComponentIds, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo.linkComponentIds) &&
        Objects.equals(this.liveAttractComponentId, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo.liveAttractComponentId) &&
        Objects.equals(this.searchWord, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo.searchWord);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cocreateDouyinId, ecomCart, industryComponentId, linkComponentIds, liveAttractComponentId, searchWord);
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
    sb.append("class StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo {\n");
    sb.append("    cocreateDouyinId: ").append(toIndentedString(cocreateDouyinId)).append("\n");
    sb.append("    ecomCart: ").append(toIndentedString(ecomCart)).append("\n");
    sb.append("    industryComponentId: ").append(toIndentedString(industryComponentId)).append("\n");
    sb.append("    linkComponentIds: ").append(toIndentedString(linkComponentIds)).append("\n");
    sb.append("    liveAttractComponentId: ").append(toIndentedString(liveAttractComponentId)).append("\n");
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
    openapiFields.add("ecom_cart");
    openapiFields.add("industry_component_id");
    openapiFields.add("link_component_ids");
    openapiFields.add("live_attract_component_id");
    openapiFields.add("search_word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo>() {
           @Override
           public void write(JsonWriter out, StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo
  */
  public static StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo.class);
  }

 /**
  * Convert an instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

