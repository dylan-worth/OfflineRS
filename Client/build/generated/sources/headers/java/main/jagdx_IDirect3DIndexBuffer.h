/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class jagdx_IDirect3DIndexBuffer */

#ifndef _Included_jagdx_IDirect3DIndexBuffer
#define _Included_jagdx_IDirect3DIndexBuffer
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     jagdx_IDirect3DIndexBuffer
 * Method:    Lock
 * Signature: (JIII)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DIndexBuffer_Lock
  (JNIEnv *, jclass, jlong, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DIndexBuffer
 * Method:    Unlock
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_jagdx_IDirect3DIndexBuffer_Unlock
  (JNIEnv *, jclass, jlong);

/*
 * Class:     jagdx_IDirect3DIndexBuffer
 * Method:    Upload
 * Signature: (JIIIJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DIndexBuffer_Upload
  (JNIEnv *, jclass, jlong, jint, jint, jint, jlong);

/*
 * Class:     jagdx_IDirect3DIndexBuffer
 * Method:    Download
 * Signature: (JIIIJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DIndexBuffer_Download
  (JNIEnv *, jclass, jlong, jint, jint, jint, jlong);

#ifdef __cplusplus
}
#endif
#endif
