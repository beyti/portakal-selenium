
Feature:Register2Feature
  This feature deals with the register of the portakal

  Scenario:Register with correct format
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı enter restoran adi with correct format
    And ı choose il from the il combobox
    And ı choose ilce from the ilce combobox
    And I choose semt from the semt combobox
    And ı enter restoran adresi with correct format
    And ı enter restoran sahibi ad with correct format
    And ı enter restoran sahibi soyadi with correct format
    And I enter restoran sahibi telefon no with correct format
    And ı enter şube sorumlusu ad with correct format
    And ı enter restoran telefon no with correct format
    And ı enter e-mail bas with correct format
    And ı enter e-mail son with correct format
    And ı click kayıtol button
    And ı see the işlem gerçekleştiriliyor pop up
    And ı see the bilgilendirme pop up
    Then ı confirm the pop up message
