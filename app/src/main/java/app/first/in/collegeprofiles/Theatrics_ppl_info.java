package app.first.in.collegeprofiles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * Created by USER on 11/2/2016.
 */

public class Theatrics_ppl_info extends AppCompatActivity {

    TextView name2,skills,semester,branch,phone,email;
    Firebase Ref;


    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.theatrics_ppl_info);



        Firebase.setAndroidContext(this);

        Ref = new Firebase("https://collegeprofiles-39288.firebaseio.com/");


        skills = (TextView)findViewById(R.id.skills);
        semester = (TextView)findViewById(R.id.semester);
        branch = (TextView)findViewById(R.id.branch);
        phone = (TextView)findViewById(R.id.phone);
        email = (TextView)findViewById(R.id.email);
        name2 = (TextView)findViewById(R.id.name);



        Bundle names = getIntent().getExtras();
        if (names != null) {
            final String name = names.getString("username");


            final Firebase messagesRef = Ref.child("user_accounts").child(name).child("name");

            messagesRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {

                    String name1 = dataSnapshot.getValue(String.class);
                    name2.setText(name1);


                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });
            final Firebase skill = Ref.child("user_accounts").child(name).child("description");
            skill.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    String skill = dataSnapshot.getValue(String.class);
                    skills.setText(skill);

                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });
            final Firebase semesterr = Ref.child("user_accounts").child(name).child("section");
            semesterr.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    String semesterr = dataSnapshot.getValue(String.class);
                    semester.setText(semesterr);
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });
            final Firebase branchh = Ref.child("user_accounts").child(name).child("classdetail");
            branchh.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    String branchh = dataSnapshot.getValue(String.class);
                    branch.setText(branchh);

                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });
            final Firebase phonee = Ref.child("user_accounts").child(name).child("phone");
            phonee.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    String phonee = dataSnapshot.getValue(String.class);
                    phone.setText(phonee);

                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });
            final Firebase emaill = Ref.child("user_accounts").child(name).child("email");
            emaill.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    String emaill = dataSnapshot.getValue(String.class);
                    email.setText(emaill);
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });


        }

    }
}
