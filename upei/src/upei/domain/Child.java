package upei.domain;

public class Child {
	private String Name;
	private int Xp;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public int getXp() {
		return Xp;
	}
	public void setXp(int xp) {
		Xp = xp;
	}
	
	public Child (String name, int xp) {
		this.Name = name;
		this.Xp = xp;
	}
}
