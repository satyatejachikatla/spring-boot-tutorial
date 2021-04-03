#!/bin/bash

# Top env
export TOPDIR="$( cd "$(dirname "$0")" >/dev/null 2>&1 ; pwd -P )"
export PATH=`find $TOPDIR/vendor/ -maxdepth 2 -name "sts-*" -type d`:$PATH
export PATH=`find $TOPDIR/vendor/ -maxdepth 2 -name "Postman" -type d`:$PATH

