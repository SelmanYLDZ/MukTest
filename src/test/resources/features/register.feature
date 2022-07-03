

Feature: Register

  @smoke @1
      Scenario: Register as a user
        Given I am on the Register Page
        And I Register with valid Credentials
        And Title should be Mükellef | Anasayfa | Uçtan Uca İşletme Yönetimi
        And enter valid MailVerificationCode
        And I should be able to click "E-Posta Adresimi onayla" button
        And Title should be " Mükellef | Anasayfa | Uçtan Uca İşletme Yönetimi"
        And The user should be able to chose "Bireysel İşletme" button
        And the user should be able to write "tckn"
        And the user should be able to Fill "Faaliyet Adres, Bilgisi" page
        And the user should be able to Fill "Evrak Yükleme" page