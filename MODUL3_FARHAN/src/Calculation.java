public class Calculation implements Runnable {
    private double radius;
    private double side;
    private double area;
    private double phi =3.14;


    public void setsquare(double side){
        this.side = side;
        if (side <=1);
        try{
            area = side * side;
        }
        catch
            (IllegalStateException a){a.printStackTrace();}
        
    }
    public void getsquare(){
        return;
    }
    public void setcircle(double radius){
        this.radius = radius;
        if (radius <=1);
        try{
            phi= 3.14*side*side;
        }
        catch (IllegalStateException a){a.printStackTrace();}
    }
    public void getcircle(){
        return;}
    public void settrapezoid(double a, double b, double tinggi){
        this.side = a;
        this.side = b;
        this.side = tinggi;
        if (side<=1){
            try{
                side = 0.5*(a+b)*tinggi;
            }
            catch (IllegalStateException x){x.printStackTrace();}
        }
    public void gettrapezoid(){
        return;
    }
    @Override
    public void run(){
        

    }
}