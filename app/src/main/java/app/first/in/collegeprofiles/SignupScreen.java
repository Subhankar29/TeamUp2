package app.first.in.collegeprofiles;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

/**
 * Created by venkateshtata on 26/09/16.
 */
public class SignupScreen extends AppCompatActivity {

    EditText etname, etusername, etemail, etphone, edtpass;
    Button btnsignup;
    Firebase ref;
    ProgressDialog PD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signupscreen);

        Firebase.setAndroidContext(this);
        ref = new Firebase("https://collegeprofiles-39288.firebaseio.com/");


        PD = new ProgressDialog(this);
        PD.setMessage("Uploading...");



        etname = (EditText)findViewById(R.id.etName);
        etusername = (EditText)findViewById(R.id.etusername);
        etemail = (EditText)findViewById(R.id.etemail);
        etphone = (EditText)findViewById(R.id.etPhone);
        edtpass = (EditText)findViewById(R.id.edtpass);
        btnsignup = (Button)findViewById(R.id.btnsign);


        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etname==null) {
                    Toast.makeText(getApplicationContext(), "Please fill all the details",Toast.LENGTH_LONG).show();
                }else {
                    PD.show();

                    String name = etname.getText().toString().trim();
                    String username = etusername.getText().toString();
                    String email = etemail.getText().toString();
                    String phone = etphone.getText().toString();
                    String password = edtpass.getText().toString();

                    ref.child("user_accounts").child(username).child("username").setValue(username, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

//dsdsfsdfsdfsfsd
                        }
                    });
                    ref.child("user_accounts").child(username).child("password").setValue(password, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {


                        }
                    });
                    ref.child("user_accounts").child(username).child("name").setValue(name, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

                        }
                    });
                    ref.child("user_accounts").child(username).child("email").setValue(email, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

                        }
                    });

                    ref.child("user_accounts").child(username).child("phone").setValue(phone, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

                        }
                    });
                    PD.dismiss();
                    Intent nxtIntent = new Intent(SignupScreen.this, MainActivity.class);
                    startActivity(nxtIntent);
                }




            }
        });










    }
}
