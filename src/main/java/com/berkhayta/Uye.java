package com.berkhayta;

import java.util.ArrayList;
import java.util.List;

public class Uye implements IUye {

    private String adSoyad;
    private String kullaniciAdi;
    private String sifre;
    private List<Kitap> oduncAlinanKitaplar;

    public Uye(String adSoyad, String kullaniciAdi, String sifre) {
        this.adSoyad = adSoyad;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        oduncAlinanKitaplar = new ArrayList<>();
    }

    @Override
    public String getAdSoyad() {
        return adSoyad;
    }

    @Override
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    @Override
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    @Override
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    @Override
    public String getSifre() {
        return sifre;
    }

    @Override
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public List<Kitap> getOduncAlinanKitaplar() {
        return oduncAlinanKitaplar;
    }

    @Override
    public void kitapOduncAl(Kitap kitap) {
        oduncAlinanKitaplar.add(kitap);
    }

    @Override
    public void kitapIadeEt(Kitap kitap) {
        oduncAlinanKitaplar.remove(kitap);
    }

    @Override
    public String toString() {
        return "Uye{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", sifre='" + sifre + '\'' +
                ", oduncAlinanKitaplar=" + oduncAlinanKitaplar +
                '}';
    }
}
