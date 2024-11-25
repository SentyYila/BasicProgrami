package oop.abstractizare.claseAbstracte;

import org.testng.annotations.Test;

public class FormeGeometriceTest {

    @Test
    public void testFormeGeometrice() {
        Patrat = new Patrat();
        patrat.infoFormaGeometrica();
        patrat.deseneaza();

        Triunghi = new Triunghi();
        triunghi.infoFormaGeometrica();
        triunghi.deseneaza();

        //Clasa abstracta nu se poate instantia;
        //FormeGeometrice fg = new FormeGeometrice();
    }
}
