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

import com.example.android.reportcard.model.SubjectInfo;

import java.util.List;

/**
 * Created by Tanaskovic on 2/25/2018.
 */

public class SubjectInfoAdapter extends ArrayAdapter<SubjectInfo> {
    public SubjectInfoAdapter(Context context, List<SubjectInfo> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.subject_detail_list_item, parent, false);
        }

        SubjectInfo currentSubjectInfo = getItem(position);

        TextView pointsTextView = (TextView)listItemView.findViewById(R.id.points);
        pointsTextView.setText(String.valueOf(currentSubjectInfo.getExamPoints()));

        TextView classesTextView = (TextView)listItemView.findViewById(R.id.classes);
        classesTextView.setText(String.valueOf(currentSubjectInfo.getAttendedClasses()));


        TextView observationTextView = (TextView)listItemView.findViewById(R.id.observation);
        observationTextView.setText(String.valueOf(currentSubjectInfo.getObservation()));

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.subject_image);
        imageView.setImageResource(currentSubjectInfo.getResourceId());
        imageView.setBackgroundColor(Color.parseColor(currentSubjectInfo.getImageColor()));

        listItemView.setBackgroundColor(Color.parseColor(currentSubjectInfo.getColor()));

        return listItemView;
    }

}
