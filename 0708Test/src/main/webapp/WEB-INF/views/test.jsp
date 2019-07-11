<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">

<head>
  <meta charset="utf-8" />
</head>
    <body>
    나이 :
    <select name="age">
      <option value="20">20</option>
      <option value="21">21</option>
      <option value="22">22</option>
      <option value="23">23</option>
      <option value="24">24</option>
      <option value="25">25</option>
      <option value="26">26</option>
      <option value="27">27</option>
      <option value="28">28</option>
      <option value="29">29</option>
    </select>
    <br>

    성별 :
    <select name="sex">
      <option value="1">남성</option>
      <option value="2">여성</option>
    </select>
    <br>

    거주시도 :
    <select name="sido">
      <option value="1">서울</option>
      <option value="2">부산</option>
      <option value="3">대구</option>
      <option value="4">인천</option>
      <option value="5">광주</option>
      <option value="6">대전</option>
      <option value="7">울산</option>
      <option value="8">경기</option>
      <option value="9">강원</option>
      <option value="10">충북</option>
      <option value="11">충남</option>
      <option value="12">전북</option>
      <option value="13">전남</option>
      <option value="14">경북</option>
      <option value="15">경남</option>
      <option value="16">제주</option>
    </select>
    <br>

    직업 :
    <select name="job_group">
      <option value="1">대학생</option>
      <option value="2">직장인</option>
      <option value="3">무직</option>
      <option value="4">군인</option>
      <option value="999">기타</option>
    </select>
    <br>

    여행월 :
    <select name="month">
      <option value="1">1월</option>
      <option value="2">2월</option>
      <option value="3">3월</option>
      <option value="4">4월</option>
      <option value="5">5월</option>
      <option value="6">6월</option>
      <option value="7">7월</option>
      <option value="8">8월</option>
      <option value="9">9월</option>
      <option value="10">10월</option>
      <option value="11">11월</option>
      <option value="12">12월</option>
    </select>
    <br>

    당일/숙박여행 :
    <select name="q1">
      <option value="1">당일여행</option>
      <option value="2">숙박여행</option>
    </select>
    <br>

    여행일 : <input type="number" name="q2_c_2" placeholder="여행일을 입력하세요."> <br>

    여행 정보 주요 획득지
    <br>
    <input type="checkbox" name="q4_1" value="1">여행사
    <input type="checkbox" name="q4_2" value="2">가족/친지
    <input type="checkbox" name="q4_3" value="3">친구/동료
    <input type="checkbox" name="q4_4" value="4">인터넷
    <input type="checkbox" name="q4_5" value="5">관광 안내 서적
    <input type="checkbox" name="q4_6" value="6">기사 및 방송프로그램
    <input type="checkbox" name="q4_7" value="7">광과
    <input type="checkbox" name="q4_8" value="8">과거 방문경험
    <input type="checkbox" name="q4_9" value="9">스마트폰 등 모바일 앱
    <input type="checkbox" name="q4_10" value="10">기타
    <input type="checkbox" name="q4_11" value="11">없음
    <br>

    일행 존재 :
    <select name="q5">
      <option value="1">예</option>
      <option value="2">아니요</option>
    </select>
    <br>

    여행한 광역시/도 :
    <select name="q6_1">
      <option value="911">서울</option>
      <option value="921">부산</option>
      <option value="922">대구</option>
      <option value="923">인천</option>
      <option value="924">광주</option>
      <option value="925">대전</option>
      <option value="926">울산</option>
      <option value="931">경기</option>
      <option value="932">강원</option>
      <option value="933">충북</option>
      <option value="934">충남</option>
      <option value="935">전북</option>
      <option value="936">전남</option>
      <option value="937">경북</option>
      <option value="938">경남</option>
      <option value="939">제주</option>
    </select>
    <br>

    여행지 선택이유
    <br>
    <input type="checkbox" name="q6_3_1" value="1">여행지 지명도
    <input type="checkbox" name="q6_3_2" value="2">볼거리 제공
    <input type="checkbox" name="q6_3_3" value="3">저렴한 여행경비
    <input type="checkbox" name="q6_3_4" value="4">이동거리
    <input type="checkbox" name="q6_3_5" value="5">여행할 수 있는 시간
    <input type="checkbox" name="q6_3_6" value="6">숙박시설
    <input type="checkbox" name="q6_3_7" value="7">여행동반자 유형
    <input type="checkbox" name="q6_3_8" value="8">쇼핑
    <input type="checkbox" name="q6_3_9" value="9">음식
    <input type="checkbox" name="q6_3_10" value="10">교통편
    <input type="checkbox" name="q6_3_11" value="11">체험프로그램 유무
    <input type="checkbox" name="q6_3_12" value="12">경험자의 추천
    <input type="checkbox" name="q6_3_13" value="13">관광지 편의시설
    <input type="checkbox" name="q6_3_14" value="14">교육성
    <input type="checkbox" name="q6_3_15" value="15">기타
    <br>

    주요 이동(교통수단)
    <br>
    <input type="checkbox" name="q6_4_1" value="1">자가용
    <input type="checkbox" name="q6_4_2" value="2">철도
    <input type="checkbox" name="q6_4_3" value="3">항공기
    <input type="checkbox" name="q6_4_4" value="4">선박/해상교통
    <input type="checkbox" name="q6_4_5" value="5">지하철
    <input type="checkbox" name="q6_4_6" value="6">(정기)고속/시외버스
    <input type="checkbox" name="q6_4_7" value="7">(부정기)전세/관광버스
    <input type="checkbox" name="q6_4_8" value="8">차량대여/렌트
    <input type="checkbox" name="q6_4_9" value="9">자전거
    <input type="checkbox" name="q6_4_10" value="10">기타
    <br>

    숙박시설
    <br>
    <input type="checkbox" name="q6_5_1" value="1">숙박하지 않음
    <input type="checkbox" name="q6_5_2" value="2">호텔
    <input type="checkbox" name="q6_5_3" value="3">콘도미니엄
    <input type="checkbox" name="q6_5_4" value="4">유스호스텔
    <input type="checkbox" name="q6_5_5" value="5">모텔/여관
    <input type="checkbox" name="q6_5_6" value="6">펜션
    <input type="checkbox" name="q6_5_7" value="7">민박
    <input type="checkbox" name="q6_5_8" value="8">야영
    <input type="checkbox" name="q6_5_9" value="9">자연휴양림
    <input type="checkbox" name="q6_5_10" value="10">가족/친지
    <input type="checkbox" name="q6_5_11" value="11">연수원/수련원
    <input type="checkbox" name="q6_5_12" value="12">전통한옥숙박시설
    <input type="checkbox" name="q6_5_13" value="13">기타
    <br>

    여행지에서의 활동
    <br>
    <input type="checkbox" name="q6_6_1" value="1">자연 및 풍경 감상
    <input type="checkbox" name="q6_6_2" value="2">음식관광
    <input type="checkbox" name="q6_6_3" value="3">야외 위락/스포츠 활동
    <input type="checkbox" name="q6_6_4" value="4">역사유적지 방문
    <input type="checkbox" name="q6_6_5" value="5">테마파크/놀이시설
    <input type="checkbox" name="q6_6_6" value="6">휴식/휴양
    <input type="checkbox" name="q6_6_7" value="7">온천/휴양
    <input type="checkbox" name="q6_6_8" value="8">쇼핑
    <input type="checkbox" name="q6_6_9" value="9">문화예술/공연/전시시설
    <input type="checkbox" name="q6_6_10" value="10">스포츠 경기 관람
    <input type="checkbox" name="q6_6_11" value="11">축제/이벤트
    <input type="checkbox" name="q6_6_12" value="12">교육/체험 프로그램
    <input type="checkbox" name="q6_6_13" value="13">종교/성지순례
    <input type="checkbox" name="q6_6_14" value="14">갬블링
    <input type="checkbox" name="q6_6_15" value="15">시티투어
    <input type="checkbox" name="q6_6_16" value="16">드라마 촬영지
    <input type="checkbox" name="q6_6_17" value="17">가족/친지/친구
    <input type="checkbox" name="q6_6_18" value="18">회의참가/시찰
    <input type="checkbox" name="q6_6_19" value="19">교육/훈련/연수
    <input type="checkbox" name="q6_6_20" value="20">유흥/오락
    <input type="checkbox" name="q6_6_21" value="21">기타
    <br>

    일별 지출 비용 :
    <select name="q7_grade">
      <option value="1">3만원 이하</option>
      <option value="2">6만원 이하</option>
      <option value="3">10만원 이하</option>
      <option value="4">20만원 이하</option>
      <option value="5">20만원 초과</option>
    </select>
    <br>

    총지출 비용 : <input type="number" name="q7" placeholder="총지출 비용을 입력하세요."> <br>

    사전예약 서비스 :
    <select name="q8">
      <option value="1">예</option>
      <option value="2">아니요</option>
    </select>
    <br>

    사전예약 서비스 목록
    <br>
    <input type="checkbox" name="q8_1" value="1">숙박시설
    <input type="checkbox" name="q8_2" value="2">교통수단
    <input type="checkbox" name="q8_3" value="3">차량대여/렌트
    <input type="checkbox" name="q8_4" value="4">관광명소
    <input type="checkbox" name="q8_5" value="5">레저시설
    <input type="checkbox" name="q8_6" value="6">체험프로그램
    <input type="checkbox" name="q8_7" value="7">기타
    <br>

    여행상품 구매 이용 :
    <select name="q9">
      <option value="1">예</option>
      <option value="2">아니요</option>
    </select>
    <br>

    재방문 의향 :
    <select name="q6_8">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    타인 추천의향 :
    <select name="q6_9">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_자연경관 :
    <select name="q10_1">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_문화유산 :
    <select name="q10_2">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_교통 :
    <select name="q10_3">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_숙박시설 :
    <select name="q10_4">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_식당 및 음식 :
    <select name="q10_5">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_쇼핑 :
    <select name="q10_6">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_관광정보 및 안내시설 :
    <select name="q10_7">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_관광지 편의시설 :
    <select name="q10_8">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_관광종사자 친절성 :
    <select name="q10_9">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_체험프로그램 :
    <select name="q10_10">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_물가 :
    <select name="q10_11">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

    만족도_혼잡도 :
    <select name="q10_12">
      <option value="1">매우 불만족</option>
      <option value="2">불만족</option>
      <option value="3">보통</option>
      <option value="4">만족</option>
      <option value="5">매우 만족</option>
    </select>
    <br>

  </body>
</html>
