Kotlin/Native Multiplatform プロジェクト (MPP) を用いた Android/iOS ライブラリのサンプルプロジェクト

## Usage

Android Studio で `kotlin-multiplatform/build.gradle` をプロジェクトとして開き、 `android` プロジェクトを実行すると Android アプリが起動します。

Xcode で `ios.swift/MultiplatformHost.xcodeproj` を開いて実行すると iOS アプリが起動します。

このプロジェクトは [Kotlin/Native Multiplatform プロジェクトで Android/iOS 向けの共通ライブラリを作る](https://qiita.com/irgaly/items/eebd1273b38e1e671fcf) で解説しています。

## Project Structure

| ディレクトリ | 内容 |
| --- | --- |
| kotlin-multiplatform | |
| ├ android | Android アプリプロジェクト (ライブラリ動作確認用アプリ) |
| ├ ios.swift | Xcode プロジェクト (ライブラリ動作確認用アプリ) |
| ├ library | Kotlin/Native Multiplatform プロジェクト |
| │   ├ build.gradle | Kotlin/Native Multiplatform ビルド構成 |
| │   ├ android.gradle | Android Library ビルド構成 |
| │   ├ src/commonMain | Kotlin/Native Common Kotlin sourceSet |
| │   ├ src/android | Android Library 向け Kotlin sourceSet |
| │   ├ src/iosMain | Kotlin/Native iOS Framework 向け Kotlin sourceSet |
| └ ... | |

## Version

* Kotlin 1.3.0-rc-131
    * Kotlin/Native 1.3.0-rc-131 (0.9.3)

## Environment

Mac

```
macOS Mojave
10.14（18A384a）
```

Android Studio

```
Android Studio 3.2.1
Build #AI-181.5540.7.32.5056338, built on October 9, 2018
JRE: 1.8.0_152-release-1136-b06 x86_64
JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
macOS 10.14
```

Xcode

```
Version 10.0 (10A255)
```

