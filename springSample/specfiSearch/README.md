
# 作成手順

```
gradle6.3
java11
spring2.2
```


## フォルダ作成

```
controller
entity
repository
service
のフォルダを作成

```

## ファイル作成

```
controllerを作成。
entityはインターフェースにSerializableを指定して作成。
repositoryは
JpaRepository
JpaSpecificationExecutor
をインターフェースに指定して作成。
serviceを作成。
htmlを作成。
```


## DB整備

```
mysql -u root -p
CREATE DATABASE spring DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
use spring


resourcesの中のdatabase/schema.sqlを実行すること。
```

usernameとpasswordは環境に合わせて修正すること。



```:resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/sample
spring.datasource.username=member_admin
spring.datasource.password=Password$
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```


spring boot Appの実行で動いた。    


## mail送る

```
sudo postfix start
```



# 参考


https://ts0818.hatenablog.com/entry/2017/09/18/125115

where and orのサンプル
company, customer
https://qiita.com/ksh-fthr/items/44ecc0550a77f4280ea7


書籍

```
Eclipseで学ぶはじめてのJava 第4版
Eclipse 4.5ではじめるJavaプログラミング入門 Eclipse 4.5 Mars対応
Java本格入門 ～モダンスタイルによる基礎からオブジェクト指向・実用ライブラリまで

EclipseではじめるJavaフレームワーク入門 第5版 Maven/Gradle対応
JavaエンジニアのためのEclipse パーフェクトガイド
JavaデベロッパーのためのEclipse完全攻略

バグがないプログラムのつくり方 JavaとEclipseで学ぶTDDテスト駆動開発
```
