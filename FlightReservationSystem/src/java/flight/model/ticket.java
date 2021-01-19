/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flight.model;

import java.sql.Date;

/**
 *
 * @author fatih
 */
public class ticket {
    int id;
    int price;
    int seats;    
    String name;
    String surname;
    String gender;
    Date birthdate;
    String phone;
    String tckn;    
    
    public ticket() {
    }

    public ticket(int id, int price, int seats, String name, String surname, String gender, Date birthdate, String phone, String tckn) {
        this.id = id;
        this.price = price;
        this.seats = seats;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.phone = phone;
        this.tckn = tckn;
    }

    public ticket(int price, int seats, String name, String surname, String gender, Date birthdate, String phone, String tckn) {
        this.price = price;
        this.seats = seats;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.phone = phone;
        this.tckn = tckn;
    }

    public ticket(String name, String surname, String gender, Date birthdate, String phone, String tckn) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.phone = phone;
        this.tckn = tckn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }
    
    
}
