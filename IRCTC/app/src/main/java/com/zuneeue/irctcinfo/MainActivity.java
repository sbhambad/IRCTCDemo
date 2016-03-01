package com.zuneeue.irctcinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.zuneeue.irctcinfo.activities.FindTrains;

public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("IRCTC");
        setSupportActionBar(mToolbar);

        getPnrFunc("8144989908");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void getPnrFunc(String pnrNo) {

//        Call<PnrData> pnrData = AppController.railwayService.getPnr(pnrNo, ConstantValue.API_KEY);
//        pnrData.enqueue(new Callback<PnrData>() {
//            @Override
//            public void onResponse(Call<PnrData> call, Response<PnrData> response) {
//
//                Log.e("getTrainName", response.body().getTrainName());
//                Log.e("getTrainNum", response.body().getTrainNum());
//                Log.e("getTotalPassengers", response.body().getTotalPassengers() + "");
//                Log.e("getFromStation", response.body().getFromStation().getName());
//                Log.e("getFromStation", response.body().getToStation().getName());
//
//
//            }
//
//            @Override
//            public void onFailure(Call<PnrData> call, Throwable t) {
//
//            }
//        });
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.search_train:
                startActivity(new Intent(this, FindTrains.class));
                break;
            case R.id.fare_enquiry:
                startActivity(new Intent(this, FareEnquiryActivity.class));
                break;
            case R.id.live_train_status:
                break;
            case R.id.pnr_status:
                startActivity(new Intent(this, PNRActivity.class));
                break;
            case R.id.seat_availability:
                break;
            case R.id.train_schedule:
                startActivity(new Intent(this, TrainScheduleActivity.class));
                break;
        }
    }
}
