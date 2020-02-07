public class Skill extends Profile {
    //variables
    private String skillName;
    private String proficiency;

    //constructors
    public Skill(){
    }
    public Skill(String skillName, String proficiency) {
        this.skillName = skillName;
        this.proficiency = proficiency;
    }

    //methods
    public String getSkillName() {
        return skillName;
    }
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiency() {
        return proficiency;
    }
    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Skills\n");
        sb.append(getSkillName() + ", " + getProficiency());
        return sb.toString();
    }



}
