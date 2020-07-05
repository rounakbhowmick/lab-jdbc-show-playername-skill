package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import utility.ConnectionManager;

public class PlayerDAO {
	List<Player> list = new ArrayList<Player>();

	public List<Player> display() throws ClassNotFoundException, SQLException {
		Player player;
//		String sql = "SELECT * FROM PLAYER";
		String sql = "SELECT * FROM SKILLS";
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			player = new Player(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4));
			list.add(player);
		}
		return list;
	}
}
