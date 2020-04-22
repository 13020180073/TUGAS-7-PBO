/* 	Viranti Ramadina
	130 2018 0073
*/

//nomor 4
//Program penerapan interface
public class PabrikBaru{
 public static void main (String[] args) {
test();
 }
 static void test(){
 PabrikSepatu SupplierSepatu;
 SupplierSepatu = new PabrikSepatu("Adidas","Jalan Merdeka 123");
 System.out.println("Informasi Perusahaan : "+"\n"+SupplierSepatu);
}
}