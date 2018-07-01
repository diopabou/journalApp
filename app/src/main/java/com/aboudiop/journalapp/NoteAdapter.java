package com.aboudiop.journalapp;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NoteAdapter  extends ArrayAdapter<JournalNote> {

    public NoteAdapter(Context context, int resource, List<JournalNote> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_note, parent, false);
        }


        TextView titleTextView = (TextView) convertView.findViewById(R.id.noteTextView);


        JournalNote note = getItem(position);
        titleTextView.setText(note.getTitle());



        return convertView;
    }
}
