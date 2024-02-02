package com.encypher.spring.runner.game;

import org.springframework.stereotype.Component;


// @Component is an annotation that allows Spring to detect our custom beans automatically.

//In other words, without having to write any explicit code, Spring will:
//Scan our application for classes annotated with @Component
//Instantiate them and inject any specified dependencies into them
//Inject them wherever needed
@Component
public class MarioGame implements GamingConsole  {



    public void up() {
        System.out.println("jump");
    }

    public void down() {
        System.out.println("crouch down ");
    }

    public void left() {
        System.out.println("stop");
    }

    public void right() {
        System.out.println("accelerate");
    }
}
