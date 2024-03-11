package com.berkhayta;

import java.util.List;

public interface IUye {

    String getAdSoyad();

    void setAdSoyad(String adSoyad);

    String getKullaniciAdi();

    void setKullaniciAdi(String kullaniciAdi);

    String getSifre();

    void setSifre(String sifre);

    List<Kitap> getOduncAlinanKitaplar();

    void kitapOduncAl(Kitap kitap);

    void kitapIadeEt(Kitap kitap);



}