package com.example.cj.projectzero_verify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static Toast mToast=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Button1 = (Button) findViewById(R.id.button1);
        Button Button2 = (Button) findViewById(R.id.button2);
        Button Button3 = (Button) findViewById(R.id.button3);
        Button Button4 = (Button) findViewById(R.id.button4);
        Button Button5 = (Button) findViewById(R.id.button5);
    }
    public void btnClick(View v){
        switch (v.getId()){
            case R.id.button1:
                //TODO SOMETHING
                showToast(R.string.button1);
                break;
            case R.id.button2:
                showToast(R.string.button2);
                break;
            case R.id.button3:
                showToast(R.string.button3);
                break;
            case R.id.button4:
                showToast(R.string.button4);
                break;
            case R.id.button5:
                showToast(R.string.button5);
                break;


        }
    }
    private void showToast(int resId){
        if(mToast==null){
            mToast=Toast.makeText(this,resId,Toast.LENGTH_SHORT);
        }else{
            mToast.setText(resId);
        }
        mToast.show();
    }
}
