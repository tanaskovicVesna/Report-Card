package com.example.android.reportcard.model;

/**
 * Created by Tanaskovic on 2/23/2018.
 */

public class Student {

    private  String mStudentName;
    private int mImageRecourceId;
    private String mColor;

    //constructor

    public Student(String studentName) {
        this.mStudentName = studentName;
    }

    public Student(String studentName, int imageRecourceId, String color) {
        this.mStudentName = studentName;
        this.mImageRecourceId = imageRecourceId;
        this.mColor = color;
    }

    public String getColor() {
        return mColor;
    }

    public int getImageRecourceId() {

        return mImageRecourceId;
    }

    //getter
    public String getStudentName() {
        return mStudentName;
    }
}
