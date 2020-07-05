package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import model.Player;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PlayerDAO playerdao = new PlayerDAO();
		List<Player> playerslist = new ArrayList<Player>();
		playerslist = playerdao.display();
		System.out.println("id\tname\t\t\tcountry\t\t\tskill");
		for (Player p : playerslist) {
			System.out.println(p.getPlayerId() + "\t" + p.getName() + "\t" + "\t" + p.getCountry() + "\t" + "\t" + "\t"
					+ p.getSkill());
		}
	}
}
