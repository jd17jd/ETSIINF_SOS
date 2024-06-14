#!/bin/bash

echo "Ejecutamos ant"
ant
if [ $? -ne 0 ]; then
  echo "Error al ejecutar ant"
  exit 1
fi
echo "Ejecutado el ant en raiz"

echo "Copiando..."
cp build/lib/WineSocialUPM.aar $CATALINA_HOME/webapps/axis2/WEB-INF/services
if [ $? -ne 0 ]; then
  echo "Error al copiar el archivo"
  exit 1
fi
echo "Copiado en catalina"

echo "Ejecutando wsdl2java para actualizar el stub"
$AXIS2_HOME/bin/wsdl2java.sh -uri WineSocialUPM.wsdl -wv 2.0 -p es.upm.etsiinf.sos -d adb
if [ $? -ne 0 ]; then
  echo "Error al ejecutar wsdl2java"
  exit 1
fi
echo "Stub actualizado correctamente"

echo "Reiniciamos el tomcat"
$CATALINA_HOME/bin/shutdown.sh
if [ $? -ne 0 ]; then
  echo "Error al apagar Tomcat"
  exit 1
fi

$CATALINA_HOME/bin/startup.sh
if [ $? -ne 0 ]; then
  echo "Error al iniciar Tomcat"
  exit 1
fi
echo "Tomcat reiniciado correctamente"
