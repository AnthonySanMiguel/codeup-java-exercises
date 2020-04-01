package grades;

import util.Input;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) throws Exception {

        HashMap<String, Student> students = new HashMap<>();
        students.put("gitHubUserA", new Student("Anthony"));
        students.put("gitHubUserB", new Student("Kathryn"));
        students.put("gitHubUserC", new Student("Ryan"));
        students.put("gitHubUserD", new Student("Pepito"));

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            students.get("gitHubUserA").addGrade(random.nextInt(100));
            students.get("gitHubUserB").addGrade(random.nextInt(100));
            students.get("gitHubUserC").addGrade(random.nextInt(100));
            students.get("gitHubUserD").addGrade(random.nextInt(100));
        }

        System.out.println("\n\tWelcome!\n\n\tHere are the Github usernames of our students:\n");
        System.out.println("\t" + students.keySet());

        Scanner scanner = new Scanner(System.in);
        Input.setScanner(scanner);

        String ghUser;
        boolean confirmation = true;
        do {
            ghUser = Input.getString("\n\tWhich student's stats would you like to view? (enter student's github username): ");
        //Check if typed in user actually exists
            if(!students.containsKey(ghUser)){
                System.out.println("\n\tNo student with that Github username was found...\n");
            } else {
                Student thisStudent = students.get(ghUser);
                System.out.println("\n\n\tName: " + thisStudent.getName() + " || Github Username: " + ghUser + "Current Average: " + thisStudent.getGradeAverage());
            }
            confirmation = Input.yesNo("\tWould you like to see another? [Y/N]");
        } while(confirmation); // Once user says they no longer want to participate/continue, exit!
    }
}
