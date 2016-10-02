package app.first.in.collegeprofiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by venkateshtata on 02/10/16.
 */
public class Interests extends AppCompatActivity {

    Button btn_tennis;// have to include the other interest buttons.


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interests);


       btn_tennis = (Button)findViewById(R.id.btn_tennis);


        btn_tennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Interests.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
