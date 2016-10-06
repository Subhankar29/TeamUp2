package app.first.in.collegeprofiles;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    public EditText edt_username, edt_password;
    Button login,signup;
    Firebase ref;
    ProgressDialog PD;

//ajkdgasjhgaskjg
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase.setAndroidContext(this);
        ref = new Firebase("https://collegeprofiles-39288.firebaseio.com/");

        PD = new ProgressDialog(this);
        PD.setMessage("Searching...");



        edt_username = (EditText) findViewById(R.id.etuser);
        edt_password = (EditText) findViewById(R.id.etpass);
        login = (Button)findViewById(R.id.btnlogin);
        signup = (Button)findViewById(R.id.btnsup);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt_username.equals(null)||edt_password.equals(null)) {
                    Toast.makeText(getApplicationContext(), "Complete the above details", Toast.LENGTH_LONG).show();
                } else {

                    PD.show();


                    final String username = edt_username.getText().toString().trim();
                    final String password = edt_password.getText().toString().trim();


                    ref.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {

                            if (username.equals(dataSnapshot.child("user_accounts").child(username).child("username").getValue())
                                    && password.equals(dataSnapshot.child("user_accounts").child(username).child("password").getValue())) {

                                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                startActivity(intent);

                                PD.dismiss();
                            } else {
                                Toast.makeText(getApplicationContext(), "Please signup first ", Toast.LENGTH_LONG).show();
                                PD.dismiss();
                            }
                            PD.dismiss();

                        }

                        @Override
                        public void onCancelled(FirebaseError firebaseError) {

                        }
                    });
                }
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxtIntent = new Intent(MainActivity.this, SignupScreen22.class);
                startActivity(nxtIntent);



            }


        });

    }
}
