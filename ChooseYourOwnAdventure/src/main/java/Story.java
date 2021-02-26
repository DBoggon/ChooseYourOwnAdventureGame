
public class Story extends Hero {

	// Instantiates ClassType class and grabs the class type the user has selected
	ClassType c = new ClassType();
	private String userClassSelection = c.getUserClassSelection(); 
	private String backStory;

	public Story(String name, String gender, String pronouns[]) {
		super(name, gender, pronouns);
	}
	
	public Story() {
	}
	

//	public String[] pronounGenerator() {
//		return super.pronounGenerator(super.getGender());
//	}
	
	public String getName() {
		return super.getName();
	}

	public String getGender() {
		return super.getGender();
	}
	
	public String[] getPronouns() {
		return super.getPronouns(super.getGender());
	}
	
	public void setBackStory(String userClassSelection) {
		
		String backStoryGender = super.getGender();
		String[] backStoryPronouns = super.getPronouns(backStoryGender);

		if (this.userClassSelection.equals("Paladin")) {
			this.backStory = "\n" + super.getName() + " lived without a permanent residence; " + backStoryPronouns[0]
					+ "  moved around a lot.\r\n" + backStoryPronouns[0] + " had several friends, and  "
					+ backStoryPronouns[2] + " childhood was generally a happy one.\r\n" + backStoryPronouns[0]
					+ " became a Noble because;  " + backStoryPronouns[2] + " family had a title, but none of  "
					+ backStoryPronouns[0] + " ancestors have distinguished themselves since they gained it.\r\n"
					+ backStoryPronouns[0]
					+ " became a Paladin because; Becoming a paladin was a natural consequence of  "
					+ backStoryPronouns[0] + "  unwavering faith. \r\n" + "In taking " + backStoryPronouns[0]
					+ " vows, " + backStoryPronouns[0] + " became the holy sword of " + backStoryPronouns[2]
					+ " religion.";
		}

		if (this.userClassSelection.equals("Rogue")) {
			this.backStory = "\n" + super.getName() + " lived on the streets. " + backStoryPronouns[0]
					+ " had a few close friends and lived an ordinary childhood. \r\n" + backStoryPronouns[0]
					+ " became a Urchin because; One day " + backStoryPronouns[0]
					+ " woke up on the streets, alone and hungry, with no memory of " + backStoryPronouns[2]
					+ " early childhood.\r\n" + this.getName() + " became a Rogue because; " + backStoryPronouns[0]
					+ "  decided to turn " + backStoryPronouns[2]
					+ " natural lucky streak into the basis of a career, though " + this.getName()
					+ " still realize that improving " + backStoryPronouns[2] + " skills is essential.\r\n";
		}

		if (this.userClassSelection.equals("Archer")) {
			this.backStory = "\n" + super.getName() + " lived in a large house.\r\n" + backStoryPronouns[0]
					+ " had a few close friends and lived an ordinary childhood.\r\n" + backStoryPronouns[0]
					+ " became a Folk Hero because; " + backStoryPronouns[0]
					+ " were always enamored by tales of heroes and wished  " + backStoryPronouns[0]
					+ " could be something more than ordinary.\r\n" + backStoryPronouns[0]
					+ " became a Ranger because; " + backStoryPronouns[0]
					+ " have seen what happens when the monsters come out from the dark. \"\r\n"
					+ "You took it upon yourself to become the first line of defense against the evils that lie beyond civilization's borders.";
		}
		System.out.println(backStoryPronouns[0]);
		System.out.println(backStoryPronouns[1]);
		System.out.println(backStoryPronouns[2]);


	}

	public String getBackStory() {
		System.out.println(this.userClassSelection);
		return backStory;
	}

}
