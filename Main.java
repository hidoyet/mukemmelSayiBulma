package mukemmelSayiBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("M�kemmel say� olup olmad���n� merak etti�iniz say�y� giriniz: ");
		int num=scanner.nextInt(),kontrol=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				kontrol+=i;
				
			}
			
		}
		if(kontrol==num) {
			System.out.println(num+" say�s� m�kemmel bir say�d�r");
		}else System.out.println(num+" say�s� m�kemmel say� de�ildir");
	}

}
