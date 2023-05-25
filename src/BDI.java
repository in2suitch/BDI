import java.util.LinkedHashMap;
import java.util.Map;

public class BDI {
    private static final Map<Integer, Answer[]> questionMap = new LinkedHashMap<>();

    public static void main(String[] args) {

    }

    private static void saveQuestions() {

        Answer[] q1 = {
                new Answer(0, "1 - I do not feel sad."),
                new Answer(1, "2 - I feel sad"),
                new Answer(2, "3 - I am sad all the time and I can't snap out of it."),
                new Answer(3, "4 - I am so sad and unhappy that I can't stand it.") };
        questionMap.put(1, q1);

        Answer[] q2 = {
                new Answer(0, "1 - I am not particularly discouraged about the future."),
                new Answer(1, "2 - I feel discouraged about the future."),
                new Answer(2, "3 - I feel I have nothing to look forward to."),
                new Answer(3, "4 - I feel the future is hopeless and that things cannot improve.") };
        questionMap.put(2, q2);

        Answer[] q3 = {
                new Answer(0, "1 - I do not feel like a failure."),
                new Answer(1, "2 - I feel I have failed more than the average person."),
                new Answer(2, "3 - As I look back on my life, all I can see is a lot of failures."),
                new Answer(3, "4 - I feel I am a complete failure as a person.") };
        questionMap.put(3, q3);
    }
}
