

Feature: Register

  @smoke @1
      Scenario: Register as a user
        Given I am on the Register Page
        And I Register with valid Credentials
        And Title should be Mükellef | Anasayfa | Uçtan Uca İşletme Yönetimi
        And enter valid MailVerificationCode
        And I should be able to click "E-Posta Adresimi onayla" button
        And Title should be " Mükellef | Anasayfa | Uçtan Uca İşletme Yönetimi"
        And the user should be able to complete all the steps step by step
