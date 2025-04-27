Feature: Title of your feature
  
  I want to autimate simple web Application

  @tag1
  Scenario: GUI Elements automation
    Given I want to enter name "john","john@123","9900"
    Given i want to enter the address of the GUI "no 53 sai ram flats chandrashakr nager chennai 97"
    When Select the gender of radio buttton
    And Select the day in tick mark
    And Select contry dropdown
    And select scrole the mouse and select green colour
    And select scrole the mouse and select Animel Rabit
    When Click on date coloum and select date
    And Click on adate
    Then Take a screen shot 
    Then click and select on the seckend date
    

  @2tag2
  Scenario Outline: GUI Elements automation
    Given I want to enter name "<Neme>","<Email>","<Mo:No>"
    Given i want to enter the address of the GUI "<Address>"
    When Select the gender of radio buttton
    And Select the day in tick mark
    And Select contry dropdown
    And select scrole the mouse and select green colour
    And select scrole the mouse and select Animel Rabit
    When Click on date coloum and select date
    And Click on adate
    Then Take a screen shot 
    Then click and select on the seckend date

    Examples: 
      | Neme   | Email            | Mo:No     | Address      |
      | Jone   | Jone@gmail.com   | 995274452 | kallakudi    |
      | Jordan | Jordan@gmail.com | 995274452 | kallakudi tk |
