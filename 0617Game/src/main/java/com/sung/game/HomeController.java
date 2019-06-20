package com.sung.game;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
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
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\game.sqlite", "player");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Player()));
		return "list";
	}
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Locale locale, Model model) {
		return "join";
	}
	@RequestMapping(value = "/my_account", method = RequestMethod.GET)
	public String myAccount(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\game.sqlite", "player");
		if (session != null && session.getAttribute("user_idx") != null) {
			model.addAllAttributes(dbCommon.detailsData(new Player(), (Integer)session.getAttribute("user_idx")));
		}
		return "my_card";
	}
	

	@RequestMapping(value = "/do_join", method = RequestMethod.POST)
	public String doJoin(Locale locale, Model model, HttpServletRequest request) {
			MessageDigest md;
			try {
				request.setCharacterEncoding("UTF-8");	
			} catch (UnsupportedEncodingException e) {			
				e.printStackTrace();
			}
				String id = request.getParameter("id");
				String password = request.getParameter("password");
				String name = request.getParameter("name");
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
			DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\game.sqlite", "player");
			dbCommon.insertData(new Player(id, password, name));
			model.addAttribute("message", "가입되었습니다.");
			return "done";
		}	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		return "sign_in";
	}
	@RequestMapping(value = "/do_login", method = RequestMethod.POST)
	public String doLogin(Locale locale, Model model, HttpServletRequest request, @RequestParam("id") String id, @RequestParam("password") String password) {
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\game.sqlite", "player");
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
		int userIdx = dbCommon.signIn(id, password);
		if (userIdx > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("user_idx", userIdx);
			return "redirect:/";
		}
		return "redirect:/login";
	}
	
	@RequestMapping(value = "/change_card", method = RequestMethod.GET)
	public String changeCard(Locale locale, Model model, HttpServletRequest request) {
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\game.sqlite", "player");
		HttpSession session = request.getSession();
		HashMap<String, String> userData = dbCommon.detailsData(new Player(), (Integer)session.getAttribute("user_idx"));
		int idx = Integer.parseInt(userData.get("idx"));
		String id = userData.get("id");
		String password = userData.get("password");
		String name = userData.get("name");
		dbCommon.updateData(new Player(id,password,name), idx);
		return "redirect:/my_account";
	}
	
	@RequestMapping(value = "/battle", method = RequestMethod.POST)
	public String battle(Locale locale, Model model, HttpServletRequest request, @RequestParam("select1") String select1, @RequestParam("select2") String select2) {
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\game.sqlite", "player");// 
		int ps1 = Integer.parseInt(select1);
		int ps2 = Integer.parseInt(select2);
		HashMap<String, String> userData1 = dbCommon.detailsData(new Player(),ps1);
		HashMap<String, String> userData2 = dbCommon.detailsData(new Player(),ps2);
		
		String name1 = userData1.get("name");
		String attackPower1 = userData1.get("attackPower");
		String attackRate1 = userData1.get("attackRate");
		String defensePower1 = userData1.get("defensePower");
		String defenseRate1 = userData1.get("defenseRate");
		
		String name2 = userData2.get("name");
		String attackPower2 = userData2.get("attackPower");
		String attackRate2 = userData2.get("attackRate");
		String defensePower2 = userData2.get("defensePower");
		String defenseRate2 = userData2.get("defenseRate");
		
		
		model.addAttribute("name1", name1);
		model.addAttribute("attackPower1", attackPower1);
		model.addAttribute("attackRate1", attackRate1);
		model.addAttribute("defensePower1", defensePower1);
		model.addAttribute("defenseRate1", defenseRate1);
		
		model.addAttribute("name2", name2);
		model.addAttribute("attackPower2", attackPower2);
		model.addAttribute("attackRate2", attackRate2);
		model.addAttribute("defensePower2", defensePower2);
		model.addAttribute("defenseRate2", defenseRate2);
		
		model.addAttribute("select_result",dbCommon.selectDataTableTag(new Player()));
		
		model.addAttribute("select1",name1);
		model.addAttribute("select2",name2);
		return "battle";
	}
	

}
