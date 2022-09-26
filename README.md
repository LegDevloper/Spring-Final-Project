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

-- Table Creat -- 

-- 경기장 테이블 --
CREATE TABLE stadium(
	id INT PRIMARY KEY AUTO_INCREMENT,
	stadiumName VARCHAR(50)
	createdAT TIMESTAMP
);
-- 팀 테이블 --
CREATE TABLE team(
	id INT PRIMARY KEY AUTO_INCREMENT,
	stadiumName VARCHAR(50),
	teamName VARCHAR(50),
	createdAt TIMESTAMP
);
-- 선수 테이블 --
CREATE TABLE player(
	id INT PRIMARY KEY AUTO_INCREMENT,
	teamName VARCHAR(50),
	playerName varchar(20),
	posi VARCHAR(10),
	is_out BOOL,
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
-- 더미 데이터 추가 --

INSERT INTO stadium(stadiumName,createdAt) VALUES("구덕야구장", NOW());
INSERT INTO stadium(stadiumName,createdAt) VALUES("사직야구장", NOW());
INSERT INTO stadium(stadiumName,createdAt) VALUES("잠실야구장", NOW());

INSERT INTO team(stadiumName, teamName, createdAt) VALUES("구덕야구장", "NC 다이노스", NOW());
INSERT INTO team(stadiumName, teamName, createdAt) VALUES("사직야구장", "롯데 자이언츠", NOW());
INSERT INTO team(stadiumName, teamName, createdAt) VALUES("잠실야구장", "두산 베어스", NOW());


INSERT INTO player(teamName, playerName, posi, is_out, createdAt) VALUES("NC 다이노스", "이태양", "투수",0, NOW());
INSERT INTO player(teamName, playerName, posi, is_out, createdAt) VALUES("롯데 자이언츠", "이대호", "1루수",0,  NOW());
INSERT INTO player(teamName, playerName, posi, is_out, createdAt) VALUES("두산 베어스", "유희관", "투수",0, NOW());
```
