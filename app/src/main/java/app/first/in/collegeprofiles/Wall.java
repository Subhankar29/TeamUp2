package app.first.in.collegeprofiles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by venkateshtata on 11/02/17.
 */

public class Wall extends AppCompatActivity {

    ImageView imggindia, imgginit,imggindia2,imgginit2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_wall);

        imggindia = (ImageView)findViewById(R.id.img_india);
        imgginit = (ImageView)findViewById(R.id.img_init);
        imggindia2 = (ImageView)findViewById(R.id.img_india2);
        imgginit2 = (ImageView)findViewById(R.id.img_init2);


        imggindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                             Uri uriInit = Uri.parse("http://codeforindia.org/cfi-hgs/"); // missing 'http://' will cause crashed

                Intent intentinit = new Intent(Intent.ACTION_VIEW, uriInit);

                startActivity(intentinit);







            }
        });


        imgginit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriInit = Uri.parse("https://www.facebook.com/init.pesu/"); // missing 'http://' will cause crashed

                Intent intentinit = new Intent(Intent.ACTION_VIEW, uriInit);

                startActivity(intentinit);

            }
        });

        imgginit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriInit = Uri.parse("https://www.facebook.com/init.pesu/"); // missing 'http://' will cause crashed

                Intent intentinit = new Intent(Intent.ACTION_VIEW, uriInit);

                startActivity(intentinit);

            }
        });

        imggindia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uriInit = Uri.parse("http://codeforindia.org/cfi-hgs/"); // missing 'http://' will cause crashed

                Intent intentinit = new Intent(Intent.ACTION_VIEW, uriInit);

                startActivity(intentinit);







            }
        });




    }
}
