
Feature:Register2Feature
  This feature deals with the register of the portakal

  Scenario:Register with correct format
    Given I navigate to the register page
    And I click Hemen uye ol button
    And I enter restoran adi with correct format
    And I choose il from the il combobox
    And I choose ilce from the ilce combobox
    And I choose semt from the semt combobox
    And I enter restoran adresi with correct format
    And I enter restoran sahibi ad with correct format
    And I enter restoran sahibi soyadi with correct format
    And I enter restoran sahibi telefon no with correct format
    And I enter sube sorumlusu ad with correct format
    And I enter restoran telefon no with correct format
    And I enter e-mail bas with correct format
    And I enter e-mail son with correct format
    And I click kayitol button
    And I see the islem gerceklestiriliyor pop up
    And I see the bilgilendirme pop up
    Then I confirm the pop up message
