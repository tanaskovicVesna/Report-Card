package com.example.android.reportcard.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.example.android.reportcard.R;
import com.example.android.reportcard.model.Student;
import com.example.android.reportcard.model.Subject;

import java.util.ArrayList;

/**
 * Created by Tanaskovic on 2/25/2018.
 */

public class AboutFourthStudent  extends AlertDialog.Builder{
    public AboutFourthStudent( Context context) {
        super(context);

        Student student = new Student(getContext().getString(R.string.pupilfourth));
        ArrayList<Subject> subjects = new ArrayList<Subject>();

        subjects.add(new Subject(getContext().getString(R.string.mathematics),5));
        subjects.add(new Subject(getContext().getString(R.string.serbian),5));
        subjects.add(new Subject(getContext().getString(R.string.physics),5));
        subjects.add(new Subject(getContext().getString(R.string.religious),5));
        subjects.add(new Subject(getContext().getString(R.string.biology),5));
        subjects.add(new Subject(getContext().getString(R.string.german),5));
        subjects.add(new Subject(getContext().getString(R.string.geography),5));
        subjects.add(new Subject(getContext().getString(R.string.history),5));
        subjects.add(new Subject(getContext().getString(R.string.english),5));
        subjects.add(new Subject(getContext().getString(R.string.chemistry),5));
        subjects.add(new Subject(getContext().getString(R.string.physical),5));
        subjects.add(new Subject(getContext().getString(R.string.art),5));
        subjects.add(new Subject(getContext().getString(R.string.musics),5));

        String message = subjects.get(0).toString();
        double sum = 0;
        for(int i = 1; i<subjects.size(); i++){
            message = message+subjects.get(i).toString();
        }
        for(int i = 0; i<subjects.size(); i++){
            sum = sum + subjects.get(i).getMark();
        }
        double averageMark = sum/subjects.size();
        String achievement=null;

        if(averageMark >= 4.5){achievement = "Exelent";}
        else if(averageMark<4.5){achievement = "Very good";}
        else if(averageMark<3.5){achievement = "Good";}
        else if(averageMark<2.5){achievement = "Bad";}

        setTitle(R.string.app_name);
        setMessage("Student name: "+student.getStudentName()+"\n\n" +achievement+" achievement with average mark: "+String.format("%.2f",averageMark)+"\n\n"+"Subjects and marks: \n\n"+message);
        setCancelable(false);

        setPositiveButton(R.string.dialog_about_yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });
    }

    public AlertDialog prepareDialog(){
        AlertDialog dialog = create();
        dialog.setCanceledOnTouchOutside(false);

        return dialog;
    }
}
