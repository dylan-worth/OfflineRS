/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class jagdx_D3DLIGHT */

#ifndef _Included_jagdx_D3DLIGHT
#define _Included_jagdx_D3DLIGHT
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     jagdx_D3DLIGHT
 * Method:    Create
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_jagdx_D3DLIGHT_Create
  (JNIEnv *, jclass);

/*
 * Class:     jagdx_D3DLIGHT
 * Method:    Destroy
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_jagdx_D3DLIGHT_Destroy
  (JNIEnv *, jclass, jlong);

/*
 * Class:     jagdx_D3DLIGHT
 * Method:    SetType
 * Signature: (JI)V
 */
JNIEXPORT void JNICALL Java_jagdx_D3DLIGHT_SetType
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     jagdx_D3DLIGHT
 * Method:    SetAmbient
 * Signature: (JFFFF)V
 */
JNIEXPORT void JNICALL Java_jagdx_D3DLIGHT_SetAmbient
  (JNIEnv *, jclass, jlong, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     jagdx_D3DLIGHT
 * Method:    SetSpecular
 * Signature: (JFFFF)V
 */
JNIEXPORT void JNICALL Java_jagdx_D3DLIGHT_SetSpecular
  (JNIEnv *, jclass, jlong, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     jagdx_D3DLIGHT
 * Method:    SetDiffuse
 * Signature: (JFFFF)V
 */
JNIEXPORT void JNICALL Java_jagdx_D3DLIGHT_SetDiffuse
  (JNIEnv *, jclass, jlong, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     jagdx_D3DLIGHT
 * Method:    SetPosition
 * Signature: (JFFF)V
 */
JNIEXPORT void JNICALL Java_jagdx_D3DLIGHT_SetPosition
  (JNIEnv *, jclass, jlong, jfloat, jfloat, jfloat);

/*
 * Class:     jagdx_D3DLIGHT
 * Method:    SetDirection
 * Signature: (JFFF)V
 */
JNIEXPORT void JNICALL Java_jagdx_D3DLIGHT_SetDirection
  (JNIEnv *, jclass, jlong, jfloat, jfloat, jfloat);

/*
 * Class:     jagdx_D3DLIGHT
 * Method:    SetAttenuation
 * Signature: (JFFF)V
 */
JNIEXPORT void JNICALL Java_jagdx_D3DLIGHT_SetAttenuation
  (JNIEnv *, jclass, jlong, jfloat, jfloat, jfloat);

/*
 * Class:     jagdx_D3DLIGHT
 * Method:    SetSpotParams
 * Signature: (JFFF)V
 */
JNIEXPORT void JNICALL Java_jagdx_D3DLIGHT_SetSpotParams
  (JNIEnv *, jclass, jlong, jfloat, jfloat, jfloat);

/*
 * Class:     jagdx_D3DLIGHT
 * Method:    SetRange
 * Signature: (JF)V
 */
JNIEXPORT void JNICALL Java_jagdx_D3DLIGHT_SetRange
  (JNIEnv *, jclass, jlong, jfloat);

#ifdef __cplusplus
}
#endif
#endif