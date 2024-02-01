 package com.FirstTryexample.LearnSpringFramework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	public void up() {
System.out.println("Super contra jump");
}
	public void down() {
		System.out.println("super contra down into a hole");
		}
	public void left() {
		System.out.println("super contra stop");
		}
	public void right() {
		System.out.println("super contra accelerate");
		} 
	
	
}
