package com.springframework.learnspringframework.game;

public class Valorant implements GamingConsole {
	public void up() {
		System.out.println("jump");
	}

	public void down() {
		System.out.println("Sit down");
	}

	public void right() {
		System.out.println("Fire a bullet");
	}

	public void left() {
		System.out.println("Slow-walk");
	}

}
