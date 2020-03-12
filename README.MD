# GenesisTestTask
## Prerequisites
* **JDK version >= 11.0.1**
* **Apache Maven version >= 3.6.0**
* **Google Chrome version <= 79.0**
* **FireFox Mozilla version <= 70.0**
## Task:
Необходимо написать автотесты которые делают следующее:
- Регистрируют юзера через форму по линке: https://m.hitwe.com/landing/inter?p=15276
- Загружают фото на профиль (любое)

При выполнении тестового задания следует ограничится следующим стеком технологий:
- Java
- TestNG
- Selenium
- Maven

Для email использовать домен @testmail.com

Браузеры: Chrome, Firefox.
## Run 
* **To run tests for Chrome via terminal use:**
```
mvn test -Dbrowser=chrome
```
* **To run tests for Firefox via terminal use:**
```
mvn test -Dbrowser=firefox
```
