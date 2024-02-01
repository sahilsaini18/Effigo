package com.FirstTryexample.LearnSpringFramework.game;

import org.springframework.stereotype.Component;

@Component 
public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("mario jump");
	}

	public void down() {
		System.out.println("mario down into a hole");
	}

	public void left() {
		System.out.println("mario stop");
	}

	public void right() {
		System.out.println("mario accelerate");
	}

}
