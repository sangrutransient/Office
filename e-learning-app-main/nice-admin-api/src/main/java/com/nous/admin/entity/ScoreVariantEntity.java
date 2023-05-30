package com.nous.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "T_SCORE_VARIANTS_CHART_DTLS")
public class ScoreVariantEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	@Column(name = "SCORE_RANGE")
	private String scoreRange;
	@Column(name = "MIN_SCORE")
	private int minScore;
	@Column(name = "MAX_SCORE")
	private int maxScore;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "CSS")
	private String css;
}
