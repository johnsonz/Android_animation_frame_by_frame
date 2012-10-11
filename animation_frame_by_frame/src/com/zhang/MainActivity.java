package com.zhang;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	  private Button button =null;
	   private ImageView imageView=null;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new buttonListener());
        
        imageView=(ImageView)findViewById(R.id.imageView1);
    }
    class buttonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			imageView.setBackgroundResource(R.drawable.anima);
			AnimationDrawable animationDrawable=(AnimationDrawable)imageView.getBackground();
			animationDrawable.start();
		}
    }
}