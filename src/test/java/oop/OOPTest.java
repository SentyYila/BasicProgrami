package oop;

import org.testng.annotations.Test;

public class OOPTest {
    @Test
    public void testMethod() {

        Student Laura = new Student("Popescu", "Laura", 20, "Psihologie", true, "Filosofie");
        Laura.mergeLaCursuri();
        Laura.mananca();


        Angajat Eduard = new Angajat("Ionescu", "Eduard", 22, "Arka", "inginer", 1);
//        Eduard.infoAngajat();
//        Eduard.mananca();
          Eduard.primesteSalariu();

//        Eduard.programLucru();
//        Eduard.programLucru(6);
//        Eduard.programLucru("remote");
//        Eduard.programLucru(false);
        StudentAngajat Marius = new StudentAngajat("Popescu", "Marius", 20, "Facultatea vietii", false, "Contabilitate", "KFC", 1)
        Marius.mergeLaPetreceri();
        Marius.primesteSalariu();
    }
}
