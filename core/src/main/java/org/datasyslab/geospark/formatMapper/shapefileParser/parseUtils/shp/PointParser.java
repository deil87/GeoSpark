/**
 * FILE: PointParser.java
 * PATH: org.datasyslab.geospark.formatMapper.shapefileParser.parseUtils.shp.PointParser.java
 * Copyright (c) 2015-2017 GeoSpark Development Team
 * All rights reserved.
 */
package org.datasyslab.geospark.formatMapper.shapefileParser.parseUtils.shp;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;

import java.io.IOException;

public class PointParser extends ShapeParser {

    /**
     * create a parser that can abstract a Point from input source with given GeometryFactory
     * @param geometryFactory
     */
    public PointParser(GeometryFactory geometryFactory) {
        super(geometryFactory);
    }

    /**
     * abstract a Point shape
     * @param reader
     * @return
     * @throws IOException
     */
    @Override
    public Geometry parserShape(ShapeReader reader) throws IOException {
        double x = reader.readDouble();
        double y = reader.readDouble();
        Point point = geometryFactory.createPoint(new Coordinate(x, y));
        return point;
    }
}
