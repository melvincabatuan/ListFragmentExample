package ph.edu.dlsu.flowerlist.data;

/**
 * Created by cobalt on 1/15/16.
 */

import java.util.ArrayList;
import java.util.List;
import ph.edu.dlsu.flowerlist.R;

public class FlowerData {

    private List<Flower> flowers = new ArrayList<Flower>();
    public List<Flower> getFlowers() {
        return flowers;
    }

    public FlowerData() {
        flowers.add(new Flower("Azalea", R.mipmap.california_snow, 15.95,
                "Large double. Good grower, heavy bloomer. Early to mid-season, acid loving plants. Plant in moist well drained soil with pH of 4.0-5.5."));
        flowers.add(new Flower("Tibouchina Semidecandra", R.mipmap.princess_flower, 12.95,
                "Beautiful large royal purple flowers adorn attractive satiny green leaves that turn orange/red in cold weather. Grows to up to 18 feet, or prune annually to shorten."));
        flowers.add(new Flower("Hibiscus", R.mipmap.haight_ashbury, 17.95,
                "Blooms in summer, 20-35 inches high. Fertilize regularly for best results. Full sun, drought tolerant."));
    }
}