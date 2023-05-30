package com.nous.admin.model;

import java.io.Serializable;

public class ScoreCard implements Serializable {
	private static final long serialVersionUID = 1L;

	private int studentId;
	private String studentName;
	private int mathematics;
	private int science;
	private int english;
	private int hindi;
	private int socialScience;
	private String result;

	public ScoreCard() {
		super();
	}

	public ScoreCard(int studentId, String studentName, int mathematics, int science, int english, int hindi,
			int socialScience, String result) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.mathematics = mathematics;
		this.science = science;
		this.english = english;
		this.hindi = hindi;
		this.socialScience = socialScience;
		this.result = result;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMathematics() {
		return mathematics;
	}

	public void setMathematics(int mathematics) {
		this.mathematics = mathematics;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getSocialScience() {
		return socialScience;
	}

	public void setSocialScience(int socialScience) {
		this.socialScience = socialScience;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + english;
		result = prime * result + hindi;
		result = prime * result + mathematics;
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
		result = prime * result + science;
		result = prime * result + socialScience;
		result = prime * result + studentId;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScoreCard other = (ScoreCard) obj;
		if (english != other.english)
			return false;
		if (hindi != other.hindi)
			return false;
		if (mathematics != other.mathematics)
			return false;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		if (science != other.science)
			return false;
		if (socialScience != other.socialScience)
			return false;
		if (studentId != other.studentId)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "message";
	}

}
