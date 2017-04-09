class Kampus1 {
public void Gedung(){
        System.out.println("Universitas");
}	
public static void main(String args[]) {
			Kampus2 AA;
			Kampus1 BB;
			AA = new Kampus2();
			BB = new Kampus1();
			
			AA.Gedung();
			BB.Gedung();
		}
}
//Overriding
class Kampus2 extends Kampus1 {
	
public void Gedung(){
	System.out.println("Universitas STTB" );
}	
}
