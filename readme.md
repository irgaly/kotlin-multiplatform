Kotlin/Native Multiplatform を用いた Android/iOS ライブラリのサンプルプロジェクト

## Usage

Android Studio で `kotlin-multiplatform/build.gradle` をプロジェクトとして開き、 `android` モジュールを実行すると Android アプリが起動します。

Xcode で `ios.swift/MultiplatformHost.xcodeproj` を開いて実行すると iOS アプリが起動します。

## Project Structure

| ディレクトリ | 内容 |
| --- | --- |
| kotlin-multiplatform | |
| ├ android | Android アプリプロジェクト (ライブラリ動作確認用アプリ) |
| ├ ios.swift | Xcode プロジェクト (ライブラリ動作確認用アプリ) |
| ├ common | Kotlin/Native Common モジュール |
| ├ platform.android | Kotlin/Native Platform Android モジュール (Android Library プロジェクト形式) |
| ├ platform.ios | Kotlin/Native Platform iOS モジュール |
| └ ... | |

## Environment

Mac

```
macOS High Sierra
10.13.4（17E199）
```

Android Studio

```
Android Studio 3.1
Build #AI-173.4670197, built on March 22, 2018
JRE: 1.8.0_152-release-1024-b01 x86_64
JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
Mac OS X 10.13.3
```

Xcode

```
Version 9.3 (9E145)
```

