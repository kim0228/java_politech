<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
  <meta charset="utf-8" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/battle.css" />
  <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/battle.js"></script>
</head>

<body>
  <div id="wrap">
    <div class="top_button_section">
      <form>
        <input type="text" name="select1" />
        <input type="text" name="select2" />
      </form>
      <button class="turn">턴 진행</button>
    </div>
    <div class="battle_section">
    <form action="player_data">
      <div class="player1">
        <span class="no">1</span>
        <h3>이름</h3>
        <span>공격력 : </span> ${attackPower }<br />
        <span>방어력 : </span>${defensePower}<br />
        <span>공격확률 : </span> ${attackRate}<br />
        <span>방어확률 : </span> ${defenseRate}<br />
      </div>
      <div class="player2">
        <span class="no">2</span>
        <h3>이름</h3>
        <span>공격력 : </span> ${attackPower }<br />
        <span>방어력 : </span> ${defensePower}<br />
        <span>공격확률 : </span> ${attackRate}<br />
        <span>방어확률 : </span> ${defenseRate}<br />
      </div>
    </div>
    </form>
  </div>
</body>

</html>