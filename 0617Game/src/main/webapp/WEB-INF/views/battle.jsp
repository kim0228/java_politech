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
      <form action="do_battle">
        <input type="text" name="select1" value="${select1_idx}"/>
        <input type="text" name="select2" value="${select2_idx}"/>
        <input type="hidden" name="random" value="${random_number}"/>
      </form>
      <img src="abc.jpg?raddds=879789" />
      <button class="turn">턴 진행</button>
    </div>
    <div class="battle_section">
      <div class="player1">
        <span class="no">${select1_idx}</span>
        <h3>${name1}</h3>
        <span>공격력 : </span> ${attackPower1}<br />
        <span>방어력 : </span>${defensePower1}<br />
        <span>공격확률 : </span> ${attackRate1}<br />
        <span>방어확률 : </span> ${defenseRate1}<br />
        <span>HP : </span> ${select1_hp}<br />
        
      </div>
      <div class="player2">
        <span class="no">${select2_idx}</span>
        <h3>${name2}</h3>
        <span>공격력 : </span> ${attackPower2}<br />
        <span>방어력 : </span> ${defensePower2}<br />
        <span>공격확률 : </span> ${attackRate2}<br />
        <span>방어확률 : </span> ${defenseRate2}<br />
        <span>HP : </span> ${select2_hp}<br />
      </div>
    </div>
  </div>
</body>

</html>