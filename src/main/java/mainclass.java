import java.util.*;

public class mainclass {
    public static void reverse(String str1,String str2) {

        char arr1[] =str1.toLowerCase().toCharArray();
        char arr2[] =str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("true");
        }else
            System.out.println("false");
    }

    public static void main(String args[]){

        reverse("abc","bcd");
        System.out.println("Test");
    }
}