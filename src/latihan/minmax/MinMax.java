package latihan.minmax;

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Scanner reader = new Scanner(System.in);
		System.out.println("===Program Nilai Terbesar dan Terkecil Nilai Mahasiswa===");
		System.out.print("Masukan Nama Petugas : ");
		String petugas = reader.next();
		System.out.print("Masukan Banyaknya Mahasiswa : ");
		int banyak = reader.nextInt();
		
		for(int i = 0; i < banyak;i++) {
			System.out.print("Masukan Nilai Mahasiswa Ke-"+(i+1)+" =");
			int nilai = reader.nextInt();
			list.add(nilai);
		}
		
		System.out.println("");
		System.out.println("====Hasil Nilai Mahasiswa====");
		
		for(int i = 0; i < banyak;i++) {
			System.out.println("Nilai Mahasiswa ke-"+(i+1)+" = "+ list.get(i));
		}
		
		System.out.println("");
		System.out.println("Nilai Tertinggi adalah "+ findMax(list));
		System.out.println("Nilai Terendah adalah "+ findMin(list));
		System.out.println("");
		System.out.println("Nama Petugas : "+ petugas);
		
		reader.close();
	}
	public static Integer findMin(List<Integer> list){ 
	      
		List<Integer> sortedlist = new ArrayList<>(list); 
		Collections.sort(sortedlist); 
		return sortedlist.get(0); 
	} 

	public static Integer findMax(List<Integer> list){ 
		List<Integer> sortedlist = new ArrayList<>(list); 
		Collections.sort(sortedlist); 
		return sortedlist.get(sortedlist.size() - 1); 
	} 
	
	    

}

	  
