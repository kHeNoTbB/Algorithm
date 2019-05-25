### 1. SQL 기본

* SQL(Structured Query Language, 구조화된 질의 언어)문은 데이터베이스에서 사용되는 일종의 공통언어다. DBMS에게는 SQL 문으로 질문하고 명령을 지시해야만 DBMS가 알아듣고 작업을 수행한 후 그 결과 값을 우리에게 준다. 
* SQL은 일반적으로 대소문자를 구분하지 않는다. 하지만, 여러가지 면에서 전체 대문자 또는 소문자 등으로 통일하는 것이 구문을 읽기 쉽게 하여, MySQL의 성능에도 약간 도움이 된다.
* SQL문은 크게 DML, DDL, DCL로 분류한다.

### 2. DML, Data Manipulation Language: 데이터 조작 언어
* 데이터를 조작(SELECT선택, INSERT삽입, UPDATE수정, DELETE삭제)하는 데 사용되는 언어이다. DML 구문이 사용되는 대상은 테이블의 행이다. 그러므로 DML을 사용하기 위해서는 꼭 그 이전에 테이블이 정의되어 있어야 한다.
* 트랜잭션을 발생시킨다. 따라서 실제 테이블에 완전히 적용하지 않고, 임시로 적용시키므로 취소시킬 수 있게 해준다. 되돌림(ROLLBACK) / 완전적용(COMMIT)

#### 1) SELECT 문

&nbsp;&nbsp;&nbsp;&nbsp;(1) SELECT FORM WHRER

&nbsp;&nbsp;&nbsp;&nbsp;(2) BETWEEN...AND  /   IN   /   LIKE

&nbsp;&nbsp;&nbsp;&nbsp;(3) 서브쿼리

&nbsp;&nbsp;&nbsp;&nbsp;(4) ORDER BY

&nbsp;&nbsp;&nbsp;&nbsp;(5) DISTINCT

&nbsp;&nbsp;&nbsp;&nbsp;(6) LIMIT

&nbsp;&nbsp;&nbsp;&nbsp;(7) CREATE TABLE .. SELECT

&nbsp;&nbsp;&nbsp;&nbsp;(8) GROUP BY

&nbsp;&nbsp;&nbsp;&nbsp;(9) HAVING

&nbsp;&nbsp;&nbsp;&nbsp;(10) 집계함수 AVG, MIN, MAX, COUNT, COUNT(DISTINCT), STDEV, VAR_SAMP

&nbsp;&nbsp;&nbsp;&nbsp;(11) ROLLUP

#### 2) INSERT

#### 3) UPDATE

#### 4) DELETE


### 3. DDL, Data Definition Language: 데이터 정의 언어
* 데이터베이스, 테이블, 뷰, 인덱스 등의 데이터베이스 개체를 (CREATE생성, DROPT삭제, ALTER변경)하는 역할을 한다.
* 트랜잭션을 발생시키지 않는다. 즉, 실행 즉시 적용된다.

### 4. DCL, Data Control Language: 데이터 제어 언어
* 사용자에게 어떤 권한을 부여하거나 빼앗을 때 주로 사용하는 구문이다.
* GRANT / REVOKE / DENY
