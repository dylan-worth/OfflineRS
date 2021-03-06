/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class jagdx_IDirect3DTexture */

#ifndef _Included_jagdx_IDirect3DTexture
#define _Included_jagdx_IDirect3DTexture
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     jagdx_IDirect3DTexture
 * Method:    GetSurfaceLevel
 * Signature: (JI)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DTexture_GetSurfaceLevel
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     jagdx_IDirect3DTexture
 * Method:    Upload
 * Signature: (JIIIIIIIJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DTexture_Upload
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jint, jint, jint, jlong);

/*
 * Class:     jagdx_IDirect3DTexture
 * Method:    Download
 * Signature: (JIIIIIIIJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DTexture_Download
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jint, jint, jint, jlong);

#ifdef __cplusplus
}
#endif
#endif
