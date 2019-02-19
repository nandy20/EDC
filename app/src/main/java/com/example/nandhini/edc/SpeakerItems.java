package com.example.nandhini.edc;

public class SpeakerItems {

    int imgId;
    String Occupation1 , Occupation2 , Occupation3;
    String Sname;
    String wikiLink;

    public SpeakerItems(int imgId, String occupation1, String occupation2, String occupation3, String sname,String link) {
        this.imgId = imgId;
        Occupation1 = occupation1;
        Occupation2 = occupation2;
        Occupation3 = occupation3;
        wikiLink = link;
        Sname = sname;
    }

    public int getImgId() {
        return imgId;
    }

    public String getOccupation1() {
        return Occupation1;
    }

    public String getOccupation2() {
        return Occupation2;
    }

    public String getOccupation3() {
        return Occupation3;
    }

    public String getSname() {
        return Sname;
    }

    public String getWikiLink() {
        return wikiLink;
    }
}
