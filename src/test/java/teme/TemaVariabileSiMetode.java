package teme;
import org.testng.annotations. Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TemaVariabileSiMetode {

    //Casa: detalii: nr camere, nume camere etc
    //min 3 variabile globale
    //min 3 variabile locale in oricare metoda
    //2 metode cu void- o metoda cu parametru
    //- o metoda fara parametru
    //2 metode cu return- o metoda cu parametru
    //- o metoda fara parametru
    //o metoda de test unde sa afisam sout toate variabilele si metodele pe care le-am lucrat

    //variabile globale
    String denumireUnu = "Dormitor";      //variabila globala de tip string
    String denumireDoi = "Sufragerie";    //variabila globala de tip string
    String denumireTrei = "Bucatarie";     // variabila globala de tip string
    int anulConstructiei = 2010;

    @Test
    public void afisareCamere() {
        System.out.println("Denumirea camerei este: " + denumireUnu);
        System.out.println("Denumirea camerei este: " + denumireDoi);
        System.out.println("Denumirea incaperii este: " + denumireTrei);
        System.out.println("Anul constructiei casei este: " + anulConstructiei);
    }

    //variabile locale

    @Test
    public void afisaDetaliiCamere() {
        double dormitor = 14.25;       //variabila locala de tip double
        double sufragerie = 21.00;     //variabila locala de tip double
        int numarCamere = 2;           // variabila locala de tip int
        System.out.println("Dimensiunea dormitorului este: " + dormitor);
        System.out.println("Dimensiunea sufrageriei este: " + sufragerie);
        System.out.println("Numarul de camere este: " + numarCamere);
    }

        public int calculVechime() {
        return 2024 - anulConstructiei;
    }

    public boolean esteNoua(int vechime) {
        return vechime>12;
    }

    @Test
    public void afisareDateCasa() {
        int vechimeaReala=calculVechime();
        System.out.println("Vechimea calculata a casei este de: "+calculVechime ()+" ani");
        System.out.println("Casa este noua? "+esteNoua(vechimeaReala));

    }


    //Tema de facut ce am facut miercuri dar cu masini din tari diferite
    // de tip Hashman2 si String
    //4 perechi in Hashman
    // dintr-o lista de stringuri cautati un string dorit
    //trebuie facuta o lista de string
    //variabila de string
    //parcurgeti lista cu un for sau while
    //cand ajungeti la cuvantul dorit il introducem in consola si folosim if
    //optional: de scris liste, multimi

    //EXEMPLE LEGATE DE INTERFACE SI ABSTRACTIZARE+ CONFIRMARE


     public void exercitiuHashmap(){
        HashMap<String, List<String>> tariSiMasini = new HashMap<>();
         List<String> masiniGermania = new ArrayList<>();
         masiniGermania.add("BMW");
         masiniGermania.add("Mercedes-Benz");
         masiniGermania.add("Volkswagen");
         masiniGermania.add("Audi");

         List<String> masiniFranta = new ArrayList<>();
         masiniFranta.add("Renault");
         masiniFranta.add("Peugeot");
         masiniFranta.add("Bugatti");
         masiniFranta.add("Citroen");

         List<String> masiniJaponia = new ArrayList<>();
         masiniJaponia.add("Toyota");
         masiniJaponia.add("Honda");
         masiniJaponia.add("Nissan");
         masiniJaponia.add("Subaru");

         List<String> masiniItalia = new ArrayList<>();
         masiniItalia.add("Ferrari");
         masiniItalia.add("Lamborghini");
         masiniItalia.add("Maserati");
         masiniItalia.add("Alfa Romeo");
         for (String key : tariSiMasini.keySet()) {
             System.out.println("Masinile din tara " + key + " sunt " + tariSiMasini.get(key));
         }


     }

     public void fructeProaspeteListaArray(){
        String[] fructe = new String[9];
         fructe[0] = "pere";
         fructe[1] = "banane";
         fructe[2] = "avocado";
         fructe[3] = "mere";
         fructe[4] = "portocale";
         fructe[5] = "cirese";
         fructe[6] = "struguri";
         fructe[7] = "kiwi";
         fructe[8] = "visine";
         for (int index = 0; index < fructe.length; index++){
             System.out.println("Denumirea fructelor de la numarul: " +index + " este: " +fructe[index]);
         }

     }


     public void fructeProaspeteLista(){
     List<String> fructeLista = new ArrayList<>();
     fructeLista.add("pere");
     fructeLista.add("banane");
     fructeLista.add("avocado");
     fructeLista.add("mere");
     fructeLista.add("portocale");
     fructeLista.add("cirese");
     fructeLista.add("struguri");
     fructeLista.add("kiwi");
     fructeLista.add("visine");

     int index = 0;
     while (index < fructeLista.size()){
         System.out.println("Denumirea fructelor este: " + fructeLista.get(index));
         index++;
     }

  }

    @Test
    public void afisareInformatii() {
        exercitiuHashmap();
//        fructeProaspeteListaArray();
//        fructeProaspeteLista();
    }


}











    

