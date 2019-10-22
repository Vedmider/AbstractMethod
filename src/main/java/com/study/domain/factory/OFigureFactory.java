package com.study.domain.factory;

import com.study.domain.figure.AbstractFigure;
import com.study.domain.figure.OFigure;

public class OFigureFactory extends AbstractFigureFactory {
    @Override
    public AbstractFigure createFigure() {
        return new OFigure();
    }
}
