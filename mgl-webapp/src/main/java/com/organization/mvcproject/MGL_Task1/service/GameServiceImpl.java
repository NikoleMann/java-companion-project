package com.organization.mvcproject.MGL_Task1.service;

import java.util.List;

import com.organization.mvcproject.MGL_Task1.model.Game;

public interface GameServiceImpl {

	List<Game> retrieveAllGames();

	Game saveGame(Game game);

}
