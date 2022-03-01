/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class jaclib_hardware_info_HardwareInfo */

#ifndef _Included_jaclib_hardware_info_HardwareInfo
#define _Included_jaclib_hardware_info_HardwareInfo
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     jaclib_hardware_info_HardwareInfo
 * Method:    getCPUInfo
 * Signature: ()[I
 */
JNIEXPORT jintArray JNICALL Java_jaclib_hardware_1info_HardwareInfo_getCPUInfo
  (JNIEnv *, jclass);

/*
 * Class:     jaclib_hardware_info_HardwareInfo
 * Method:    getRawCPUInfo
 * Signature: ()[I
 */
JNIEXPORT jintArray JNICALL Java_jaclib_hardware_1info_HardwareInfo_getRawCPUInfo
  (JNIEnv *, jclass);

/*
 * Class:     jaclib_hardware_info_HardwareInfo
 * Method:    getDXDiagSystemProps
 * Signature: ()[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_jaclib_hardware_1info_HardwareInfo_getDXDiagSystemProps
  (JNIEnv *, jclass);

/*
 * Class:     jaclib_hardware_info_HardwareInfo
 * Method:    getDXDiagDisplayDevicesProps
 * Signature: ()[[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_jaclib_hardware_1info_HardwareInfo_getDXDiagDisplayDevicesProps
  (JNIEnv *, jclass);

/*
 * Class:     jaclib_hardware_info_HardwareInfo
 * Method:    getOpenGLProps
 * Signature: ()[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_jaclib_hardware_1info_HardwareInfo_getOpenGLProps
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
