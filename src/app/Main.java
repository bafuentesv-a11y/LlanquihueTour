package app;

import model.Direccion;
import model.GuiaTuristico;

public class Main {

    public static void main(String[] args) {

        Direccion d1 = new Direccion(
                "Av. Costanera", 120,
                "Puerto Varas");

        Direccion d2 = new Direccion(
                "Calle Lago Llanquihue", 45,
                "Frutillar");

        Direccion d3 = new Direccion(
                "Ruta 5 Sur", 1000,
                "Puerto Montt");

        GuiaTuristico g1 = new GuiaTuristico(
                "11.121.142-1",
                "Juan Pérez",
                d1,
                "Inglés",
                5);

        GuiaTuristico g2 = new GuiaTuristico(
                "22.256.452-2",
                "María Soto",
                d2,
                "Portugués",
                8);

        GuiaTuristico g3 = new GuiaTuristico(
                "13.563.983-3",
                "Carlos Díaz",
                d3,
                "Francés",
                10);

        System.out.println("=== GUÍA 1 ===");
        System.out.println(g1);

        System.out.println("\n=== GUÍA 2 ===");
        System.out.println(g2);

        System.out.println("\n=== GUÍA 3 ===");
        System.out.println(g3);
    }
}