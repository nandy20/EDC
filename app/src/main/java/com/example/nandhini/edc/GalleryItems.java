package com.example.nandhini.edc;

public class GalleryItems  {

    //Variables - Image ID's and respecticve strings
    int img1,img2,img3,img4,img5;
    String imgStr1,imgStr2,imgStr3,imgStr4,imgStr5;

    public GalleryItems(int i1,int i2,int i3,int i4,int i5,String s1,String s2,String s3,String s4,String s5){
        this.img1 = i1;
        this.img2 = i2;
        this.img3 = i3;
        this.img4 = i4;
        this.img5 = i5;

        this.imgStr1 = s1;
        this.imgStr2 = s2;
        this.imgStr3 = s3;
        this.imgStr4 = s4;
        this.imgStr5 = s5;

    }

    public int getImg1() {
        return img1;
    }

    public int getImg2() {
        return img2;
    }

    public int getImg3() {
        return img3;
    }

    public int getImg4() {
        return img4;
    }

    public int getImg5() {
        return img5;
    }

    public String getImgStr1() {
        return imgStr1;
    }

    public String getImgStr2() {
        return imgStr2;
    }

    public String getImgStr3() {
        return imgStr3;
    }

    public String getImgStr4() {
        return imgStr4;
    }

    public String getImgStr5() {
        return imgStr5;
    }
}
