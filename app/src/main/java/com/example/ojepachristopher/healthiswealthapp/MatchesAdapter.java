package com.example.ojepachristopher.healthiswealthapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MatchesAdapter extends ArrayAdapter<Match> {

    Context context;
    private ArrayList<Match> matches;

    public MatchesAdapter(Context context, int textViewResourceId, ArrayList<Match> items) {
        super(context, textViewResourceId, items);
        this.context = context;
        this.matches = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.match, null);
        }
        Match match = matches.get(position);
        if (match != null) {
            TextView date = (TextView) v.findViewById(R.id.year);
            TextView time = (TextView) v.findViewById(R.id.month);
            TextView result = (TextView) v.findViewById(R.id.awayTeam);
            TextView comment = (TextView) v.findViewById(R.id.homeTeam);
            date.setText(String.valueOf(match.getDate()));
            time.setText(String.valueOf(match.getTime()));
            result.setText(String.valueOf(match.getResult()));
            comment.setText(String.valueOf(match.getComment()));
        }
        return v;
    }
}
