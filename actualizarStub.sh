#!/bin/bash

#comando que ejecuta el wsdl2java para actualizar el stub
$AXIS2_HOME/bin/wsdl2java.sh -uri WineSocialUPM.wsdl -wv 2.0 -p es.upm.etsiinf.sos -d adb