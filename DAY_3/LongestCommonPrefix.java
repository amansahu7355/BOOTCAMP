public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] s = {"flower","flow","flight"};
        String prefix = s[0];

        for(int i=1;i<s.length;i++){
            while(!s[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }
        System.out.println("Longest Common Prefix:" + prefix);
    }
    
}
