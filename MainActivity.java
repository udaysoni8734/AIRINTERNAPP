package com.example.secondtry;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RatingBar ratingRatingBar = (RatingBar) findViewById(R.id.rating_rating_bar);
        final RatingBar ratingRatingBar2 = (RatingBar) findViewById(R.id.rating_rating_bar2);
        Button submitButton = (Button) findViewById(R.id.submit_button);
        final TextView ratingDisplayTextView = (TextView) findViewById(R.id.rating_display_text_View);
        final TextView ratingDisplayTextView2 = (TextView) findViewById(R.id.rating_display_text_View2);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ratingDisplayTextView.setText("Your rating is: " + ratingRatingBar.getRating());
                ratingDisplayTextView2.setText("Your rating is: " + ratingRatingBar2.getRating());
            }
        });
    }
}