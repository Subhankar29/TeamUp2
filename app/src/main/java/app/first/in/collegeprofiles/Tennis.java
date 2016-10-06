package app.first.in.collegeprofiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by venkatanish on 01/10/16.
 */

public class Tennis  extends AppCompatActivity {

    Button people;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tennis_interest);

        people = (Button)findViewById(R.id.people);

        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(Tennis.this, Tennis_People.class);
                startActivity(nxt);
            }
        });
    }
}
