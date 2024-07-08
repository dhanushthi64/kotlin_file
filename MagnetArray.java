import java.util.*;
public class MagnetArray {
    public static void main(String[] args) {
        int[] magnets = {1, 2, 3, 4, 5};
        ArrayList<Double> equilibriumPoints = new ArrayList<>();
        for (int i = 0; i < magnets.length - 1; i++) {
            double low = magnets[i];
            double high = magnets[i + 1];
            while (low < high) {
                double mid = (low + high) / 2;
                double force = 0;
                for (int j = 0; j < magnets.length; j++) {
                    force += 1 / (mid - magnets[j]);
                }
                if (force == 0) {
                    equilibriumPoints.add(mid);
                    break;
                } else if (force > 0) {
                    low = mid;
                } else {
                    high = mid;
                }
            }
        }
        for (Double equilibriumPoint : equilibriumPoints) {
            System.out.println(equilibriumPoint);
        }
    }
}