package cn.easternday.myreader;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        //跳转线性布局按钮监听
        Button buttonLinear = (Button) this.findViewById(R.id.Button2Linear);
        buttonLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 打开另一个activity，通过意图，意图作用是激活其他组件
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, LinearActivity.class);
                //发送意图.将意图发送给android系统，系统根据意图来激活组件
                startActivity(intent);
            }
        });
        //跳转相对布局按钮监听
        Button buttonRelative = (Button) this.findViewById(R.id.Button2Relative);
        buttonRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 打开另一个activity，通过意图，意图作用是激活其他组件
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, RelativeActivity.class);
                //发送意图.将意图发送给android系统，系统根据意图来激活组件
                startActivity(intent);
            }
        });
        //跳转帧布局按钮监听
        Button buttonFrame = (Button) this.findViewById(R.id.Button2Frame);
        buttonFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 打开另一个activity，通过意图，意图作用是激活其他组件
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, FrameActivity.class);
                //发送意图.将意图发送给android系统，系统根据意图来激活组件
                startActivity(intent);
            }
        });
        //跳表格布局按钮监听
        Button buttonTable = (Button) this.findViewById(R.id.Button2Table);
        buttonTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 打开另一个activity，通过意图，意图作用是激活其他组件
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, TableActivity.class);
                //发送意图.将意图发送给android系统，系统根据意图来激活组件
                startActivity(intent);
            }
        });
        //跳网格布局按钮监听
        Button buttonGrid = (Button) this.findViewById(R.id.Button2Grid);
        buttonGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 打开另一个activity，通过意图，意图作用是激活其他组件
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, GridActivity.class);
                //发送意图.将意图发送给android系统，系统根据意图来激活组件
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
