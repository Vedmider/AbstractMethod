package com.study.domain.figure;

public class IFigure implements AbstractFigure {
    @Override
    public void action() {
        System.out.println("I figure in tetris started to move");
    }
}
