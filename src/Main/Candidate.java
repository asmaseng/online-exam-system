package Main;

public class Candidate {
    int id;
    String fullName;
    int totalScore;

    Candidate() {

    }
    Candidate(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
        this.totalScore = 0;
    }

    void addPoints(int value) {
        totalScore += value;
    }

    int getTotalScore() {
        return totalScore;
    }

    void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
    int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
