package Main;

import java.util.Objects;

public class Candidate {
    private int id;
    private String fullName;
    private int totalScore;

    public Candidate(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public void addPoints(int points) {
        totalScore += points;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return fullName + " score=" + totalScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidate)) return false;
        Candidate c = (Candidate) o;
        return id == c.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public int getId() {
        return id;
    }

}
