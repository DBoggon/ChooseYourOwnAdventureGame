
public class Hero {
	private String name;
	private String gender;
	private String pronouns[];
	

	// constructor for backStory method in Story class
	public Hero(String name, String gender, String pronouns[]) {
		this.name = name;
		this.gender = gender;
		this.pronouns = pronouns;
	}

	public Hero() {
	}

	public String getName() {
		return name;
	}

	public void setName(String userInputName) {
		this.name = userInputName;
	}

	public void setGender(String gender) {
		this.pronouns = new String[3];
		if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m") || gender.equals("1")) {
			this.gender = "male";
//			pronouns[0] = "he";
//			pronouns[1] = "him";
//			pronouns[2] = "his";
		}
		if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f") || gender.equals("2")) {
			this.gender = "female";
//			pronouns[0] = "she";
//			pronouns[1] = "her";
//			pronouns[2] = "her";
		}
		if (gender.equalsIgnoreCase("neutral") || gender.equalsIgnoreCase("n") || gender.equals("3")) {
			this.gender = "neutral";
//			pronouns[0] = "they";
//			pronouns[1] = "them";
//			pronouns[2] = "their";
		}
	}

	public String getGender() {
		return gender;
	}
	
	public String[] getPronouns(String gender) {
		this.pronouns = new String[3];
		
		if (getGender().equals("male")) {
			pronouns[0] = "he";
			pronouns[1] = "him";
			pronouns[2] = "his";
		}
		if (getGender().equals("female")) {
			pronouns[0] = "she";
			pronouns[1] = "her";
			pronouns[2] = "her";
		}
		if (getGender().equals("neutral")) {
			pronouns[0] = "they";
			pronouns[1] = "them";
			pronouns[2] = "their";
		}
		return this.pronouns;
	}

}
