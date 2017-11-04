//
// ndCreated by Administrator on 2017/9/27.
//
#include <string.h>
#include <jni.h>
 jstring  Java_com_loumeng_jnisimple_JNIsimple_getString
  (JNIEnv *env, jobject thiz) {
   return (*env)->NewStringUTF(env, "c语言中的simple");
  }
