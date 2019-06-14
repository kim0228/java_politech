package com.kimsunglim.Sql0520;

import java.sql.SQLException;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // 어노테이션으로 구분. 어떠한 주소로 요청이 들어올때 어떠한 결과값을 리턴시켜주는 역할을 한다.
public class NewController {
	@RequestMapping(value = "/select", method = RequestMethod.GET) // 주소줄이 바뀌는건 모두 get방식, 요청말고 body쪽에 값들이 붙여져있는건 post방식(기본적으로 노출이 안되는 애들을 post방식을 사용해야 한다.)
	public String test2(Locale locale, Model model) {
		DataReader dataReader = new DataReader("c:\\tomcat\\tomcat.sqlite", "students");
		dataReader.open();
	
		try {
			model.addAttribute("query_result", dataReader.selectData() ); // 쿼리 실행
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		
		} finally {
			dataReader.close();
		}
			return "test2";
		}
	// 여기가 화면에 보여지는 부분이다.
	@RequestMapping(value = "/select", method = RequestMethod.POST) // 주소줄이 바뀌는건 모두 get방식, 요청말고 body쪽에 값들이 붙여져있는건 post방식(기본적으로 노출이 안되는 애들을 post방식을 사용해야 한다.)
	public String test3(Locale locale, Model model) {
		DataReader dataReader = new DataReader("c:\\tomcat\\tomcat.sqlite", "students");
		dataReader.open();
	
		try {
			model.addAttribute("query_result", dataReader.selectData() ); // 쿼리 실행
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		} finally {
			dataReader.close(); // 데이터베이스부분은 문을 열면 닫아줘야 한다.
		}
			return "test2";
		}
}
