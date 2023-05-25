public class ScoreCalculator {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void printResults() {
        System.out.print("\n");
        System.out.println("Total Score: " + score + ".");
        System.out.print("Interpretation: ");

        if (score <= 10) {
            System.out.println("these ups and downs are considered normal.");
        } else if (score <= 16) {
            System.out.println("mild mood disturbance.");
        } else if (score <= 20) {
            System.out.println("borderline clinical depression.");
        } else if (score <= 30) {
            System.out.println("moderate depression.");
        } else if (score <= 40) {
            System.out.println("severe depression.");
        } else {
            System.out.println("extreme depression.");
        }
    }
}
