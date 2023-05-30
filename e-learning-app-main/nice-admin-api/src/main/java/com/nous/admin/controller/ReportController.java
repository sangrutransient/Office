package com.nous.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nous.admin.model.ScoreCard;
import com.nous.admin.model.ScoreVariant;
import com.nous.admin.service.ReportService;

@RestController
@RequestMapping("/v2")
public class ReportController {

	@Autowired
	private ReportService reportService;

	@GetMapping(path = "/score/card", produces = "application/json")
	public ResponseEntity<List<ScoreCard>> getScoreCard() {
		return new ResponseEntity<>(reportService.findScoreCard(), HttpStatus.OK);
	}

	@GetMapping(path = "/score/variant", produces = "application/json")
	public ResponseEntity<List<ScoreVariant>> getScoreVariant() {
		return new ResponseEntity<>(reportService.findScoreVariant(), HttpStatus.OK);
	}
}
