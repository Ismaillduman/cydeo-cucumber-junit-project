#TC#: Wikipedia Search Functionality Title Verification
#1. User is on Wikipedia home page
#2. User types Steve Jobs in the wiki search box
#3. User clicks wiki search button
#4. User sees Steve Jobs is in the wiki title
#Note: Follow POM
#
#TC#: Wikipedia Search Functionality Header Verification
#1. User is on Wikipedia home page
#2. User types Steve Jobs in the wiki search box
#3. User clicks wiki search button
#4. User sees Steve Jobs is in the main header
#Note: Follow POM
#TC#: Wikipedia Search Functionality Image Header Verification
#1. User is on Wikipedia home page
#2. User types Steve Jobs in the wiki search box
#3. User clicks wiki search button
#4. User sees Steve Jobs is in the image header
#Note: Follow POM
#WPS-7531
Feature: Wikipedia Search Functionality

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title
  @wip
  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header