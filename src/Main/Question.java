package Main;

public class Question {
    int number;
    String questionText;
    String rightAnswer;
    int scoreValue;

    Question() {

    }

    Question(int number, String questionText, String rightAnswer, int scoreValue) {
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

    int getScoreValue() {
        return scoreValue;
    }

    void setScoreValue(int scoreValue) {
        this.scoreValue = scoreValue;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getQuestionText() {
        return questionText;
    }
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public String getRightAnswer() {
        return rightAnswer;
    }
    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
    public boolean isCorrect() {
        return isCorrect(this.rightAnswer);
    }
    public void setCorrect(boolean correct) {
        if (correct) {

        }
    }
}