public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Class Handphone");
        Handphone handphone = new Handphone("sandisk",16, (float) 2.30, true);
        handphone.informasi();
        handphone.telfon(623144455);
        handphone.sms(623511123);
        handphone.sms(623811123, 628231214);
        System.out.println("");

        System.out.println("Class Laptop");
        Laptop laptop = new Laptop("seagate",32, (float)2.40, false);
        laptop.informasi();
        laptop.bukaGame("Valorant");
        laptop.kirimEmail("farhan@gmail.com");
        laptop.Email("farhan12@gmail.com", "farhann@student.telkomuniversity.ac.id");
        
    }
        
    
}
