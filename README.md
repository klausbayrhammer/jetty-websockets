# What to do:

1. Start Jetty
1. Open the start-page (e.g. http://localhost:8081/)
1. Open the browser console
1. click on Connect 
You should see some some logs like >>> CONNECT, <<<< CONNECTED, >>>> SUBSCRIBE in the console
1. Open a new Browser tab
1. Call the testNotification-webservier (e.g. http://localhost:8081/websockets/rest/testNotification)
1. switch to the last browser-tab
here you should logs like <<<< MESSAGE .... "Test websocket response"

Works with the Intellij-Jetty plugin (out of the box)
When using the Eclipse-Jetty-Plugin you have to include all lib's from $JETTY_HOME/lib,
$JETTY_HOME/lib/websocket and $JETTY_HOME/lib/annotations,   