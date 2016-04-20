package com.echozyk.udacity.myapplicationportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_spotify_steamer;
    private Button btn_scores_app;
    private Button btn_library_app;
    private Button btn_build_it_bigger;
    private Button btn_bacon_reader;
    private Button btn_capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        setListener(btn_spotify_steamer,btn_scores_app,btn_library_app,
                btn_build_it_bigger,btn_bacon_reader,btn_capstone);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_spotify_steamer:
                Toast.makeText(this,"SPOTIFY STREAMER",Toast.LENGTH_LONG).show();
            break;
            case R.id.btn_scores_app:
                Toast.makeText(this,"SCORES APP",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_library_app:
                Toast.makeText(this,"LIBRARY APP",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_build_it_bigger:
                Toast.makeText(this,"BUILD IT BIGGER",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_bacon_reader:
                Toast.makeText(this,"BACON READER",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(this,"CAPSTONE: MY OWN APP",Toast.LENGTH_LONG).show();
                break;
            default:
                break;

        }

    }

    private void setListener(View...views) {
        for (View view:views){
            view.setOnClickListener(this);
        }
    }

    private void initUI() {
        btn_spotify_steamer = (Button) findViewById(R.id.btn_spotify_steamer);
        btn_scores_app = (Button) findViewById(R.id.btn_scores_app);
        btn_library_app = (Button) findViewById(R.id.btn_library_app);
        btn_build_it_bigger = (Button) findViewById(R.id.btn_build_it_bigger);
        btn_bacon_reader = (Button) findViewById(R.id.btn_bacon_reader);
        btn_capstone = (Button) findViewById(R.id.btn_capstone);
    }


}
