package com.company;

public class Author {
    private String _name, _email;
    private char _gender;

    public Author(String name, String email, char gender) {
        _name = name;
        _email = email;
        if(gender != 'm' && gender != 'f')
            throw new IllegalArgumentException("Недопустимый пол: "+ gender);
        _gender = gender;    }

    public String GetName() {
        return _name;
    }

    public String GetEmail() {
        return _email;
    }

    public void SetEmail(String _email) {
        this._email = _email;
    }

    public char GetGender() {
        return _gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + _name + '\'' +
                ", email='" + _email + '\'' +
                ", gender=" + _gender +
                '}';
    }
}
