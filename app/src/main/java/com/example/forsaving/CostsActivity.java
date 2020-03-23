package com.example.forsaving;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CostsActivity extends AppCompatActivity {

    public static final String EXTRA_COSTS = "costsId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costs);

        int costsId = (Integer)getIntent().getExtras().get(EXTRA_COSTS);
        CostsModel costsModel = CostsModel.modelsCosts[costsId];

        TextView title = (TextView) findViewById(R.id.textTitle);
        title.setText(costsModel.getTitle());

        TextView date = (TextView) findViewById(R.id.textDate);
        title.setText(costsModel.getDate().toString());

        TextView amount = (TextView) findViewById(R.id.textAmount);
        title.setText(String.valueOf(amount));

        TextView description = (TextView) findViewById(R.id.textDescription);
        title.setText(costsModel.getDescription());
    }
}
