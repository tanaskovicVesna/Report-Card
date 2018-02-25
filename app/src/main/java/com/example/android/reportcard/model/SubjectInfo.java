package com.example.android.reportcard.model;

/**
 * Created by Tanaskovic on 2/25/2018.
 */

public class SubjectInfo {

    private double mExamPoints;
    private int mResourceId;
    private String mColor;
    private int mAttendedClasses;
    private String mObservation;
    private String mImageColor;


    public SubjectInfo(double examPoints, int resourceId, String color, int attendedClasses, String observation, String imageColor) {
        this.mExamPoints = examPoints;
        this.mResourceId = resourceId;
        this.mColor = color;
        this.mAttendedClasses = attendedClasses;
        this.mObservation = observation;
        this.mImageColor = imageColor;

    }

    public double getExamPoints() {
        return mExamPoints;
    }

    public int getResourceId() {
        return mResourceId;
    }

    public String getColor() {
        return mColor;
    }

    public int getAttendedClasses() {
        return mAttendedClasses;
    }

    public String getObservation() {
        return mObservation;
    }

    public String getImageColor() {
        return mImageColor;
    }
}
