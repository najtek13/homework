# homework

Environment:
    1. Platform: Windows 10
    2. Chrome: 68.0.3440.106
    3. Firefox: 61.0.2


Preconditions:
    1. run java -jar selenium-server-standalone-3.14.0.jar -role hub
    2. run java -jar -Dwebdriver.gecko.driver="PATH TO DRIVER"
     -Dwebdriver.chrome.driver="PATH TO DRIVER"
      selenium-server-standalone-3.14.0.jar -role node -hub http://localhost:4444/grid/register
       -browser browserName=firefox,version=61.0.2,maxInstances=1,platform=WINDOWS
        -browser browserName=chrome,version=68.0,maxInstances=1,platform=WINDOWS

Run test:
    1. mvn clean test