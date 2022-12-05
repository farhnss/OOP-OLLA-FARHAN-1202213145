public class Main {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasiAir= new TransportasiAir(40, 30000);
        transportasiAir.Informasi();
        transportasiAir.berlayar();
        transportasiAir.berlabuh();
        System.out.println("");
        Sampan sampan = new Sampan(35, 50000, 4);
        sampan.Informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);
        System.out.println("");
        Kapal kapal = new Kapal(70, 80000, "turbo ");
        kapal.Informasi();
        kapal.berlayar();
        kapal.berlayar(200);
        kapal.berlabuh();
        
    }


}
