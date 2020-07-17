/**
 * Input:   str1 = "geek", str2 = "gesek"
 * Output:  1
 * We can convert str1 into str2 by inserting a 's'.
 *
 * Input:   str1 = "cat", str2 = "cut"
 * Output:  1
 * We can convert str1 into str2 by replacing 'a' with 'u'.
 *
 * Input:   str1 = "sunday", str2 = "saturday"
 * Output:  3
 * Last three and first characters are same.  We basically
 * need to convert "un" to "atur".  This can be done using
 * below three operations.
 * Replace 'n' with 'r', insert t, insert a
 */
public class EDIST {
    static  int min(int x,int y,int z){
        if(x<=y && x<=z)return x;
        if(y<=x && y<=z)return y;
        else return z;
    }
    static  int edit_dist(String str1,String str2,int m,int n){
        if(m==0)return n;
        if(n==0)return m;
        if(str1.charAt(m-1)==str2.charAt(n-1))
            return edit_dist(str1,str2,m-1,n-1);
        return 1+ min(edit_dist(str1,str2,m,n-1),
                    edit_dist(str1,str2,m-1,n),
                    edit_dist(str1,str2,m-1,n-1));

    }
    public static void main(String[] args) {
        String str1="un";
        String str2="aturn";
        System.out.println(edit_dist(str1,str2,str1.length(),str2.length()));
    }
}
