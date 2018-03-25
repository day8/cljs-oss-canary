#!/usr/bin/env bash

echo "hello from an example shell task"

echo "pwd: `pwd`"

printf "test multi\nline\noutput\n"

printf "test \e[1;34mANSI colors\e[m\n"

printf "\e[31m%s\e[0m\n" "test error" >&2;

for i in {1..10} ; do
  echo "x";
  sleep 1.2;
done

echo "shell task done"