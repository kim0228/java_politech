package com.sung.exam;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



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
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\studentScore.sqlite", "examscore");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Student()));
		
		return "list";
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		return "input";
	}
	
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputData(@RequestParam("name") String name, @RequestParam("midScore") int midScore, @RequestParam("finalScore") int finalScore) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\studentScore.sqlite", "examscore");
		dbCommon.insertData(new Student(name,midScore,finalScore));
		return "done";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Locale locale, Model model, @RequestParam("idx") int idx) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\studentScore.sqlite", "examscore");
		Student details = dbCommon.detailsData(new Student(),idx);
		if (details != null) {
			model.addAttribute("idx", details.idx);
			model.addAttribute("name", details.name);
			model.addAttribute("midScore", details.midScore);
			model.addAttribute("finalScore", details.finalScore);
	}		
		// 테스트
		System.out.println("dfdf");
		return "update";	
}
	
	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String updateData(@RequestParam("idx") int idx, @RequestParam("name") String name, @RequestParam("midScore") int midScore, @RequestParam("finalScore") int finalScore) {
			DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\studentScore.sqlite", "examscore");
			dbCommon.updateData(new Student(name, midScore, finalScore),idx);
			// 테스트
			System.out.println("aaa");
			return "done";
		}
}
