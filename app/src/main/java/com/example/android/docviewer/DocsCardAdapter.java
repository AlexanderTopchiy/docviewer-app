package com.example.android.docviewer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DocsCardAdapter extends RecyclerView.Adapter<DocsCardAdapter.DocViewHolder> {

    // Name of doc in item.
    private String mNameOfDocItem;

    private int mNumberItems;


    /**
     * Construct the DocAdapter that accepts a name of doc file.
     *
     * @param nameOfDocItem is the name of doc.
     * @param numberItems   is tha number of items to display in this list.
     */
    public DocsCardAdapter(String nameOfDocItem, int numberItems) {
        mNameOfDocItem = nameOfDocItem;
        mNumberItems = numberItems;
    }

    /**
     * This gets called when each new ViewHolder is created.
     *
     * @param parent   The ViewGroup that these ViewHolders are contained within.
     * @param viewType is the type of different layout.
     * @return a new DocViewHolder that holds the View for each list item.
     */
    @NonNull
    @Override
    public DocsCardAdapter.DocViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.docs_card_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        DocsCardAdapter.DocViewHolder viewHolder = new DocsCardAdapter.DocViewHolder(view);

        return viewHolder;
    }

    /**
     * This method is called by the RecyclerView to display the data at the specified position.
     *
     * @param holder   id the ViewHolder which should be updated.
     * @param position is the position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull DocsCardAdapter.DocViewHolder holder, int position) {
        holder.bind(position);
    }

    /**
     * This method simply returns the number of items to display. It is used behind the scenes
     * to help layout our Views and for animations.
     *
     * @return the number of items available.
     */
    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    /**
     * Cache of the children views for a list item.
     */
    public class DocViewHolder extends RecyclerView.ViewHolder {

        // Text for item.
        TextView itemTextView;


        /**
         * Construct our VIewHolder.
         *
         * @param itemView is the view that inflate.
         */
        public DocViewHolder(View itemView) {
            super(itemView);

            itemTextView = itemView.findViewById(R.id.tv_card);
        }


        /**
         * A method we wrote for convenience. This method will take an integer as input and
         * use that integer to display the appropriate text within a list item.
         *
         * @param listIndex is the position of the item in the list.
         */
        void bind(int listIndex) {
            itemTextView.setText(mNameOfDocItem);
        }
    }
}
