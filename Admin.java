public class Admin extends Karyawan{
    private String aplikasi;

    public Admin(){

    }

    public Admin(String nama, String alamat, String noTelepon, String jenisKelamin, String kategoriKaryawan,
                    double pendapatan, String aplikasi){
        super.nama=nama;
        super.alamat=alamat;
        super.noTelepon=noTelepon;
        super.jenisKelamin=jenisKelamin;
        super.kategoriKaryawan=kategoriKaryawan;
        super.pendapatan=pendapatan;
        this.aplikasi=aplikasi;
        System.out.println();
    }

    public void olahData(){
        System.out.println("Data pun diolah");
    }

    public void setAplikasi(String aplikasi) {
        this.aplikasi = aplikasi;
    }

    public String getAplikasi(){
        return this.aplikasi;
    }
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Aplikasi          : " + this.aplikasi);
    }
}
