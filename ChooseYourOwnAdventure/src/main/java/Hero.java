
public class Hero {
	private String name;
	private String backStory;
	private String gender;
	private String pronouns[];
	private String classType;

	//constructor for backStory method in Story class
	public Hero(String name, String backStory, String[] pronouns) {
		this.name = name;
		this.backStory = backStory;
	}
	
	//constructor for classBuilder method in ClassType class
	public Hero (String classType) {
		this.classType = classType;
	}
	
	public Hero() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String userInputName) {
		this.name = userInputName;
	}

	public String gender(String userInputGender) {
		return userInputGender;
	}

	public String[] getPronouns() {
		this.pronouns = new String[3];

		if (this.gender.equalsIgnoreCase("male") || this.gender.equalsIgnoreCase("m")
				|| this.gender.equals("1")) {
			this.gender = "male";
			this.getPronouns()[0] = "he";
			this.getPronouns()[1] = "him";
			this.getPronouns()[2] = "his";
		}
		if (this.gender.equalsIgnoreCase("female") || this.gender.equalsIgnoreCase("f")
				|| this.gender.equals("2")) {
			this.gender = "female";
			this.getPronouns()[0] = "she";
			this.getPronouns()[1] = "her";
			this.getPronouns()[2] = "her";
		}
		if (this.gender.equalsIgnoreCase("neutral") || this.gender.equalsIgnoreCase("n")
				|| this.gender.equals("3")) {
			this.gender = "neutral";
			this.getPronouns()[0] = "they";
			this.getPronouns()[1] = "them";
			this.getPronouns()[2] = "their";
		}

		return pronouns;
	}


	public String getBackStory() {
		return backStory;
	}


}
