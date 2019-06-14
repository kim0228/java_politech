package com.politech.signin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	// 홈 화면
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object isSignIn  = session.getAttribute("sign_in");
		if (isSignIn != null && (Boolean) isSignIn) {
			DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\student190527.sqlite", "student");
			model.addAttribute("select_result", dbCommon.selectDataTableTag(new Person()));
			return "list";
		}
		return "redirect:/sign_in";
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		return "input";
	}
	
	// 데이터 입력되는 과정
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputData(@RequestParam("name") String name, @RequestParam("address") String address, 
		@RequestParam("birthday_month") String birthday_month, @RequestParam("birthday_day") String birthday_day,@RequestParam("favoriteColor") String favoriteColor) {
//		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\student190527.sqlite", "student");
//		dbCommon.insertData(new Student(name,address,birthday_month + "/" + birthday_day, favoriteColor));
		return "done";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(Locale locale, Model model, @RequestParam("idx") int idx) {
		DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\student190527.sqlite", "student");
		model.addAllAttributes(dbCommon.detailsData(new Person(), idx));
		return "modify";
	}
	
	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String updateData(@RequestParam("idx") int idx, @RequestParam("name") String name, @RequestParam("id") String id, 
			@RequestParam("password") String password, @RequestParam("address") String address, @RequestParam("birthday") String birthday, 
			@RequestParam("favoriteColor") String favoriteColor) {
		DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\student190527.sqlite", "student");
		MessageDigest md;
		try {	
		md = MessageDigest.getInstance("SHA-256");    
		md.update(password.getBytes());   
		StringBuilder sb = new StringBuilder();	    
		for(byte b : md.digest()) {
		sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
				 } 
		password = sb.toString();
				} catch (NoSuchAlgorithmException e) {
					e.printStackTrace();
				}
		dbCommon.updateData(new Person(name, favoriteColor, address, birthday, id, password), idx);
		return "done";
	}
	
	// 로그인 화면
	@RequestMapping(value = "/sign_in", method = RequestMethod.GET)
	public String signIn(Locale locale, Model model) {
		return "sign_in";
	}
	
	// 로그인 되는 과정
	@RequestMapping(value = "/do_sign_in", method = RequestMethod.GET)
	public String doSignIn(Locale locale, Model model, HttpServletRequest request, @RequestParam("id") String id, @RequestParam("password") String password) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : md.digest()) {
				sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
			}
			password = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		DBCommon<Person> dbCommon = new DBCommon<Person>("c:\\tomcat\\student190527.sqlite", "student");
		if (dbCommon.signIn(id, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("sign_in", true);
			return "redirect:/";
		} else {
			return "redirect:/sign_in";
		}
	}
	
	// 로그아웃
	@RequestMapping(value = "/sign_out", method = RequestMethod.GET)
	public String signOut(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/sign_in";
		
	}

}
