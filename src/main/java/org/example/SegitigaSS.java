package org.example;

import java.util.Arrays;

public class SegitigaSS {
    public static String deteksiSegitigaSikuSiku(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Segitiga dengan sisi " + a + ", " + b + ", " + c + " tidak valid. Semua sisi harus memiliki nilai positif.";
        }

        double[] sides = {a, b, c};
        Arrays.sort(sides);

        if (sides[0] + sides[1] <= sides[2]) {
            return "Segitiga dengan sisi " + a + ", " + b + ", " + c + " tidak valid. Panjang sisi tidak memenuhi ketentuan untuk membentuk segitiga.";
        }

        if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
            return "Segitiga dengan sisi " + a + ", " + b + ", " + c + " adalah segitiga siku-siku.";
        } else {
            return "Segitiga dengan sisi " + a + ", " + b + ", " + c + " bukan segitiga siku-siku.";
        }
    }
    }