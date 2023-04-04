import static java.lang.Math.abs;

public class Location implements Comparable<Location>{
    private long id;
    private double lat, lon;
    private double distance;
    private int blockId,RegisterId;

    public Location(long id, double lat, double lon) {
        this.id = id;
        this.lat = lat;
        this.lon = lon;
        distance = Double.MAX_VALUE;
    }

    public double getLat() {

        return lat;
    }

    public double getLon() {

        return lon;
    }

    public long getId() {


        return id;
    }

    public double Manhattan_Distance(double x, double y) {
        distance = abs((x - lat)) + abs(y - lon);
        return distance;

    }

    public double getDistance() {
        if (distance == Double.MAX_VALUE) {
            System.out.println("ERROR WITH MAX VALUE");
            System.exit(-1);
        }
        return distance;
    }

    @Override
    public String toString() {
        return "id:" + id + "   lat= " + lat + "   lon= " + lon+ "  dist= "+distance;
    }

    @Override
    public int compareTo(Location l2) {
        if (distance > l2.getDistance()) {
            return 1;
        } else if (distance < l2.getDistance()) {
            return -1;
        }
        return 0;
    }
}
