package com.example.madassessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddPlaceToStay extends AppCompatActivity implements View.OnClickListener {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_place);

        Intent intent = new Intent();
        Bundle bundle = new Bundle();

        Button btnGo = (Button) findViewById(R.id.btn1);
        Button btnClear = (Button) findViewById(R.id.btn2);

        btnGo.setOnClickListener(this);
        btnClear.setOnClickListener(this);

        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
    }

    @Override
    public void onClick(View view) {

        EditText poiName = (EditText)findViewById(R.id.poiName);
        EditText poiType = (EditText)findViewById(R.id.poiType);
        EditText poiPrice = (EditText)findViewById(R.id.poiPrice);

        switch (view.getId()) {
            case R.id.btn1:
                System.out.println("To be implemented");
                break;

            case R.id.btn2:
                poiName.setText(null);
                poiType.setText(null);
                poiPrice.setText(null);
                break;

            default:
                break;

        }
    }

}
