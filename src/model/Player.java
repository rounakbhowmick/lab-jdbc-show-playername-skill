
package model;

public class Player {
	public Player(Long playerId, String name, String country, String skill) {
		this.playerId = playerId;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	Long playerId;
	String name, country;
	String skill;

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
}
