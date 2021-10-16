package ru.yamal.talanta

class UserDetails {

    // Полное имя
    String firstName

    // Фамилия
    String lastName

    // Возраст
    Integer age

    // Учебное заведение
    Study studyPlace

    // Привязка к пользователю
    static belongsTo = [user: User]

    static constraints = {
    }
}
