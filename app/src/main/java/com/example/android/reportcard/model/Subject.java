package com.example.android.reportcard.model;

/**
 * Created by Tanaskovic on 2/24/2018.
 */

public class Subject {


    private String mSubject;
    private int mResourceId;
    private String mColor;
    private int mMark;

    public Subject(String subject, int resourceId, String color, int mark) {
        this.mSubject = subject;
        this.mResourceId = resourceId;
        this.mColor = color;
        this.mMark = mark;
    }

    public Subject(String subject, int mark) {
        this.mSubject = subject;
        this.mMark = mark;
    }

    public String getSubject() {
        return mSubject;
    }

    public void setSubject(String subject) {
        this.mSubject = subject;
    }

    public int getResourceId() {
        return mResourceId;
    }

    public void setResourceId(int resourceId) {
        this.mResourceId = resourceId;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        this.mColor = color;
    }

    public int getMark() {
        return mMark;
    }

    public void setMark(int mark) {
        this.mMark = mark;
    }

    @Override
    public String toString() {
        return  mSubject  +
                ": " + mMark+";\n";
    }
}
