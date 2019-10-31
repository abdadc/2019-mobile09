package com.example.recyclerviewtextgrid.models;

public class SuperHero {
    public String heroName;
    public String heroText;
    public int heroImage;

    public SuperHero(String heroName, String heroText, int heroImage) {
        this.heroName = heroName;
        this.heroText = heroText;
        this.heroImage = heroImage;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroText() {
        return heroText;
    }

    public void setHeroText(String heroText) {
        this.heroText = heroText;
    }


    public int getHeroImage() {
        return heroImage;
    }


    public void setHeroImage(int heroImage) {
        this.heroImage = heroImage;
    }
}
