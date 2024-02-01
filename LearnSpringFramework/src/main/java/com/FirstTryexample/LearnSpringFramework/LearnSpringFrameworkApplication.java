package com.FirstTryexample.LearnSpringFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.FirstTryexample.LearnSpringFramework.enterprise.web.MyWebController;
import com.FirstTryexample.LearnSpringFramework.game.GameRunner;

/**
 * In this Example of spring highly coupled code is changed to loosely coupled
 * code with the help of interface named gaming console Leaned how to
 * use @Components and @autowired to manage
 * 
 * One more package is made with .enterprise in which it is showcased how spring
 * works in enterprise
 */
@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		// MarioGame game= new MarioGame();
		// Pacman game = new Pacman();
		// SuperContraGame game = new SuperContraGame();
		// GamingConsole game = new MarioGame();
		// GameRunner runner = new GameRunner(game);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
