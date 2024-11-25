package obiectConstructor;

import javax.sound.midi.Soundbank;

public class Avion {

 // Constructorul are rolul de a initializa variabilele unei clase
 //Recunoastem un constructor dupa numele clasei- este o metoda speciala care nu are void sau return
 //Intr-o clasa putem sa avem unul sau mai multi constructori care se diferentiaza dupa numarul sau tipul de parametri
 // Intr-o clasa exista tot timpul un constructor default (fara parametri)
 //Constructorii sunt cu parametri sau fara parametri si constructorul trebuie sa fie intotdeauna public

 //Un obiect in java este o instanta a unei clase
 //Ca sa initializam un obiect folosim cuvantul "new"
 //Cand se initializeaza un obiect se apeleaza constructorul clasei

 public String tip;
 public String marca;
 public int capacitatePasageri;
 public int anFabricatie;
 public Integer capacitateBagaje;
 public String modelAvion;

 public Avion(String tip, String marca, int capacitatePasageri, int anFabricatie, Integer capacitateBagaje, String modelAvion){
 this.tip = tip;
 this.marca = marca;
 this. capacitatePasageri = capacitatePasageri;
 this.capacitateBagaje = capacitateBagaje;
 this.anFabricatie = anFabricatie;
 this.modelAvion = modelAvion;
 }

 public void prezentareAvion(){
     System.out.println("Tipul avionului este: " +tip);
     System.out.println("Marca avionului este: " +marca);
     System.out.println("Capacitatea maxima de pasageri este: " +capacitatePasageri);
     System.out.println("Anul fabricatie este: " +anFabricatie);
     System.out.println("Modelul de avion este: " +modelAvion);
     if (capacitateBagaje != null){
         System.out.println("Capacitatea maxima pentru bagaje este: " +capacitateBagaje);
     }else {
         System.out.println("Avionul nu are bagaje");
     }
 }

    public Avion(String tip, String marca, int capacitatePasageri, int anFabricatie, String modelAvion){
        this.tip = tip;
        this.marca = marca;
        this. capacitatePasageri = capacitatePasageri;
        this.anFabricatie = anFabricatie;
        this.modelAvion = modelAvion;

    }
}
