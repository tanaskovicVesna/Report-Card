package com.example.android.reportcard.activities;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.reportcard.R;
import com.example.android.reportcard.adapters.StudentAdapter;
import com.example.android.reportcard.dialog.AboutDialog;
import com.example.android.reportcard.model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student(getString(R.string.pupilfirst), R.drawable.pupil,getString(R.string.physicsColor)));
        list.add(new Student(getString(R.string.pupilsecond), R.drawable.pupilone,getString(R.string.mathematicsColor)));
        list.add(new Student(getString(R.string.pupilthird), R.drawable.pupilthird,getString(R.string.biologyColor)));
        list.add(new Student(getString(R.string.pupilfourth), R.drawable.pupilfourth,getString(R.string.religiousColor)));


        StudentAdapter adapter = new StudentAdapter(this, list);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimpSlifiableIfStatement
        if (id == R.id.about) {
            AlertDialog alertDialog = new AboutDialog(this).prepareDialog();
            alertDialog.show();
            alertDialog.getWindow().setBackgroundDrawableResource(R.color.lightAssetColor);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Intent intent;
        switch (position) {
            case 0:
                intent= new Intent(this,FirstStudentActivity.class);
                startActivity(intent);
                break;
            case 1:
                intent=new Intent(this,SecondStudentActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent=new Intent(this,ThirdStudentActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent=new Intent(this,FourthStudentActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
