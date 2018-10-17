package com.example.android.docviewer;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DocsFragment();
            case 1:
                return new DocsFragment();
            case 2:
                return new DocsFragment();
            default:
                return null;
        }
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.tab_all);
            case 1:
                return mContext.getString(R.string.tab_sections);
            case 2:
                return mContext.getString(R.string.tab_favorites);
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 3;
    }
}
