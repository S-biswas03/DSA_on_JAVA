public class Subset {
    public static void AnsSubsets(int i, String str, String ans){
        if(i == str.length()){
            System.out.print(ans);
            System.out.println();
            return ;
        }
        AnsSubsets(i+1,str, ans + str.charAt(i));
        AnsSubsets(i+1,str,ans);
    }
    public static void main(String[] args){
        String str = "abc";
        AnsSubsets(0,str,"");
    }
}
