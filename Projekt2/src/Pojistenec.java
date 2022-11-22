import java.time.LocalDate;

public class Pojistenec {
    private LocalDate datumCas;
    private String jmeno;
    private String prijmeni;
    private int vek;
    private long telCislo;


    //konstruktor
    public Pojistenec(LocalDate datumCas, String jmeno, String prijmeni, int vek, long telCislo) {
        this.datumCas = datumCas;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telCislo = telCislo;
    }

    //gettery a settery


    public LocalDate getDatumCas() {
        return datumCas;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {return prijmeni;}

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public long getTelCislo() {
        return telCislo;
    }

    public void setTelCislo(long telCislo) {
        this.telCislo = telCislo;
    }

    @Override
    public String toString(){
        return "Pojištěnec: "+jmeno+ " ," + prijmeni+ " ," + vek +" ," + telCislo+ " byl vytvořený dne "+datumCas;
    }
}

