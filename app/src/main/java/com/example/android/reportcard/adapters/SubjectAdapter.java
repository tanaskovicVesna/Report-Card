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

import com.example.android.reportcard.model.Subject;

import java.util.List;

/**
 * Created by Tanaskovic on 2/23/2018.
 */

public class SubjectAdapter  extends ArrayAdapter<Subject> {
    public SubjectAdapter(Context context, List<Subject> objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.subject_list_item, parent, false);
        }

        Subject currentSubject = getItem(position);

        TextView nameTextView = (TextView)listItemView.findViewById(R.id.subject_text_view);
        nameTextView.setText(currentSubject.getSubject());

        TextView markTextView = (TextView)listItemView.findViewById(R.id.mark_text_view);
        markTextView.setText(String.valueOf(currentSubject.getMark()));

        ImageView iconImageView = (ImageView)listItemView.findViewById(R.id.subject_icon);
        iconImageView.setImageResource(currentSubject.getResourceId());

        listItemView.setBackgroundColor(Color.parseColor(currentSubject.getColor()));

        return listItemView;
    }
}
