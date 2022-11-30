public class Main {
    public static void main(String[] args) {

        System.out.println(Main.CheckRotation("hello","ohell"));
    }

    public static boolean CheckRotation(String str1, String str2){
        if(str1==null || str2==null) return false;
        //ABCD -> DABC
        //     -> CDAB
        //     -> BCDA
        //     -> ABCA
        if(str1.length() != str2.length()){
            return false;
        }
        if (!(str1+str2).contains(str2)){
            return false;
        }
        return true;
    }
}
