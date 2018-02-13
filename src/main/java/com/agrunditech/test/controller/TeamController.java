package com.agrunditech.test.controller;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agrunditech.test.entity.Team;

@RestController
@RequestMapping("/")
public class TeamController {
	
	private static final Logger logger = Logger.getLogger(TeamController.class);

	private Team team;

	@PostConstruct
	public void init() {
		team = new Team();
		team.setTeamName("agrunditech");
		team.setTeamLocation("India");
		team.setTeamMascot("Maverick");
		logger.info("Post construct initialized team info");
		logger.info(team);
	}

	@RequestMapping(value = "/team", method = RequestMethod.GET, produces = { "application/xml", "application/json" })
	public Team getTeam(HttpServletRequest request) {
		logger.info("Request recieved returning team info");
		return team;
	}

}