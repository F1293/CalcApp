package jp.techacademy.fumio.ueda.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String answer = intent.getStringExtra("ANS");
        //送った値を取得


        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("答えは" + String.valueOf(answer) + "です。");

    }
}
