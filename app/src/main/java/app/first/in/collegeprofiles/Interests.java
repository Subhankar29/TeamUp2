package app.first.in.collegeprofiles;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by venkateshtata on 02/10/16.
 */
public class Interests extends Fragment {





    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.interests,container,false);
        ListView mobile_list;
        ArrayList<Drawable> items;
        TextView interest;
        Adapter adapter;
        ImageView coding;



        mobile_list = (ListView)rootView.findViewById(R.id.list_view);


        mobile_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                android.app.FragmentManager fn = getFragmentManager();



               switch ((position)){
                   case 0:

                       Intent tennis = new Intent(getActivity(), Sports_interest.class);
                       startActivity(tennis);

                       // Intent intent = new Intent(Interests.this, Tennis.class);
                       //startActivity(intent);
                       break;
                   case 1:

                       Intent dance = new Intent(getActivity(), Dance_Interest.class);
                       startActivity(dance);
                       break;
                   case 2:

                       Intent music = new Intent(getActivity(), Music_Interest.class);
                       startActivity(music);
                       break;
                   case 3:
                       Intent coding = new Intent(getActivity(), Coding_Interest.class);
                       startActivity(coding);
                       break;
                   case 4:
                       Intent theatrics = new Intent(getActivity(), Theatrics_Interest.class);
                       startActivity(theatrics);
                       break;
                   case 5:
                       Intent literary = new Intent(getActivity(), Literary_Interest.class);
                       startActivity(literary);
                       break;
                   case 6:
                       Intent photo = new Intent(getActivity(), Photo_Interest.class);
                       startActivity(photo);
                       break;
                   case 7:
                       Intent miscell= new Intent(getActivity(),Miscell_Interest.class);
                       startActivity(miscell);
                       break;



               }



               /* if(items.get(position)==getResources().getDrawable(R.drawable.coding)) {


                    Intent intent = new Intent(Interests.this, MainActivity.class);
                    startActivity(intent);
                }*/

                Log.d("TAG", "onItemClick: " + position);



            }

        });

        items = new ArrayList<Drawable>() {
        };
        items.add(getResources().getDrawable(R.drawable.sports2));
        items.add(getResources().getDrawable(R.drawable.dance2));
        items.add(getResources().getDrawable(R.drawable.music2));

        items.add(getResources().getDrawable(R.drawable.coding));
        items.add(getResources().getDrawable(R.drawable.theatrics2));

        items.add(getResources().getDrawable(R.drawable.literary2));
        items.add(getResources().getDrawable(R.drawable.photo));
        items.add(getResources().getDrawable(R.drawable.misc2));


        //coding = (ImageView)findViewById(R.drawable.coding);

        //   coding.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //  public void onClick(View v) {
        //     Intent nxt = new Intent(Interests.this, MainActivity.class);
        //      startActivity(nxt);
        //}
        //});


       adapter = new Adapter(getActivity(), 0, items);
        mobile_list.setAdapter(adapter);

        return rootView;



    }
}

class Adapter extends ArrayAdapter<Drawable> {
    ArrayList<Drawable> items;
    ImageView image;
    TextView interest;

    public Adapter(Context c, int resources, ArrayList<Drawable> list) {
        super(c, resources, list);
        this.items = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }
        image = (ImageView)convertView.findViewById(R.id.img);
        image.setBackground(items.get(position));
        return convertView;

    }

}
