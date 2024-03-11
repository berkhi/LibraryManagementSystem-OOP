package com.berkhayta;

public class KitapTarih extends Kitap {
    private String tur;

    public KitapTarih(String isbn, String baslik, String yazar, int yayinYili, String tur) {
        super(isbn, baslik, yazar, yayinYili, tur);
        this.tur = "Tarih";
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

}
