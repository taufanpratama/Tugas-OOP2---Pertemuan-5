public class Kampus { 

String lantai;
String tangga;
String kelas;
String lampu;

public void set(String lantai, String tangga, String kelas, String lampu) {
        this.lantai = lantai;
        this.tangga = tangga;
        this.kelas = kelas;
        this.lampu = lampu;
    }

public void tampil() {
        System.out.println("kampus terdiri dari " + " \n");
        System.out.println("lantai   " );
        System.out.println("tangga   " );
        System.out.println("kelas 	 " );
        System.out.println("lampu  	 " );
    }


}