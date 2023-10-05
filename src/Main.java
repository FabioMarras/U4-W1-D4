import java.sql.SQLOutput;
import entities.Dipendente;

public class Main {
    public static void main(String[] args) {
Dipendente a1 = new Dipendente("111", Dipendente.Dipartimento.AMMINISTRAZIONE);
        System.out.println(a1);
        Dipendente a2 = new Dipendente("1234" , 5, Dipendente.Livello.OPERAIO, Dipendente.Dipartimento.PRODUZIONE);
        System.out.println(a2);
        a2.promuovi();
        a2.straord();
        System.out.println(a2);
        a2.promuovi();
        System.out.println(a2);
        a2.promuovi();
        System.out.println(a2);
        a2.promuovi();
        System.out.println(a2);
        a2.straord();
        System.out.println(a2);
    }
}