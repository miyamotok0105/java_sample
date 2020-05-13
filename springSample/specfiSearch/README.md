
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


CREATE TABLE member(
  id int(11) NOT NULL auto_increment,
  last_name VARCHAR(20) NOT NULL,
  first_name VARCHAR(20) NOT NULL,
  last_name_kana VARCHAR(30) NOT NULL,
  first_name_kana VARCHAR(30) NOT NULL,
  email VARCHAR(255) NOT NULL,
  tel VARCHAR(12) NOT NULL,
  address_level01 VARCHAR(30) NOT NULL,
  address_level02 VARCHAR(30) NOT NULL,
  address_line01 VARCHAR(50) NOT NULL,
  address_line02 VARCHAR(50) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO member (last_name, first_name, last_name_kana, first_name_kana, email, tel, address_level01, address_level02, address_line01, address_line02) VALUES('佐藤', '健', 'サトウ', 'タケル', 'takeru@gmail.com', '00087260000', '東京都', '第九地区', 'ドンジャラ市0-22-39', 'ライオンズコーポ102');
INSERT INTO member (last_name, first_name, last_name_kana, first_name_kana, email, tel, address_level01, address_level02, address_line01, address_line02) VALUES('鈴木', 'イチロー', 'スズキ', 'イチロー', 'ichiro@gmail.com', '01041567800', '大阪府', 'ゴメス市', 'セバスティック州2-12-32', '松庵202');
INSERT INTO member (last_name, first_name, last_name_kana, first_name_kana, email, tel, address_level01, address_level02, address_line01, address_line02) VALUES('高田', '善衛', 'タカダ', 'ゼンエイ', 'zennei@gmail.com', '12039860210', '沖縄県', 'ウーマ区', '救世観音市8-21-7', 'シーサーマンション101');
```

usernameとpasswordは環境に合わせて修正すること。



```:resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/sample
spring.datasource.username=member_admin
spring.datasource.password=Password$
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```

spring boot Appの実行で動いた。    



# 参考

https://ts0818.hatenablog.com/entry/2017/09/18/125115

