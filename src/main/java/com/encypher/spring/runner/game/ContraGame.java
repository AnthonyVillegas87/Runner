package com.encypher.spring.runner.game;

public class ContraGame implements GamingConsole{

    public void up() {
        System.out.println("Commando jump");
    }

    public void down() {
        System.out.println("Commando crouch down ");
    }

    public void left() {
        System.out.println("Commando stop");
    }

    public void right() {
        System.out.println("Commando accelerate");
    }
}
