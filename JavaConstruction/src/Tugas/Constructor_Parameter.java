
package Tugas;
public class Constructor_Parameter {
    long Nim ;
    String jurusan, Nama , Alamat ;
    int Angkatan; 
    public Constructor_Parameter (long NIM, String NAMA, String ALAMAT, String JURUSAN, int ANGKATAN ){
        Nim=NIM;
        Nama=NAMA;
        Alamat=ALAMAT;
        jurusan=JURUSAN;
        Angkatan=ANGKATAN;  
    }
    public static void main (String [] args) {
     Constructor_Parameter data=new Constructor_Parameter (201869040016L,"ACHMAD WILDAN SADAD HASAN","BANYUWANGI","T.INFORMATIKA",2018);
    System.out.print(
    "NIM : "+data.Nim+
    "NAMA :"+data.Nama+
    "ALAMAT :"+data.Alamat+ 
    "JURUSAN :"+data.jurusan+
    "ANGKATAN :"+data.Angkatan+"");
    }
}
