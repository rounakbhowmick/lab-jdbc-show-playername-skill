package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {
	final String sql = "select * from skill where id = ?";
	Skill skill;

	public Skill getSkillBylD(Long id) throws ClassNotFoundException, SQLException, IOException {
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql);
		ps.setLong(1, skill.getSkillId());
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			skill = new Skill(rs.getLong(1), rs.getString(2));
		}
		return skill;
	}

}
