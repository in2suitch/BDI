import java.util.HashMap;
import java.util.Map;

public class ScoreCalculator {

    private int score;
    private final Map<Integer, Answer> scoreMap = new HashMap<>();

    public Map<Integer, Answer> getScoreMap() {
        return scoreMap;
    }
}
