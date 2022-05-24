Feature: Register

  @smoke @2

  Scenario: Register as a user
    Given I am on the Panel Page
    When I enter İnvalid MailVerificationCode
    And I should be able to click "E-Posta Adresimi onayla" button
    Then Title should be " Mükellef | Anasayfa | Uçtan Uca İşletme Yönetimi"

  Scenario: Register as a user
    Given I am on the Panel Page
    When I enter "Onay kodunu tekrar gönder"
    Then I should see ....

    Scenario: start the Company formation as a user
      Given I am on the Panel Page
      When I enter the  Start the Company Formation Now
      Then I should be able to see "
