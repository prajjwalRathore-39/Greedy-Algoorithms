//Let's consider the following situation. You've invited a lot of children to a celebration party, and you want to entertain them and also teach them something in the process. You are going to hire a few teachers and divide the children into groups and assign a teacher to each of the groups. This teacher will work with this group through the whole party.

//But you know that for a teacher to work with a group of children efficiently children of that group should be of relatively the same age. More specifically age of any two children in the same group should differ by at most, one year.

//Also, you want to minimize the number of groups. Because you want to hire fewer teachers, and spend the money on presents and other kinds of entertainment for the children. So, you need to divide children into the minimum possible number of groups. Such that the age of any two children in any group differs by at most one year.

import java.util.Arrays;
import java.util.Scanner;

public class groupingChildren {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float[] ages=new float[n];
        for (int i=0;i<n;i++)
            ages[i]=sc.nextFloat();
        groupingChildren obj=new groupingChildren();
        System.out.println(obj.MinGroups(ages));
    }
    static int MinGroups(float[] ages){
        Arrays.sort(ages);
        int i=0;
        int j=1;
        int groups=1;
        while (j<ages.length){
            if (ages[j]-ages[i]<=1){
                j++;
            }
            else {
                groups++;
                i=j;
                j++;
            }
        }
        return groups;
    }
}


// Approach:- SORTING THE ARRAY WILL GIVE YOU THE CHILDRENS ACCORDING TO THERE AGES AND THE WE WILL FIND THE CHILDREN WHICH HAVE THE AGE IFFERENCE GREATER THAN A YEAR.
// VARIABLE "groups" GIVE YOU THE NUMBER OF GROUPS WHICH ARE TO BE FORMED
