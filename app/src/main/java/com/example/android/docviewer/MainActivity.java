package com.example.android.docviewer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private final int NUM_LIST_ITEMS = 100;

    private DocsAdapter mAdapter;
    private RecyclerView mDocsList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.docs_list);

        mDocsList = findViewById(R.id.rv_list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mDocsList.setLayoutManager(layoutManager);

        mDocsList.setHasFixedSize(true);

        mAdapter = new DocsAdapter("Name of file", NUM_LIST_ITEMS);
        mDocsList.setAdapter(mAdapter);
    }
}
