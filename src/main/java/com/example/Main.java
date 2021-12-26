package com.example;

import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;

public class Main {
    public static void main(String[] args) throws SparkPostException {
        String API_KEY = "e50b79fb81225792ae5b94d9b69fca2f2900b33a";
        Client client = new Client(API_KEY);

        client.sendMessage(
                "alexisgm.online", //el dominio lleva más de 48 horas en fase de registro y no se acaba de activar
                "alexisgm1993@gmail.com",
                "Bienvenido",
                "Bienvenido al sistema.",
                "<b>Bienvenido al sistema.</b>"
        );
    }
}
