package cn.easternday.myreader;

import android.graphics.Color;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class FrameActivity extends AppCompatActivity {

    private int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        final FrameLayout layoutFrame = (FrameLayout) findViewById(R.id.Layout4Frame);
        final TextView frameImage = (TextView) findViewById(R.id.Image4Frame);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()
        {
            @Override
            public void run()
            {
                i++;
                if(i==5) {
                    frameImage.setBackgroundColor(Color.parseColor("#f34649"));
                }
                else if(i==10) {
                    frameImage.setBackgroundColor(Color.parseColor("#94643f"));
                }
                else if(i==15) {
                    frameImage.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    i=0;
                }
            }
        }, 0, 500);

        //返回主界面按钮监听
        Button buttonBack = (Button)this.findViewById(R.id.Button4Back_Frame);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //结束当前页面
                FrameActivity.this.finish();
            }
        });
    }
}
