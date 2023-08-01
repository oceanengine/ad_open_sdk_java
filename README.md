# Marketing Java SDK

## 概述
巨量引擎开放平台 Marketing API(以下简称API) SDK 提供了Token获取、请求封装、响应解释等功能，以本地化方式轻松完成API的调用和结果的获取，旨在帮助开发者快速搭建投放管理系统。
- API version: 0.0.6
  - Build date: 2023-08-01T15:20:00.039+08:00[Asia/Shanghai]

## 使用条件
1. 使用SDK需要首先注册成为巨量引擎开发者，请参考[开发者快速入门文档](https://open.oceanengine.com/labels/7/docs/1696710498372623)
2. 使用SDK需要先拥有API的访问权限，所有SDK的使用与应用拥有的权限组相关联

## 安装

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
*CreativeStrategyListV2Api* | [**openApi2CreativeStrategyListGet**](docs/CreativeStrategyListV2Api.md#openApi2CreativeStrategyListGet) | **GET** /open_api/2/creative/strategy/list/ | 
*DouplusOrderListV30Api* | [**openApiV30DouplusOrderListGet**](docs/DouplusOrderListV30Api.md#openApiV30DouplusOrderListGet) | **GET** /open_api/v3.0/douplus/order/list/ | 
*DouplusOrderReportV30Api* | [**openApiV30DouplusOrderReportGet**](docs/DouplusOrderReportV30Api.md#openApiV30DouplusOrderReportGet) | **GET** /open_api/v3.0/douplus/order/report/ | 
*MaterialStatusUpdateV30Api* | [**openApiV30MaterialStatusUpdatePost**](docs/MaterialStatusUpdateV30Api.md#openApiV30MaterialStatusUpdatePost) | **POST** /open_api/v3.0/material/status/update/ | 
*Oauth2AccessTokenApi* | [**openApiOauth2AccessTokenPost**](docs/Oauth2AccessTokenApi.md#openApiOauth2AccessTokenPost) | **POST** /open_api/oauth2/access_token/ | 
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
*ReportCustomConfigGetV30Api* | [**openApiV30ReportCustomConfigGetGet**](docs/ReportCustomConfigGetV30Api.md#openApiV30ReportCustomConfigGetGet) | **GET** /open_api/v3.0/report/custom/config/get/ | 
*ReportCustomGetV30Api* | [**openApiV30ReportCustomGetGet**](docs/ReportCustomGetV30Api.md#openApiV30ReportCustomGetGet) | **GET** /open_api/v3.0/report/custom/get/ | 
*SuggWordsV30Api* | [**openApiV30SuggWordsPost**](docs/SuggWordsV30Api.md#openApiV30SuggWordsPost) | **POST** /open_api/v3.0/sugg_words/ | 
*ToolsKeywordsBidRatioCreateV30Api* | [**openApiV30ToolsKeywordsBidRatioCreatePost**](docs/ToolsKeywordsBidRatioCreateV30Api.md#openApiV30ToolsKeywordsBidRatioCreatePost) | **POST** /open_api/v3.0/tools/keywords_bid_ratio/create/ | 
*ToolsKeywordsBidRatioDeleteV30Api* | [**openApiV30ToolsKeywordsBidRatioDeletePost**](docs/ToolsKeywordsBidRatioDeleteV30Api.md#openApiV30ToolsKeywordsBidRatioDeletePost) | **POST** /open_api/v3.0/tools/keywords_bid_ratio/delete/ | 
*ToolsKeywordsBidRatioGetV30Api* | [**openApiV30ToolsKeywordsBidRatioGetGet**](docs/ToolsKeywordsBidRatioGetV30Api.md#openApiV30ToolsKeywordsBidRatioGetGet) | **GET** /open_api/v3.0/tools/keywords_bid_ratio/get/ | 
*ToolsKeywordsBidRatioUpdateV30Api* | [**openApiV30ToolsKeywordsBidRatioUpdatePost**](docs/ToolsKeywordsBidRatioUpdateV30Api.md#openApiV30ToolsKeywordsBidRatioUpdatePost) | **POST** /open_api/v3.0/tools/keywords_bid_ratio/update/ | 
*ToolsKeywordsProjectInfoGetV30Api* | [**openApiV30ToolsKeywordsProjectInfoGetGet**](docs/ToolsKeywordsProjectInfoGetV30Api.md#openApiV30ToolsKeywordsProjectInfoGetGet) | **GET** /open_api/v3.0/tools/keywords_project_info/get/ | 
*ToolsPrivativeWordBatchGetV30Api* | [**openApiV30ToolsPrivativeWordBatchGetPost**](docs/ToolsPrivativeWordBatchGetV30Api.md#openApiV30ToolsPrivativeWordBatchGetPost) | **POST** /open_api/v3.0/tools/privative_word/batch_get/ | 
*ToolsPrivativeWordProjectAddV30Api* | [**openApiV30ToolsPrivativeWordProjectAddPost**](docs/ToolsPrivativeWordProjectAddV30Api.md#openApiV30ToolsPrivativeWordProjectAddPost) | **POST** /open_api/v3.0/tools/privative_word/project/add/ | 
*ToolsPrivativeWordProjectUpdateV30Api* | [**openApiV30ToolsPrivativeWordProjectUpdatePost**](docs/ToolsPrivativeWordProjectUpdateV30Api.md#openApiV30ToolsPrivativeWordProjectUpdatePost) | **POST** /open_api/v3.0/tools/privative_word/project/update/ | 
*ToolsPrivativeWordPromotionAddV30Api* | [**openApiV30ToolsPrivativeWordPromotionAddPost**](docs/ToolsPrivativeWordPromotionAddV30Api.md#openApiV30ToolsPrivativeWordPromotionAddPost) | **POST** /open_api/v3.0/tools/privative_word/promotion/add/ | 
*ToolsPrivativeWordPromotionUpdateV30Api* | [**openApiV30ToolsPrivativeWordPromotionUpdatePost**](docs/ToolsPrivativeWordPromotionUpdateV30Api.md#openApiV30ToolsPrivativeWordPromotionUpdatePost) | **POST** /open_api/v3.0/tools/privative_word/promotion/update/ | 


## 问题建议与反馈
如果您在使用SDK过程中有任何问题与建议，请随时登录[开发者官网](https://open.oceanengine.com/labels) ，点击右下角的"咨询"按钮，与我们的客服支持人员联系

## 后续计划
1. 丰富各类场景示例
2. 推出其他语言的SDK