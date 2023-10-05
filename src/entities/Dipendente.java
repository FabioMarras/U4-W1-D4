package entities;

public class Dipendente {
    private double StipendioBase ;
    private String Matricola;
    private double Stipendio;
    private double Straordinario;
    //    private static LivelliGenerali.Livello LivelliGenerali;
//    private Dipartimento.Livello Dipartimento;
    private Livello LivelloOperaio;
    private Dipartimento DipartimentoOperaio;

    public enum Livello {
        OPERAIO,
        IMPIEGATO,
        QUADRO,
        DIRIGENTE
    }

    public enum Dipartimento {
        PRODUZIONE,
        AMMINISTRAZIONE,
        VENDITE,
    }

    public Dipendente(String Matricola, Dipartimento Dipartimento) {
        this.Matricola = Matricola;
        this.DipartimentoOperaio = Dipartimento;
        this.StipendioBase = 1000;
        this.Straordinario = 30;
        this.LivelloOperaio = Livello.OPERAIO;
        straord();
        stipend();
    }

    public Dipendente(String Matricola, double Straordinario, Livello Livello, Dipartimento Dipartimento) {
        this.Matricola = Matricola;
        this.StipendioBase = 1000;
        this.Stipendio = StipendioBase;
        this.Straordinario = Straordinario;
        this.LivelloOperaio = Livello;
        this.DipartimentoOperaio = Dipartimento;
        stipend();
        straord();
    }

//    public class LivelliGenerali {
//        public enum Livello {
//            OPERAIO,
//            IMPIEGATO,
//            QUADRO,
//            DIRIGENTE, Livello;
//        }}
//    public class Dipartimento {
//    public enum Livello {
//        PRODUZIONE,
//        AMMINISTRAZIONE,
//        VENDITE,
//    }}

    //    public Dipendente() {
//        this.StipendioBase = getStipendioBase();
//        this.Straordinario = getStraordinario();
//        this.LivelliGenerali = Dipendente.LivelliGenerali.Livello.OPERAIO;
//    }
//    public Dipendente(String Matricola, double Stipendio, double Straordinario, LivelliGenerali.Livello LivelliGenerali, String Dipartimento) {
//        this.Matricola = Matricola;
//        this.Stipendio = Stipendio;
//        this.Straordinario = Straordinario;
//        this.LivelliGenerali = LivelliGenerali;
//        this.Dipartimento = Dipartimento;
//    }
    public double getStipendioBase() {
        return StipendioBase;
    }

    public String getMatricola() {
        return Matricola;
    }

    public double getStipendio() {
        return Stipendio;
    }

    public double getStraordinario() {
        return Straordinario;
    }

    public Livello getLivelloOperaio() {
        return LivelloOperaio;
    }

//    public Dipendente.LivelliGenerali.Livello getLivelliGenerali() {
//        return LivelliGenerali;
//    }


    public void setLivelloOperaio(Livello livelloOperaio) {
        LivelloOperaio = livelloOperaio;
    }

    public void setStraordinario(double straordinario) {
        Straordinario = straordinario;
    }

    public void setDipartimento(String Dipartimento) {
        Dipartimento = Dipartimento;
    }

    public Dipartimento getDipartimentoOperaio() {
        return DipartimentoOperaio;
    }

    public void setDipartimentoOperaio(Dipartimento dipartimentoOperaio) {
        DipartimentoOperaio = dipartimentoOperaio;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "StipendioBase=" + StipendioBase +
                ", Matricola='" + Matricola + '\'' +
                ", Stipendio=" + Stipendio +
                ", Straordinario=" + Straordinario +
                ", LivelloOperaio='" + LivelloOperaio + '\'' +
                ", Dipartimento='" + DipartimentoOperaio + '\'' +
                '}';
    }

    public void promuovi() {
        switch (LivelloOperaio) {
            case OPERAIO:
                LivelloOperaio = Livello.IMPIEGATO;
//                this.StipendioBase += 200;
//                this.StipendioBase * (1.2);
                this.StipendioBase = this.StipendioBase * 1.2;
                straord();
                break;
            case IMPIEGATO:
                LivelloOperaio = Livello.QUADRO;
                this.StipendioBase = 1000 * 1.5;
                straord();
                break;
            case QUADRO:
                LivelloOperaio = Livello.DIRIGENTE;
                this.StipendioBase = 1000 * 2;
                straord();
                break;
            case DIRIGENTE:
                System.out.println("SEI GIà IL BOSS!!");
                break;
        }
    }

    public void straord() {
        this.Stipendio = this.Straordinario * 10 + this.StipendioBase;
    }

    public void stipend() {
        if (this.LivelloOperaio == Livello.OPERAIO) {
            this.StipendioBase = 1000;
        } else if
        (this.LivelloOperaio == Livello.IMPIEGATO) {
            this.StipendioBase = 1000 * 1.2;
        } else if
        (this.LivelloOperaio == Livello.QUADRO) {
            this.StipendioBase = 1000 * 1.5;
        }else if
        (this.LivelloOperaio == Livello.DIRIGENTE) {
            this.StipendioBase = 1000 * 2;
    }
}}
