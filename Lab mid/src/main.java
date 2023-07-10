import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<String>students =new ArrayList<>();
        students.add("Zain");
        students.add("Wahab");
        ArrayList<String>students2 =new ArrayList<>();
        students.add("Muqeet");
        students.add("Haris");
        students.addAll(2,students2);
        System.out.println(students);
       students.remove("Haris");
        System.out.println(students);

       // students.removeAll(students);
        System.out.println(students.size());
        if (students.contains("Wahab"))
            System.out.println("Wahab");
        else System.out.println("Wahab not present ");
    }
    }

