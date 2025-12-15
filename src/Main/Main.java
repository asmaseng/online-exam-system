package Main;

public class Main {
    public static void main(String[] args) {
        Question q1 = new Question(1, "5 + 3 = ?", "8", 3);
        Question q2 = new Question(2, "Java is a language?", "yes", 2);

        Candidate S1 = new Candidate(1, "Asanali");
        Candidate S2 = new Candidate(2, "Farabi");

        Exam midterm = new Exam("Midterm Test", 3);

        if (q1.isCorrect("8")) {
            S1.addPoints(q1.getScoreValue());
        }
        if (q2.isCorrect("yes")) {
            S1.addPoints(q2.getScoreValue());
        }
        if (q1.isCorrect("7")) {
            S2.addPoints(q1.getScoreValue());
        }

        System.out.println(S1.fullName + " score: " + S1.getTotalScore());
        System.out.println(S2.fullName + " score: " + S2.getTotalScore());

        if (midterm.checkResult(S1.getTotalScore())) {
            System.out.println(S1.fullName + " passed the exam");
        }
        else {
            System.out.println(S1.fullName + " failed the exam");
        }

        if (midterm.checkResult(S2.getTotalScore())) {
            System.out.println(S2.fullName + " passed the exam");
        } else {
            System.out.println(S2.fullName + " failed the exam");
        }
    }
}