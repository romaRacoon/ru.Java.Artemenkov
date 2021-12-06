package com.company;

public class Book {
    private String _name, _author;
    private int _publishYear;

    public Book(String name, String author, int publishYear) {
        _name = name;
        _author = author;
        _publishYear = publishYear;
    }

    public Book(String name, String author) {
        _name = name;
        _author = author;
    }

    public Book() {
        this._name = "default";
        this._author = "default";
    }

    @Override
    public String toString() {
        String res = "Book{" +
                "name='" + _name + '\'' +
                ", author='" + _author + '\'';

        return res;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        _name = _name;
    }

    public String get_author() {
        return _author;
    }

    public void set_author(String _author) {
        _author = _author;
    }

    public void set_publishYear(int _publishYear) {
        _publishYear = _publishYear;
    }
}
