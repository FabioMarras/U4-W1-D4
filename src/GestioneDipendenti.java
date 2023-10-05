import entities.Dipendente;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente("1234" , 5, Dipendente.Livello.OPERAIO, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente("1234" , 5, Dipendente.Livello.OPERAIO, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente dipendente3 = new Dipendente("1234" , 5, Dipendente.Livello.IMPIEGATO, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente4 = new Dipendente("1234" , 5, Dipendente.Livello.DIRIGENTE, Dipendente.Dipartimento.VENDITE);
        System.out.println(dipendente1);
        dipendente1.promuovi();
        System.out.println(dipendente1);
        System.out.println(dipendente2);
        System.out.println(dipendente3);
        System.out.println(dipendente4);
        System.out.println(dipendente1.getStipendio() + dipendente2.getStipendio() + dipendente3.getStipendio() + dipendente4.getStipendio());
    }

}
