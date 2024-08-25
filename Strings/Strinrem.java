package Strings;

public class Strinrem {
    public static void main(String[] args) {
        String s1="aaxxxcc";
        String emptyString="";
        int count=0;
        for (int ind = 0; ind < s1.length(); ind++) {
            if (s1.charAt(ind) =='x') {

                count ++;
            }else{
                emptyString+=s1.charAt(ind);
            }
        }
        System.out.println(count);
        System.out.println(emptyString);
        for (int i = 0; i < count; i++) {
            emptyString +='x';
        }
        System.out.println(emptyString);
    }

}
