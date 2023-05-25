import java.util.Scanner;

public class BDI {

    public static final int FIRST_QUESTION_KEY = 1;
    public static final int ANSWER_GIVES_1 = 1;
    public static final int ANSWER_GIVES_2 = 2;
    public static final int ANSWER_GIVES_3 = 3;

    public static void main(String[] args) {

        Questions questions = new Questions();
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        Scanner scanner = new Scanner(System.in);

        questions.saveQuestions();

        int i = FIRST_QUESTION_KEY;
        while (i <= questions.getQMap().size()) {

            System.out.print("\n");
            System.out.println(i + "/" + questions.getQMap().size());

            for (Answer answer : questions.getQMap().get(i)) {
                System.out.println(answer.getAnswerBody());
            }

            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    break;
                case 2:
                    scoreCalculator.setScore(scoreCalculator.getScore() + ANSWER_GIVES_1);
                    break;
                case 3:
                    scoreCalculator.setScore(scoreCalculator.getScore() + ANSWER_GIVES_2);
                    break;
                case 4:
                    scoreCalculator.setScore(scoreCalculator.getScore() + ANSWER_GIVES_3);
                    break;
                default:
                    System.out.println("Press 1-4 to choose your answer.");
                    i--;
            }
            i++;
        }

        scoreCalculator.printResults();
    }
}
