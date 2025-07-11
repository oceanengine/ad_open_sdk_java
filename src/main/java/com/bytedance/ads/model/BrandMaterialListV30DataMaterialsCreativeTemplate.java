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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(BrandMaterialListV30DataMaterialsCreativeTemplate.Adapter.class)
public enum BrandMaterialListV30DataMaterialsCreativeTemplate {
  
  DOUYINCONTENTPLANTGRASSADNORMAL("DouyinContentPlantGrassAdNormal"),
  
  DOUYINCONTENTPLANTGRASSADSEARCHEXPLORE("DouyinContentPlantGrassAdSearchExplore"),
  
  DOUYINCONTENTPLANTGRASSADSEARCHIMAGE("DouyinContentPlantGrassAdSearchImage"),
  
  DOUYINCONTENTPLANTGRASSADSEARCHDIMAGE("DouyinContentPlantGrassAdSearchdImage"),
  
  DOUYINCONTENTPLANTGRASSNORMAL("DouyinContentPlantGrassNormal"),
  
  DOUYINCONTENTPLANTGRASSSEARCH("DouyinContentPlantGrassSearch"),
  
  DOUYINFEEDAPPDOWNLOADINTERACTIVESPACE("DouyinFeedAppDownloadInteractiveSpace"),
  
  DOUYINFEEDAPPDOWNLOADNORMAL("DouyinFeedAppDownloadNormal"),
  
  DOUYINFEEDEXTERNALCARD("DouyinFeedExternalCard"),
  
  DOUYINFEEDEXTERNALCOUPON("DouyinFeedExternalCoupon"),
  
  DOUYINFEEDEXTERNALINTERACTIVESPACE("DouyinFeedExternalInteractiveSpace"),
  
  DOUYINFEEDEXTERNALNORMAL("DouyinFeedExternalNormal"),
  
  DOUYINFEEDNATIVEAPPINTERACTIVESPACE("DouyinFeedNativeAppInteractiveSpace"),
  
  DOUYINFEEDNATIVEAPPNORMAL("DouyinFeedNativeAppNormal"),
  
  DOUYINFEEDNATIVECARD("DouyinFeedNativeCard"),
  
  DOUYINFEEDNATIVECOUPON("DouyinFeedNativeCoupon"),
  
  DOUYINFEEDNATIVEINTERACTIVESPACE("DouyinFeedNativeInteractiveSpace"),
  
  DOUYINFEEDNATIVENORMAL("DouyinFeedNativeNormal"),
  
  DOUYINFEEDSLIVEADNORMAL("DouyinFeedsLiveAdNormal"),
  
  DOUYINFEEDSLIVESERVICENORMAL("DouyinFeedsLiveServiceNormal"),
  
  DOUYINSPLASHNORMAL("DouyinSplashNormal"),
  
  DOUYINSPLASHSEMICCIRCLEBUTTON("DouyinSplashSemicCircleButton"),
  
  DOUYINSPLASHSHOW("DouyinSplashShow"),
  
  DOUYINSPLASHSIDESLIDE("DouyinSplashSideSlide"),
  
  DOUYINSPLASHSTATICTWIST("DouyinSplashStaticTwist"),
  
  DOUYINSPLASHUPSIDE("DouyinSplashUpSide"),
  
  DOUYINSPLASHUPSIDECARD("DouyinSplashUpSideCard"),
  
  DOUYINSPLASHVIDEOTWIST("DouyinSplashVideoTwist"),
  
  DOUYINVIDEOLIVEADCARD("DouyinVideoLiveAdCard"),
  
  DOUYINVIDEOLIVEADNORMAL("DouyinVideoLiveAdNormal"),
  
  TOUTIAOFEEDAPPDOWNLOADNORMAL("ToutiaoFeedAppDownloadNormal"),
  
  TOUTIAOFEEDAPPDOWNLOADVIDEONORMAL("ToutiaoFeedAppDownloadVideoNormal"),
  
  TOUTIAOFEEDARTICLENORMAL("ToutiaoFeedArticleNormal"),
  
  TOUTIAOFEEDARTICLEVIDEONORMAL("ToutiaoFeedArticleVideoNormal"),
  
  TOUTIAOFEEDLIVENORMAL("ToutiaoFeedLiveNormal"),
  
  TOUTIAOFEEDWEBHORIZONTALVIDEO("ToutiaoFeedWebHorizontalVideo"),
  
  TOUTIAOFEEDWEBNORMAL("ToutiaoFeedWebNormal"),
  
  TOUTIAOPROMOTIONCARD("ToutiaoPromotionCard"),
  
  TOUTIAOPROMOTIONNORMAL("ToutiaoPromotionNormal"),
  
  TOUTIAOSPLASHARTICLENORMAL("ToutiaoSplashArticleNormal"),
  
  TOUTIAOSPLASHARTICLESIDESLIDE("ToutiaoSplashArticleSideSlide"),
  
  TOUTIAOSPLASHARTICLESTATICTWIST("ToutiaoSplashArticleStaticTwist"),
  
  TOUTIAOSPLASHARTICLEUPSIDE("ToutiaoSplashArticleUpSide"),
  
  TOUTIAOSPLASHARTICLEUPSIDECARD("ToutiaoSplashArticleUpSideCard"),
  
  TOUTIAOSPLASHARTICLEVIDEOTWIST("ToutiaoSplashArticleVideoTwist"),
  
  TOUTIAOSPLASHEXTERNALNORMAL("ToutiaoSplashExternalNormal"),
  
  TOUTIAOSPLASHEXTERNALSIDESLIDE("ToutiaoSplashExternalSideSlide"),
  
  TOUTIAOSPLASHEXTERNALSTATICTWIST("ToutiaoSplashExternalStaticTwist"),
  
  TOUTIAOSPLASHEXTERNALUPSIDE("ToutiaoSplashExternalUpSide"),
  
  TOUTIAOSPLASHEXTERNALUPSIDECARD("ToutiaoSplashExternalUpSideCard"),
  
  TOUTIAOSPLASHEXTERNALVIDEOTWIST("ToutiaoSplashExternalVideoTwist"),
  
  TOUTIAOSPLASHSHOW("ToutiaoSplashShow"),
  
  XIGUAFEEDAPPDOWNLOADHORIZONTALVIDEONORMAL("XiguaFeedAppDownloadHorizontalVideoNormal"),
  
  XIGUAFEEDAPPDOWNLOADNORMAL("XiguaFeedAppDownloadNormal"),
  
  XIGUAFEEDEXTERNALHORIZONTALVIDEONORMAL("XiguaFeedExternalHorizontalVideoNormal"),
  
  XIGUAFEEDEXTERNALNORMAL("XiguaFeedExternalNormal"),
  
  XIGUASPLASHARTICLENORMAL("XiguaSplashArticleNormal"),
  
  XIGUASPLASHARTICLESIDESLIDE("XiguaSplashArticleSideSlide"),
  
  XIGUASPLASHARTICLESTATICTWIST("XiguaSplashArticleStaticTwist"),
  
  XIGUASPLASHARTICLEUPSIDE("XiguaSplashArticleUpSide"),
  
  XIGUASPLASHARTICLEUPSIDECARD("XiguaSplashArticleUpSideCard"),
  
  XIGUASPLASHARTICLEVIDEOTWIST("XiguaSplashArticleVideoTwist"),
  
  XIGUASPLASHEXTERNALNORMAL("XiguaSplashExternalNormal"),
  
  XIGUASPLASHEXTERNALSIDESLIDE("XiguaSplashExternalSideSlide"),
  
  XIGUASPLASHEXTERNALSTATICTWIST("XiguaSplashExternalStaticTwist"),
  
  XIGUASPLASHEXTERNALUPSIDE("XiguaSplashExternalUpSide"),
  
  XIGUASPLASHEXTERNALUPSIDECARD("XiguaSplashExternalUpSideCard"),
  
  XIGUASPLASHEXTERNALVIDEOTWIST("XiguaSplashExternalVideoTwist"),
  
  XIGUASPLASHSHOW("XiguaSplashShow");

  private String value;

  BrandMaterialListV30DataMaterialsCreativeTemplate(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandMaterialListV30DataMaterialsCreativeTemplate fromValue(String value) {
    for (BrandMaterialListV30DataMaterialsCreativeTemplate b : BrandMaterialListV30DataMaterialsCreativeTemplate.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandMaterialListV30DataMaterialsCreativeTemplate> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandMaterialListV30DataMaterialsCreativeTemplate enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandMaterialListV30DataMaterialsCreativeTemplate read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandMaterialListV30DataMaterialsCreativeTemplate.fromValue(value);
    }
  }
}

