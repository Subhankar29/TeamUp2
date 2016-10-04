package app.first.in.collegeprofiles;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by venkateshtata on 02/10/16.
 */
public class Interests extends AppCompatActivity {


    ListView mobile_list;
    ArrayList<Drawable> items ;
    TextView interest;
    Adapter adapter;








    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interests);

        mobile_list = (ListView) findViewById(R.id.list_view);
        items = new ArrayList<Drawable>() { };
        items.add(getResources().getDrawable(R.drawable.coding));
        items.add(getResources().getDrawable(R.drawable.dance));
        items.add(getResources().getDrawable(R.drawable.coding));
        items.add(getResources().getDrawable(R.drawable.dance));
        items.add(getResources().getDrawable(R.drawable.coding));
        items.add(getResources().getDrawable(R.drawable.dance));
        items.add(getResources().getDrawable(R.drawable.coding));
        items.add(getResources().getDrawable(R.drawable.dance));




        adapter = new Adapter(this,0,items);
        mobile_list.setAdapter(adapter);

    }
}
class Adapter extends ArrayAdapter<Drawable> {
    ArrayList<Drawable> items;
    ImageView image;
    TextView interest;

    public Adapter(Context c, int resources, ArrayList<Drawable>list){
        super(c,resources,list);
        this.items = list ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }
        image= (ImageView) convertView.findViewById(R.id.img);
        image.setBackground(items.get(position));
        return convertView;

    }

}
