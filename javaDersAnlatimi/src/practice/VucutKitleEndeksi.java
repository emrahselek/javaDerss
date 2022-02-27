package practice;

public class VucutKitleEndeksi {
    //vocut kitle endexi : kilo / ( boyun karesi )
    // boy metre cinsinden girilmelidiir.

    public static void main(String[] args) {

        float kilo = 60.0f;
        float boy = 1.70f;

        float vke = kilo / (boy * boy);
        System.out.println(vke);

    }
}
