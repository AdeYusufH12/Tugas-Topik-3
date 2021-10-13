import java.util.ArrayList;

public class Jurusan<m> {
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> mhs;

    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.mhs = new ArrayList<>();
    }

    public void addMhs(Mahasiswa m){
        mhs.add(m);
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public void Display(){
        for (Mahasiswa m : mhs){
            System.out.println(m.getNim() + " " + m.getNama());
        }
    }
}