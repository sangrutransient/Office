package com.nous.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nous.admin.dao.ReportDAO;
import com.nous.admin.model.ScoreCard;
import com.nous.admin.model.ScoreVariant;

@Service
public class ReportService {
	
	@Autowired
	private ReportDAO dao;
	
	public List<ScoreCard> findScoreCard() {
		return dao.findScore();
	}
	
	public List<ScoreVariant> findScoreVariant() {
		return dao.findVariant();
	}
}
