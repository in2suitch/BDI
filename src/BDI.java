import java.util.Scanner;

public class BDI {

    public static final int FIRST_QUESTION_KEY = 1;
    public static final int ONE_POINT = 1;
    public static final int TWO_POINTS = 2;
    public static final int THREE_POINTS = 3;

    public static void main(String[] args) {

        Questions questions = new Questions();
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        Scanner scanner = new Scanner(System.in);

        questions.importQuestions();

        for (int i = FIRST_QUESTION_KEY; i <= questions.getQNumToAnswer().size(); i++) {

            System.out.print("\n");
            System.out.println(i + "/" + questions.getQNumToAnswer().size());

            for (Answer answer : questions.getQNumToAnswer().get(i)) {
                System.out.println(answer.getAnswerBody());
            }

            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    break;
                case 2:
                    scoreCalculator.setScore(scoreCalculator.getScore() + ONE_POINT);
                    break;
                case 3:
                    scoreCalculator.setScore(scoreCalculator.getScore() + TWO_POINTS);
                    break;
                case 4:
                    scoreCalculator.setScore(scoreCalculator.getScore() + THREE_POINTS);
                    break;
                default:
                    System.out.println("Press 1-4 to choose your answer.");
                    i--;
            }
        }
        scoreCalculator.printResults();
    }
}
