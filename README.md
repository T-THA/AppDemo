# FinalProject

***NJU TTHA***

## 介绍

本仓库为百度暑期课程大作业项目，项目开发了一个以搜索、浏览+信息流为主要功能的APP。

## 软件介绍

### 软件架构

软件采取分层架构：
- 业务逻辑层(java)
- 持久层(assets)
- 资源层(res)
- 配置管理等等

### 项目结构
```
├─assets
├─java
│  └─com
│      └─TTHA
│          └─demo
│              ├─news
│              ├─ui
│              │  └─theme
│              ├─video
│              ├─activity
│              └─weather
└─res
    ├─anim
    ├─drawable
    ├─layout
    ├─mipmap
    ├─raw
    ├─values
    └─xml
```

项目主体结构如上，Activity对应各个页面的活动，demo目录下的其他内容为一些工具类，ui目录下为各个页面的布局，news、video、weather目录下处理了各个页面的业务逻辑。

资源存放在assets和res目录下，assets目录下存放了一些网页资源，res目录下存放了一些图片、动画、布局等资源。

### 项目功能

大作业要求中的基础部分均已完成，进阶的要求部分也有一些实现，下面做简要介绍。

#### 搜索

可以通过主页搜索框进行搜索，在APP内可以直接跳转到百度页面。

#### 天气

天气部分使用静态的假数据，可以通过点击主页的天气卡片跳转到天气页面，实现了可查看每小时天气情况的滑动窗口。

#### 新闻

新闻部分同样也是使用静态的假数据，主页可以滑动查看新闻，点击新闻可以进入新闻详情页。

对于新闻上传的部分，暂不支持对数据库的操作，但是可以在新闻上传页面进行简单的信息填入和获取摄像头等。

#### 视频

视频部分使用了静态的视频数据，可以通过主页的视频卡片跳转到视频页面，视频窗口可无限滑动，点击视频可以进入视频详情页。

## 安装教程

### 自行编译

克隆项目后可自行在本地完成编译构建

### 下载APK

在本仓库的release目录中可以下载已经打包好的APK文件

