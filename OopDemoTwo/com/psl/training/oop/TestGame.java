package com.psl.training.oop;

import com.psl.training.oop.canvas.GameConsole;
import com.psl.training.oop.shapes.Circle;
import com.psl.training.oop.shapes.Square;
import com.psl.training.oop.shapes.Triangle;

public class TestGame {
    public static void main(String[] args) {
        GameConsole gameConsole = new GameConsole();
        gameConsole.draw(new Circle());     // For circle
        gameConsole.draw(new Triangle());   // For Triangle
        gameConsole.draw(new Square());     // For Square
    }
}
