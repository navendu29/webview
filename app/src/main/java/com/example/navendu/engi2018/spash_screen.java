package com.example.navendu.engi2018;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

/**
 * Created by navendu on 9/12/17.
 */

public class spash_screen extends AppCompatActivity {


    protected void onCreate(Bundle sa){


        super.onCreate(sa);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
         setContentView(R.layout.videosplash);

        getSupportActionBar().hide();


            VideoView v=(VideoView)findViewById(R.id.v1);

            Uri path = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
            v.setVideoURI(path);
            v.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {


                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                      jump();
                }


            });
            v.start();


        
//        catch(Exception e){
//
//            jump();
//
//        }
    }
    private void jump(){

        if(isFinishing())
            return;
        startActivity(new Intent(this,MainActivity.class));
        finish();

    }



}
