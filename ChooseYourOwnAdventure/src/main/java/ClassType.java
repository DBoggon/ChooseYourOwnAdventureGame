
public class ClassType extends Hero {
	private int hitPoints;
	private int damage;
	private String userClassSelection;

	public ClassType(String userClassSelection) {
		this.userClassSelection = userClassSelection;
	}
	
	public ClassType() {
	}

	public void setUserClassSelection(String userInput) {
		if (this.userClassSelection.equalsIgnoreCase("paladin") || this.userClassSelection.equalsIgnoreCase("p")
				|| this.userClassSelection.equals("1")) {
			this.userClassSelection = "Paladin";

		}
		if (this.userClassSelection.equalsIgnoreCase("rogue") || this.userClassSelection.equalsIgnoreCase("r")
				|| this.userClassSelection.equals("2")) {
			this.userClassSelection = "Rogue";

		}
		if (this.userClassSelection.equalsIgnoreCase("archer") || this.userClassSelection.equalsIgnoreCase("a")
				|| this.userClassSelection.equals("3")) {
			this.userClassSelection = "Archer";

		}
	}

	public String getUserClassSelection() {
		return userClassSelection;
	}

}
