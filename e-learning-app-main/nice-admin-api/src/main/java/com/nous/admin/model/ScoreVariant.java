package com.nous.admin.model;

import java.io.Serializable;

public class ScoreVariant implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String scoreRange;
	private int minScore;
	private int maxScore;
	private String color;
	private String css;

	public ScoreVariant() {
		super();
	}

	public ScoreVariant(int id, String scoreRange, int minScore, int maxScore, String color, String css) {
		super();
		this.id = id;
		this.scoreRange = scoreRange;
		this.minScore = minScore;
		this.maxScore = maxScore;
		this.color = color;
		this.css = css;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getScoreRange() {
		return scoreRange;
	}

	public void setScoreRange(String scoreRange) {
		this.scoreRange = scoreRange;
	}

	public int getMinScore() {
		return minScore;
	}

	public void setMinScore(int minScore) {
		this.minScore = minScore;
	}

	public int getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((css == null) ? 0 : css.hashCode());
		result = prime * result + id;
		result = prime * result + maxScore;
		result = prime * result + minScore;
		result = prime * result + ((scoreRange == null) ? 0 : scoreRange.hashCode());
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
		ScoreVariant other = (ScoreVariant) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (css == null) {
			if (other.css != null)
				return false;
		} else if (!css.equals(other.css))
			return false;
		if (id != other.id)
			return false;
		if (maxScore != other.maxScore)
			return false;
		if (minScore != other.minScore)
			return false;
		if (scoreRange == null) {
			if (other.scoreRange != null)
				return false;
		} else if (!scoreRange.equals(other.scoreRange))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ScoreVariant [id=" + id + ", scoreRange=" + scoreRange + ", minScore=" + minScore + ", maxScore="
				+ maxScore + ", color=" + color + ", css=" + css + "]";
	}

}
