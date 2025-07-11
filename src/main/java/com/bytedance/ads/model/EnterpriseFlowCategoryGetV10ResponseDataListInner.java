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
 * EnterpriseFlowCategoryGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class EnterpriseFlowCategoryGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_BUSINESS_PAGE_CHAT_BY_SHARE_VIDEO_CNT = "business_page_chat_by_share_video_cnt";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_CHAT_BY_SHARE_VIDEO_CNT)
  private String businessPageChatByShareVideoCnt = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_CLICK_CART_COUNT = "business_page_click_cart_count";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_CLICK_CART_COUNT)
  private String businessPageClickCartCount = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_CLICK_PRODUCT = "business_page_click_product";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_CLICK_PRODUCT)
  private String businessPageClickProduct = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_CLICK_PRODUCT_GO_BUY = "business_page_click_product_go_buy";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_CLICK_PRODUCT_GO_BUY)
  private String businessPageClickProductGoBuy = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_COMMENT = "business_page_comment";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_COMMENT)
  private String businessPageComment = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_DISFOLLOW_UCOUNT = "business_page_disfollow_ucount";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_DISFOLLOW_UCOUNT)
  private String businessPageDisfollowUcount = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_DISLIKE_CNT = "business_page_dislike_cnt";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_DISLIKE_CNT)
  private String businessPageDislikeCnt = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_DP_DOWN_CLICK_CNT = "business_page_dp_down_click_cnt";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_DP_DOWN_CLICK_CNT)
  private String businessPageDpDownClickCnt = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_FANS_NUM_ALL = "business_page_fans_num_all";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_FANS_NUM_ALL)
  private String businessPageFansNumAll = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_FAVOURITE_VIDEO_CNT = "business_page_favourite_video_cnt";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_FAVOURITE_VIDEO_CNT)
  private String businessPageFavouriteVideoCnt = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_FW_VIDEO_VV = "business_page_fw_video_vv";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_FW_VIDEO_VV)
  private String businessPageFwVideoVv = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_HOME_VISITED = "business_page_home_visited";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_HOME_VISITED)
  private String businessPageHomeVisited = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_HOME_VISITED_UCOUNT = "business_page_home_visited_ucount";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_HOME_VISITED_UCOUNT)
  private String businessPageHomeVisitedUcount = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_LIKE = "business_page_like";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_LIKE)
  private String businessPageLike = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_NEW_FANS_NUM = "business_page_new_fans_num";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_NEW_FANS_NUM)
  private String businessPageNewFansNum = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_ORDER_COUNT = "business_page_order_count";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_ORDER_COUNT)
  private String businessPageOrderCount = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_PAY_ORDER_COUNT = "business_page_pay_order_count";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_PAY_ORDER_COUNT)
  private String businessPagePayOrderCount = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_PAY_ORDER_GMV = "business_page_pay_order_gmv";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_PAY_ORDER_GMV)
  private String businessPagePayOrderGmv = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_PLAY_OVER = "business_page_play_over";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_PLAY_OVER)
  private String businessPagePlayOver = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_SHARE = "business_page_share";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_SHARE)
  private String businessPageShare = null;

  public static final String SERIALIZED_NAME_BUSINESS_PAGE_TOTAL_PLAY = "business_page_total_play";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PAGE_TOTAL_PLAY)
  private String businessPageTotalPlay = null;

  public static final String SERIALIZED_NAME_FIRST_FLOW_CATEGORY = "first_flow_category";
  @SerializedName(SERIALIZED_NAME_FIRST_FLOW_CATEGORY)
  private String firstFlowCategory = null;

  public static final String SERIALIZED_NAME_START_TIME_DAY = "start_time_day";
  @SerializedName(SERIALIZED_NAME_START_TIME_DAY)
  private String startTimeDay = null;

  public EnterpriseFlowCategoryGetV10ResponseDataListInner() {
  }

  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageChatByShareVideoCnt(String businessPageChatByShareVideoCnt) {
    
    this.businessPageChatByShareVideoCnt = businessPageChatByShareVideoCnt;
    return this;
  }

   /**
   * 
   * @return businessPageChatByShareVideoCnt
  **/
  @javax.annotation.Nullable
  public String getBusinessPageChatByShareVideoCnt() {
    return businessPageChatByShareVideoCnt;
  }


  public void setBusinessPageChatByShareVideoCnt(String businessPageChatByShareVideoCnt) {
    this.businessPageChatByShareVideoCnt = businessPageChatByShareVideoCnt;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageClickCartCount(String businessPageClickCartCount) {
    
    this.businessPageClickCartCount = businessPageClickCartCount;
    return this;
  }

   /**
   * 
   * @return businessPageClickCartCount
  **/
  @javax.annotation.Nullable
  public String getBusinessPageClickCartCount() {
    return businessPageClickCartCount;
  }


  public void setBusinessPageClickCartCount(String businessPageClickCartCount) {
    this.businessPageClickCartCount = businessPageClickCartCount;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageClickProduct(String businessPageClickProduct) {
    
    this.businessPageClickProduct = businessPageClickProduct;
    return this;
  }

   /**
   * 
   * @return businessPageClickProduct
  **/
  @javax.annotation.Nullable
  public String getBusinessPageClickProduct() {
    return businessPageClickProduct;
  }


  public void setBusinessPageClickProduct(String businessPageClickProduct) {
    this.businessPageClickProduct = businessPageClickProduct;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageClickProductGoBuy(String businessPageClickProductGoBuy) {
    
    this.businessPageClickProductGoBuy = businessPageClickProductGoBuy;
    return this;
  }

   /**
   * 
   * @return businessPageClickProductGoBuy
  **/
  @javax.annotation.Nullable
  public String getBusinessPageClickProductGoBuy() {
    return businessPageClickProductGoBuy;
  }


  public void setBusinessPageClickProductGoBuy(String businessPageClickProductGoBuy) {
    this.businessPageClickProductGoBuy = businessPageClickProductGoBuy;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageComment(String businessPageComment) {
    
    this.businessPageComment = businessPageComment;
    return this;
  }

   /**
   * 
   * @return businessPageComment
  **/
  @javax.annotation.Nullable
  public String getBusinessPageComment() {
    return businessPageComment;
  }


  public void setBusinessPageComment(String businessPageComment) {
    this.businessPageComment = businessPageComment;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageDisfollowUcount(String businessPageDisfollowUcount) {
    
    this.businessPageDisfollowUcount = businessPageDisfollowUcount;
    return this;
  }

   /**
   * 
   * @return businessPageDisfollowUcount
  **/
  @javax.annotation.Nullable
  public String getBusinessPageDisfollowUcount() {
    return businessPageDisfollowUcount;
  }


  public void setBusinessPageDisfollowUcount(String businessPageDisfollowUcount) {
    this.businessPageDisfollowUcount = businessPageDisfollowUcount;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageDislikeCnt(String businessPageDislikeCnt) {
    
    this.businessPageDislikeCnt = businessPageDislikeCnt;
    return this;
  }

   /**
   * 
   * @return businessPageDislikeCnt
  **/
  @javax.annotation.Nullable
  public String getBusinessPageDislikeCnt() {
    return businessPageDislikeCnt;
  }


  public void setBusinessPageDislikeCnt(String businessPageDislikeCnt) {
    this.businessPageDislikeCnt = businessPageDislikeCnt;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageDpDownClickCnt(String businessPageDpDownClickCnt) {
    
    this.businessPageDpDownClickCnt = businessPageDpDownClickCnt;
    return this;
  }

   /**
   * 
   * @return businessPageDpDownClickCnt
  **/
  @javax.annotation.Nullable
  public String getBusinessPageDpDownClickCnt() {
    return businessPageDpDownClickCnt;
  }


  public void setBusinessPageDpDownClickCnt(String businessPageDpDownClickCnt) {
    this.businessPageDpDownClickCnt = businessPageDpDownClickCnt;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageFansNumAll(String businessPageFansNumAll) {
    
    this.businessPageFansNumAll = businessPageFansNumAll;
    return this;
  }

   /**
   * 
   * @return businessPageFansNumAll
  **/
  @javax.annotation.Nullable
  public String getBusinessPageFansNumAll() {
    return businessPageFansNumAll;
  }


  public void setBusinessPageFansNumAll(String businessPageFansNumAll) {
    this.businessPageFansNumAll = businessPageFansNumAll;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageFavouriteVideoCnt(String businessPageFavouriteVideoCnt) {
    
    this.businessPageFavouriteVideoCnt = businessPageFavouriteVideoCnt;
    return this;
  }

   /**
   * 
   * @return businessPageFavouriteVideoCnt
  **/
  @javax.annotation.Nullable
  public String getBusinessPageFavouriteVideoCnt() {
    return businessPageFavouriteVideoCnt;
  }


  public void setBusinessPageFavouriteVideoCnt(String businessPageFavouriteVideoCnt) {
    this.businessPageFavouriteVideoCnt = businessPageFavouriteVideoCnt;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageFwVideoVv(String businessPageFwVideoVv) {
    
    this.businessPageFwVideoVv = businessPageFwVideoVv;
    return this;
  }

   /**
   * 
   * @return businessPageFwVideoVv
  **/
  @javax.annotation.Nullable
  public String getBusinessPageFwVideoVv() {
    return businessPageFwVideoVv;
  }


  public void setBusinessPageFwVideoVv(String businessPageFwVideoVv) {
    this.businessPageFwVideoVv = businessPageFwVideoVv;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageHomeVisited(String businessPageHomeVisited) {
    
    this.businessPageHomeVisited = businessPageHomeVisited;
    return this;
  }

   /**
   * 
   * @return businessPageHomeVisited
  **/
  @javax.annotation.Nullable
  public String getBusinessPageHomeVisited() {
    return businessPageHomeVisited;
  }


  public void setBusinessPageHomeVisited(String businessPageHomeVisited) {
    this.businessPageHomeVisited = businessPageHomeVisited;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageHomeVisitedUcount(String businessPageHomeVisitedUcount) {
    
    this.businessPageHomeVisitedUcount = businessPageHomeVisitedUcount;
    return this;
  }

   /**
   * 
   * @return businessPageHomeVisitedUcount
  **/
  @javax.annotation.Nullable
  public String getBusinessPageHomeVisitedUcount() {
    return businessPageHomeVisitedUcount;
  }


  public void setBusinessPageHomeVisitedUcount(String businessPageHomeVisitedUcount) {
    this.businessPageHomeVisitedUcount = businessPageHomeVisitedUcount;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageLike(String businessPageLike) {
    
    this.businessPageLike = businessPageLike;
    return this;
  }

   /**
   * 
   * @return businessPageLike
  **/
  @javax.annotation.Nullable
  public String getBusinessPageLike() {
    return businessPageLike;
  }


  public void setBusinessPageLike(String businessPageLike) {
    this.businessPageLike = businessPageLike;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageNewFansNum(String businessPageNewFansNum) {
    
    this.businessPageNewFansNum = businessPageNewFansNum;
    return this;
  }

   /**
   * 
   * @return businessPageNewFansNum
  **/
  @javax.annotation.Nullable
  public String getBusinessPageNewFansNum() {
    return businessPageNewFansNum;
  }


  public void setBusinessPageNewFansNum(String businessPageNewFansNum) {
    this.businessPageNewFansNum = businessPageNewFansNum;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageOrderCount(String businessPageOrderCount) {
    
    this.businessPageOrderCount = businessPageOrderCount;
    return this;
  }

   /**
   * 
   * @return businessPageOrderCount
  **/
  @javax.annotation.Nullable
  public String getBusinessPageOrderCount() {
    return businessPageOrderCount;
  }


  public void setBusinessPageOrderCount(String businessPageOrderCount) {
    this.businessPageOrderCount = businessPageOrderCount;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPagePayOrderCount(String businessPagePayOrderCount) {
    
    this.businessPagePayOrderCount = businessPagePayOrderCount;
    return this;
  }

   /**
   * 
   * @return businessPagePayOrderCount
  **/
  @javax.annotation.Nullable
  public String getBusinessPagePayOrderCount() {
    return businessPagePayOrderCount;
  }


  public void setBusinessPagePayOrderCount(String businessPagePayOrderCount) {
    this.businessPagePayOrderCount = businessPagePayOrderCount;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPagePayOrderGmv(String businessPagePayOrderGmv) {
    
    this.businessPagePayOrderGmv = businessPagePayOrderGmv;
    return this;
  }

   /**
   * 
   * @return businessPagePayOrderGmv
  **/
  @javax.annotation.Nullable
  public String getBusinessPagePayOrderGmv() {
    return businessPagePayOrderGmv;
  }


  public void setBusinessPagePayOrderGmv(String businessPagePayOrderGmv) {
    this.businessPagePayOrderGmv = businessPagePayOrderGmv;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPagePlayOver(String businessPagePlayOver) {
    
    this.businessPagePlayOver = businessPagePlayOver;
    return this;
  }

   /**
   * 
   * @return businessPagePlayOver
  **/
  @javax.annotation.Nullable
  public String getBusinessPagePlayOver() {
    return businessPagePlayOver;
  }


  public void setBusinessPagePlayOver(String businessPagePlayOver) {
    this.businessPagePlayOver = businessPagePlayOver;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageShare(String businessPageShare) {
    
    this.businessPageShare = businessPageShare;
    return this;
  }

   /**
   * 
   * @return businessPageShare
  **/
  @javax.annotation.Nullable
  public String getBusinessPageShare() {
    return businessPageShare;
  }


  public void setBusinessPageShare(String businessPageShare) {
    this.businessPageShare = businessPageShare;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner businessPageTotalPlay(String businessPageTotalPlay) {
    
    this.businessPageTotalPlay = businessPageTotalPlay;
    return this;
  }

   /**
   * 
   * @return businessPageTotalPlay
  **/
  @javax.annotation.Nullable
  public String getBusinessPageTotalPlay() {
    return businessPageTotalPlay;
  }


  public void setBusinessPageTotalPlay(String businessPageTotalPlay) {
    this.businessPageTotalPlay = businessPageTotalPlay;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner firstFlowCategory(String firstFlowCategory) {
    
    this.firstFlowCategory = firstFlowCategory;
    return this;
  }

   /**
   * 
   * @return firstFlowCategory
  **/
  @javax.annotation.Nullable
  public String getFirstFlowCategory() {
    return firstFlowCategory;
  }


  public void setFirstFlowCategory(String firstFlowCategory) {
    this.firstFlowCategory = firstFlowCategory;
  }


  public EnterpriseFlowCategoryGetV10ResponseDataListInner startTimeDay(String startTimeDay) {
    
    this.startTimeDay = startTimeDay;
    return this;
  }

   /**
   * 
   * @return startTimeDay
  **/
  @javax.annotation.Nullable
  public String getStartTimeDay() {
    return startTimeDay;
  }


  public void setStartTimeDay(String startTimeDay) {
    this.startTimeDay = startTimeDay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseFlowCategoryGetV10ResponseDataListInner enterpriseFlowCategoryGetV10ResponseDataListInner = (EnterpriseFlowCategoryGetV10ResponseDataListInner) o;
    return Objects.equals(this.businessPageChatByShareVideoCnt, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageChatByShareVideoCnt) &&
        Objects.equals(this.businessPageClickCartCount, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageClickCartCount) &&
        Objects.equals(this.businessPageClickProduct, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageClickProduct) &&
        Objects.equals(this.businessPageClickProductGoBuy, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageClickProductGoBuy) &&
        Objects.equals(this.businessPageComment, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageComment) &&
        Objects.equals(this.businessPageDisfollowUcount, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageDisfollowUcount) &&
        Objects.equals(this.businessPageDislikeCnt, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageDislikeCnt) &&
        Objects.equals(this.businessPageDpDownClickCnt, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageDpDownClickCnt) &&
        Objects.equals(this.businessPageFansNumAll, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageFansNumAll) &&
        Objects.equals(this.businessPageFavouriteVideoCnt, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageFavouriteVideoCnt) &&
        Objects.equals(this.businessPageFwVideoVv, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageFwVideoVv) &&
        Objects.equals(this.businessPageHomeVisited, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageHomeVisited) &&
        Objects.equals(this.businessPageHomeVisitedUcount, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageHomeVisitedUcount) &&
        Objects.equals(this.businessPageLike, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageLike) &&
        Objects.equals(this.businessPageNewFansNum, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageNewFansNum) &&
        Objects.equals(this.businessPageOrderCount, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageOrderCount) &&
        Objects.equals(this.businessPagePayOrderCount, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPagePayOrderCount) &&
        Objects.equals(this.businessPagePayOrderGmv, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPagePayOrderGmv) &&
        Objects.equals(this.businessPagePlayOver, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPagePlayOver) &&
        Objects.equals(this.businessPageShare, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageShare) &&
        Objects.equals(this.businessPageTotalPlay, enterpriseFlowCategoryGetV10ResponseDataListInner.businessPageTotalPlay) &&
        Objects.equals(this.firstFlowCategory, enterpriseFlowCategoryGetV10ResponseDataListInner.firstFlowCategory) &&
        Objects.equals(this.startTimeDay, enterpriseFlowCategoryGetV10ResponseDataListInner.startTimeDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessPageChatByShareVideoCnt, businessPageClickCartCount, businessPageClickProduct, businessPageClickProductGoBuy, businessPageComment, businessPageDisfollowUcount, businessPageDislikeCnt, businessPageDpDownClickCnt, businessPageFansNumAll, businessPageFavouriteVideoCnt, businessPageFwVideoVv, businessPageHomeVisited, businessPageHomeVisitedUcount, businessPageLike, businessPageNewFansNum, businessPageOrderCount, businessPagePayOrderCount, businessPagePayOrderGmv, businessPagePlayOver, businessPageShare, businessPageTotalPlay, firstFlowCategory, startTimeDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseFlowCategoryGetV10ResponseDataListInner {\n");
    sb.append("    businessPageChatByShareVideoCnt: ").append(toIndentedString(businessPageChatByShareVideoCnt)).append("\n");
    sb.append("    businessPageClickCartCount: ").append(toIndentedString(businessPageClickCartCount)).append("\n");
    sb.append("    businessPageClickProduct: ").append(toIndentedString(businessPageClickProduct)).append("\n");
    sb.append("    businessPageClickProductGoBuy: ").append(toIndentedString(businessPageClickProductGoBuy)).append("\n");
    sb.append("    businessPageComment: ").append(toIndentedString(businessPageComment)).append("\n");
    sb.append("    businessPageDisfollowUcount: ").append(toIndentedString(businessPageDisfollowUcount)).append("\n");
    sb.append("    businessPageDislikeCnt: ").append(toIndentedString(businessPageDislikeCnt)).append("\n");
    sb.append("    businessPageDpDownClickCnt: ").append(toIndentedString(businessPageDpDownClickCnt)).append("\n");
    sb.append("    businessPageFansNumAll: ").append(toIndentedString(businessPageFansNumAll)).append("\n");
    sb.append("    businessPageFavouriteVideoCnt: ").append(toIndentedString(businessPageFavouriteVideoCnt)).append("\n");
    sb.append("    businessPageFwVideoVv: ").append(toIndentedString(businessPageFwVideoVv)).append("\n");
    sb.append("    businessPageHomeVisited: ").append(toIndentedString(businessPageHomeVisited)).append("\n");
    sb.append("    businessPageHomeVisitedUcount: ").append(toIndentedString(businessPageHomeVisitedUcount)).append("\n");
    sb.append("    businessPageLike: ").append(toIndentedString(businessPageLike)).append("\n");
    sb.append("    businessPageNewFansNum: ").append(toIndentedString(businessPageNewFansNum)).append("\n");
    sb.append("    businessPageOrderCount: ").append(toIndentedString(businessPageOrderCount)).append("\n");
    sb.append("    businessPagePayOrderCount: ").append(toIndentedString(businessPagePayOrderCount)).append("\n");
    sb.append("    businessPagePayOrderGmv: ").append(toIndentedString(businessPagePayOrderGmv)).append("\n");
    sb.append("    businessPagePlayOver: ").append(toIndentedString(businessPagePlayOver)).append("\n");
    sb.append("    businessPageShare: ").append(toIndentedString(businessPageShare)).append("\n");
    sb.append("    businessPageTotalPlay: ").append(toIndentedString(businessPageTotalPlay)).append("\n");
    sb.append("    firstFlowCategory: ").append(toIndentedString(firstFlowCategory)).append("\n");
    sb.append("    startTimeDay: ").append(toIndentedString(startTimeDay)).append("\n");
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
    openapiFields.add("business_page_chat_by_share_video_cnt");
    openapiFields.add("business_page_click_cart_count");
    openapiFields.add("business_page_click_product");
    openapiFields.add("business_page_click_product_go_buy");
    openapiFields.add("business_page_comment");
    openapiFields.add("business_page_disfollow_ucount");
    openapiFields.add("business_page_dislike_cnt");
    openapiFields.add("business_page_dp_down_click_cnt");
    openapiFields.add("business_page_fans_num_all");
    openapiFields.add("business_page_favourite_video_cnt");
    openapiFields.add("business_page_fw_video_vv");
    openapiFields.add("business_page_home_visited");
    openapiFields.add("business_page_home_visited_ucount");
    openapiFields.add("business_page_like");
    openapiFields.add("business_page_new_fans_num");
    openapiFields.add("business_page_order_count");
    openapiFields.add("business_page_pay_order_count");
    openapiFields.add("business_page_pay_order_gmv");
    openapiFields.add("business_page_play_over");
    openapiFields.add("business_page_share");
    openapiFields.add("business_page_total_play");
    openapiFields.add("first_flow_category");
    openapiFields.add("start_time_day");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseFlowCategoryGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseFlowCategoryGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseFlowCategoryGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseFlowCategoryGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseFlowCategoryGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseFlowCategoryGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseFlowCategoryGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseFlowCategoryGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseFlowCategoryGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseFlowCategoryGetV10ResponseDataListInner
  */
  public static EnterpriseFlowCategoryGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseFlowCategoryGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of EnterpriseFlowCategoryGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

