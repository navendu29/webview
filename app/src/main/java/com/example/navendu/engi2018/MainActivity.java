package com.example.navendu.engi2018;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

private de.hdodenhof.circleimageview.CircleImageView n1;
    private de.hdodenhof.circleimageview.CircleImageView n2;
    private de.hdodenhof.circleimageview.CircleImageView n3;
    private de.hdodenhof.circleimageview.CircleImageView n4;
    private de.hdodenhof.circleimageview.CircleImageView n5;
    private de.hdodenhof.circleimageview.CircleImageView n6;
    private de.hdodenhof.circleimageview.CircleImageView n7;
    private de.hdodenhof.circleimageview.CircleImageView n8;
    private de.hdodenhof.circleimageview.CircleImageView c1;
    private de.hdodenhof.circleimageview.CircleImageView c2;
    private de.hdodenhof.circleimageview.CircleImageView c3;
    private de.hdodenhof.circleimageview.CircleImageView c4;
    private de.hdodenhof.circleimageview.CircleImageView c5;
    private de.hdodenhof.circleimageview.CircleImageView c6;
    private de.hdodenhof.circleimageview.CircleImageView c7;
    private de.hdodenhof.circleimageview.CircleImageView c8;

    private de.hdodenhof.circleimageview.CircleImageView q1;
    private de.hdodenhof.circleimageview.CircleImageView q2;
    private de.hdodenhof.circleimageview.CircleImageView q3;
    private de.hdodenhof.circleimageview.CircleImageView q4;
    private de.hdodenhof.circleimageview.CircleImageView q5;
    private de.hdodenhof.circleimageview.CircleImageView q6;



    long animationduration=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
n1=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.n1);
        n2=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.n2);
        n3=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.n3);
        n4=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.n4);
        n5=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.n5);
        n6=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.n6);
        n7=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.n7);
        n8=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.n8);
        c1=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.c1);
        c2=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.c2);

        c3=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.c3);
        c4=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.c4);

        c5=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.c5);
        c6=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.c6);

        c7=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.c7);
        c8=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.c8);

        q1=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.q1);
        q2=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.q2);

        q3=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.q3);
        q4=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.q4);

        q5=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.q5);
        q6=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.q6);


    }
public void handleanimate(View view){






    ObjectAnimator animatorX1= ObjectAnimator.ofFloat(n1,"x",500f);
    ObjectAnimator animatorX2= ObjectAnimator.ofFloat(n2,"x",550f);
    ObjectAnimator animatorX3= ObjectAnimator.ofFloat(n3,"x",600f);
    ObjectAnimator animatorX4= ObjectAnimator.ofFloat(n4,"x",650f);
    ObjectAnimator animatorX5= ObjectAnimator.ofFloat(n5,"x",700f);
    ObjectAnimator animatorX6= ObjectAnimator.ofFloat(n6,"x",750f);
    ObjectAnimator animatorX7= ObjectAnimator.ofFloat(n7,"x",800f);
    ObjectAnimator animatorX8= ObjectAnimator.ofFloat(n8,"x",850f);



    ObjectAnimator animatorp1= ObjectAnimator.ofFloat(c1,"x",350f);
    ObjectAnimator animatorp2= ObjectAnimator.ofFloat(c2,"x",300f);
    ObjectAnimator animatorp3= ObjectAnimator.ofFloat(c3,"x",250f);
    ObjectAnimator animatorp4= ObjectAnimator.ofFloat(c4,"x",200f);
    ObjectAnimator animatorp5= ObjectAnimator.ofFloat(c5,"x",150f);
    ObjectAnimator animatorp6= ObjectAnimator.ofFloat(c6,"x",100f);
    ObjectAnimator animatorp7= ObjectAnimator.ofFloat(c7,"x",50f);
    ObjectAnimator animatorp8= ObjectAnimator.ofFloat(c8,"x",10f);








    ObjectAnimator animatory1= ObjectAnimator.ofFloat(q1,"y",950f);

    ObjectAnimator animatory11= ObjectAnimator.ofFloat(q1,"x",300f);

    ObjectAnimator animatory2= ObjectAnimator.ofFloat(q2,"y",750f);
    //ObjectAnimator animatory22= ObjectAnimator.ofFloat(q2,"x",5f);



    ObjectAnimator animatory3= ObjectAnimator.ofFloat(q3,"y",500f);
    ObjectAnimator animatory4= ObjectAnimator.ofFloat(q4,"y",750f);
    ObjectAnimator animatory5= ObjectAnimator.ofFloat(q5,"y",950f);

    ObjectAnimator animatory55= ObjectAnimator.ofFloat(q5,"x",500f);

//    ObjectAnimator animatory6= ObjectAnimator.ofFloat(q6,"y",1200f);





    animatory11.setDuration(animationduration);

    animatory1.setDuration(animationduration);
    animatory2.setDuration(animationduration);
   // animatory22.setDuration(animationduration);


    animatory3.setDuration(animationduration);
    animatory4.setDuration(animationduration);
    animatory5.setDuration(animationduration);
    animatory55.setDuration(animationduration);


    // animatory6.setDuration(animationduration);






    animatorX1.setDuration(animationduration);
    animatorX2.setDuration(animationduration);
    animatorX3.setDuration(animationduration);
    animatorX4.setDuration(animationduration);
    animatorX5.setDuration(animationduration);
    animatorX6.setDuration(animationduration);
    animatorX7.setDuration(animationduration);
    animatorX8.setDuration(animationduration);



    animatorp1.setDuration(animationduration);
    animatorp2.setDuration(animationduration);
    animatorp3.setDuration(animationduration);
    animatorp4.setDuration(animationduration);
    animatorp5.setDuration(animationduration);
    animatorp6.setDuration(animationduration);
    animatorp7.setDuration(animationduration);
    animatorp8.setDuration(animationduration);










    AnimatorSet  animatorset=new AnimatorSet();
    animatorset.playTogether(animatorX1,animatorX2,animatorX3,animatorX4,animatorX5,animatorX6,animatorX7,animatorX8,animatorp1,animatorp2,animatorp3,animatorp4,animatorp5,animatorp6,animatorp7,animatorp8,animatory1,animatory2,animatory3,animatory4,animatory5,animatory11,animatory55);
    animatorset.start();
}

}
