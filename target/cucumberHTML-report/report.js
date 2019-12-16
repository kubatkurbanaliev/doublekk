$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Project.feature");
formatter.feature({
  "line": 1,
  "name": "Adding below data to your excel file in Sheet3",
  "description": "",
  "id": "adding-below-data-to-your-excel-file-in-sheet3",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10243793900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "B",
  "description": "",
  "id": "adding-below-data-to-your-excel-file-in-sheet3;b",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@HRProject1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Go to Database and get Department Name and number of ‘Active’employees and validate with their UI numbers",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Then go to Excel and update column ‘Actual # of Employees’ with number of Active employees that you get from UI and compare that number with ‘expected # of Employees’ and if they matched then update ‘Test Execution Status’ cell as PASSEDif not match then update with FAILED",
  "keyword": "And "
});
formatter.match({
  "location": "HRApplicationSteps.goToDatabaseAndGetDepartmentNameAndNumberOfActiveEmployeesAndValidateWithTheirUINumbers()"
});
formatter.result({
  "duration": 6420570200,
  "status": "passed"
});
formatter.match({
  "location": "HRApplicationSteps.thenGoToExcelAndUpdateColumnActualOfEmployeesWithNumberOfActiveEmployeesThatYouGetFromUIAndCompareThatNumberWithExpectedOfEmployeesAndIfTheyMatchedThenUpdateTestExecutionStatusCellAsPASSEDifNotMatchThenUpdateWithFAILED()"
});
formatter.result({
  "duration": 35600,
  "status": "passed"
});
formatter.after({
  "duration": 615118000,
  "status": "passed"
});
});