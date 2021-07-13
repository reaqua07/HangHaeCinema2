## 🎥 항해 시네마


1. [✏️ 프로젝트 소개 ](#-프로젝트-소개)
2. [📽 서비스 기능](#-서비스-기능)
3. [ 📺 API 설계](#-API-설계)
    - [💾로그인/회원가입](#-로그인/회원가입)
    - [🎬영화](#-영화)
    - [📃리뷰](#-리뷰)
    - [❤️좋아요](#-좋아요)
4. [🦁개발타임라인](#-개발타임라인)

ʕ•̫͡ʕ•̫͡ʕ•̫͡•ʔ•̫͡•ʔ•̫͡•ʔ

## ✏️프로젝트 소개

- 영화 상세 및 리뷰 정보를 보여주는 웹사이트

### 📆 기간

- 2021년 07월 09일 ~ 2021년 7월 15일

### 👍 팀원

- 🐔 허동우	(Front-end)
- 🐸🦔 곽신영	(Front-end)
- 🐏 김진태	(Back-end)
- 🦑박연우	(Back-end)
- 🦨전승운  (Back-end)


##  📽 서비스 기능

- 리뷰 좋아요 갯수를 기반으로 영화 목록을 보여줌
- 좋아요 갯수를 기반으로 리뷰 목록을 보여줌
- 영화 이미지 hover 시 영화 제목 및 간단한 영화 정보를 보여줌
- 각 영화 이미지 클릭 시 영화 상세 정보(장르, 런타임, 별점 등) 및 리뷰 목록을 보여줌
- 로그인 회원에 한하여 영화 리뷰 작성 및 회원 정보 수정 가능



## 📺 API 설계

̿̿ ̿’̿’̵͇̿̿з=༼ ▀̿̿Ĺ̯̿̿▀̿ ̿ ༽



* #### 💾 로그인/회원가입

| 기능               | method | URL               | 작업현황 |
| ------------------ | ------ | ----------------- | -------- |
| 회원가입           | POST   | /signup           | ❌        |
| 회원 중복 확인하기 | get    | /signup/{email}   | ❌        |
| 회원 정보 수정하기 | put    | /user/update/{id} | ❌        |
| 로그인             | POST   | /login            | ❌        |
| 로그아웃           |        | /logout           | ❌        |

* #### 🎬 영화

| 기능               | method | URL     | 반환 |
| ------------------ | ------ | ------- | ---- |
| 영화 목록 크롤링   | GET    |         | ❌    |
| 영화 목록 불러오기 | GET    | /movies | ❌    |

* #### 📃 리뷰

| 기능               | method | URL                      | 반환 |
| ------------------ | ------ | ------------------------ | ---- |
| 리뷰 작성하기      | POST   | /api/reviews             | ❌    |
| 리뷰 목록 불러오기 | GET    | /api/reviews/{id}        | ❌    |
| 리뷰 수정하기      | PUT    | /api/reviews/update/{id} | ❌    |
| 리뷰 삭제하기      | PUT    | /api/reviews/delete/{id} | ❌    |

* #### ❤️ 좋아요

| 기능                 | method | URL            | 반환 |
| -------------------- | ------ | -------------- | ---- |
| 좋아요 갯수 가져오기 | GET    | /api/like/{id} | ❌    |
| 좋아요 누르기        | POST   | /api/like/{id} | ❌    |
| 좋아요 취소하기      | DELETE | /api/like/{id} | ❌    |



## 🦁 개발타임라인

| 일자       | 진행 목록                                                    |
| ---------- | ------------------------------------------------------------ |
| 2021.07.09 | 프로젝트 설계(주제 선정, 목표 설정, 와이어프레임 작성, 테이블 작성, API 작성 프론트/백엔드 Repository 생성 |
| 2021.07.10 | 네이버 영화 사이트 크롤링 구현.                                                             |
| 2021.07.11 | 크롤링 코드 리팩토링                                                              |
|            |                                                              |
|            |                                                              |
|            |                                                              |
|            |                                                              |
|            |                                                              |
|            |                                                              |