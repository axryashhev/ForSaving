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

        TextView type = (TextView) findViewById(R.id.textType);
        type.setText(CostsModel.TYPE_MOTION);

        TextView title = (TextView) findViewById(R.id.textTitle);
        title.setText(costsModel.getTitle());

        TextView date = (TextView) findViewById(R.id.textDate);
        date.setText(costsModel.getDate().toString());

        TextView amount = (TextView) findViewById(R.id.textAmount);
        amount.setText(String.valueOf(costsModel.getAmount()));

        TextView description = (TextView) findViewById(R.id.textDescription);
        description.setText(costsModel.getDescription());
    }
}
