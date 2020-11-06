#!/bin/bash
USER=Andris
date
echo "hello $USER"
pwd
ps -ef | tail +2 | wc -l
ps -ef | grep bioset | grep -v | wc -l
ls -la /etc/passwd 
