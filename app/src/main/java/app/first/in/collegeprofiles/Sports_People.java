package app.first.in.collegeprofiles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.ui.FirebaseListAdapter;

import java.util.ArrayList;

/**
 * Created by venkateshtata on 06/10/16.
 */

public class Sports_People extends AppCompatActivity {

    ListView mPeopleList;
    TextView people;

    Firebase Ref;

    ArrayList<String> mPeople = new ArrayList<>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports_people);


        Firebase.setAndroidContext(this);

        Ref = new Firebase("https://collegeprofiles-39288.firebaseio.com/");


        mPeopleList = (ListView) findViewById(R.id.mPeopleList);
        people = (TextView) findViewById(R.id.people);
        //
    }

    @Override
    protected void onStart() {
        super.onStart();


        Firebase messagesRef = Ref.child("user-interests").child("sports");
        final FirebaseListAdapter<String> adapter = new FirebaseListAdapter<String>(this, String.class, android.R.layout.simple_list_item_1, messagesRef) {
            @Override
            protected void populateView(View view, String s, int i) {

                TextView textView = (TextView)view.findViewById(android.R.id.text1);
                textView.setText(s);


            }

        };
        mPeopleList.setAdapter(adapter);
    }
}
