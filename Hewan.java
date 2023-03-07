public class Hewan {
    protected String namaHewan;
    protected String noPelanggan;
    protected String warnaHewan;
    protected String tahunKelahiran;
    protected String jenisHewan;
    protected int lastTreatment;

    public Hewan(){

    }

    public Hewan(String namaHewan, String noPelanggan, String warnaHewan, String tahunKelahiran,
                 String jenisHewan, int lastTreatment){
        this.namaHewan=namaHewan;
        this.noPelanggan=noPelanggan;
        this.warnaHewan=warnaHewan;
        this.tahunKelahiran=tahunKelahiran;
        this.jenisHewan=jenisHewan;
        this.lastTreatment=lastTreatment;
    }

    public void mandi (Hewan x){
        System.out.println(x.namaHewan + " Dimandikan oleh groomer");
    }


    public void cekKesehatan(){
        if(this.lastTreatment<5){
            System.out.println("Hewan masih dalam perawatan normal");
        }
        else if  (this.lastTreatment<10) {
            System.out.println("Hewan perlu perawatan lebih intensif");
        }
        else if (this.lastTreatment<20) {
            System.out.println("Hewan dalam kondisi kritis");
        }
        else {
            System.out.println("Hewan perlu segera ditolong");
        }
    }

    public void cetakInfo(){
        System.out.println("Nama hewan : " + this.namaHewan);
        System.out.println("Nomor pelanggan : " + this.noPelanggan);
        System.out.println("Warna : " + this.warnaHewan);
        System.out.println("Tahun lahir : " + this.tahunKelahiran);
        System.out.println("jenis hewan : " + this.jenisHewan);
        System.out.println("last treatmet " + this.lastTreatment + " hari yang lalu");
    }

    public void treatmentKhusus(){
        if(this.lastTreatment>=15){
            this.lastTreatment=this.lastTreatment-15;
        }
        else {
            System.out.println("Hewan belum bisa mendapatkan treatment khusus");
        }
    }

    public void treatmentBiasa(){
        if(this.lastTreatment>=10){
            this.lastTreatment=this.lastTreatment-10;
        }
        else {
            System.out.println("Belum disarankan untuk dirawat");
        }
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNoPelanggan(String noPelanggan) {
        this.noPelanggan = noPelanggan;
    }

    public String getNoPelanggan() {
        return noPelanggan;
    }

    public void setWarnaHewan(String warnaHewan) {
        this.warnaHewan = warnaHewan;
    }

    public String getWarnaHewan() {
        return warnaHewan;
    }

    public void setTahunKelahiran(String tahunKelahiran) {
        this.tahunKelahiran = tahunKelahiran;
    }

    public String getTahunKelahiran() {
        return tahunKelahiran;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setLastTreatment(int lastTreatment) {
        this.lastTreatment = lastTreatment;
    }

    public void kasihMakan(){
        System.out.println(this.namaHewan + "mendapatkan makanan");
    }
}
