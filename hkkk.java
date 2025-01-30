public class hkkk{
    public static void main(String[] args){
        String s="Hello  World";
        String str="";
        char ch;
        int len=s.length();
        for(int i=len-1;i>=0;i--){
            ch=s.charAt(i);
            while(ch==' '){
                str+=ch;
                break;
            }
        }
        System.out.println(str.length());
    }
}