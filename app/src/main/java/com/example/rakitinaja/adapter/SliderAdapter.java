package com.example.rakitinaja.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.rakitinaja.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] imgStarts = {
        R.drawable.imag1,
        R.drawable.image2,
        R.drawable.image3
    };

    public String[] headings = {
            "First",
            "Second",
            "Third"
    };

    public String[] descs = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit Cras ac ante a nunc fermentum imperdiet vitae non tortor",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit Cras ac ante a nunc fermentum imperdiet vitae non tortor",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit Cras ac ante a nunc fermentum imperdiet vitae non tortor"
    };

    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slider,container,false);

        ImageView imgStart = (ImageView) view.findViewById(R.id.bg_start);
        TextView heading = (TextView) view.findViewById(R.id.heading_start);
        TextView desc = (TextView) view.findViewById(R.id.desc_start);

        imgStart.setImageResource(imgStarts[position]);
        heading.setText(headings[position]);
        desc.setText(descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}
