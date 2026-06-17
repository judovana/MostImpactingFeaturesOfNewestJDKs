#!/bin/bash

set -xe

 JAVA_HOME=/usr/lib/jvm/java-25-openjdk/
pushd  c ;
 gcc -c -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux Main.c -o Main.o
 gcc -shared  -fPIC -o ../libnative.so Main.o -lc
popd
pushd go
  go build -o ../gohello.so -buildmode=c-shared Main.go
popd
pushd rust 
  cargo build --release ; cp -v */*/librust_math.so ..
popd
$JAVA_HOME/bin/java -Djava.library.path=. Main.java
$JAVA_HOME/bin/java --enable-native-access=ALL-UNNAMED  FF.java
$JAVA_HOME/bin/java  MA.java
chmod 755  gohello.so
set +x
echo rm -vf c/Main.o
echo rm -vrf rust/target rust/Cargo.lock
echo rm -vf gohello.h
echo rm -vf *.so

