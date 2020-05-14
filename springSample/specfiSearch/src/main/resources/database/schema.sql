
#CREATE DATABASE spring DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
use spring

#====================================================
#
#====================================================

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

#====================================================
#
#====================================================


CREATE TABLE IF NOT EXISTS company(
    company_id INT PRIMARY KEY AUTO_INCREMENT,
    company_name VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS customer
(
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_code VARCHAR(30),
    company_id INT,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    FOREIGN KEY(company_id) REFERENCES company(company_id)
);

INSERT INTO company(company_name) VALUES('hogeCompany');
INSERT INTO company(company_name) VALUES('piyoCompany');

INSERT INTO customer(customer_code, company_id, first_name, last_name) VALUES('hogehoge', 1, 'hoge', 'hoge');
INSERT INTO customer(customer_code, company_id, first_name, last_name) VALUES('barbar', 1, 'bar', 'bar');
INSERT INTO customer(customer_code, company_id, first_name, last_name) VALUES('booboo', 1, 'boo', 'boo');
INSERT INTO customer(customer_code, company_id, first_name, last_name) VALUES('piyopiyo', 2, 'piyo', 'piyo');
