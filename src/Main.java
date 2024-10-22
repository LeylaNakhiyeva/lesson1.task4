import java.util.Scanner;

public class Main {                                      //ders1. test4
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        String s=switch (a){
            case 1-> "yanvar";
            case 2-> "fevral";
            case 3-> "mart";
            case 4-> "aprel";
            case 5-> "may";
            case 6-> "iyun";
            case 7-> "iyul";
            case 8-> "avqust";
            case 9-> "sentyabr";
            case 10-> "oktyabr";
            case 11-> "noyabr";
            case 12-> "dekabr";
            default -> "melumat yalnış";

        };
        System.out.println("bu "+s+"dır!");
    }
}