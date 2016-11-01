package app.first.in.collegeprofiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by USER on 10/31/2016.
 */

public class Field_Profile extends AppCompatActivity {

    Button signup;

    EditText discription;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.field_profile);

        signup=(Button)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nxtIntent = new Intent(Field_Profile.this, MainActivity.class);
                startActivity(nxtIntent);
            }
        });


    }

}


