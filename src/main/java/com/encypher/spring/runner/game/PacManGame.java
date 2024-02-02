package com.encypher.spring.runner.game;

import org.springframework.stereotype.Component;


public class PacManGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("^");
    }

    @Override
    public void down() {
        System.out.println("down");
    }

    @Override
    public void left() {
        System.out.println("<");
    }

    @Override
    public void right() {
        System.out.println(">");
    }
}
