package com.company;

import java.util.ArrayList;

public class Kandydet implements Cloneable, Comparable<Kandydet>{

    private String nazwa;
    private int wiek;
    private wykształcony wykształcony;
    private int latadoswiadczenia;

    public Kandydet(String nazwa, int wiek, com.company.wykształcony wykształcony, int latadoswiadczenia) {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wykształcony = wykształcony;
        this.latadoswiadczenia = latadoswiadczenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public com.company.wykształcony getWykształcony() {
        return wykształcony;
    }

    public int getLatadoswiadczenia() {
        return latadoswiadczenia;
    }

    @Override
    public String toString(){
        return "Nazwa " + nazwa +" Wiek " + wiek +" Wyksztalcony "
                + wykształcony + " Lat doswiadczenia "+ latadoswiadczenia;
    }

    @Override
    public int compareTo(Kandydet o) {
        return 0;
    }
}
package com.company;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Kandydet kandydet1 = new Kandydet("Bartosz",25,wykształcony.LICENCJAT,10);
        Kandydet kandydet2 = new Kandydet("Arkadiusz",24,wykształcony.MISTRZOWIE,10);
        Kandydet kandydet3 = new Kandydet("Krzysztof",21,wykształcony.LICENCJAT,10);
        Kandydet kandydet4 = new Kandydet("Adrian",27,wykształcony.MISTRZOWIE,10);
        Kandydet kandydet5 = new Kandydet("Bogdan",24,wykształcony.LICENCJAT,1);
        Kandydet kandydet6 = new Kandydet("Milosz",27,wykształcony.LICENCJAT,8);
        ArrayList<Kandydet> grupa = new ArrayList<Kandydet>();
        grupa.add(kandydet1);
        grupa.add(kandydet2);
        grupa.add(kandydet3);
        grupa.add(kandydet4);
        grupa.add(kandydet5);
        grupa.add(kandydet6);

        grupa.forEach(kandydet -> System.out.println(kandydet.toString()));
        System.out.println(qualified(kandydet1));
        System.out.println(qualified(kandydet5));

    }
    public static boolean qualified(Kandydet k){
        Rekrutacja.setDoswiadczenieEquals2();
        if(k.getLatadoswiadczenia()>=Rekrutacja.doswiadczenie){
            return true;
        }
        return false;
    }
}

package com.company;

public enum wykształcony {
    LICENCJAT,
    MISTRZOWIE
}

package com.company;

        import java.util.ArrayList;

public class Rekrutacja {
    static int doswiadczenie;
    private ArrayList<Kandydet> kandydets;

    public static void setDoswiadczenieEquals2() {
        Rekrutacja.doswiadczenie = 2;
    }
}