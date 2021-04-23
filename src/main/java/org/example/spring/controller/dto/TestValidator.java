package org.example.spring.controller.dto;

import javax.validation.constraints.*;


public class TestValidator {
    private int id;

    @NotEmpty(message = "Имя не может быть пустым")
    @Size(min = 2, max = 30, message = "ошибка в размере имени")
    private String name;

    @Min(value = 0, message = "возраст должен быть больше  0")
    private int age;

    @NotEmpty(message = "обязательное поле")
    @Email(message = "неправильно указана почта")
    private String email;

    public TestValidator() {

    }

    public TestValidator(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
