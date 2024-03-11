package com.berkhayta;

public class KitapBilim extends Kitap {
    private String tur;

    public KitapBilim(String isbn, String baslik, String yazar, int yayinYili, String tur) {
        super(isbn, baslik, yazar, yayinYili, tur);
        this.tur = "Bilim";
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

}