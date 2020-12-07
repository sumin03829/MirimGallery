package kr.hs.emirim.s2019s38.mirimgallery;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GalleryAdapter extends BaseAdapter {
    int[] imgRes= {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,
            R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p};
    String[] title={"벼랑 위의 포뇨","이웃집 토토로","추억의 마니","붉은돼지","바람계곡의 나우시카",
            "센과 치히로의 행방불명","하울의 움직이는 성","귀를 기울이면","추억은 방울방울",
            "바다가 들린다","마녀배달부 키키","고양이의 보은","천공의 성 라퓨타",
            "마루 밑 아리에티","원령공주","게드전기",};

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
        final View toastView=View.inflate(context,R.layout.toast_activity,null);
        final TextView textTitle=toastView.findViewById(R.id.text_title);

        final int pos=position;
        imgV.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imgvMain.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imgvMain.setImageResource(imgRes[pos]);
                Toast toast=new Toast(context);
                textTitle.setText(title[pos]);
                toast.setView(toastView);
                toast.show();
                return false;
            }
        });
        return null;
    }
}
