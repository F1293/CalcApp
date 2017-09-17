package jp.techacademy.fumio.ueda.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        //テキストの値を取得
        String str1 = editText1.getText().toString();
        String str2 = editText2.getText().toString();
        //Stringの変数に入れる

        String fr = "";
        //四則

        switch (v.getId()) {
            case R.id.button1 :
                fr = "+";
                break;
            case R.id.button2 :
                fr = "-";
                break;
            case R.id.button3 :
                fr = "*";
                break;
            case R.id.button4 :
                fr = "/";
            //default:
                break;
        }

        intent.putExtra("STR1", str1);
        intent.putExtra("STR2", str2);
        intent.putExtra("FR", fr);
        startActivity(intent);
        //値を送る
    }
}
