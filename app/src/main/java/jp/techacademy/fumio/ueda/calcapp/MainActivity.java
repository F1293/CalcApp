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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
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
        float num1 = Float.valueOf(str1);
        float num2 = Float.valueOf(str2);
        //floatの値に変換
        intent.putExtra("VALUE1", 10);
        intent.putExtra("VALUE2", 20);
        startActivity(intent);
    }
}
