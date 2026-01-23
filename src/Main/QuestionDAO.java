package Main;

import java.sql.*;
import java.util.ArrayList;

public class QuestionDAO {

    public static ArrayList<Question> getAllQuestions() {
        ArrayList<Question> list = new ArrayList<>();

        String sql = "SELECT * FROM questions";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Question q = new TextQuestion(
                        rs.getInt("id"),
                        rs.getString("text"),
                        rs.getString("correct_answer"),
                        rs.getInt("score_value")
                );
                list.add(q);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void deleteQuestion(int id) {
        String sql = "DELETE FROM questions WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
