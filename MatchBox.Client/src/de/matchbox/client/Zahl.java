/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.matchbox.client;

/**
 *
 * @author Name
 */
public class Zahl {

    private boolean[] zahlCode;

    public Zahl(int zahl) {
        setZahl(zahl);
    }

    public Zahl() {

    }

    public void setZahlCode(boolean[] zahlCode) {
        this.zahlCode = zahlCode;
    }

    public void setZahl(int pZahl) {
        if (pZahl >= 0 && pZahl <= 9) {
            switch (pZahl) {
                case 0: {
                    zahlCode = new boolean[]{
                        true, true, true, false, true, true, true
                    };
                    break;
                }
                case 1: {
                    zahlCode = new boolean[]{
                        false, false, true, false, false, true, false
                    };
                    break;
                }
                case 2: {
                    zahlCode = new boolean[]{
                        true, false, true, true, true, false, true
                    };
                    break;
                }
                case 3: {
                    zahlCode = new boolean[]{
                        true, false, true, true, false, true, true
                    };
                    break;
                }
                case 4: {
                    zahlCode = new boolean[]{
                        false, true, true, true, false, true, false
                    };
                    break;
                }
                case 5: {
                    zahlCode = new boolean[]{
                        true, true, false, true, false, true, true
                    };
                    break;
                }
                case 6: {
                    zahlCode = new boolean[]{
                        true, true, false, true, true, true, true
                    };
                    break;
                }
                case 7: {
                    zahlCode = new boolean[]{
                        true, false, true, false, false, true, false
                    };
                    break;
                }
                case 8: {
                    zahlCode = new boolean[]{
                        true, true, true, true, true, true, true
                    };
                    break;
                }
                case 9: {
                    zahlCode = new boolean[]{
                        true, true, true, true, false, true, true
                    };
                    break;
                }

            }
        }

    }

    public boolean[] getZahlCode() {
        return zahlCode;
    }

    public boolean isNumber() {
        return this.toInt() != -1;
    }

//    public int toInt() {
//        for (int i = 0; i < 10; i++) {
//            if (zahlCode == new Zahl(i).getZahlCode()) {
//                return i;
//            }
//        }
//        return -1;
//    }
    public int toInt() {
        boolean[] lzahlCode;
        Zahl lZahl = new Zahl();
        boolean assd = true;
        for (int i = 0; i < 10; i++) {
            assd = true;
            lZahl.setZahl(i);
            lzahlCode = lZahl.getZahlCode();
            for (int y = 0; y < 7; y++) {
                if (zahlCode[y] != lzahlCode[y]) {
                    assd = false;
                }
            }
            if (assd) {
                return i;
            }
        }
        return -1;
    }

}
