package cn.easternday.myreader;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        //返回主界面按钮监听
        Button buttonBack = (Button)this.findViewById(R.id.Button4Back_Grid);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //结束当前页面
                GridActivity.this.finish();
            }
        });
    }
}
