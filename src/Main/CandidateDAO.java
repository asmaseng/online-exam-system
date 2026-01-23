package Main;

import java.sql.*;

public class CandidateDAO {

    public static int addCandidate(String name) {
        String sql = "INSERT INTO candidates(full_name) VALUES (?) RETURNING id";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static void updateScore(int id, int score) {
        String sql = "UPDATE candidates SET total_score = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, score);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
