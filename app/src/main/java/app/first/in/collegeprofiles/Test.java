package app.first.in.collegeprofiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;

/**
 * Created by venkateshtata on 02/11/16.
 */

public class Test extends AppCompatActivity {

    private Button btn_select;
    private StorageReference mStorage;

    private static final int GALLERY_INTENT=2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);




        btn_select = (Button) findViewById(R.id.btn_select);

        if (!FirebaseApp.getApps(this).isEmpty()) {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);



        btn_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, GALLERY_INTENT);
            }
        });
    }





    }

}
