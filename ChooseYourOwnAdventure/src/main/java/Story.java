
public class Story extends Hero {

	// Instantiates ClassType class and grabs the class type the user has selected
	private ClassType c = new ClassType();
	private String userClassSelection = c.getUserInput();
	private String backStory;

	public Story(String name, String[] pronouns) {
		super(name, pronouns);
	}

	public Story() {
		super();
	}

	public void setBackStory(String userClassSelection) {
		if (this.userClassSelection.equals("Paladin")) {
			this.backStory = "\n" + this.getName() + " lived without a permanent residence; " + this.getPronouns()[0]
					+ "  moved around a lot.\r\n" + this.getPronouns()[0] + " had several friends, and  "
					+ this.getPronouns()[2] + " childhood was generally a happy one.\r\n" + this.getPronouns()[0]
					+ " became a Noble because;  " + this.getPronouns()[2] + " family had a title, but none of  "
					+ this.getPronouns()[0] + " ancestors have distinguished themselves since they gained it.\r\n"
					+ this.getPronouns()[0]
					+ " became a Paladin because; Becoming a paladin was a natural consequence of  "
					+ this.getPronouns()[0] + "  unwavering faith. \r\n" + "In taking " + this.getPronouns()[0]
					+ " vows, " + this.getPronouns()[0] + " became the holy sword of " + this.getPronouns()[2]
					+ " religion.";
		}

		if (this.userClassSelection.equals("Rogue")) {
			this.backStory = "\n" + this.getName() + " lived on the streets. " + this.getPronouns()[0]
					+ " had a few close friends and lived an ordinary childhood. \r\n" + this.getPronouns()[0]
					+ " became a Urchin because; One day " + this.getPronouns()[0]
					+ " woke up on the streets, alone and hungry, with no memory of " + this.getPronouns()[2]
					+ " early childhood.\r\n" + this.getName() + " became a Rogue because; " + this.getPronouns()[0]
					+ "  decided to turn " + this.getPronouns()[2]
					+ " natural lucky streak into the basis of a career, though " + this.getName()
					+ " still realize that improving " + this.getPronouns()[2] + " skills is essential.\r\n";
		}

		if (this.userClassSelection.equals("Archer")) {
			this.backStory = "\n" + this.getName() + " lived in a large house.\r\n" + this.getPronouns()[0]
					+ " had a few close friends and lived an ordinary childhood.\r\n" + this.getPronouns()[0]
					+ " became a Folk Hero because; " + this.getPronouns()[0]
					+ " were always enamored by tales of heroes and wished  " + this.getPronouns()[0]
					+ " could be something more than ordinary.\r\n" + this.getPronouns()[0]
					+ " became a Ranger because; " + this.getPronouns()[0]
					+ " have seen what happens when the monsters come out from the dark. \"\r\n"
					+ "You took it upon yourself to become the first line of defense against the evils that lie beyond civilization's borders.";
		}

	}

	public String getBackStory() {
		return backStory;
	}

}
