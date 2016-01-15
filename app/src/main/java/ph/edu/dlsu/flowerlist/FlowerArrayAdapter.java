package ph.edu.dlsu.flowerlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ph.edu.dlsu.flowerlist.data.Flower;

/**
 * Created by cobalt on 1/15/16.
 */
public class FlowerArrayAdapter extends ArrayAdapter<Flower> {

    private Context context;
    private List<Flower> objects;

    public FlowerArrayAdapter(Context context, int resource, List<Flower> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Flower flower = objects.get(position);

        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_item_flower, null);

        ImageView image = (ImageView) view.findViewById(R.id.ivFlowerImage);
        image.setImageResource(flower.getImageResource());

        TextView tv = (TextView) view.findViewById(R.id.tvFlowerName);
        tv.setText(flower.getFlowerName());

        return view;
    }

}