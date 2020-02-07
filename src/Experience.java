public class Experience extends Profile {
    //variables
    private String jobTitle;
    private String company;
    private String startDate;
    private String endDate;
    private String description;

    //constructors
    public Experience(){
    }
    public Experience(String jobTitle, String company, String startDate, String endDate, String description) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    //methods
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Experience\n");
        sb.append(getJobTitle() + "\n");
        sb.append(getCompany() + ", " + getStartDate() + " - " + getEndDate() + "\n");
        sb.append("- Duty 1, " + getDescription() + "\n");
        return sb.toString();
    }


}
