import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class EmployeeSkillAssignment {
    public static void findTeams(int[] skills, int target, int index, List<Integer> team) {
        if (target == 0) {
            System.out.print("[");
            for(int i=0; i<team.size(); i++){
                System.out.print(team.get(i));
                if(i<team.size()-1) System.out.print(",");
            }
            System.out.println("]");
            return;
        }
        if (target < 0 || index == skills.length) return;
        findTeams(skills, target, index + 1, team);
        team.add(skills[index]);
        findTeams(skills, target - skills[index], index + 1, team);
        team.remove(team.size() - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of skills: ");
        int n = sc.nextInt();
        int[] skills = new int[n];
        System.out.print("Enter skills: ");
        for (int i = 0; i < n; i++) skills[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        System.out.println("Output:");
        findTeams(skills, target, 0, new ArrayList<>());
        sc.close();
    }
}
