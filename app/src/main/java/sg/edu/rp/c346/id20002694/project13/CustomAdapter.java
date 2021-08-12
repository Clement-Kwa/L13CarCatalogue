package sg.edu.rp.c346.id20002694.project13;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<sg.edu.rp.c346.id20002694.project13.Song> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<sg.edu.rp.c346.id20002694.project13.Song> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
        RatingBar rate = rowView.findViewById(R.id.ratingBar);
        TextView tvSing = rowView.findViewById(R.id.textViewSinger);
        ImageView iv = rowView.findViewById(R.id.iv);

        // Obtain the Android Year information based on the position
        sg.edu.rp.c346.id20002694.project13.Song currentYear = versionList.get(position);

        // Set values to the TextView to display the corresponding information
        tvTitle.setText(currentYear.getTitle());
        tvYear.setText(currentYear.getYear()+" ");

        tvSing.setText(currentYear.getSingers()+" ");
        rate.setRating(currentYear.getStars());

        int now = Calendar.getInstance().get(Calendar.YEAR);
        int oldPeriod = Calendar.getInstance().get(Calendar.YEAR)-20;


        if(now-currentYear.getYear()>=0 &&  now-currentYear.getYear()<6){
            iv.setImageResource(R.drawable.new_image);
        }
        else if(now-currentYear.getYear()>=20){
            iv.setImageResource(R.drawable.uni_logo2);
        }
        else{
            iv.setVisibility(View.INVISIBLE);
        }

        return rowView;
    }

}
