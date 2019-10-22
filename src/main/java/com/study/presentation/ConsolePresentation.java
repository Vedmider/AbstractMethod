package com.study.presentation;

import com.study.domain.factory.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ConsolePresentation {
    private static List<AbstractFigureFactory> abstractFigureFactories = Arrays.asList(new IFigureFactory(),
            new JFigureFactory(),
            new LFigureFactory(),
            new OFigureFactory(),
            new SFigureFactory(),
            new TFigureFactory(),
            new ZFigureFactory());

    public static void main(String[] args) {
        intro();
        startGame();
        System.out.println("END of the GAME.");
    }

    private static void intro() {
        System.out.println("Hello!!!");
        pause(1000, "Thread was interrupted");
        System.out.println("This is the tetris game.\n" +
                "There are many figures in our tetris game: I, J, L, O, S, T and Z.\n" +
                "They will randomly appear in console.\n" +
                "So let the game begins...\n");
        pause(2000, "Uuuppps...Thread was interrupted.");
    }

    private static void pause(int i, String s) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            System.out.println(s);
        }
    }

    private static void startGame() {
        int[] randomIntegersList = new Random()
                .ints(15, 0, 7)
                .toArray();
        for (int i = 0; i < 15; i++) {
            abstractFigureFactories
                    .get(randomIntegersList[i])
                    .createFigure()
                    .action();
            pause(1000, "Upps... Thread was interrupted.");
        }


    }
}
