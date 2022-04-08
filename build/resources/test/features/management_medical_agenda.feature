Feature: Management medical service
  As a user, i want to register a medical service inside in page

  @register
  Scenario: Registering medical appointment
    Given Edgar needs to register with a new doctor
    When He does register process inside the Hospital page
      | firstname | lastname | telephone  |
      | edgar     | Erazo    | 3213516155 |


    Then  Page shows him that his medical appointment is registered

