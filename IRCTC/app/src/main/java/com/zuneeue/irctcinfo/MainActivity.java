package com.zuneeue.irctcinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.zuneeue.irctcinfo.Utils.ConstantValue;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        Call<PnrData> pnrData = AppController.railwayService.getPnr(pnrNo, ConstantValue.API_KEY);
        pnrData.enqueue(new Callback<PnrData>() {
            @Override
            public void onResponse(Call<PnrData> call, Response<PnrData> response) {

                Log.e("getTrainName", response.body().getTrainName());
                Log.e("getTrainNum", response.body().getTrainNum());
                Log.e("getTotalPassengers", response.body().getTotalPassengers()+"");
                Log.e("getFromStation", response.body().getFromStation().getName());
                Log.e("getFromStation", response.body().getToStation().getName());


            }

            @Override
            public void onFailure(Call<PnrData> call, Throwable t) {

            }
        });
    }
}
