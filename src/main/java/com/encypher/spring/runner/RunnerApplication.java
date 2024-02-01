package com.encypher.spring.runner;

import com.encypher.spring.runner.game.GameRunner;
import com.encypher.spring.runner.game.GamingConsole;
import com.encypher.spring.runner.game.MarioGame;
import com.encypher.spring.runner.game.PacManGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RunnerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(RunnerApplication.class, args);
        PacManGame pacManGame = new PacManGame();
        MarioGame game = new MarioGame();
        GamingConsole game = new MarioGame();
        GameRunner runner = new GameRunner(game);
        runner.run();
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
