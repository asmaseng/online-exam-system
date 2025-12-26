package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Question q1 = new Question(1, "5 + 3 = ?", "8", 3);
        Question q2 = new Question(2, "Java is a programming language? (yes/no)", "yes", 2);

        Question[] questions = { q1, q2 };

        Candidate S1 = new Candidate(1, "Asanali");
        Candidate S2 = new Candidate(2, "Farabi");

        Exam midterm = new Exam("Midterm Test", 3);

        takeExam(S1, questions, scanner);
        takeExam(S2, questions, scanner);

        System.out.println("\nRESULTS:");
        printResult(S1, midterm);
        printResult(S2, midterm);

        scanner.close();
    }

    public static void takeExam(Candidate candidate, Question[] questions, Scanner scanner) {

        System.out.println("\nCandidate: " + candidate.fullName);

        for (Question q : questions) {
            System.out.println(q.getText());
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (q.isCorrect(answer)) {
                candidate.addPoints(q.getScoreValue());
                System.out.println("Correct! +" + q.getScoreValue());
            } else {
                System.out.println("Wrong!");
            }
        }
    }

    public static void printResult(Candidate candidate, Exam exam) {

        System.out.println(candidate.fullName + " score: " + candidate.getTotalScore());

        if (exam.checkResult(candidate.getTotalScore())) {
            System.out.println(candidate.fullName + " passed the exam");
        } else {
            System.out.println(candidate.fullName + " failed the exam");
        }
    }
}