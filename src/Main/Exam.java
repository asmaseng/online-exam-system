package Main;

public class Exam {
    private String examName;
    private int minimumScore;

    public Exam(String examName, int minimumScore) {
        this.examName = examName;
        this.minimumScore = minimumScore;
    }

    public boolean checkResult(int score) {
        return score >= minimumScore;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "name='" + examName + '\'' +
                ", minScore=" + minimumScore +
                '}';
    }
}