package Array.ArrayAssignment4;

public class Demo {
    public static void sort(String s){
        String ns="";
        int x=s.length();
        for (int i=s.length()-1;i>0;i++){
            if(s.charAt(i)==' '){
                ns=ns + s.substring(i+1,x);
                x=i;
            }
        }
    }
    public static void main(String[] args) {
        String str="abcdccba";
        sort(str);
        System.out.println(str);
    }
}
