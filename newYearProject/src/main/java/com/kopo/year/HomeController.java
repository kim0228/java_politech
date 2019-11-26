package com.kopo.year;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	ApplicationContext context =new GenericXmlApplicationContext("config/dataBeans.xml");
	DataSource ds = (DataSource) context.getBean("dataSource");
	String maxWeek = "";
	String maxYear = "";
	String nextYear = "";
	String yearWeek = "";
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		return "list";
	}
	
	
	@RequestMapping(value = "/volume_list", method = RequestMethod.GET)
	public @ResponseBody ArrayList<HashMap> shopList(Locale locale, Model model) {
		ArrayList<HashMap> data = new ArrayList<HashMap>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 생성 실패");
		}

		try {
			conn = ds.getConnection();
			String query = "SELECT * FROM KOPO_PRODUCT_VOLUME ORDER BY REGIONID, PRODUCTGROUP,YEARWEEK ASC";
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();

			while (rs.next()) {
				String regionid = rs.getString("REGIONID");
				String productgroup = rs.getString("PRODUCTGROUP");
				String yearweek = rs.getString("YEARWEEK");
				int volume = rs.getInt("VOLUME");
				HashMap<String, String> row = new HashMap<String, String>();
				row.put("regionid",regionid);
				row.put("productgroup", productgroup);
				row.put("yearweek", yearweek);
				row.put("volume", volume + "");
				data.add(row);
				// System.out.println(row);
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
}
