package Day01;

public class _40_AccessModifiers {

    /*
    -private
    Sadece ayni classta kullanilabilir. Baska bir classtan erisim izni vermez.
    -default

    -protected
    -public

    Degisken yada methodlara nerden erisilebilir nereden erisilemez bunu belirten belirteclerdir
    Degislem yada methodlara nereden erisilebilir nereden erisilemez bunu belirten belirteclerdir.


     */
    public static void main(String[] args) {

        Araba14 nesne = new Araba14();
       // System.out.println(nesne.hiz);
        


    }

}

class Araba14{

    private int hiz = 200;
}
