import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contact con = new Contact();
        Education edu = new Education();
        Experience exp = new Experience();
        Skill sk1 = new Skill();
        Skill sk2 = new Skill();
        Skill sk3 = new Skill();


//        ArrayList<Profile> fred = new ArrayList<>();
//        fred.add(new Contact("Kanye West", "theGreatest@ofAllTime.com","3012132221"));
//        fred.add(new Education("bachelors","chinese","UMD","2001"));
//        fred.add(new Experience("Plumber","Joe's Plumbing","May 2002","June 2018","fixing leaks"));
//        fred.add(new Skill("running","expert"));
//        fred.add(new Skill("spelling","novice"));
//        fred.add(new Skill("juggling","master"));


//        Contact con = new Contact("Kanye West", "theGreatest@ofAllTime.com", "3012132221");
//        Education edu = new Education("bachelors", "chinese", "UMD", "2001");
//        Experience exp = new Experience("Plumber", "Joe's Plumbing", "May 2002", "June 2018", "fixing leaks");
//        Skill sk1 = new Skill("running", "expert");
//        Skill sk2 = new Skill("spelling", "novice");
//        Skill sk3 = new Skill("juggling", "master");

        //get info from user:
        System.out.println("Welcome to the Robo-Resume generator!" +
                "\nPlease put in the following information, and your completed resume will display below");

        System.out.println("\nCONTACT INFO");
        System.out.print("Enter your name: ");
        con.setName(sc.nextLine());
        System.out.print("Enter your email: ");
        con.setEmail(sc.nextLine());
        System.out.print("Enter your phone number: ");
        con.setPhone(sc.nextLine());


        System.out.println("\nEDUCATION");
        System.out.print("Enter your degree type: ");
        edu.setDegree(sc.nextLine());
        System.out.print("Enter your major: ");
        edu.setMajor(sc.nextLine());
        System.out.print("Enter your university name: ");
        edu.setUniversity(sc.nextLine());
        System.out.print("Enter your graduation year: ");
        edu.setGradYear(sc.nextLine());

        System.out.println("\nWORK EXPERIENCE");
        System.out.print("Enter your company: ");
        exp.setCompany(sc.nextLine());
        System.out.print("Enter your job title: ");
        exp.setJobTitle(sc.nextLine());
        System.out.print("Enter your job description: ");
        exp.setDescription(sc.nextLine());
        System.out.print("Enter your start date: ");
        exp.setStartDate(sc.nextLine());
        System.out.print("Enter your end date: ");
        exp.setEndDate(sc.nextLine());


        System.out.println("\nSKILLS");
        System.out.print("Enter your skill name (1 of 3): ");
        sk1.setSkillName(sc.nextLine());
        System.out.print("Enter your proficiency \n(Fundamental, Novice, Intermediate, Advanced, Expert): ");
        sk1.setProficiency(sc.nextLine());

        System.out.print("Enter another skill name (2 of 3): ");
        sk2.setSkillName(sc.nextLine());
        System.out.print("Enter your proficiency \n(Fundamental, Novice, Intermediate, Advanced, Expert): ");
        sk2.setProficiency(sc.nextLine());

        System.out.print("Enter another skill name (3 of 3): ");
        sk3.setSkillName(sc.nextLine());
        System.out.print("Enter your proficiency \n(Fundamental, Novice, Intermediate, Advanced, Expert): ");
        sk3.setProficiency(sc.nextLine());



        ArrayList<Profile> resume = new ArrayList<>();

        resume.add(new Contact(con.getName(), con.getEmail(), con.getPhone()));
        resume.add(new Education(edu.getDegree(), edu.getMajor(), edu.getUniversity(), edu.getGradYear()));
        resume.add(new Experience(exp.getJobTitle(), exp.getCompany(), exp.getStartDate(), exp.getEndDate(), exp.getDescription()));
        resume.add(new Skill(sk1.getSkillName(), sk1.getProficiency()));
        resume.add(new Skill(sk2.getSkillName(), sk2.getProficiency()));
        resume.add(new Skill(sk3.getSkillName(), sk3.getProficiency()));

        for (int i = 0; i < resume.size(); i++) {
            System.out.println(resume.get(i));
        }





//        //Header
//        System.out.println(con.toString());
////        System.out.println("\n\n\n=============================================================");
////        System.out.println(con.getName());
////        System.out.println(con.getEmail());
////        System.out.println(con.getPhone());
//
//        //Education
//        System.out.println(edu.toString());
////        System.out.println("\nEducation");
////        System.out.println(edu.getDegree() + " in " + edu.getMajor());
////        System.out.println(edu.getUniversity() + ", " + edu.getGradYear());
//
//
//        //Experience
//        System.out.println("\nExperience");
//        System.out.println(exp.getJobTitle());
//        System.out.println(exp.getCompany() + ", " + exp.getStartDate() + " - " + exp.getEndDate());
//        System.out.println("- Duty 1, " + exp.getDescription());
//
//        //Skills
//        System.out.println("\nSkills");
//        System.out.println(sk1.getSkillName() + ", " + sk1.getProficiency());
//        System.out.println(sk2.getSkillName() + ", " + sk2.getProficiency());
//        System.out.println(sk3.getSkillName() + ", " + sk3.getProficiency());
//
//
//    }

    }
}
