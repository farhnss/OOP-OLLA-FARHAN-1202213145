public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar ){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    @Override
    public void Informasi(){
        System.out.println("Transportasi Air jenis sampan dengan kursi berjumlah "
        +jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);

    }
    @Override
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis sampan sedang berlayar menggunakan "+layar+
        "layar");

    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis sampan sedang berlabuh di pantai");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air dengan jenis sampan sedang berlabuh di pantai menggunakan "+jangkar+
        " jangkar");
    }
    
}
