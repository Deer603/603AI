<p align="center">
  <img src="jadx-project/app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" width="112" alt="603AI应用图标">
</p>

<h1 align="center">603AI</h1>

<p align="center">四个角色，一间603寝室：把聊天、语录与日常灵感装进口袋。</p>

<p align="center">
  <a href="apktool-project/apktool.yml"><img src="https://img.shields.io/badge/version-1.0.0-E7B73C?style=flat-square" alt="版本1.0.0"></a>
  <a href="#运行要求"><img src="https://img.shields.io/badge/Android-8.0%2B-3DDC84?style=flat-square" alt="Android8.0及以上"></a>
  <a href="#工程结构"><img src="https://img.shields.io/badge/source-Apktool%20%2F%20JADX-555555?style=flat-square" alt="Apktool与JADX恢复工程"></a>
</p>

<p align="center">
  <a href="#主要功能">主要功能</a> ·
  <a href="#快速入门">快速入门</a> ·
  <a href="#工程结构">工程结构</a> ·
  <a href="#修改语料与界面">修改语料与界面</a>
</p>

603AI是一款Android角色聊天与语录应用。你可以选择困困、朴AI、龟龟或探戈，围绕生活、学习、技术和兴趣聊天，也可以浏览语录、收集喜欢的句子，进入3D寝室与角色互动。

回复由本地JSON语料、关键词匹配与角色话术组成，无需配置云端模型或API密钥。聊天中的检索、工具调用和思考步骤用于呈现回复过程；其中“联网比对”等文案属于展示效果。

此仓库整理的是APK源码恢复工程：`apktool-project`用于修改资源、Smali与重打包，`jadx-project`用于阅读反编译后的Java业务代码。

## 主要功能

- 四角色对话：切换角色，使用各自的语料、头像、问候与回复风格。
- 随机灵感：从角色语录库抽取内容，给日常聊天提供新话题。
- 语录库：搜索关键词、按主题筛选，并继续围绕一句语录提问。
- 收藏与分享：收藏喜欢的内容，复制句子，通过系统分享语录或当前对话。
- 603寝室：在本地3D场景中浏览寝室，点击角色进入对应对话。
- 今日一句与使用概览：查看每日语录、提问次数、随机灵感次数、连续使用天数与关注主题。
- 本地保存：无需账号，在设备上保存对话、收藏、所选角色和使用统计，也可清除全部数据。

| 角色 | 主要话题与风格 |
| --- | --- |
| 汇元AI（困困） | 认知、成长、创业、财富与生活思考，语气温和 |
| 朴AI | 电脑、Linux、音乐与日常兴趣，表达直接 |
| 龟龟AI | 养龟、RoboMaster、嵌入式、土家文化与日常交流 |
| Tango AI（探戈） | Linux、编程、游戏、美食与轻松闲聊 |

## 快速入门

### 运行要求

- 手机：Android8.0及以上，即API26及以上。
- 应用包名：`com.luchime.huiyuan`。
- 重打包：Java运行环境与Apktool，建议使用与工程对应的Apktool3.0.3。
- 签名和安装：Android SDK Build-Tools中的`zipalign`、`apksigner`，以及Platform-Tools中的`adb`。

将这些工具加入`PATH`，下面的命令均在仓库根目录执行。

### 1.重打包

```sh
mkdir -p dist
apktool b apktool-project -o dist/603AI-1.0.0-unsigned.apk
```

生成的APK需要对齐并签名后安装。

### 2.对齐与签名

准备自己的签名文件，并把下面的路径和别名替换为实际值。密码由`apksigner`交互询问。

```sh
zipalign -P 16 -f 4 \
  dist/603AI-1.0.0-unsigned.apk \
  dist/603AI-1.0.0-aligned.apk

apksigner sign \
  --ks signing/your-release.keystore \
  --ks-key-alias your-key-alias \
  --out dist/603AI-1.0.0.apk \
  dist/603AI-1.0.0-aligned.apk
```

签名文件由使用者自行提供，保存在仓库外或已忽略的目录。覆盖安装已有应用时，需要沿用原签名；更换签名需要先卸载旧应用，会清除设备上的应用数据。

### 3.安装与使用

连接开启USB调试的Android设备，执行：

```sh
adb install -r dist/603AI-1.0.0.apk
```

打开“603AI”，选择一个角色，输入问题或点击推荐话题。通过底部导航进入“寝室”“语录”“收藏”和“我的”，体验角色互动、语录筛选与数据分享。

## 工程结构

```text
603AI/
├── apktool-project/              # 资源、Smali与重打包工程
│   ├── AndroidManifest.xml      # 应用标识与权限声明
│   ├── apktool.yml              # 应用版本、SDK与Apktool工程配置
│   ├── assets/                  # 角色语料与603寝室资源
│   ├── res/                     # 图标、主题与其他Android资源
│   ├── lib/                     # 原生库
│   └── smali…/                  # 各DEX对应的Smali代码
├── jadx-project/                 # 结构化Java阅读工程
│   └── app/src/main/
│       ├── java/com/luchime/huiyuan/
│       ├── assets/
│       ├── res/
│       └── AndroidManifest.xml
├── source-alternatives/
│   └── simple-business/         # 备选业务反编译代码
├── .gitignore
└── README.md
```

JADX工程保留Android项目目录和Gradle配置，依赖声明仍为`TODO`，没有Gradle Wrapper。适合在编辑器或AndroidStudio中阅读，若要恢复为常规Java/Kotlin构建工程，需要补全依赖并修复反编译代码。需要生成APK时，使用上面的Apktool路径。

## 修改语料与界面

角色配置位于两套工程各自的`assets`目录：

| 文件 | 内容 |
| --- | --- |
| `huiyuan_engine.json` | 困困的主题语录与回复配置 |
| `piaoai_engine.json` | 朴AI的语料与回复配置 |
| `guigui_engine.json` | 龟龟的语料与回复配置 |
| `tango_engine.json` | 探戈的语料与回复配置 |
| `corpus_blueprints.json` | 主题、关键词与语料扩展模板 |
| `room603/index.html` | 3D寝室场景及交互 |

基础语录使用以下结构，`cat`为分类，`keys`为匹配关键词，`text`为展示内容：

```json
{
  "cat": "成长",
  "keys": ["学习", "练习", "进步"],
  "text": "把一个大目标拆成今天能完成的小动作。"
}
```

准备重打包时，修改`apktool-project/assets/`和`apktool-project/res/`中的对应文件。若同时维护Java阅读工程，同步更新`jadx-project/app/src/main/`中的同名资源。

业务代码入口位于`jadx-project/app/src/main/java/com/luchime/huiyuan/`：

- `MainActivity.java`：应用启动入口。
- `HuiyuanEngine.java`：语料加载、关键词匹配、角色话术与随机语录。
- `CorpusExpander.java`、`PersonaCorpusExpander.java`：主题语料扩展。
- `AppRepository.java`：本地对话、收藏、角色选择与统计保存。
- `ui/`：聊天、寝室、语录、收藏和个人页面。

修改逻辑并走Apktool重打包时，需要同步修改对应的Smali；仅修改JADX生成的Java文件不会改变重打包后的应用。

## 源码包与许可

`1.0.0`源码ZIP包含两套工程、备选业务代码、`.gitignore`与本说明。旧APK、日志、构建缓存、签名密钥及历史分析资料均不纳入源码包，原始资料保留在本机。

当前仓库没有项目级许可证。应用代码、角色素材与第三方组件的授权需分别确认，不能由本README推定统一授权。
