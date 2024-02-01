package com.FirstTryexample.LearnSpringFramework.game;

public class Pacman implements GamingConsole{
	public void up() {
System.out.println("pacman jump");
}
	public void down() {
		System.out.println("pacman down into a hole");
		}
	public void left() {
		System.out.println("pacman stop");
		}
	public void right() {
		System.out.println("pacman accelerate");
		}
	
	
}
