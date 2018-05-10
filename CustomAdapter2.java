package com.example.ujjawal_pc.symptomchecker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.MyViewHolder> {

    private ArrayList<DictObjectModel2> dataSet;
    Boolean check = false;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView worddo, meaningdo;

        RelativeLayout expandabledo;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.expandabledo = (RelativeLayout) itemView.findViewById(R.id.expandableLayout2);
            this.worddo = (TextView) itemView.findViewById(R.id.wordtext2);
            this.meaningdo= (TextView) itemView.findViewById(R.id.meaningtext2);

        }
    }

    public CustomAdapter2(ArrayList<DictObjectModel2> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_doctor, parent, false);

        final MyViewHolder myViewHolder = new MyViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!check) {
                    myViewHolder.expandabledo.animate()
                            .alpha(0.0f)
                            .setDuration(1000);


                    myViewHolder.expandabledo.setVisibility(View.GONE);
                    check = true;
                    //  myViewHolder.schedule.setVisibility(View.VISIBLE);

                } else {
                    myViewHolder.expandabledo.setVisibility(View.VISIBLE);
                    myViewHolder.expandabledo.animate()
                            .alpha(1.0f)
                            .setDuration(1000);

                    check = false;

                }
            }
        });

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView word2 = holder.worddo;
        TextView meaning2 = holder.meaningdo;

        word2.setText(dataSet.get(listPosition).getWord());
        meaning2.setText(dataSet.get(listPosition).getMeaning());

    }
    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
