package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.TextView;

import com.example.animation.databinding.ActivityExampleBinding;

public class ExampleActivity extends AppCompatActivity {
    ActivityExampleBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_example);
        TextView textView= findViewById(R.id.text);
        // arcTo() and PathInterpolator only available on API 21+


        ObjectAnimator animation = ObjectAnimator.ofFloat(textView, "translationX", 200f);
        animation.setDuration(2000);
        animation.start();

//        ValueAnimator fadeAnim = ObjectAnimator.ofFloat(mBinding.text, "alpha", 1f, 0f);
//        fadeAnim.setDuration(250);
//        fadeAnim.addListener(new AnimatorListenerAdapter() {
//            public void onAnimationEnd(Animator animation) {
//                balls.remove(((ObjectAnimator) animation).getTarget());
//            }
//        });
    }
}