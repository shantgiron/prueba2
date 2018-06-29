package edu.pucmm;

import static spark.Spark.get;
import static spark.Spark.port;

public class Main {
    public static void main(String[] args) {
        port(4568);
        get("/", (req, rep) -> "Estamos en el otro dominio");
        get("/otro", (req, rep) -> "Si, este es otro dominio");
    }
}
