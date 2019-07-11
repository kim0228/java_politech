package com.kim.test;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class People {
	public int idx;
	public String age;
	public String sex;

	People() {
	}
	
	People(String age, String sex) {
		this.age = age;
		this.sex = sex;
	}
	
	public String toTableTagString() {
		String tagString = "";
		tagString = tagString + "<tr>";
		tagString = tagString + "<td>";
		tagString = tagString + this.idx;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.age;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.sex;
		tagString = tagString + "</td>";
		tagString = tagString + "</tr>";
		return tagString;
	}
}
