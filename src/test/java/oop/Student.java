package oop;

public class Student extends Persoana implements StudentInterface {

    private String facultate;
    private boolean bursa;
    private String cursuri;



    public Student(String nume, String prenume, int varsta, String facultate, boolean bursa, String cursuri) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.bursa = bursa;
        this.cursuri = cursuri;
    }

    public void infoStudent(){

        System.out.println("Persoana: " +getNume() + " este student la Facultatea: " +facultate);
        System.out.println("Persoana: " +getPrenume() + " ia/nu ia " +bursa);
        System.out.println("Persoana: " +getNume()+ " are cursuri de: " +cursuri);

    }

    public void  mananca(){
        System.out.println("Studentul nu prea mananca");
    }

    public boolean isBursa() {
        return bursa;
    }

    public String getCursuri() {
        return cursuri;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setBursa(boolean bursa) {
        this.bursa = bursa;
    }

    public void setCursuri(String cursuri) {
        this.cursuri = cursuri;
    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("Studentul merge la cursuri daca vrea");

    }

    @Override
    public void sustineExamen() {
        System.out.println("Studentul sigur pica examenele");

    }

    @Override
    public void mergeLaPetreceri() {
        System.out.println("Studentul nu refuza nicio petrecere");

    }
}
