package Main;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new TextQuestion(1, "5 + 3 = ?", "8", 3));
        questions.add(new TextQuestion(2, "Java is OOP language? (yes/no)", "yes", 2));
        questions.add(new TextQuestion(3, "2 * 2 = ?", "4", 1));

        questions.sort(Comparator.comparingInt(Question::getScoreValue));

        System.out.println("\nFiltered questions (score >= 2):");
        for (Question q : questions) {
            if (q.getScoreValue() >= 2) {
                System.out.println(q);
            }
        }

        Question found = findQuestionById(questions, 2);
        System.out.println("\nSearch result: " + found);

        Candidate s1 = new Candidate(1, "Asanali");
        Candidate s2 = new Candidate(2, "Farabi");

        Exam exam = new Exam("Midterm", 3);

        takeExam(s1, questions, scanner);
        takeExam(s2, questions, scanner);

        printResult(s1, exam);
        printResult(s2, exam);

        scanner.close();
    }

    public static void takeExam(Candidate c, ArrayList<Question> questions, Scanner scanner) {
        System.out.println("\nCandidate: " + c.getFullName());

        for (Question q : questions) {
            System.out.println(q.getText());
            System.out.print("Answer: ");
            String ans = scanner.nextLine();

            if (q.isCorrect(ans)) {
                c.addPoints(q.getScoreValue());
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        }
    }

    public static void printResult(Candidate c, Exam exam) {
        System.out.println(c);
        System.out.println(
                exam.checkResult(c.getTotalScore())
                        ? "PASSED"
                        : "FAILED"
        );
    }

    public static Question findQuestionById(ArrayList<Question> list, int id) {
        for (Question q : list) {
            if (q.id == id) return q;
        }
        return null;
    }
}
