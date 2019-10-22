package com.study.domain.factory;

import com.study.domain.figure.AbstractFigure;
import com.study.domain.figure.ZFigure;

public class ZFigureFactory extends AbstractFigureFactory {
    @Override
    public AbstractFigure createFigure() {
        return new ZFigure();
    }
}
