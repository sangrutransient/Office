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
@Table(name = "T_SCORE_CARD_REPORT_DTLS")
public class ScoreCardEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STUDENT_ID")
	private int studentId;
	@Column(name = "STUDENT_NAME")
	private String studentName;
	@Column(name = "MATHEMATICS")
	private int mathematics;
	@Column(name = "SCIENCE")
	private int science;
	@Column(name = "ENGLISH")
	private int english;
	@Column(name = "HINDI")
	private int hindi;
	@Column(name = "SOCIAL_SCIENCE")
	private int socialScience;
	@Column(name = "RESULT")
	private String result;
}
