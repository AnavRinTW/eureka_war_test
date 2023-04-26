#!/bin/sh
export JAVA_HOME=/opt/jdk-17.0.2
export JBOSS_HOME=/opt/jboss-eap-7.4

cd $JBOSS_HOME/bin
./jboss-cli.sh --connect --controller=127.0.0.1:19990 -c shutdown
