

Feature: Register

  @smoke @1
      Scenario: Register as a user
        Given I am on the Register Page
        When I Register with valid Credentials
        Then Title should be Mükellef | Anasayfa | Uçtan Uca İşletme Yönetimi