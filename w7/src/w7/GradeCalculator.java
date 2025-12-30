package w7;
import java.util.List;

public class GradeCalculator {
    public static double calculateAverage(List<Integer> grades) {
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.size();
    }
}
