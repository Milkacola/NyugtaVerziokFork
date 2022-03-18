package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/
public class Nyugta3 {

    public static void main(String[] args) {
        csillagok();
        System.out.printf("%14s\n", "Nyugta 3");
        csillagok();
        
        final String HUF = "Ft";
        int[] tetelek = {350,90,1320};
        for (int i = 0; i < tetelek.length; i++) {
            System.out.printf("%8s %s: %5d %s\n", "Tétel", (i+1), tetelek[i], HUF);
        }

        duplaVonal();
        
        int osszesen = 0;
        for (int i = 0; i < tetelek.length; i++) {
            osszesen = tetelek[i] + osszesen;
        }
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        
        szaggatottVonal();
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        duplaVonal();
        
        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        szaggatottVonal();
        
        System.out.println("");
        System.out.print("_______");
        rovidVonalValaszto();
        rovidVonal();
        System.out.print(" Dátum");
        rovidVonalValaszto();
        System.out.println("   Név");
        
        csillagok();    
        System.out.println("        CÉG");
        csillagok();
    }
    
    private static void csillagok() {
        String csillagok = "********************";
        System.out.println(csillagok);
    }
    
    private static void duplaVonal() {
        String duplaVonal = "====================";
        System.out.println(duplaVonal);
    }
    
    private static void szaggatottVonal() {
        String szaggatottVonal = "--------------------";
        System.out.println(szaggatottVonal);
    }
    
    private static void rovidVonal() {
        String rovidVonal = "_______";
        System.out.println(rovidVonal);
    }
    
    private static void rovidVonalValaszto() {
        String rovidVonalValaszto = "      ";
        System.out.print(rovidVonalValaszto);
    }

}
