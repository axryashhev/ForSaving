package com.example.forsaving.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.forsaving.CostsActivity;
import com.example.forsaving.CostsModel;
import com.example.forsaving.R;

public class CostsFragment extends Fragment {

    private static final String TAG = "Costs";

    private PageViewModel pageViewModel;

    public static CostsFragment newInstance(int index) {
        CostsFragment fragment = new CostsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(TAG, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(TAG);
        }
        pageViewModel.setIndex(index);

    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.costs_fragment, container, false);

        ArrayAdapter<CostsModel> listAdapter = new ArrayAdapter<>(root.getContext(), android.R.layout.simple_list_item_1, CostsModel.modelsCosts);
        ListView listCosts = (ListView) root.findViewById(R.id.list_costs);
        listCosts.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(getActivity(), CostsActivity.class);
                        intent.putExtra(CostsActivity.EXTRA_COSTS, (int) l);
                        startActivity(intent);
                    }
                };
        listCosts.setOnItemClickListener(itemClickListener);
        return root;
    }

}
