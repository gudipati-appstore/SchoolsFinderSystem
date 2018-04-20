package com.gcoders.schoolinfo.schoolsfindersystem.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.gcoders.schoolinfo.schoolsfindersystem.R;
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolSATResultInfo;
import com.gcoders.schoolinfo.schoolsfindersystem.presenter.SchoolListPresenter;
import com.gcoders.schoolinfo.schoolsfindersystem.view.adapter.SchoolListAdapter;


import java.util.List;

public class SchoolMainActivity extends AppCompatActivity implements SchoolListInfoView {

    private RecyclerView recyclerview_schools_list;
    private SchoolListPresenter schoolListPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerview_schools_list = findViewById(R.id.recyclerview_schools_list);
        recyclerview_schools_list.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false ));


        schoolListPresenter = new SchoolListPresenter(this);
        schoolListPresenter.getSchoolList();
    }


    @Override
    public void schoolListReady(List<SchoolListInfo> schoolListInfoObjects) {

        SchoolListAdapter adapter = new SchoolListAdapter(schoolListInfoObjects, new SchoolListAdapter.SchoolInfoClick() {
            @Override
            public void onSchoolInfoClick(SchoolListInfo schoolListInfo) {
                schoolListPresenter.getSchoolSATResultInfo(schoolListInfo.getDbn());
            }
        });
        recyclerview_schools_list.setAdapter(adapter);
    }

    @Override
    public void schoolInfoClicked(List<SchoolSATResultInfo> schoolSATResultInfos) {

        if( null != schoolSATResultInfos && schoolSATResultInfos.size() > 0) {
            Intent intent = new Intent(this, SchoolSATscoreActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("schoolsatscore", schoolSATResultInfos.get(0));
            intent.putExtras(bundle);
            startActivity(intent);
        } else {
            onFailure("No Results found. Please try a different search..!");
        }
    }

    @Override
    public void onFailure(String errorMessage) {
        Toast.makeText(this , errorMessage, Toast.LENGTH_SHORT).show();
    }
}
