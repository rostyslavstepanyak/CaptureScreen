package com.screencapture.mydaogenerator;

import java.io.IOException;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;
import de.greenrobot.daogenerator.DaoGenerator;

public class MyDAOGenerator {
    private static Schema schema = null;
    public static void main(String args[]) throws Exception {
        schema = new Schema(1, "com.screencapture.rstepanyak.screencapture.model");
        addEntities();
    }

    private static void addEntities() {
        Entity person = schema.addEntity("Person");
        person.addIdProperty();
        person.addStringProperty("name");
        person.addStringProperty("comment");

        Entity lease = schema.addEntity("Lease");
        lease.addIdProperty();
        lease.addStringProperty("item");
        lease.addStringProperty("comment");
        lease.addLongProperty("leasedate");
        lease.addLongProperty("returndate");
        try {
            new DaoGenerator().generateAll(schema, "app/src/main/java");
        }
        catch (Exception e) {
            e.printStackTrace();;
        }

    }
}
