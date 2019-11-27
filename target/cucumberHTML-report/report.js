$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddingOrder.feature");
formatter.feature({
  "line": 2,
  "name": "Adding order",
  "description": "",
  "id": "adding-order",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TEC-102"
    },
    {
      "line": 1,
      "name": "@ui"
    },
    {
      "line": 1,
      "name": "@smokeTest"
    },
    {
      "line": 1,
      "name": "@regressionTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Verify delete functionality",
  "description": "",
  "id": "adding-order;verify-delete-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@TecTC-1015"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User logs in with valid credentials username \"Tester\" password \"test\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User deletes \"\u003cName\u003e\" from table",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Validate that \"\u003cName\u003e\" is deleted",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "adding-order;verify-delete-functionality;",
  "rows": [
    {
      "cells": [
        "Name"
      ],
      "line": 30,
      "id": "adding-order;verify-delete-functionality;;1"
    },
    {
      "cells": [
        "Mark Smith"
      ],
      "line": 31,
      "id": "adding-order;verify-delete-functionality;;2"
    },
    {
      "cells": [
        "Samuel Clemens"
      ],
      "line": 32,
      "id": "adding-order;verify-delete-functionality;;3"
    },
    {
      "cells": [
        "Paul Brown"
      ],
      "line": 33,
      "id": "adding-order;verify-delete-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10762355800,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Verify delete functionality",
  "description": "",
  "id": "adding-order;verify-delete-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TEC-102"
    },
    {
      "line": 1,
      "name": "@ui"
    },
    {
      "line": 23,
      "name": "@TecTC-1015"
    },
    {
      "line": 1,
      "name": "@smokeTest"
    },
    {
      "line": 1,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User logs in with valid credentials username \"Tester\" password \"test\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User deletes \"Mark Smith\" from table",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Validate that \"Mark Smith\" is deleted",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyLoginFunctionality.navigate_to_login_page()"
});
formatter.result({
  "duration": 2431826700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester",
      "offset": 46
    },
    {
      "val": "test",
      "offset": 64
    }
  ],
  "location": "VerifyLoginFunctionality.user_logs_in_with_valid_credentials_username_password(String,String)"
});
formatter.result({
  "duration": 570116600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mark Smith",
      "offset": 14
    }
  ],
  "location": "AddingOrderSteps.userDeletesFromTable(String)"
});
formatter.result({
  "duration": 803289600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mark Smith",
      "offset": 15
    }
  ],
  "location": "AddingOrderSteps.validateThatIsDeleted(String)"
});
formatter.result({
  "duration": 652974700,
  "status": "passed"
});
formatter.after({
  "duration": 657316600,
  "status": "passed"
});
formatter.before({
  "duration": 9544445700,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Verify delete functionality",
  "description": "",
  "id": "adding-order;verify-delete-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TEC-102"
    },
    {
      "line": 1,
      "name": "@ui"
    },
    {
      "line": 23,
      "name": "@TecTC-1015"
    },
    {
      "line": 1,
      "name": "@smokeTest"
    },
    {
      "line": 1,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User logs in with valid credentials username \"Tester\" password \"test\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User deletes \"Samuel Clemens\" from table",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Validate that \"Samuel Clemens\" is deleted",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyLoginFunctionality.navigate_to_login_page()"
});
formatter.result({
  "duration": 2272206100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester",
      "offset": 46
    },
    {
      "val": "test",
      "offset": 64
    }
  ],
  "location": "VerifyLoginFunctionality.user_logs_in_with_valid_credentials_username_password(String,String)"
});
formatter.result({
  "duration": 689947400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samuel Clemens",
      "offset": 14
    }
  ],
  "location": "AddingOrderSteps.userDeletesFromTable(String)"
});
formatter.result({
  "duration": 992148600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samuel Clemens",
      "offset": 15
    }
  ],
  "location": "AddingOrderSteps.validateThatIsDeleted(String)"
});
formatter.result({
  "duration": 628549100,
  "status": "passed"
});
formatter.after({
  "duration": 728170700,
  "status": "passed"
});
formatter.before({
  "duration": 9530313900,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Verify delete functionality",
  "description": "",
  "id": "adding-order;verify-delete-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TEC-102"
    },
    {
      "line": 1,
      "name": "@ui"
    },
    {
      "line": 23,
      "name": "@TecTC-1015"
    },
    {
      "line": 1,
      "name": "@smokeTest"
    },
    {
      "line": 1,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User logs in with valid credentials username \"Tester\" password \"test\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User deletes \"Paul Brown\" from table",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Validate that \"Paul Brown\" is deleted",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyLoginFunctionality.navigate_to_login_page()"
});
formatter.result({
  "duration": 2267150100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester",
      "offset": 46
    },
    {
      "val": "test",
      "offset": 64
    }
  ],
  "location": "VerifyLoginFunctionality.user_logs_in_with_valid_credentials_username_password(String,String)"
});
formatter.result({
  "duration": 739187500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paul Brown",
      "offset": 14
    }
  ],
  "location": "AddingOrderSteps.userDeletesFromTable(String)"
});
formatter.result({
  "duration": 994182000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paul Brown",
      "offset": 15
    }
  ],
  "location": "AddingOrderSteps.validateThatIsDeleted(String)"
});
formatter.result({
  "duration": 500767400,
  "status": "passed"
});
formatter.after({
  "duration": 692206100,
  "status": "passed"
});
});