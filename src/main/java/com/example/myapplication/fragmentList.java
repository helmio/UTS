package com.example.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

//22-05-2019 10116298 M Helmy IF7
public class fragmentList extends Fragment {
    public fragmentList() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);
        ListView listview =(ListView) rootView.findViewById(R.id.list);
        final String[] nama = new String[] {"Heddy C F", "Rouldy Ahlamudin", "Hadi Sulaksono"};
        final String[] nim = new String[] {"10116309", "10116283", "10116303"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, nama);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity().getApplicationContext(), nim[i], Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}

