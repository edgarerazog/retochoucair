Feature: Management medical service to paciente
  As a user, i want to register a medical service inside in page

  @register1
  Scenario: Registering medical appointment
    Given Edgar needs to register with a new paciente
    When He does register process inside the Hospital pages
      | firtnamepaciente | lastnamePaciente | telephonepaciente |
      | diego            | Granados         | 3213516122        |

    Then  Page shows him that his medical appointment is registered to paciente

