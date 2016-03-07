package com.zuneeue.irctcinfo.activities;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.zuneeue.irctcinfo.AppController;
import com.zuneeue.irctcinfo.R;
import com.zuneeue.irctcinfo.Utils.ConstantValue;
import com.zuneeue.irctcinfo.adapters.TrainScheduleListAdapter;
import com.zuneeue.irctcinfo.models.routes.Day;
import com.zuneeue.irctcinfo.models.routes.Route;
import com.zuneeue.irctcinfo.models.routes.RouteData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TrainScheduleList extends AppCompatActivity {
    RecyclerView recyclerView;
    TrainScheduleListAdapter trainScheduleListAdapter;
    List<Route> mItems;
    TextView trainName, classTextView;
    List<Day> days;
    TextView[] dayText;
    Toolbar mToolbar;
    List<com.zuneeue.irctcinfo.models.routes.Class> mClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_schedule_list);
        mItems = new ArrayList<>();

        initializeViews();
/*
        Route route = new Route();
        route.setState("asdf");
        route.setFullname("Asdga");
        route.setDistance(213);
        route.setScharr("!@3");
        route.setSchdep("@#5");
        route.setNo(1);
        route.setDay(2);
        mItems.add(route);
        trainScheduleListAdapter.addAll(mItems);*/

        getData();
    }

    private void initializeViews() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getIntent().getStringExtra("train"));
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = (RecyclerView) findViewById(R.id.recyler);
        trainScheduleListAdapter = new TrainScheduleListAdapter(mItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(trainScheduleListAdapter);

        trainName = (TextView) findViewById(R.id.train_name);
        classTextView = (TextView) findViewById(R.id.classes);

        dayText = new TextView[7];
        dayText[0] = (TextView) findViewById(R.id.su);
        dayText[1] = (TextView) findViewById(R.id.m);
        dayText[2] = (TextView) findViewById(R.id.tu);
        dayText[3] = (TextView) findViewById(R.id.w);
        dayText[4] = (TextView) findViewById(R.id.th);
        dayText[5] = (TextView) findViewById(R.id.f);
        dayText[6] = (TextView) findViewById(R.id.sa);
    }

    private void getData() {

        String number = getIntent().getStringExtra("train");
        Call<RouteData> call = AppController.railwayService.getRoute(number, ConstantValue.API_KEY);
        call.enqueue(new Callback<RouteData>() {
            @Override
            public void onResponse(Call<RouteData> call, Response<RouteData> response) {
                mItems = response.body().getRoute();
                trainScheduleListAdapter.addAll(mItems);
                trainName.setText(response.body().getTrain().getName());
                mClass = response.body().getTrain().getClasses();
                //trainNumber.setText(response.body().getTrain().getNumber());
                days = response.body().getTrain().getDays();
                setDayColor();
                setClass();
            }

            @Override
            public void onFailure(Call<RouteData> call, Throwable t) {

            }
        });

    }

    private void setClass() {
        String s = "";
        for (com.zuneeue.irctcinfo.models.routes.Class c : mClass
                ) {
            if (c.getAvailable().equals("Y")) {
                s += c.getClassCode() + " ";
            }
        }
        classTextView.setText(s);

    }

    private void setDayColor() {
        Day day;
        for (int i = 0; i < days.size(); i++) {
            day = days.get(i);
            if (day.getRuns().equals("Y")) {
                dayText[i].setTextColor(ContextCompat.getColor(this, R.color.green));
            } else {
                dayText[i].setTextColor(ContextCompat.getColor(this, R.color.red));
            }
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
