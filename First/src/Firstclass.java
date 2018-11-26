public class Firstclass{
	
	public static void main(String[] args){
		
		String s = "benim adim halil gunduz";
		s = s.toUpperCase();
		int ilkBosluk = s.indexOf(" ");
		String ilkKelime = s.substring(ilkBosluk);
		
		System.out.println(" dizgi : " + s + " ilkBosluk: " + ilkBosluk + ilkKelime);
		
		
	}
}
