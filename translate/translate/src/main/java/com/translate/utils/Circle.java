package com.translate.utils;



import java.awt.geom.Point2D;

/**
 * Created by zjj
 * Date : 2017/8/26 10:58
 * Description : 圆
 */
public class Circle {
	/*
     * 圆心坐标
     */
    private Point2D.Double center;

    /**
     * 半径
     */
    private Double radius;
    public Point2D.Double getCenter() {
		return center;
	}

	public void setCenter(Point2D.Double center) {
		this.center = center;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	
}
