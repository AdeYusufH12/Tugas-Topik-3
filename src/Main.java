public class Main {

    public static void main(String[] args) {
	    //Objek Jurusan
        Jurusan jurusan1 = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan jurusan2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

        //Objek Mhasiswa
        Mahasiswa m1 = new Mahasiswa("6701", "Rendi");
        Mahasiswa m2 = new Mahasiswa("6702", "Chaca");
        Mahasiswa m3 = new Mahasiswa("6703", "Agus");

        Mahasiswa m4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa m5 = new Mahasiswa("6302", "Siska");
        Mahasiswa m6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa m7 = new Mahasiswa("6304", "Rahmat");

        //Hubungkan Mahasiswa dengan jurusan
        jurusan1.addMhs(m1);
        jurusan1.addMhs(m2);
        jurusan1.addMhs(m3);

        jurusan2.addMhs(m4);
        jurusan2.addMhs(m5);
        jurusan2.addMhs(m6);
        jurusan2.addMhs(m7);

        //menampilkan jurusan D3RPLA beserta nama mahasiswa
        System.out.println("Kode : " +jurusan1.getKode());
        System.out.println("Nama : " +jurusan1.getNama());
        System.out.println("Daftar Mahasiswa : ");
        jurusan1.Display();

        System.out.println();

        //menampilkan jurusan D3SI beserta nama mahasiswa
        System.out.println("Kode : " +jurusan2.getKode());
        System.out.println("Nama : " +jurusan2.getNama());
        System.out.println("Daftar Mahasiswa : ");
        jurusan2.Display();
    }
}
