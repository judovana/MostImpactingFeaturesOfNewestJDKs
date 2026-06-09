#include <stdio.h>
#include <jni.h>

JNIEXPORT void JNICALL Java_Main_nativeHello
  (JNIEnv *env, jclass) {
   printf("Hello, World from good old JNI!");
}

double add(double a, double b) {
    printf("Hello, World from new native call!");
    return a + b;
}
