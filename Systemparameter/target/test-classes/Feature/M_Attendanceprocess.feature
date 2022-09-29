Feature: System parameter settings

  Scenario: Attendeace Process settings
    Given Go to utility and syetem parameter settings Attendance process settings
    When Click check box in attendance process settings and click process attendance
    And Check Attendance process settings for Temperature Reader
    And check in update by individual section in and out are updated
