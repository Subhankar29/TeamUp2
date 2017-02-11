package app.first.in.collegeprofiles;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.os.Handler;


import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.realtime.util.StringListReader;


public class SignupScreen extends AppCompatActivity {

    EditText etname, etusername, etemail, etphone,etpass,etusername2, edtpass,etclass,etsection;
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

        Spinner staticSpinner = (Spinner) findViewById(R.id.static_spinner);
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.college_array,
                        android.R.layout.simple_spinner_item);
        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        staticSpinner.setAdapter(staticAdapter);
        Spinner dynamicSpinner = (Spinner) findViewById(R.id.static_spinner);
        String[] items = new String[] { "Christ University", "M.S.Ramaiah", "Dayananda Sagar College of Engineering", "PES University", "B.M.S College", "R V College of engineering", "Bangalore Institute"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);
        dynamicSpinner.setAdapter(adapter);
        dynamicSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.v("item", (String) parent.getItemAtPosition(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        etname = (EditText)findViewById(R.id.etName);
        etusername = (EditText)findViewById(R.id.etusername);
        etemail = (EditText)findViewById(R.id.etemail);
        etphone = (EditText)findViewById(R.id.etPhone);
        edtpass = (EditText)findViewById(R.id.edtpass);
        etusername2=(EditText)findViewById(R.id.etusername2);
        btnsignup = (Button)findViewById(R.id.btnnext);
        etclass=(EditText)findViewById(R.id.etclass);
        etsection=(EditText)findViewById(R.id.etsection);



        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etname.getText().toString().trim();
                String username = etusername.getText().toString().trim();
                String username2=etusername2.getText().toString().trim();
                String email = etemail.getText().toString().trim();
                String phone = etphone.getText().toString().trim();
                String password = edtpass.getText().toString().trim();
                String classdetail=etclass.getText().toString().trim();
                String section=etsection.getText().toString().trim();



                if (name.isEmpty()||username.isEmpty()||email.isEmpty()||phone.isEmpty()||password.isEmpty()||username2.isEmpty()||classdetail.isEmpty()||section.isEmpty()) {
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


                    ref.child("user_accounts").child(username2).child("college_id").setValue(username, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

                        }
                    });
                    ref.child("user_accounts").child(username2).child("password").setValue(password, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {


                        }
                    });
                    ref.child("user_accounts").child(username2).child("name").setValue(name, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

                        }
                    });
                    ref.child("user_accounts").child(username2).child("username").setValue(username2, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

                        }
                    });
                    ref.child("user_accounts").child(username2).child("classdetail").setValue(classdetail, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

                        }
                    });
                    ref.child("user_accounts").child(username2).child("section").setValue(section, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

                        }
                    });
                    ref.child("user_accounts").child(username2).child("email").setValue(email, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

                        }
                    });

                    ref.child("user_accounts").child(username2).child("phone").setValue(phone, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {

                        }
                    });
                    PD.dismiss();
                    Intent nxtIntent = new Intent(SignupScreen.this, SignupScreen22.class);
                    nxtIntent.putExtra("username",username2);
                    startActivity(nxtIntent);

                }




            }
        });










    }
}
