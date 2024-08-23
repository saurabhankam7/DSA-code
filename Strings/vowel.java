package Strings;

public class vowel {
    public static void main(String[] args) {
        String s1= "saurabh";
        char[] ch=s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='a'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
                ch[i]=ch[i+1];
                continue;
                
            }
            System.out.println(ch[i]);
        }

        
    }
}
