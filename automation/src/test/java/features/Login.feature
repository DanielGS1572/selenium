Feature: Application Login
Scenario: Home page default login

Given User is on NetBanking landing page
When User login into application with "abc" and "1234"
Then Home page is populated
And Cards are displayed

  #Se puede poner otro bloque, pero es importante que tenga la palabra Scenario
  #Si en lugar de que sea "Cards are displayed" sea "Cards ARE NOT displayed"
  #Se puede jugar con booleanos y poner algo como "Cards displayed are TRUE"


  # Se puede ver que los escenarios han pasado o no en la seccón de RUN

#  Scenario: Home page default login
#  Given User is on NetBanking landing page
#  When User login into application with "def" and "56789"
#  Then Home page is populated
#  And Cards are displayed