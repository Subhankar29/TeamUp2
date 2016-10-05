package app.first.in.collegeprofiles;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

import static app.first.in.collegeprofiles.R.drawable.dance;

/**
 * Created by venkateshtata on 02/10/16.
 */
public class Interests extends AppCompatActivity {


    ListView mobile_list;
    ArrayList<Drawable> items;
    TextView interest;
    Adapter adapter;

    ImageView coding;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interests);

        mobile_list = (ListView) findViewById(R.id.list_view);

        mobile_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               switch ((position)){
                   case 0:
                       Intent intent = new Intent(Interests.this, MainActivity.class);
                       startActivity(intent);
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
        items.add(getResources().getDrawable(R.drawable.coding));
        items.add(getResources().getDrawable(dance));
        items.add(getResources().getDrawable(R.drawable.coding));
        items.add(getResources().getDrawable(dance));
        items.add(getResources().getDrawable(R.drawable.coding));
        items.add(getResources().getDrawable(dance));
        items.add(getResources().getDrawable(R.drawable.coding));
        items.add(getResources().getDrawable(dance));


        //coding = (ImageView)findViewById(R.drawable.coding);

        //   coding.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //  public void onClick(View v) {
        //     Intent nxt = new Intent(Interests.this, MainActivity.class);
        //      startActivity(nxt);
        //}
        //});


        adapter = new Adapter(this, 0, items);
        mobile_list.setAdapter(adapter);

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
        image = (ImageView) convertView.findViewById(R.id.img);
        image.setBackground(items.get(position));
        return convertView;

    }

}
