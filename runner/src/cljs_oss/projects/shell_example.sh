#!/usr/bin/env bash

echo "hello from an example shell task"

echo "pwd: `pwd`"

for i in {1..10} ; do
  echo "x";
  sleep 1.2;
done

echo "shell task done"
