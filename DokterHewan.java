public class DokterHewan extends Karyawan {
    String pengalamanBekerja;
    public DokterHewan(){

    }

    public DokterHewan(String nama, String alamat, String noTelepon, String jenisKelamin, String kategoriKaryawan,
                       double pendapatan, String pengalamanBekerja){
        super.nama=nama;
        super.alamat=alamat;
        super.noTelepon=noTelepon;
        super.jenisKelamin=jenisKelamin;
        super.kategoriKaryawan=kategoriKaryawan;
        super.pendapatan=pendapatan;
        this.pengalamanBekerja=pengalamanBekerja;
        System.out.println();
    }

    public void operasi(){
        System.out.println("Hewan sedang dioperasi");
    }

    public void setPengalamanBekerja(String pengalamanBekerja) {
        this.pengalamanBekerja = pengalamanBekerja;
    }

    public String getPengalamanBekerja() {
        return pengalamanBekerja;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Pengalaman bekerja : " + pengalamanBekerja);
    }
}
