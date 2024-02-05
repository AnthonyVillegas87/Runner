package com.encypher.spring.runner;

import com.encypher.spring.runner.enterprise.webService.MyWebController;
import com.encypher.spring.runner.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RunnerApplication {

    public static void main(String[] args) {
      ConfigurableApplicationContext context = SpringApplication.run(RunnerApplication.class, args);

      GameRunner runner = context.getBean(GameRunner.class);
      runner.run();

      MyWebController controller = context.getBean(MyWebController.class);
        System.out.println(controller.returnValueFromBusinessService());
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
