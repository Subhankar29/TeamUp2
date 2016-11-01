package app.first.in.collegeprofiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.firebase.client.Firebase;

/**
 * Created by venkateshtata on 06/10/16.
 */

public class SignupScreen22 extends AppCompatActivity {

        CheckBox coding, sports,dance,music,literary,theatrics,misc;
        Button next;
        Firebase ref;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_screen22);



        Firebase.setAndroidContext(this);
        ref = new Firebase("https://collegeprofiles-39288.firebaseio.com/");



        coding=(CheckBox)findViewById(R.id.cod);
        sports=(CheckBox)findViewById(R.id.sport);
        dance=(CheckBox)findViewById(R.id.dnce);
        music=(CheckBox)findViewById(R.id.music);
        literary=(CheckBox)findViewById(R.id.lit);
        theatrics=(CheckBox)findViewById(R.id.ttrics);
        misc=(CheckBox)findViewById(R.id.misc);

        next=(Button)findViewById(R.id.btnsign) ;

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nxtIntent = new Intent(SignupScreen22.this, Field_Profile.class);
                startActivity(nxtIntent);
            }
        });





            coding.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    Bundle names = getIntent().getExtras();
                    if(names!=null) {
                        String name = names.getString("username");


                    if (compoundButton.isChecked()) {



                        ref.child("user-interests").child("coding").child(name).setValue(name);


                        Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();
                    }
                }








            //*add your firebase link here*//


            }
        });

        sports.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


                Bundle names = getIntent().getExtras();
                if(names!=null) {
                    String name = names.getString("username");

                    if (compoundButton.isChecked()) {

                        ref.child("user-interests").child("sports").push().setValue(name);

                        Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();
                    }

                }

            //*add your firebase link here*//

            }
        });
        dance.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {



            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                Bundle names = getIntent().getExtras();
                if(names!=null) {
                    String name = names.getString("username");

                    if (compoundButton.isChecked()) {
                        ref.child("user-interests").child("dance").push().setValue(name);

                        Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();


                    }
                }


            //*add your firebase link here*//

            }
        });
        music.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Bundle names = getIntent().getExtras();
                if(names!=null) {
                    String name = names.getString("username");


                    if (compoundButton.isChecked()) {

                        ref.child("user-interests").child("music").push().setValue(name);

                        Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();

                    }
                }

             //*add your firebase link here*//


            }
        });
        literary.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Bundle names = getIntent().getExtras();
                if(names!=null) {
                    String name = names.getString("username");


                    if (compoundButton.isChecked()) {

                        ref.child("user-interests").child("literary").push().setValue(name);

                        Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();
                    }
                }


            //*add your firebase link here*//

            }
        });
        theatrics.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                Bundle names = getIntent().getExtras();
                if(names!=null) {
                    String name = names.getString("username");


                    if (compoundButton.isChecked()) {

                        ref.child("user-interests").child("theatrics").push().setValue(name);


                        Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();
                    }
                }

            //*add your firebase link here*//


            }
        });
        misc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                Bundle names = getIntent().getExtras();
                if(names!=null) {
                    String name = names.getString("username");


                    if (compoundButton.isChecked()) {

                        ref.child("user-interests").child("misc").push().setValue(name);

                        Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();

                    }
                }

          //*add your firebase link here*//


            }
        });




    }


}
