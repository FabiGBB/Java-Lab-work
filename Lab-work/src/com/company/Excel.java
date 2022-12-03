package com.company;


public class Excel {


    public static Double[] ConvertToDouble(String tf1) {
        tf1 = tf1.trim();
        String[] Array = tf1.split(" ");
        Double[] DArray = new Double[Array.length];

        for (int i = 0; i < Array.length; i++) {
            try {DArray[i] = Double.parseDouble(Array[i]);}
            catch (Exception e) {System.out.println("'" + DArray[i] + "' is not a number !");}
        }
        return DArray;
    }


    public String Autosom(Double[] tf1) {
        double sum = 0;
        try {
            for (double value : tf1) sum += value;
            return String.valueOf(sum);
        } catch (Exception e){System.out.println("Erreur !"); return "Erreur";}
    }

    public String Average(Double[] tf1) {
        double sum=0;
        try {
            for (double value : tf1) sum += value;
            return String.valueOf(sum/ tf1.length);
        } catch (Exception e){System.out.println("Erreur !"); return "Erreur";}
    }

    public String  Max(Double[] tf1) {
        try {
            double max = tf1[0];
            for (double value : tf1) if (max < value) max = value;
            return String.valueOf(max);
        } catch (Exception e) {System.out.println("Erreur !"); return "Erreur";}
    }

    public String Min(Double[] tf1) {
        try {
            double min = tf1[0];
            for (double value : tf1) if (min > value) min = value;
            return String.valueOf(min);
        } catch (Exception e) {System.out.println("Erreur !"); return "Erreur";}
    }
}

