package Main;

public class Candidate {
    int id;
    String fullName;
    int totalScore;

    Candidate() {

    }
    Candidate(int id, String fullname) {
        this.id = id;
        this.fullName = fullname;
        this.totalScore = 0;
    }

    void addPoints(int value) {
        totalScore += value;
    }
}