package com.sung.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.sqlite.SQLiteConfig;



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
		return "update";	 // redirect는 해당되는부분으로 넘긴다.
}
	
	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String updateData(@RequestParam("idx") int idx, @RequestParam("name") String name, @RequestParam("midScore") int midScore, @RequestParam("finalScore") int finalScore) {
			DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\studentScore.sqlite", "examscore");
			dbCommon.updateData(new Student(name, midScore, finalScore),idx);
			// 테스트
			System.out.println("aaa");
			return "done";
		}
	
	@RequestMapping(value = "/search_data", method = RequestMethod.GET)
	public String searchData(Locale locale, Model model, @RequestParam("name") String name) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\studentScore.sqlite", "examscore");
		model.addAttribute("select_result", dbCommon.searchDataTableTag(new Student(), "name", name));
		//System.out.println("�˻���) "+name);
		Connection connection = null;
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat\\studentScore.sqlite", config.toProperties()); // config는 읽기전용으로 열수도 있다.
			
			String query = "SELECT * FROM student190624 WHERE name LIKE '%" + name + "%'";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			StringBuilder htmlString = new StringBuilder();

			while (resultSet.next()) {
				htmlString.append("<tr>");
				String fieldName = resultSet.getString("name");
				int idx = resultSet.getInt("idx");
				int midScore = resultSet.getInt("midScore");
				int finalScore = resultSet.getInt("finalScore");
				htmlString.append("<td>" + idx + "</td>");
				htmlString.append("<td>" + fieldName + "</td>");
				htmlString.append("<td>" + midScore + "</td>");
				htmlString.append("<td>" + finalScore + "</td>");
				htmlString.append("</tr>");
			}
			model.addAttribute("select_result", htmlString);
			preparedStatement.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (connection != null) {
			try {
			connection.close();
			} catch (SQLException e) {
			e.printStackTrace();
			 }
		}
			connection = null;		
		return "list2";
	}
}
