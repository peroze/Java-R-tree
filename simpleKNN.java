import java.util.ArrayList;
import java.util.Collections;


public class simpleKNN {

    public ArrayList<Location> knnRun(ArrayList<Location> locations, Location classify, int k) {
        for (Location location : locations) {
            location.Manhattan_Distance(classify.getLat(), classify.getLon());

        }
        Collections.sort(locations);
        ArrayList<Location> kBest = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            kBest.add(locations.get(i));
            Point kl = new Point(locations.get(i).getLat(), locations.get(i).getLon());
            System.out.println(kl.getLat() + "  " + kl.getLon());
            kl.setDistanceFromPoint_forKNN(kl.distance(new Point(classify.getLat(), classify.getLon())));
            System.out.println(kl.getDistanceFromPoint_forKNN());
            System.out.println();
            System.out.println();
            System.out.println();
        }
        return kBest;
    }

    public static ArrayList<Location> Range(Location aPoint, double distance, ArrayList<Location> locations) {
        ArrayList<Location> CloseAreas = new ArrayList<>();
        for (int i = 0; i < locations.size(); i++) {
            if (locations.get(i).Manhattan_Distance(aPoint.getLat(), aPoint.getLon()) <= distance) {
                CloseAreas.add(locations.get(i));
            }
        }
        return CloseAreas;
    }
}
