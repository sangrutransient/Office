package com.nous.admin.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nous.admin.model.ScoreCard;
import com.nous.admin.model.ScoreVariant;
import com.nous.admin.repository.ScoreCardRepository;
import com.nous.admin.repository.ScoreVariantRepository;

@Component
public class ReportDAOImpl implements ReportDAO {

	@Autowired
	private ScoreCardRepository cardRepository;

	@Autowired
	private ScoreVariantRepository variantRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<ScoreCard> findScore() {
		return cardRepository.findAll().stream().map(post -> modelMapper.map(post, ScoreCard.class))
				.collect(Collectors.toList());
	}

	@Override
	public List<ScoreVariant> findVariant() {
		return variantRepository.findAll().stream().map(post -> modelMapper.map(post, ScoreVariant.class))
				.collect(Collectors.toList());
	}

}
