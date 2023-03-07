public class Anjing extends Hewan {
    private String riwayatRabies;

    public Anjing(){

    }

    public Anjing(String namaHewan, String noPelanggan, String warnaHewan, String tahunKelahiran,
                  String jenisHewan, int lastTreatment, String riwayatRabies){
        super.namaHewan = namaHewan;
        super.noPelanggan=noPelanggan;
        super.warnaHewan=warnaHewan;
        super.tahunKelahiran=tahunKelahiran;
        super.jenisHewan=jenisHewan;
        super.lastTreatment=lastTreatment;
        this.riwayatRabies=riwayatRabies;
    }

    public void setRiwayatRabies(String riwayatRabies) {
        this.riwayatRabies = riwayatRabies;
    }

    public String getRiwayatRabies() {
        return riwayatRabies;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Riwayat rabies : " + riwayatRabies);
        System.out.println();
    }

    public void latihTangkap(){
        System.out.println("Skill tangkapnya meningkat");
    }

}
