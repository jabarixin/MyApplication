package cn.edu.bupt.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Jabari on 2015/10/19.dev
 * test
 */
public class Hello extends Activity {
    private TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        this.tvHello = (TextView) findViewById(R.id.tvHello);
        TextView tvHello = (TextView) findViewById(R.id.tvHello);
    }
}
