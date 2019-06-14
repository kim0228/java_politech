package com.kimsunglim.Sql0520;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		DataReader dataReader = new DataReader("c:\\tomcat\\test.sqlite", "students");
		dataReader.open();
	
		try {
			model.addAttribute("query_result", dataReader.selectData() ); // 쿼리 실행
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
		
		} finally {
			dataReader.close();
		}
			return "home";
		}
	
	@RequestMapping(value = "/score", method = RequestMethod.GET)
	public String score(Locale locale, Model model) {
		DataReader dataReader = new DataReader("c:\\tomcat\\score.sqlite", "students");
		dataReader.open();
			return "done";
		}
	@RequestMapping(value = "/score/done", method = RequestMethod.GET)
	public String done(Locale locale, Model model) {
		DataReader dataReader = new DataReader("c:\\tomcat\\score.sqlite", "students");
		dataReader.open();
			return "done";
		}
}
