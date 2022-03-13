package dataStructuresPractice;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {12,2,1,5,78,5,3};
        while(true)
        {
		System.out.println("\nPlease enter the value of K = ");
		int k = sc.nextInt();
		int res = KthSmallestElement.SmallestElement(a,k);
		System.out.println("Result : "+res);
	}
	}
	
	static int SmallestElement(int[] a,int k)
	{
		Arrays.sort(a);
		return a[k-1];
	}

}
