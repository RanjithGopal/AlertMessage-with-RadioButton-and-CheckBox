package com.example.aleart;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity 
{
Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	b=(Button)findViewById(R.id.button1);
	
	b.setOnClickListener(new OnClickListener()
	{
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder r=new AlertDialog.Builder(MainActivity.this);
			r.setTitle("warring");
			r.setMessage("do u want to save");
			r.setIcon(R.drawable.warning);
			r.setPositiveButton("save",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this,"file is saved",Toast.LENGTH_LONG).show();	
				}
			});
			r.setNegativeButton("don't save",new DialogInterface.OnClickListener()
			{
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					Toast.makeText(MainActivity.this,"file not saved",Toast.LENGTH_LONG).show();	
				}
			});
			r.setNeutralButton("exit",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				MainActivity.this.finish();	
				}
			});
			
			r.create();
			r.show();
		}
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
