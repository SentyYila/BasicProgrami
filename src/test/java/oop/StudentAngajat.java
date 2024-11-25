package oop;

public class StudentAngajat extends Persoana implements StudentInterface, AngajatInterface{

    private String facultate;
    private boolean bursa;
    private String cursuri;

    private String companie;
    private String profesie;
    private int vechime;

    public StudentAngajat(String nume, String prenume, int varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void mergeLaLucru("Dupa cursuri merge la lucru") {

    }

    @Override
    public void munceste("El munceste doar 4 ore") {

    }

    @Override
    public void primesteSalariu("La fiecare 2 saptamani este platit") {

    }

    @Override
    public void isiDaDemisia("Cand face bani de petreceri isi da demisia") {

    }

    @Override
    public void mergeLaCursuri("Mai merge la cursuri de plictiseala") {

    }

    @Override
    public void sustineExamen("Sustine examene pentru care nu a invatat") {

    }

    @Override
    public void mergeLaPetreceri("Nu are timp din cauza examenelor") {

    }
}
