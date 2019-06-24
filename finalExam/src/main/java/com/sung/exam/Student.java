package com.sung.exam;

public class Student {
	public int idx;
	public String name;
	public int midScore;
	public int finalScore;
	
	public Student() {
		
	}
	Student(String name, int midScore, int finalScore){
		this.name = name;
		this.midScore = midScore;
		this.finalScore = finalScore;
	}
	
	public String toTableTagString() {
		String tagString = "";
		tagString = tagString + "<tr>";
		tagString = tagString + "<td>";
		tagString = tagString + this.idx;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.name;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.midScore;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.finalScore;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + "<a href='update?idx=" + this.idx + "'>수정하기</a>";
		tagString = tagString + "</td>";
		tagString = tagString + "</tr>";
		return tagString;
	}
}
