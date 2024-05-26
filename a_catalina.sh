#!/bin/bash

echo "Copiando..."
cp build/lib/WineSocialUPM.aar $CATALINA_HOME/webapps/axis2/WEB-INF/services
echo "Copiado en catalina"
