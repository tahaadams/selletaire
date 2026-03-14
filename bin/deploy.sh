#!/usr/bin/env bash

rm -rf ../target/universal/selletaire-0.1-SNAPSHOT/*
unzip ../target/universal/selletaire-0.1-SNAPSHOT.zip -d ../target/universal/

rsync -zrv --delete ../target/universal/selletaire-0.1-SNAPSHOT/* tahaadams@selletaire:~/apps/selletaire
