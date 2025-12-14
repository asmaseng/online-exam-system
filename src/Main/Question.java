package Main;

public class Question {
    int number;
    String questionText;
    String rightAnswer;
    int scoreValue;

    Question() {

    }

    Question(int number, String questionText, String rightAnswer, int scorevalue) {
        this.number = number;
        this.questionText = questionText;
        this.rightAnswer = rightAnswer;
        this.scoreValue = scoreValue;
    }

    boolean isCorrect(String userAnswer) {
        if (userAnswer.equals(rightAnswer)) {
            return true;
        }
        return false;
    }
}