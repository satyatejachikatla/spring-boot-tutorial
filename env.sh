#!/bin/bash

. ./envrc.sh
if [ ! $? == 0 ]; then
	exit
fi

bash --norc --noprofile