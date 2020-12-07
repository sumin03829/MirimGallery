package kr.hs.emirim.s2019s38.mirimgallery;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryAdapter extends BaseAdapter {
    int[] imgRes= {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,
            R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p};
    Context context;
    ImageView imgvMain;

    public GalleryAdapter(Context context, ImageView imgvMain){
        this.context=context;
        this.imgvMain=imgvMain;
    }

    @Override
    public int getCount() {
        return imgRes.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgV=new ImageView(context);
        imgV.setLayoutParams(new Gallery.LayoutParams(200,300));
        imgV.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgV.setPadding(5,5,5,5);
        imgV.setImageResource(imgRes[position]);

        final int pos=position;
        imgV.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imgvMain.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imgvMain.setImageResource(imgRes[pos]);
                return false;
            }
        });
        return null;
    }
}
