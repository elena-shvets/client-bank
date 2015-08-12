package com.clientbank.repository.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by elena on 04.08.15.
 */
@Entity
@Table(name = "client")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_client", unique=true, nullable=false)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="patronymic")
    private String patronymic;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="itn")
    private String itn;

    public Gender gender;

    @Column(name="birth_date")
    private Date birthDate;

    @Column(name="register_date")
    private Date registerDate;


    public Client() {
    }

    public Client(String email, String password, Date birthDate, String itn, String firstName, String patronymic, String lastName) {
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
        this.itn = itn;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getItn() {
        return itn;
    }

    public void setItn(String itn) {
        this.itn = itn;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
