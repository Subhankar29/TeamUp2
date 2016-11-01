package app.first.in.collegeprofiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

/**
 * Created by USER on 10/31/2016.
 */

public class Field_Profile extends AppCompatActivity {

    Button signup;
    Firebase ref;
    EditText description;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.field_profile);


            Firebase.setAndroidContext(this);
        ref = new Firebase("https://collegeprofiles-39288.firebaseio.com/");

        signup=(Button)findViewById(R.id.signup);
        description = (EditText)findViewById(R.id.description);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle names = getIntent().getExtras();
                if(names!=null) {
                    String name = names.getString("username");

                    String descrip = description.getText().toString();


                    ref.child("user_accounts").child(name).child("description").setValue(descrip, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

                        }
                    });
                }

                Intent nxtIntent = new Intent(Field_Profile.this, MainActivity.class);
                startActivity(nxtIntent);
            }
        });


    }

}


