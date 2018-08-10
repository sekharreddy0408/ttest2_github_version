Feature: this is demo project trying to do automation with cucumber

Background: this is background test
Given first line in background


Scenario: first scenario
Given first line in scenario
When second line in scenario
Then third line in scenario


Scenario Outline: This is second scenario
Given Second scenario first line
When Second Scenrio <second> line

Examples:
|second|
|value1|
|value2|
|value3|


Scenario: this is third scenrio
Given this has only datatable
    |first statement|second statement|
    
When this parameter statement "test1"


