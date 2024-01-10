# Marketing Java SDK

## 概述
巨量引擎开放平台 Marketing API(以下简称API) SDK 提供了Token获取、请求封装、响应解释等功能，以本地化方式轻松完成API的调用和结果的获取，旨在帮助开发者快速搭建投放管理系统。
- API version: 1.0.16
  - Build date: 2024-01-10T18:05:36.409643208+08:00[PRC]

## 使用条件
1. 使用SDK需要首先注册成为巨量引擎开发者，请参考[开发者快速入门文档](https://open.oceanengine.com/labels/7/docs/1696710498372623)
2. 使用SDK需要先拥有API的访问权限，所有SDK的使用与应用拥有的权限组相关联

## 安装

> jar包所在的maven仓库：https://artifact.bytedance.com/repository/releases/

在项目的pom文件添加如下代码，即可获取最新的jar包
```
<dependencies>
    <dependency>
        <groupId>org.openapitools</groupId>
        <artifactId>oceanengine-mapi-java-client</artifactId>
        <version>[0.0.1,)</version>
    </dependency>
</dependencies>
<repositories>
    <repository>
        <id>OceanengineOpenApi</id>
        <name>ad_open_sdk_java</name>
        <layout>default</layout>
        <url>https://artifact.bytedance.com/repository/releases/</url>
    </repository>
</repositories>
```

如果自己设置了镜像源，导致拉取不到sdk，需要做一点改动，!OceanengineOpenApi，如下
```
<mirrors>
    <mirror>
        <id>aliyunmaven</id>
        <mirrorOf>*,!OceanengineOpenApi</mirrorOf>
        <name>阿里云公共仓库</name>
        <url>https://maven.aliyun.com/repository/public</url>
    </mirror>
</mirrors>
```

## 使用
> 目前SDK支持巨量广告升级版的创编、数据报表、dou+相关接口，如需其他接口支持，请联系运营同学or加入SDK使用沟通群

### sdk包结构

- api 目录下包含了生成的 api 调用代码逻辑、api client 以及中间件逻辑
- examples 目录中包含了每个接口的调用样例代码
- model 目录中包含每个接口的模型、枚举定义

### 配置

### 初始化client
> 可参考下面的代码初始化 client，并可修改 client 的属性

```java
public static void main(String[] args) throws ApiException {
    ApiClient apiClient = new ApiClient();
    apiClient.setBasePath("https://api.oceanengine.com");
    apiClient.addDefaultHeader("Access-Token", "test");
    api.setApiClient(apiClient);
}
```

### 接口调用

#### 示例
接口调用示例可参考 examples 目录下文件
API 调用的方法名与API接口一一对应，如/open_api/v3.0/douplus/order/report/接口就对应DouplusOrderReportV30Api().openApiV30DouplusOrderReportGet()方法，以下为 接口的调用样例
```java
package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DouplusOrderReportV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DouplusOrderReportV30Filter;
import com.bytedance.ads.model.DouplusOrderReportV30GroupBy;
import com.bytedance.ads.model.DouplusOrderReportV30Response;
import com.bytedance.ads.model.DouplusOrderReportV30StatTime;


import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* API Example for DouplusOrderReportV30Api
*/
public class DouplusOrderReportV30ApiExample {

    private static final DouplusOrderReportV30Api api = new DouplusOrderReportV30Api();

    private String awemeSecUid;
    private DouplusOrderReportV30StatTime statTime;
    private List<DouplusOrderReportV30GroupBy> groupBy;
    private DouplusOrderReportV30Filter filter;
    private Long pageSize = 10L;
    private Long page = 1L;

    private void setCase() {
        awemeSecUid = "xxx";
        statTime = new DouplusOrderReportV30StatTime();
        statTime.setBeginTime("2023-06-01");
        statTime.setEndTime("2023-07-06");
        groupBy = new ArrayList<>();
        groupBy.add(DouplusOrderReportV30GroupBy.AD_ID);
        filter = new DouplusOrderReportV30Filter();
        List<Long> ids = new ArrayList<>();
        ids.add(111L);
        filter.setOrderIds(ids);
    }

    public static void main(String[] args) throws ApiException {
        DouplusOrderReportV30ApiExample example = new DouplusOrderReportV30ApiExample();
        example.setCase();

        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "80914d2cfd258e4d75aab50250bbbc4c84ceaaf6");
        api.setApiClient(apiClient);
        DouplusOrderReportV30Response response = api.openApiV30DouplusOrderReportGet(example.awemeSecUid,
        example.statTime, example.groupBy, example.filter, example.pageSize, example.page);
        System.out.println(response);
    }

}
```
### 通用接口调用
- 如果想使用 sdk 调用未生成代码的接口，可使用 CommonReqApi 接口进行调用
-  通用接口支持 Get Post 两种种方式调用
    - Get 方法使用 queryParams 传入参数
    -  Post 方式使用 requestBody 传入参数
- 更多示例可参考 examples/commonReqApiExample.go

### API接口列表


接口列表 https://open.oceanengine.com/labels/7

Class | Method | HTTP request
------------ | ------------- | -------------
*AdConvertOptimizedTargetGetV30Api* | **openApiV30AdConvertOptimizedTargetGetGet** | **GET** /open_api/v3.0/ad_convert/optimized_target/get/
*AdCostProtectStatusGetV2Api* | **openApi2AdCostProtectStatusGetGet** | **GET** /open_api/2/ad/cost_protect_status/get/
*AdGetV2Api* | **openApi2AdGetGet** | **GET** /open_api/2/ad/get/
*AdRejectReasonV2Api* | **openApi2AdRejectReasonGet** | **GET** /open_api/2/ad/reject_reason/
*AdShopInfoUpdateV30Api* | **openApiV30AdShopInfoUpdatePost** | **POST** /open_api/v3.0/ad/shop_info/update/
*AdUdUpdateV2Api* | **openApi2AdUdUpdatePost** | **POST** /open_api/2/ad/ud/update/
*AdUpdateBidV2Api* | **openApi2AdUpdateBidPost** | **POST** /open_api/2/ad/update/bid/
*AdUpdateBudgetV2Api* | **openApi2AdUpdateBudgetPost** | **POST** /open_api/2/ad/update/budget/
*AdUpdateStatusV2Api* | **openApi2AdUpdateStatusPost** | **POST** /open_api/2/ad/update/status/
*AdlabGroupCreateV30Api* | **openApiV30AdlabGroupCreatePost** | **POST** /open_api/v3.0/adlab/group/create/
*AdlabGroupDetailV30Api* | **openApiV30AdlabGroupDetailGet** | **GET** /open_api/v3.0/adlab/group/detail/
*AdlabGroupListV30Api* | **openApiV30AdlabGroupListGet** | **GET** /open_api/v3.0/adlab/group/list/
*AdlabGroupUpdateBudgetV30Api* | **openApiV30AdlabGroupUpdateBudgetPost** | **POST** /open_api/v3.0/adlab/group/update_budget/
*AdlabGroupUpdateStatusV30Api* | **openApiV30AdlabGroupUpdateStatusPost** | **POST** /open_api/v3.0/adlab/group/update_status/
*AdlabGroupUpdateV30Api* | **openApiV30AdlabGroupUpdatePost** | **POST** /open_api/v3.0/adlab/group/update/
*AdlabGroupsDeleteV30Api* | **openApiV30AdlabGroupsDeletePost** | **POST** /open_api/v3.0/adlab/groups/delete/
*AdvConvertOleConvertV2Api* | **openApi2AdvConvertOleConvertPost** | **POST** /open_api/2/adv_convert/ole/convert/
*AdvertiserAvatarGetV2Api* | **openApi2AdvertiserAvatarGetGet** | **GET** /open_api/2/advertiser/avatar/get/
*AdvertiserAvatarSubmitV2Api* | **openApi2AdvertiserAvatarSubmitPost** | **POST** /open_api/2/advertiser/avatar/submit/
*AdvertiserBudgetGetV2Api* | **openApi2AdvertiserBudgetGetGet** | **GET** /open_api/2/advertiser/budget/get/
*AdvertiserDeliveryPkgConfigV30Api* | **openApiV30AdvertiserDeliveryPkgConfigGet** | **GET** /open_api/v3.0/advertiser/delivery_pkg_config/
*AdvertiserDeliveryPkgDeleteV30Api* | **openApiV30AdvertiserDeliveryPkgDeletePost** | **POST** /open_api/v3.0/advertiser/delivery_pkg/delete/
*AdvertiserDeliveryPkgGetV30Api* | **openApiV30AdvertiserDeliveryPkgGetGet** | **GET** /open_api/v3.0/advertiser/delivery_pkg/get/
*AdvertiserDeliveryPkgSubmitV30Api* | **openApiV30AdvertiserDeliveryPkgSubmitPost** | **POST** /open_api/v3.0/advertiser/delivery_pkg/submit/
*AdvertiserDeliveryQualificationDeleteV30Api* | **openApiV30AdvertiserDeliveryQualificationDeletePost** | **POST** /open_api/v3.0/advertiser/delivery_qualification/delete/
*AdvertiserDeliveryQualificationListV30Api* | **openApiV30AdvertiserDeliveryQualificationListGet** | **GET** /open_api/v3.0/advertiser/delivery_qualification/list/
*AdvertiserDeliveryQualificationSubmitV30Api* | **openApiV30AdvertiserDeliveryQualificationSubmitPost** | **POST** /open_api/v3.0/advertiser/delivery_qualification/submit/
*AdvertiserFundDailyStatV2Api* | **openApi2AdvertiserFundDailyStatGet** | **GET** /open_api/2/advertiser/fund/daily_stat/
*AdvertiserFundGetV2Api* | **openApi2AdvertiserFundGetGet** | **GET** /open_api/2/advertiser/fund/get/
*AdvertiserFundGrantTransactionGetV2Api* | **openApi2AdvertiserFundGrantTransactionGetGet** | **GET** /open_api/2/advertiser/fund/grant_transaction/get/
*AdvertiserFundTransactionGetV2Api* | **openApi2AdvertiserFundTransactionGetGet** | **GET** /open_api/2/advertiser/fund/transaction/get/
*AdvertiserInfoV2Api* | **openApi2AdvertiserInfoGet** | **GET** /open_api/2/advertiser/info/
*AdvertiserPublicInfoV2Api* | **openApi2AdvertiserPublicInfoGet** | **GET** /open_api/2/advertiser/public_info/
*AdvertiserQualificationCreateV2V2Api* | **openApi2AdvertiserQualificationCreateV2Post** | **POST** /open_api/2/advertiser/qualification/create_v2/
*AdvertiserQualificationGetV30Api* | **openApiV30AdvertiserQualificationGetGet** | **GET** /open_api/v3.0/advertiser/qualification/get/
*AdvertiserQualificationSelectV2V2Api* | **openApi2AdvertiserQualificationSelectV2Get** | **GET** /open_api/2/advertiser/qualification/select_v2/
*AdvertiserQualificationSubmitV30Api* | **openApiV30AdvertiserQualificationSubmitPost** | **POST** /open_api/v3.0/advertiser/qualification/submit/
*AdvertiserTransferableFundGetV2Api* | **openApi2AdvertiserTransferableFundGetGet** | **GET** /open_api/2/advertiser/transferable_fund/get/
*AdvertiserUpdateBudgetV2Api* | **openApi2AdvertiserUpdateBudgetPost** | **POST** /open_api/2/advertiser/update/budget/
*AgentAdvCostReportListQueryV2Api* | **openApi2AgentAdvCostReportListQueryPost** | **POST** /open_api/2/agent/adv/cost_report/list/query/
*AgentAdvertiserCopyV2Api* | **openApi2AgentAdvertiserCopyPost** | **POST** /open_api/2/agent/advertiser/copy/
*AgentAdvertiserSelectV2Api* | **openApi2AgentAdvertiserSelectGet** | **GET** /open_api/2/agent/advertiser/select/
*AgentAdvertiserUpdateV2Api* | **openApi2AgentAdvertiserUpdatePost** | **POST** /open_api/2/agent/advertiser/update/
*AgentChildAgentSelectV2Api* | **openApi2AgentChildAgentSelectGet** | **GET** /open_api/2/agent/child_agent/select/
*AgentFundTransferSeqCommitV2Api* | **openApi2AgentFundTransferSeqCommitPost** | **POST** /open_api/2/agent/fund/transfer_seq/commit/
*AgentFundTransferSeqCreateV2Api* | **openApi2AgentFundTransferSeqCreatePost** | **POST** /open_api/2/agent/fund/transfer_seq/create/
*AgentInfoV2Api* | **openApi2AgentInfoGet** | **GET** /open_api/2/agent/info/
*AgentRefundTransferSeqCommitV2Api* | **openApi2AgentRefundTransferSeqCommitPost** | **POST** /open_api/2/agent/refund/transfer_seq/commit/
*AgentRefundTransferSeqCreateV2Api* | **openApi2AgentRefundTransferSeqCreatePost** | **POST** /open_api/2/agent/refund/transfer_seq/create/
*AnalyticsAttributionV30Api* | **openApiV30AnalyticsAttributionPost** | **POST** /open_api/v3.0/analytics/attribution/
*AssetsCreativeComponentCreateV2Api* | **openApi2AssetsCreativeComponentCreatePost** | **POST** /open_api/2/assets/creative_component/create/
*AssetsCreativeComponentGetV2Api* | **openApi2AssetsCreativeComponentGetGet** | **GET** /open_api/2/assets/creative_component/get/
*AssetsCreativeComponentUpdateV2Api* | **openApi2AssetsCreativeComponentUpdatePost** | **POST** /open_api/2/assets/creative_component/update/
*AsyncTaskCreateV2Api* | **openApi2AsyncTaskCreatePost** | **POST** /open_api/2/async_task/create/
*AsyncTaskDownloadV2Api* | **openApi2AsyncTaskDownloadGet** | **GET** /open_api/2/async_task/download/
*AsyncTaskGetV2Api* | **openApi2AsyncTaskGetGet** | **GET** /open_api/2/async_task/get/
*AudiencePackageCreateV2Api* | **openApi2AudiencePackageCreatePost** | **POST** /open_api/2/audience_package/create/
*AudiencePackageDeleteV2Api* | **openApi2AudiencePackageDeletePost** | **POST** /open_api/2/audience_package/delete/
*AudiencePackageGetV2Api* | **openApi2AudiencePackageGetGet** | **GET** /open_api/2/audience_package/get/
*AudiencePackageUpdateV2Api* | **openApi2AudiencePackageUpdatePost** | **POST** /open_api/2/audience_package/update/
*BrandActionCategoryV30Api* | **openApiV30BrandActionCategoryGet** | **GET** /open_api/v3.0/brand/action_category/
*BrandAdCreateV30Api* | **openApiV30BrandAdCreatePost** | **POST** /open_api/v3.0/brand/ad/create/
*BrandAdGetV30Api* | **openApiV30BrandAdGetGet** | **GET** /open_api/v3.0/brand/ad/get/
*BrandCampaignCreateV30Api* | **openApiV30BrandCampaignCreatePost** | **POST** /open_api/v3.0/brand/campaign/create/
*BrandCampaignGetV30Api* | **openApiV30BrandCampaignGetGet** | **GET** /open_api/v3.0/brand/campaign/get/
*BrandCreativeCreateV30Api* | **openApiV30BrandCreativeCreatePost** | **POST** /open_api/v3.0/brand/creative/create/
*BrandCreativeGetV30Api* | **openApiV30BrandCreativeGetGet** | **GET** /open_api/v3.0/brand/creative/get/
*BrandQueryStockV30Api* | **openApiV30BrandQueryStockGet** | **GET** /open_api/v3.0/brand/query_stock/
*BrandQueryYuntu5aBrandCategoryV30Api* | **openApiV30BrandQueryYuntu5aBrandCategoryGet** | **GET** /open_api/v3.0/brand/query_yuntu_5a_brand_category/
*BrandRegionGetV30Api* | **openApiV30BrandRegionGetGet** | **GET** /open_api/v3.0/brand/region/get/
*BudgetGroupCreateV30Api* | **openApiV30BudgetGroupCreatePost** | **POST** /open_api/v3.0/budget_group/create/
*BudgetGroupDeleteV30Api* | **openApiV30BudgetGroupDeletePost** | **POST** /open_api/v3.0/budget_group/delete/
*BudgetGroupListV30Api* | **openApiV30BudgetGroupListGet** | **GET** /open_api/v3.0/budget_group/list/
*BudgetGroupUpdateV30Api* | **openApiV30BudgetGroupUpdatePost** | **POST** /open_api/v3.0/budget_group/update/
*BusinessPlatformCompanyAccountGetV30Api* | **openApiV30BusinessPlatformCompanyAccountGetGet** | **GET** /open_api/v3.0/business_platform/company_account/get/
*BusinessPlatformCompanyInfoGetV30Api* | **openApiV30BusinessPlatformCompanyInfoGetGet** | **GET** /open_api/v3.0/business_platform/company_info/get/
*BusinessPlatformPartnerOrganizationListV2Api* | **openApi2BusinessPlatformPartnerOrganizationListGet** | **GET** /open_api/2/business_platform/partner_organization/list/
*CampaignCreateV2Api* | **openApi2CampaignCreatePost** | **POST** /open_api/2/campaign/create/
*CampaignGetV2Api* | **openApi2CampaignGetGet** | **GET** /open_api/2/campaign/get/
*CampaignUpdateStatusV2Api* | **openApi2CampaignUpdateStatusPost** | **POST** /open_api/2/campaign/update/status/
*CampaignUpdateV2Api* | **openApi2CampaignUpdatePost** | **POST** /open_api/2/campaign/update/
*CarouselAdGetV2Api* | **openApi2CarouselAdGetGet** | **GET** /open_api/2/carousel/ad/get/
*CarouselCreateV2Api* | **openApi2CarouselCreatePost** | **POST** /open_api/2/carousel/create/
*CarouselDeleteV2Api* | **openApi2CarouselDeletePost** | **POST** /open_api/2/carousel/delete/
*CarouselListV2Api* | **openApi2CarouselListGet** | **GET** /open_api/2/carousel/list/
*CarouselUpdateV2Api* | **openApi2CarouselUpdatePost** | **POST** /open_api/2/carousel/update/
*CdpBrandGetV30Api* | **openApiV30CdpBrandGetGet** | **GET** /open_api/v3.0/cdp/brand/get/
*ClueCouponCodeConsumeV2Api* | **openApi2ClueCouponCodeConsumePost** | **POST** /open_api/2/clue/coupon/code/consume/
*ClueCouponCodeGetV2Api* | **openApi2ClueCouponCodeGetGet** | **GET** /open_api/2/clue/coupon/code/get/
*ClueCouponCreateV2Api* | **openApi2ClueCouponCreatePost** | **POST** /open_api/2/clue/coupon/create/
*ClueCouponDetailV2Api* | **openApi2ClueCouponDetailGet** | **GET** /open_api/2/clue/coupon/detail/
*ClueCouponEmployeeCreateV2Api* | **openApi2ClueCouponEmployeeCreatePost** | **POST** /open_api/2/clue/coupon/employee/create/
*ClueCouponEmployeeDeleteV2Api* | **openApi2ClueCouponEmployeeDeletePost** | **POST** /open_api/2/clue/coupon/employee/delete/
*ClueCouponEmployeeGetV2Api* | **openApi2ClueCouponEmployeeGetGet** | **GET** /open_api/2/clue/coupon/employee/get/
*ClueCouponGetV2Api* | **openApi2ClueCouponGetGet** | **GET** /open_api/2/clue/coupon/get/
*ClueCouponUpdateV2Api* | **openApi2ClueCouponUpdatePost** | **POST** /open_api/2/clue/coupon/update/
*ClueFileUploadV2Api* | **openApi2ClueFileUploadPost** | **POST** /open_api/2/clue/file/upload/
*ClueFormCreateV2Api* | **openApi2ClueFormCreatePost** | **POST** /open_api/2/clue/form/create/
*ClueFormDeleteV2Api* | **openApi2ClueFormDeletePost** | **POST** /open_api/2/clue/form/delete/
*ClueFormDetailV2Api* | **openApi2ClueFormDetailGet** | **GET** /open_api/2/clue/form/detail/
*ClueFormListV2Api* | **openApi2ClueFormListGet** | **GET** /open_api/2/clue/form/list/
*ClueFormUpdateV2Api* | **openApi2ClueFormUpdatePost** | **POST** /open_api/2/clue/form/update/
*CluePackageUploadV2Api* | **openApi2CluePackageUploadPost** | **POST** /open_api/2/clue/package/upload/
*ClueSmartphoneCreateV2Api* | **openApi2ClueSmartphoneCreatePost** | **POST** /open_api/2/clue/smartphone/create/
*ClueSmartphoneDeleteV2Api* | **openApi2ClueSmartphoneDeletePost** | **POST** /open_api/2/clue/smartphone/delete/
*ClueSmartphoneGetV2Api* | **openApi2ClueSmartphoneGetGet** | **GET** /open_api/2/clue/smartphone/get/
*ClueSmartphoneRecordV2Api* | **openApi2ClueSmartphoneRecordGet** | **GET** /open_api/2/clue/smartphone/record/
*ClueWechatDataGetV2Api* | **openApi2ClueWechatDataGetGet** | **GET** /open_api/2/clue/wechat_data/get/
*ClueWechatInstanceDetailV2Api* | **openApi2ClueWechatInstanceDetailGet** | **GET** /open_api/2/clue/wechat_instance/detail/
*ClueWechatInstanceListV2Api* | **openApi2ClueWechatInstanceListGet** | **GET** /open_api/2/clue/wechat_instance/list/
*ClueWechatInstanceUpdateV2Api* | **openApi2ClueWechatInstanceUpdatePost** | **POST** /open_api/2/clue/wechat_instance/update/
*ClueWechatPoolListV2Api* | **openApi2ClueWechatPoolListGet** | **GET** /open_api/2/clue/wechat_pool/list/
*CreativeAdMetricsV2Api* | **openApi2CreativeAdMetricsGet** | **GET** /open_api/2/creative/ad/metrics/
*CreativeAutoGenerateConfigCreateV2Api* | **openApi2CreativeAutoGenerateConfigCreatePost** | **POST** /open_api/2/creative/auto_generate_config/create/
*CreativeAutoGenerateConfigGetV2Api* | **openApi2CreativeAutoGenerateConfigGetGet** | **GET** /open_api/2/creative/auto_generate_config/get/
*CreativeAutoGenerateConfigV2CreateV2Api* | **openApi2CreativeAutoGenerateConfigV2CreatePost** | **POST** /open_api/2/creative/auto_generate_config/v2/create/
*CreativeCustomCreativeCreateV2Api* | **openApi2CreativeCustomCreativeCreatePost** | **POST** /open_api/2/creative/custom_creative/create/
*CreativeCustomCreativeDeleteV2Api* | **openApi2CreativeCustomCreativeDeletePost** | **POST** /open_api/2/creative/custom_creative/delete/
*CreativeCustomCreativeUpdateV2Api* | **openApi2CreativeCustomCreativeUpdatePost** | **POST** /open_api/2/creative/custom_creative/update/
*CreativeDetailGetV30Api* | **openApiV30CreativeDetailGetGet** | **GET** /open_api/v3.0/creative/detail/get/
*CreativeGetV2Api* | **openApi2CreativeGetGet** | **GET** /open_api/2/creative/get/
*CreativeMaterialMetricsV2Api* | **openApi2CreativeMaterialMetricsGet** | **GET** /open_api/2/creative/material/metrics/
*CreativeProceduralCreativeCreateV2Api* | **openApi2CreativeProceduralCreativeCreatePost** | **POST** /open_api/2/creative/procedural_creative/create/
*CreativeProceduralCreativeUpdateV2Api* | **openApi2CreativeProceduralCreativeUpdatePost** | **POST** /open_api/2/creative/procedural_creative/update/
*CreativeRejectReasonV2Api* | **openApi2CreativeRejectReasonGet** | **GET** /open_api/2/creative/reject_reason/
*CreativeStatusUpdateV2V2Api* | **openApi2CreativeStatusUpdateV2Post** | **POST** /open_api/2/creative/status/update_v2/
*CreativeStrategyListV2Api* | **openApi2CreativeStrategyListGet** | **GET** /open_api/2/creative/strategy/list/
*CreativeTemplateDetailGetV2Api* | **openApi2CreativeTemplateDetailGetGet** | **GET** /open_api/2/creative/template/detail/get/
*CreativeTemplateListGetV2Api* | **openApi2CreativeTemplateListGetGet** | **GET** /open_api/2/creative/template/list/get/
*CreativeTemplateTagsGetV2Api* | **openApi2CreativeTemplateTagsGetGet** | **GET** /open_api/2/creative/template/tags/get/
*CustomerCenterAdvertiserCopyV2Api* | **openApi2CustomerCenterAdvertiserCopyPost** | **POST** /open_api/2/customer_center/advertiser/copy/
*CustomerCenterAdvertiserListV2Api* | **openApi2CustomerCenterAdvertiserListGet** | **GET** /open_api/2/customer_center/advertiser/list/
*CustomerCenterAdvertiserTransferableListV2Api* | **openApi2CustomerCenterAdvertiserTransferableListGet** | **GET** /open_api/2/customer_center/advertiser/transferable/list/
*CustomerCenterFundTransferSeqCommitV2Api* | **openApi2CustomerCenterFundTransferSeqCommitPost** | **POST** /open_api/2/customer_center/fund/transfer_seq/commit/
*CustomerCenterFundTransferSeqCreateV2Api* | **openApi2CustomerCenterFundTransferSeqCreatePost** | **POST** /open_api/2/customer_center/fund/transfer_seq/create/
*DecorationCouponGetV30Api* | **openApiV30DecorationCouponGetGet** | **GET** /open_api/v3.0/decoration/coupon/get/
*DmpBrandGetV2Api* | **openApi2DmpBrandGetGet** | **GET** /open_api/2/dmp/brand/get/
*DmpCustomAudienceCopyV2Api* | **openApi2DmpCustomAudienceCopyPost** | **POST** /open_api/2/dmp/custom_audience/copy/
*DmpCustomAudienceDeleteV2Api* | **openApi2DmpCustomAudienceDeletePost** | **POST** /open_api/2/dmp/custom_audience/delete/
*DmpCustomAudiencePublishV2Api* | **openApi2DmpCustomAudiencePublishPost** | **POST** /open_api/2/dmp/custom_audience/publish/
*DmpCustomAudiencePushV2V2Api* | **openApi2DmpCustomAudiencePushV2Post** | **POST** /open_api/2/dmp/custom_audience/push_v2/
*DmpCustomAudienceReadV2Api* | **openApi2DmpCustomAudienceReadGet** | **GET** /open_api/2/dmp/custom_audience/read/
*DmpCustomAudienceSelectV2Api* | **openApi2DmpCustomAudienceSelectGet** | **GET** /open_api/2/dmp/custom_audience/select/
*DmpDataSourceCreateV2Api* | **openApi2DmpDataSourceCreatePost** | **POST** /open_api/2/dmp/data_source/create/
*DmpDataSourceReadV2Api* | **openApi2DmpDataSourceReadGet** | **GET** /open_api/2/dmp/data_source/read/
*DmpDataSourceUpdateV2Api* | **openApi2DmpDataSourceUpdatePost** | **POST** /open_api/2/dmp/data_source/update/
*DouplusOrderListV30Api* | **openApiV30DouplusOrderListGet** | **GET** /open_api/v3.0/douplus/order/list/
*DouplusOrderReportV30Api* | **openApiV30DouplusOrderReportGet** | **GET** /open_api/v3.0/douplus/order/report/
*DpaAssetsDetailReadV2Api* | **openApi2DpaAssetsDetailReadGet** | **GET** /open_api/2/dpa/assets/detail/read/
*DpaAssetsListV2Api* | **openApi2DpaAssetsListGet** | **GET** /open_api/2/dpa/assets/list/
*DpaCategoryGetV2Api* | **openApi2DpaCategoryGetGet** | **GET** /open_api/2/dpa/category/get/
*DpaCheckIndexEntryProgressV2Api* | **openApi2DpaCheckIndexEntryProgressPost** | **POST** /open_api/2/dpa/check_index_entry_progress/
*DpaClueProductDetailV2Api* | **openApi2DpaClueProductDetailGet** | **GET** /open_api/2/dpa/clue_product/detail/
*DpaClueProductListV2Api* | **openApi2DpaClueProductListGet** | **GET** /open_api/2/dpa/clue_product/list/
*DpaDetailGetV2Api* | **openApi2DpaDetailGetGet** | **GET** /open_api/2/dpa/detail/get/
*DpaDictGetV2Api* | **openApi2DpaDictGetGet** | **GET** /open_api/2/dpa/dict/get/
*DpaMetaGetV2Api* | **openApi2DpaMetaGetGet** | **GET** /open_api/2/dpa/meta/get/
*DpaProductAvailablesV2Api* | **openApi2DpaProductAvailablesGet** | **GET** /open_api/2/dpa/product/availables/
*DpaProductCreateV2Api* | **openApi2DpaProductCreatePost** | **POST** /open_api/2/dpa/product/create/
*DpaProductDeleteV2Api* | **openApi2DpaProductDeletePost** | **POST** /open_api/2/dpa/product/delete/
*DpaProductDetailGetV2Api* | **openApi2DpaProductDetailGetGet** | **GET** /open_api/2/dpa/product/detail/get/
*DpaProductStatusBatchUpdateV2Api* | **openApi2DpaProductStatusBatchUpdatePost** | **POST** /open_api/2/dpa/product_status/batch_update/
*DpaProductUpdateV2Api* | **openApi2DpaProductUpdatePost** | **POST** /open_api/2/dpa/product/update/
*DpaTemplateGetV2Api* | **openApi2DpaTemplateGetGet** | **GET** /open_api/2/dpa/template/get/
*DpaVideoGetV2Api* | **openApi2DpaVideoGetGet** | **GET** /open_api/2/dpa/video/get/
*EnterpriseBindListGetV10Api* | **openApiV10EnterpriseBindListGetGet** | **GET** /open_api/v1.0/enterprise/bind/list/get/
*EnterpriseCommentDetailV10Api* | **openApiV10EnterpriseCommentDetailGet** | **GET** /open_api/v1.0/enterprise/comment/detail/
*EnterpriseCommentListGetV10Api* | **openApiV10EnterpriseCommentListGetGet** | **GET** /open_api/v1.0/enterprise/comment/list/get/
*EnterpriseCommentReplyListV10Api* | **openApiV10EnterpriseCommentReplyListGet** | **GET** /open_api/v1.0/enterprise/comment/reply/list/
*EnterpriseCommentReplyV10Api* | **openApiV10EnterpriseCommentReplyPost** | **POST** /open_api/v1.0/enterprise/comment/reply/
*EnterpriseFlowCategoryGetV10Api* | **openApiV10EnterpriseFlowCategoryGetGet** | **GET** /open_api/v1.0/enterprise/flow/category/get/
*EnterpriseInfoV10Api* | **openApiV10EnterpriseInfoGet** | **GET** /open_api/v1.0/enterprise/info/
*EnterpriseItemListV10Api* | **openApiV10EnterpriseItemListGet** | **GET** /open_api/v1.0/enterprise/item/list/
*EnterpriseOperationLogGetV10Api* | **openApiV10EnterpriseOperationLogGetGet** | **GET** /open_api/v1.0/enterprise/operation/log/get/
*EnterpriseOverviewDataGetV10Api* | **openApiV10EnterpriseOverviewDataGetGet** | **GET** /open_api/v1.0/enterprise/overview/data/get/
*EnterpriseVideoInfoGetV10Api* | **openApiV10EnterpriseVideoInfoGetGet** | **GET** /open_api/v1.0/enterprise/video/info/get/
*EventManagerAssetsCreateV2Api* | **openApi2EventManagerAssetsCreatePost** | **POST** /open_api/2/event_manager/assets/create/
*EventManagerAvailableEventsGetV2Api* | **openApi2EventManagerAvailableEventsGetGet** | **GET** /open_api/2/event_manager/available_events/get/
*EventManagerDeepBidTypeGetV30Api* | **openApiV30EventManagerDeepBidTypeGetGet** | **GET** /open_api/v3.0/event_manager/deep_bid_type/get/
*EventManagerEventConfigsGetV2Api* | **openApi2EventManagerEventConfigsGetGet** | **GET** /open_api/2/event_manager/event_configs/get/
*EventManagerEventsCreateV2Api* | **openApi2EventManagerEventsCreatePost** | **POST** /open_api/2/event_manager/events/create/
*EventManagerOfflineDataCreateV2Api* | **openApi2EventManagerOfflineDataCreatePost** | **POST** /open_api/2/event_manager/offline_data/create/
*EventManagerOptimizedGoalGetV2V30Api* | **openApiV30EventManagerOptimizedGoalGetV2Get** | **GET** /open_api/v3.0/event_manager/optimized_goal/get_v2/
*EventManagerShareCancelV30Api* | **openApiV30EventManagerShareCancelPost** | **POST** /open_api/v3.0/event_manager/share/cancel/
*EventManagerShareGetV30Api* | **openApiV30EventManagerShareGetGet** | **GET** /open_api/v3.0/event_manager/share/get/
*EventManagerShareV30Api* | **openApiV30EventManagerSharePost** | **POST** /open_api/v3.0/event_manager/share/
*EventManagerTrackUrlCreateV2Api* | **openApi2EventManagerTrackUrlCreatePost** | **POST** /open_api/2/event_manager/track_url/create/
*EventManagerTrackUrlGetV2Api* | **openApi2EventManagerTrackUrlGetGet** | **GET** /open_api/2/event_manager/track_url/get/
*EventManagerTrackUrlUpdateV2Api* | **openApi2EventManagerTrackUrlUpdatePost** | **POST** /open_api/2/event_manager/track_url/update/
*FileAutoGenerateSourceGetV2Api* | **openApi2FileAutoGenerateSourceGetGet** | **GET** /open_api/2/file/auto_generate_source/get/
*FileImageAdGetV2Api* | **openApi2FileImageAdGetGet** | **GET** /open_api/2/file/image/ad/get/
*FileImageDeleteV30Api* | **openApiV30FileImageDeletePost** | **POST** /open_api/v3.0/file/image/delete/
*FileImageGetV2Api* | **openApi2FileImageGetGet** | **GET** /open_api/2/file/image/get/
*FileMaterialAuditResultGetV2Api* | **openApi2FileMaterialAuditResultGetGet** | **GET** /open_api/2/file/material/audit_result/get/
*FileMaterialBindV2Api* | **openApi2FileMaterialBindPost** | **POST** /open_api/2/file/material/bind/
*FileMaterialDetailV2Api* | **openApi2FileMaterialDetailGet** | **GET** /open_api/2/file/material/detail/
*FileMaterialListV2Api* | **openApi2FileMaterialListGet** | **GET** /open_api/2/file/material/list/
*FileMediaGetV2Api* | **openApi2FileMediaGetGet** | **GET** /open_api/2/file/media/get/
*FilePreauditGetV30Api* | **openApiV30FilePreauditGetGet** | **GET** /open_api/v3.0/file/preaudit/get/
*FilePreauditSubmitV30Api* | **openApiV30FilePreauditSubmitPost** | **POST** /open_api/v3.0/file/preaudit/submit/
*FileQualityGetV30Api* | **openApiV30FileQualityGetGet** | **GET** /open_api/v3.0/file/quality/get/
*FileQualitySubmitV30Api* | **openApiV30FileQualitySubmitPost** | **POST** /open_api/v3.0/file/quality/submit/
*FileRebateMaterialSearchV2Api* | **openApi2FileRebateMaterialSearchGet** | **GET** /open_api/2/file/rebate/material_search/
*FileVideoAdGetV2Api* | **openApi2FileVideoAdGetGet** | **GET** /open_api/2/file/video/ad/get/
*FileVideoAwemeGetV2Api* | **openApi2FileVideoAwemeGetGet** | **GET** /open_api/2/file/video/aweme/get/
*FileVideoDeleteV2Api* | **openApi2FileVideoDeletePost** | **POST** /open_api/2/file/video/delete/
*FileVideoEfficiencyGetV2Api* | **openApi2FileVideoEfficiencyGetGet** | **GET** /open_api/2/file/video/efficiency/get/
*FileVideoGetV2Api* | **openApi2FileVideoGetGet** | **GET** /open_api/2/file/video/get/
*FileVideoMaterialClearTaskCreateV2Api* | **openApi2FileVideoMaterialClearTaskCreatePost** | **POST** /open_api/2/file/video/material/clear_task/create/
*FileVideoMaterialClearTaskGetV2Api* | **openApi2FileVideoMaterialClearTaskGetGet** | **GET** /open_api/2/file/video/material/clear_task/get/
*FileVideoMaterialClearTaskResultGetV2Api* | **openApi2FileVideoMaterialClearTaskResultGetGet** | **GET** /open_api/2/file/video/material/clear_task_result/get/
*FileVideoPauseV2Api* | **openApi2FileVideoPausePost** | **POST** /open_api/2/file/video/pause/
*FileVideoUpdateV2Api* | **openApi2FileVideoUpdatePost** | **POST** /open_api/2/file/video/update/
*FundSharedWalletBalanceGetV2Api* | **openApi2FundSharedWalletBalanceGetGet** | **GET** /open_api/2/fund/shared_wallet_balance/get/
*KeywordCreateV2V2Api* | **openApi2KeywordCreateV2Post** | **POST** /open_api/2/keyword/create_v2/
*KeywordCreateV30Api* | **openApiV30KeywordCreatePost** | **POST** /open_api/v3.0/keyword/create/
*KeywordDeleteV2V2Api* | **openApi2KeywordDeleteV2Post** | **POST** /open_api/2/keyword/delete_v2/
*KeywordDeleteV30Api* | **openApiV30KeywordDeletePost** | **POST** /open_api/v3.0/keyword/delete/
*KeywordFeedadsSuggestV2Api* | **openApi2KeywordFeedadsSuggestGet** | **GET** /open_api/2/keyword_feedads/suggest/
*KeywordGetV2Api* | **openApi2KeywordGetGet** | **GET** /open_api/2/keyword/get/
*KeywordListV30Api* | **openApiV30KeywordListGet** | **GET** /open_api/v3.0/keyword/list/
*KeywordUpdateV2V2Api* | **openApi2KeywordUpdateV2Post** | **POST** /open_api/2/keyword/update_v2/
*KeywordUpdateV30Api* | **openApiV30KeywordUpdatePost** | **POST** /open_api/v3.0/keyword/update/
*MajordomoAdvertiserSelectV2Api* | **openApi2MajordomoAdvertiserSelectGet** | **GET** /open_api/2/majordomo/advertiser/select/
*MaterialStatusUpdateV30Api* | **openApiV30MaterialStatusUpdatePost** | **POST** /open_api/v3.0/material/status/update/
*NativeAnchorCreateV30Api* | **openApiV30NativeAnchorCreatePost** | **POST** /open_api/v3.0/native_anchor/create/
*NativeAnchorDeleteV30Api* | **openApiV30NativeAnchorDeletePost** | **POST** /open_api/v3.0/native_anchor/delete/
*NativeAnchorGetDetailV30Api* | **openApiV30NativeAnchorGetDetailGet** | **GET** /open_api/v3.0/native_anchor/get/detail/
*NativeAnchorGetV30Api* | **openApiV30NativeAnchorGetGet** | **GET** /open_api/v3.0/native_anchor/get/
*NativeAnchorQrcodePreviewGetV30Api* | **openApiV30NativeAnchorQrcodePreviewGetGet** | **GET** /open_api/v3.0/native_anchor/qrcode_preview/get/
*NativeAnchorUpdateV30Api* | **openApiV30NativeAnchorUpdatePost** | **POST** /open_api/v3.0/native_anchor/update/
*Oauth2AccessTokenApi* | **openApiOauth2AccessTokenPost** | **POST** /open_api/oauth2/access_token/
*Oauth2AdvertiserGetApi* | **openApiOauth2AdvertiserGetGet** | **GET** /open_api/oauth2/advertiser/get/
*Oauth2AppAccessTokenApi* | **openApiOauth2AppAccessTokenPost** | **POST** /open_api/oauth2/app_access_token/
*Oauth2RefreshTokenApi* | **openApiOauth2RefreshTokenPost** | **POST** /open_api/oauth2/refresh_token/
*Oauth2RenewTokenApi* | **openApiOauth2RenewTokenPost** | **POST** /open_api/oauth2/renew_token/
*ProjectBudgetUpdateV30Api* | **openApiV30ProjectBudgetUpdatePost** | **POST** /open_api/v3.0/project/budget/update/
*ProjectCreateV30Api* | **openApiV30ProjectCreatePost** | **POST** /open_api/v3.0/project/create/
*ProjectDeleteV30Api* | **openApiV30ProjectDeletePost** | **POST** /open_api/v3.0/project/delete/
*ProjectListV30Api* | **openApiV30ProjectListGet** | **GET** /open_api/v3.0/project/list/
*ProjectScheduleTimeUpdateV30Api* | **openApiV30ProjectScheduleTimeUpdatePost** | **POST** /open_api/v3.0/project/schedule_time/update/
*ProjectStatusUpdateV30Api* | **openApiV30ProjectStatusUpdatePost** | **POST** /open_api/v3.0/project/status/update/
*ProjectUpdateV30Api* | **openApiV30ProjectUpdatePost** | **POST** /open_api/v3.0/project/update/
*ProjectWeekScheduleUpdateV30Api* | **openApiV30ProjectWeekScheduleUpdatePost** | **POST** /open_api/v3.0/project/week_schedule/update/
*PromotionAidGetV30Api* | **openApiV30PromotionAidGetGet** | **GET** /open_api/v3.0/promotion/aid/get/
*PromotionAutoGenerateConfigCreateV30Api* | **openApiV30PromotionAutoGenerateConfigCreatePost** | **POST** /open_api/v3.0/promotion/auto_generate_config/create/
*PromotionAutoGenerateConfigGetV30Api* | **openApiV30PromotionAutoGenerateConfigGetGet** | **GET** /open_api/v3.0/promotion/auto_generate_config/get/
*PromotionBidUpdateV30Api* | **openApiV30PromotionBidUpdatePost** | **POST** /open_api/v3.0/promotion/bid/update/
*PromotionBudgetUpdateV30Api* | **openApiV30PromotionBudgetUpdatePost** | **POST** /open_api/v3.0/promotion/budget/update/
*PromotionCostProtectStatusGetV30Api* | **openApiV30PromotionCostProtectStatusGetGet** | **GET** /open_api/v3.0/promotion/cost_protect_status/get/
*PromotionCreateV30Api* | **openApiV30PromotionCreatePost** | **POST** /open_api/v3.0/promotion/create/
*PromotionDeepbidUpdateV30Api* | **openApiV30PromotionDeepbidUpdatePost** | **POST** /open_api/v3.0/promotion/deepbid/update/
*PromotionDeleteV30Api* | **openApiV30PromotionDeletePost** | **POST** /open_api/v3.0/promotion/delete/
*PromotionListV30Api* | **openApiV30PromotionListGet** | **GET** /open_api/v3.0/promotion/list/
*PromotionRejectReasonGetV30Api* | **openApiV30PromotionRejectReasonGetGet** | **GET** /open_api/v3.0/promotion/reject_reason/get/
*PromotionScheduleTimeUpdateV30Api* | **openApiV30PromotionScheduleTimeUpdatePost** | **POST** /open_api/v3.0/promotion/schedule_time/update/
*PromotionShopInfoUpdateV30Api* | **openApiV30PromotionShopInfoUpdatePost** | **POST** /open_api/v3.0/promotion/shop_info/update/
*PromotionStatusUpdateV30Api* | **openApiV30PromotionStatusUpdatePost** | **POST** /open_api/v3.0/promotion/status/update/
*PromotionUpdateV30Api* | **openApiV30PromotionUpdatePost** | **POST** /open_api/v3.0/promotion/update/
*QianchuanAccountBalanceGetV10Api* | **openApiV10QianchuanAccountBalanceGetGet** | **GET** /open_api/v1.0/qianchuan/account/balance/get/
*QianchuanAccountBudgetGetV10Api* | **openApiV10QianchuanAccountBudgetGetGet** | **GET** /open_api/v1.0/qianchuan/account/budget/get/
*QianchuanAccountBudgetUpdateV10Api* | **openApiV10QianchuanAccountBudgetUpdatePost** | **POST** /open_api/v1.0/qianchuan/account/budget/update/
*QianchuanAdBidUpdateV10Api* | **openApiV10QianchuanAdBidUpdatePost** | **POST** /open_api/v1.0/qianchuan/ad/bid/update/
*QianchuanAdBudgetUpdateV10Api* | **openApiV10QianchuanAdBudgetUpdatePost** | **POST** /open_api/v1.0/qianchuan/ad/budget/update/
*QianchuanAdCompensateStatusGetV10Api* | **openApiV10QianchuanAdCompensateStatusGetGet** | **GET** /open_api/v1.0/qianchuan/ad/compensate_status/get/
*QianchuanAdCreateV10Api* | **openApiV10QianchuanAdCreatePost** | **POST** /open_api/v1.0/qianchuan/ad/create/
*QianchuanAdDetailGetV10Api* | **openApiV10QianchuanAdDetailGetGet** | **GET** /open_api/v1.0/qianchuan/ad/detail/get/
*QianchuanAdGetV10Api* | **openApiV10QianchuanAdGetGet** | **GET** /open_api/v1.0/qianchuan/ad/get/
*QianchuanAdKeywordsGetV10Api* | **openApiV10QianchuanAdKeywordsGetGet** | **GET** /open_api/v1.0/qianchuan/ad/keywords/get/
*QianchuanAdKeywordsUpdateV10Api* | **openApiV10QianchuanAdKeywordsUpdatePost** | **POST** /open_api/v1.0/qianchuan/ad/keywords/update/
*QianchuanAdLearingStatusGetV10Api* | **openApiV10QianchuanAdLearingStatusGetGet** | **GET** /open_api/v1.0/qianchuan/ad/learing_status/get/
*QianchuanAdPivativewordsGetV10Api* | **openApiV10QianchuanAdPivativewordsGetGet** | **GET** /open_api/v1.0/qianchuan/ad/pivativewords/get/
*QianchuanAdPivativewordsUpdateV10Api* | **openApiV10QianchuanAdPivativewordsUpdatePost** | **POST** /open_api/v1.0/qianchuan/ad/pivativewords/update/
*QianchuanAdQuotaGetV10Api* | **openApiV10QianchuanAdQuotaGetGet** | **GET** /open_api/v1.0/qianchuan/ad/quota/get/
*QianchuanAdRecommendKeywordsGetV10Api* | **openApiV10QianchuanAdRecommendKeywordsGetGet** | **GET** /open_api/v1.0/qianchuan/ad/recommend_keywords/get/
*QianchuanAdRegionUpdateV10Api* | **openApiV10QianchuanAdRegionUpdatePost** | **POST** /open_api/v1.0/qianchuan/ad/region/update/
*QianchuanAdRejectReasonV10Api* | **openApiV10QianchuanAdRejectReasonGet** | **GET** /open_api/v1.0/qianchuan/ad/reject_reason/
*QianchuanAdScheduleDateUpdateV10Api* | **openApiV10QianchuanAdScheduleDateUpdatePost** | **POST** /open_api/v1.0/qianchuan/ad/schedule_date/update/
*QianchuanAdScheduleFixedRangeUpdateV10Api* | **openApiV10QianchuanAdScheduleFixedRangeUpdatePost** | **POST** /open_api/v1.0/qianchuan/ad/schedule_fixed_range/update/
*QianchuanAdScheduleTimeUpdateV10Api* | **openApiV10QianchuanAdScheduleTimeUpdatePost** | **POST** /open_api/v1.0/qianchuan/ad/schedule_time/update/
*QianchuanAdStatusUpdateV10Api* | **openApiV10QianchuanAdStatusUpdatePost** | **POST** /open_api/v1.0/qianchuan/ad/status/update/
*QianchuanAdUpdateV10Api* | **openApiV10QianchuanAdUpdatePost** | **POST** /open_api/v1.0/qianchuan/ad/update/
*QianchuanAdvertiserTypeGetV10Api* | **openApiV10QianchuanAdvertiserTypeGetGet** | **GET** /open_api/v1.0/qianchuan/advertiser/type/get/
*QianchuanAudienceCreateByFileV10Api* | **openApiV10QianchuanAudienceCreateByFilePost** | **POST** /open_api/v1.0/qianchuan/audience/create_by_file/
*QianchuanAudienceDeleteV10Api* | **openApiV10QianchuanAudienceDeletePost** | **POST** /open_api/v1.0/qianchuan/audience/delete/
*QianchuanAudienceGroupGetV10Api* | **openApiV10QianchuanAudienceGroupGetGet** | **GET** /open_api/v1.0/qianchuan/audience_group/get/
*QianchuanAudienceListGetV10Api* | **openApiV10QianchuanAudienceListGetGet** | **GET** /open_api/v1.0/qianchuan/audience_list/get/
*QianchuanAudiencePushV10Api* | **openApiV10QianchuanAudiencePushPost** | **POST** /open_api/v1.0/qianchuan/audience/push/
*QianchuanAwemeAuthorizedGetV10Api* | **openApiV10QianchuanAwemeAuthorizedGetGet** | **GET** /open_api/v1.0/qianchuan/aweme/authorized/get/
*QianchuanAwemeEstimateProfitV10Api* | **openApiV10QianchuanAwemeEstimateProfitGet** | **GET** /open_api/v1.0/qianchuan/aweme/estimate_profit/
*QianchuanAwemeInterestActionInterestKeywordV10Api* | **openApiV10QianchuanAwemeInterestActionInterestKeywordGet** | **GET** /open_api/v1.0/qianchuan/aweme/interest_action/interest/keyword/
*QianchuanAwemeOrderBudgetAddV10Api* | **openApiV10QianchuanAwemeOrderBudgetAddPost** | **POST** /open_api/v1.0/qianchuan/aweme/order/budget/add/
*QianchuanAwemeOrderCreateV10Api* | **openApiV10QianchuanAwemeOrderCreatePost** | **POST** /open_api/v1.0/qianchuan/aweme/order/create/
*QianchuanAwemeOrderDetailGetV10Api* | **openApiV10QianchuanAwemeOrderDetailGetGet** | **GET** /open_api/v1.0/qianchuan/aweme/order/detail/get/
*QianchuanAwemeOrderGetV10Api* | **openApiV10QianchuanAwemeOrderGetGet** | **GET** /open_api/v1.0/qianchuan/aweme/order/get/
*QianchuanAwemeOrderQuotaGetV10Api* | **openApiV10QianchuanAwemeOrderQuotaGetGet** | **GET** /open_api/v1.0/qianchuan/aweme/order/quota/get/
*QianchuanAwemeOrderSuggestDeliveryTimeGetV10Api* | **openApiV10QianchuanAwemeOrderSuggestDeliveryTimeGetGet** | **GET** /open_api/v1.0/qianchuan/aweme/order/suggest/delivery_time/get/
*QianchuanAwemeOrderTerminateV10Api* | **openApiV10QianchuanAwemeOrderTerminatePost** | **POST** /open_api/v1.0/qianchuan/aweme/order/terminate/
*QianchuanAwemeProductAvailableGetV10Api* | **openApiV10QianchuanAwemeProductAvailableGetGet** | **GET** /open_api/v1.0/qianchuan/aweme/product/available/get/
*QianchuanAwemeReportOrderGetV10Api* | **openApiV10QianchuanAwemeReportOrderGetGet** | **GET** /open_api/v1.0/qianchuan/aweme/report/order/get/
*QianchuanAwemeSuggestBidV10Api* | **openApiV10QianchuanAwemeSuggestBidGet** | **GET** /open_api/v1.0/qianchuan/aweme/suggest_bid/
*QianchuanAwemeSuggestRoiGoalV10Api* | **openApiV10QianchuanAwemeSuggestRoiGoalGet** | **GET** /open_api/v1.0/qianchuan/aweme/suggest/roi/goal/
*QianchuanAwemeVideoGetV10Api* | **openApiV10QianchuanAwemeVideoGetGet** | **GET** /open_api/v1.0/qianchuan/aweme/video/get/
*QianchuanBatchCampaignStatusUpdateV10Api* | **openApiV10QianchuanBatchCampaignStatusUpdatePost** | **POST** /open_api/v1.0/qianchuan/batch_campaign_status/update/
*QianchuanBrandAuthorizedGetV10Api* | **openApiV10QianchuanBrandAuthorizedGetGet** | **GET** /open_api/v1.0/qianchuan/brand/authorized/get/
*QianchuanCampaignCreateV10Api* | **openApiV10QianchuanCampaignCreatePost** | **POST** /open_api/v1.0/qianchuan/campaign/create/
*QianchuanCampaignListGetV10Api* | **openApiV10QianchuanCampaignListGetGet** | **GET** /open_api/v1.0/qianchuan/campaign_list/get/
*QianchuanCampaignUpdateV10Api* | **openApiV10QianchuanCampaignUpdatePost** | **POST** /open_api/v1.0/qianchuan/campaign/update/
*QianchuanCarouselAwemeGetV10Api* | **openApiV10QianchuanCarouselAwemeGetGet** | **GET** /open_api/v1.0/qianchuan/carousel/aweme/get/
*QianchuanCarouselGetV10Api* | **openApiV10QianchuanCarouselGetGet** | **GET** /open_api/v1.0/qianchuan/carousel/get/
*QianchuanCreativeGetV10Api* | **openApiV10QianchuanCreativeGetGet** | **GET** /open_api/v1.0/qianchuan/creative/get/
*QianchuanCreativeRejectReasonV10Api* | **openApiV10QianchuanCreativeRejectReasonGet** | **GET** /open_api/v1.0/qianchuan/creative/reject_reason/
*QianchuanCreativeStatusUpdateV10Api* | **openApiV10QianchuanCreativeStatusUpdatePost** | **POST** /open_api/v1.0/qianchuan/creative/status/update/
*QianchuanDmpAudiencesGetV10Api* | **openApiV10QianchuanDmpAudiencesGetGet** | **GET** /open_api/v1.0/qianchuan/dmp/audiences/get/
*QianchuanEcpAwemeAdGetV10Api* | **openApiV10QianchuanEcpAwemeAdGetGet** | **GET** /open_api/v1.0/qianchuan/ecp_aweme_ad/get/
*QianchuanEstimateEffectV10Api* | **openApiV10QianchuanEstimateEffectGet** | **GET** /open_api/v1.0/qianchuan/estimate/effect/
*QianchuanFileImageDeleteV10Api* | **openApiV10QianchuanFileImageDeletePost** | **POST** /open_api/v1.0/qianchuan/file/image/delete/
*QianchuanFileVideoAwemeGetV10Api* | **openApiV10QianchuanFileVideoAwemeGetGet** | **GET** /open_api/v1.0/qianchuan/file/video/aweme/get/
*QianchuanFileVideoDeleteV10Api* | **openApiV10QianchuanFileVideoDeletePost** | **POST** /open_api/v1.0/qianchuan/file/video/delete/
*QianchuanFileVideoEfficiencyGetV10Api* | **openApiV10QianchuanFileVideoEfficiencyGetGet** | **GET** /open_api/v1.0/qianchuan/file/video/efficiency/get/
*QianchuanFileVideoOriginalGetV10Api* | **openApiV10QianchuanFileVideoOriginalGetGet** | **GET** /open_api/v1.0/qianchuan/file/video/original/get/
*QianchuanFinanceDetailGetV10Api* | **openApiV10QianchuanFinanceDetailGetGet** | **GET** /open_api/v1.0/qianchuan/finance/detail/get/
*QianchuanFinanceWalletGetV10Api* | **openApiV10QianchuanFinanceWalletGetGet** | **GET** /open_api/v1.0/qianchuan/finance/wallet/get/
*QianchuanImageGetV10Api* | **openApiV10QianchuanImageGetGet** | **GET** /open_api/v1.0/qianchuan/image/get/
*QianchuanKeywordCheckV10Api* | **openApiV10QianchuanKeywordCheckPost** | **POST** /open_api/v1.0/qianchuan/keyword/check/
*QianchuanKeywordPackageGetV10Api* | **openApiV10QianchuanKeywordPackageGetGet** | **GET** /open_api/v1.0/qianchuan/keyword_package/get/
*QianchuanLqAdGetV10Api* | **openApiV10QianchuanLqAdGetGet** | **GET** /open_api/v1.0/qianchuan/lq_ad/get/
*QianchuanOrientationPackageGetV10Api* | **openApiV10QianchuanOrientationPackageGetGet** | **GET** /open_api/v1.0/qianchuan/orientation_package/get/
*QianchuanProductAnalyseCompareCreativeV10Api* | **openApiV10QianchuanProductAnalyseCompareCreativeGet** | **GET** /open_api/v1.0/qianchuan/product/analyse/compare_creative/
*QianchuanProductAnalyseCompareStatsDataV10Api* | **openApiV10QianchuanProductAnalyseCompareStatsDataGet** | **GET** /open_api/v1.0/qianchuan/product/analyse/compare_stats_data/
*QianchuanProductAnalyseListV10Api* | **openApiV10QianchuanProductAnalyseListGet** | **GET** /open_api/v1.0/qianchuan/product/analyse/list/
*QianchuanProductAvailableGetV10Api* | **openApiV10QianchuanProductAvailableGetGet** | **GET** /open_api/v1.0/qianchuan/product/available/get/
*QianchuanReportAdGetV10Api* | **openApiV10QianchuanReportAdGetGet** | **GET** /open_api/v1.0/qianchuan/report/ad/get/
*QianchuanReportAdvertiserGetV10Api* | **openApiV10QianchuanReportAdvertiserGetGet** | **GET** /open_api/v1.0/qianchuan/report/advertiser/get/
*QianchuanReportCreativeGetV10Api* | **openApiV10QianchuanReportCreativeGetGet** | **GET** /open_api/v1.0/qianchuan/report/creative/get/
*QianchuanReportCustomConfigGetV10Api* | **openApiV10QianchuanReportCustomConfigGetGet** | **GET** /open_api/v1.0/qianchuan/report/custom/config/get/
*QianchuanReportCustomGetV10Api* | **openApiV10QianchuanReportCustomGetGet** | **GET** /open_api/v1.0/qianchuan/report/custom/get/
*QianchuanReportLiveGetV10Api* | **openApiV10QianchuanReportLiveGetGet** | **GET** /open_api/v1.0/qianchuan/report/live/get/
*QianchuanReportLongTransferOrderGetV10Api* | **openApiV10QianchuanReportLongTransferOrderGetGet** | **GET** /open_api/v1.0/qianchuan/report/long_transfer/order/get/
*QianchuanReportMaterialGetV10Api* | **openApiV10QianchuanReportMaterialGetGet** | **GET** /open_api/v1.0/qianchuan/report/material/get/
*QianchuanReportSearchWordGetV10Api* | **openApiV10QianchuanReportSearchWordGetGet** | **GET** /open_api/v1.0/qianchuan/report/search_word/get/
*QianchuanReportUniPromotionGetV10Api* | **openApiV10QianchuanReportUniPromotionGetGet** | **GET** /open_api/v1.0/qianchuan/report/uni_promotion/get/
*QianchuanReportVideoUserLoseGetV10Api* | **openApiV10QianchuanReportVideoUserLoseGetGet** | **GET** /open_api/v1.0/qianchuan/report/video_user_lose/get/
*QianchuanRoiGoalUpdateV10Api* | **openApiV10QianchuanRoiGoalUpdatePost** | **POST** /open_api/v1.0/qianchuan/roi/goal/update/
*QianchuanShopAdvertiserListV10Api* | **openApiV10QianchuanShopAdvertiserListGet** | **GET** /open_api/v1.0/qianchuan/shop/advertiser/list/
*QianchuanShopAuthorizedGetV10Api* | **openApiV10QianchuanShopAuthorizedGetGet** | **GET** /open_api/v1.0/qianchuan/shop/authorized/get/
*QianchuanShopGetV10Api* | **openApiV10QianchuanShopGetGet** | **GET** /open_api/v1.0/qianchuan/shop/get/
*QianchuanSuggestBidV10Api* | **openApiV10QianchuanSuggestBidGet** | **GET** /open_api/v1.0/qianchuan/suggest_bid/
*QianchuanSuggestBudgetV10Api* | **openApiV10QianchuanSuggestBudgetGet** | **GET** /open_api/v1.0/qianchuan/suggest/budget/
*QianchuanSuggestRoiGoalV10Api* | **openApiV10QianchuanSuggestRoiGoalGet** | **GET** /open_api/v1.0/qianchuan/suggest/roi/goal/
*QianchuanTodayLiveRoomDetailGetV10Api* | **openApiV10QianchuanTodayLiveRoomDetailGetGet** | **GET** /open_api/v1.0/qianchuan/today_live/room/detail/get/
*QianchuanTodayLiveRoomFlowPerformanceGetV10Api* | **openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGet** | **GET** /open_api/v1.0/qianchuan/today_live/room/flow_performance/get/
*QianchuanTodayLiveRoomGetV10Api* | **openApiV10QianchuanTodayLiveRoomGetGet** | **GET** /open_api/v1.0/qianchuan/today_live/room/get/
*QianchuanTodayLiveRoomProductListGetV10Api* | **openApiV10QianchuanTodayLiveRoomProductListGetGet** | **GET** /open_api/v1.0/qianchuan/today_live/room/product_list/get/
*QianchuanTodayLiveRoomUserGetV10Api* | **openApiV10QianchuanTodayLiveRoomUserGetGet** | **GET** /open_api/v1.0/qianchuan/today_live/room/user/get/
*QianchuanToolsAllowCouponV10Api* | **openApiV10QianchuanToolsAllowCouponGet** | **GET** /open_api/v1.0/qianchuan/tools/allow_coupon/
*QianchuanToolsAwemeAuthV10Api* | **openApiV10QianchuanToolsAwemeAuthPost** | **POST** /open_api/v1.0/qianchuan/tools/aweme_auth/
*QianchuanToolsEstimateAudienceV10Api* | **openApiV10QianchuanToolsEstimateAudienceGet** | **GET** /open_api/v1.0/qianchuan/tools/estimate_audience/
*QianchuanToolsGrayV10Api* | **openApiV10QianchuanToolsGrayGet** | **GET** /open_api/v1.0/qianchuan/tools/gray/
*QianchuanToolsShopAuthV10Api* | **openApiV10QianchuanToolsShopAuthPost** | **POST** /open_api/v1.0/qianchuan/tools/shop_auth/
*QianchuanToolsSmartBoostAdBoostReportGetV10Api* | **openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet** | **GET** /open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/report/get/
*QianchuanToolsSmartBoostAdBoostSetV10Api* | **openApiV10QianchuanToolsSmartBoostAdBoostSetPost** | **POST** /open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/set/
*QianchuanToolsSmartBoostAdBoostStatusGetV10Api* | **openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGet** | **GET** /open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/status/get/
*QianchuanToolsSmartBoostAdBoostVersionGetV10Api* | **openApiV10QianchuanToolsSmartBoostAdBoostVersionGetGet** | **GET** /open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/version/get/
*QianchuanTrackUrlCheckV10Api* | **openApiV10QianchuanTrackUrlCheckGet** | **GET** /open_api/v1.0/qianchuan/track_url/check/
*QianchuanUniAwemeAuthorizedGetV10Api* | **openApiV10QianchuanUniAwemeAuthorizedGetGet** | **GET** /open_api/v1.0/qianchuan/uni_aweme/authorized/get/
*QianchuanUniPromotionListV10Api* | **openApiV10QianchuanUniPromotionListGet** | **GET** /open_api/v1.0/qianchuan/uni_promotion/list/
*QianchuanVideoGetV10Api* | **openApiV10QianchuanVideoGetGet** | **GET** /open_api/v1.0/qianchuan/video/get/
*QueryInvoiceV2Api* | **openApi2QueryInvoiceGet** | **GET** /open_api/2/query/invoice/
*QueryProjectV2Api* | **openApi2QueryProjectGet** | **GET** /open_api/2/query/project/
*QueryStatementV2Api* | **openApi2QueryStatementGet** | **GET** /open_api/2/query/statement/
*ReportAdGetV2Api* | **openApi2ReportAdGetGet** | **GET** /open_api/2/report/ad/get/
*ReportAdvertiserGetV2Api* | **openApi2ReportAdvertiserGetGet** | **GET** /open_api/2/report/advertiser/get/
*ReportAgentGetV2V2Api* | **openApi2ReportAgentGetV2Get** | **GET** /open_api/2/report/agent/get_v2/
*ReportAudienceAgeV2Api* | **openApi2ReportAudienceAgeGet** | **GET** /open_api/2/report/audience/age/
*ReportAudienceAwemeListV2Api* | **openApi2ReportAudienceAwemeListGet** | **GET** /open_api/2/report/audience/aweme/list/
*ReportAudienceCityV2Api* | **openApi2ReportAudienceCityGet** | **GET** /open_api/2/report/audience/city/
*ReportAudienceGenderV2Api* | **openApi2ReportAudienceGenderGet** | **GET** /open_api/2/report/audience/gender/
*ReportAudienceInterestActionListV2Api* | **openApi2ReportAudienceInterestActionListGet** | **GET** /open_api/2/report/audience/interest_action/list/
*ReportAudienceProvinceV2Api* | **openApi2ReportAudienceProvinceGet** | **GET** /open_api/2/report/audience/province/
*ReportBrandAdGetV30Api* | **openApiV30ReportBrandAdGetGet** | **GET** /open_api/v3.0/report/brand/ad/get/
*ReportBrandAdvertiserGetV30Api* | **openApiV30ReportBrandAdvertiserGetGet** | **GET** /open_api/v3.0/report/brand/advertiser/get/
*ReportBrandCampaignGetV30Api* | **openApiV30ReportBrandCampaignGetGet** | **GET** /open_api/v3.0/report/brand/campaign/get/
*ReportBrandCreativeGetV30Api* | **openApiV30ReportBrandCreativeGetGet** | **GET** /open_api/v3.0/report/brand/creative/get/
*ReportCampaignGetV2Api* | **openApi2ReportCampaignGetGet** | **GET** /open_api/2/report/campaign/get/
*ReportCreativeGetV2Api* | **openApi2ReportCreativeGetGet** | **GET** /open_api/2/report/creative/get/
*ReportCustomAsyncTaskCreateV30Api* | **openApiV30ReportCustomAsyncTaskCreatePost** | **POST** /open_api/v3.0/report/custom/async_task/create/
*ReportCustomAsyncTaskDownloadV30Api* | **openApiV30ReportCustomAsyncTaskDownloadGet** | **GET** /open_api/v3.0/report/custom/async_task/download/
*ReportCustomAsyncTaskGetV30Api* | **openApiV30ReportCustomAsyncTaskGetGet** | **GET** /open_api/v3.0/report/custom/async_task/get/
*ReportCustomConfigGetV30Api* | **openApiV30ReportCustomConfigGetGet** | **GET** /open_api/v3.0/report/custom/config/get/
*ReportCustomCreativeGetV30Api* | **openApiV30ReportCustomCreativeGetGet** | **GET** /open_api/v3.0/report/custom/creative/get/
*ReportCustomGetV30Api* | **openApiV30ReportCustomGetGet** | **GET** /open_api/v3.0/report/custom/get/
*ReportLiveRoomAnalysisGetV2Api* | **openApi2ReportLiveRoomAnalysisGetGet** | **GET** /open_api/2/report/live_room/analysis/get/
*ReportLiveRoomAttributeGetV2Api* | **openApi2ReportLiveRoomAttributeGetGet** | **GET** /open_api/2/report/live_room/attribute/get/
*ReportLiveRoomAudiencePortraitGetV2Api* | **openApi2ReportLiveRoomAudiencePortraitGetGet** | **GET** /open_api/2/report/live_room/audience/portrait/get/
*ReportLiveRoomFlowCategoryGetV2Api* | **openApi2ReportLiveRoomFlowCategoryGetGet** | **GET** /open_api/2/report/live_room/flow_category/get/
*ReportLiveRoomProductGetV2Api* | **openApi2ReportLiveRoomProductGetGet** | **GET** /open_api/2/report/live_room/product/get/
*ReportProductAsyncTaskDownloadV30Api* | **openApiV30ReportProductAsyncTaskDownloadGet** | **GET** /open_api/v3.0/report/product/async_task/download/
*ReportProductAsyncTaskGetV30Api* | **openApiV30ReportProductAsyncTaskGetPost** | **POST** /open_api/v3.0/report/product/async_task/get/
*ReportProductDailyAsyncTaskCreateV30Api* | **openApiV30ReportProductDailyAsyncTaskCreatePost** | **POST** /open_api/v3.0/report/product_daily/async_task/create/
*ReportProductHourlyAsyncTaskCreateV30Api* | **openApiV30ReportProductHourlyAsyncTaskCreatePost** | **POST** /open_api/v3.0/report/product_hourly/async_task/create/
*ReportRtaExpGetV2Api* | **openApi2ReportRtaExpGetGet** | **GET** /open_api/2/report/rta_exp/get/
*ReportRtaExpLocalDailyGetV30Api* | **openApiV30ReportRtaExpLocalDailyGetGet** | **GET** /open_api/v3.0/report/rta_exp_local_daily/get/
*ReportRtaExpLocalHourlyGetV30Api* | **openApiV30ReportRtaExpLocalHourlyGetGet** | **GET** /open_api/v3.0/report/rta_exp_local_hourly/get/
*ReportRtaGetV2Api* | **openApi2ReportRtaGetGet** | **GET** /open_api/2/report/rta/get/
*ReportRubeexGetV2Api* | **openApi2ReportRubeexGetGet** | **GET** /open_api/2/report/rubeex/get/
*ReportSitePageV2Api* | **openApi2ReportSitePageGet** | **GET** /open_api/2/report/site/page/
*ReportVideoFrameGetV2Api* | **openApi2ReportVideoFrameGetGet** | **GET** /open_api/2/report/video/frame/get/
*ServeMarketActiveFuncGetV10Api* | **openApiV10ServeMarketActiveFuncGetGet** | **GET** /open_api/v1.0/serve_market/active_func/get/
*ServeMarketCidVerifyTokenV10Api* | **openApiV10ServeMarketCidVerifyTokenGet** | **GET** /open_api/v1.0/serve_market/cid/verify_token/
*ServeMarketOrderGetV10Api* | **openApiV10ServeMarketOrderGetGet** | **GET** /open_api/v1.0/serve_market/order/get/
*SpiTaskGetV2Api* | **openApi2SpiTaskGetGet** | **GET** /open_api/2/spi_task/get/
*StarBillGetPendingV2Api* | **openApi2StarBillGetPendingGet** | **GET** /open_api/2/star/bill/get_pending/
*StarBillPayV2Api* | **openApi2StarBillPayPost** | **POST** /open_api/2/star/bill/pay/
*StarCampaignListV2Api* | **openApi2StarCampaignListGet** | **GET** /open_api/2/star/campaign/list/
*StarChallengeAddBudgetV2Api* | **openApi2StarChallengeAddBudgetPost** | **POST** /open_api/2/star/challenge/add_budget/
*StarChallengeAuthorListV2Api* | **openApi2StarChallengeAuthorListGet** | **GET** /open_api/2/star/challenge/author_list/
*StarChallengeCancelV2Api* | **openApi2StarChallengeCancelPost** | **POST** /open_api/2/star/challenge/cancel/
*StarChallengeExpandRangeV2Api* | **openApi2StarChallengeExpandRangePost** | **POST** /open_api/2/star/challenge/expand_range/
*StarChallengeGetPushAdResultsV2Api* | **openApi2StarChallengeGetPushAdResultsGet** | **GET** /open_api/2/star/challenge/get_push_ad_results/
*StarChallengeInfoV2Api* | **openApi2StarChallengeInfoGet** | **GET** /open_api/2/star/challenge/info/
*StarChallengeItemsDataV2Api* | **openApi2StarChallengeItemsDataGet** | **GET** /open_api/2/star/challenge/items_data/
*StarChallengeListV2Api* | **openApi2StarChallengeListGet** | **GET** /open_api/2/star/challenge/list/
*StarChallengePushItemsToAdV2Api* | **openApi2StarChallengePushItemsToAdPost** | **POST** /open_api/2/star/challenge/push_items_to_ad/
*StarClueGetV2Api* | **openApi2StarClueGetGet** | **GET** /open_api/2/star/clue/get/
*StarComponentCreateLinkV2Api* | **openApi2StarComponentCreateLinkPost** | **POST** /open_api/2/star/component/create_link/
*StarComponentQueryIndustryAnchorV2Api* | **openApi2StarComponentQueryIndustryAnchorGet** | **GET** /open_api/2/star/component/query_industry_anchor/
*StarComponentQueryLinkV2Api* | **openApi2StarComponentQueryLinkGet** | **GET** /open_api/2/star/component/query_link/
*StarComponentUpdateLinkV2Api* | **openApi2StarComponentUpdateLinkPost** | **POST** /open_api/2/star/component/update_link/
*StarDemandCreateAssignV2Api* | **openApi2StarDemandCreateAssignPost** | **POST** /open_api/2/star/demand/create_assign/
*StarDemandCreateChallengeV2Api* | **openApi2StarDemandCreateChallengePost** | **POST** /open_api/2/star/demand/create_challenge/
*StarDemandListV2Api* | **openApi2StarDemandListGet** | **GET** /open_api/2/star/demand/list/
*StarDemandOrderListV2Api* | **openApi2StarDemandOrderListGet** | **GET** /open_api/2/star/demand/order/list/
*StarGetCreateChallengeDataDictV2Api* | **openApi2StarGetCreateChallengeDataDictGet** | **GET** /open_api/2/star/get_create_challenge_data_dict/
*StarOrderApproveResourceV2Api* | **openApi2StarOrderApproveResourcePost** | **POST** /open_api/2/star/order/approve_resource/
*StarOrderDemanderCancelV2Api* | **openApi2StarOrderDemanderCancelPost** | **POST** /open_api/2/star/order/demander_cancel/
*StarOrderDetailV2Api* | **openApi2StarOrderDetailGet** | **GET** /open_api/2/star/order/detail/
*StarOrderFinishV2Api* | **openApi2StarOrderFinishPost** | **POST** /open_api/2/star/order/finish/
*StarOrderGetCancelAmountV2Api* | **openApi2StarOrderGetCancelAmountGet** | **GET** /open_api/2/star/order/get_cancel_amount/
*StarOrderGetComponentV2Api* | **openApi2StarOrderGetComponentGet** | **GET** /open_api/2/star/order/get_component/
*StarOrderGetInfoV2Api* | **openApi2StarOrderGetInfoGet** | **GET** /open_api/2/star/order/get_info/
*StarOrderGetScriptV2Api* | **openApi2StarOrderGetScriptGet** | **GET** /open_api/2/star/order/get_script/
*StarOrderGetVideoV2Api* | **openApi2StarOrderGetVideoGet** | **GET** /open_api/2/star/order/get_video/
*StarOrderListByCampaignV2Api* | **openApi2StarOrderListByCampaignGet** | **GET** /open_api/2/star/order/list_by_campaign/
*StarOrderPublishResourceV2Api* | **openApi2StarOrderPublishResourcePost** | **POST** /open_api/2/star/order/publish_resource/
*StarOrderPushResourceV2Api* | **openApi2StarOrderPushResourcePost** | **POST** /open_api/2/star/order/push_resource/
*StarOrderRejectResourceV2Api* | **openApi2StarOrderRejectResourcePost** | **POST** /open_api/2/star/order/reject_resource/
*StarOrderReplyAuthorCancelV2Api* | **openApi2StarOrderReplyAuthorCancelPost** | **POST** /open_api/2/star/order/reply_author_cancel/
*StarOrderUpdateV2Api* | **openApi2StarOrderUpdatePost** | **POST** /open_api/2/star/order/update/
*StarReportOrderOverviewGetV2Api* | **openApi2StarReportOrderOverviewGetGet** | **GET** /open_api/2/star/report/order_overview/get/
*StarReportOrderOverviewV2Api* | **openApi2StarReportOrderOverviewGet** | **GET** /open_api/2/star/report/order_overview/
*StarReportOrderUserDistributionGetV2Api* | **openApi2StarReportOrderUserDistributionGetGet** | **GET** /open_api/2/star/report/order_user_distribution/get/
*SubscribeAccountsAddV30Api* | **openApiV30SubscribeAccountsAddPost** | **POST** /open_api/v3.0/subscribe/accounts/add/
*SubscribeAccountsListV30Api* | **openApiV30SubscribeAccountsListGet** | **GET** /open_api/v3.0/subscribe/accounts/list/
*SubscribeAccountsRemoveV30Api* | **openApiV30SubscribeAccountsRemovePost** | **POST** /open_api/v3.0/subscribe/accounts/remove/
*SuggWordsV30Api* | **openApiV30SuggWordsPost** | **POST** /open_api/v3.0/sugg_words/
*ToolQuickAppManagementQuickAppGetV2Api* | **openApi2ToolQuickAppManagementQuickAppGetGet** | **GET** /open_api/2/tool/quick_app_management/quick_app/get/
*ToolsAbTestCreateV2Api* | **openApi2ToolsAbTestCreatePost** | **POST** /open_api/2/tools/ab_test/create/
*ToolsAbTestDeleteV2Api* | **openApi2ToolsAbTestDeletePost** | **POST** /open_api/2/tools/ab_test/delete/
*ToolsAbTestInfoGetV2Api* | **openApi2ToolsAbTestInfoGetGet** | **GET** /open_api/2/tools/ab_test_info/get/
*ToolsAbTestListGetV2Api* | **openApi2ToolsAbTestListGetGet** | **GET** /open_api/2/tools/ab_test_list/get/
*ToolsAbTestStopV2Api* | **openApi2ToolsAbTestStopPost** | **POST** /open_api/2/tools/ab_test/stop/
*ToolsAbTestUpdateV2Api* | **openApi2ToolsAbTestUpdatePost** | **POST** /open_api/2/tools/ab_test/update/
*ToolsAdConvertDeepbidReadV2Api* | **openApi2ToolsAdConvertDeepbidReadGet** | **GET** /open_api/2/tools/ad_convert/deepbid/read/
*ToolsAdConvertOptimizedTargetGetV2Api* | **openApi2ToolsAdConvertOptimizedTargetGetGet** | **GET** /open_api/2/tools/ad_convert/optimized_target/get/
*ToolsAdConvertQueryV2Api* | **openApi2ToolsAdConvertQueryGet** | **GET** /open_api/2/tools/ad_convert/query/
*ToolsAdConvertTrackUrlUpdateV2Api* | **openApi2ToolsAdConvertTrackUrlUpdatePost** | **POST** /open_api/2/tools/ad_convert/track_url/update/
*ToolsAdPreviewQrcodeGetV30Api* | **openApiV30ToolsAdPreviewQrcodeGetGet** | **GET** /open_api/v3.0/tools/ad_preview/qrcode_get/
*ToolsAdRaiseEstimateGetV2Api* | **openApi2ToolsAdRaiseEstimateGetGet** | **GET** /open_api/2/tools/ad_raise_estimate/get/
*ToolsAdRaiseResultGetV2V2Api* | **openApi2ToolsAdRaiseResultGetV2Get** | **GET** /open_api/2/tools/ad_raise_result/get_v2/
*ToolsAdRaiseSetV2Api* | **openApi2ToolsAdRaiseSetPost** | **POST** /open_api/2/tools/ad_raise/set/
*ToolsAdRaiseStatusGetV2Api* | **openApi2ToolsAdRaiseStatusGetGet** | **GET** /open_api/2/tools/ad_raise_status/get/
*ToolsAdRaiseVersionGetV2Api* | **openApi2ToolsAdRaiseVersionGetGet** | **GET** /open_api/2/tools/ad_raise_version/get/
*ToolsAdStatExtraInfoGetV2Api* | **openApi2ToolsAdStatExtraInfoGetGet** | **GET** /open_api/2/tools/ad_stat_extra_info/get/
*ToolsAdminInfoV2Api* | **openApi2ToolsAdminInfoGet** | **GET** /open_api/2/tools/admin/info/
*ToolsAdvertiserStoreSearchV2Api* | **openApi2ToolsAdvertiserStoreSearchGet** | **GET** /open_api/2/tools/advertiser_store/search/
*ToolsAipThirdSiteCreateV2Api* | **openApi2ToolsAipThirdSiteCreatePost** | **POST** /open_api/2/tools/aip_third_site/create/
*ToolsAipThirdSiteGetV2Api* | **openApi2ToolsAipThirdSiteGetGet** | **GET** /open_api/2/tools/aip_third_site/get/
*ToolsAipThirdSiteUpdateV2Api* | **openApi2ToolsAipThirdSiteUpdatePost** | **POST** /open_api/2/tools/aip_third_site/update/
*ToolsAppAuthGetV2Api* | **openApi2ToolsAppAuthGetGet** | **GET** /open_api/2/tools/app/auth/get/
*ToolsAppIosListV2Api* | **openApi2ToolsAppIosListGet** | **GET** /open_api/2/tools/app/ios/list/
*ToolsAppManagementAndroidAppListV2Api* | **openApi2ToolsAppManagementAndroidAppListGet** | **GET** /open_api/2/tools/app_management/android_app/list/
*ToolsAppManagementAndroidBasicPackageGetV2Api* | **openApi2ToolsAppManagementAndroidBasicPackageGetGet** | **GET** /open_api/2/tools/app_management/android_basic_package/get/
*ToolsAppManagementAndroidBasicPackagePublishV2Api* | **openApi2ToolsAppManagementAndroidBasicPackagePublishPost** | **POST** /open_api/2/tools/app_management/android_basic_package/publish/
*ToolsAppManagementAndroidBasicPackageUpdateV2Api* | **openApi2ToolsAppManagementAndroidBasicPackageUpdatePost** | **POST** /open_api/2/tools/app_management/android_basic_package/update/
*ToolsAppManagementAppGetV2Api* | **openApi2ToolsAppManagementAppGetGet** | **GET** /open_api/2/tools/app_management/app/get/
*ToolsAppManagementBookingGetV2Api* | **openApi2ToolsAppManagementBookingGetGet** | **GET** /open_api/2/tools/app_management/booking/get/
*ToolsAppManagementBookingRecordsGetV2Api* | **openApi2ToolsAppManagementBookingRecordsGetGet** | **GET** /open_api/2/tools/app_management/booking_records/get/
*ToolsAppManagementBpShareCancelV2Api* | **openApi2ToolsAppManagementBpShareCancelPost** | **POST** /open_api/2/tools/app_management/bp_share/cancel/
*ToolsAppManagementBpShareV2Api* | **openApi2ToolsAppManagementBpSharePost** | **POST** /open_api/2/tools/app_management/bp_share/
*ToolsAppManagementExtendPackageCreateV2Api* | **openApi2ToolsAppManagementExtendPackageCreatePost** | **POST** /open_api/2/tools/app_management/extend_package/create/
*ToolsAppManagementExtendPackageCreateV2V2Api* | **openApi2ToolsAppManagementExtendPackageCreateV2Post** | **POST** /open_api/2/tools/app_management/extend_package/create_v2/
*ToolsAppManagementExtendPackageListV2Api* | **openApi2ToolsAppManagementExtendPackageListGet** | **GET** /open_api/2/tools/app_management/extend_package/list/
*ToolsAppManagementExtendPackageListV2V2Api* | **openApi2ToolsAppManagementExtendPackageListV2Get** | **GET** /open_api/2/tools/app_management/extend_package/list_v2/
*ToolsAppManagementExtendPackageUpdateV2Api* | **openApi2ToolsAppManagementExtendPackageUpdatePost** | **POST** /open_api/2/tools/app_management/extend_package/update/
*ToolsAppManagementExtendPackageUpdateV2V2Api* | **openApi2ToolsAppManagementExtendPackageUpdateV2Post** | **POST** /open_api/2/tools/app_management/extend_package/update_v2/
*ToolsAppManagementIndustryInfoListV2Api* | **openApi2ToolsAppManagementIndustryInfoListGet** | **GET** /open_api/2/tools/app_management/industry_info/list/
*ToolsAppManagementShareAccountListV2Api* | **openApi2ToolsAppManagementShareAccountListGet** | **GET** /open_api/2/tools/app_management/share_account/list/
*ToolsAppManagementUpdateAuthorizationV2Api* | **openApi2ToolsAppManagementUpdateAuthorizationPost** | **POST** /open_api/2/tools/app_management/update/authorization/
*ToolsAppManagementUploadTaskCreateV2Api* | **openApi2ToolsAppManagementUploadTaskCreatePost** | **POST** /open_api/2/tools/app_management/upload_task/create/
*ToolsAppManagementUploadTaskListV2Api* | **openApi2ToolsAppManagementUploadTaskListGet** | **GET** /open_api/2/tools/app_management/upload_task/list/
*ToolsAssetLinkListV30Api* | **openApiV30ToolsAssetLinkListGet** | **GET** /open_api/v3.0/tools/asset_link/list/
*ToolsAwemeAuthCancelV2Api* | **openApi2ToolsAwemeAuthCancelPost** | **POST** /open_api/2/tools/aweme_auth/cancel/
*ToolsAwemeAuthListV2Api* | **openApi2ToolsAwemeAuthListGet** | **GET** /open_api/2/tools/aweme_auth_list/
*ToolsAwemeAuthRenewalV2Api* | **openApi2ToolsAwemeAuthRenewalPost** | **POST** /open_api/2/tools/aweme_auth/renewal/
*ToolsAwemeAuthV2Api* | **openApi2ToolsAwemeAuthPost** | **POST** /open_api/2/tools/aweme_auth/
*ToolsAwemeAuthorInfoGetV2Api* | **openApi2ToolsAwemeAuthorInfoGetGet** | **GET** /open_api/2/tools/aweme_author_info/get/
*ToolsAwemeBannedCreateV30Api* | **openApiV30ToolsAwemeBannedCreatePost** | **POST** /open_api/v3.0/tools/aweme_banned/create/
*ToolsAwemeBannedDeleteV30Api* | **openApiV30ToolsAwemeBannedDeletePost** | **POST** /open_api/v3.0/tools/aweme_banned/delete/
*ToolsAwemeBannedListV30Api* | **openApiV30ToolsAwemeBannedListGet** | **GET** /open_api/v3.0/tools/aweme_banned/list/
*ToolsAwemeCategoryTopAuthorGetV2Api* | **openApi2ToolsAwemeCategoryTopAuthorGetGet** | **GET** /open_api/2/tools/aweme_category_top_author/get/
*ToolsAwemeInfoSearchV2Api* | **openApi2ToolsAwemeInfoSearchGet** | **GET** /open_api/2/tools/aweme_info_search/
*ToolsAwemeMultiLevelCategoryGetV2Api* | **openApi2ToolsAwemeMultiLevelCategoryGetGet** | **GET** /open_api/2/tools/aweme_multi_level_category/get/
*ToolsAwemeSimilarAuthorSearchV2Api* | **openApi2ToolsAwemeSimilarAuthorSearchGet** | **GET** /open_api/2/tools/aweme_similar_author_search/
*ToolsBidSuggestV2Api* | **openApi2ToolsBidSuggestGet** | **GET** /open_api/2/tools/bid/suggest/
*ToolsBidsSuggestV30Api* | **openApiV30ToolsBidsSuggestGet** | **GET** /open_api/v3.0/tools/bids/suggest/
*ToolsBpAssetManagementShareCancelV30Api* | **openApiV30ToolsBpAssetManagementShareCancelPost** | **POST** /open_api/v3.0/tools/bp_asset_management/share/cancel/
*ToolsBpAssetManagementShareGetV30Api* | **openApiV30ToolsBpAssetManagementShareGetGet** | **GET** /open_api/v3.0/tools/bp_asset_management/share/get/
*ToolsBpAssetManagementShareV30Api* | **openApiV30ToolsBpAssetManagementSharePost** | **POST** /open_api/v3.0/tools/bp_asset_management/share/
*ToolsClueBridgeCallCreateV2Api* | **openApi2ToolsClueBridgeCallCreatePost** | **POST** /open_api/2/tools/clue/bridge_call/create/
*ToolsClueCallCreateV2Api* | **openApi2ToolsClueCallCreatePost** | **POST** /open_api/2/tools/clue/call/create/
*ToolsClueCallVirtualNumberGetV2Api* | **openApi2ToolsClueCallVirtualNumberGetGet** | **GET** /open_api/2/tools/clue/call_virtual_number/get/
*ToolsClueCallVirtualNumberRefundDetailGetV2Api* | **openApi2ToolsClueCallVirtualNumberRefundDetailGetGet** | **GET** /open_api/2/tools/clue/call_virtual_number/refund_detail/get/
*ToolsClueCallbackV2Api* | **openApi2ToolsClueCallbackPost** | **POST** /open_api/2/tools/clue/callback/
*ToolsClueClueOverviewQueryV2Api* | **openApi2ToolsClueClueOverviewQueryGet** | **GET** /open_api/2/tools/clue/clue/overview/query/
*ToolsClueContactLogListV2Api* | **openApi2ToolsClueContactLogListGet** | **GET** /open_api/2/tools/clue/contact_log/list/
*ToolsClueContactLogOverviewQueryV2Api* | **openApi2ToolsClueContactLogOverviewQueryGet** | **GET** /open_api/2/tools/clue/contact_log/overview/query/
*ToolsClueExtInfoCallbackV2Api* | **openApi2ToolsClueExtInfoCallbackPost** | **POST** /open_api/2/tools/clue/ext_info/callback/
*ToolsClueFormDetailV2Api* | **openApi2ToolsClueFormDetailGet** | **GET** /open_api/2/tools/clue/form/detail/
*ToolsClueFormGetV2Api* | **openApi2ToolsClueFormGetGet** | **GET** /open_api/2/tools/clue/form/get/
*ToolsClueGetV2Api* | **openApi2ToolsClueGetGet** | **GET** /open_api/2/tools/clue/get/
*ToolsClueInfoUpdateV2Api* | **openApi2ToolsClueInfoUpdatePost** | **POST** /open_api/2/tools/clue/info/update/
*ToolsClueLiteContactGetV2Api* | **openApi2ToolsClueLiteContactGetPost** | **POST** /open_api/2/tools/clue/lite/contact/get/
*ToolsClueLiteContactRecordV2Api* | **openApi2ToolsClueLiteContactRecordPost** | **POST** /open_api/2/tools/clue/lite/contact/record/
*ToolsClueRefundDetailGetV2Api* | **openApi2ToolsClueRefundDetailGetGet** | **GET** /open_api/2/tools/clue/refund_detail/get/
*ToolsClueRefundInfoQueryV2Api* | **openApi2ToolsClueRefundInfoQueryPost** | **POST** /open_api/2/tools/clue/refund/info/query/
*ToolsClueRefundReportGetV2Api* | **openApi2ToolsClueRefundReportGetGet** | **GET** /open_api/2/tools/clue/refund_report/get/
*ToolsClueRefundViewGetV2Api* | **openApi2ToolsClueRefundViewGetGet** | **GET** /open_api/2/tools/clue/refund_view/get/
*ToolsClueRobotScriptQueryV2Api* | **openApi2ToolsClueRobotScriptQueryPost** | **POST** /open_api/2/tools/clue/robot/script/query/
*ToolsClueRobotTaskCancelV2Api* | **openApi2ToolsClueRobotTaskCancelPost** | **POST** /open_api/2/tools/clue/robot/task/cancel/
*ToolsClueRobotTaskCreateV2Api* | **openApi2ToolsClueRobotTaskCreatePost** | **POST** /open_api/2/tools/clue/robot/task/create/
*ToolsClueSmartPhoneGetV2Api* | **openApi2ToolsClueSmartPhoneGetGet** | **GET** /open_api/2/tools/clue/smart_phone/get/
*ToolsClueWebrtcTokenGetV2Api* | **openApi2ToolsClueWebrtcTokenGetPost** | **POST** /open_api/2/tools/clue/webrtc/token/get/
*ToolsCommentGetV30Api* | **openApiV30ToolsCommentGetGet** | **GET** /open_api/v3.0/tools/comment/get/
*ToolsCommentHideV30Api* | **openApiV30ToolsCommentHidePost** | **POST** /open_api/v3.0/tools/comment/hide/
*ToolsCommentMetricsGetV30Api* | **openApiV30ToolsCommentMetricsGetGet** | **GET** /open_api/v3.0/tools/comment_metrics/get/
*ToolsCommentMid2itemIdV30Api* | **openApiV30ToolsCommentMid2itemIdGet** | **GET** /open_api/v3.0/tools/comment/mid2item_id/
*ToolsCommentReplyGetV30Api* | **openApiV30ToolsCommentReplyGetGet** | **GET** /open_api/v3.0/tools/comment_reply/get/
*ToolsCommentReplyV30Api* | **openApiV30ToolsCommentReplyPost** | **POST** /open_api/v3.0/tools/comment/reply/
*ToolsCommentStickOnTopV30Api* | **openApiV30ToolsCommentStickOnTopPost** | **POST** /open_api/v3.0/tools/comment/stick_on_top/
*ToolsCommentTermsBannedAddV30Api* | **openApiV30ToolsCommentTermsBannedAddPost** | **POST** /open_api/v3.0/tools/comment/terms_banned/add/
*ToolsCommentTermsBannedDeleteV30Api* | **openApiV30ToolsCommentTermsBannedDeletePost** | **POST** /open_api/v3.0/tools/comment/terms_banned/delete/
*ToolsCommentTermsBannedGetV30Api* | **openApiV30ToolsCommentTermsBannedGetGet** | **GET** /open_api/v3.0/tools/comment/terms_banned/get/
*ToolsCommentTermsBannedUpdateV30Api* | **openApiV30ToolsCommentTermsBannedUpdatePost** | **POST** /open_api/v3.0/tools/comment/terms_banned/update/
*ToolsCountryInfoV2Api* | **openApi2ToolsCountryInfoGet** | **GET** /open_api/2/tools/country/info/
*ToolsCreativeWordSelectV2Api* | **openApi2ToolsCreativeWordSelectGet** | **GET** /open_api/2/tools/creative_word/select/
*ToolsDiagnosisAdGetV2V2Api* | **openApi2ToolsDiagnosisAdGetV2Get** | **GET** /open_api/2/tools/diagnosis/ad/get_v2/
*ToolsDiagnosisSuggestionGetV2Api* | **openApi2ToolsDiagnosisSuggestionGetGet** | **GET** /open_api/2/tools/diagnosis/suggestion/get/
*ToolsDownloadPackageGetV2Api* | **openApi2ToolsDownloadPackageGetGet** | **GET** /open_api/2/tools/download/package/get/
*ToolsDownloadPackageParseV2Api* | **openApi2ToolsDownloadPackageParsePost** | **POST** /open_api/2/tools/download/package/parse/
*ToolsEstimateAudienceV2Api* | **openApi2ToolsEstimateAudienceGet** | **GET** /open_api/2/tools/estimate_audience/
*ToolsEstimatedPriceGetV2Api* | **openApi2ToolsEstimatedPriceGetGet** | **GET** /open_api/2/tools/estimated_price/get/
*ToolsEventAssetsGetV2Api* | **openApi2ToolsEventAssetsGetGet** | **GET** /open_api/2/tools/event/assets/get/
*ToolsEventConvertOptimizedGoalGetV30Api* | **openApiV30ToolsEventConvertOptimizedGoalGetGet** | **GET** /open_api/v3.0/tools/event_convert/optimized_goal/get/
*ToolsGrayGetV30Api* | **openApiV30ToolsGrayGetGet** | **GET** /open_api/v3.0/tools/gray/get/
*ToolsIesAccountSearchV2Api* | **openApi2ToolsIesAccountSearchGet** | **GET** /open_api/2/tools/ies_account_search/
*ToolsIndustryGetV2Api* | **openApi2ToolsIndustryGetGet** | **GET** /open_api/2/tools/industry/get/
*ToolsInterestActionActionKeywordV2Api* | **openApi2ToolsInterestActionActionKeywordGet** | **GET** /open_api/2/tools/interest_action/action/keyword/
*ToolsInterestActionId2wordV2Api* | **openApi2ToolsInterestActionId2wordGet** | **GET** /open_api/2/tools/interest_action/id2word/
*ToolsInterestActionInterestKeywordV2Api* | **openApi2ToolsInterestActionInterestKeywordGet** | **GET** /open_api/2/tools/interest_action/interest/keyword/
*ToolsInterestActionKeywordSuggestV2Api* | **openApi2ToolsInterestActionKeywordSuggestGet** | **GET** /open_api/2/tools/interest_action/keyword/suggest/
*ToolsIsSupportUniversalGetV2Api* | **openApi2ToolsIsSupportUniversalGetGet** | **GET** /open_api/2/tools/is_support_universal/get/
*ToolsKeyActionGetV2Api* | **openApi2ToolsKeyActionGetGet** | **GET** /open_api/2/tools/key_action/get/
*ToolsKeywordsBidRatioCreateV30Api* | **openApiV30ToolsKeywordsBidRatioCreatePost** | **POST** /open_api/v3.0/tools/keywords_bid_ratio/create/
*ToolsKeywordsBidRatioDeleteV30Api* | **openApiV30ToolsKeywordsBidRatioDeletePost** | **POST** /open_api/v3.0/tools/keywords_bid_ratio/delete/
*ToolsKeywordsBidRatioGetV30Api* | **openApiV30ToolsKeywordsBidRatioGetGet** | **GET** /open_api/v3.0/tools/keywords_bid_ratio/get/
*ToolsKeywordsBidRatioUpdateV30Api* | **openApiV30ToolsKeywordsBidRatioUpdatePost** | **POST** /open_api/v3.0/tools/keywords_bid_ratio/update/
*ToolsKeywordsProjectInfoGetV30Api* | **openApiV30ToolsKeywordsProjectInfoGetGet** | **GET** /open_api/v3.0/tools/keywords_project_info/get/
*ToolsLandingGroupCreateV2Api* | **openApi2ToolsLandingGroupCreatePost** | **POST** /open_api/2/tools/landing_group/create/
*ToolsLandingGroupGetV2Api* | **openApi2ToolsLandingGroupGetGet** | **GET** /open_api/2/tools/landing_group/get/
*ToolsLandingGroupSiteOptStatusUpdateV2Api* | **openApi2ToolsLandingGroupSiteOptStatusUpdatePost** | **POST** /open_api/2/tools/landing_group/site_opt_status/update/
*ToolsLandingGroupUpdateV2Api* | **openApi2ToolsLandingGroupUpdatePost** | **POST** /open_api/2/tools/landing_group/update/
*ToolsLiveAuthorizeListV2Api* | **openApi2ToolsLiveAuthorizeListGet** | **GET** /open_api/2/tools/live_authorize/list/
*ToolsLogSearchV2Api* | **openApi2ToolsLogSearchGet** | **GET** /open_api/2/tools/log_search/
*ToolsMicroAppCreateV30Api* | **openApiV30ToolsMicroAppCreatePost** | **POST** /open_api/v3.0/tools/micro_app/create/
*ToolsMicroAppListV30Api* | **openApiV30ToolsMicroAppListGet** | **GET** /open_api/v3.0/tools/micro_app/list/
*ToolsMicroAppUpdateV30Api* | **openApiV30ToolsMicroAppUpdatePost** | **POST** /open_api/v3.0/tools/micro_app/update/
*ToolsMicroGameCreateV30Api* | **openApiV30ToolsMicroGameCreatePost** | **POST** /open_api/v3.0/tools/micro_game/create/
*ToolsMicroGameListV30Api* | **openApiV30ToolsMicroGameListGet** | **GET** /open_api/v3.0/tools/micro_game/list/
*ToolsMicroGameUpdateV30Api* | **openApiV30ToolsMicroGameUpdatePost** | **POST** /open_api/v3.0/tools/micro_game/update/
*ToolsNoBidSuggestBidV2Api* | **openApi2ToolsNoBidSuggestBidGet** | **GET** /open_api/2/tools/no_bid/suggest_bid/
*ToolsOrangeSiteGetV30Api* | **openApiV30ToolsOrangeSiteGetGet** | **GET** /open_api/v3.0/tools/orange_site/get/
*ToolsPlayableCloudGameListV2Api* | **openApi2ToolsPlayableCloudGameListGet** | **GET** /open_api/2/tools/playable/cloud_game/list/
*ToolsPlayableCreateV2Api* | **openApi2ToolsPlayableCreatePost** | **POST** /open_api/2/tools/playable/create/
*ToolsPlayableGrantResultV2Api* | **openApi2ToolsPlayableGrantResultGet** | **GET** /open_api/2/tools/playable/grant/result/
*ToolsPlayableGrantV2Api* | **openApi2ToolsPlayableGrantPost** | **POST** /open_api/2/tools/playable/grant/
*ToolsPlayableListGetV2Api* | **openApi2ToolsPlayableListGetGet** | **GET** /open_api/2/tools/playable_list/get/
*ToolsPlayableSaveV2Api* | **openApi2ToolsPlayableSavePost** | **POST** /open_api/2/tools/playable/save/
*ToolsPlayableValidateV2Api* | **openApi2ToolsPlayableValidateGet** | **GET** /open_api/2/tools/playable/validate/
*ToolsPreAuditGetV2Api* | **openApi2ToolsPreAuditGetGet** | **GET** /open_api/2/tools/pre_audit/get/
*ToolsPreAuditSendV2Api* | **openApi2ToolsPreAuditSendPost** | **POST** /open_api/2/tools/pre_audit/send/
*ToolsPrivativeWordAdAddV2Api* | **openApi2ToolsPrivativeWordAdAddPost** | **POST** /open_api/2/tools/privative_word/ad/add/
*ToolsPrivativeWordAdUpdateV2Api* | **openApi2ToolsPrivativeWordAdUpdatePost** | **POST** /open_api/2/tools/privative_word/ad/update/
*ToolsPrivativeWordBatchGetV30Api* | **openApiV30ToolsPrivativeWordBatchGetPost** | **POST** /open_api/v3.0/tools/privative_word/batch_get/
*ToolsPrivativeWordCampaignAddV2Api* | **openApi2ToolsPrivativeWordCampaignAddPost** | **POST** /open_api/2/tools/privative_word/campaign/add/
*ToolsPrivativeWordCampaignUpdateV2Api* | **openApi2ToolsPrivativeWordCampaignUpdatePost** | **POST** /open_api/2/tools/privative_word/campaign/update/
*ToolsPrivativeWordGetV2Api* | **openApi2ToolsPrivativeWordGetGet** | **GET** /open_api/2/tools/privative_word/get/
*ToolsPrivativeWordProjectAddV30Api* | **openApiV30ToolsPrivativeWordProjectAddPost** | **POST** /open_api/v3.0/tools/privative_word/project/add/
*ToolsPrivativeWordProjectUpdateV30Api* | **openApiV30ToolsPrivativeWordProjectUpdatePost** | **POST** /open_api/v3.0/tools/privative_word/project/update/
*ToolsPrivativeWordPromotionAddV30Api* | **openApiV30ToolsPrivativeWordPromotionAddPost** | **POST** /open_api/v3.0/tools/privative_word/promotion/add/
*ToolsPrivativeWordPromotionUpdateV30Api* | **openApiV30ToolsPrivativeWordPromotionUpdatePost** | **POST** /open_api/v3.0/tools/privative_word/promotion/update/
*ToolsPromotionCardRecommendGetV2Api* | **openApi2ToolsPromotionCardRecommendGetGet** | **GET** /open_api/2/tools/promotion_card/recommend/get/
*ToolsPromotionCardRecommendTitleGetV2Api* | **openApi2ToolsPromotionCardRecommendTitleGetGet** | **GET** /open_api/2/tools/promotion_card/recommend_title/get/
*ToolsPromotionDiagnosisSuggestionAcceptV30Api* | **openApiV30ToolsPromotionDiagnosisSuggestionAcceptPost** | **POST** /open_api/v3.0/tools/promotion_diagnosis/suggestion/accept/
*ToolsPromotionDiagnosisSuggestionGetV30Api* | **openApiV30ToolsPromotionDiagnosisSuggestionGetGet** | **GET** /open_api/v3.0/tools/promotion_diagnosis/suggestion/get/
*ToolsPromotionRaiseSetV30Api* | **openApiV30ToolsPromotionRaiseSetPost** | **POST** /open_api/v3.0/tools/promotion_raise/set/
*ToolsPromotionRaiseStatusCurrentIdsGetV30Api* | **openApiV30ToolsPromotionRaiseStatusCurrentIdsGetGet** | **GET** /open_api/v3.0/tools/promotion_raise_status_current_ids/get/
*ToolsPromotionRaiseStatusGetV30Api* | **openApiV30ToolsPromotionRaiseStatusGetGet** | **GET** /open_api/v3.0/tools/promotion_raise_status/get/
*ToolsPromotionRaiseStopV30Api* | **openApiV30ToolsPromotionRaiseStopPost** | **POST** /open_api/v3.0/tools/promotion_raise/stop/
*ToolsPromotionRaiseVersionGetV30Api* | **openApiV30ToolsPromotionRaiseVersionGetGet** | **GET** /open_api/v3.0/tools/promotion_raise_version/get/
*ToolsQuotaGetV2Api* | **openApi2ToolsQuotaGetGet** | **GET** /open_api/2/tools/quota/get/
*ToolsRegionGetV2Api* | **openApi2ToolsRegionGetGet** | **GET** /open_api/2/tools/region/get/
*ToolsRtaGetInfoTmpV2Api* | **openApi2ToolsRtaGetInfoTmpGet** | **GET** /open_api/2/tools/rta/get_info_tmp/
*ToolsRtaGetInfoV2Api* | **openApi2ToolsRtaGetInfoGet** | **GET** /open_api/2/tools/rta/get_info/
*ToolsRtaGetV2Api* | **openApi2ToolsRtaGetGet** | **GET** /open_api/2/tools/rta/get/
*ToolsRtaScopeGetV30Api* | **openApiV30ToolsRtaScopeGetGet** | **GET** /open_api/v3.0/tools/rta/scope/get/
*ToolsRtaSetScopeV2Api* | **openApi2ToolsRtaSetScopePost** | **POST** /open_api/2/tools/rta/set_scope/
*ToolsRtaStatusUpdateV2Api* | **openApi2ToolsRtaStatusUpdatePost** | **POST** /open_api/2/tools/rta/status_update/
*ToolsRubeexGetV2Api* | **openApi2ToolsRubeexGetGet** | **GET** /open_api/2/tools/rubeex/get/
*ToolsRubeexPlayableAdListV2Api* | **openApi2ToolsRubeexPlayableAdListGet** | **GET** /open_api/2/tools/rubeex_playable/ad_list/
*ToolsRubeexPlayableListV2Api* | **openApi2ToolsRubeexPlayableListGet** | **GET** /open_api/2/tools/rubeex_playable/list/
*ToolsRubeexRemarkV2Api* | **openApi2ToolsRubeexRemarkGet** | **GET** /open_api/2/tools/rubeex/remark/
*ToolsRubeexVersionGetV2Api* | **openApi2ToolsRubeexVersionGetGet** | **GET** /open_api/2/tools/rubeex/version/get/
*ToolsSearchBidRatioGetV2Api* | **openApi2ToolsSearchBidRatioGetGet** | **GET** /open_api/2/tools/search_bid_ratio/get/
*ToolsSiteCopyV2Api* | **openApi2ToolsSiteCopyPost** | **POST** /open_api/2/tools/site/copy/
*ToolsSiteCreateV2Api* | **openApi2ToolsSiteCreatePost** | **POST** /open_api/2/tools/site/create/
*ToolsSiteFormsListV2Api* | **openApi2ToolsSiteFormsListGet** | **GET** /open_api/2/tools/site/forms/list/
*ToolsSiteGetV2Api* | **openApi2ToolsSiteGetGet** | **GET** /open_api/2/tools/site/get/
*ToolsSiteHandselV2Api* | **openApi2ToolsSiteHandselPost** | **POST** /open_api/2/tools/site/handsel/
*ToolsSitePreviewV2Api* | **openApi2ToolsSitePreviewGet** | **GET** /open_api/2/tools/site/preview/
*ToolsSiteReadV2Api* | **openApi2ToolsSiteReadGet** | **GET** /open_api/2/tools/site/read/
*ToolsSiteTemplateCreateV2Api* | **openApi2ToolsSiteTemplateCreatePost** | **POST** /open_api/2/tools/site_template/create/
*ToolsSiteTemplateGetV2Api* | **openApi2ToolsSiteTemplateGetGet** | **GET** /open_api/2/tools/site_template/get/
*ToolsSiteTemplatePicUrlGetV2Api* | **openApi2ToolsSiteTemplatePicUrlGetGet** | **GET** /open_api/2/tools/site_template/pic_url/get/
*ToolsSiteTemplatePreviewV2Api* | **openApi2ToolsSiteTemplatePreviewGet** | **GET** /open_api/2/tools/site_template/preview/
*ToolsSiteTemplateSiteCreateV2Api* | **openApi2ToolsSiteTemplateSiteCreatePost** | **POST** /open_api/2/tools/site_template/site/create/
*ToolsSiteUpdateStatusV2Api* | **openApi2ToolsSiteUpdateStatusPost** | **POST** /open_api/2/tools/site/update_status/
*ToolsSiteUpdateV2Api* | **openApi2ToolsSiteUpdatePost** | **POST** /open_api/2/tools/site/update/
*ToolsSuggestBudgetGetV30Api* | **openApiV30ToolsSuggestBudgetGetGet** | **GET** /open_api/v3.0/tools/suggest_budget/get/
*ToolsTaskRaiseCreateV2Api* | **openApi2ToolsTaskRaiseCreatePost** | **POST** /open_api/2/tools/task_raise/create/
*ToolsTaskRaiseDataGetV2Api* | **openApi2ToolsTaskRaiseDataGetGet** | **GET** /open_api/2/tools/task_raise/data/get/
*ToolsTaskRaiseGetV2Api* | **openApi2ToolsTaskRaiseGetGet** | **GET** /open_api/2/tools/task_raise/get/
*ToolsTaskRaiseOptimizationIdsGetV2Api* | **openApi2ToolsTaskRaiseOptimizationIdsGetGet** | **GET** /open_api/2/tools/task_raise/optimization_ids/get/
*ToolsTaskRaiseStatusStopV2Api* | **openApi2ToolsTaskRaiseStatusStopPost** | **POST** /open_api/2/tools/task_raise/status/stop/
*ToolsThirdSiteCreateV2Api* | **openApi2ToolsThirdSiteCreatePost** | **POST** /open_api/2/tools/third_site/create/
*ToolsThirdSiteDeleteV2Api* | **openApi2ToolsThirdSiteDeletePost** | **POST** /open_api/2/tools/third_site/delete/
*ToolsThirdSiteGetV2Api* | **openApi2ToolsThirdSiteGetGet** | **GET** /open_api/2/tools/third_site/get/
*ToolsThirdSitePreviewV2Api* | **openApi2ToolsThirdSitePreviewGet** | **GET** /open_api/2/tools/third_site/preview/
*ToolsThirdSiteUpdateV2Api* | **openApi2ToolsThirdSiteUpdatePost** | **POST** /open_api/2/tools/third_site/update/
*ToolsUnionFlowPackageCreateV2Api* | **openApi2ToolsUnionFlowPackageCreatePost** | **POST** /open_api/2/tools/union/flow_package/create/
*ToolsUnionFlowPackageDeleteV2Api* | **openApi2ToolsUnionFlowPackageDeletePost** | **POST** /open_api/2/tools/union/flow_package/delete/
*ToolsUnionFlowPackageGetV2Api* | **openApi2ToolsUnionFlowPackageGetGet** | **GET** /open_api/2/tools/union/flow_package/get/
*ToolsUnionFlowPackagePromotionReportV30Api* | **openApiV30ToolsUnionFlowPackagePromotionReportGet** | **GET** /open_api/v3.0/tools/union/flow_package/promotion/report/
*ToolsUnionFlowPackageReportV2Api* | **openApi2ToolsUnionFlowPackageReportGet** | **GET** /open_api/2/tools/union/flow_package/report/
*ToolsUnionFlowPackageUpdateV2Api* | **openApi2ToolsUnionFlowPackageUpdatePost** | **POST** /open_api/2/tools/union/flow_package/update/
*ToolsVideoCheckAvailableAnchorV2Api* | **openApi2ToolsVideoCheckAvailableAnchorGet** | **GET** /open_api/2/tools/video/check_available_anchor/
*ToolsVideoCoverSuggestV2Api* | **openApi2ToolsVideoCoverSuggestGet** | **GET** /open_api/2/tools/video_cover/suggest/
*ToolsVideoPredictV2Api* | **openApi2ToolsVideoPredictGet** | **GET** /open_api/2/tools/video/predict/
*ToolsWechatAppletCreateV30Api* | **openApiV30ToolsWechatAppletCreatePost** | **POST** /open_api/v3.0/tools/wechat_applet/create/
*ToolsWechatAppletListV30Api* | **openApiV30ToolsWechatAppletListGet** | **GET** /open_api/v3.0/tools/wechat_applet/list/
*ToolsWechatAppletUpdateV30Api* | **openApiV30ToolsWechatAppletUpdatePost** | **POST** /open_api/v3.0/tools/wechat_applet/update/
*ToolsWechatGameCreateV30Api* | **openApiV30ToolsWechatGameCreatePost** | **POST** /open_api/v3.0/tools/wechat_game/create/
*ToolsWechatGameListV30Api* | **openApiV30ToolsWechatGameListGet** | **GET** /open_api/v3.0/tools/wechat_game/list/
*UserInfoV2Api* | **openApi2UserInfoGet** | **GET** /open_api/2/user/info/


## 问题建议与反馈
如果您在使用SDK过程中有任何问题与建议，请随时登录[开发者官网](https://open.oceanengine.com/labels) ，点击右下角的"咨询"按钮，与我们的客服支持人员联系

## 后续计划
1. 丰富各类场景示例
2. 推出其他语言的SDK