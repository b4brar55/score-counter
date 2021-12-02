package com.b4brar4.score_counter;

 

import android.app.Activity;

import android.os.Bundle;

import android.view.View;

import android.widget.TextView;

public class MainActivity extends Activity { 

    int zero =0;

	int zero1 =0;	String abc = "jatt b4brar4";

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

	public void resetBtn(View view) {

		zero = 0;

		zero1 =0;

		display(zero);

		display2(zero);

	}

	public void two1(View view) {

		zero = zero +2;

		display(zero);

	}

	public void four1(View view) {

		zero = zero +4;

		display(zero);

	}

	public void six1(View view) {

		zero = zero +6;

		display(zero);

	}

	private void display(int score1) {

		TextView taScore = (TextView) findViewById(R.id.score_team_a);

		taScore.setText("" + score1);

	}

	public void two2(View view) {

		zero1 = zero1 +2;

		display2(zero1);

	}

	public void four2(View view) {

		zero1 = zero1 +4;

		display2(zero1);

	}

	public void six2(View view) {

		zero1 = zero1 +6;

		display2(zero1);

	}

	private void display2(int score2) {

		TextView taScore2 = (TextView) findViewById(R.id.score_team_b);

		taScore2.setText("" + score2);

	}

}
