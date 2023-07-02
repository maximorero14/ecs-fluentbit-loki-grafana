#!/bin/sh

# Start Fluent Bit
/fluent-bit/bin/fluent-bit -c /fluent-bit/etc/fluent-bit.conf &

# Start your Java app
java -jar /app/application.jar