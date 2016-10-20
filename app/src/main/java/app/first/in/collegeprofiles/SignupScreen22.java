package app.first.in.collegeprofiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

/**
 * Created by venkateshtata on 06/10/16.
 */

public class SignupScreen22 extends AppCompatActivity {

        CheckBox coding, sports,dance,music,literary,theatrics,misc;
        Button signup;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_screen22);
        coding=(CheckBox)findViewById(R.id.cod);
        sports=(CheckBox)findViewById(R.id.sport);
        dance=(CheckBox)findViewById(R.id.dnce);
        music=(CheckBox)findViewById(R.id.music);
        literary=(CheckBox)findViewById(R.id.lit);
        theatrics=(CheckBox)findViewById(R.id.ttrics);
        misc=(CheckBox)findViewById(R.id.misc);

        signup=(Button)findViewById(R.id.btnsign) ;

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nxtIntent = new Intent(SignupScreen22.this, Interests.class);
            }
        });

        coding.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();

            //*add your firebase link here*//


            }
        });

        sports.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();


            //*add your firebase link here*//

            }
        });
        dance.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();


            //*add your firebase link here*//

            }
        });
        music.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();

             //*add your firebase link here*//


            }
        });
        literary.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();


            //*add your firebase link here*//

            }
        });
        theatrics.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();

            //*add your firebase link here*//


            }
        });
        misc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                Toast.makeText(getApplicationContext(), "Added to Interests!", Toast.LENGTH_SHORT).show();

          //*add your firebase link here*//


            }
        });




    }


}
