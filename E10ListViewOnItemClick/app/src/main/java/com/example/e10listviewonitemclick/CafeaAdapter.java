package com.example.e10listviewonitemclick;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CafeaAdapter extends BaseAdapter {

    private Context ctx;
    private List<Cafea> cafele;

    public CafeaAdapter(Context ctx, List<Cafea> cafele) {
        this.ctx = ctx;
        this.cafele = cafele;
    }

    @Override
    public int getCount() {
        return this.cafele.size();
    }

    @Override
    public Object getItem(int position) {
        return this.cafele.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View v = inflater.inflate(R.layout.item_layout, parent,false);
        ImageView iv = v.findViewById(R.id.imageView);
        TextView tv1 = v.findViewById(R.id.text1);
        TextView tv2 = v.findViewById(R.id.text2);
        Cafea c = (Cafea) getItem(position);
        iv.setImageResource(c.getImage());
        tv1.setText(c.getAroma());
        tv2.setText("" + c.getCantitate());
        return v;
    }
}
