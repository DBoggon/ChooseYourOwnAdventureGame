
public class ClassType extends Hero {
	private int hitPoints;
	private int damage;
	private String userInput;

	public ClassType(String classType) {
		super(classType);
	}

	public ClassType() {
	}

	public void setUserInput(String userInput) {
		if (this.userInput.equalsIgnoreCase("paladin") || this.userInput.equalsIgnoreCase("p")
				|| this.userInput.equals("1")) {
			this.userInput = "Paladin";

		}
		if (this.userInput.equalsIgnoreCase("rogue") || this.userInput.equalsIgnoreCase("r")
				|| this.userInput.equals("2")) {
			this.userInput = "Rogue";

		}
		if (this.userInput.equalsIgnoreCase("archer") || this.userInput.equalsIgnoreCase("a")
				|| this.userInput.equals("3")) {
			this.userInput = "Archer";

		}
	}

	public String getUserInput() {
		return userInput;
	}

}
