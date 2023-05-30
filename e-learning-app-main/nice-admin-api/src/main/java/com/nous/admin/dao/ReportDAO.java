package com.nous.admin.dao;

import java.util.List;

import com.nous.admin.model.ScoreCard;
import com.nous.admin.model.ScoreVariant;

public interface ReportDAO {
	public List<ScoreCard> findScore();
	public List<ScoreVariant> findVariant();
}
