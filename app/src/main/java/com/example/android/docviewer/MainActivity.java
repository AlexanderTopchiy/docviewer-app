package com.example.android.docviewer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private final int NUM_LIST_ITEMS = 100;

    private DocsAdapter mListAdapter;
    private RecyclerView mDocsList;
    private DocsCardAdapter mCardAdapter;
    private RecyclerView mDocsCard;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.docs_list);

        mDocsCard = findViewById(R.id.rv_card);
        LinearLayoutManager layoutCardManeger =
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mDocsCard.setLayoutManager(layoutCardManeger);
        mDocsCard.setHasFixedSize(true);
        mCardAdapter = new DocsCardAdapter("Name of file", NUM_LIST_ITEMS);
        mDocsCard.setAdapter(mCardAdapter);

        mDocsList = findViewById(R.id.rv_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mDocsList.setLayoutManager(layoutManager);
        mDocsList.setHasFixedSize(true);
        mListAdapter = new DocsAdapter("Name of file", NUM_LIST_ITEMS);
        mDocsList.setAdapter(mListAdapter);
    }
}
