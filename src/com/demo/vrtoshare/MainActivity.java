package com.demo.vrtoshare;

import android.os.Bundle;

import com.google.vrtoolkit.cardboard.CardboardActivity;
import com.google.vrtoolkit.cardboard.CardboardView;


public class MainActivity extends CardboardActivity {

	private CardboardView cardBoardView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardBoardView = (CardboardView) findViewById(R.id.cardboard_view);
        
        
    }

}
