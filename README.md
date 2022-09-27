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
	stadium_name VARCHAR(50)
	created_at TIMESTAMP
);
-- 팀 테이블 --
CREATE TABLE team(
	id INT PRIMARY KEY AUTO_INCREMENT,
	stadium_name VARCHAR(50),
	team_name VARCHAR(50),
	created_at TIMESTAMP
);
-- 선수 테이블 --
CREATE TABLE player(
	id INT PRIMARY KEY AUTO_INCREMENT,
	team_name VARCHAR(50),
	player_name varchar(20),
	posi VARCHAR(10),
	is_out BOOL,
	created_at TIMESTAMP
);

-- UTF8 설정 --
ALTER TABLE stadium CONVERT TO CHARACTER SET UTF8;
ALTER TABLE player CONVERT TO CHARACTER SET UTF8;
ALTER TABLE team CONVERT TO CHARACTER SET UTF8;
```

### 더미 데이터 추가
```sql
-- 더미 데이터 추가 --

INSERT INTO stadium(stadium_name,created_at) VALUES("구덕야구장", NOW());
INSERT INTO stadium(stadium_name,created_at) VALUES("사직야구장", NOW());
INSERT INTO stadium(stadium_name,created_at) VALUES("잠실야구장", NOW());

INSERT INTO team(stadium_name, team_name, created_at) VALUES("구덕야구장", "NC 다이노스", NOW());
INSERT INTO team(stadium_name, team_name, created_at) VALUES("사직야구장", "롯데 자이언츠", NOW());
INSERT INTO team(stadium_name, team_name, created_at) VALUES("잠실야구장", "두산 베어스", NOW());


INSERT INTO player(team_name, player_name, posi, is_out, created_at) VALUES("NC 다이노스", "이태양", "투수",0, NOW());
INSERT INTO player(team_name, player_name, posi, is_out, created_at) VALUES("롯데 자이언츠", "이대호", "1루수",0,  NOW());
INSERT INTO player(team_name, player_name, posi, is_out, created_at) VALUES("두산 베어스", "유희관", "투수",0, NOW());
```
