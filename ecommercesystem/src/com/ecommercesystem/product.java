package com.ecommercesystem;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class product {
    String name;
    String category;
    String description;
    float price;
    BufferedImage image;

    public product(String name, String category, float price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public product(String name, String category, String description, float price) {
        this(name,category,price);
        this.description = description;
    }

    public product(String name, String category, String description, float price, String imagefile) {
        this(name,category,description,price);
        this.setImage(imagefile);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setImage(String filename) {

        try {
            image = ImageIO.read(new File(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //public void getImage(){
    //
    // }
}