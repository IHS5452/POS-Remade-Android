package com.ianschrauth.pos_reamde_android;

/**
 * Created by ianschrauth on 10/11/18.
 */

public class bookButtons {

    mainScreen ms = new mainScreen();
    pricesforbooks pfb = new pricesforbooks();


    //tumspuv genimis series

    void PIATW() {
        ms.grandtotal = ms.grandtotal + pfb.PIATW;
        pfb.ammtPIATW++;
    }

    void CIATW() {
        ms.grandtotal = ms.grandtotal + pfb.CIATW;
        pfb.ammtCIATW++;
    }

    void BIATW() {
        ms.grandtotal = ms.grandtotal + pfb.BIATW;
        pfb.ammtPIATW++;
    }

    void SIATW1() {
        ms.grandtotal = ms.grandtotal + pfb.SIATW1;
        pfb.ammtSIATW1++;
    }


//witchcraft series
    void Bella() {
        ms.grandtotal = ms.grandtotal + pfb.Bella;
        pfb.ammtBella++;
    }

    void Nia() {
        ms.grandtotal = ms.grandtotal + pfb.Nia;
        pfb.ammtNia++;
    }



    //The Fangs Saga
    void TGWTF1() {
        ms.grandtotal = ms.grandtotal + pfb.TGWIF1;
        pfb.ammtPIATW++;
    }

    void TGWTF2() {
        ms.grandtotal = ms.grandtotal + pfb.TGWIF2;
        pfb.ammtSIATW1++;
    }
    void TGWTF3() {
        ms.grandtotal = ms.grandtotal + pfb.TGWIF3;
        pfb.ammtTGWIF3++;
    }


    //Vacillation Saga
    void VBAB1() {
        ms.grandtotal = ms.grandtotal + pfb.VBAB1;
        pfb.ammtVBAB1++;
    }

    void VBAB2() {
        ms.grandtotal = ms.grandtotal + pfb.VBAB2;
        pfb.ammtVBAB2++;
    }

    void VBAB3() {
        ms.grandtotal = ms.grandtotal + pfb.VBAB3;
        pfb.ammtVBAB3++;
    }

    void VBABss() {
        ms.grandtotal = ms.grandtotal + pfb.VBABss;
        pfb.ammtVBABss++;
    }

    void TIFY1() {
        ms.grandtotal = ms.grandtotal + pfb.TIFY;
        pfb.ammtTIFY++;
    }

    void TIFY2() {
        ms.grandtotal = ms.grandtotal + pfb.TIFU2;
        pfb.ammtTIFU2++;
    }

    void TIFY2C() {
        ms.grandtotal = ms.grandtotal + pfb.TIFY2C;
        pfb.ammtTIFY2C++;
    }

    void IIHY() {
        ms.grandtotal = ms.grandtotal + pfb.IIHY;
        pfb.ammtIIHY++;
    }






}
