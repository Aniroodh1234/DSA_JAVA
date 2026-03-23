public class duplicatestring{
    public static void duplicate(String str, int idx, StringBuilder sb, boolean arr[]){
        if(idx==str.length()){
            System.out.print(sb);
            return;
        }
        char ch = str.charAt(idx);
        if(arr[ch-'a']==true){
            duplicate(str,idx+1,sb,arr);
        }
        else{
            arr[ch-'a']=true;
            duplicate(str,idx+1,sb.append(ch),arr);
        }
    }
    public static void main(String[]args){
        String str = "extreme";
        int idx = 0;
        StringBuilder sb = new StringBuilder("");
        boolean arr[] = new boolean[26];
        duplicate(str,idx,sb,arr);
    }
}
