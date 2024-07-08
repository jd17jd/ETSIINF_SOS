#!/bin/bash

echo "Borrando archivos..."

rm -rf src/es/upm/etsiinf/sos/WineSocialUPMCallbackHandler.java
rm -rf src/es/upm/etsiinf/sos/WineSocialUPMStub.java
STATUS=$?

# Comprobar el valor de salida
if [ $STATUS -eq 0 ]; then
	echo "Eliminación exitosa"
else
	echo "Error al eliminar"
fi

# Comando que ejecuta el wsdl2java para actualizar el stub

echo "Generando archivos..."

$AXIS2_HOME/bin/wsdl2java.sh -uri WineSocialUPM.wsdl -wv 2.0 -p es.upm.etsiinf.sos -d adb
