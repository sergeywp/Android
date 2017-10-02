package com.world.hello.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.world.hello.helloworld.R;

/**
 * Created by Сергей on 10.05.2017.
 */

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ImageView imgView5 = (ImageView) findViewById(R.id.imageView5);
        imgView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //happy
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                intent.putExtra("SERGO_IMG_ID",R.drawable.plus_butt_img);
                startActivity(intent);

//                ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.plus_butt_img);
//                ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.plus_butt_img);
//                ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.plus_butt_img);
//                ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.plus_butt_img);

            }
        });
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //happy
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                intent.putExtra("SERGO_IMG_ID",R.drawable.plus_butt_img);
                startActivity(intent);

//                ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.plus_butt_img);
//                ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.plus_butt_img);
//                ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.plus_butt_img);
//                ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.plus_butt_img);

            }
        });

        ImageView imgView6 = (ImageView) findViewById(R.id.imageView6);
        imgView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Christmass
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                intent.putExtra("SERGO_IMG_ID",R.drawable.christmas_sergo);
                startActivity(intent);

//                ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.christmas_sergo);
//                ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.christmas_sergo);
//                ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.christmas_sergo);
//                ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.christmas_sergo);


            }
        });
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Christmass
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                intent.putExtra("SERGO_IMG_ID",R.drawable.christmas_sergo);
                startActivity(intent);

//                ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.christmas_sergo);
//                ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.christmas_sergo);
//                ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.christmas_sergo);
//                ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.christmas_sergo);

            }
        });

        ImageView imgView7 = (ImageView) findViewById(R.id.imageView7);
        imgView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //king
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                intent.putExtra("SERGO_IMG_ID",R.drawable.king_sergo);
                startActivity(intent);

//                ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.king_sergo);
//                ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.king_sergo);
//                ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.king_sergo);
//                ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.king_sergo);
            }
        });
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //king
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                intent.putExtra("SERGO_IMG_ID",R.drawable.king_sergo);
                startActivity(intent);

//                ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.king_sergo);
//                ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.king_sergo);
//                ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.king_sergo);
//                ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.king_sergo);

            }
        });

        ImageView imgView = (ImageView) findViewById(R.id.imageView);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Ann
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                intent.putExtra("SERGO_IMG_ID",R.drawable.circle_ann);
                startActivity(intent);

//                ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.circle_ann);
//                ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.circle_ann);
//                ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.circle_ann);
//                ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.circle_ann);

            }
        });
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Ann
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                intent.putExtra("SERGO_IMG_ID",R.drawable.circle_ann);
                startActivity(intent);

//                ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.circle_ann);
//                ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.circle_ann);
//                ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.circle_ann);
//                ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.circle_ann);

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
