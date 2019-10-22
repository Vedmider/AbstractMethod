package com.study.domain.factory;

import com.study.domain.figure.AbstractFigure;
import com.study.domain.figure.SFigure;

public class SFigureFactory extends AbstractFigureFactory {
    @Override
    public AbstractFigure createFigure() {
        return new SFigure();
    }
}
