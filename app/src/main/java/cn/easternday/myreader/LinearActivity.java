package cn.easternday.myreader;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * @author EasternDay
 */
public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        //布局
        final LinearLayout iLinear = (LinearLayout)findViewById(R.id.Layout4Linear);
        //按钮——水平
        Button buttonHorizontal = (Button)this.findViewById(R.id.Button2Horizontal);
        buttonHorizontal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                //设置水平布局
                iLinear.setOrientation(0);
            }
        });
        //按钮——垂直
        Button buttonVertical = (Button)this.findViewById(R.id.Button2Vertical);
        buttonVertical.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v){
                //设置垂直布局
                iLinear.setOrientation(1);
                //设置居中
                iLinear.setGravity(Gravity.CENTER_HORIZONTAL);
            }
        });
        //按钮——左对齐
        Button buttonLeft = (Button)this.findViewById(R.id.Button2AlignLeft);
        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RtlHardcoded")
            @Override
            public void onClick(View v){
                //设置左对齐
                iLinear.setGravity(Gravity.LEFT);
            }
        });

        //返回主界面按钮监听
        Button buttonBack = (Button)this.findViewById(R.id.Button4Back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //结束当前页面
                LinearActivity.this.finish();
            }
        });
    }
}
