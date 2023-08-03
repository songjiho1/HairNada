# HairNada
스프링부트 + 헤어, 미용실 및 병원 추천 사이트

## 🖥️ 프로젝트 소개
LUSH를 참고하여 퍼블리싱 한 헤어스타일 관련 사이트 입니다.

## 🕰️ 개발 기간
2022.06.07 ~ 2022.07.21

### ⚙️ 개발 환경
- `Java 8`
- `JDK 1.8.0`
- **IDE** : STS 3.9
- **Framework** : Springboot(2.x)
- **Database** : Oracle DB(11xe)
- **ORM** : Mybatis

## ✋ 내가 담당한 페이지
### 로그인 - <a href="https://github.com/songjiho1/HairNada/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Login)" >상세보기 - WIKI 이동</a>
* DB값 검증
* 계정찾기(smtp)
* 로그인 시 쿠키(Cookie) 및 세션(Session) 생성
### 계정찾기 - <a href="https://github.com/songjiho1/HairNada/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Login)" >상세보기 - WIKI 이동</a>
* SMTP API 연동
* 이름 이메일 DB값 검증
### 회원가입 - <a href="https://github.com/songjiho1/HairNada/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Member)">상세보기 - WIKI 이동</a>
* 주소 API 연동
* ID 중복 체크
* 닉네임 중복 체크
* 비밀번호 유효성 검사
### 회원정보 수정 - <a href="https://github.com/songjiho1/HairNada/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Member)">상세보기 - WIKI 이동</a>
* 회원정보 변경
* 닉네임 중복 체크
* 비밀번호 유효성 검사
* 프로필 사진 파일 처리
### 등급신청 - <a href="https://github.com/songjiho1/HairNada/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Member)">상세보기 - WIKI 이동</a>
* 자격증 사진 파일 처리
### 작성글 - <a href="https://github.com/songjiho1/HairNada/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Member2)">상세보기 - WIKI 이동</a>
* 작성글 리스트
* 작성글 좋아요 처리
* 리스트 페이징 처리
* 좋아요 & 댓글 수 노출
### 좋아요 - <a href="https://github.com/songjiho1/HairNada/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Member2)">상세보기 - WIKI 이동</a>
* 좋아요 리스트
* 카테고리별 리스트
* 리스트 페이징 처리
* 좋아요 처리
### 장바구니 - <a href="https://github.com/songjiho1/HairNada/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Member3)">싱세보기 - WIKI 이동</a>
* 장바구니 리스트
* 체크박스로 구매할 제품 선택
* 제품 수량 증가 감소
### 구매내역 - <a href="https://github.com/songjiho1/HairNada/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Member3)">싱세보기 - WIKI 이동</a>
* 구매내역 리스트
* 현재상태 실시간 변경
* 기간별 구매내역 조회
* 카테고리별 구매내역 조회
### 얼굴형 테스트 - <a href="https://github.com/songjiho1/HairNada/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(TestPage)">상세보기 - WIKI 이동</a>
* 얼굴형 태스트
* 경우의 수 계산
* 얼굴형별 헤어스타일 추천
