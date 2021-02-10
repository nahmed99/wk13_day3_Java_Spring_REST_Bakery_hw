package com.example.codeclan.breadtracker.components;

import com.example.codeclan.breadtracker.helpers.Region;
import com.example.codeclan.breadtracker.models.Bakery;
import com.example.codeclan.breadtracker.models.Bread;
import com.example.codeclan.breadtracker.repositories.BakeryRepository;
import com.example.codeclan.breadtracker.repositories.BreadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    BakeryRepository bakeryRepository;
    @Autowired
    BreadRepository breadRepository;
    public DataLoader() {
    }
    public void run(ApplicationArguments args) {
        Bakery bakery1 = new Bakery("Glendronach", Region.Highlands);
        bakeryRepository.save(bakery1);
        Bread bread1 = new Bread("The Glendronach Revival", 15, 2018, bakery1);
        breadRepository.save(bread1);
        Bakery bakery2 = new Bakery("Rosebank", Region.Lowlands);
        bakeryRepository.save(bakery2);
        Bread bread2 = new Bread("The Rosebank 12 - Flora and Fona", 12, 1991, bakery2);
        breadRepository.save(bread2);
        Bakery bakery3 = new Bakery("Macallan", Region.Speyside);
        bakeryRepository.save(bakery3);
        Bread bread3 = new Bread("The Macallan Anniversary Malt", 25, 1995, bakery3);
        breadRepository.save(bread3);
        Bread bread4 = new Bread("The Glendronach Original", 12, 2018, bakery1);
        breadRepository.save(bread4);
        Bakery bakery4 = new Bakery("Balvenie", Region.Speyside);
        bakeryRepository.save(bakery4);
        Bakery bakery5 = new Bakery("Highland Park", Region.Island);
        bakeryRepository.save(bakery5);
        Bread bread5 = new Bread("Viking Honour", 12, 2017, bakery5);
        breadRepository.save(bread5);
        Bread bread6 = new Bread("Twist Tattoo", 16, 2019, bakery5);
        breadRepository.save(bread6);
        Bakery bakery6 = new Bakery("Old Pulteney", Region.Highlands);
        bakeryRepository.save(bakery6);
        Bread bread7 = new Bread("Old Pulteney 12", 12, 2018, bakery6);
        breadRepository.save(bread7);
        Bread bread8 = new Bread("Old Pulteney 18", 18, 2018, bakery6);
        breadRepository.save(bread8);
        Bakery bakery7 = new Bakery("Blair Athol", Region.Highlands);
        bakeryRepository.save(bakery7);
        Bread bread9 = new Bread("Flora and Fauna", 12, 2020, bakery7);
        breadRepository.save(bread9);
        Bread bread10 = new Bread("Lady of the Glen", 13, 2005, bakery7);
        breadRepository.save(bread10);
        Bakery bakery8 = new Bakery("Glenkinchie", Region.Lowlands);
        bakeryRepository.save(bakery8);
        Bread bread11 = new Bread("The Manager's Dram", 15, 2010, bakery8);
        breadRepository.save(bread11);
        Bread bread12 = new Bread("Glenkinchie 10", 10, 1987, bakery8);
        breadRepository.save(bread12);
        Bakery bakery9 = new Bakery("Lagavulin", Region.Islay);
        bakeryRepository.save(bakery9);
        Bread bread13 = new Bread("Lagavulin 16 Year Old", 16, 2014, bakery9);
        breadRepository.save(bread13);
        Bread bread14 = new Bread("Lg10 - Elements of Islay" , 1, 2007, bakery9);
        breadRepository.save(bread14);
        Bakery bakery10 = new Bakery("Laphroaig", Region.Islay);
        bakeryRepository.save(bakery10);
        Bread bread15 = new Bread("Lagavulin 16 Year Old", 16, 2014, bakery8);
        breadRepository.save(bread15);
        Bread bread16 = new Bread("Lg10 - Elements of Islay" , 1, 2007, bakery7);
        breadRepository.save(bread16);
        Bakery bakery11 = new Bakery("Talisker", Region.Island);
        bakeryRepository.save(bakery11);
        Bread bread17 = new Bread("57° North", 1, 2014, bakery11);
        breadRepository.save(bread17);
        Bread bread18 = new Bread("Skye" , 1, 2015, bakery11);
        breadRepository.save(bread18);
        Bakery bakery12 = new Bakery("Isle of Arran",Region.Island );
        bakeryRepository.save(bakery12);
        Bread bread19 = new Bread("Caskstrength and Carry On", 13, 2011, bakery12);
        breadRepository.save(bread19);
        Bread bread20 = new Bread("Seven Wood" , 1, 2018, bakery12);
        breadRepository.save(bread20);
        Bakery bakery13 = new Bakery("The Glenlivet",Region.Speyside );
        bakeryRepository.save(bakery13);
        Bread bread21 = new Bread("Founder's Reserve", 12, 2014, bakery13);
        breadRepository.save(bread21);
        Bread bread22 = new Bread("Carmaferg" , 18, 2018, bakery13);
        breadRepository.save(bread22);
    }
}
