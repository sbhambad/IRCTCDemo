package com.zuneeue.irctcinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.zuneeue.irctcinfo.activities.TrainScheduleList;

public class TrainScheduleActivity extends AppCompatActivity {

    Toolbar mToolbar;
    Button search;
    EditText train;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_schedule);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("Train Schedule");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initializeViews();

    }

    private void initializeViews() {
        search = (Button) findViewById(R.id.button_search);
        train = (EditText) findViewById(R.id.train);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrainScheduleActivity.this, TrainScheduleList.class);
                intent.putExtra("train", train.getText().toString());
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
