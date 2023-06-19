package com.springframework.learnspringframework;

import com.springframework.learnspringframework.game.GameRunner;
import com.springframework.learnspringframework.game.Valorant;

public class GamingApp {

	public static void main(String[] args) {

		//var game = new Mario();
		//var game = new CsGo();
		var game = new Valorant();
		var gamerunner = new GameRunner(game);
		gamerunner.run();

	}

}
