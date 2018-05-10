package com.example.ujjawal_pc.symptomchecker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter1 extends RecyclerView.Adapter<CustomAdapter1.MyViewHolder> {

    private ArrayList<DictObjectModel1> dataSet;
    Boolean check = false;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView wordd, meaningd;

        RelativeLayout expandabled;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.expandabled = (RelativeLayout) itemView.findViewById(R.id.expandableLayout1);
            this.wordd = (TextView) itemView.findViewById(R.id.wordtext1);
            this.meaningd = (TextView) itemView.findViewById(R.id.meaningtext1);

        }
    }

    public CustomAdapter1(ArrayList<DictObjectModel1> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_disease, parent, false);

        final MyViewHolder myViewHolder = new MyViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!check) {
                    myViewHolder.expandabled.animate()
                            .alpha(0.0f)
                            .setDuration(1000);


                    myViewHolder.expandabled.setVisibility(View.GONE);
                    check = true;
                    //  myViewHolder.schedule.setVisibility(View.VISIBLE);

                } else {
                    myViewHolder.expandabled.setVisibility(View.VISIBLE);
                    myViewHolder.expandabled.animate()
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

        TextView word1 = holder.wordd;
        TextView meaning1 = holder.meaningd;

        word1.setText(dataSet.get(listPosition).getWord());
        meaning1.setText(dataSet.get(listPosition).getMeaning());

    }
    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
