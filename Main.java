public class Main {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Faiz","Bekasi Utara","0909090","laki-laki","admin",80);
        karyawan1.cetakInfo();
        System.out.println();
       Karyawan admin1 = new Admin("Faiz","Bekasi Utara","0909090","laki-laki","admin",80,"excel");
       admin1.cetakInfo();
       Karyawan dokterHewan1 = new DokterHewan("Yasin","Duren Sawit","0909111","laki-laki","dokter hewan",100,"10tahun");
       dokterHewan1.cetakInfo();

       Karyawan groomer1 = new Groomer("Zufar","Ponorogo","1209090","laki-laki","groomer",80,"kucing");
        groomer1.cetakInfo();

        Hewan hewan1 = new Hewan("Rambo", "43535345", "merah hitam", "2019", "ayam", 9);
        hewan1.cetakInfo();
        System.out.println();
        Hewan hewan2 = new Anjing("null name", "44535345", "cokelat", "2020", "Anjing", 19,"Belum pernah");
        hewan2.cetakInfo();
        hewan1.mandi(hewan2);
        Hewan hewan3 = new Kucing("Linggau", "43538785", "hitam", "2021", "kucing", 6,"ceria");
        hewan3.cetakInfo();
        hewan1.mandi(hewan3);
        Hewan hewan4 = new Kelinci("Bodas", "13535345", "putih", "2019", "kelinci", 3,"Panjang");
        hewan4.cetakInfo();

    }
}