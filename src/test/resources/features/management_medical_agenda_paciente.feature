Feature: Management medical service to patient
  As a user, i want to register a medical service inside in page

  @register1
  Scenario: Registering medical appointment
    Given Edgar needs to register with a new patient
    When He does register process inside the Hospital pages
      | firstnamepaciente | lastnamePaciente | telephonepaciente |
      | diego            | Granados         | 3213516122        |

    Then  Page shows him that his medical appointment is registered to patient

