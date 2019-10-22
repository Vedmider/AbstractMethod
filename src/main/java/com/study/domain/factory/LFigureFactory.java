package com.study.domain.factory;

import com.study.domain.figure.AbstractFigure;

public class LFigureFactory extends AbstractFigureFactory {
    @Override
    public AbstractFigure createFigure() {
        return new com.study.domain.figure.LFigure();
    }
}
