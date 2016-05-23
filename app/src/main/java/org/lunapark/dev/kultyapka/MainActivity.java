package org.lunapark.dev.kultyapka;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnConnect;
    private EditText etAddress;

    private String strAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAddress = (EditText) findViewById(R.id.etAddress);
        btnConnect = (Button) findViewById(R.id.btnConnect);
        btnConnect.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        strAddress = etAddress.getText().toString();
        if (strAddress.isEmpty()) {
            Toast.makeText(this, getString(R.string.msg_enter_addr), Toast.LENGTH_SHORT).show();
        }
    }
}
