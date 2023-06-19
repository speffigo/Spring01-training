package com.springframework.learnspringframework.game;

public class GameRunner {
	private GamingConsole gamcon;

	public GameRunner(GamingConsole gamcon) {
		this.gamcon = gamcon;
	}

	public void run() {
		gamcon.up();
		gamcon.down();
		gamcon.right();
		gamcon.left();

	}

}
