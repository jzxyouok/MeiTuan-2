package com.example;


import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class GreenDao {

    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, "com.example.greendao");
        addNote(schema);
        new DaoGenerator().generateAll(schema, "E:\\CodeRoom\\Andriod\\MeiTuan\\greendao\\src\\main\\java");
    }

    /**
     * @param schema
     */
    private static void addNote(Schema schema) {
        Entity note = schema.addEntity("Note");
        note.addIdProperty();
        note.addStringProperty("text").notNull();
        note.addStringProperty("comment");
        note.addDateProperty("date");
    }
}
