package com.example.lx;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageViewMainActivity extends AppCompatActivity {

    private Button buttonPrevious, buttonNext;
    private ImageView imageViewFunny;
    private int[] imageIDArray = {R.drawable.funny_1, R.drawable.funny_2
            , R.drawable.funny_3, R.drawable.funny_4, R.drawable.funny_5
            , R.drawable.funny_6
    };
    private int imageIDArrayCurrentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_main);
        buttonPrevious = (Button)findViewById(R.id.button_previous);
        buttonNext =(Button) findViewById(R.id.button_next);
        imageViewFunny = (ImageView)findViewById(R.id.image_view_funny);
        MyButtonClickListener MyButtonClickListener = new MyButtonClickListener();
        buttonNext.setOnClickListener(MyButtonClickListener);
        buttonPrevious.setOnClickListener(MyButtonClickListener);
    }

    private class MyButtonClickListener implements View.OnClickListener {

        @Override

        public void onClick(View view) {
            if (view == buttonNext) {
                imageIDArrayCurrentIndex ++;
                if(imageIDArrayCurrentIndex >= imageIDArray.length)imageIDArrayCurrentIndex = 0;
            } else {
                imageIDArrayCurrentIndex --;
                if(imageIDArrayCurrentIndex < 0)imageIDArrayCurrentIndex = imageIDArray.length-1;
            }
            imageViewFunny.setImageResource(imageIDArray[imageIDArrayCurrentIndex]);
        }
    }
}
