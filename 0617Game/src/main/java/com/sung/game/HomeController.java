package com.sung.game;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;

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
//		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\game.sqlite", "player");
//		HttpSession session = request.getSession();
//		HashMap<String, String> userData = dbCommon.detailsData(new Player(), (Integer)session.getAttribute("user_idx"));
//		int idx = Integer.parseInt(userData.get("idx"));
//		String id = userData.get("id");
//		String password = userData.get("password");
//		String name = userData.get("name");
//		dbCommon.updateData(new Player(id,password,name), idx);
		
		HttpSession session = request.getSession();
		int idx = (Integer)session.getAttribute("user_idx");
		Update2 update2 = new Update2();
		update2.method2(idx);
		return "redirect:/my_account";
	}
	
	@RequestMapping(value = "/battle", method = RequestMethod.GET)
	public String battle(Locale locale, Model model, HttpServletRequest request, @RequestParam("select1") int select1, @RequestParam("select2") int select2) {
		DBCommon<Player> dbCommon = new DBCommon<Player>("c:\\tomcat\\game.sqlite", "player");// 
		HashMap<String, String> userData1 = dbCommon.detailsData(new Player(),select1);
		HashMap<String, String> userData2 = dbCommon.detailsData(new Player(),select2);
		model.addAttribute("select1_idx",userData1.get("idx"));
		model.addAttribute("name1", userData1.get("name"));
		model.addAttribute("attackPower1", userData1.get("attackPower"));
		model.addAttribute("attackRate1", userData1.get("attackRate"));
		model.addAttribute("defensePower1", userData1.get("defensePower"));
		model.addAttribute("defenseRate1", userData1.get("defenseRate"));
		int select1HP = 1000;
		model.addAttribute("select1_hp",select1HP);
		
		model.addAttribute("select2_idx",userData2.get("idx"));
		model.addAttribute("name2", userData2.get("name"));
		model.addAttribute("attackPower2", userData2.get("attackPower"));
		model.addAttribute("attackRate2", userData2.get("attackRate"));
		model.addAttribute("defensePower2", userData2.get("defensePower"));
		model.addAttribute("defenseRate2",userData2.get("defenseRate"));
		int select2HP = 1000;
		model.addAttribute("select2_hp",select2HP);
		
		
		HttpSession session = request.getSession();
		session.setAttribute("select1_idx", userData1.get("idx"));
		session.setAttribute("name1", userData1.get("name"));
		session.setAttribute("attackPower1", userData1.get("attackPower"));
		session.setAttribute("attackRate1", userData1.get("defensePower"));
		session.setAttribute("defensePower1", userData1.get("defensePower"));
		session.setAttribute("defenseRate1", userData1.get("defenseRate"));
		session.setAttribute("select1_hp", select1HP);
		
		session.setAttribute("select2_idx", userData2.get("idx"));
		session.setAttribute("name2", userData2.get("name"));
		session.setAttribute("attackPower2", userData2.get("attackPower"));
		session.setAttribute("attackRate2", userData2.get("attackRate"));
		session.setAttribute("defensePower2", userData2.get("defensePower"));
		session.setAttribute("defenseRate2", userData2.get("defenseRate"));
		session.setAttribute("select2_hp", select2HP);
		return "battle";
	}
	
	@RequestMapping(value = "/do_battle", method = RequestMethod.GET)
	public String doBattle(Locale locale, Model model, HttpServletRequest request, @RequestParam("select1") int select1, @RequestParam("select2") int select2) {
		HttpSession session = request.getSession();
		
		int select1Idx = Integer.parseInt((String)session.getAttribute("select1_idx"));
		String select1Name = (String)session.getAttribute("name1");
		int select1AttackPower = Integer.parseInt((String)session.getAttribute("attackPower1"));
		int select1AttackRate = Integer.parseInt((String)session.getAttribute("attackRate1"));
		int select1DefensePower = Integer.parseInt((String)session.getAttribute("defensePower1"));
		int select1DefenseRate = Integer.parseInt((String)session.getAttribute("defenseRate1"));
		int select1HP =  (Integer)session.getAttribute("select1_hp");
		
		int select2Idx = Integer.parseInt((String)session.getAttribute("select2_idx"));
		String select2Name = (String)session.getAttribute("name2");
		int select2AttackPower = Integer.parseInt((String)session.getAttribute("attackPower2"));
		int select2AttackRate = Integer.parseInt((String)session.getAttribute("attackRate2"));
		int select2DefensePower = Integer.parseInt((String)session.getAttribute("defensePower2"));
		int select2DefenseRate = Integer.parseInt((String)session.getAttribute("defenseRate2"));
		int select2HP =  (Integer)session.getAttribute("select2_hp");
		
		select1HP--;
		select2HP--;
		
		model.addAttribute("select1_idx", select1Idx);
		model.addAttribute("name1", select1Name);
		model.addAttribute("attackPower1", select1AttackPower);
		model.addAttribute("attackRate1", select1AttackRate);
		model.addAttribute("defensePower1", select1DefensePower);
		model.addAttribute("defenseRate1", select1DefenseRate);
		model.addAttribute("select1_hp",select1HP);
		
		
		model.addAttribute("select2_idx", select2Idx);
		model.addAttribute("name2", select2Name);
		model.addAttribute("attackPower2", select2AttackPower);
		model.addAttribute("attackRate2", select2AttackRate);
		model.addAttribute("defensePower2", select2DefensePower);
		model.addAttribute("defenseRate2", select2DefenseRate);
		model.addAttribute("select2_hp",select2HP);
		
		
		Random rand = new Random();
		model.addAttribute("random_number",rand.nextInt(9999999));
		
		
		session.setAttribute("select1_idx", "" + select1Idx);
		session.setAttribute("name1", "" + select1Name);
		session.setAttribute("attackPower1", "" + select1AttackPower);
		session.setAttribute("attackRate1", "" + select1AttackRate);
		session.setAttribute("defensePower1", "" + select1DefensePower);
		session.setAttribute("defenseRate1", "" + select1DefenseRate);
		session.setAttribute("select1_hp", select1HP);
		
		session.setAttribute("select2_idx", "" + select2Idx);
		session.setAttribute("name2", "" + select2Name);
		session.setAttribute("attackPower2", "" + select2AttackPower);
		session.setAttribute("attackRate2", "" + select2AttackRate);
		session.setAttribute("defensePower2", "" + select2DefensePower);
		session.setAttribute("defenseRate2", "" + select2DefenseRate);
		session.setAttribute("select2_hp", select2HP);

		return "battle";
	}
	
	@RequestMapping(value = "/secession", method = RequestMethod.GET)
	public String secession(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		int idx = (Integer)session.getAttribute("user_idx");
		Update2 update2 = new Update2();
		update2.method3(idx);
		session.invalidate(); // 세션 끊음
		return "redirect:/";
	}
	

}
