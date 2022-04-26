Feature: Register

  @smoke @2
  Scenario: Seting
    Given I am on the Panel Page
    When I enter valid MailVerificationCode
    And I should be able to click "E-Posta Adresimi onayla" button
    Then Title should be " Mükellef | Anasayfa | Uçtan Uca İşletme Yönetimi"

  Scenario: Register as a user
    Given I am on the Panel Page
    When I enter İnvalid MailVerificationCode
    And I should be able to click "E-Posta Adresimi onayla" button
    Then Title should be " Mükellef | Anasayfa | Uçtan Uca İşletme Yönetimi"

  Scenario: Register as a user
    Given I am on the Panel Page
    When I enter "Onay kodunu tekrar gönder"
    Then I should see ....
