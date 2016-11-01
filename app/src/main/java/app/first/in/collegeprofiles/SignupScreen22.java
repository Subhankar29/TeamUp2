package app.first.in.collegeprofiles;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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

        CheckBox coding, sports,dance,music,literary,theatrics,misc,photography;
        Button next;
        Firebase ref;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_screen22);



        Firebase.setAndroidContext(this);
        ref = new Firebase("https://collegeprofiles-39288.firebaseio.com/");



        coding=(CheckBox)findViewById(R.id.cod);
        photography = (CheckBox)findViewById(R.id.phto);
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

                Bundle names = getIntent().getExtras();
                if(names!=null) {
                    String name = names.getString("username");

                    Intent nxtIntent = new Intent(SignupScreen22.this, Field_Profile.class);
                    nxtIntent.putExtra("username",name);
                    startActivity(nxtIntent);

                }



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


                        final Toast toast = Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 500);
                    }
                }
            }
        });
        photography.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Bundle names = getIntent().getExtras();
                if(names!=null) {
                    String name = names.getString("username");


                    if (compoundButton.isChecked()) {



                        ref.child("user-interests").child("photography").child(name).setValue(name);


                        final Toast toast = Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 500);
                    }
                }
            }
        });


        sports.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


                Bundle names = getIntent().getExtras();
                if(names!=null) {
                    String name = names.getString("username");

                    if (compoundButton.isChecked()) {

                        ref.child("user-interests").child("sports").child(name).setValue(name);

                        final Toast toast = Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 500);
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
                        ref.child("user-interests").child("dance").child(name).setValue(name);

                        final Toast toast = Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 500);


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

                        ref.child("user-interests").child("music").child(name).setValue(name);

                        final Toast toast = Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 500);

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

                        ref.child("user-interests").child("literary").child(name).setValue(name);

                        final Toast toast = Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 500);
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

                        ref.child("user-interests").child("theatrics").child(name).setValue(name);


                        final Toast toast = Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 500);
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

                        ref.child("user-interests").child("misc").child(name).setValue(name);
                        final Toast toast = Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                toast.cancel();
                            }
                        }, 500);

                    }
                }

          //*add your firebase link here*//


            }
        });




    }


}
