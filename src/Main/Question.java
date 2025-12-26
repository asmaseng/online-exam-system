package Main;

import java.util.Objects;

public class Question {
    private int id;
    private String text;
    private String correctAnswer;
    private int scoreValue;

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

    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", score=" + scoreValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question = (Question) o;
        return id == question.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}