package Main;

public class Exam {
    private String name;
    private int minScore;

    public Exam(String name, int minScore) {
        this.name = name;
        this.minScore = minScore;
    }

    public boolean checkResult(int score) {
        return score >= minScore;
    }
}
