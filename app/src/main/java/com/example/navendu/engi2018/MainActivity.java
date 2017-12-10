package com.example.navendu.engi2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jawnnypoo.physicslayout.Physics;
import com.jawnnypoo.physicslayout.PhysicsFrameLayout;
import com.squareup.picasso.Picasso;

import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.World;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TESTING";

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.physics_layout)
    PhysicsFrameLayout physicsLayout;
    @BindView(R.id.physics_switch)
    SwitchCompat physicsSwitch;
    @BindView(R.id.fling_switch)
    SwitchCompat flingSwitch;
    @BindView(R.id.impulse_button)
    View impulseButton;
    @BindView(R.id.add_view_button)
    View addViewButton;
    @BindView(R.id.collision)
    TextView collisionView;

    int catIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        physicsSwitch.setChecked(physicsLayout.getPhysics().isPhysicsEnabled());
        physicsSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    physicsLayout.getPhysics().enablePhysics();
                } else {
                    physicsLayout.getPhysics().disablePhysics();
                    for (int i=0; i<physicsLayout.getChildCount(); i++) {
                        physicsLayout.getChildAt(i)
                                .animate().translationY(0).translationX(0).rotation(0);
                    }
                }
            }
        });
        flingSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    physicsLayout.getPhysics().enableFling();
                } else {
                    physicsLayout.getPhysics().disableFling();
                }
            }
        });
        impulseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                physicsLayout.getPhysics().giveRandomImpulse();
            }
        });
        final View circleView = findViewById(R.id.circle);
        addViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(R.drawable.p1);
                LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(
                        getResources().getDimensionPixelSize(R.dimen.square_size),
                        getResources().getDimensionPixelSize(R.dimen.square_size));
                imageView.setLayoutParams(llp);
                imageView.setId(catIndex);
                physicsLayout.addView(imageView);
                Picasso.with(MainActivity.this)
                        .load("http://lorempixel.com/200/200/cats/" + ((catIndex % 10) + 1))
                        .placeholder(R.drawable.p2)
                        .into(imageView);
                catIndex++;
            }
        });


        for (int i=0; i<physicsLayout.getChildCount(); i++) {
            ImageView imageView = (ImageView) physicsLayout.getChildAt(i);
            imageView.setId(i);
            Picasso.with(this)
                    .load("http://lorempixel.com/200/200/cats/" + (i + 1))
                    .placeholder(R.drawable.p1)
                    .into(imageView);
        }
        catIndex = physicsLayout.getChildCount();

        physicsLayout.getPhysics().setOnCollisionListener(new Physics.OnCollisionListener() {
            @Override
            public void onCollisionEntered(int viewIdA, int viewIdB) {
                collisionView.setText(viewIdA + " collided with " + viewIdB);
            }

            @Override
            public void onCollisionExited(int viewIdA, int viewIdB) {

            }
        });

        physicsLayout.getPhysics().addOnPhysicsProcessedListener(new Physics.OnPhysicsProcessedListener() {
            @Override
            public void onPhysicsProcessed(Physics physics, World world) {
                Body body = physics.findBodyById(circleView.getId());
                if (body != null) {
                    body.applyAngularImpulse(0.001f);
                } else {
                    Log.e(TAG, "Cannot rotate, body was null");
                }
            }
        });

        physicsLayout.getPhysics().setOnBodyCreatedListener(new Physics.OnBodyCreatedListener() {
            @Override
            public void onBodyCreated(View view, Body body) {
                Log.d(TAG, "Body created for view " + view.getId());
            }
        });
    }
}
