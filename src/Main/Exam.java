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
}