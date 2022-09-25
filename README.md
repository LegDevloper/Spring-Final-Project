# Spring-Final-Project


### DB세팅
``` SQL
create user 'green'@'%' identified by 'bitc5600';
GRANT ALL PRIVILEGES ON *.* TO 'green'@'%';
create database final;
use final;
```

### 테이블 생성
``` sql

-- 경기장 테이블 --
CREATE TABLE stadium(
	id INT PRIMARY KEY AUTO_INCREMENT,
	stadiumName VARCHAR(50) UNIQUE,
	createdAT TIMESTAMP
);
-- 팀 테이블 --
CREATE TABLE team(
	id INT PRIMARY KEY AUTO_INCREMENT,
	stadiumName VARCHAR(50),
	teamName VARCHAR(50) NOT NULL,
	createdAt TIMESTAMP
);
-- 선수 테이블 --
CREATE TABLE player(
	id INT PRIMARY KEY AUTO_INCREMENT,
	teamName VARCHAR(50),
	playerName varchar(20) NOT NULL,
	POSITION VARCHAR(10),
	createdAt TIMESTAMPfinal
);
-- 방출선수 테이블 --
CREATE TABLE kickout(
	id INT PRIMARY KEY AUTO_INCREMENT,
	teamName VARCHAR(50),
	playerName VARCHAR(20) NOT NULL,
	reason VARCHAR(50) NOT NULL,
	createdAt TIMESTAMP
);

-- UTF8 설정 --
ALTER TABLE stadium CONVERT TO CHARACTER SET UTF8;
ALTER TABLE player CONVERT TO CHARACTER SET UTF8;
ALTER TABLE team CONVERT TO CHARACTER SET UTF8;
ALTER TABLE kickout CONVERT TO CHARACTER SET UTF8;
```

### 더미 데이터 추가
```sql
INSERT INTO stadium(NAME,createdAt) VALUES("구덕야구장", NOW());
INSERT INTO stadium(NAME,createdAt) VALUES("사직야구장", NOW());
INSERT INTO stadium(NAME,createdAt) VALUES("잠실야구장", NOW());

INSERT INTO team(stadiumName, teamName, createdAt) VALUES("구덕야구장", "NC 다이노스", NOW());
INSERT INTO team(stadiumName, teamName, createdAt) VALUES("사직야구장", "롯데 자이언츠", NOW());
INSERT INTO team(stadiumName, teamName, createdAt) VALUES("잠실야구장", "두산 베어스", NOW());
```
