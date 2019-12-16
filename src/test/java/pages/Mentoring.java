package pages;

import java.util.Arrays;

public class Mentoring {
    public static void main(String[] args) {

        int [] num=new int [3];
        num[0]=2;
       // num[1]=34;
        num[2]=45;

        System.out.println(Arrays.toString(num));

        int [] nums={1,3,5,6};
        System.out.println(nums.length);

        int [] nums2={1,3,5,7};
        System.out.println(nums2[2]);



        int [] num3={3,5,7,9};
        for(int i=0;i<num3.length;i++){
            System.out.print(num3[i]);
        }

        String [] name={"Kira","Kubat","Aimira","Adilet"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

    }
}
