package app.com.example.android.my_applications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openApp1(View view){
        showToast(view);
    }

    public void openApp2(View view){
        showToast(view);
    }

    public void openApp3(View view){
        showToast(view);
    }

    public void openApp4(View view){
        showToast(view);
    }

    public void openApp5(View view){
        showToast(view);
    }

    public void showToast(View view){
        Button buttonApp = (Button) view;
        String nameOfApp = (String) buttonApp.getText();
        Toast.makeText(this, "启动" + nameOfApp, Toast.LENGTH_LONG).show();
    }
}
