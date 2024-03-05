$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/sample.feature");
formatter.feature({
  "name": "to validate the login functionality of fb application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to validate the login functionality of fb application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "to launch the chrome browser and window maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "fbjava.to_launch_the_chrome_browser_and_window_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to launch the fb url",
  "keyword": "When "
});
formatter.match({
  "location": "fbjava.to_launch_the_fb_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to pass the email in email field",
  "rows": [
    {
      "cells": [
        "email 1",
        "balaji"
      ]
    },
    {
      "cells": [
        "email 2",
        "sibi"
      ]
    },
    {
      "cells": [
        "email 3",
        "sudha"
      ]
    },
    {
      "cells": [
        "email 4",
        "svdcj"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "fbjava.to_pass_the_email_in_email_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to pass the password in password field",
  "rows": [
    {
      "cells": [
        "password 1",
        "password 2",
        "password 3"
      ]
    },
    {
      "cells": [
        "uejhdb",
        ",ujewmhed",
        "jmfbkhj"
      ]
    },
    {
      "cells": [
        ",kjmhrfbkj",
        ",kjmf,kjh",
        "jhdfnhhb"
      ]
    },
    {
      "cells": [
        "mdhnhfjh",
        "dmnfg",
        "d,ufjh"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "fbjava.to_pass_the_password_in_password_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "fbjava.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
});