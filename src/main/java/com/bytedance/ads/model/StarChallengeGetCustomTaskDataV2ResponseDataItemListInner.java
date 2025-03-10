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
import com.bytedance.ads.model.StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo;
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
 * StarChallengeGetCustomTaskDataV2ResponseDataItemListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class StarChallengeGetCustomTaskDataV2ResponseDataItemListInner {
  public static final String SERIALIZED_NAME_ANDROID_CONVERT_COUNT = "android_convert_count";
  @SerializedName(SERIALIZED_NAME_ANDROID_CONVERT_COUNT)
  private Integer androidConvertCount = null;

  public static final String SERIALIZED_NAME_AUTHOR_INFO = "author_info";
  @SerializedName(SERIALIZED_NAME_AUTHOR_INFO)
  private StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo authorInfo = null;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId = null;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private Long comment = null;

  public static final String SERIALIZED_NAME_COMPONENT_CLICK_COUNT = "component_click_count";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CLICK_COUNT)
  private Integer componentClickCount = null;

  public static final String SERIALIZED_NAME_CONTRACT_MCN_ID = "contract_mcn_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_MCN_ID)
  private Long contractMcnId = null;

  public static final String SERIALIZED_NAME_CONTRACT_MCN_NAME = "contract_mcn_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_MCN_NAME)
  private String contractMcnName = null;

  public static final String SERIALIZED_NAME_CONVERT_COUNT = "convert_count";
  @SerializedName(SERIALIZED_NAME_CONVERT_COUNT)
  private Long convertCount = null;

  public static final String SERIALIZED_NAME_COVER_URL = "cover_url";
  @SerializedName(SERIALIZED_NAME_COVER_URL)
  private String coverUrl = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_INVALID_ANDROID_CONVERT_COUNT = "invalid_android_convert_count";
  @SerializedName(SERIALIZED_NAME_INVALID_ANDROID_CONVERT_COUNT)
  private Long invalidAndroidConvertCount = null;

  public static final String SERIALIZED_NAME_INVALID_IOS_CONVERT_COUNT = "invalid_ios_convert_count";
  @SerializedName(SERIALIZED_NAME_INVALID_IOS_CONVERT_COUNT)
  private Long invalidIosConvertCount = null;

  public static final String SERIALIZED_NAME_IOS_CONVERT_COUNT = "ios_convert_count";
  @SerializedName(SERIALIZED_NAME_IOS_CONVERT_COUNT)
  private Integer iosConvertCount = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_LIKE_CNT = "like_cnt";
  @SerializedName(SERIALIZED_NAME_LIKE_CNT)
  private Long likeCnt = null;

  public static final String SERIALIZED_NAME_LIVE_ACU = "live_acu";
  @SerializedName(SERIALIZED_NAME_LIVE_ACU)
  private Long liveAcu = null;

  public static final String SERIALIZED_NAME_LIVE_DURATION = "live_duration";
  @SerializedName(SERIALIZED_NAME_LIVE_DURATION)
  private Long liveDuration = null;

  public static final String SERIALIZED_NAME_LIVE_PCU = "live_pcu";
  @SerializedName(SERIALIZED_NAME_LIVE_PCU)
  private Long livePcu = null;

  public static final String SERIALIZED_NAME_PLAY = "play";
  @SerializedName(SERIALIZED_NAME_PLAY)
  private Long play = null;

  public static final String SERIALIZED_NAME_RESERVE_CNT = "reserve_cnt";
  @SerializedName(SERIALIZED_NAME_RESERVE_CNT)
  private Long reserveCnt = null;

  public static final String SERIALIZED_NAME_RESERVE_INSTALL_CNT = "reserve_install_cnt";
  @SerializedName(SERIALIZED_NAME_RESERVE_INSTALL_CNT)
  private Long reserveInstallCnt = null;

  public static final String SERIALIZED_NAME_REWARD_AMOUNT = "reward_amount";
  @SerializedName(SERIALIZED_NAME_REWARD_AMOUNT)
  private Long rewardAmount = null;

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private Long share = null;

  public static final String SERIALIZED_NAME_SHARE_VV = "share_vv";
  @SerializedName(SERIALIZED_NAME_SHARE_VV)
  private Integer shareVv = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_UNCORRELATED = "uncorrelated";
  @SerializedName(SERIALIZED_NAME_UNCORRELATED)
  private Integer uncorrelated = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_VIDEO_DURATION_MS = "video_duration_ms";
  @SerializedName(SERIALIZED_NAME_VIDEO_DURATION_MS)
  private Long videoDurationMs = null;

  public static final String SERIALIZED_NAME_WATCH_CNT = "watch_cnt";
  @SerializedName(SERIALIZED_NAME_WATCH_CNT)
  private Long watchCnt = null;

  public static final String SERIALIZED_NAME_WATCH_DURATION_AVG = "watch_duration_avg";
  @SerializedName(SERIALIZED_NAME_WATCH_DURATION_AVG)
  private Double watchDurationAvg = null;

  public static final String SERIALIZED_NAME_WATCH_UV = "watch_uv";
  @SerializedName(SERIALIZED_NAME_WATCH_UV)
  private Long watchUv = null;

  public static final String SERIALIZED_NAME_WHITE_COMMENT = "white_comment";
  @SerializedName(SERIALIZED_NAME_WHITE_COMMENT)
  private Integer whiteComment = null;

  public static final String SERIALIZED_NAME_WHITE_LIKE_CNT = "white_like_cnt";
  @SerializedName(SERIALIZED_NAME_WHITE_LIKE_CNT)
  private Integer whiteLikeCnt = null;

  public static final String SERIALIZED_NAME_WHITE_SHARE = "white_share";
  @SerializedName(SERIALIZED_NAME_WHITE_SHARE)
  private Integer whiteShare = null;

  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner() {
  }

  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner androidConvertCount(Integer androidConvertCount) {
    
    this.androidConvertCount = androidConvertCount;
    return this;
  }

   /**
   * 含作弊的Android下载数/Android激活数
   * @return androidConvertCount
  **/
  @javax.annotation.Nullable
  public Integer getAndroidConvertCount() {
    return androidConvertCount;
  }


  public void setAndroidConvertCount(Integer androidConvertCount) {
    this.androidConvertCount = androidConvertCount;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner authorInfo(StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo authorInfo) {
    
    this.authorInfo = authorInfo;
    return this;
  }

   /**
   * Get authorInfo
   * @return authorInfo
  **/
  @javax.annotation.Nullable
  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo getAuthorInfo() {
    return authorInfo;
  }


  public void setAuthorInfo(StarChallengeGetCustomTaskDataV2ResponseDataItemListInnerAuthorInfo authorInfo) {
    this.authorInfo = authorInfo;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * channel_id
   * @return channelId
  **/
  @javax.annotation.Nullable
  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner comment(Long comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * 评论量
   * @return comment
  **/
  @javax.annotation.Nullable
  public Long getComment() {
    return comment;
  }


  public void setComment(Long comment) {
    this.comment = comment;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner componentClickCount(Integer componentClickCount) {
    
    this.componentClickCount = componentClickCount;
    return this;
  }

   /**
   * 组件点击量
   * @return componentClickCount
  **/
  @javax.annotation.Nullable
  public Integer getComponentClickCount() {
    return componentClickCount;
  }


  public void setComponentClickCount(Integer componentClickCount) {
    this.componentClickCount = componentClickCount;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner contractMcnId(Long contractMcnId) {
    
    this.contractMcnId = contractMcnId;
    return this;
  }

   /**
   * 投稿机构ID
   * @return contractMcnId
  **/
  @javax.annotation.Nullable
  public Long getContractMcnId() {
    return contractMcnId;
  }


  public void setContractMcnId(Long contractMcnId) {
    this.contractMcnId = contractMcnId;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner contractMcnName(String contractMcnName) {
    
    this.contractMcnName = contractMcnName;
    return this;
  }

   /**
   * 投稿机构名称
   * @return contractMcnName
  **/
  @javax.annotation.Nullable
  public String getContractMcnName() {
    return contractMcnName;
  }


  public void setContractMcnName(String contractMcnName) {
    this.contractMcnName = contractMcnName;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner convertCount(Long convertCount) {
    
    this.convertCount = convertCount;
    return this;
  }

   /**
   * 促活转化数（线索量/安装量等）
   * @return convertCount
  **/
  @javax.annotation.Nullable
  public Long getConvertCount() {
    return convertCount;
  }


  public void setConvertCount(Long convertCount) {
    this.convertCount = convertCount;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner coverUrl(String coverUrl) {
    
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * 视频封面图
   * @return coverUrl
  **/
  @javax.annotation.Nullable
  public String getCoverUrl() {
    return coverUrl;
  }


  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 发布时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner invalidAndroidConvertCount(Long invalidAndroidConvertCount) {
    
    this.invalidAndroidConvertCount = invalidAndroidConvertCount;
    return this;
  }

   /**
   * 去除作弊后的ios下载数/ios激活数
   * @return invalidAndroidConvertCount
  **/
  @javax.annotation.Nullable
  public Long getInvalidAndroidConvertCount() {
    return invalidAndroidConvertCount;
  }


  public void setInvalidAndroidConvertCount(Long invalidAndroidConvertCount) {
    this.invalidAndroidConvertCount = invalidAndroidConvertCount;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner invalidIosConvertCount(Long invalidIosConvertCount) {
    
    this.invalidIosConvertCount = invalidIosConvertCount;
    return this;
  }

   /**
   * 含作弊的ios下载数/ios激活数
   * @return invalidIosConvertCount
  **/
  @javax.annotation.Nullable
  public Long getInvalidIosConvertCount() {
    return invalidIosConvertCount;
  }


  public void setInvalidIosConvertCount(Long invalidIosConvertCount) {
    this.invalidIosConvertCount = invalidIosConvertCount;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner iosConvertCount(Integer iosConvertCount) {
    
    this.iosConvertCount = iosConvertCount;
    return this;
  }

   /**
   * 去除作弊后的Android下载数/Android激活数
   * @return iosConvertCount
  **/
  @javax.annotation.Nullable
  public Integer getIosConvertCount() {
    return iosConvertCount;
  }


  public void setIosConvertCount(Integer iosConvertCount) {
    this.iosConvertCount = iosConvertCount;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 作品id
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner likeCnt(Long likeCnt) {
    
    this.likeCnt = likeCnt;
    return this;
  }

   /**
   * 点赞量
   * @return likeCnt
  **/
  @javax.annotation.Nullable
  public Long getLikeCnt() {
    return likeCnt;
  }


  public void setLikeCnt(Long likeCnt) {
    this.likeCnt = likeCnt;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner liveAcu(Long liveAcu) {
    
    this.liveAcu = liveAcu;
    return this;
  }

   /**
   * acu
   * @return liveAcu
  **/
  @javax.annotation.Nullable
  public Long getLiveAcu() {
    return liveAcu;
  }


  public void setLiveAcu(Long liveAcu) {
    this.liveAcu = liveAcu;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner liveDuration(Long liveDuration) {
    
    this.liveDuration = liveDuration;
    return this;
  }

   /**
   * 直播时长
   * @return liveDuration
  **/
  @javax.annotation.Nullable
  public Long getLiveDuration() {
    return liveDuration;
  }


  public void setLiveDuration(Long liveDuration) {
    this.liveDuration = liveDuration;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner livePcu(Long livePcu) {
    
    this.livePcu = livePcu;
    return this;
  }

   /**
   * pcu
   * @return livePcu
  **/
  @javax.annotation.Nullable
  public Long getLivePcu() {
    return livePcu;
  }


  public void setLivePcu(Long livePcu) {
    this.livePcu = livePcu;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner play(Long play) {
    
    this.play = play;
    return this;
  }

   /**
   * 播放量
   * @return play
  **/
  @javax.annotation.Nullable
  public Long getPlay() {
    return play;
  }


  public void setPlay(Long play) {
    this.play = play;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner reserveCnt(Long reserveCnt) {
    
    this.reserveCnt = reserveCnt;
    return this;
  }

   /**
   * 预约成功次数（仅安卓）
   * @return reserveCnt
  **/
  @javax.annotation.Nullable
  public Long getReserveCnt() {
    return reserveCnt;
  }


  public void setReserveCnt(Long reserveCnt) {
    this.reserveCnt = reserveCnt;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner reserveInstallCnt(Long reserveInstallCnt) {
    
    this.reserveInstallCnt = reserveInstallCnt;
    return this;
  }

   /**
   * 预约安装完成次数
   * @return reserveInstallCnt
  **/
  @javax.annotation.Nullable
  public Long getReserveInstallCnt() {
    return reserveInstallCnt;
  }


  public void setReserveInstallCnt(Long reserveInstallCnt) {
    this.reserveInstallCnt = reserveInstallCnt;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner rewardAmount(Long rewardAmount) {
    
    this.rewardAmount = rewardAmount;
    return this;
  }

   /**
   * 奖励金额
   * @return rewardAmount
  **/
  @javax.annotation.Nullable
  public Long getRewardAmount() {
    return rewardAmount;
  }


  public void setRewardAmount(Long rewardAmount) {
    this.rewardAmount = rewardAmount;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner share(Long share) {
    
    this.share = share;
    return this;
  }

   /**
   * 分享量
   * @return share
  **/
  @javax.annotation.Nullable
  public Long getShare() {
    return share;
  }


  public void setShare(Long share) {
    this.share = share;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner shareVv(Integer shareVv) {
    
    this.shareVv = shareVv;
    return this;
  }

   /**
   * 有效播放量
   * @return shareVv
  **/
  @javax.annotation.Nullable
  public Integer getShareVv() {
    return shareVv;
  }


  public void setShareVv(Integer shareVv) {
    this.shareVv = shareVv;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 标题
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner uncorrelated(Integer uncorrelated) {
    
    this.uncorrelated = uncorrelated;
    return this;
  }

   /**
   * 相关性审核（1-通过）
   * @return uncorrelated
  **/
  @javax.annotation.Nullable
  public Integer getUncorrelated() {
    return uncorrelated;
  }


  public void setUncorrelated(Integer uncorrelated) {
    this.uncorrelated = uncorrelated;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 链接
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner videoDurationMs(Long videoDurationMs) {
    
    this.videoDurationMs = videoDurationMs;
    return this;
  }

   /**
   * 视频时长
   * @return videoDurationMs
  **/
  @javax.annotation.Nullable
  public Long getVideoDurationMs() {
    return videoDurationMs;
  }


  public void setVideoDurationMs(Long videoDurationMs) {
    this.videoDurationMs = videoDurationMs;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner watchCnt(Long watchCnt) {
    
    this.watchCnt = watchCnt;
    return this;
  }

   /**
   * pv
   * @return watchCnt
  **/
  @javax.annotation.Nullable
  public Long getWatchCnt() {
    return watchCnt;
  }


  public void setWatchCnt(Long watchCnt) {
    this.watchCnt = watchCnt;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner watchDurationAvg(Double watchDurationAvg) {
    
    this.watchDurationAvg = watchDurationAvg;
    return this;
  }

   /**
   * 直播人均时长
   * @return watchDurationAvg
  **/
  @javax.annotation.Nullable
  public Double getWatchDurationAvg() {
    return watchDurationAvg;
  }


  public void setWatchDurationAvg(Double watchDurationAvg) {
    this.watchDurationAvg = watchDurationAvg;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner watchUv(Long watchUv) {
    
    this.watchUv = watchUv;
    return this;
  }

   /**
   * uv
   * @return watchUv
  **/
  @javax.annotation.Nullable
  public Long getWatchUv() {
    return watchUv;
  }


  public void setWatchUv(Long watchUv) {
    this.watchUv = watchUv;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner whiteComment(Integer whiteComment) {
    
    this.whiteComment = whiteComment;
    return this;
  }

   /**
   * 有效评论量
   * @return whiteComment
  **/
  @javax.annotation.Nullable
  public Integer getWhiteComment() {
    return whiteComment;
  }


  public void setWhiteComment(Integer whiteComment) {
    this.whiteComment = whiteComment;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner whiteLikeCnt(Integer whiteLikeCnt) {
    
    this.whiteLikeCnt = whiteLikeCnt;
    return this;
  }

   /**
   * 有效点赞量
   * @return whiteLikeCnt
  **/
  @javax.annotation.Nullable
  public Integer getWhiteLikeCnt() {
    return whiteLikeCnt;
  }


  public void setWhiteLikeCnt(Integer whiteLikeCnt) {
    this.whiteLikeCnt = whiteLikeCnt;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner whiteShare(Integer whiteShare) {
    
    this.whiteShare = whiteShare;
    return this;
  }

   /**
   * 有效分享量
   * @return whiteShare
  **/
  @javax.annotation.Nullable
  public Integer getWhiteShare() {
    return whiteShare;
  }


  public void setWhiteShare(Integer whiteShare) {
    this.whiteShare = whiteShare;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeGetCustomTaskDataV2ResponseDataItemListInner starChallengeGetCustomTaskDataV2ResponseDataItemListInner = (StarChallengeGetCustomTaskDataV2ResponseDataItemListInner) o;
    return Objects.equals(this.androidConvertCount, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.androidConvertCount) &&
        Objects.equals(this.authorInfo, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.authorInfo) &&
        Objects.equals(this.channelId, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.channelId) &&
        Objects.equals(this.comment, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.comment) &&
        Objects.equals(this.componentClickCount, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.componentClickCount) &&
        Objects.equals(this.contractMcnId, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.contractMcnId) &&
        Objects.equals(this.contractMcnName, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.contractMcnName) &&
        Objects.equals(this.convertCount, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.convertCount) &&
        Objects.equals(this.coverUrl, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.coverUrl) &&
        Objects.equals(this.createTime, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.createTime) &&
        Objects.equals(this.invalidAndroidConvertCount, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.invalidAndroidConvertCount) &&
        Objects.equals(this.invalidIosConvertCount, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.invalidIosConvertCount) &&
        Objects.equals(this.iosConvertCount, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.iosConvertCount) &&
        Objects.equals(this.itemId, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.itemId) &&
        Objects.equals(this.likeCnt, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.likeCnt) &&
        Objects.equals(this.liveAcu, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.liveAcu) &&
        Objects.equals(this.liveDuration, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.liveDuration) &&
        Objects.equals(this.livePcu, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.livePcu) &&
        Objects.equals(this.play, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.play) &&
        Objects.equals(this.reserveCnt, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.reserveCnt) &&
        Objects.equals(this.reserveInstallCnt, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.reserveInstallCnt) &&
        Objects.equals(this.rewardAmount, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.rewardAmount) &&
        Objects.equals(this.share, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.share) &&
        Objects.equals(this.shareVv, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.shareVv) &&
        Objects.equals(this.title, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.title) &&
        Objects.equals(this.uncorrelated, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.uncorrelated) &&
        Objects.equals(this.url, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.url) &&
        Objects.equals(this.videoDurationMs, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.videoDurationMs) &&
        Objects.equals(this.watchCnt, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.watchCnt) &&
        Objects.equals(this.watchDurationAvg, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.watchDurationAvg) &&
        Objects.equals(this.watchUv, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.watchUv) &&
        Objects.equals(this.whiteComment, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.whiteComment) &&
        Objects.equals(this.whiteLikeCnt, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.whiteLikeCnt) &&
        Objects.equals(this.whiteShare, starChallengeGetCustomTaskDataV2ResponseDataItemListInner.whiteShare);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidConvertCount, authorInfo, channelId, comment, componentClickCount, contractMcnId, contractMcnName, convertCount, coverUrl, createTime, invalidAndroidConvertCount, invalidIosConvertCount, iosConvertCount, itemId, likeCnt, liveAcu, liveDuration, livePcu, play, reserveCnt, reserveInstallCnt, rewardAmount, share, shareVv, title, uncorrelated, url, videoDurationMs, watchCnt, watchDurationAvg, watchUv, whiteComment, whiteLikeCnt, whiteShare);
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
    sb.append("class StarChallengeGetCustomTaskDataV2ResponseDataItemListInner {\n");
    sb.append("    androidConvertCount: ").append(toIndentedString(androidConvertCount)).append("\n");
    sb.append("    authorInfo: ").append(toIndentedString(authorInfo)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    componentClickCount: ").append(toIndentedString(componentClickCount)).append("\n");
    sb.append("    contractMcnId: ").append(toIndentedString(contractMcnId)).append("\n");
    sb.append("    contractMcnName: ").append(toIndentedString(contractMcnName)).append("\n");
    sb.append("    convertCount: ").append(toIndentedString(convertCount)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    invalidAndroidConvertCount: ").append(toIndentedString(invalidAndroidConvertCount)).append("\n");
    sb.append("    invalidIosConvertCount: ").append(toIndentedString(invalidIosConvertCount)).append("\n");
    sb.append("    iosConvertCount: ").append(toIndentedString(iosConvertCount)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    likeCnt: ").append(toIndentedString(likeCnt)).append("\n");
    sb.append("    liveAcu: ").append(toIndentedString(liveAcu)).append("\n");
    sb.append("    liveDuration: ").append(toIndentedString(liveDuration)).append("\n");
    sb.append("    livePcu: ").append(toIndentedString(livePcu)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
    sb.append("    reserveCnt: ").append(toIndentedString(reserveCnt)).append("\n");
    sb.append("    reserveInstallCnt: ").append(toIndentedString(reserveInstallCnt)).append("\n");
    sb.append("    rewardAmount: ").append(toIndentedString(rewardAmount)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    shareVv: ").append(toIndentedString(shareVv)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uncorrelated: ").append(toIndentedString(uncorrelated)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    videoDurationMs: ").append(toIndentedString(videoDurationMs)).append("\n");
    sb.append("    watchCnt: ").append(toIndentedString(watchCnt)).append("\n");
    sb.append("    watchDurationAvg: ").append(toIndentedString(watchDurationAvg)).append("\n");
    sb.append("    watchUv: ").append(toIndentedString(watchUv)).append("\n");
    sb.append("    whiteComment: ").append(toIndentedString(whiteComment)).append("\n");
    sb.append("    whiteLikeCnt: ").append(toIndentedString(whiteLikeCnt)).append("\n");
    sb.append("    whiteShare: ").append(toIndentedString(whiteShare)).append("\n");
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
    openapiFields.add("android_convert_count");
    openapiFields.add("author_info");
    openapiFields.add("channel_id");
    openapiFields.add("comment");
    openapiFields.add("component_click_count");
    openapiFields.add("contract_mcn_id");
    openapiFields.add("contract_mcn_name");
    openapiFields.add("convert_count");
    openapiFields.add("cover_url");
    openapiFields.add("create_time");
    openapiFields.add("invalid_android_convert_count");
    openapiFields.add("invalid_ios_convert_count");
    openapiFields.add("ios_convert_count");
    openapiFields.add("item_id");
    openapiFields.add("like_cnt");
    openapiFields.add("live_acu");
    openapiFields.add("live_duration");
    openapiFields.add("live_pcu");
    openapiFields.add("play");
    openapiFields.add("reserve_cnt");
    openapiFields.add("reserve_install_cnt");
    openapiFields.add("reward_amount");
    openapiFields.add("share");
    openapiFields.add("share_vv");
    openapiFields.add("title");
    openapiFields.add("uncorrelated");
    openapiFields.add("url");
    openapiFields.add("video_duration_ms");
    openapiFields.add("watch_cnt");
    openapiFields.add("watch_duration_avg");
    openapiFields.add("watch_uv");
    openapiFields.add("white_comment");
    openapiFields.add("white_like_cnt");
    openapiFields.add("white_share");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeGetCustomTaskDataV2ResponseDataItemListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeGetCustomTaskDataV2ResponseDataItemListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeGetCustomTaskDataV2ResponseDataItemListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeGetCustomTaskDataV2ResponseDataItemListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeGetCustomTaskDataV2ResponseDataItemListInner>() {
           @Override
           public void write(JsonWriter out, StarChallengeGetCustomTaskDataV2ResponseDataItemListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeGetCustomTaskDataV2ResponseDataItemListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeGetCustomTaskDataV2ResponseDataItemListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeGetCustomTaskDataV2ResponseDataItemListInner
  * @throws IOException if the JSON string is invalid with respect to StarChallengeGetCustomTaskDataV2ResponseDataItemListInner
  */
  public static StarChallengeGetCustomTaskDataV2ResponseDataItemListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeGetCustomTaskDataV2ResponseDataItemListInner.class);
  }

 /**
  * Convert an instance of StarChallengeGetCustomTaskDataV2ResponseDataItemListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

