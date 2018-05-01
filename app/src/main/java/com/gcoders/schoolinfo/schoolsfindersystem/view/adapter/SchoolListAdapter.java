package com.gcoders.schoolinfo.schoolsfindersystem.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gcoders.schoolinfo.schoolsfindersystem.R;
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo;

import java.util.List;


public class SchoolListAdapter extends RecyclerView.Adapter<SchoolListAdapter.MyViewHolder> {

    private List<SchoolListInfo> schoolListInfoObject;
    private SchoolInfoClickListener buttonClick;

    public SchoolListAdapter(List<SchoolListInfo> schoolListInfoObject, SchoolInfoClickListener buttonClick) {
        this.schoolListInfoObject = schoolListInfoObject;
        this.buttonClick = buttonClick;
    }

    @Override
    public SchoolListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View imageView = inflater.inflate(R.layout.school_list_data, parent, false);

        return new MyViewHolder(imageView);
    }

    @Override
    public void onBindViewHolder(final SchoolListAdapter.MyViewHolder holder, int position) {
        final SchoolListInfo schoolContent = schoolListInfoObject.get(position);

        holder.textview_school_name.setText((position + 1) + ". " + schoolContent.getSchoolName());

        holder.textview_school_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick.onSchoolInfoClick(schoolContent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return schoolListInfoObject.size();
    }


    public interface SchoolInfoClickListener {
        void onSchoolInfoClick(SchoolListInfo schoolListInfo);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textview_school_name;

        MyViewHolder(View itemView) {
            super(itemView);
            textview_school_name = itemView.findViewById(R.id.textview_school_name);
        }
    }
}
