package com.br.zup.validateions.controllers.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public class UserRegisterDTO {
    @NotNull(message = "campo obrigatório")
    @NotBlank(message = "campo não pode estar em branco")
    @Pattern(regexp = "^[A-Za-zÀ-ÖØ-öø-ÿ]+(?:\\s[A-Za-zÀ-ÖØ-öø-ÿ]+)+$", message = "deve contar nome e sobrenome, sem numeros ou caracteres especiais")
    private String name;

    @NotNull(message = "campo obrigatório")
    @Min(value = 18)
    @Max(value = 100)
    @Positive(message = "idade tem que ser maior do que 0")
    private int age;

    @NotNull(message = "campo obrigatório")
    @Min(value = 2024 - 110)
    @Max(value = 2024)
    private int yearOfBirth;

    @NotNull(message = "campo obrigatório")
    @NotBlank(message = "campo não pode estar em branco")
    @Pattern(regexp = "^[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-z-A-Z]{2,}$", message = "deve estar no formato exemplo@algumacoisa.outracoisa, esteja à vontade para usar letras, números, pontos e-ou underlines antes do @")
    private String email;

    public UserRegisterDTO() {
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
