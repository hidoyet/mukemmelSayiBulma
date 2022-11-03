package mukemmelSayiBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Mükemmel sayı olup olmadığını merak ettiğiniz sayıyı giriniz: ");
		int num=scanner.nextInt(),kontrol=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				kontrol+=i;
				
			}
			
		}
		if(kontrol==num) {
			System.out.println(num+" sayısı mükemmel bir sayıdır");
		}else System.out.println(num+" sayısı mükemmel sayý değildir");
	}

}
