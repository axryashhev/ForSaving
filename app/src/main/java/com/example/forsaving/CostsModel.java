package com.example.forsaving;

import java.util.Date;

public class CostsModel {

    private static final String TYPE_MOTION = "Расходы";

    // поля для заполнения
    private String title;
    private Date date;
    private double amount;
    private String description;


    private CostsModel(String title, Date date, double amount, String description) {
        this.title = title;
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public static final CostsModel[] modelsCosts = {
            new CostsModel("Оплата за квартиру", new Date(), 565.34, "Незадалось!" ),
            new CostsModel("Оплата за офис", new Date(), 456.75, "Налоги!" ),
            new CostsModel("Обед", new Date(), 225.34, "Хороший выбор!" )
    };

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
