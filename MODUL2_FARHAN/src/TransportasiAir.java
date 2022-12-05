public class TransportasiAir {
    protected int jumlahKursi, biaya;

    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    public void Informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah "
        +jumlahKursi+" ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis tidak diketahui sedang berlabuh");

    }
    
}
