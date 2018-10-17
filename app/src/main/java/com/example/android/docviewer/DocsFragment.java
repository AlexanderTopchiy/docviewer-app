package com.example.android.docviewer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A {@link Fragment} subclass that displays a list of docs.
 */
public class DocsFragment extends Fragment {

    private final int NUM_LIST_ITEMS = 100;

    private DocsAdapter mListAdapter;
    private RecyclerView mDocsList;
    private DocsCardAdapter mCardAdapter;
    private RecyclerView mDocsCard;


    public DocsFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        // Inflate current View object in docs_list.xml
        View rootView = inflater.inflate(R.layout.docs_list, container, false);

        mDocsCard = rootView.findViewById(R.id.rv_card);
        LinearLayoutManager layoutCardManeger =
                new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mDocsCard.setLayoutManager(layoutCardManeger);
        mDocsCard.setHasFixedSize(true);
        mCardAdapter = new DocsCardAdapter("Name of file", NUM_LIST_ITEMS);
        mDocsCard.setAdapter(mCardAdapter);

        mDocsList = rootView.findViewById(R.id.rv_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mDocsList.setLayoutManager(layoutManager);
        mDocsList.setHasFixedSize(true);
        mListAdapter = new DocsAdapter("Name of file", NUM_LIST_ITEMS);
        mDocsList.setAdapter(mListAdapter);

        return rootView;
    }
}
