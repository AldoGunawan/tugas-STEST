package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SegitigaSSTest {

    @Test
    public void testDeteksiSegitigaSikuSiku() {
        String hasilDeteksi = SegitigaSS.deteksiSegitigaSikuSiku(3, 4, 5);
        assertEquals("Segitiga dengan sisi 3.0, 4.0, 5.0 adalah segitiga siku-siku.", hasilDeteksi);

        if (hasilDeteksi.equals("Segitiga dengan sisi 3.0, 4.0, 5.0 adalah segitiga siku-siku.")) {
            System.out.println("Test berhasil: Segitiga siku-siku berhasil terdeteksi.");
        }
    }
}