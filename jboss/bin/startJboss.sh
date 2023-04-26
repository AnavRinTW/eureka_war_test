#!/bin/sh
export JBOSS_HOME=/opt/jboss-eap-7.4

export JBOSS_CONF=/home/systex/eureka_war_test/jboss
export RUN_CONF=$JBOSS_CONF/bin/standalone.conf

pushd $JBOSS_CONF
$JBOSS_HOME/bin/standalone.sh -b 10.107.0.174 
popd
