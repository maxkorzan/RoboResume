import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resume res = new Resume("Kanye West", "theGreatest@ofAllTime.com","3012132221");
        Education edu = new Education("bachelors","chinese","UMD","2001");
        Experience exp = new Experience("Plumber","Joe's Plumbing","May 2002","June 2018","fixing leaks");
        Skill sk1 = new Skill("running","expert");
        Skill sk2 = new Skill("spelling","novice");
        Skill sk3 = new Skill("juggling","master");


//        //get info from user:
//        System.out.println("CONTACT INFO");
//        System.out.print("Enter your name: ");
//        System.out.print("Enter your email: ");
//
//        System.out.println("EDUCATION");
//        System.out.print("Enter your degree type: ");
//        System.out.print("Enter your major: ");
//        System.out.print("Enter your university name: ");
//        System.out.print("Enter your graduation year: ");
//
//        System.out.println("WORK EXPERIENCE");
//        System.out.print("Enter your company: ");
//        System.out.print("Enter your job title: ");
//        System.out.print("Enter your job description: ");
//        System.out.print("Enter your start date: ");
//        System.out.print("Enter your end date: ");
//
//        System.out.println("SKILLS");
//        System.out.print("Enter your skill name: ");
//        System.out.print("Enter your proficiency \n(Fundamental, Novice, Intermediate, Advanced, Expert): ");


        //header
        System.out.println("=============================================================");
        System.out.println(res.getName());
        System.out.println(res.getEmail());
        System.out.println(res.getPhone());

        //Education
        System.out.println("\nEducation");
        System.out.println(edu.getDegree() + " in " + edu.getMajor());
        System.out.println(edu.getUniversity() + ", " + edu.getGradYear());

        //Experience
        System.out.println("\nExperience");
        System.out.println(exp.getJobTitle());
        System.out.println(exp.getCompany() + ", " + exp.getStartDate() + " - " + exp.getEndDate());
        System.out.println("- Duty 1, " + exp.getDescription());

        //Skills
        System.out.println("\nSkills");
        System.out.println(sk1.getSkillName() + ", " + sk1.getProficiency());
        System.out.println(sk2.getSkillName() + ", " + sk1.getProficiency());
        System.out.println(sk3.getSkillName() + ", " + sk1.getProficiency());













    }

}
