package app.first.in.collegeprofiles;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by venkatanish on 01/10/16.
 */

public class Tennis  extends Fragment {

    Button people;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.tennis_interest,container,false);



        people = (Button)rootView.findViewById(R.id.people);

        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(getActivity(), Tennis_People.class);
                startActivity(nxt);
            }
        });
        return rootView;
    }
}
