public class Kelinci extends Hewan {
    private String jenisTelinga;

    public Kelinci(){

    }

    public Kelinci(String namaHewan, String noPelanggan, String warnaHewan, String tahunKelahiran,
                   String jenisHewan, int lastTreatment, String jenisTelinga){
        super.namaHewan = namaHewan;
        super.noPelanggan=noPelanggan;
        super.warnaHewan=warnaHewan;
        super.tahunKelahiran=tahunKelahiran;
        super.jenisHewan=jenisHewan;
        super.lastTreatment=lastTreatment;
        this.jenisTelinga=jenisTelinga;
    }

    public void setJenisTelinga(String jenisTelinga) {
        this.jenisTelinga = jenisTelinga;
    }

    public String getJenisTelinga() {
        return jenisTelinga;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jenis telinga : " + jenisTelinga);
        System.out.println();
    }

    public void latihLompat(){
        System.out.println("Skill melompat" + this.namaHewan +  "bertambah");
    }

}
