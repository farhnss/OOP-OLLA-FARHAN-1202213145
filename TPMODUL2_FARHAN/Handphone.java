public class Handphone extends Perangkat{
    protected boolean fingerprint;
    
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    @Override
    public void informasi(){
        if (fingerprint==true){
            String finger =("memiliki");
            System.out.println("Handphone ini memiliki drive tipe " + drive +" "+ "ram sebesar " +ram + " dan processor secepat " + processor + 
" Ghz. Handphone ini "+finger+ " fingerprint");
    }
        else if(fingerprint==false){
            String finger = ("tidak memiliki");
            System.out.println("Handphone ini memiliki drive tipe " + drive +" "+ "ram sebesar " +ram + " dan processor secepat " + processor + 
" Ghz. Handphone ini "+finger+ " fingerprint");}
}
        public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No "+no_hp);
    }
    public void sms(int no_hp){
        System.out.println("Handphone berhasil mengirim sms ke No "+no_hp);
    }
    public void sms(int no_hp, int no_hp2){
        System.out.println("Handphone berhasil mengirim telfon ke No "+no_hp + " dan ke No "+no_hp2);
    }    

}