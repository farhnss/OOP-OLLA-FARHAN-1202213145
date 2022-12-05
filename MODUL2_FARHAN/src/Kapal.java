public class Kapal extends TransportasiAir {
    protected String mesin;
    public Kapal(int jumlahKursi,int biaya, String mesin) {
        super(jumlahKursi,biaya);
        this.mesin = mesin;
    }
    @Override
    public void Informasi(){
        System.out.println("Transportasi Air jenis kapal dengan kursi berjumlah "
        +jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan mesin "
        +mesin+ "dengan kecepatan yang tidak stabil");
    }
    public void berlayar(int kecepatan) {
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan mesin "
        +mesin+ "dengan kecepatan di kisaran" +kecepatan+" knot");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis kapal sedang berlabuh di pantai");
    }
    
}

