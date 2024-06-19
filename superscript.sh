#!/bin/bash

# Borro lo que hay en la carpeta de Cliente
ruta_carpeta="/Descargas/Cliente/src/es/upm/etsiinf/sos/"

# Me voy a la carpeta de cliente para ejecutar el comando actualizarStub.sh
cd /Descargas/Cliente

# Ejecuto el script actualizarStub.sh
echo "Actualizando stub..."
$AXIS2_HOME/bin/wsdl2java.sh -uri WineSocialUPM.wsdl -wv 2.0 -p es.upm.etsiinf.sos -d adb

# Me muevo a la carpeta Descargas
cd ..

# Ejecuto el script a_catalina.sh
echo "Ejecuto ant en la raiz del proyecto"
cd /Servicio
ant
if [ $? -ne 0 ]; then
  echo "Error al ejecutar ant"
  exit 1
fi

echo "Copiando..."
cp build/lib/WineSocialUPM.aar $CATALINA_HOME/webapps/axis2/WEB-INF/services
if [ $? -ne 0 ]; then
  echo "Error al copiar el archivo"
  exit 1
fi
echo "Copiado en catalina"

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

echo "Scripts ejecutados y contenido de la carpeta borrado exitosamente."