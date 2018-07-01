package com.aboudiop.journalapp;

public class JournalNote {

    private String name;
    private String title;


    public JournalNote() {
    }

    public JournalNote(String title, String name) {
        this.title = title;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String text) {
        this.title = text;
    }



}
