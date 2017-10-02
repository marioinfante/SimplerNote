package com.marioinfante.simplernote;

import android.app.Activity;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Omar on 9/23/2017.
 */

public class AndroidListAdapter extends ArrayAdapter {
    String[] androidListViewStrings;
    Integer[] imagesId;
    Context context;

    public AndroidListAdapter(Activity context,Integer[] imagesId, String[] textListView){
        super(context, R.layout.list_item_layout, textListView);
        this.androidListViewStrings = textListView;
        this.imagesId = imagesId;
        this.context = context;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewRow = layoutInflater.inflate(R.layout.list_item_layout, null, true);
        TextView mtextView = (TextView) viewRow.findViewById(R.id.text_view);
        mtextView.setText(androidListViewStrings[i]);
        return viewRow;
    }
}
