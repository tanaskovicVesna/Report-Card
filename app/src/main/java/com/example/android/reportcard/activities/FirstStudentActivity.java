package com.example.android.reportcard.activities;


import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.android.reportcard.R;
import com.example.android.reportcard.adapters.SubjectAdapter;
import com.example.android.reportcard.dialog.AboutFirstStudent;
import com.example.android.reportcard.model.Subject;

import java.util.ArrayList;


public class FirstStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject_list);

        ArrayList<Subject> list = new ArrayList<Subject>();

        list.add(new Subject(getString(R.string.mathematics), R.drawable.mathematicsboard,getString(R.string.mathematicsColor),5));
        list.add(new Subject(getString(R.string.serbian), R.drawable.serbian,getString(R.string.whiteColor),4));
        list.add(new Subject(getString(R.string.physics), R.drawable.physics,getString(R.string.physicsColor),5));
        list.add(new Subject(getString(R.string.religious), R.drawable.religiouseducation,getString(R.string.religiousColor),5));
        list.add(new Subject(getString(R.string.biology), R.drawable.biology,getString(R.string.biologyColor),4));
        list.add(new Subject(getString(R.string.german), R.drawable.german,getString(R.string.whiteColor),4));
        list.add(new Subject(getString(R.string.geography), R.drawable.geographyone,getString(R.string.geographyColor),5));
        list.add(new Subject(getString(R.string.history), R.drawable.historyone,getString(R.string.historyColor),5));
        list.add(new Subject(getString(R.string.english), R.drawable.english,getString(R.string.whiteColor),5));
        list.add(new Subject(getString(R.string.chemistry), R.drawable.chemistryone,getString(R.string.chemistryColor),5));
        list.add(new Subject(getString(R.string.physical), R.drawable.physicaleducation,getString(R.string.physicalColor),5));
        list.add(new Subject(getString(R.string.art), R.drawable.arttwo,getString(R.string.artColor),4));
        list.add(new Subject(getString(R.string.musics), R.drawable.music,getString(R.string.musicsColor),2));




        SubjectAdapter adapter = new SubjectAdapter(this, list);
        ListView listView = (ListView)findViewById(R.id.subject_list_view);
        listView.setAdapter(adapter);



        FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.fab);
        myFab.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               AlertDialog alertDialog = new AboutFirstStudent(FirstStudentActivity.this).prepareDialog();
               alertDialog.show();
               alertDialog.getWindow().setBackgroundDrawableResource(R.color.lightAssetColor);
          }
       });
    }
}
