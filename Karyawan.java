public class Karyawan {
    protected String nama;
    protected String alamat;
    protected String noTelepon;
    protected String jenisKelamin;
    protected String kategoriKaryawan;
    protected double pendapatan;

    public Karyawan(){

    }

    public Karyawan(String nama, String alamat, String noTelepon, String jenisKelamin,String kategoriKaryawan, double pendapatan){
        this.nama =nama;
        this.alamat=alamat;
        this.noTelepon=noTelepon;
        this.jenisKelamin=jenisKelamin;
        this.kategoriKaryawan=kategoriKaryawan;
        this.pendapatan=pendapatan;
    }

    public void cetakInfo(){
        System.out.println("Nama              : " + this.nama);
        System.out.println("alamat            : " + this.alamat);
        System.out.println("No telepon        : " + this.noTelepon);
        System.out.println("Jenis kelamin     : " + this.jenisKelamin);
        System.out.println("Kategori karyawan : " + this.kategoriKaryawan);
        System.out.println("Pendapatan        : " + pendapatan + "Dollar");
    }

    public void naikGaji(){
        this.pendapatan += 10;
    }

    public void resign(){
        this.nama=null;
        this.alamat=null;
        this.noTelepon=null;
        this.jenisKelamin=null;
        this.kategoriKaryawan=null;
        this.pendapatan=0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getKategoriKaryawan() {
        return kategoriKaryawan;
    }

    public void setKategoriKaryawan(String kategoriKaryawan) {
        this.kategoriKaryawan = kategoriKaryawan;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
}
