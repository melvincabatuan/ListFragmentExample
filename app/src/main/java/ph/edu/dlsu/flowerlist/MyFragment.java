package ph.edu.dlsu.flowerlist;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ph.edu.dlsu.flowerlist.data.Flower;
import ph.edu.dlsu.flowerlist.data.FlowerData;

/**
 * Created by cobalt on 1/15/16.
 */
public class MyFragment extends ListFragment {

    List<Flower> flowers = new FlowerData().getFlowers();

    public MyFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FlowerArrayAdapter adapter = new FlowerArrayAdapter(getActivity(), R.layout.list_item_flower, flowers);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);
        return rootView;
    }
}
