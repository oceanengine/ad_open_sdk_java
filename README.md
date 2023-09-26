# Marketing Java SDK

## 概述
巨量引擎开放平台 Marketing API(以下简称API) SDK 提供了Token获取、请求封装、响应解释等功能，以本地化方式轻松完成API的调用和结果的获取，旨在帮助开发者快速搭建投放管理系统。
- API version: 1.0.7
  - Build date: 2023-09-26T12:10:18.554407341+08:00[PRC]

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

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdCostProtectStatusGetV2Api* | [**openApi2AdCostProtectStatusGetGet**](docs/AdCostProtectStatusGetV2Api.md#openApi2AdCostProtectStatusGetGet) | **GET** /open_api/2/ad/cost_protect_status/get/ | 
*AdGetV2Api* | [**openApi2AdGetGet**](docs/AdGetV2Api.md#openApi2AdGetGet) | **GET** /open_api/2/ad/get/ | 
*AdRejectReasonV2Api* | [**openApi2AdRejectReasonGet**](docs/AdRejectReasonV2Api.md#openApi2AdRejectReasonGet) | **GET** /open_api/2/ad/reject_reason/ | 
*AdUpdateStatusV2Api* | [**openApi2AdUpdateStatusPost**](docs/AdUpdateStatusV2Api.md#openApi2AdUpdateStatusPost) | **POST** /open_api/2/ad/update/status/ | 
*AdlabGroupDetailV30Api* | [**openApiV30AdlabGroupDetailGet**](docs/AdlabGroupDetailV30Api.md#openApiV30AdlabGroupDetailGet) | **GET** /open_api/v3.0/adlab/group/detail/ | 
*AdlabGroupListV30Api* | [**openApiV30AdlabGroupListGet**](docs/AdlabGroupListV30Api.md#openApiV30AdlabGroupListGet) | **GET** /open_api/v3.0/adlab/group/list/ | 
*AdlabGroupUpdateStatusV30Api* | [**openApiV30AdlabGroupUpdateStatusPost**](docs/AdlabGroupUpdateStatusV30Api.md#openApiV30AdlabGroupUpdateStatusPost) | **POST** /open_api/v3.0/adlab/group/update_status/ | 
*AdvConvertOleConvertV2Api* | [**openApi2AdvConvertOleConvertPost**](docs/AdvConvertOleConvertV2Api.md#openApi2AdvConvertOleConvertPost) | **POST** /open_api/2/adv_convert/ole/convert/ | 
*AdvertiserAvatarGetV2Api* | [**openApi2AdvertiserAvatarGetGet**](docs/AdvertiserAvatarGetV2Api.md#openApi2AdvertiserAvatarGetGet) | **GET** /open_api/2/advertiser/avatar/get/ | 
*AdvertiserAvatarSubmitV2Api* | [**openApi2AdvertiserAvatarSubmitPost**](docs/AdvertiserAvatarSubmitV2Api.md#openApi2AdvertiserAvatarSubmitPost) | **POST** /open_api/2/advertiser/avatar/submit/ | 
*AdvertiserBudgetGetV2Api* | [**openApi2AdvertiserBudgetGetGet**](docs/AdvertiserBudgetGetV2Api.md#openApi2AdvertiserBudgetGetGet) | **GET** /open_api/2/advertiser/budget/get/ | 
*AdvertiserDeliveryPkgConfigV30Api* | [**openApiV30AdvertiserDeliveryPkgConfigGet**](docs/AdvertiserDeliveryPkgConfigV30Api.md#openApiV30AdvertiserDeliveryPkgConfigGet) | **GET** /open_api/v3.0/advertiser/delivery_pkg_config/ | 
*AdvertiserDeliveryPkgGetV30Api* | [**openApiV30AdvertiserDeliveryPkgGetGet**](docs/AdvertiserDeliveryPkgGetV30Api.md#openApiV30AdvertiserDeliveryPkgGetGet) | **GET** /open_api/v3.0/advertiser/delivery_pkg/get/ | 
*AdvertiserDeliveryPkgSubmitV30Api* | [**openApiV30AdvertiserDeliveryPkgSubmitPost**](docs/AdvertiserDeliveryPkgSubmitV30Api.md#openApiV30AdvertiserDeliveryPkgSubmitPost) | **POST** /open_api/v3.0/advertiser/delivery_pkg/submit/ | 
*AdvertiserDeliveryQualificationListV30Api* | [**openApiV30AdvertiserDeliveryQualificationListGet**](docs/AdvertiserDeliveryQualificationListV30Api.md#openApiV30AdvertiserDeliveryQualificationListGet) | **GET** /open_api/v3.0/advertiser/delivery_qualification/list/ | 
*AdvertiserDeliveryQualificationSubmitV30Api* | [**openApiV30AdvertiserDeliveryQualificationSubmitPost**](docs/AdvertiserDeliveryQualificationSubmitV30Api.md#openApiV30AdvertiserDeliveryQualificationSubmitPost) | **POST** /open_api/v3.0/advertiser/delivery_qualification/submit/ | 
*AdvertiserFundDailyStatV2Api* | [**openApi2AdvertiserFundDailyStatGet**](docs/AdvertiserFundDailyStatV2Api.md#openApi2AdvertiserFundDailyStatGet) | **GET** /open_api/2/advertiser/fund/daily_stat/ | 
*AdvertiserFundGetV2Api* | [**openApi2AdvertiserFundGetGet**](docs/AdvertiserFundGetV2Api.md#openApi2AdvertiserFundGetGet) | **GET** /open_api/2/advertiser/fund/get/ | 
*AdvertiserFundTransactionGetV2Api* | [**openApi2AdvertiserFundTransactionGetGet**](docs/AdvertiserFundTransactionGetV2Api.md#openApi2AdvertiserFundTransactionGetGet) | **GET** /open_api/2/advertiser/fund/transaction/get/ | 
*AdvertiserInfoV2Api* | [**openApi2AdvertiserInfoGet**](docs/AdvertiserInfoV2Api.md#openApi2AdvertiserInfoGet) | **GET** /open_api/2/advertiser/info/ | 
*AdvertiserPublicInfoV2Api* | [**openApi2AdvertiserPublicInfoGet**](docs/AdvertiserPublicInfoV2Api.md#openApi2AdvertiserPublicInfoGet) | **GET** /open_api/2/advertiser/public_info/ | 
*AdvertiserQualificationCreateV2V2Api* | [**openApi2AdvertiserQualificationCreateV2Post**](docs/AdvertiserQualificationCreateV2V2Api.md#openApi2AdvertiserQualificationCreateV2Post) | **POST** /open_api/2/advertiser/qualification/create_v2/ | 
*AdvertiserQualificationGetV30Api* | [**openApiV30AdvertiserQualificationGetGet**](docs/AdvertiserQualificationGetV30Api.md#openApiV30AdvertiserQualificationGetGet) | **GET** /open_api/v3.0/advertiser/qualification/get/ | 
*AdvertiserQualificationSelectV2V2Api* | [**openApi2AdvertiserQualificationSelectV2Get**](docs/AdvertiserQualificationSelectV2V2Api.md#openApi2AdvertiserQualificationSelectV2Get) | **GET** /open_api/2/advertiser/qualification/select_v2/ | 
*AdvertiserQualificationSubmitV30Api* | [**openApiV30AdvertiserQualificationSubmitPost**](docs/AdvertiserQualificationSubmitV30Api.md#openApiV30AdvertiserQualificationSubmitPost) | **POST** /open_api/v3.0/advertiser/qualification/submit/ | 
*AdvertiserTransferableFundGetV2Api* | [**openApi2AdvertiserTransferableFundGetGet**](docs/AdvertiserTransferableFundGetV2Api.md#openApi2AdvertiserTransferableFundGetGet) | **GET** /open_api/2/advertiser/transferable_fund/get/ | 
*AdvertiserUpdateBudgetV2Api* | [**openApi2AdvertiserUpdateBudgetPost**](docs/AdvertiserUpdateBudgetV2Api.md#openApi2AdvertiserUpdateBudgetPost) | **POST** /open_api/2/advertiser/update/budget/ | 
*AgentAdvertiserCopyV2Api* | [**openApi2AgentAdvertiserCopyPost**](docs/AgentAdvertiserCopyV2Api.md#openApi2AgentAdvertiserCopyPost) | **POST** /open_api/2/agent/advertiser/copy/ | 
*AgentAdvertiserSelectV2Api* | [**openApi2AgentAdvertiserSelectGet**](docs/AgentAdvertiserSelectV2Api.md#openApi2AgentAdvertiserSelectGet) | **GET** /open_api/2/agent/advertiser/select/ | 
*AgentAdvertiserUpdateV2Api* | [**openApi2AgentAdvertiserUpdatePost**](docs/AgentAdvertiserUpdateV2Api.md#openApi2AgentAdvertiserUpdatePost) | **POST** /open_api/2/agent/advertiser/update/ | 
*AgentChildAgentSelectV2Api* | [**openApi2AgentChildAgentSelectGet**](docs/AgentChildAgentSelectV2Api.md#openApi2AgentChildAgentSelectGet) | **GET** /open_api/2/agent/child_agent/select/ | 
*AgentFundTransferSeqCommitV2Api* | [**openApi2AgentFundTransferSeqCommitPost**](docs/AgentFundTransferSeqCommitV2Api.md#openApi2AgentFundTransferSeqCommitPost) | **POST** /open_api/2/agent/fund/transfer_seq/commit/ | 
*AgentFundTransferSeqCreateV2Api* | [**openApi2AgentFundTransferSeqCreatePost**](docs/AgentFundTransferSeqCreateV2Api.md#openApi2AgentFundTransferSeqCreatePost) | **POST** /open_api/2/agent/fund/transfer_seq/create/ | 
*AgentInfoV2Api* | [**openApi2AgentInfoGet**](docs/AgentInfoV2Api.md#openApi2AgentInfoGet) | **GET** /open_api/2/agent/info/ | 
*AgentRefundTransferSeqCommitV2Api* | [**openApi2AgentRefundTransferSeqCommitPost**](docs/AgentRefundTransferSeqCommitV2Api.md#openApi2AgentRefundTransferSeqCommitPost) | **POST** /open_api/2/agent/refund/transfer_seq/commit/ | 
*AgentRefundTransferSeqCreateV2Api* | [**openApi2AgentRefundTransferSeqCreatePost**](docs/AgentRefundTransferSeqCreateV2Api.md#openApi2AgentRefundTransferSeqCreatePost) | **POST** /open_api/2/agent/refund/transfer_seq/create/ | 
*AnalyticsAttributionV30Api* | [**openApiV30AnalyticsAttributionPost**](docs/AnalyticsAttributionV30Api.md#openApiV30AnalyticsAttributionPost) | **POST** /open_api/v3.0/analytics/attribution/ | 
*AssetsCreativeComponentCreateV2Api* | [**openApi2AssetsCreativeComponentCreatePost**](docs/AssetsCreativeComponentCreateV2Api.md#openApi2AssetsCreativeComponentCreatePost) | **POST** /open_api/2/assets/creative_component/create/ | 
*AssetsCreativeComponentGetV2Api* | [**openApi2AssetsCreativeComponentGetGet**](docs/AssetsCreativeComponentGetV2Api.md#openApi2AssetsCreativeComponentGetGet) | **GET** /open_api/2/assets/creative_component/get/ | 
*AssetsCreativeComponentUpdateV2Api* | [**openApi2AssetsCreativeComponentUpdatePost**](docs/AssetsCreativeComponentUpdateV2Api.md#openApi2AssetsCreativeComponentUpdatePost) | **POST** /open_api/2/assets/creative_component/update/ | 
*AsyncTaskCreateV2Api* | [**openApi2AsyncTaskCreatePost**](docs/AsyncTaskCreateV2Api.md#openApi2AsyncTaskCreatePost) | **POST** /open_api/2/async_task/create/ | 
*AsyncTaskDownloadV2Api* | [**openApi2AsyncTaskDownloadGet**](docs/AsyncTaskDownloadV2Api.md#openApi2AsyncTaskDownloadGet) | **GET** /open_api/2/async_task/download/ | 
*AsyncTaskGetV2Api* | [**openApi2AsyncTaskGetGet**](docs/AsyncTaskGetV2Api.md#openApi2AsyncTaskGetGet) | **GET** /open_api/2/async_task/get/ | 
*AudiencePackageCreateV2Api* | [**openApi2AudiencePackageCreatePost**](docs/AudiencePackageCreateV2Api.md#openApi2AudiencePackageCreatePost) | **POST** /open_api/2/audience_package/create/ | 
*AudiencePackageDeleteV2Api* | [**openApi2AudiencePackageDeletePost**](docs/AudiencePackageDeleteV2Api.md#openApi2AudiencePackageDeletePost) | **POST** /open_api/2/audience_package/delete/ | 
*AudiencePackageUpdateV2Api* | [**openApi2AudiencePackageUpdatePost**](docs/AudiencePackageUpdateV2Api.md#openApi2AudiencePackageUpdatePost) | **POST** /open_api/2/audience_package/update/ | 
*BusinessPlatformCompanyAccountGetV30Api* | [**openApiV30BusinessPlatformCompanyAccountGetGet**](docs/BusinessPlatformCompanyAccountGetV30Api.md#openApiV30BusinessPlatformCompanyAccountGetGet) | **GET** /open_api/v3.0/business_platform/company_account/get/ | 
*BusinessPlatformCompanyInfoGetV30Api* | [**openApiV30BusinessPlatformCompanyInfoGetGet**](docs/BusinessPlatformCompanyInfoGetV30Api.md#openApiV30BusinessPlatformCompanyInfoGetGet) | **GET** /open_api/v3.0/business_platform/company_info/get/ | 
*BusinessPlatformPartnerOrganizationListV2Api* | [**openApi2BusinessPlatformPartnerOrganizationListGet**](docs/BusinessPlatformPartnerOrganizationListV2Api.md#openApi2BusinessPlatformPartnerOrganizationListGet) | **GET** /open_api/2/business_platform/partner_organization/list/ | 
*CampaignGetV2Api* | [**openApi2CampaignGetGet**](docs/CampaignGetV2Api.md#openApi2CampaignGetGet) | **GET** /open_api/2/campaign/get/ | 
*CampaignUpdateStatusV2Api* | [**openApi2CampaignUpdateStatusPost**](docs/CampaignUpdateStatusV2Api.md#openApi2CampaignUpdateStatusPost) | **POST** /open_api/2/campaign/update/status/ | 
*CarouselAdGetV2Api* | [**openApi2CarouselAdGetGet**](docs/CarouselAdGetV2Api.md#openApi2CarouselAdGetGet) | **GET** /open_api/2/carousel/ad/get/ | 
*CarouselCreateV2Api* | [**openApi2CarouselCreatePost**](docs/CarouselCreateV2Api.md#openApi2CarouselCreatePost) | **POST** /open_api/2/carousel/create/ | 
*CarouselDeleteV2Api* | [**openApi2CarouselDeletePost**](docs/CarouselDeleteV2Api.md#openApi2CarouselDeletePost) | **POST** /open_api/2/carousel/delete/ | 
*CarouselListV2Api* | [**openApi2CarouselListGet**](docs/CarouselListV2Api.md#openApi2CarouselListGet) | **GET** /open_api/2/carousel/list/ | 
*CarouselUpdateV2Api* | [**openApi2CarouselUpdatePost**](docs/CarouselUpdateV2Api.md#openApi2CarouselUpdatePost) | **POST** /open_api/2/carousel/update/ | 
*CdpBrandGetV30Api* | [**openApiV30CdpBrandGetGet**](docs/CdpBrandGetV30Api.md#openApiV30CdpBrandGetGet) | **GET** /open_api/v3.0/cdp/brand/get/ | 
*ClueCouponCodeConsumeV2Api* | [**openApi2ClueCouponCodeConsumePost**](docs/ClueCouponCodeConsumeV2Api.md#openApi2ClueCouponCodeConsumePost) | **POST** /open_api/2/clue/coupon/code/consume/ | 
*ClueCouponCodeGetV2Api* | [**openApi2ClueCouponCodeGetGet**](docs/ClueCouponCodeGetV2Api.md#openApi2ClueCouponCodeGetGet) | **GET** /open_api/2/clue/coupon/code/get/ | 
*ClueCouponCreateV2Api* | [**openApi2ClueCouponCreatePost**](docs/ClueCouponCreateV2Api.md#openApi2ClueCouponCreatePost) | **POST** /open_api/2/clue/coupon/create/ | 
*ClueCouponDetailV2Api* | [**openApi2ClueCouponDetailGet**](docs/ClueCouponDetailV2Api.md#openApi2ClueCouponDetailGet) | **GET** /open_api/2/clue/coupon/detail/ | 
*ClueCouponEmployeeCreateV2Api* | [**openApi2ClueCouponEmployeeCreatePost**](docs/ClueCouponEmployeeCreateV2Api.md#openApi2ClueCouponEmployeeCreatePost) | **POST** /open_api/2/clue/coupon/employee/create/ | 
*ClueCouponEmployeeDeleteV2Api* | [**openApi2ClueCouponEmployeeDeletePost**](docs/ClueCouponEmployeeDeleteV2Api.md#openApi2ClueCouponEmployeeDeletePost) | **POST** /open_api/2/clue/coupon/employee/delete/ | 
*ClueCouponEmployeeGetV2Api* | [**openApi2ClueCouponEmployeeGetGet**](docs/ClueCouponEmployeeGetV2Api.md#openApi2ClueCouponEmployeeGetGet) | **GET** /open_api/2/clue/coupon/employee/get/ | 
*ClueCouponGetV2Api* | [**openApi2ClueCouponGetGet**](docs/ClueCouponGetV2Api.md#openApi2ClueCouponGetGet) | **GET** /open_api/2/clue/coupon/get/ | 
*ClueCouponUpdateV2Api* | [**openApi2ClueCouponUpdatePost**](docs/ClueCouponUpdateV2Api.md#openApi2ClueCouponUpdatePost) | **POST** /open_api/2/clue/coupon/update/ | 
*ClueFormCreateV2Api* | [**openApi2ClueFormCreatePost**](docs/ClueFormCreateV2Api.md#openApi2ClueFormCreatePost) | **POST** /open_api/2/clue/form/create/ | 
*ClueFormDeleteV2Api* | [**openApi2ClueFormDeletePost**](docs/ClueFormDeleteV2Api.md#openApi2ClueFormDeletePost) | **POST** /open_api/2/clue/form/delete/ | 
*ClueFormDetailV2Api* | [**openApi2ClueFormDetailGet**](docs/ClueFormDetailV2Api.md#openApi2ClueFormDetailGet) | **GET** /open_api/2/clue/form/detail/ | 
*ClueFormListV2Api* | [**openApi2ClueFormListGet**](docs/ClueFormListV2Api.md#openApi2ClueFormListGet) | **GET** /open_api/2/clue/form/list/ | 
*ClueFormUpdateV2Api* | [**openApi2ClueFormUpdatePost**](docs/ClueFormUpdateV2Api.md#openApi2ClueFormUpdatePost) | **POST** /open_api/2/clue/form/update/ | 
*ClueSmartphoneCreateV2Api* | [**openApi2ClueSmartphoneCreatePost**](docs/ClueSmartphoneCreateV2Api.md#openApi2ClueSmartphoneCreatePost) | **POST** /open_api/2/clue/smartphone/create/ | 
*ClueSmartphoneDeleteV2Api* | [**openApi2ClueSmartphoneDeletePost**](docs/ClueSmartphoneDeleteV2Api.md#openApi2ClueSmartphoneDeletePost) | **POST** /open_api/2/clue/smartphone/delete/ | 
*ClueSmartphoneGetV2Api* | [**openApi2ClueSmartphoneGetGet**](docs/ClueSmartphoneGetV2Api.md#openApi2ClueSmartphoneGetGet) | **GET** /open_api/2/clue/smartphone/get/ | 
*ClueSmartphoneRecordV2Api* | [**openApi2ClueSmartphoneRecordGet**](docs/ClueSmartphoneRecordV2Api.md#openApi2ClueSmartphoneRecordGet) | **GET** /open_api/2/clue/smartphone/record/ | 
*ClueWechatInstanceDetailV2Api* | [**openApi2ClueWechatInstanceDetailGet**](docs/ClueWechatInstanceDetailV2Api.md#openApi2ClueWechatInstanceDetailGet) | **GET** /open_api/2/clue/wechat_instance/detail/ | 
*ClueWechatInstanceListV2Api* | [**openApi2ClueWechatInstanceListGet**](docs/ClueWechatInstanceListV2Api.md#openApi2ClueWechatInstanceListGet) | **GET** /open_api/2/clue/wechat_instance/list/ | 
*ClueWechatInstanceUpdateV2Api* | [**openApi2ClueWechatInstanceUpdatePost**](docs/ClueWechatInstanceUpdateV2Api.md#openApi2ClueWechatInstanceUpdatePost) | **POST** /open_api/2/clue/wechat_instance/update/ | 
*ClueWechatPoolListV2Api* | [**openApi2ClueWechatPoolListGet**](docs/ClueWechatPoolListV2Api.md#openApi2ClueWechatPoolListGet) | **GET** /open_api/2/clue/wechat_pool/list/ | 
*CreativeAdMetricsV2Api* | [**openApi2CreativeAdMetricsGet**](docs/CreativeAdMetricsV2Api.md#openApi2CreativeAdMetricsGet) | **GET** /open_api/2/creative/ad/metrics/ | 
*CreativeAutoGenerateConfigCreateV2Api* | [**openApi2CreativeAutoGenerateConfigCreatePost**](docs/CreativeAutoGenerateConfigCreateV2Api.md#openApi2CreativeAutoGenerateConfigCreatePost) | **POST** /open_api/2/creative/auto_generate_config/create/ | 
*CreativeAutoGenerateConfigGetV2Api* | [**openApi2CreativeAutoGenerateConfigGetGet**](docs/CreativeAutoGenerateConfigGetV2Api.md#openApi2CreativeAutoGenerateConfigGetGet) | **GET** /open_api/2/creative/auto_generate_config/get/ | 
*CreativeAutoGenerateConfigV2CreateV2Api* | [**openApi2CreativeAutoGenerateConfigV2CreatePost**](docs/CreativeAutoGenerateConfigV2CreateV2Api.md#openApi2CreativeAutoGenerateConfigV2CreatePost) | **POST** /open_api/2/creative/auto_generate_config/v2/create/ | 
*CreativeDetailGetV30Api* | [**openApiV30CreativeDetailGetGet**](docs/CreativeDetailGetV30Api.md#openApiV30CreativeDetailGetGet) | **GET** /open_api/v3.0/creative/detail/get/ | 
*CreativeGetV2Api* | [**openApi2CreativeGetGet**](docs/CreativeGetV2Api.md#openApi2CreativeGetGet) | **GET** /open_api/2/creative/get/ | 
*CreativeMaterialMetricsV2Api* | [**openApi2CreativeMaterialMetricsGet**](docs/CreativeMaterialMetricsV2Api.md#openApi2CreativeMaterialMetricsGet) | **GET** /open_api/2/creative/material/metrics/ | 
*CreativeRejectReasonV2Api* | [**openApi2CreativeRejectReasonGet**](docs/CreativeRejectReasonV2Api.md#openApi2CreativeRejectReasonGet) | **GET** /open_api/2/creative/reject_reason/ | 
*CreativeStrategyListV2Api* | [**openApi2CreativeStrategyListGet**](docs/CreativeStrategyListV2Api.md#openApi2CreativeStrategyListGet) | **GET** /open_api/2/creative/strategy/list/ | 
*CreativeTemplateDetailGetV2Api* | [**openApi2CreativeTemplateDetailGetGet**](docs/CreativeTemplateDetailGetV2Api.md#openApi2CreativeTemplateDetailGetGet) | **GET** /open_api/2/creative/template/detail/get/ | 
*CreativeTemplateListGetV2Api* | [**openApi2CreativeTemplateListGetGet**](docs/CreativeTemplateListGetV2Api.md#openApi2CreativeTemplateListGetGet) | **GET** /open_api/2/creative/template/list/get/ | 
*CreativeTemplateTagsGetV2Api* | [**openApi2CreativeTemplateTagsGetGet**](docs/CreativeTemplateTagsGetV2Api.md#openApi2CreativeTemplateTagsGetGet) | **GET** /open_api/2/creative/template/tags/get/ | 
*CustomerCenterAdvertiserListV2Api* | [**openApi2CustomerCenterAdvertiserListGet**](docs/CustomerCenterAdvertiserListV2Api.md#openApi2CustomerCenterAdvertiserListGet) | **GET** /open_api/2/customer_center/advertiser/list/ | 
*CustomerCenterAdvertiserTransferableListV2Api* | [**openApi2CustomerCenterAdvertiserTransferableListGet**](docs/CustomerCenterAdvertiserTransferableListV2Api.md#openApi2CustomerCenterAdvertiserTransferableListGet) | **GET** /open_api/2/customer_center/advertiser/transferable/list/ | 
*CustomerCenterFundTransferSeqCommitV2Api* | [**openApi2CustomerCenterFundTransferSeqCommitPost**](docs/CustomerCenterFundTransferSeqCommitV2Api.md#openApi2CustomerCenterFundTransferSeqCommitPost) | **POST** /open_api/2/customer_center/fund/transfer_seq/commit/ | 
*CustomerCenterFundTransferSeqCreateV2Api* | [**openApi2CustomerCenterFundTransferSeqCreatePost**](docs/CustomerCenterFundTransferSeqCreateV2Api.md#openApi2CustomerCenterFundTransferSeqCreatePost) | **POST** /open_api/2/customer_center/fund/transfer_seq/create/ | 
*DecorationCouponGetV30Api* | [**openApiV30DecorationCouponGetGet**](docs/DecorationCouponGetV30Api.md#openApiV30DecorationCouponGetGet) | **GET** /open_api/v3.0/decoration/coupon/get/ | 
*DmpBrandGetV2Api* | [**openApi2DmpBrandGetGet**](docs/DmpBrandGetV2Api.md#openApi2DmpBrandGetGet) | **GET** /open_api/2/dmp/brand/get/ | 
*DmpCustomAudienceCopyV2Api* | [**openApi2DmpCustomAudienceCopyPost**](docs/DmpCustomAudienceCopyV2Api.md#openApi2DmpCustomAudienceCopyPost) | **POST** /open_api/2/dmp/custom_audience/copy/ | 
*DmpCustomAudienceDeleteV2Api* | [**openApi2DmpCustomAudienceDeletePost**](docs/DmpCustomAudienceDeleteV2Api.md#openApi2DmpCustomAudienceDeletePost) | **POST** /open_api/2/dmp/custom_audience/delete/ | 
*DmpCustomAudiencePublishV2Api* | [**openApi2DmpCustomAudiencePublishPost**](docs/DmpCustomAudiencePublishV2Api.md#openApi2DmpCustomAudiencePublishPost) | **POST** /open_api/2/dmp/custom_audience/publish/ | 
*DmpCustomAudiencePushV2V2Api* | [**openApi2DmpCustomAudiencePushV2Post**](docs/DmpCustomAudiencePushV2V2Api.md#openApi2DmpCustomAudiencePushV2Post) | **POST** /open_api/2/dmp/custom_audience/push_v2/ | 
*DmpCustomAudienceReadV2Api* | [**openApi2DmpCustomAudienceReadGet**](docs/DmpCustomAudienceReadV2Api.md#openApi2DmpCustomAudienceReadGet) | **GET** /open_api/2/dmp/custom_audience/read/ | 
*DmpCustomAudienceSelectV2Api* | [**openApi2DmpCustomAudienceSelectGet**](docs/DmpCustomAudienceSelectV2Api.md#openApi2DmpCustomAudienceSelectGet) | **GET** /open_api/2/dmp/custom_audience/select/ | 
*DmpDataSourceCreateV2Api* | [**openApi2DmpDataSourceCreatePost**](docs/DmpDataSourceCreateV2Api.md#openApi2DmpDataSourceCreatePost) | **POST** /open_api/2/dmp/data_source/create/ | 
*DmpDataSourceFileUploadV2Api* | [**openApi2DmpDataSourceFileUploadPost**](docs/DmpDataSourceFileUploadV2Api.md#openApi2DmpDataSourceFileUploadPost) | **POST** /open_api/2/dmp/data_source/file/upload/ | 
*DmpDataSourceReadV2Api* | [**openApi2DmpDataSourceReadGet**](docs/DmpDataSourceReadV2Api.md#openApi2DmpDataSourceReadGet) | **GET** /open_api/2/dmp/data_source/read/ | 
*DmpDataSourceUpdateV2Api* | [**openApi2DmpDataSourceUpdatePost**](docs/DmpDataSourceUpdateV2Api.md#openApi2DmpDataSourceUpdatePost) | **POST** /open_api/2/dmp/data_source/update/ | 
*DouplusOrderListV30Api* | [**openApiV30DouplusOrderListGet**](docs/DouplusOrderListV30Api.md#openApiV30DouplusOrderListGet) | **GET** /open_api/v3.0/douplus/order/list/ | 
*DouplusOrderReportV30Api* | [**openApiV30DouplusOrderReportGet**](docs/DouplusOrderReportV30Api.md#openApiV30DouplusOrderReportGet) | **GET** /open_api/v3.0/douplus/order/report/ | 
*DpaAssetsDetailReadV2Api* | [**openApi2DpaAssetsDetailReadGet**](docs/DpaAssetsDetailReadV2Api.md#openApi2DpaAssetsDetailReadGet) | **GET** /open_api/2/dpa/assets/detail/read/ | 
*DpaAssetsListV2Api* | [**openApi2DpaAssetsListGet**](docs/DpaAssetsListV2Api.md#openApi2DpaAssetsListGet) | **GET** /open_api/2/dpa/assets/list/ | 
*DpaCategoryGetV2Api* | [**openApi2DpaCategoryGetGet**](docs/DpaCategoryGetV2Api.md#openApi2DpaCategoryGetGet) | **GET** /open_api/2/dpa/category/get/ | 
*DpaDetailGetV2Api* | [**openApi2DpaDetailGetGet**](docs/DpaDetailGetV2Api.md#openApi2DpaDetailGetGet) | **GET** /open_api/2/dpa/detail/get/ | 
*DpaDictGetV2Api* | [**openApi2DpaDictGetGet**](docs/DpaDictGetV2Api.md#openApi2DpaDictGetGet) | **GET** /open_api/2/dpa/dict/get/ | 
*DpaMetaGetV2Api* | [**openApi2DpaMetaGetGet**](docs/DpaMetaGetV2Api.md#openApi2DpaMetaGetGet) | **GET** /open_api/2/dpa/meta/get/ | 
*DpaProductAvailablesV2Api* | [**openApi2DpaProductAvailablesGet**](docs/DpaProductAvailablesV2Api.md#openApi2DpaProductAvailablesGet) | **GET** /open_api/2/dpa/product/availables/ | 
*DpaProductCreateV2Api* | [**openApi2DpaProductCreatePost**](docs/DpaProductCreateV2Api.md#openApi2DpaProductCreatePost) | **POST** /open_api/2/dpa/product/create/ | 
*DpaProductDeleteV2Api* | [**openApi2DpaProductDeletePost**](docs/DpaProductDeleteV2Api.md#openApi2DpaProductDeletePost) | **POST** /open_api/2/dpa/product/delete/ | 
*DpaProductDetailGetV2Api* | [**openApi2DpaProductDetailGetGet**](docs/DpaProductDetailGetV2Api.md#openApi2DpaProductDetailGetGet) | **GET** /open_api/2/dpa/product/detail/get/ | 
*DpaProductStatusBatchUpdateV2Api* | [**openApi2DpaProductStatusBatchUpdatePost**](docs/DpaProductStatusBatchUpdateV2Api.md#openApi2DpaProductStatusBatchUpdatePost) | **POST** /open_api/2/dpa/product_status/batch_update/ | 
*DpaProductUpdateV2Api* | [**openApi2DpaProductUpdatePost**](docs/DpaProductUpdateV2Api.md#openApi2DpaProductUpdatePost) | **POST** /open_api/2/dpa/product/update/ | 
*DpaTemplateGetV2Api* | [**openApi2DpaTemplateGetGet**](docs/DpaTemplateGetV2Api.md#openApi2DpaTemplateGetGet) | **GET** /open_api/2/dpa/template/get/ | 
*DpaVideoGetV2Api* | [**openApi2DpaVideoGetGet**](docs/DpaVideoGetV2Api.md#openApi2DpaVideoGetGet) | **GET** /open_api/2/dpa/video/get/ | 
*EnterpriseBindListGetV10Api* | [**openApiV10EnterpriseBindListGetGet**](docs/EnterpriseBindListGetV10Api.md#openApiV10EnterpriseBindListGetGet) | **GET** /open_api/v1.0/enterprise/bind/list/get/ | 
*EnterpriseCommentDetailV10Api* | [**openApiV10EnterpriseCommentDetailGet**](docs/EnterpriseCommentDetailV10Api.md#openApiV10EnterpriseCommentDetailGet) | **GET** /open_api/v1.0/enterprise/comment/detail/ | 
*EnterpriseCommentListGetV10Api* | [**openApiV10EnterpriseCommentListGetGet**](docs/EnterpriseCommentListGetV10Api.md#openApiV10EnterpriseCommentListGetGet) | **GET** /open_api/v1.0/enterprise/comment/list/get/ | 
*EnterpriseCommentReplyListV10Api* | [**openApiV10EnterpriseCommentReplyListGet**](docs/EnterpriseCommentReplyListV10Api.md#openApiV10EnterpriseCommentReplyListGet) | **GET** /open_api/v1.0/enterprise/comment/reply/list/ | 
*EnterpriseCommentReplyV10Api* | [**openApiV10EnterpriseCommentReplyPost**](docs/EnterpriseCommentReplyV10Api.md#openApiV10EnterpriseCommentReplyPost) | **POST** /open_api/v1.0/enterprise/comment/reply/ | 
*EnterpriseFlowCategoryGetV10Api* | [**openApiV10EnterpriseFlowCategoryGetGet**](docs/EnterpriseFlowCategoryGetV10Api.md#openApiV10EnterpriseFlowCategoryGetGet) | **GET** /open_api/v1.0/enterprise/flow/category/get/ | 
*EnterpriseInfoV10Api* | [**openApiV10EnterpriseInfoGet**](docs/EnterpriseInfoV10Api.md#openApiV10EnterpriseInfoGet) | **GET** /open_api/v1.0/enterprise/info/ | 
*EnterpriseItemListV10Api* | [**openApiV10EnterpriseItemListGet**](docs/EnterpriseItemListV10Api.md#openApiV10EnterpriseItemListGet) | **GET** /open_api/v1.0/enterprise/item/list/ | 
*EnterpriseOperationLogGetV10Api* | [**openApiV10EnterpriseOperationLogGetGet**](docs/EnterpriseOperationLogGetV10Api.md#openApiV10EnterpriseOperationLogGetGet) | **GET** /open_api/v1.0/enterprise/operation/log/get/ | 
*EnterpriseOverviewDataGetV10Api* | [**openApiV10EnterpriseOverviewDataGetGet**](docs/EnterpriseOverviewDataGetV10Api.md#openApiV10EnterpriseOverviewDataGetGet) | **GET** /open_api/v1.0/enterprise/overview/data/get/ | 
*EnterpriseVideoInfoGetV10Api* | [**openApiV10EnterpriseVideoInfoGetGet**](docs/EnterpriseVideoInfoGetV10Api.md#openApiV10EnterpriseVideoInfoGetGet) | **GET** /open_api/v1.0/enterprise/video/info/get/ | 
*EventManagerAssetsCreateV2Api* | [**openApi2EventManagerAssetsCreatePost**](docs/EventManagerAssetsCreateV2Api.md#openApi2EventManagerAssetsCreatePost) | **POST** /open_api/2/event_manager/assets/create/ | 
*EventManagerAvailableEventsGetV2Api* | [**openApi2EventManagerAvailableEventsGetGet**](docs/EventManagerAvailableEventsGetV2Api.md#openApi2EventManagerAvailableEventsGetGet) | **GET** /open_api/2/event_manager/available_events/get/ | 
*EventManagerDeepBidTypeGetV30Api* | [**openApiV30EventManagerDeepBidTypeGetGet**](docs/EventManagerDeepBidTypeGetV30Api.md#openApiV30EventManagerDeepBidTypeGetGet) | **GET** /open_api/v3.0/event_manager/deep_bid_type/get/ | 
*EventManagerEventConfigsGetV2Api* | [**openApi2EventManagerEventConfigsGetGet**](docs/EventManagerEventConfigsGetV2Api.md#openApi2EventManagerEventConfigsGetGet) | **GET** /open_api/2/event_manager/event_configs/get/ | 
*EventManagerEventsCreateV2Api* | [**openApi2EventManagerEventsCreatePost**](docs/EventManagerEventsCreateV2Api.md#openApi2EventManagerEventsCreatePost) | **POST** /open_api/2/event_manager/events/create/ | 
*EventManagerOptimizedGoalGetV2V30Api* | [**openApiV30EventManagerOptimizedGoalGetV2Get**](docs/EventManagerOptimizedGoalGetV2V30Api.md#openApiV30EventManagerOptimizedGoalGetV2Get) | **GET** /open_api/v3.0/event_manager/optimized_goal/get_v2/ | 
*EventManagerShareCancelV30Api* | [**openApiV30EventManagerShareCancelPost**](docs/EventManagerShareCancelV30Api.md#openApiV30EventManagerShareCancelPost) | **POST** /open_api/v3.0/event_manager/share/cancel/ | 
*EventManagerShareGetV30Api* | [**openApiV30EventManagerShareGetGet**](docs/EventManagerShareGetV30Api.md#openApiV30EventManagerShareGetGet) | **GET** /open_api/v3.0/event_manager/share/get/ | 
*EventManagerShareV30Api* | [**openApiV30EventManagerSharePost**](docs/EventManagerShareV30Api.md#openApiV30EventManagerSharePost) | **POST** /open_api/v3.0/event_manager/share/ | 
*EventManagerTrackUrlCreateV2Api* | [**openApi2EventManagerTrackUrlCreatePost**](docs/EventManagerTrackUrlCreateV2Api.md#openApi2EventManagerTrackUrlCreatePost) | **POST** /open_api/2/event_manager/track_url/create/ | 
*EventManagerTrackUrlGetV2Api* | [**openApi2EventManagerTrackUrlGetGet**](docs/EventManagerTrackUrlGetV2Api.md#openApi2EventManagerTrackUrlGetGet) | **GET** /open_api/2/event_manager/track_url/get/ | 
*EventManagerTrackUrlUpdateV2Api* | [**openApi2EventManagerTrackUrlUpdatePost**](docs/EventManagerTrackUrlUpdateV2Api.md#openApi2EventManagerTrackUrlUpdatePost) | **POST** /open_api/2/event_manager/track_url/update/ | 
*FileImageAdGetV2Api* | [**openApi2FileImageAdGetGet**](docs/FileImageAdGetV2Api.md#openApi2FileImageAdGetGet) | **GET** /open_api/2/file/image/ad/get/ | 
*FileImageDeleteV30Api* | [**openApiV30FileImageDeletePost**](docs/FileImageDeleteV30Api.md#openApiV30FileImageDeletePost) | **POST** /open_api/v3.0/file/image/delete/ | 
*FileImageGetV2Api* | [**openApi2FileImageGetGet**](docs/FileImageGetV2Api.md#openApi2FileImageGetGet) | **GET** /open_api/2/file/image/get/ | 
*FileMaterialBindV2Api* | [**openApi2FileMaterialBindPost**](docs/FileMaterialBindV2Api.md#openApi2FileMaterialBindPost) | **POST** /open_api/2/file/material/bind/ | 
*FileMaterialDetailV2Api* | [**openApi2FileMaterialDetailGet**](docs/FileMaterialDetailV2Api.md#openApi2FileMaterialDetailGet) | **GET** /open_api/2/file/material/detail/ | 
*FileMaterialListV2Api* | [**openApi2FileMaterialListGet**](docs/FileMaterialListV2Api.md#openApi2FileMaterialListGet) | **GET** /open_api/2/file/material/list/ | 
*FileQualityGetV30Api* | [**openApiV30FileQualityGetGet**](docs/FileQualityGetV30Api.md#openApiV30FileQualityGetGet) | **GET** /open_api/v3.0/file/quality/get/ | 
*FileQualitySubmitV30Api* | [**openApiV30FileQualitySubmitPost**](docs/FileQualitySubmitV30Api.md#openApiV30FileQualitySubmitPost) | **POST** /open_api/v3.0/file/quality/submit/ | 
*FileVideoAdGetV2Api* | [**openApi2FileVideoAdGetGet**](docs/FileVideoAdGetV2Api.md#openApi2FileVideoAdGetGet) | **GET** /open_api/2/file/video/ad/get/ | 
*FileVideoAwemeGetV2Api* | [**openApi2FileVideoAwemeGetGet**](docs/FileVideoAwemeGetV2Api.md#openApi2FileVideoAwemeGetGet) | **GET** /open_api/2/file/video/aweme/get/ | 
*FileVideoDeleteV2Api* | [**openApi2FileVideoDeletePost**](docs/FileVideoDeleteV2Api.md#openApi2FileVideoDeletePost) | **POST** /open_api/2/file/video/delete/ | 
*FileVideoEfficiencyGetV2Api* | [**openApi2FileVideoEfficiencyGetGet**](docs/FileVideoEfficiencyGetV2Api.md#openApi2FileVideoEfficiencyGetGet) | **GET** /open_api/2/file/video/efficiency/get/ | 
*FileVideoGetV2Api* | [**openApi2FileVideoGetGet**](docs/FileVideoGetV2Api.md#openApi2FileVideoGetGet) | **GET** /open_api/2/file/video/get/ | 
*FileVideoMaterialClearTaskCreateV2Api* | [**openApi2FileVideoMaterialClearTaskCreatePost**](docs/FileVideoMaterialClearTaskCreateV2Api.md#openApi2FileVideoMaterialClearTaskCreatePost) | **POST** /open_api/2/file/video/material/clear_task/create/ | 
*FileVideoMaterialClearTaskGetV2Api* | [**openApi2FileVideoMaterialClearTaskGetGet**](docs/FileVideoMaterialClearTaskGetV2Api.md#openApi2FileVideoMaterialClearTaskGetGet) | **GET** /open_api/2/file/video/material/clear_task/get/ | 
*FileVideoMaterialClearTaskResultGetV2Api* | [**openApi2FileVideoMaterialClearTaskResultGetGet**](docs/FileVideoMaterialClearTaskResultGetV2Api.md#openApi2FileVideoMaterialClearTaskResultGetGet) | **GET** /open_api/2/file/video/material/clear_task_result/get/ | 
*FileVideoUpdateV2Api* | [**openApi2FileVideoUpdatePost**](docs/FileVideoUpdateV2Api.md#openApi2FileVideoUpdatePost) | **POST** /open_api/2/file/video/update/ | 
*FundSharedWalletBalanceGetV2Api* | [**openApi2FundSharedWalletBalanceGetGet**](docs/FundSharedWalletBalanceGetV2Api.md#openApi2FundSharedWalletBalanceGetGet) | **GET** /open_api/2/fund/shared_wallet_balance/get/ | 
*KeywordCreateV30Api* | [**openApiV30KeywordCreatePost**](docs/KeywordCreateV30Api.md#openApiV30KeywordCreatePost) | **POST** /open_api/v3.0/keyword/create/ | 
*KeywordDeleteV30Api* | [**openApiV30KeywordDeletePost**](docs/KeywordDeleteV30Api.md#openApiV30KeywordDeletePost) | **POST** /open_api/v3.0/keyword/delete/ | 
*KeywordFeedadsSuggestV2Api* | [**openApi2KeywordFeedadsSuggestGet**](docs/KeywordFeedadsSuggestV2Api.md#openApi2KeywordFeedadsSuggestGet) | **GET** /open_api/2/keyword_feedads/suggest/ | 
*KeywordGetV2Api* | [**openApi2KeywordGetGet**](docs/KeywordGetV2Api.md#openApi2KeywordGetGet) | **GET** /open_api/2/keyword/get/ | 
*KeywordListV30Api* | [**openApiV30KeywordListGet**](docs/KeywordListV30Api.md#openApiV30KeywordListGet) | **GET** /open_api/v3.0/keyword/list/ | 
*KeywordUpdateV30Api* | [**openApiV30KeywordUpdatePost**](docs/KeywordUpdateV30Api.md#openApiV30KeywordUpdatePost) | **POST** /open_api/v3.0/keyword/update/ | 
*MajordomoAdvertiserSelectV2Api* | [**openApi2MajordomoAdvertiserSelectGet**](docs/MajordomoAdvertiserSelectV2Api.md#openApi2MajordomoAdvertiserSelectGet) | **GET** /open_api/2/majordomo/advertiser/select/ | 
*MaterialStatusUpdateV30Api* | [**openApiV30MaterialStatusUpdatePost**](docs/MaterialStatusUpdateV30Api.md#openApiV30MaterialStatusUpdatePost) | **POST** /open_api/v3.0/material/status/update/ | 
*NativeAnchorCreateV30Api* | [**openApiV30NativeAnchorCreatePost**](docs/NativeAnchorCreateV30Api.md#openApiV30NativeAnchorCreatePost) | **POST** /open_api/v3.0/native_anchor/create/ | 
*NativeAnchorGetV30Api* | [**openApiV30NativeAnchorGetGet**](docs/NativeAnchorGetV30Api.md#openApiV30NativeAnchorGetGet) | **GET** /open_api/v3.0/native_anchor/get/ | 
*Oauth2AccessTokenApi* | [**openApiOauth2AccessTokenPost**](docs/Oauth2AccessTokenApi.md#openApiOauth2AccessTokenPost) | **POST** /open_api/oauth2/access_token/ | 
*Oauth2AdvertiserGetApi* | [**openApiOauth2AdvertiserGetGet**](docs/Oauth2AdvertiserGetApi.md#openApiOauth2AdvertiserGetGet) | **GET** /open_api/oauth2/advertiser/get/ | 
*Oauth2AppAccessTokenApi* | [**openApiOauth2AppAccessTokenPost**](docs/Oauth2AppAccessTokenApi.md#openApiOauth2AppAccessTokenPost) | **POST** /open_api/oauth2/app_access_token/ | 
*Oauth2RefreshTokenApi* | [**openApiOauth2RefreshTokenPost**](docs/Oauth2RefreshTokenApi.md#openApiOauth2RefreshTokenPost) | **POST** /open_api/oauth2/refresh_token/ | 
*ProjectBudgetUpdateV30Api* | [**openApiV30ProjectBudgetUpdatePost**](docs/ProjectBudgetUpdateV30Api.md#openApiV30ProjectBudgetUpdatePost) | **POST** /open_api/v3.0/project/budget/update/ | 
*ProjectCreateV30Api* | [**openApiV30ProjectCreatePost**](docs/ProjectCreateV30Api.md#openApiV30ProjectCreatePost) | **POST** /open_api/v3.0/project/create/ | 
*ProjectDeleteV30Api* | [**openApiV30ProjectDeletePost**](docs/ProjectDeleteV30Api.md#openApiV30ProjectDeletePost) | **POST** /open_api/v3.0/project/delete/ | 
*ProjectListV30Api* | [**openApiV30ProjectListGet**](docs/ProjectListV30Api.md#openApiV30ProjectListGet) | **GET** /open_api/v3.0/project/list/ | 
*ProjectStatusUpdateV30Api* | [**openApiV30ProjectStatusUpdatePost**](docs/ProjectStatusUpdateV30Api.md#openApiV30ProjectStatusUpdatePost) | **POST** /open_api/v3.0/project/status/update/ | 
*ProjectUpdateV30Api* | [**openApiV30ProjectUpdatePost**](docs/ProjectUpdateV30Api.md#openApiV30ProjectUpdatePost) | **POST** /open_api/v3.0/project/update/ | 
*PromotionAutoGenerateConfigCreateV30Api* | [**openApiV30PromotionAutoGenerateConfigCreatePost**](docs/PromotionAutoGenerateConfigCreateV30Api.md#openApiV30PromotionAutoGenerateConfigCreatePost) | **POST** /open_api/v3.0/promotion/auto_generate_config/create/ | 
*PromotionAutoGenerateConfigGetV30Api* | [**openApiV30PromotionAutoGenerateConfigGetGet**](docs/PromotionAutoGenerateConfigGetV30Api.md#openApiV30PromotionAutoGenerateConfigGetGet) | **GET** /open_api/v3.0/promotion/auto_generate_config/get/ | 
*PromotionBidUpdateV30Api* | [**openApiV30PromotionBidUpdatePost**](docs/PromotionBidUpdateV30Api.md#openApiV30PromotionBidUpdatePost) | **POST** /open_api/v3.0/promotion/bid/update/ | 
*PromotionBudgetUpdateV30Api* | [**openApiV30PromotionBudgetUpdatePost**](docs/PromotionBudgetUpdateV30Api.md#openApiV30PromotionBudgetUpdatePost) | **POST** /open_api/v3.0/promotion/budget/update/ | 
*PromotionCostProtectStatusGetV30Api* | [**openApiV30PromotionCostProtectStatusGetGet**](docs/PromotionCostProtectStatusGetV30Api.md#openApiV30PromotionCostProtectStatusGetGet) | **GET** /open_api/v3.0/promotion/cost_protect_status/get/ | 
*PromotionCreateV30Api* | [**openApiV30PromotionCreatePost**](docs/PromotionCreateV30Api.md#openApiV30PromotionCreatePost) | **POST** /open_api/v3.0/promotion/create/ | 
*PromotionDeepbidUpdateV30Api* | [**openApiV30PromotionDeepbidUpdatePost**](docs/PromotionDeepbidUpdateV30Api.md#openApiV30PromotionDeepbidUpdatePost) | **POST** /open_api/v3.0/promotion/deepbid/update/ | 
*PromotionDeleteV30Api* | [**openApiV30PromotionDeletePost**](docs/PromotionDeleteV30Api.md#openApiV30PromotionDeletePost) | **POST** /open_api/v3.0/promotion/delete/ | 
*PromotionListV30Api* | [**openApiV30PromotionListGet**](docs/PromotionListV30Api.md#openApiV30PromotionListGet) | **GET** /open_api/v3.0/promotion/list/ | 
*PromotionRejectReasonGetV30Api* | [**openApiV30PromotionRejectReasonGetGet**](docs/PromotionRejectReasonGetV30Api.md#openApiV30PromotionRejectReasonGetGet) | **GET** /open_api/v3.0/promotion/reject_reason/get/ | 
*PromotionScheduleTimeUpdateV30Api* | [**openApiV30PromotionScheduleTimeUpdatePost**](docs/PromotionScheduleTimeUpdateV30Api.md#openApiV30PromotionScheduleTimeUpdatePost) | **POST** /open_api/v3.0/promotion/schedule_time/update/ | 
*PromotionStatusUpdateV30Api* | [**openApiV30PromotionStatusUpdatePost**](docs/PromotionStatusUpdateV30Api.md#openApiV30PromotionStatusUpdatePost) | **POST** /open_api/v3.0/promotion/status/update/ | 
*PromotionUpdateV30Api* | [**openApiV30PromotionUpdatePost**](docs/PromotionUpdateV30Api.md#openApiV30PromotionUpdatePost) | **POST** /open_api/v3.0/promotion/update/ | 
*QianchuanAccountBudgetGetV10Api* | [**openApiV10QianchuanAccountBudgetGetGet**](docs/QianchuanAccountBudgetGetV10Api.md#openApiV10QianchuanAccountBudgetGetGet) | **GET** /open_api/v1.0/qianchuan/account/budget/get/ | 
*QianchuanAccountBudgetUpdateV10Api* | [**openApiV10QianchuanAccountBudgetUpdatePost**](docs/QianchuanAccountBudgetUpdateV10Api.md#openApiV10QianchuanAccountBudgetUpdatePost) | **POST** /open_api/v1.0/qianchuan/account/budget/update/ | 
*QianchuanAdBidUpdateV10Api* | [**openApiV10QianchuanAdBidUpdatePost**](docs/QianchuanAdBidUpdateV10Api.md#openApiV10QianchuanAdBidUpdatePost) | **POST** /open_api/v1.0/qianchuan/ad/bid/update/ | 
*QianchuanAdBudgetUpdateV10Api* | [**openApiV10QianchuanAdBudgetUpdatePost**](docs/QianchuanAdBudgetUpdateV10Api.md#openApiV10QianchuanAdBudgetUpdatePost) | **POST** /open_api/v1.0/qianchuan/ad/budget/update/ | 
*QianchuanAdCreateV10Api* | [**openApiV10QianchuanAdCreatePost**](docs/QianchuanAdCreateV10Api.md#openApiV10QianchuanAdCreatePost) | **POST** /open_api/v1.0/qianchuan/ad/create/ | 
*QianchuanAdDetailGetV10Api* | [**openApiV10QianchuanAdDetailGetGet**](docs/QianchuanAdDetailGetV10Api.md#openApiV10QianchuanAdDetailGetGet) | **GET** /open_api/v1.0/qianchuan/ad/detail/get/ | 
*QianchuanAdGetV10Api* | [**openApiV10QianchuanAdGetGet**](docs/QianchuanAdGetV10Api.md#openApiV10QianchuanAdGetGet) | **GET** /open_api/v1.0/qianchuan/ad/get/ | 
*QianchuanAdKeywordsGetV10Api* | [**openApiV10QianchuanAdKeywordsGetGet**](docs/QianchuanAdKeywordsGetV10Api.md#openApiV10QianchuanAdKeywordsGetGet) | **GET** /open_api/v1.0/qianchuan/ad/keywords/get/ | 
*QianchuanAdKeywordsUpdateV10Api* | [**openApiV10QianchuanAdKeywordsUpdatePost**](docs/QianchuanAdKeywordsUpdateV10Api.md#openApiV10QianchuanAdKeywordsUpdatePost) | **POST** /open_api/v1.0/qianchuan/ad/keywords/update/ | 
*QianchuanAdPivativewordsGetV10Api* | [**openApiV10QianchuanAdPivativewordsGetGet**](docs/QianchuanAdPivativewordsGetV10Api.md#openApiV10QianchuanAdPivativewordsGetGet) | **GET** /open_api/v1.0/qianchuan/ad/pivativewords/get/ | 
*QianchuanAdPivativewordsUpdateV10Api* | [**openApiV10QianchuanAdPivativewordsUpdatePost**](docs/QianchuanAdPivativewordsUpdateV10Api.md#openApiV10QianchuanAdPivativewordsUpdatePost) | **POST** /open_api/v1.0/qianchuan/ad/pivativewords/update/ | 
*QianchuanAdQuotaGetV10Api* | [**openApiV10QianchuanAdQuotaGetGet**](docs/QianchuanAdQuotaGetV10Api.md#openApiV10QianchuanAdQuotaGetGet) | **GET** /open_api/v1.0/qianchuan/ad/quota/get/ | 
*QianchuanAdRecommendKeywordsGetV10Api* | [**openApiV10QianchuanAdRecommendKeywordsGetGet**](docs/QianchuanAdRecommendKeywordsGetV10Api.md#openApiV10QianchuanAdRecommendKeywordsGetGet) | **GET** /open_api/v1.0/qianchuan/ad/recommend_keywords/get | 
*QianchuanAdRegionUpdateV10Api* | [**openApiV10QianchuanAdRegionUpdatePost**](docs/QianchuanAdRegionUpdateV10Api.md#openApiV10QianchuanAdRegionUpdatePost) | **POST** /open_api/v1.0/qianchuan/ad/region/update/ | 
*QianchuanAdRejectReasonV10Api* | [**openApiV10QianchuanAdRejectReasonGet**](docs/QianchuanAdRejectReasonV10Api.md#openApiV10QianchuanAdRejectReasonGet) | **GET** /open_api/v1.0/qianchuan/ad/reject_reason/ | 
*QianchuanAdScheduleDateUpdateV10Api* | [**openApiV10QianchuanAdScheduleDateUpdatePost**](docs/QianchuanAdScheduleDateUpdateV10Api.md#openApiV10QianchuanAdScheduleDateUpdatePost) | **POST** /open_api/v1.0/qianchuan/ad/schedule_date/update/ | 
*QianchuanAdScheduleFixedRangeUpdateV10Api* | [**openApiV10QianchuanAdScheduleFixedRangeUpdatePost**](docs/QianchuanAdScheduleFixedRangeUpdateV10Api.md#openApiV10QianchuanAdScheduleFixedRangeUpdatePost) | **POST** /open_api/v1.0/qianchuan/ad/schedule_fixed_range/update/ | 
*QianchuanAdScheduleTimeUpdateV10Api* | [**openApiV10QianchuanAdScheduleTimeUpdatePost**](docs/QianchuanAdScheduleTimeUpdateV10Api.md#openApiV10QianchuanAdScheduleTimeUpdatePost) | **POST** /open_api/v1.0/qianchuan/ad/schedule_time/update/ | 
*QianchuanAdStatusUpdateV10Api* | [**openApiV10QianchuanAdStatusUpdatePost**](docs/QianchuanAdStatusUpdateV10Api.md#openApiV10QianchuanAdStatusUpdatePost) | **POST** /open_api/v1.0/qianchuan/ad/status/update/ | 
*QianchuanAdUpdateV10Api* | [**openApiV10QianchuanAdUpdatePost**](docs/QianchuanAdUpdateV10Api.md#openApiV10QianchuanAdUpdatePost) | **POST** /open_api/v1.0/qianchuan/ad/update/ | 
*QianchuanAdvertiserTypeGetV10Api* | [**openApiV10QianchuanAdvertiserTypeGetGet**](docs/QianchuanAdvertiserTypeGetV10Api.md#openApiV10QianchuanAdvertiserTypeGetGet) | **GET** /open_api/v1.0/qianchuan/advertiser/type/get/ | 
*QianchuanAudienceCreateByFileV10Api* | [**openApiV10QianchuanAudienceCreateByFilePost**](docs/QianchuanAudienceCreateByFileV10Api.md#openApiV10QianchuanAudienceCreateByFilePost) | **POST** /open_api/v1.0/qianchuan/audience/create_by_file/ | 
*QianchuanAudienceDeleteV10Api* | [**openApiV10QianchuanAudienceDeletePost**](docs/QianchuanAudienceDeleteV10Api.md#openApiV10QianchuanAudienceDeletePost) | **POST** /open_api/v1.0/qianchuan/audience/delete/ | 
*QianchuanAudienceFilePartUploadV10Api* | [**openApiV10QianchuanAudienceFilePartUploadPost**](docs/QianchuanAudienceFilePartUploadV10Api.md#openApiV10QianchuanAudienceFilePartUploadPost) | **POST** /open_api/v1.0/qianchuan/audience_file/part_upload/ | 
*QianchuanAudienceFileUploadV10Api* | [**openApiV10QianchuanAudienceFileUploadPost**](docs/QianchuanAudienceFileUploadV10Api.md#openApiV10QianchuanAudienceFileUploadPost) | **POST** /open_api/v1.0/qianchuan/audience_file/upload/ | 
*QianchuanAudienceGroupGetV10Api* | [**openApiV10QianchuanAudienceGroupGetGet**](docs/QianchuanAudienceGroupGetV10Api.md#openApiV10QianchuanAudienceGroupGetGet) | **GET** /open_api/v1.0/qianchuan/audience_group/get/ | 
*QianchuanAudienceListGetV10Api* | [**openApiV10QianchuanAudienceListGetGet**](docs/QianchuanAudienceListGetV10Api.md#openApiV10QianchuanAudienceListGetGet) | **GET** /open_api/v1.0/qianchuan/audience_list/get/ | 
*QianchuanAudiencePushV10Api* | [**openApiV10QianchuanAudiencePushPost**](docs/QianchuanAudiencePushV10Api.md#openApiV10QianchuanAudiencePushPost) | **POST** /open_api/v1.0/qianchuan/audience/push/ | 
*QianchuanAwemeAuthorizedGetV10Api* | [**openApiV10QianchuanAwemeAuthorizedGetGet**](docs/QianchuanAwemeAuthorizedGetV10Api.md#openApiV10QianchuanAwemeAuthorizedGetGet) | **GET** /open_api/v1.0/qianchuan/aweme/authorized/get/ | 
*QianchuanAwemeEstimateProfitV10Api* | [**openApiV10QianchuanAwemeEstimateProfitGet**](docs/QianchuanAwemeEstimateProfitV10Api.md#openApiV10QianchuanAwemeEstimateProfitGet) | **GET** /open_api/v1.0/qianchuan/aweme/estimate_profit/ | 
*QianchuanAwemeInterestActionInterestKeywordV10Api* | [**openApiV10QianchuanAwemeInterestActionInterestKeywordGet**](docs/QianchuanAwemeInterestActionInterestKeywordV10Api.md#openApiV10QianchuanAwemeInterestActionInterestKeywordGet) | **GET** /open_api/v1.0/qianchuan/aweme/interest_action/interest/keyword/ | 
*QianchuanAwemeOrderCreateV10Api* | [**openApiV10QianchuanAwemeOrderCreatePost**](docs/QianchuanAwemeOrderCreateV10Api.md#openApiV10QianchuanAwemeOrderCreatePost) | **POST** /open_api/v1.0/qianchuan/aweme/order/create/ | 
*QianchuanAwemeOrderDetailGetV10Api* | [**openApiV10QianchuanAwemeOrderDetailGetGet**](docs/QianchuanAwemeOrderDetailGetV10Api.md#openApiV10QianchuanAwemeOrderDetailGetGet) | **GET** /open_api/v1.0/qianchuan/aweme/order/detail/get/ | 
*QianchuanAwemeOrderGetV10Api* | [**openApiV10QianchuanAwemeOrderGetGet**](docs/QianchuanAwemeOrderGetV10Api.md#openApiV10QianchuanAwemeOrderGetGet) | **GET** /open_api/v1.0/qianchuan/aweme/order/get/ | 
*QianchuanAwemeOrderQuotaGetV10Api* | [**openApiV10QianchuanAwemeOrderQuotaGetGet**](docs/QianchuanAwemeOrderQuotaGetV10Api.md#openApiV10QianchuanAwemeOrderQuotaGetGet) | **GET** /open_api/v1.0/qianchuan/aweme/order/quota/get/ | 
*QianchuanAwemeOrderTerminateV10Api* | [**openApiV10QianchuanAwemeOrderTerminatePost**](docs/QianchuanAwemeOrderTerminateV10Api.md#openApiV10QianchuanAwemeOrderTerminatePost) | **POST** /open_api/v1.0/qianchuan/aweme/order/terminate/ | 
*QianchuanAwemeProductAvailableGetV10Api* | [**openApiV10QianchuanAwemeProductAvailableGetGet**](docs/QianchuanAwemeProductAvailableGetV10Api.md#openApiV10QianchuanAwemeProductAvailableGetGet) | **GET** /open_api/v1.0/qianchuan/aweme/product/available/get/ | 
*QianchuanAwemeReportOrderGetV10Api* | [**openApiV10QianchuanAwemeReportOrderGetGet**](docs/QianchuanAwemeReportOrderGetV10Api.md#openApiV10QianchuanAwemeReportOrderGetGet) | **GET** /open_api/v1.0/qianchuan/aweme/report/order/get/ | 
*QianchuanAwemeSuggestBidV10Api* | [**openApiV10QianchuanAwemeSuggestBidGet**](docs/QianchuanAwemeSuggestBidV10Api.md#openApiV10QianchuanAwemeSuggestBidGet) | **GET** /open_api/v1.0/qianchuan/aweme/suggest_bid/ | 
*QianchuanAwemeSuggestRoiGoalV10Api* | [**openApiV10QianchuanAwemeSuggestRoiGoalGet**](docs/QianchuanAwemeSuggestRoiGoalV10Api.md#openApiV10QianchuanAwemeSuggestRoiGoalGet) | **GET** /open_api/v1.0/qianchuan/aweme/suggest/roi/goal/ | 
*QianchuanAwemeVideoGetV10Api* | [**openApiV10QianchuanAwemeVideoGetGet**](docs/QianchuanAwemeVideoGetV10Api.md#openApiV10QianchuanAwemeVideoGetGet) | **GET** /open_api/v1.0/qianchuan/aweme/video/get/ | 
*QianchuanBatchCampaignStatusUpdateV10Api* | [**openApiV10QianchuanBatchCampaignStatusUpdatePost**](docs/QianchuanBatchCampaignStatusUpdateV10Api.md#openApiV10QianchuanBatchCampaignStatusUpdatePost) | **POST** /open_api/v1.0/qianchuan/batch_campaign_status/update/ | 
*QianchuanBrandAuthorizedGetV10Api* | [**openApiV10QianchuanBrandAuthorizedGetGet**](docs/QianchuanBrandAuthorizedGetV10Api.md#openApiV10QianchuanBrandAuthorizedGetGet) | **GET** /open_api/v1.0/qianchuan/brand/authorized/get/ | 
*QianchuanCampaignCreateV10Api* | [**openApiV10QianchuanCampaignCreatePost**](docs/QianchuanCampaignCreateV10Api.md#openApiV10QianchuanCampaignCreatePost) | **POST** /open_api/v1.0/qianchuan/campaign/create/ | 
*QianchuanCampaignListGetV10Api* | [**openApiV10QianchuanCampaignListGetGet**](docs/QianchuanCampaignListGetV10Api.md#openApiV10QianchuanCampaignListGetGet) | **GET** /open_api/v1.0/qianchuan/campaign_list/get/ | 
*QianchuanCampaignUpdateV10Api* | [**openApiV10QianchuanCampaignUpdatePost**](docs/QianchuanCampaignUpdateV10Api.md#openApiV10QianchuanCampaignUpdatePost) | **POST** /open_api/v1.0/qianchuan/campaign/update/ | 
*QianchuanCreativeGetV10Api* | [**openApiV10QianchuanCreativeGetGet**](docs/QianchuanCreativeGetV10Api.md#openApiV10QianchuanCreativeGetGet) | **GET** /open_api/v1.0/qianchuan/creative/get/ | 
*QianchuanCreativeRejectReasonV10Api* | [**openApiV10QianchuanCreativeRejectReasonGet**](docs/QianchuanCreativeRejectReasonV10Api.md#openApiV10QianchuanCreativeRejectReasonGet) | **GET** /open_api/v1.0/qianchuan/creative/reject_reason/ | 
*QianchuanCreativeStatusUpdateV10Api* | [**openApiV10QianchuanCreativeStatusUpdatePost**](docs/QianchuanCreativeStatusUpdateV10Api.md#openApiV10QianchuanCreativeStatusUpdatePost) | **POST** /open_api/v1.0/qianchuan/creative/status/update/ | 
*QianchuanDmpAudiencesGetV10Api* | [**openApiV10QianchuanDmpAudiencesGetGet**](docs/QianchuanDmpAudiencesGetV10Api.md#openApiV10QianchuanDmpAudiencesGetGet) | **GET** /open_api/v1.0/qianchuan/dmp/audiences/get/ | 
*QianchuanEstimateEffectV10Api* | [**openApiV10QianchuanEstimateEffectGet**](docs/QianchuanEstimateEffectV10Api.md#openApiV10QianchuanEstimateEffectGet) | **GET** /open_api/v1.0/qianchuan/estimate/effect/ | 
*QianchuanFileImageDeleteV10Api* | [**openApiV10QianchuanFileImageDeletePost**](docs/QianchuanFileImageDeleteV10Api.md#openApiV10QianchuanFileImageDeletePost) | **POST** /open_api/v1.0/qianchuan/file/image/delete/ | 
*QianchuanFileVideoAwemeGetV10Api* | [**openApiV10QianchuanFileVideoAwemeGetGet**](docs/QianchuanFileVideoAwemeGetV10Api.md#openApiV10QianchuanFileVideoAwemeGetGet) | **GET** /open_api/v1.0/qianchuan/file/video/aweme/get/ | 
*QianchuanFileVideoDeleteV10Api* | [**openApiV10QianchuanFileVideoDeletePost**](docs/QianchuanFileVideoDeleteV10Api.md#openApiV10QianchuanFileVideoDeletePost) | **POST** /open_api/v1.0/qianchuan/file/video/delete/ | 
*QianchuanFileVideoEfficiencyGetV10Api* | [**openApiV10QianchuanFileVideoEfficiencyGetGet**](docs/QianchuanFileVideoEfficiencyGetV10Api.md#openApiV10QianchuanFileVideoEfficiencyGetGet) | **GET** /open_api/v1.0/qianchuan/file/video/efficiency/get/ | 
*QianchuanFileVideoOriginalGetV10Api* | [**openApiV10QianchuanFileVideoOriginalGetGet**](docs/QianchuanFileVideoOriginalGetV10Api.md#openApiV10QianchuanFileVideoOriginalGetGet) | **GET** /open_api/v1.0/qianchuan/file/video/original/get/ | 
*QianchuanFinanceDetailGetV10Api* | [**openApiV10QianchuanFinanceDetailGetGet**](docs/QianchuanFinanceDetailGetV10Api.md#openApiV10QianchuanFinanceDetailGetGet) | **GET** /open_api/v1.0/qianchuan/finance/detail/get/ | 
*QianchuanFinanceWalletGetV10Api* | [**openApiV10QianchuanFinanceWalletGetGet**](docs/QianchuanFinanceWalletGetV10Api.md#openApiV10QianchuanFinanceWalletGetGet) | **GET** /open_api/v1.0/qianchuan/finance/wallet/get/ | 
*QianchuanImageGetV10Api* | [**openApiV10QianchuanImageGetGet**](docs/QianchuanImageGetV10Api.md#openApiV10QianchuanImageGetGet) | **GET** /open_api/v1.0/qianchuan/image/get/ | 
*QianchuanKeywordCheckV10Api* | [**openApiV10QianchuanKeywordCheckPost**](docs/QianchuanKeywordCheckV10Api.md#openApiV10QianchuanKeywordCheckPost) | **POST** /open_api/v1.0/qianchuan/keyword/check/ | 
*QianchuanKeywordPackageGetV10Api* | [**openApiV10QianchuanKeywordPackageGetGet**](docs/QianchuanKeywordPackageGetV10Api.md#openApiV10QianchuanKeywordPackageGetGet) | **GET** /open_api/v1.0/qianchuan/keyword_package/get/ | 
*QianchuanLqAdGetV10Api* | [**openApiV10QianchuanLqAdGetGet**](docs/QianchuanLqAdGetV10Api.md#openApiV10QianchuanLqAdGetGet) | **GET** /open_api/v1.0/qianchuan/lq_ad/get/ | 
*QianchuanOrientationPackageGetV10Api* | [**openApiV10QianchuanOrientationPackageGetGet**](docs/QianchuanOrientationPackageGetV10Api.md#openApiV10QianchuanOrientationPackageGetGet) | **GET** /open_api/v1.0/qianchuan/orientation_package/get/ | 
*QianchuanProductAnalyseCompareCreativeV10Api* | [**openApiV10QianchuanProductAnalyseCompareCreativeGet**](docs/QianchuanProductAnalyseCompareCreativeV10Api.md#openApiV10QianchuanProductAnalyseCompareCreativeGet) | **GET** /open_api/v1.0/qianchuan/product/analyse/compare_creative/ | 
*QianchuanProductAnalyseCompareStatsDataV10Api* | [**openApiV10QianchuanProductAnalyseCompareStatsDataGet**](docs/QianchuanProductAnalyseCompareStatsDataV10Api.md#openApiV10QianchuanProductAnalyseCompareStatsDataGet) | **GET** /open_api/v1.0/qianchuan/product/analyse/compare_stats_data/ | 
*QianchuanProductAnalyseListV10Api* | [**openApiV10QianchuanProductAnalyseListGet**](docs/QianchuanProductAnalyseListV10Api.md#openApiV10QianchuanProductAnalyseListGet) | **GET** /open_api/v1.0/qianchuan/product/analyse/list/ | 
*QianchuanProductAvailableGetV10Api* | [**openApiV10QianchuanProductAvailableGetGet**](docs/QianchuanProductAvailableGetV10Api.md#openApiV10QianchuanProductAvailableGetGet) | **GET** /open_api/v1.0/qianchuan/product/available/get/ | 
*QianchuanReportAdGetV10Api* | [**openApiV10QianchuanReportAdGetGet**](docs/QianchuanReportAdGetV10Api.md#openApiV10QianchuanReportAdGetGet) | **GET** /open_api/v1.0/qianchuan/report/ad/get/ | 
*QianchuanReportAdvertiserGetV10Api* | [**openApiV10QianchuanReportAdvertiserGetGet**](docs/QianchuanReportAdvertiserGetV10Api.md#openApiV10QianchuanReportAdvertiserGetGet) | **GET** /open_api/v1.0/qianchuan/report/advertiser/get/ | 
*QianchuanReportCreativeGetV10Api* | [**openApiV10QianchuanReportCreativeGetGet**](docs/QianchuanReportCreativeGetV10Api.md#openApiV10QianchuanReportCreativeGetGet) | **GET** /open_api/v1.0/qianchuan/report/creative/get/ | 
*QianchuanReportLiveGetV10Api* | [**openApiV10QianchuanReportLiveGetGet**](docs/QianchuanReportLiveGetV10Api.md#openApiV10QianchuanReportLiveGetGet) | **GET** /open_api/v1.0/qianchuan/report/live/get/ | 
*QianchuanReportLongTransferOrderGetV10Api* | [**openApiV10QianchuanReportLongTransferOrderGetGet**](docs/QianchuanReportLongTransferOrderGetV10Api.md#openApiV10QianchuanReportLongTransferOrderGetGet) | **GET** /open_api/v1.0/qianchuan/report/long_transfer/order/get/ | 
*QianchuanReportMaterialGetV10Api* | [**openApiV10QianchuanReportMaterialGetGet**](docs/QianchuanReportMaterialGetV10Api.md#openApiV10QianchuanReportMaterialGetGet) | **GET** /open_api/v1.0/qianchuan/report/material/get/ | 
*QianchuanReportSearchWordGetV10Api* | [**openApiV10QianchuanReportSearchWordGetGet**](docs/QianchuanReportSearchWordGetV10Api.md#openApiV10QianchuanReportSearchWordGetGet) | **GET** /open_api/v1.0/qianchuan/report/search_word/get/ | 
*QianchuanReportUniPromotionGetV10Api* | [**openApiV10QianchuanReportUniPromotionGetGet**](docs/QianchuanReportUniPromotionGetV10Api.md#openApiV10QianchuanReportUniPromotionGetGet) | **GET** /open_api/v1.0/qianchuan/report/uni_promotion/get/ | 
*QianchuanReportVideoUserLoseGetV10Api* | [**openApiV10QianchuanReportVideoUserLoseGetGet**](docs/QianchuanReportVideoUserLoseGetV10Api.md#openApiV10QianchuanReportVideoUserLoseGetGet) | **GET** /open_api/v1.0/qianchuan/report/video_user_lose/get/ | 
*QianchuanRoiGoalUpdateV10Api* | [**openApiV10QianchuanRoiGoalUpdatePost**](docs/QianchuanRoiGoalUpdateV10Api.md#openApiV10QianchuanRoiGoalUpdatePost) | **POST** /open_api/v1.0/qianchuan/roi/goal/update | 
*QianchuanShopAdvertiserListV10Api* | [**openApiV10QianchuanShopAdvertiserListGet**](docs/QianchuanShopAdvertiserListV10Api.md#openApiV10QianchuanShopAdvertiserListGet) | **GET** /open_api/v1.0/qianchuan/shop/advertiser/list/ | 
*QianchuanShopAuthorizedGetV10Api* | [**openApiV10QianchuanShopAuthorizedGetGet**](docs/QianchuanShopAuthorizedGetV10Api.md#openApiV10QianchuanShopAuthorizedGetGet) | **GET** /open_api/v1.0/qianchuan/shop/authorized/get/ | 
*QianchuanShopGetV10Api* | [**openApiV10QianchuanShopGetGet**](docs/QianchuanShopGetV10Api.md#openApiV10QianchuanShopGetGet) | **GET** /open_api/v1.0/qianchuan/shop/get/ | 
*QianchuanSuggestBidV10Api* | [**openApiV10QianchuanSuggestBidGet**](docs/QianchuanSuggestBidV10Api.md#openApiV10QianchuanSuggestBidGet) | **GET** /open_api/v1.0/qianchuan/suggest_bid/ | 
*QianchuanSuggestBudgetV10Api* | [**openApiV10QianchuanSuggestBudgetGet**](docs/QianchuanSuggestBudgetV10Api.md#openApiV10QianchuanSuggestBudgetGet) | **GET** /open_api/v1.0/qianchuan/suggest/budget/ | 
*QianchuanSuggestRoiGoalV10Api* | [**openApiV10QianchuanSuggestRoiGoalGet**](docs/QianchuanSuggestRoiGoalV10Api.md#openApiV10QianchuanSuggestRoiGoalGet) | **GET** /open_api/v1.0/qianchuan/suggest/roi/goal | 
*QianchuanSuggestRoiGoalV10Api* | [**openApiV10QianchuanSuggestRoiGoalGet_0**](docs/QianchuanSuggestRoiGoalV10Api.md#openApiV10QianchuanSuggestRoiGoalGet_0) | **GET** /open_api/v1.0/qianchuan/suggest/roi/goal/ | 
*QianchuanTodayLiveRoomDetailGetV10Api* | [**openApiV10QianchuanTodayLiveRoomDetailGetGet**](docs/QianchuanTodayLiveRoomDetailGetV10Api.md#openApiV10QianchuanTodayLiveRoomDetailGetGet) | **GET** /open_api/v1.0/qianchuan/today_live/room/detail/get/ | 
*QianchuanTodayLiveRoomFlowPerformanceGetV10Api* | [**openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGet**](docs/QianchuanTodayLiveRoomFlowPerformanceGetV10Api.md#openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGet) | **GET** /open_api/v1.0/qianchuan/today_live/room/flow_performance/get/ | 
*QianchuanTodayLiveRoomGetV10Api* | [**openApiV10QianchuanTodayLiveRoomGetGet**](docs/QianchuanTodayLiveRoomGetV10Api.md#openApiV10QianchuanTodayLiveRoomGetGet) | **GET** /open_api/v1.0/qianchuan/today_live/room/get/ | 
*QianchuanTodayLiveRoomProductListGetV10Api* | [**openApiV10QianchuanTodayLiveRoomProductListGetGet**](docs/QianchuanTodayLiveRoomProductListGetV10Api.md#openApiV10QianchuanTodayLiveRoomProductListGetGet) | **GET** /open_api/v1.0/qianchuan/today_live/room/product_list/get/ | 
*QianchuanTodayLiveRoomUserGetV10Api* | [**openApiV10QianchuanTodayLiveRoomUserGetGet**](docs/QianchuanTodayLiveRoomUserGetV10Api.md#openApiV10QianchuanTodayLiveRoomUserGetGet) | **GET** /open_api/v1.0/qianchuan/today_live/room/user/get/ | 
*QianchuanToolsAllowCouponV10Api* | [**openApiV10QianchuanToolsAllowCouponGet**](docs/QianchuanToolsAllowCouponV10Api.md#openApiV10QianchuanToolsAllowCouponGet) | **GET** /open_api/v1.0/qianchuan/tools/allow_coupon/ | 
*QianchuanToolsAwemeAuthV10Api* | [**openApiV10QianchuanToolsAwemeAuthPost**](docs/QianchuanToolsAwemeAuthV10Api.md#openApiV10QianchuanToolsAwemeAuthPost) | **POST** /open_api/v1.0/qianchuan/tools/aweme_auth/ | 
*QianchuanToolsEstimateAudienceV10Api* | [**openApiV10QianchuanToolsEstimateAudienceGet**](docs/QianchuanToolsEstimateAudienceV10Api.md#openApiV10QianchuanToolsEstimateAudienceGet) | **GET** /open_api/v1.0/qianchuan/tools/estimate_audience/ | 
*QianchuanToolsGrayV10Api* | [**openApiV10QianchuanToolsGrayGet**](docs/QianchuanToolsGrayV10Api.md#openApiV10QianchuanToolsGrayGet) | **GET** /open_api/v1.0/qianchuan/tools/gray/ | 
*QianchuanToolsShopAuthV10Api* | [**openApiV10QianchuanToolsShopAuthPost**](docs/QianchuanToolsShopAuthV10Api.md#openApiV10QianchuanToolsShopAuthPost) | **POST** /open_api/v1.0/qianchuan/tools/shop_auth/ | 
*QianchuanToolsSmartBoostAdBoostReportGetV10Api* | [**openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet**](docs/QianchuanToolsSmartBoostAdBoostReportGetV10Api.md#openApiV10QianchuanToolsSmartBoostAdBoostReportGetGet) | **GET** /open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/report/get/ | 
*QianchuanToolsSmartBoostAdBoostSetV10Api* | [**openApiV10QianchuanToolsSmartBoostAdBoostSetPost**](docs/QianchuanToolsSmartBoostAdBoostSetV10Api.md#openApiV10QianchuanToolsSmartBoostAdBoostSetPost) | **POST** /open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/set/ | 
*QianchuanToolsSmartBoostAdBoostStatusGetV10Api* | [**openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGet**](docs/QianchuanToolsSmartBoostAdBoostStatusGetV10Api.md#openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGet) | **GET** /open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/status/get/ | 
*QianchuanToolsSmartBoostAdBoostVersionGetV10Api* | [**openApiV10QianchuanToolsSmartBoostAdBoostVersionGetGet**](docs/QianchuanToolsSmartBoostAdBoostVersionGetV10Api.md#openApiV10QianchuanToolsSmartBoostAdBoostVersionGetGet) | **GET** /open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/version/get/ | 
*QianchuanUniAwemeAuthorizedGetV10Api* | [**openApiV10QianchuanUniAwemeAuthorizedGetGet**](docs/QianchuanUniAwemeAuthorizedGetV10Api.md#openApiV10QianchuanUniAwemeAuthorizedGetGet) | **GET** /open_api/v1.0/qianchuan/uni_aweme/authorized/get/ | 
*QianchuanUniPromotionListV10Api* | [**openApiV10QianchuanUniPromotionListGet**](docs/QianchuanUniPromotionListV10Api.md#openApiV10QianchuanUniPromotionListGet) | **GET** /open_api/v1.0/qianchuan/uni_promotion/list/ | 
*QianchuanVideoGetV10Api* | [**openApiV10QianchuanVideoGetGet**](docs/QianchuanVideoGetV10Api.md#openApiV10QianchuanVideoGetGet) | **GET** /open_api/v1.0/qianchuan/video/get/ | 
*ReportAdGetV2Api* | [**openApi2ReportAdGetGet**](docs/ReportAdGetV2Api.md#openApi2ReportAdGetGet) | **GET** /open_api/2/report/ad/get/ | 
*ReportAdvertiserGetV2Api* | [**openApi2ReportAdvertiserGetGet**](docs/ReportAdvertiserGetV2Api.md#openApi2ReportAdvertiserGetGet) | **GET** /open_api/2/report/advertiser/get/ | 
*ReportAgentGetV2V2Api* | [**openApi2ReportAgentGetV2Get**](docs/ReportAgentGetV2V2Api.md#openApi2ReportAgentGetV2Get) | **GET** /open_api/2/report/agent/get_v2/ | 
*ReportAudienceAgeV2Api* | [**openApi2ReportAudienceAgeGet**](docs/ReportAudienceAgeV2Api.md#openApi2ReportAudienceAgeGet) | **GET** /open_api/2/report/audience/age/ | 
*ReportAudienceAwemeListV2Api* | [**openApi2ReportAudienceAwemeListGet**](docs/ReportAudienceAwemeListV2Api.md#openApi2ReportAudienceAwemeListGet) | **GET** /open_api/2/report/audience/aweme/list/ | 
*ReportAudienceCityV2Api* | [**openApi2ReportAudienceCityGet**](docs/ReportAudienceCityV2Api.md#openApi2ReportAudienceCityGet) | **GET** /open_api/2/report/audience/city/ | 
*ReportAudienceGenderV2Api* | [**openApi2ReportAudienceGenderGet**](docs/ReportAudienceGenderV2Api.md#openApi2ReportAudienceGenderGet) | **GET** /open_api/2/report/audience/gender/ | 
*ReportAudienceInterestActionListV2Api* | [**openApi2ReportAudienceInterestActionListGet**](docs/ReportAudienceInterestActionListV2Api.md#openApi2ReportAudienceInterestActionListGet) | **GET** /open_api/2/report/audience/interest_action/list/ | 
*ReportAudienceProvinceV2Api* | [**openApi2ReportAudienceProvinceGet**](docs/ReportAudienceProvinceV2Api.md#openApi2ReportAudienceProvinceGet) | **GET** /open_api/2/report/audience/province/ | 
*ReportCampaignGetV2Api* | [**openApi2ReportCampaignGetGet**](docs/ReportCampaignGetV2Api.md#openApi2ReportCampaignGetGet) | **GET** /open_api/2/report/campaign/get/ | 
*ReportCreativeGetV2Api* | [**openApi2ReportCreativeGetGet**](docs/ReportCreativeGetV2Api.md#openApi2ReportCreativeGetGet) | **GET** /open_api/2/report/creative/get/ | 
*ReportCustomConfigGetV30Api* | [**openApiV30ReportCustomConfigGetGet**](docs/ReportCustomConfigGetV30Api.md#openApiV30ReportCustomConfigGetGet) | **GET** /open_api/v3.0/report/custom/config/get/ | 
*ReportCustomGetV30Api* | [**openApiV30ReportCustomGetGet**](docs/ReportCustomGetV30Api.md#openApiV30ReportCustomGetGet) | **GET** /open_api/v3.0/report/custom/get/ | 
*ReportLiveRoomAnalysisGetV2Api* | [**openApi2ReportLiveRoomAnalysisGetGet**](docs/ReportLiveRoomAnalysisGetV2Api.md#openApi2ReportLiveRoomAnalysisGetGet) | **GET** /open_api/2/report/live_room/analysis/get/ | 
*ReportLiveRoomAttributeGetV2Api* | [**openApi2ReportLiveRoomAttributeGetGet**](docs/ReportLiveRoomAttributeGetV2Api.md#openApi2ReportLiveRoomAttributeGetGet) | **GET** /open_api/2/report/live_room/attribute/get/ | 
*ReportLiveRoomAudiencePortraitGetV2Api* | [**openApi2ReportLiveRoomAudiencePortraitGetGet**](docs/ReportLiveRoomAudiencePortraitGetV2Api.md#openApi2ReportLiveRoomAudiencePortraitGetGet) | **GET** /open_api/2/report/live_room/audience/portrait/get/ | 
*ReportLiveRoomFlowCategoryGetV2Api* | [**openApi2ReportLiveRoomFlowCategoryGetGet**](docs/ReportLiveRoomFlowCategoryGetV2Api.md#openApi2ReportLiveRoomFlowCategoryGetGet) | **GET** /open_api/2/report/live_room/flow_category/get/ | 
*ReportLiveRoomProductGetV2Api* | [**openApi2ReportLiveRoomProductGetGet**](docs/ReportLiveRoomProductGetV2Api.md#openApi2ReportLiveRoomProductGetGet) | **GET** /open_api/2/report/live_room/product/get/ | 
*ReportRtaExpGetV2Api* | [**openApi2ReportRtaExpGetGet**](docs/ReportRtaExpGetV2Api.md#openApi2ReportRtaExpGetGet) | **GET** /open_api/2/report/rta_exp/get/ | 
*ReportRtaExpLocalDailyGetV30Api* | [**openApiV30ReportRtaExpLocalDailyGetGet**](docs/ReportRtaExpLocalDailyGetV30Api.md#openApiV30ReportRtaExpLocalDailyGetGet) | **GET** /open_api/v3.0/report/rta_exp_local_daily/get/ | 
*ReportRtaExpLocalHourlyGetV30Api* | [**openApiV30ReportRtaExpLocalHourlyGetGet**](docs/ReportRtaExpLocalHourlyGetV30Api.md#openApiV30ReportRtaExpLocalHourlyGetGet) | **GET** /open_api/v3.0/report/rta_exp_local_hourly/get/ | 
*ReportRubeexGetV2Api* | [**openApi2ReportRubeexGetGet**](docs/ReportRubeexGetV2Api.md#openApi2ReportRubeexGetGet) | **GET** /open_api/2/report/rubeex/get/ | 
*ReportSitePageV2Api* | [**openApi2ReportSitePageGet**](docs/ReportSitePageV2Api.md#openApi2ReportSitePageGet) | **GET** /open_api/2/report/site/page/ | 
*ReportVideoFrameGetV2Api* | [**openApi2ReportVideoFrameGetGet**](docs/ReportVideoFrameGetV2Api.md#openApi2ReportVideoFrameGetGet) | **GET** /open_api/2/report/video/frame/get/ | 
*ServeMarketOrderGetV10Api* | [**openApiV10ServeMarketOrderGetGet**](docs/ServeMarketOrderGetV10Api.md#openApiV10ServeMarketOrderGetGet) | **GET** /open_api/v1.0/serve_market/order/get/ | 
*SpiTaskGetV2Api* | [**openApi2SpiTaskGetGet**](docs/SpiTaskGetV2Api.md#openApi2SpiTaskGetGet) | **GET** /open_api/2/spi_task/get/ | 
*StarClueGetV2Api* | [**openApi2StarClueGetGet**](docs/StarClueGetV2Api.md#openApi2StarClueGetGet) | **GET** /open_api/2/star/clue/get/ | 
*StarDemandListV2Api* | [**openApi2StarDemandListGet**](docs/StarDemandListV2Api.md#openApi2StarDemandListGet) | **GET** /open_api/2/star/demand/list/ | 
*StarDemandOrderListV2Api* | [**openApi2StarDemandOrderListGet**](docs/StarDemandOrderListV2Api.md#openApi2StarDemandOrderListGet) | **GET** /open_api/2/star/demand/order/list/ | 
*StarReportOrderOverviewGetV2Api* | [**openApi2StarReportOrderOverviewGetGet**](docs/StarReportOrderOverviewGetV2Api.md#openApi2StarReportOrderOverviewGetGet) | **GET** /open_api/2/star/report/order_overview/get/ | 
*StarReportOrderUserDistributionGetV2Api* | [**openApi2StarReportOrderUserDistributionGetGet**](docs/StarReportOrderUserDistributionGetV2Api.md#openApi2StarReportOrderUserDistributionGetGet) | **GET** /open_api/2/star/report/order_user_distribution/get/ | 
*SubscribeAccountsAddV30Api* | [**openApiV30SubscribeAccountsAddPost**](docs/SubscribeAccountsAddV30Api.md#openApiV30SubscribeAccountsAddPost) | **POST** /open_api/v3.0/subscribe/accounts/add/ | 
*SubscribeAccountsListV30Api* | [**openApiV30SubscribeAccountsListGet**](docs/SubscribeAccountsListV30Api.md#openApiV30SubscribeAccountsListGet) | **GET** /open_api/v3.0/subscribe/accounts/list/ | 
*SubscribeAccountsRemoveV30Api* | [**openApiV30SubscribeAccountsRemovePost**](docs/SubscribeAccountsRemoveV30Api.md#openApiV30SubscribeAccountsRemovePost) | **POST** /open_api/v3.0/subscribe/accounts/remove/ | 
*SuggWordsV30Api* | [**openApiV30SuggWordsPost**](docs/SuggWordsV30Api.md#openApiV30SuggWordsPost) | **POST** /open_api/v3.0/sugg_words/ | 
*ToolQuickAppManagementQuickAppGetV2Api* | [**openApi2ToolQuickAppManagementQuickAppGetGet**](docs/ToolQuickAppManagementQuickAppGetV2Api.md#openApi2ToolQuickAppManagementQuickAppGetGet) | **GET** /open_api/2/tool/quick_app_management/quick_app/get/ | 
*ToolsAbTestCreateV2Api* | [**openApi2ToolsAbTestCreatePost**](docs/ToolsAbTestCreateV2Api.md#openApi2ToolsAbTestCreatePost) | **POST** /open_api/2/tools/ab_test/create/ | 
*ToolsAbTestDeleteV2Api* | [**openApi2ToolsAbTestDeletePost**](docs/ToolsAbTestDeleteV2Api.md#openApi2ToolsAbTestDeletePost) | **POST** /open_api/2/tools/ab_test/delete/ | 
*ToolsAbTestInfoGetV2Api* | [**openApi2ToolsAbTestInfoGetGet**](docs/ToolsAbTestInfoGetV2Api.md#openApi2ToolsAbTestInfoGetGet) | **GET** /open_api/2/tools/ab_test_info/get/ | 
*ToolsAbTestListGetV2Api* | [**openApi2ToolsAbTestListGetGet**](docs/ToolsAbTestListGetV2Api.md#openApi2ToolsAbTestListGetGet) | **GET** /open_api/2/tools/ab_test_list/get/ | 
*ToolsAbTestStopV2Api* | [**openApi2ToolsAbTestStopPost**](docs/ToolsAbTestStopV2Api.md#openApi2ToolsAbTestStopPost) | **POST** /open_api/2/tools/ab_test/stop/ | 
*ToolsAbTestUpdateV2Api* | [**openApi2ToolsAbTestUpdatePost**](docs/ToolsAbTestUpdateV2Api.md#openApi2ToolsAbTestUpdatePost) | **POST** /open_api/2/tools/ab_test/update/ | 
*ToolsActionTextGetV2Api* | [**openApi2ToolsActionTextGetGet**](docs/ToolsActionTextGetV2Api.md#openApi2ToolsActionTextGetGet) | **GET** /open_api/2/tools/action_text/get/ | 
*ToolsAdPreviewQrcodeGetV30Api* | [**openApiV30ToolsAdPreviewQrcodeGetGet**](docs/ToolsAdPreviewQrcodeGetV30Api.md#openApiV30ToolsAdPreviewQrcodeGetGet) | **GET** /open_api/v3.0/tools/ad_preview/qrcode_get/ | 
*ToolsAdRaiseEstimateGetV2Api* | [**openApi2ToolsAdRaiseEstimateGetGet**](docs/ToolsAdRaiseEstimateGetV2Api.md#openApi2ToolsAdRaiseEstimateGetGet) | **GET** /open_api/2/tools/ad_raise_estimate/get/ | 
*ToolsAdRaiseResultGetV2V2Api* | [**openApi2ToolsAdRaiseResultGetV2Get**](docs/ToolsAdRaiseResultGetV2V2Api.md#openApi2ToolsAdRaiseResultGetV2Get) | **GET** /open_api/2/tools/ad_raise_result/get_v2/ | 
*ToolsAdRaiseStatusGetV2Api* | [**openApi2ToolsAdRaiseStatusGetGet**](docs/ToolsAdRaiseStatusGetV2Api.md#openApi2ToolsAdRaiseStatusGetGet) | **GET** /open_api/2/tools/ad_raise_status/get/ | 
*ToolsAdRaiseVersionGetV2Api* | [**openApi2ToolsAdRaiseVersionGetGet**](docs/ToolsAdRaiseVersionGetV2Api.md#openApi2ToolsAdRaiseVersionGetGet) | **GET** /open_api/2/tools/ad_raise_version/get/ | 
*ToolsAdStatExtraInfoGetV2Api* | [**openApi2ToolsAdStatExtraInfoGetGet**](docs/ToolsAdStatExtraInfoGetV2Api.md#openApi2ToolsAdStatExtraInfoGetGet) | **GET** /open_api/2/tools/ad_stat_extra_info/get/ | 
*ToolsAdminInfoV2Api* | [**openApi2ToolsAdminInfoGet**](docs/ToolsAdminInfoV2Api.md#openApi2ToolsAdminInfoGet) | **GET** /open_api/2/tools/admin/info/ | 
*ToolsAppManagementAndroidAppListV2Api* | [**openApi2ToolsAppManagementAndroidAppListGet**](docs/ToolsAppManagementAndroidAppListV2Api.md#openApi2ToolsAppManagementAndroidAppListGet) | **GET** /open_api/2/tools/app_management/android_app/list/ | 
*ToolsAppManagementAndroidBasicPackageGetV2Api* | [**openApi2ToolsAppManagementAndroidBasicPackageGetGet**](docs/ToolsAppManagementAndroidBasicPackageGetV2Api.md#openApi2ToolsAppManagementAndroidBasicPackageGetGet) | **GET** /open_api/2/tools/app_management/android_basic_package/get/ | 
*ToolsAppManagementAndroidBasicPackagePublishV2Api* | [**openApi2ToolsAppManagementAndroidBasicPackagePublishPost**](docs/ToolsAppManagementAndroidBasicPackagePublishV2Api.md#openApi2ToolsAppManagementAndroidBasicPackagePublishPost) | **POST** /open_api/2/tools/app_management/android_basic_package/publish/ | 
*ToolsAppManagementAndroidBasicPackageUpdateV2Api* | [**openApi2ToolsAppManagementAndroidBasicPackageUpdatePost**](docs/ToolsAppManagementAndroidBasicPackageUpdateV2Api.md#openApi2ToolsAppManagementAndroidBasicPackageUpdatePost) | **POST** /open_api/2/tools/app_management/android_basic_package/update/ | 
*ToolsAppManagementAppGetV2Api* | [**openApi2ToolsAppManagementAppGetGet**](docs/ToolsAppManagementAppGetV2Api.md#openApi2ToolsAppManagementAppGetGet) | **GET** /open_api/2/tools/app_management/app/get/ | 
*ToolsAppManagementBookingGetV2Api* | [**openApi2ToolsAppManagementBookingGetGet**](docs/ToolsAppManagementBookingGetV2Api.md#openApi2ToolsAppManagementBookingGetGet) | **GET** /open_api/2/tools/app_management/booking/get/ | 
*ToolsAppManagementBookingRecordsGetV2Api* | [**openApi2ToolsAppManagementBookingRecordsGetGet**](docs/ToolsAppManagementBookingRecordsGetV2Api.md#openApi2ToolsAppManagementBookingRecordsGetGet) | **GET** /open_api/2/tools/app_management/booking_records/get/ | 
*ToolsAppManagementBpShareCancelV2Api* | [**openApi2ToolsAppManagementBpShareCancelPost**](docs/ToolsAppManagementBpShareCancelV2Api.md#openApi2ToolsAppManagementBpShareCancelPost) | **POST** /open_api/2/tools/app_management/bp_share/cancel/ | 
*ToolsAppManagementBpShareV2Api* | [**openApi2ToolsAppManagementBpSharePost**](docs/ToolsAppManagementBpShareV2Api.md#openApi2ToolsAppManagementBpSharePost) | **POST** /open_api/2/tools/app_management/bp_share/ | 
*ToolsAppManagementExtendPackageCreateV2Api* | [**openApi2ToolsAppManagementExtendPackageCreatePost**](docs/ToolsAppManagementExtendPackageCreateV2Api.md#openApi2ToolsAppManagementExtendPackageCreatePost) | **POST** /open_api/2/tools/app_management/extend_package/create/ | 
*ToolsAppManagementExtendPackageCreateV2V2Api* | [**openApi2ToolsAppManagementExtendPackageCreateV2Post**](docs/ToolsAppManagementExtendPackageCreateV2V2Api.md#openApi2ToolsAppManagementExtendPackageCreateV2Post) | **POST** /open_api/2/tools/app_management/extend_package/create_v2/ | 
*ToolsAppManagementExtendPackageListV2Api* | [**openApi2ToolsAppManagementExtendPackageListGet**](docs/ToolsAppManagementExtendPackageListV2Api.md#openApi2ToolsAppManagementExtendPackageListGet) | **GET** /open_api/2/tools/app_management/extend_package/list/ | 
*ToolsAppManagementExtendPackageListV2V2Api* | [**openApi2ToolsAppManagementExtendPackageListV2Get**](docs/ToolsAppManagementExtendPackageListV2V2Api.md#openApi2ToolsAppManagementExtendPackageListV2Get) | **GET** /open_api/2/tools/app_management/extend_package/list_v2/ | 
*ToolsAppManagementExtendPackageUpdateV2Api* | [**openApi2ToolsAppManagementExtendPackageUpdatePost**](docs/ToolsAppManagementExtendPackageUpdateV2Api.md#openApi2ToolsAppManagementExtendPackageUpdatePost) | **POST** /open_api/2/tools/app_management/extend_package/update/ | 
*ToolsAppManagementIndustryInfoListV2Api* | [**openApi2ToolsAppManagementIndustryInfoListGet**](docs/ToolsAppManagementIndustryInfoListV2Api.md#openApi2ToolsAppManagementIndustryInfoListGet) | **GET** /open_api/2/tools/app_management/industry_info/list/ | 
*ToolsAppManagementShareAccountListV2Api* | [**openApi2ToolsAppManagementShareAccountListGet**](docs/ToolsAppManagementShareAccountListV2Api.md#openApi2ToolsAppManagementShareAccountListGet) | **GET** /open_api/2/tools/app_management/share_account/list/ | 
*ToolsAppManagementUpdateAuthorizationV2Api* | [**openApi2ToolsAppManagementUpdateAuthorizationPost**](docs/ToolsAppManagementUpdateAuthorizationV2Api.md#openApi2ToolsAppManagementUpdateAuthorizationPost) | **POST** /open_api/2/tools/app_management/update/authorization/ | 
*ToolsAppManagementUploadTaskCreateV2Api* | [**openApi2ToolsAppManagementUploadTaskCreatePost**](docs/ToolsAppManagementUploadTaskCreateV2Api.md#openApi2ToolsAppManagementUploadTaskCreatePost) | **POST** /open_api/2/tools/app_management/upload_task/create/ | 
*ToolsAppManagementUploadTaskListV2Api* | [**openApi2ToolsAppManagementUploadTaskListGet**](docs/ToolsAppManagementUploadTaskListV2Api.md#openApi2ToolsAppManagementUploadTaskListGet) | **GET** /open_api/2/tools/app_management/upload_task/list/ | 
*ToolsAwemeAuthListV2Api* | [**openApi2ToolsAwemeAuthListGet**](docs/ToolsAwemeAuthListV2Api.md#openApi2ToolsAwemeAuthListGet) | **GET** /open_api/2/tools/aweme_auth_list/ | 
*ToolsAwemeAuthorInfoGetV2Api* | [**openApi2ToolsAwemeAuthorInfoGetGet**](docs/ToolsAwemeAuthorInfoGetV2Api.md#openApi2ToolsAwemeAuthorInfoGetGet) | **GET** /open_api/2/tools/aweme_author_info/get/ | 
*ToolsAwemeBannedCreateV30Api* | [**openApiV30ToolsAwemeBannedCreatePost**](docs/ToolsAwemeBannedCreateV30Api.md#openApiV30ToolsAwemeBannedCreatePost) | **POST** /open_api/v3.0/tools/aweme_banned/create/ | 
*ToolsAwemeBannedDeleteV30Api* | [**openApiV30ToolsAwemeBannedDeletePost**](docs/ToolsAwemeBannedDeleteV30Api.md#openApiV30ToolsAwemeBannedDeletePost) | **POST** /open_api/v3.0/tools/aweme_banned/delete/ | 
*ToolsAwemeBannedListV30Api* | [**openApiV30ToolsAwemeBannedListGet**](docs/ToolsAwemeBannedListV30Api.md#openApiV30ToolsAwemeBannedListGet) | **GET** /open_api/v3.0/tools/aweme_banned/list/ | 
*ToolsAwemeCategoryTopAuthorGetV2Api* | [**openApi2ToolsAwemeCategoryTopAuthorGetGet**](docs/ToolsAwemeCategoryTopAuthorGetV2Api.md#openApi2ToolsAwemeCategoryTopAuthorGetGet) | **GET** /open_api/2/tools/aweme_category_top_author/get/ | 
*ToolsAwemeInfoSearchV2Api* | [**openApi2ToolsAwemeInfoSearchGet**](docs/ToolsAwemeInfoSearchV2Api.md#openApi2ToolsAwemeInfoSearchGet) | **GET** /open_api/2/tools/aweme_info_search/ | 
*ToolsAwemeMultiLevelCategoryGetV2Api* | [**openApi2ToolsAwemeMultiLevelCategoryGetGet**](docs/ToolsAwemeMultiLevelCategoryGetV2Api.md#openApi2ToolsAwemeMultiLevelCategoryGetGet) | **GET** /open_api/2/tools/aweme_multi_level_category/get/ | 
*ToolsAwemeSimilarAuthorSearchV2Api* | [**openApi2ToolsAwemeSimilarAuthorSearchGet**](docs/ToolsAwemeSimilarAuthorSearchV2Api.md#openApi2ToolsAwemeSimilarAuthorSearchGet) | **GET** /open_api/2/tools/aweme_similar_author_search/ | 
*ToolsBidSuggestV2Api* | [**openApi2ToolsBidSuggestGet**](docs/ToolsBidSuggestV2Api.md#openApi2ToolsBidSuggestGet) | **GET** /open_api/2/tools/bid/suggest/ | 
*ToolsBidsSuggestV30Api* | [**openApiV30ToolsBidsSuggestGet**](docs/ToolsBidsSuggestV30Api.md#openApiV30ToolsBidsSuggestGet) | **GET** /open_api/v3.0/tools/bids/suggest/ | 
*ToolsBpAssetManagementShareCancelV30Api* | [**openApiV30ToolsBpAssetManagementShareCancelPost**](docs/ToolsBpAssetManagementShareCancelV30Api.md#openApiV30ToolsBpAssetManagementShareCancelPost) | **POST** /open_api/v3.0/tools/bp_asset_management/share/cancel/ | 
*ToolsBpAssetManagementShareGetV30Api* | [**openApiV30ToolsBpAssetManagementShareGetGet**](docs/ToolsBpAssetManagementShareGetV30Api.md#openApiV30ToolsBpAssetManagementShareGetGet) | **GET** /open_api/v3.0/tools/bp_asset_management/share/get/ | 
*ToolsBpAssetManagementShareV30Api* | [**openApiV30ToolsBpAssetManagementSharePost**](docs/ToolsBpAssetManagementShareV30Api.md#openApiV30ToolsBpAssetManagementSharePost) | **POST** /open_api/v3.0/tools/bp_asset_management/share/ | 
*ToolsClueCallbackV2Api* | [**openApi2ToolsClueCallbackPost**](docs/ToolsClueCallbackV2Api.md#openApi2ToolsClueCallbackPost) | **POST** /open_api/2/tools/clue/callback/ | 
*ToolsClueFormDetailV2Api* | [**openApi2ToolsClueFormDetailGet**](docs/ToolsClueFormDetailV2Api.md#openApi2ToolsClueFormDetailGet) | **GET** /open_api/2/tools/clue/form/detail/ | 
*ToolsClueFormGetV2Api* | [**openApi2ToolsClueFormGetGet**](docs/ToolsClueFormGetV2Api.md#openApi2ToolsClueFormGetGet) | **GET** /open_api/2/tools/clue/form/get/ | 
*ToolsClueGetV2Api* | [**openApi2ToolsClueGetGet**](docs/ToolsClueGetV2Api.md#openApi2ToolsClueGetGet) | **GET** /open_api/2/tools/clue/get/ | 
*ToolsClueSmartPhoneGetV2Api* | [**openApi2ToolsClueSmartPhoneGetGet**](docs/ToolsClueSmartPhoneGetV2Api.md#openApi2ToolsClueSmartPhoneGetGet) | **GET** /open_api/2/tools/clue/smart_phone/get/ | 
*ToolsCommentGetV30Api* | [**openApiV30ToolsCommentGetGet**](docs/ToolsCommentGetV30Api.md#openApiV30ToolsCommentGetGet) | **GET** /open_api/v3.0/tools/comment/get/ | 
*ToolsCommentHideV30Api* | [**openApiV30ToolsCommentHidePost**](docs/ToolsCommentHideV30Api.md#openApiV30ToolsCommentHidePost) | **POST** /open_api/v3.0/tools/comment/hide/ | 
*ToolsCommentMid2itemIdV30Api* | [**openApiV30ToolsCommentMid2itemIdGet**](docs/ToolsCommentMid2itemIdV30Api.md#openApiV30ToolsCommentMid2itemIdGet) | **GET** /open_api/v3.0/tools/comment/mid2item_id/ | 
*ToolsCommentReplyGetV30Api* | [**openApiV30ToolsCommentReplyGetGet**](docs/ToolsCommentReplyGetV30Api.md#openApiV30ToolsCommentReplyGetGet) | **GET** /open_api/v3.0/tools/comment_reply/get/ | 
*ToolsCommentReplyV30Api* | [**openApiV30ToolsCommentReplyPost**](docs/ToolsCommentReplyV30Api.md#openApiV30ToolsCommentReplyPost) | **POST** /open_api/v3.0/tools/comment/reply/ | 
*ToolsCommentStickOnTopV30Api* | [**openApiV30ToolsCommentStickOnTopPost**](docs/ToolsCommentStickOnTopV30Api.md#openApiV30ToolsCommentStickOnTopPost) | **POST** /open_api/v3.0/tools/comment/stick_on_top/ | 
*ToolsCommentTermsBannedAddV30Api* | [**openApiV30ToolsCommentTermsBannedAddPost**](docs/ToolsCommentTermsBannedAddV30Api.md#openApiV30ToolsCommentTermsBannedAddPost) | **POST** /open_api/v3.0/tools/comment/terms_banned/add/ | 
*ToolsCommentTermsBannedDeleteV30Api* | [**openApiV30ToolsCommentTermsBannedDeletePost**](docs/ToolsCommentTermsBannedDeleteV30Api.md#openApiV30ToolsCommentTermsBannedDeletePost) | **POST** /open_api/v3.0/tools/comment/terms_banned/delete/ | 
*ToolsCommentTermsBannedGetV30Api* | [**openApiV30ToolsCommentTermsBannedGetGet**](docs/ToolsCommentTermsBannedGetV30Api.md#openApiV30ToolsCommentTermsBannedGetGet) | **GET** /open_api/v3.0/tools/comment/terms_banned/get/ | 
*ToolsCommentTermsBannedUpdateV30Api* | [**openApiV30ToolsCommentTermsBannedUpdatePost**](docs/ToolsCommentTermsBannedUpdateV30Api.md#openApiV30ToolsCommentTermsBannedUpdatePost) | **POST** /open_api/v3.0/tools/comment/terms_banned/update/ | 
*ToolsCountryInfoV2Api* | [**openApi2ToolsCountryInfoGet**](docs/ToolsCountryInfoV2Api.md#openApi2ToolsCountryInfoGet) | **GET** /open_api/2/tools/country/info/ | 
*ToolsCreativeWordSelectV2Api* | [**openApi2ToolsCreativeWordSelectGet**](docs/ToolsCreativeWordSelectV2Api.md#openApi2ToolsCreativeWordSelectGet) | **GET** /open_api/2/tools/creative_word/select/ | 
*ToolsDiagnosisAdGetV2V2Api* | [**openApi2ToolsDiagnosisAdGetV2Get**](docs/ToolsDiagnosisAdGetV2V2Api.md#openApi2ToolsDiagnosisAdGetV2Get) | **GET** /open_api/2/tools/diagnosis/ad/get_v2/ | 
*ToolsDiagnosisSuggestionGetV2Api* | [**openApi2ToolsDiagnosisSuggestionGetGet**](docs/ToolsDiagnosisSuggestionGetV2Api.md#openApi2ToolsDiagnosisSuggestionGetGet) | **GET** /open_api/2/tools/diagnosis/suggestion/get/ | 
*ToolsDownloadPackageGetV2Api* | [**openApi2ToolsDownloadPackageGetGet**](docs/ToolsDownloadPackageGetV2Api.md#openApi2ToolsDownloadPackageGetGet) | **GET** /open_api/2/tools/download/package/get/ | 
*ToolsDownloadPackageParseV2Api* | [**openApi2ToolsDownloadPackageParsePost**](docs/ToolsDownloadPackageParseV2Api.md#openApi2ToolsDownloadPackageParsePost) | **POST** /open_api/2/tools/download/package/parse/ | 
*ToolsEstimateAudienceV2Api* | [**openApi2ToolsEstimateAudienceGet**](docs/ToolsEstimateAudienceV2Api.md#openApi2ToolsEstimateAudienceGet) | **GET** /open_api/2/tools/estimate_audience/ | 
*ToolsEstimatedPriceGetV2Api* | [**openApi2ToolsEstimatedPriceGetGet**](docs/ToolsEstimatedPriceGetV2Api.md#openApi2ToolsEstimatedPriceGetGet) | **GET** /open_api/2/tools/estimated_price/get/ | 
*ToolsEventAssetsGetV2Api* | [**openApi2ToolsEventAssetsGetGet**](docs/ToolsEventAssetsGetV2Api.md#openApi2ToolsEventAssetsGetGet) | **GET** /open_api/2/tools/event/assets/get/ | 
*ToolsGrayGetV30Api* | [**openApiV30ToolsGrayGetGet**](docs/ToolsGrayGetV30Api.md#openApiV30ToolsGrayGetGet) | **GET** /open_api/v3.0/tools/gray/get/ | 
*ToolsIesAccountSearchV2Api* | [**openApi2ToolsIesAccountSearchGet**](docs/ToolsIesAccountSearchV2Api.md#openApi2ToolsIesAccountSearchGet) | **GET** /open_api/2/tools/ies_account_search/ | 
*ToolsIndustryGetV2Api* | [**openApi2ToolsIndustryGetGet**](docs/ToolsIndustryGetV2Api.md#openApi2ToolsIndustryGetGet) | **GET** /open_api/2/tools/industry/get/ | 
*ToolsInterestActionActionCategoryV2Api* | [**openApi2ToolsInterestActionActionCategoryGet**](docs/ToolsInterestActionActionCategoryV2Api.md#openApi2ToolsInterestActionActionCategoryGet) | **GET** /open_api/2/tools/interest_action/action/category/ | 
*ToolsInterestActionActionKeywordV2Api* | [**openApi2ToolsInterestActionActionKeywordGet**](docs/ToolsInterestActionActionKeywordV2Api.md#openApi2ToolsInterestActionActionKeywordGet) | **GET** /open_api/2/tools/interest_action/action/keyword/ | 
*ToolsInterestActionId2wordV2Api* | [**openApi2ToolsInterestActionId2wordGet**](docs/ToolsInterestActionId2wordV2Api.md#openApi2ToolsInterestActionId2wordGet) | **GET** /open_api/2/tools/interest_action/id2word/ | 
*ToolsInterestActionInterestCategoryV2Api* | [**openApi2ToolsInterestActionInterestCategoryGet**](docs/ToolsInterestActionInterestCategoryV2Api.md#openApi2ToolsInterestActionInterestCategoryGet) | **GET** /open_api/2/tools/interest_action/interest/category/ | 
*ToolsInterestActionInterestKeywordV2Api* | [**openApi2ToolsInterestActionInterestKeywordGet**](docs/ToolsInterestActionInterestKeywordV2Api.md#openApi2ToolsInterestActionInterestKeywordGet) | **GET** /open_api/2/tools/interest_action/interest/keyword/ | 
*ToolsInterestActionKeywordSuggestV2Api* | [**openApi2ToolsInterestActionKeywordSuggestGet**](docs/ToolsInterestActionKeywordSuggestV2Api.md#openApi2ToolsInterestActionKeywordSuggestGet) | **GET** /open_api/2/tools/interest_action/keyword/suggest/ | 
*ToolsKeyActionGetV2Api* | [**openApi2ToolsKeyActionGetGet**](docs/ToolsKeyActionGetV2Api.md#openApi2ToolsKeyActionGetGet) | **GET** /open_api/2/tools/key_action/get/ | 
*ToolsKeywordsBidRatioCreateV30Api* | [**openApiV30ToolsKeywordsBidRatioCreatePost**](docs/ToolsKeywordsBidRatioCreateV30Api.md#openApiV30ToolsKeywordsBidRatioCreatePost) | **POST** /open_api/v3.0/tools/keywords_bid_ratio/create/ | 
*ToolsKeywordsBidRatioDeleteV30Api* | [**openApiV30ToolsKeywordsBidRatioDeletePost**](docs/ToolsKeywordsBidRatioDeleteV30Api.md#openApiV30ToolsKeywordsBidRatioDeletePost) | **POST** /open_api/v3.0/tools/keywords_bid_ratio/delete/ | 
*ToolsKeywordsBidRatioGetV30Api* | [**openApiV30ToolsKeywordsBidRatioGetGet**](docs/ToolsKeywordsBidRatioGetV30Api.md#openApiV30ToolsKeywordsBidRatioGetGet) | **GET** /open_api/v3.0/tools/keywords_bid_ratio/get/ | 
*ToolsKeywordsBidRatioUpdateV30Api* | [**openApiV30ToolsKeywordsBidRatioUpdatePost**](docs/ToolsKeywordsBidRatioUpdateV30Api.md#openApiV30ToolsKeywordsBidRatioUpdatePost) | **POST** /open_api/v3.0/tools/keywords_bid_ratio/update/ | 
*ToolsKeywordsProjectInfoGetV30Api* | [**openApiV30ToolsKeywordsProjectInfoGetGet**](docs/ToolsKeywordsProjectInfoGetV30Api.md#openApiV30ToolsKeywordsProjectInfoGetGet) | **GET** /open_api/v3.0/tools/keywords_project_info/get/ | 
*ToolsLandingGroupCreateV2Api* | [**openApi2ToolsLandingGroupCreatePost**](docs/ToolsLandingGroupCreateV2Api.md#openApi2ToolsLandingGroupCreatePost) | **POST** /open_api/2/tools/landing_group/create/ | 
*ToolsLandingGroupGetV2Api* | [**openApi2ToolsLandingGroupGetGet**](docs/ToolsLandingGroupGetV2Api.md#openApi2ToolsLandingGroupGetGet) | **GET** /open_api/2/tools/landing_group/get/ | 
*ToolsLandingGroupSiteOptStatusUpdateV2Api* | [**openApi2ToolsLandingGroupSiteOptStatusUpdatePost**](docs/ToolsLandingGroupSiteOptStatusUpdateV2Api.md#openApi2ToolsLandingGroupSiteOptStatusUpdatePost) | **POST** /open_api/2/tools/landing_group/site_opt_status/update/ | 
*ToolsLandingGroupUpdateV2Api* | [**openApi2ToolsLandingGroupUpdatePost**](docs/ToolsLandingGroupUpdateV2Api.md#openApi2ToolsLandingGroupUpdatePost) | **POST** /open_api/2/tools/landing_group/update/ | 
*ToolsLiveAuthorizeListV2Api* | [**openApi2ToolsLiveAuthorizeListGet**](docs/ToolsLiveAuthorizeListV2Api.md#openApi2ToolsLiveAuthorizeListGet) | **GET** /open_api/2/tools/live_authorize/list/ | 
*ToolsLogSearchV2Api* | [**openApi2ToolsLogSearchGet**](docs/ToolsLogSearchV2Api.md#openApi2ToolsLogSearchGet) | **GET** /open_api/2/tools/log_search/ | 
*ToolsOrangeSiteGetV30Api* | [**openApiV30ToolsOrangeSiteGetGet**](docs/ToolsOrangeSiteGetV30Api.md#openApiV30ToolsOrangeSiteGetGet) | **GET** /open_api/v3.0/tools/orange_site/get/ | 
*ToolsPlayableCloudGameListV2Api* | [**openApi2ToolsPlayableCloudGameListGet**](docs/ToolsPlayableCloudGameListV2Api.md#openApi2ToolsPlayableCloudGameListGet) | **GET** /open_api/2/tools/playable/cloud_game/list/ | 
*ToolsPlayableListGetV2Api* | [**openApi2ToolsPlayableListGetGet**](docs/ToolsPlayableListGetV2Api.md#openApi2ToolsPlayableListGetGet) | **GET** /open_api/2/tools/playable_list/get/ | 
*ToolsPreAuditGetV2Api* | [**openApi2ToolsPreAuditGetGet**](docs/ToolsPreAuditGetV2Api.md#openApi2ToolsPreAuditGetGet) | **GET** /open_api/2/tools/pre_audit/get/ | 
*ToolsPreAuditSendV2Api* | [**openApi2ToolsPreAuditSendPost**](docs/ToolsPreAuditSendV2Api.md#openApi2ToolsPreAuditSendPost) | **POST** /open_api/2/tools/pre_audit/send/ | 
*ToolsPrivativeWordBatchGetV30Api* | [**openApiV30ToolsPrivativeWordBatchGetPost**](docs/ToolsPrivativeWordBatchGetV30Api.md#openApiV30ToolsPrivativeWordBatchGetPost) | **POST** /open_api/v3.0/tools/privative_word/batch_get/ | 
*ToolsPrivativeWordGetV2Api* | [**openApi2ToolsPrivativeWordGetGet**](docs/ToolsPrivativeWordGetV2Api.md#openApi2ToolsPrivativeWordGetGet) | **GET** /open_api/2/tools/privative_word/get/ | 
*ToolsPrivativeWordProjectAddV30Api* | [**openApiV30ToolsPrivativeWordProjectAddPost**](docs/ToolsPrivativeWordProjectAddV30Api.md#openApiV30ToolsPrivativeWordProjectAddPost) | **POST** /open_api/v3.0/tools/privative_word/project/add/ | 
*ToolsPrivativeWordProjectUpdateV30Api* | [**openApiV30ToolsPrivativeWordProjectUpdatePost**](docs/ToolsPrivativeWordProjectUpdateV30Api.md#openApiV30ToolsPrivativeWordProjectUpdatePost) | **POST** /open_api/v3.0/tools/privative_word/project/update/ | 
*ToolsPrivativeWordPromotionAddV30Api* | [**openApiV30ToolsPrivativeWordPromotionAddPost**](docs/ToolsPrivativeWordPromotionAddV30Api.md#openApiV30ToolsPrivativeWordPromotionAddPost) | **POST** /open_api/v3.0/tools/privative_word/promotion/add/ | 
*ToolsPrivativeWordPromotionUpdateV30Api* | [**openApiV30ToolsPrivativeWordPromotionUpdatePost**](docs/ToolsPrivativeWordPromotionUpdateV30Api.md#openApiV30ToolsPrivativeWordPromotionUpdatePost) | **POST** /open_api/v3.0/tools/privative_word/promotion/update/ | 
*ToolsPromotionCardRecommendGetV2Api* | [**openApi2ToolsPromotionCardRecommendGetGet**](docs/ToolsPromotionCardRecommendGetV2Api.md#openApi2ToolsPromotionCardRecommendGetGet) | **GET** /open_api/2/tools/promotion_card/recommend/get/ | 
*ToolsPromotionCardRecommendTitleGetV2Api* | [**openApi2ToolsPromotionCardRecommendTitleGetGet**](docs/ToolsPromotionCardRecommendTitleGetV2Api.md#openApi2ToolsPromotionCardRecommendTitleGetGet) | **GET** /open_api/2/tools/promotion_card/recommend_title/get/ | 
*ToolsPromotionDiagnosisSuggestionAcceptV30Api* | [**openApiV30ToolsPromotionDiagnosisSuggestionAcceptPost**](docs/ToolsPromotionDiagnosisSuggestionAcceptV30Api.md#openApiV30ToolsPromotionDiagnosisSuggestionAcceptPost) | **POST** /open_api/v3.0/tools/promotion_diagnosis/suggestion/accept/ | 
*ToolsPromotionDiagnosisSuggestionGetV30Api* | [**openApiV30ToolsPromotionDiagnosisSuggestionGetGet**](docs/ToolsPromotionDiagnosisSuggestionGetV30Api.md#openApiV30ToolsPromotionDiagnosisSuggestionGetGet) | **GET** /open_api/v3.0/tools/promotion_diagnosis/suggestion/get/ | 
*ToolsPromotionRaiseSetV30Api* | [**openApiV30ToolsPromotionRaiseSetPost**](docs/ToolsPromotionRaiseSetV30Api.md#openApiV30ToolsPromotionRaiseSetPost) | **POST** /open_api/v3.0/tools/promotion_raise/set/ | 
*ToolsPromotionRaiseStatusCurrentIdsGetV30Api* | [**openApiV30ToolsPromotionRaiseStatusCurrentIdsGetGet**](docs/ToolsPromotionRaiseStatusCurrentIdsGetV30Api.md#openApiV30ToolsPromotionRaiseStatusCurrentIdsGetGet) | **GET** /open_api/v3.0/tools/promotion_raise_status_current_ids/get/ | 
*ToolsPromotionRaiseStatusGetV30Api* | [**openApiV30ToolsPromotionRaiseStatusGetGet**](docs/ToolsPromotionRaiseStatusGetV30Api.md#openApiV30ToolsPromotionRaiseStatusGetGet) | **GET** /open_api/v3.0/tools/promotion_raise_status/get/ | 
*ToolsPromotionRaiseStopV30Api* | [**openApiV30ToolsPromotionRaiseStopPost**](docs/ToolsPromotionRaiseStopV30Api.md#openApiV30ToolsPromotionRaiseStopPost) | **POST** /open_api/v3.0/tools/promotion_raise/stop/ | 
*ToolsPromotionRaiseVersionGetV30Api* | [**openApiV30ToolsPromotionRaiseVersionGetGet**](docs/ToolsPromotionRaiseVersionGetV30Api.md#openApiV30ToolsPromotionRaiseVersionGetGet) | **GET** /open_api/v3.0/tools/promotion_raise_version/get/ | 
*ToolsQuotaGetV2Api* | [**openApi2ToolsQuotaGetGet**](docs/ToolsQuotaGetV2Api.md#openApi2ToolsQuotaGetGet) | **GET** /open_api/2/tools/quota/get/ | 
*ToolsRegionGetV2Api* | [**openApi2ToolsRegionGetGet**](docs/ToolsRegionGetV2Api.md#openApi2ToolsRegionGetGet) | **GET** /open_api/2/tools/region/get/ | 
*ToolsRtaGetInfoV2Api* | [**openApi2ToolsRtaGetInfoGet**](docs/ToolsRtaGetInfoV2Api.md#openApi2ToolsRtaGetInfoGet) | **GET** /open_api/2/tools/rta/get_info/ | 
*ToolsRtaGetV2Api* | [**openApi2ToolsRtaGetGet**](docs/ToolsRtaGetV2Api.md#openApi2ToolsRtaGetGet) | **GET** /open_api/2/tools/rta/get/ | 
*ToolsRtaScopeGetV30Api* | [**openApiV30ToolsRtaScopeGetGet**](docs/ToolsRtaScopeGetV30Api.md#openApiV30ToolsRtaScopeGetGet) | **GET** /open_api/v3.0/tools/rta/scope/get/ | 
*ToolsRtaSetScopeV2Api* | [**openApi2ToolsRtaSetScopePost**](docs/ToolsRtaSetScopeV2Api.md#openApi2ToolsRtaSetScopePost) | **POST** /open_api/2/tools/rta/set_scope/ | 
*ToolsRtaStatusUpdateV2Api* | [**openApi2ToolsRtaStatusUpdatePost**](docs/ToolsRtaStatusUpdateV2Api.md#openApi2ToolsRtaStatusUpdatePost) | **POST** /open_api/2/tools/rta/status_update/ | 
*ToolsRubeexGetV2Api* | [**openApi2ToolsRubeexGetGet**](docs/ToolsRubeexGetV2Api.md#openApi2ToolsRubeexGetGet) | **GET** /open_api/2/tools/rubeex/get/ | 
*ToolsRubeexPlayableListV2Api* | [**openApi2ToolsRubeexPlayableListGet**](docs/ToolsRubeexPlayableListV2Api.md#openApi2ToolsRubeexPlayableListGet) | **GET** /open_api/2/tools/rubeex_playable/list/ | 
*ToolsRubeexRemarkV2Api* | [**openApi2ToolsRubeexRemarkGet**](docs/ToolsRubeexRemarkV2Api.md#openApi2ToolsRubeexRemarkGet) | **GET** /open_api/2/tools/rubeex/remark/ | 
*ToolsRubeexVersionGetV2Api* | [**openApi2ToolsRubeexVersionGetGet**](docs/ToolsRubeexVersionGetV2Api.md#openApi2ToolsRubeexVersionGetGet) | **GET** /open_api/2/tools/rubeex/version/get/ | 
*ToolsSearchBidRatioGetV2Api* | [**openApi2ToolsSearchBidRatioGetGet**](docs/ToolsSearchBidRatioGetV2Api.md#openApi2ToolsSearchBidRatioGetGet) | **GET** /open_api/2/tools/search_bid_ratio/get/ | 
*ToolsSiteCopyV2Api* | [**openApi2ToolsSiteCopyPost**](docs/ToolsSiteCopyV2Api.md#openApi2ToolsSiteCopyPost) | **POST** /open_api/2/tools/site/copy/ | 
*ToolsSiteCreateV2Api* | [**openApi2ToolsSiteCreatePost**](docs/ToolsSiteCreateV2Api.md#openApi2ToolsSiteCreatePost) | **POST** /open_api/2/tools/site/create/ | 
*ToolsSiteFormsListV2Api* | [**openApi2ToolsSiteFormsListGet**](docs/ToolsSiteFormsListV2Api.md#openApi2ToolsSiteFormsListGet) | **GET** /open_api/2/tools/site/forms/list/ | 
*ToolsSiteGetV2Api* | [**openApi2ToolsSiteGetGet**](docs/ToolsSiteGetV2Api.md#openApi2ToolsSiteGetGet) | **GET** /open_api/2/tools/site/get/ | 
*ToolsSiteHandselV2Api* | [**openApi2ToolsSiteHandselPost**](docs/ToolsSiteHandselV2Api.md#openApi2ToolsSiteHandselPost) | **POST** /open_api/2/tools/site/handsel/ | 
*ToolsSitePreviewV2Api* | [**openApi2ToolsSitePreviewGet**](docs/ToolsSitePreviewV2Api.md#openApi2ToolsSitePreviewGet) | **GET** /open_api/2/tools/site/preview/ | 
*ToolsSiteReadV2Api* | [**openApi2ToolsSiteReadGet**](docs/ToolsSiteReadV2Api.md#openApi2ToolsSiteReadGet) | **GET** /open_api/2/tools/site/read/ | 
*ToolsSiteTemplateCreateV2Api* | [**openApi2ToolsSiteTemplateCreatePost**](docs/ToolsSiteTemplateCreateV2Api.md#openApi2ToolsSiteTemplateCreatePost) | **POST** /open_api/2/tools/site_template/create/ | 
*ToolsSiteTemplateGetV2Api* | [**openApi2ToolsSiteTemplateGetGet**](docs/ToolsSiteTemplateGetV2Api.md#openApi2ToolsSiteTemplateGetGet) | **GET** /open_api/2/tools/site_template/get/ | 
*ToolsSiteTemplatePicUrlGetV2Api* | [**openApi2ToolsSiteTemplatePicUrlGetGet**](docs/ToolsSiteTemplatePicUrlGetV2Api.md#openApi2ToolsSiteTemplatePicUrlGetGet) | **GET** /open_api/2/tools/site_template/pic_url/get/ | 
*ToolsSiteTemplatePreviewV2Api* | [**openApi2ToolsSiteTemplatePreviewGet**](docs/ToolsSiteTemplatePreviewV2Api.md#openApi2ToolsSiteTemplatePreviewGet) | **GET** /open_api/2/tools/site_template/preview/ | 
*ToolsSiteTemplateSiteCreateV2Api* | [**openApi2ToolsSiteTemplateSiteCreatePost**](docs/ToolsSiteTemplateSiteCreateV2Api.md#openApi2ToolsSiteTemplateSiteCreatePost) | **POST** /open_api/2/tools/site_template/site/create/ | 
*ToolsSiteUpdateStatusV2Api* | [**openApi2ToolsSiteUpdateStatusPost**](docs/ToolsSiteUpdateStatusV2Api.md#openApi2ToolsSiteUpdateStatusPost) | **POST** /open_api/2/tools/site/update_status/ | 
*ToolsSiteUpdateV2Api* | [**openApi2ToolsSiteUpdatePost**](docs/ToolsSiteUpdateV2Api.md#openApi2ToolsSiteUpdatePost) | **POST** /open_api/2/tools/site/update/ | 
*ToolsSuggestBudgetGetV30Api* | [**openApiV30ToolsSuggestBudgetGetGet**](docs/ToolsSuggestBudgetGetV30Api.md#openApiV30ToolsSuggestBudgetGetGet) | **GET** /open_api/v3.0/tools/suggest_budget/get/ | 
*ToolsTaskRaiseCreateV2Api* | [**openApi2ToolsTaskRaiseCreatePost**](docs/ToolsTaskRaiseCreateV2Api.md#openApi2ToolsTaskRaiseCreatePost) | **POST** /open_api/2/tools/task_raise/create/ | 
*ToolsTaskRaiseDataGetV2Api* | [**openApi2ToolsTaskRaiseDataGetGet**](docs/ToolsTaskRaiseDataGetV2Api.md#openApi2ToolsTaskRaiseDataGetGet) | **GET** /open_api/2/tools/task_raise/data/get/ | 
*ToolsTaskRaiseGetV2Api* | [**openApi2ToolsTaskRaiseGetGet**](docs/ToolsTaskRaiseGetV2Api.md#openApi2ToolsTaskRaiseGetGet) | **GET** /open_api/2/tools/task_raise/get/ | 
*ToolsTaskRaiseOptimizationIdsGetV2Api* | [**openApi2ToolsTaskRaiseOptimizationIdsGetGet**](docs/ToolsTaskRaiseOptimizationIdsGetV2Api.md#openApi2ToolsTaskRaiseOptimizationIdsGetGet) | **GET** /open_api/2/tools/task_raise/optimization_ids/get/ | 
*ToolsTaskRaiseStatusStopV2Api* | [**openApi2ToolsTaskRaiseStatusStopPost**](docs/ToolsTaskRaiseStatusStopV2Api.md#openApi2ToolsTaskRaiseStatusStopPost) | **POST** /open_api/2/tools/task_raise/status/stop/ | 
*ToolsThirdSiteCreateV2Api* | [**openApi2ToolsThirdSiteCreatePost**](docs/ToolsThirdSiteCreateV2Api.md#openApi2ToolsThirdSiteCreatePost) | **POST** /open_api/2/tools/third_site/create/ | 
*ToolsThirdSiteDeleteV2Api* | [**openApi2ToolsThirdSiteDeletePost**](docs/ToolsThirdSiteDeleteV2Api.md#openApi2ToolsThirdSiteDeletePost) | **POST** /open_api/2/tools/third_site/delete/ | 
*ToolsThirdSiteGetV2Api* | [**openApi2ToolsThirdSiteGetGet**](docs/ToolsThirdSiteGetV2Api.md#openApi2ToolsThirdSiteGetGet) | **GET** /open_api/2/tools/third_site/get/ | 
*ToolsThirdSitePreviewV2Api* | [**openApi2ToolsThirdSitePreviewGet**](docs/ToolsThirdSitePreviewV2Api.md#openApi2ToolsThirdSitePreviewGet) | **GET** /open_api/2/tools/third_site/preview/ | 
*ToolsThirdSiteUpdateV2Api* | [**openApi2ToolsThirdSiteUpdatePost**](docs/ToolsThirdSiteUpdateV2Api.md#openApi2ToolsThirdSiteUpdatePost) | **POST** /open_api/2/tools/third_site/update/ | 
*ToolsUnionFlowPackageCreateV2Api* | [**openApi2ToolsUnionFlowPackageCreatePost**](docs/ToolsUnionFlowPackageCreateV2Api.md#openApi2ToolsUnionFlowPackageCreatePost) | **POST** /open_api/2/tools/union/flow_package/create/ | 
*ToolsUnionFlowPackageDeleteV2Api* | [**openApi2ToolsUnionFlowPackageDeletePost**](docs/ToolsUnionFlowPackageDeleteV2Api.md#openApi2ToolsUnionFlowPackageDeletePost) | **POST** /open_api/2/tools/union/flow_package/delete/ | 
*ToolsUnionFlowPackageGetV2Api* | [**openApi2ToolsUnionFlowPackageGetGet**](docs/ToolsUnionFlowPackageGetV2Api.md#openApi2ToolsUnionFlowPackageGetGet) | **GET** /open_api/2/tools/union/flow_package/get/ | 
*ToolsUnionFlowPackagePromotionReportV30Api* | [**openApiV30ToolsUnionFlowPackagePromotionReportGet**](docs/ToolsUnionFlowPackagePromotionReportV30Api.md#openApiV30ToolsUnionFlowPackagePromotionReportGet) | **GET** /open_api/v3.0/tools/union/flow_package/promotion/report/ | 
*ToolsUnionFlowPackageReportV2Api* | [**openApi2ToolsUnionFlowPackageReportGet**](docs/ToolsUnionFlowPackageReportV2Api.md#openApi2ToolsUnionFlowPackageReportGet) | **GET** /open_api/2/tools/union/flow_package/report/ | 
*ToolsUnionFlowPackageUpdateV2Api* | [**openApi2ToolsUnionFlowPackageUpdatePost**](docs/ToolsUnionFlowPackageUpdateV2Api.md#openApi2ToolsUnionFlowPackageUpdatePost) | **POST** /open_api/2/tools/union/flow_package/update/ | 
*ToolsVideoCheckAvailableAnchorV2Api* | [**openApi2ToolsVideoCheckAvailableAnchorGet**](docs/ToolsVideoCheckAvailableAnchorV2Api.md#openApi2ToolsVideoCheckAvailableAnchorGet) | **GET** /open_api/2/tools/video/check_available_anchor/ | 
*ToolsVideoCoverSuggestV2Api* | [**openApi2ToolsVideoCoverSuggestGet**](docs/ToolsVideoCoverSuggestV2Api.md#openApi2ToolsVideoCoverSuggestGet) | **GET** /open_api/2/tools/video_cover/suggest/ | 
*ToolsWechatAppletCreateV30Api* | [**openApiV30ToolsWechatAppletCreatePost**](docs/ToolsWechatAppletCreateV30Api.md#openApiV30ToolsWechatAppletCreatePost) | **POST** /open_api/v3.0/tools/wechat_applet/create/ | 
*ToolsWechatAppletListV30Api* | [**openApiV30ToolsWechatAppletListGet**](docs/ToolsWechatAppletListV30Api.md#openApiV30ToolsWechatAppletListGet) | **GET** /open_api/v3.0/tools/wechat_applet/list/ | 
*ToolsWechatAppletUpdateV30Api* | [**openApiV30ToolsWechatAppletUpdatePost**](docs/ToolsWechatAppletUpdateV30Api.md#openApiV30ToolsWechatAppletUpdatePost) | **POST** /open_api/v3.0/tools/wechat_applet/update/ | 
*ToolsWechatGameCreateV30Api* | [**openApiV30ToolsWechatGameCreatePost**](docs/ToolsWechatGameCreateV30Api.md#openApiV30ToolsWechatGameCreatePost) | **POST** /open_api/v3.0/tools/wechat_game/create/ | 
*ToolsWechatGameListV30Api* | [**openApiV30ToolsWechatGameListGet**](docs/ToolsWechatGameListV30Api.md#openApiV30ToolsWechatGameListGet) | **GET** /open_api/v3.0/tools/wechat_game/list/ | 
*UserInfoV2Api* | [**openApi2UserInfoGet**](docs/UserInfoV2Api.md#openApi2UserInfoGet) | **GET** /open_api/2/user/info/ | 


## 问题建议与反馈
如果您在使用SDK过程中有任何问题与建议，请随时登录[开发者官网](https://open.oceanengine.com/labels) ，点击右下角的"咨询"按钮，与我们的客服支持人员联系

## 后续计划
1. 丰富各类场景示例
2. 推出其他语言的SDK