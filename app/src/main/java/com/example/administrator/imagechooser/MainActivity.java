package com.example.administrator.imagechooser;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        listenerForButton();
    }

    private void listenerForButton() {
        button.setOnClickListener(this);
    }

    private void initViews() {
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                View v = getLayoutInflater().inflate(R.layout.bottom_sheet, null);
                BottomSheetDialog dialog = new BottomSheetDialog(this);
                dialog.setContentView(v);
                dialog.show();
                break;
        }
    }


}
