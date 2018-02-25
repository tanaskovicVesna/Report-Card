package com.example.android.reportcard.adapters;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.reportcard.R;
import com.example.android.reportcard.model.Student;

import java.util.List;

/**
 * Created by Tanaskovic on 2/23/2018.
 */

public class StudentAdapter extends ArrayAdapter<Student> {

    public StudentAdapter(Context context, List<Student> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Student currentStudent = getItem(position);

        TextView nameTextView = (TextView)listItemView.findViewById(R.id.student_name);
        nameTextView.setText(currentStudent.getStudentName());

        ImageView iconImageView = (ImageView)listItemView.findViewById(R.id.list_item_icon);
        iconImageView.setImageResource(currentStudent.getImageRecourceId());

        listItemView.setBackgroundColor(Color.parseColor(currentStudent.getColor()));

        return listItemView;
    }
}
