package com.abanoub14.smf15;

import java.io.IOException;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;


public class Tengousht extends Activity {
	
	private Button btn;
	/**
	 * help to toggle between play and pause.
	 */
	private boolean playPause;
	private MediaPlayer mediaPlayer;
	/**
	 * remain false till media is not completed, inside OnCompletionListener make it true.
	 */
	private boolean intialStage = true;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tengousht);
		
		
        Button mainNext = (Button) findViewById(R.id.tengoushthome);
        mainNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Grades");
                startActivity(i);
            }
        });
        
        Button mainNext1 = (Button) findViewById(R.id.tengoushtback);
        mainNext1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Kghymns");
                startActivity(i);
            }
        });
        
        Button mainNext2 = (Button) findViewById(R.id.tengoushtexam);
        mainNext2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Tengoushtexam");
                startActivity(i);
            }
        });
        
        Button mainNext3 = (Button) findViewById(R.id.tengoushtlyrics);
        mainNext3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Tengoushtlyrics");
                startActivity(i);
            }
        });
        
        btn = (Button) findViewById(R.id.tengoushtplay);
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        btn.setOnClickListener(pausePlay);

    }

    private OnClickListener pausePlay = new OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            // TODO Auto-generated method stub

            if (!playPause) {
                btn.setBackgroundResource(R.drawable.button_pause);
                if (intialStage)
                    new Player()
                            .execute("http://98.240.16.11:56025/kg/tengousht.mp3");
                else {
                    if (!mediaPlayer.isPlaying())
                        mediaPlayer.start();
                }
                playPause = true;
            } else {
                btn.setBackgroundResource(R.drawable.button_play);
                if (mediaPlayer.isPlaying())
                    mediaPlayer.pause();
                playPause = false;
            }
        }
    };


    class Player extends AsyncTask<String, Void, Boolean> {
        private ProgressDialog progress;

        @Override
        protected Boolean doInBackground(String... params) {
            // TODO Auto-generated method stub
            Boolean prepared;
            try {

                mediaPlayer.setDataSource(params[0]);

                mediaPlayer.setOnCompletionListener(new OnCompletionListener() {

                    public void onCompletion(MediaPlayer mp) {
                        // TODO Auto-generated method stub
                        intialStage = true;
                        playPause=false;
                        btn.setBackgroundResource(R.drawable.button_play);
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                    }
                });
                mediaPlayer.prepare();
                prepared = true;
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                Log.d("IllegarArgument", e.getMessage());
                prepared = false;
                e.printStackTrace();
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                prepared = false;
                e.printStackTrace();
            } catch (IllegalStateException e) {
                // TODO Auto-generated catch block
                prepared = false;
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                prepared = false;
                e.printStackTrace();
            }
            return prepared;
        }

        @Override
        protected void onPostExecute(Boolean result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);
            if (progress.isShowing()) {
                progress.cancel();
            }
            Log.d("Prepared", "//" + result);
            mediaPlayer.start();

            intialStage = false;
        }

        public Player() {
            progress = new ProgressDialog(Tengousht.this);
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();
            this.progress.setMessage("Buffering...");
            this.progress.show();

        }
    }

 
    }