package com.freedos.sexeducation.Model;

public class KategoriModel {
    Integer langLogo;
    String langName;

    public KategoriModel(Integer langLogo, String langName){
        this.langLogo = langLogo;
        this.langName = langName;
    }

    public Integer getLangLogo() {
        return langLogo;
    }

    public String getLangName() {
        return langName;
    }
}
