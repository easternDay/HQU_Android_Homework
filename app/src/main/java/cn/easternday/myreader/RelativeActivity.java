package cn.easternday.myreader;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * @author EasternDay
 */
public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        final RelativeLayout iRelative = (RelativeLayout)findViewById(R.id.Layout4Relative);
        //返回主界面按钮监听
        Button buttonBack = (Button)this.findViewById(R.id.Button4Back_Relative);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //结束当前页面
                RelativeActivity.this.finish();
            }
        });
    }
}
