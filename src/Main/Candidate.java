package Main;

import java.util.Objects;

public class Candidate {
    private int id;
    public String fullName;
    private int totalScore;

    public Candidate(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
        this.totalScore = 0;
    }

    public void addPoints(int points) {
        totalScore += points;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + fullName + '\'' +
                ", score=" + totalScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidate)) return false;
        Candidate that = (Candidate) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}