package Main;

import java.util.Objects;

public abstract class Question {
    protected int id;
    protected String text;
    protected String correctAnswer;
    protected int scoreValue;

    public Question(int id, String text, String correctAnswer, int scoreValue) {
        this.id = id;
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.scoreValue = scoreValue;
    }

    public String getText() {
        return text;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    public abstract boolean isCorrect(String answer);

    @Override
    public String toString() {
        return "Question{id=" + id + ", score=" + scoreValue + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question q = (Question) o;
        return id == q.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
