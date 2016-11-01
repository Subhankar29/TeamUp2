package app.first.in.collegeprofiles;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Handler;


import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

/**
 * Created by venkateshtata on 26/09/16.
 */
public class SignupScreen extends AppCompatActivity {

    EditText etname, etusername, etemail, etphone,etpass, edtpass;
    Button btnsignup;
    Firebase ref;
    ProgressDialog PD;
    EditText asd;



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
        etpass = (EditText)findViewById(R.id.etpass);
        btnsignup = (Button)findViewById(R.id.btnnext);



        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etname.getText().toString().trim();
                String username = etusername.getText().toString().trim();
                String email = etemail.getText().toString().trim();
                String phone = etphone.getText().toString().trim();
                String password = edtpass.getText().toString().trim();
                String conpass=etpass.getText().toString().trim();




                if (name.isEmpty()||username.isEmpty()||email.isEmpty()||phone.isEmpty()||password.isEmpty()) {
                    final Toast toast = Toast.makeText(getApplicationContext(), "Please fill all details", Toast.LENGTH_SHORT);
                    toast.show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 500);
                }else {


                    PD.show();


                    ref.child("user_accounts").child(username).child("username").setValue(username, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

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

                    if(etpass.getText().toString()!= edtpass.getText().toString() ){
                        final Toast toast = Toast.makeText(getApplicationContext(), "Oops!Passwords don't match!", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 500);

                    }
                    PD.dismiss();
                    Intent nxtIntent = new Intent(SignupScreen.this, SignupScreen22.class);
                    nxtIntent.putExtra("username",name);
                    startActivity(nxtIntent);
                }




            }
        });










    }
}
