public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    @Override
    public void informasi() {
        if (webcam==true) {
            String ada = ("memiliki");
        System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" dan processor secepat "
        +processor+" Ghz. laptop ini "+ada+" webcam");}
        else if (webcam==false) {
            String ada = ("tidak memiliki");
        System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" dan processor secepat "
        +processor+" Ghz. laptop ini "+ada+" webcam");
        }
    }
    public void bukaGame(String nama_game){
        System.out.println("membuka game "+nama_game);
    }
    public void kirimEmail(String email){
        System.out.println("Mengirim Email ke "+email);
    }
    public void Email(String email, String email2){
        System.out.println("Mengirim Email ke "+email+" dan ke "+email2);
    }
    
}
