package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        com.company.Kandydet kandydet1 = new com.company.Kandydet("Bartosz",25, com.company.wykształcony.LICENCJAT,10);
        com.company.Kandydet kandydet2 = new com.company.Kandydet("Arkadiusz",24, com.company.wykształcony.MISTRZOWIE,10);
        com.company.Kandydet kandydet3 = new com.company.Kandydet("Krzysztof",21, com.company.wykształcony.LICENCJAT,10);
        com.company.Kandydet kandydet4 = new com.company.Kandydet("Adrian",27, com.company.wykształcony.MISTRZOWIE,10);
        com.company.Kandydet kandydet5 = new com.company.Kandydet("Bogdan",24, com.company.wykształcony.LICENCJAT,1);
        com.company.Kandydet kandydet6 = new com.company.Kandydet("Milosz",27, com.company.wykształcony.LICENCJAT,8);
        ArrayList<com.company.Kandydet> grupa = new ArrayList<com.company.Kandydet>();
        grupa.add(kandydet1);
        grupa.add(kandydet2);
        grupa.add(kandydet3);
        grupa.add(kandydet4);
        grupa.add(kandydet5);
        grupa.add(kandydet6);

        grupa.forEach(kandydet -> System.out.println(kandydet.toString()));
        System.out.println(qualified(kandydet1));
        System.out.println(qualified(kandydet5));
        System.out.println(recruitmentMap(grupa));

    }
    public static boolean qualified(Kandydet k){
        Rekrutacja.setDoswiadczenieEquals2();
        if(k.getLatadoswiadczenia()>=Rekrutacja.doswiadczenie){
            return true;
        }
        return false;
    }
    public static Map<Integer, String> recruitmentMap(ArrayList<Kandydet> kandydets){
        Map<Integer,String> mapa = new HashMap<>(){
        };
        kandydets.forEach(kandydet -> {
                    if(qualified(kandydet)==true){
                        mapa.put(kandydet.getLatadoswiadczenia(), kandydet.getNazwa());
                    }
                }
        );
        return mapa;
    }
}