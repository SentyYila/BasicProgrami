package test. variabileSiMetode;
import org.testng.annotations. Test;

public class    Persoana {

    // o clasa in java este o structura care defineste atat atributele/variabilele cat si metodele unui obiect
    // tipuri de data in java:
    //I. primitive- stocheaza direct valorile in variabila
    //1. int- numere intregi 32biti
    //2. double-numere zecimale
    //3. char- caractere individuale
    //4. boolean- valori true sau false
    //5. byte -numere intregi 8 biti
    //6. short- numere intregi 16 biti
    //7. long- numere intregi 64 biti
    //8. float- numere zecimale dar precizia este mai mica decat la double
    //II. tipuri de referinta:-stocheaza doar referinta catre un obiect
    //1. string(sir)- sir de caractere
    //2. Integer- o clasa care invaluieste/wrapper

    //Variabile globale
    String nume = "Popescu";  // variabila globala de tip string
    String prenume = "Ion";   // variabila globala de tip string
    char sexul = 'M';         // variabila globala de tip char
    int anulNasterii = 2004;  //variabila globala de tip int

    @Test
    public void afisarePersoana() {
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Anul nasterii persoanei este: " + anulNasterii + " Sexul este: " + sexul);
    }


    @Test
    public void afisareDetaliiPersoana() {
        double inaltime = 1.80;
        int greutate = 80;
        System.out.println("Persoana are inaltimea de: " + inaltime);
        System.out.println("Greutatea Persoanei este de: " + greutate);
        System.out.println("Numele persoanei este: " + nume + " Persoana are inaltimea de: " + inaltime);

    }

    //o metoda este un bloc de cod care indeplineste o functie specifica
    //metodele sunt de 2 tipuri: void sau return
    //void inseamna ca nu returneaza nimic
    //return returneaza un tip de date: int, string sau boolean;
    //in loc de public void va fii public int sau public string iar la sfarsit inainte de ultima acolada,
    //trebuie sa fie un return, iar acestea trebuie sa returneze aceeasi valoare declarata initial: string sau int,


    public int calculVarsta() {
        return 2024 - anulNasterii;
    }

    public boolean esteAdult(int varsta) {
        return varsta > 18;
    }

    @Test
    public void afisareDatePersoana() {
        int varstaReala = calculVarsta();
        System.out.println("varsta calculata a persoanei este de:" + calculVarsta() + " ani");
        System.out.println("persoana este adult? " + esteAdult(varstaReala));
    }
}
