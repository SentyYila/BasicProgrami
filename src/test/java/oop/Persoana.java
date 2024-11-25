package oop;

public class Persoana {

    //OOP = programare orientata obiect (Object oriented programing)
    //4 principii importante: mostenire, incapsulare, polimorfism, abstractizare
    //mostenire este conceptul in Java prin care o clasa (clasa copil) mosteneste o alta clasa (clasa parinte)
    // in java se poate mosteni o singura clasa
    // in momentul in care o clasa mosteneste o alta clasa, clasa copil va trebui sa apeleze la constructorul unui parinte
    // in momentul in care se aplica mostenirea, clasa copil, are vizibilitate, asupra varabilelor si metodelor din clasa parinte
    // constructorul din clasa parinte spre copil, se apeleaza cu "super"
    //in Java ca sa extinzi o alta clasa se foloseste cuvantul "extend"

    //incapsulare
    //procesul prin care tinem private anumite informatii in asa fel incat ca ele sa nu poata fii modificate.
    //facem variabile/metode din public in private
    //private = acces control care restrictioneaza accesul doar in clasa respectiva. Inseamna ca le putem restrictiona accesul
    // acccesa doar in acea clasa
    //ca sa putem extrage sau modifica o valoare a unei vaiabile private ne folosim de metode get si set
    // get returneaza valoarea
    //set poate schimba valoarea
    //Polimorfism dinamic = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite;
    //Daca vrem sa chemam un copil prin metoda din parinte trebuie sa folosim SUPER;
    //Polimorfism static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea tipului sau numarului de parametri;
    // Abstractizarea presupune expunerea doar a aspectelor esentiale ale unui obiect, ascunzand detaliile implementarii;
    //Acest lucru se realizeaza prin folosirea claselor abstracte sau a interfetelor;
    //Se reduce complet implementarea ramamand doar numeel metodelor, parametri sau tipul returnat;
    // Clasele abstracte = ele sunt utilizate pentru a declara caracteristicile comune ale unor subclase;
    //O clasa abstracta poate fi utilzata doar ca super clasa pt alte clase care extind clasa abstracta;
    //O clasa abstracta poate avea metode abstracte (fara implementare) si metode concrete (cu implementare)
    //Declaratie unei clase abstracte se face folosind cuvantul cheie "abstract";
    //O clasa abstracta nu poate fi instantiata;
    //Interfetele = este un protocol pe care clasele trebuie sa il implementeze, ofera raspuns lipsei mostenirii multiple;
    //Intr-o interfata avem o colectie de metode abstractie si constante;
    //Interfata contine doar metode abstracte;


    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este: " +nume);
        System.out.println("Prenumele persoanei este: " +prenume);
        System.out.println("Varsta persoanei este: " +varsta);
    }
   //Polimorfism dinamic EXEMPLU = prima implementare a metodei;
    public void mananca(){
        System.out.println("Persoana mananca cand ii este foame");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
