package Main;

public class TextQuestion extends Question {

    public TextQuestion(int id, String text, String correctAnswer, int scoreValue) {
        super(id, text, correctAnswer, scoreValue);
    }

    @Override
    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}