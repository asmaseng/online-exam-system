package Main;

public class Exam {
    String examName;
    int minimumScore;

    Exam() {

    }
    Exam(String examName, int minimumScore) {
        this.examName = examName;
        this.minimumScore = minimumScore;
    }

    boolean checkResult(int score) {
        if (score >= minimumScore) {
            return true;
        }
        return false;
    }

    int getMinimumScore() {
        return minimumScore;
    }

    void setMinimumScore(int minimumScore) {
        this.minimumScore = minimumScore;
    }
    public String getExamName() {
        return examName;
    }
    public void setExamName(String examName) {
        this.examName = examName;
    }
}