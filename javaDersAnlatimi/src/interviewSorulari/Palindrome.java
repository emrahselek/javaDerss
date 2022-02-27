package interviewSorulari;

public class Palindrome {
    public static void main(String[] args) {

        String world = "anna";
        world = world.toLowerCase();
        String reverse = "";
        for( int i = world.length()-1; i >= 0 ; i--){
            reverse = reverse + world.charAt(i);
        }
        if (reverse.equals(world)){
            System.out.println(world + " is a palindrome");
        }else {
            System.out.println(world + " is not a palindrome");
        }
    }
}
