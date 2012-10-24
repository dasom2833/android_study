package com.example.android_study;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ViewEx extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.visibleex);
	}
	
	public void mOnClick(View v){
		switch(v.getId()){
		case R.id.firstBtn:
			v.setVisibility(View.INVISIBLE);
			break;
		case R.id.seconBtn:
			v.setVisibility(View.GONE);
		case R.id.thirdBtn:
			Button fsbtn = (Button) findViewById(R.id.firstBtn);
			Button secbtn = (Button) findViewById(R.id.seconBtn);
			Button thirbtn = (Button) findViewById(R.id.thirdBtn);
			
			if(fsbtn.getVisibility() == View.INVISIBLE){
				fsbtn.setVisibility(View.VISIBLE);
			}
			if(secbtn.getVisibility() == View.GONE){
				secbtn.setVisibility(View.VISIBLE);
			}
		
		}
		
	}
}
