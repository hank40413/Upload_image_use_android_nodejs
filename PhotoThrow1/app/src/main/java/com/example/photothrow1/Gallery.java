package com.example.photothrow1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Gallery extends Activity {

    private ScrollAdapter mAdapter;
    private RecyclerView mRecyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        mRecyclerView = (RecyclerView) findViewById(R.id.gallery_list_view);

        ArrayList<String> myDataset = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            myDataset.add(Integer.toString(i));
        }
        mAdapter = new ScrollAdapter(myDataset, ScrollAdapter.GALLERY);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
