package obiectConstructor;

public class Angajat {
    public String nume;
    public int salariu;

    public Angajat(String nume, int salariu) {
        this.nume = verificaNume(nume);
        this.salariu = verificaSalariu(salariu);
    }

    //Facem o metoda pentru verificarea numelui:
    public String verificaNume(String nume){
        if (nume == null || nume.isEmpty()){
            return "Necunoscut";
        }
        return nume;
    }

    //Facem o metoda pentru verificarea salariului
    public int verificaSalariu(int salariu){
        if (salariu <= 0){
            return 1500;
        }
        return salariu;
    }

    public String getNume() {
        return nume;
    }

    public int getSalariu() {
        return salariu;
    }

    //TEMA: de terminat pt automation tot si la programare de cautat exemple in continuare

}
