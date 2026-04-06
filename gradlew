#!/bin/sh
#
# Gradle wrapper script for UNIX
#

# Determine the Java command to use
if [ -n "$JAVA_HOME" ] ; then
    JAVACMD="$JAVA_HOME/bin/java"
else
    JAVACMD="java"
fi

# Execute Gradle
exec "$JAVACMD" -jar gradle/wrapper/gradle-wrapper.jar "$@"
