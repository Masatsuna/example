package org.t_robop.masatsuna.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("", "");
    }

    public void click(View view){
        Toast.makeText(this,"ボタンが押されたよ！",Toast.LENGTH_SHORT).show();
    }
}
