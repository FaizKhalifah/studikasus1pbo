public class Kucing extends Hewan{
    private String kepribadianKucing;

    public Kucing(){

    }

    public Kucing(String namaHewan, String noPelanggan, String warnaHewan, String tahunKelahiran,
                  String jenisHewan, int lastTreatment, String kepribadianKucing){
        super.namaHewan = namaHewan;
        super.noPelanggan=noPelanggan;
        super.warnaHewan=warnaHewan;
        super.tahunKelahiran=tahunKelahiran;
        super.jenisHewan=jenisHewan;
        super.lastTreatment=lastTreatment;
        this.kepribadianKucing=kepribadianKucing;
    }

    public void setKepribadianKucing(String kepribadianKucing) {
        this.kepribadianKucing = kepribadianKucing;
    }

    public String getKepribadianKucing() {
        return kepribadianKucing;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Kepribadian kucing : " + kepribadianKucing);
        System.out.println();
    }

    public void bermain(){
        System.out.println(this.namaHewan + "merasa senang");
    }
}
