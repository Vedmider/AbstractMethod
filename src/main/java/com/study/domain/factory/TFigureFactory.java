package com.study.domain.factory;

import com.study.domain.figure.AbstractFigure;
import com.study.domain.figure.TFigure;

public class TFigureFactory extends AbstractFigureFactory {
    @Override
    public AbstractFigure createFigure() {
        return  new TFigure();
    }
}
