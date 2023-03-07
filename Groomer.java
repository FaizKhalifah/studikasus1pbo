public class Groomer extends Karyawan {
    String spesialis;

    public Groomer(){

    }

    public Groomer(String nama, String alamat, String noTelepon, String jenisKelamin, String kategoriKaryawan,
                   double pendapatan, String spesialis){
        super.nama=nama;
        super.alamat=alamat;
        super.noTelepon=noTelepon;
        super.jenisKelamin=jenisKelamin;
        super.kategoriKaryawan=kategoriKaryawan;
        super.pendapatan=pendapatan;
        this.spesialis=spesialis;
        System.out.println();
    }

    public void merawat(){
        System.out.println("Hewan pun dirawat");
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Spesialitas       : " + spesialis);
    }
}
