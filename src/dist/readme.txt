Extreme Startup Test Server
===========================

Could be used to check connectiviy to Extreme Startup Server.

Start with bin/extreme-test (UN*X) or bin/extreme-test.bat (Windows).

Will start the test server on your machine on port 8080 an answer HTTP GET requests on this port with
your OS user name.

Set system properties "extreme.name" and/or "extreme.port" via environment variable "EXTREME_TEST_OPTS"
to overwrite defaults like this:

  export EXTREME_TEST_OPTS="-Dextreme.name=Foo -Dextreme.port=9876"
