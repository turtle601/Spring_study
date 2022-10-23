# Spring Study

## 👏 목표
- Spring과 백엔드에 대한 전반적인 이해
- Spring을 이용하여 CRUD 프로그램 작성

### 목차
1. DI(의존성 주입)에 대해서
2. Life Cycle(생명주기)에 대해서
3. 어노테이션을 통한 스프링 설정
4. Spring MVC
5. 세션, 쿠키
6. JdbcTemplate, Connection Pool

### 사용한 기술
- java
- spring
- maven
- oracle db

## ✌ 각 프로젝트 설명
### 1. creatingPjt 
- pom.xml 등 스프링에 필요한 다양한 설정 등을 기입하고 스프링으로 만든 웹 어플리케이션을 실행

### 2. Coffe 
- 스프링의 핵심인 DI(의존성 주입)이 적용된 프로젝트를 작성해보고 DI의 중요성과 필요성에 대해 알게 되었다. 

### 3. springBean
- 스프링 Life Cycle(생명주기)에 대해 알아보고 대표적인 Spring Bean Scope인 싱글톤과 프로토 타입에 대해 알아보았다. 

### 4. login
- Spring MVC 구조에 따라 회원가입한 회원 목록들을 oracle DB에 넣고 DB에 있는 회원 목록과 일치할 시 로그인을 시키는 프로젝트이다. 
- 이때, 세션을 통해 로그아웃 하지 않을 시 로그인 과정이 유지되도록하였다. 

## 🎉 login 프로젝트 결과화면
### home
![](https://images.velog.io/images/turtle601/post/b40576d0-e976-4381-ab5d-e56b4ec8b079/home.PNG)
### 회원가입 창(joinForm.jsp)
![](https://images.velog.io/images/turtle601/post/7abeb953-ed60-4bbd-a885-34eaf0128006/%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85%20%EC%B0%BD.PNG)
### 회원가입 성공(joinOk.jsp)
![](https://images.velog.io/images/turtle601/post/e730ed6b-3141-46cd-bbe3-31667dd49f79/%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85%20%EC%84%B1%EA%B3%B5!.PNG)
### 회원가입 후 로그인
![](https://images.velog.io/images/turtle601/post/edd05503-0eb9-43c8-8edb-de8bd8da128b/%EB%A1%9C%EA%B7%B8%EC%9D%B8%20%ED%9B%84%20%ED%99%94%EB%A9%B4.PNG)
### 수정(modifyForm.jsp)
![](https://images.velog.io/images/turtle601/post/f6446805-348e-4d37-b651-55cbeac7f4d5/%EC%88%98%EC%A0%95.PNG)
### 수정 완료(modifyOk.jsp)
![](https://images.velog.io/images/turtle601/post/a054f062-93e1-4346-ae8a-bf6f9390df58/%EC%88%98%EC%A0%95%20%EC%84%B1%EA%B3%B5!.PNG)
### 삭제(removeForm.jsp)
![](https://images.velog.io/images/turtle601/post/6864d314-60e0-4416-a522-6b4622c7a047/%EC%82%AD%EC%A0%9C.PNG)
### 삭제 완료(removeOk.jsp)
![](https://images.velog.io/images/turtle601/post/2281fdb5-5b9b-42a7-8caa-5db7813c3327/%EC%82%AD%EC%A0%9C%20%EC%84%B1%EA%B3%B5.PNG)
### 삭제 성공 후 화면
![](https://images.velog.io/images/turtle601/post/5ac4a566-c53b-407b-bfbd-767e07aa9fc6/%EC%82%AD%EC%A0%9C%20%EC%84%B1%EA%B3%B5%20%ED%9B%84%20%ED%99%94%EB%A9%B4.PNG)

- 그 외 페이지가 변함에 따라 로그인 상태를 유지하기 위해 session을 적용하였습니다.
---
### 참고 강의 자료
https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC_renew#curriculum

