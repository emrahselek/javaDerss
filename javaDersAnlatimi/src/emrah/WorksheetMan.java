package emrah;

public class WorksheetMan {

    public static void main(String[] args){
        // palindrome   emme->emme , 12321
        // not palindrome=> emrah -> harme
        // when reverse to string or int, it is same original string. it is palindrome


        String str = "nurses run";
        str = str.replace(" ","").toLowerCase();
        String rverse = "";

        for(int i=str.length()-1 ;            i>=0 ;            i--     ){
            rverse = rverse + str.charAt(i);
        }
        if (str.equals(rverse)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not a palindrome");
        }

    }


}
