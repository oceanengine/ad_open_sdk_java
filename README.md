# Marketing Java SDK

## 概述
巨量引擎开放平台 Marketing API(以下简称API) SDK 提供了Token获取、请求封装、响应解释等功能，以本地化方式轻松完成API的调用和结果的获取，旨在帮助开发者快速搭建投放管理系统。
- API version: 0.0.1
  - Build date: 2025-02-17T20:36:04.545962331+08:00[Asia/Shanghai]

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

如果自己设置了镜像源（比如阿里云），导致拉取不到sdk，需要在maven的settings里做一点改动，!OceanengineOpenApi，如下（或者不使用第三方镜像源）
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
*Oauth2AccessTokenApi* | **openApiOauth2AccessTokenPost** | **POST** /open_api/oauth2/access_token/
*Oauth2RefreshTokenApi* | **openApiOauth2RefreshTokenPost** | **POST** /open_api/oauth2/refresh_token/
*ProjectCreateV30Api* | **openApiV30ProjectCreatePost** | **POST** /open_api/v3.0/project/create/
*PromotionListV30Api* | **openApiV30PromotionListGet** | **GET** /open_api/v3.0/promotion/list/


## 问题建议与反馈
如果您在使用SDK过程中有任何问题与建议，请随时登录[开发者官网](https://open.oceanengine.com/labels) ，点击右下角的"咨询"按钮，与我们的客服支持人员联系

## 后续计划
1. 丰富各类场景示例
2. 推出其他语言的SDK