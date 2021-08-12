package sg.edu.rp.c346.id20002694.project13;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

public class insert_dialog extends AppCompatActivity {

    EditText etTitle, etSingers, etYear;

    Button btnInsert, btnShow;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_dialog);

        etTitle = findViewById(R.id.etTitle);
        etSingers = findViewById(R.id.etSingers);
        etYear = findViewById(R.id.etYear);


        btnShow = findViewById(R.id.btnShow);
        ratingBar = findViewById(R.id.ratingBar);


        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(insert_dialog.this,
                        sg.edu.rp.c346.id20002694.project13.SongList.class);

                startActivity(i);

            }
        });


        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = etTitle.getText().toString();
                String singer = etSingers.getText().toString();
                int year = 0;

                if (!etYear.getText().toString().isEmpty()) {
                    year = Integer.parseInt(etYear.getText().toString());
                }


                int stars = (int)ratingBar.getRating();

                sg.edu.rp.c346.id20002694.project13.DBHelper dbh = new sg.edu.rp.c346.id20002694.project13.DBHelper(insert_dialog.this);
                dbh.insertSong(title, singer, year, stars);
            }
        });

    }
}