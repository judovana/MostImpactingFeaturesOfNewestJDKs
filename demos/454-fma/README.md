## 454: [Foreign Function & Memory API](https://openjdk.org/jeps/454) (22)

 * `JAVA_HOME=/usr/lib/jvm/java-25-openjdk/`
  
 * `cd c ; gcc -c -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux Main.c -o Main.o`
 * `cd c ; gcc -shared  -fPIC -o ../libnative.so Main.o -lc`

 * `cd go ; go build -o ../gohello.so -buildmode=c-shared Main.go`

 * `cd rust ; cargo build --release ; cp -v */*/librust_math.so ..`
 
 * `/usr/lib/jvm/java-25-openjdk/bin/java -Djava.library.path=. Main.java`
 * `/usr/lib/jvm/java-25-openjdk/bin/java --enable-native-access=ALL-UNNAMED  FF.java`
 * `/usr/lib/jvm/java-25-openjdk/bin/java  MA.java`

 

