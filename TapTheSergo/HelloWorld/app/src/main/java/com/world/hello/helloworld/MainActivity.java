package com.world.hello.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            int imgId = getIntent().getIntExtra("SERGO_IMG_ID",0);
            if (imgId != 0) {
                setSergoImg(imgId);
            }
        }catch(Exception e){

        }

        Timer timer = new Timer();
        TimerTask mTimerTask = new MyTimerTask();

        timer.schedule(mTimerTask, 100, 100);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

//        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                win();
            }
        });

        ImageView fabImg1 = (ImageView) findViewById(R.id.imageView1);
        fabImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll += 1;
                if (speed > 4) {
//                    if (countAll % speed == 0) {
                    tap(1);
//                    }
                }
                if (countAll % 4 == 0) {
                    Snackbar.make(view, "Ай маладетс!!!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }

            }
        });


        ImageView fabImg2 = (ImageView) findViewById(R.id.imageView2);
        fabImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll += 1;
                if (speed > 4) {
//                    if (countAll % speed == 0) {
                    tap(1);
//                    }
                }
                if (countAll % 4 == 0) {
                    Snackbar.make(view, "Красава!!!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });

        ImageView fabImg3 = (ImageView) findViewById(R.id.imageView3);
        fabImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll += 1;
                if (speed > 4) {
//                    if (countAll % speed == 0) {
                    tap(1);
//                    }
                }
                if (countAll % 4 == 0) {
                    Snackbar.make(view, "Ща победишь!!!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });

        ImageView fabImg4 = (ImageView) findViewById(R.id.imageView4);
        fabImg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countAll += 1;
                if (speed > 4) {
//                    if (countAll % speed == 0) {
                    tap(1);
//                    }
                }
                if (countAll % 4 == 0) {
                    Snackbar.make(view, "Серго почти сдался!!!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });

    }

    public void setSergoImg(int imgId){
        ((ImageView) findViewById(R.id.imageView1)).setImageResource(imgId);
        ((ImageView) findViewById(R.id.imageView2)).setImageResource(imgId);
        ((ImageView) findViewById(R.id.imageView3)).setImageResource(imgId);
        ((ImageView) findViewById(R.id.imageView4)).setImageResource(imgId);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    class MyTimerTask extends TimerTask {

        @Override
        public void run() {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                    "dd:MMMM:yyyy HH:mm:ss a", Locale.getDefault());
            final String strDate = simpleDateFormat.format(calendar.getTime());


            Random random = new Random();
            int randomInt = random.nextInt();

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    ((TextView) findViewById(R.id.textView)).setText(strDate);
                    countAll += 1;
                    if (speed > 4) {
                        if (countAll % speed == 0) {
                            count++;
                            if (count % 3 == 0) {
                                speed -= 2;
                                countAll = speed + 1;
                            }
                            tap(speed);
                        }
                    } else {
                        win();
                    }
                }
//                }
            });
        }

    }

    public void win() {
        ((ImageView) findViewById(R.id.imageView1)).setVisibility(View.INVISIBLE);
        ((ImageView) findViewById(R.id.imageView2)).setVisibility(View.INVISIBLE);
        ((ImageView) findViewById(R.id.imageView3)).setVisibility(View.INVISIBLE);
        ((ImageView) findViewById(R.id.imageView4)).setVisibility(View.INVISIBLE);
        ((ImageView) findViewById(R.id.imageCongr)).setVisibility(View.VISIBLE);
        ((TextView) findViewById(R.id.textView)).setText("ПОЗДРАВЛЯЮ ТЫ ВЫИГРАЛ");
    }

    ;

    public void tap(int speed) {

        ((ImageView) findViewById(R.id.imageView1)).setVisibility(View.INVISIBLE);
        ((ImageView) findViewById(R.id.imageView2)).setVisibility(View.INVISIBLE);
        ((ImageView) findViewById(R.id.imageView3)).setVisibility(View.INVISIBLE);
        ((ImageView) findViewById(R.id.imageView4)).setVisibility(View.INVISIBLE);

        if (countAll / speed % 4 == 0)
            ((ImageView) findViewById(R.id.imageView1)).setVisibility(View.VISIBLE);
        else if (countAll / speed % 4 == 1)
            ((ImageView) findViewById(R.id.imageView2)).setVisibility(View.VISIBLE);
        else if (countAll / speed % 4 == 2)
            ((ImageView) findViewById(R.id.imageView3)).setVisibility(View.VISIBLE);
        else if (countAll / speed % 4 == 3)
            ((ImageView) findViewById(R.id.imageView4)).setVisibility(View.VISIBLE);


    }

    public int countAll = 21;
    public int count = 10;
    public int speed = 20;

}
