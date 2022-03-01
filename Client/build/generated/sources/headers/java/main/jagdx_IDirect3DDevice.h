/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class jagdx_IDirect3DDevice */

#ifndef _Included_jagdx_IDirect3DDevice
#define _Included_jagdx_IDirect3DDevice
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    Destroy
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_jagdx_IDirect3DDevice_Destroy
  (JNIEnv *, jclass, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    GetRenderTarget
 * Signature: (JI)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_GetRenderTarget
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    GetRenderTargetData
 * Signature: (JJJ)V
 */
JNIEXPORT void JNICALL Java_jagdx_IDirect3DDevice_GetRenderTargetData
  (JNIEnv *, jclass, jlong, jlong, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetRenderTarget
 * Signature: (JIJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetRenderTarget
  (JNIEnv *, jclass, jlong, jint, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateRenderTarget
 * Signature: (JIIIIIZ)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateRenderTarget
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jint, jboolean);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    GetSwapChain
 * Signature: (JI)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_GetSwapChain
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateAdditionalSwapChain
 * Signature: (JLjagdx/D3DPRESENT_PARAMETERS;)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateAdditionalSwapChain
  (JNIEnv *, jclass, jlong, jobject);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    GetDepthStencilSurface
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_GetDepthStencilSurface
  (JNIEnv *, jclass, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetDepthStencilSurface
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetDepthStencilSurface
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateDepthStencilSurface
 * Signature: (JIIIIIZ)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateDepthStencilSurface
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jint, jboolean);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateOffscreenPlainSurface
 * Signature: (JIIII)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateOffscreenPlainSurface
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    GetBackBuffer
 * Signature: (JIII)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_GetBackBuffer
  (JNIEnv *, jclass, jlong, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    StretchRect
 * Signature: (JJIIIIJIIIII)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_StretchRect
  (JNIEnv *, jclass, jlong, jlong, jint, jint, jint, jint, jlong, jint, jint, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateVertexBuffer
 * Signature: (JIIII)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateVertexBuffer
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateIndexBuffer
 * Signature: (JIIII)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateIndexBuffer
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateVertexDeclaration
 * Signature: (JJ)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateVertexDeclaration
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetStreamSource
 * Signature: (JIJII)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetStreamSource
  (JNIEnv *, jclass, jlong, jint, jlong, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetVertexDeclaration
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetVertexDeclaration
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetIndices
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetIndices
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    DrawIndexedPrimitive
 * Signature: (JIIIIII)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_DrawIndexedPrimitive
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    DrawIndexedPrimitiveIB
 * Signature: (JJIIIIII)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_DrawIndexedPrimitiveIB
  (JNIEnv *, jclass, jlong, jlong, jint, jint, jint, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    DrawPrimitive
 * Signature: (JIII)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_DrawPrimitive
  (JNIEnv *, jclass, jlong, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateTexture
 * Signature: (JIIIIII)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateTexture
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateCubeTexture
 * Signature: (JIIIII)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateCubeTexture
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateVolumeTexture
 * Signature: (JIIIIIII)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateVolumeTexture
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetTexture
 * Signature: (JIJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetTexture
  (JNIEnv *, jclass, jlong, jint, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetTextureStageState
 * Signature: (JIII)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetTextureStageState
  (JNIEnv *, jclass, jlong, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetSamplerState
 * Signature: (JIII)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetSamplerState
  (JNIEnv *, jclass, jlong, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    UpdateTexture
 * Signature: (JJJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_UpdateTexture
  (JNIEnv *, jclass, jlong, jlong, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateVertexShader
 * Signature: (J[B)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateVertexShader
  (JNIEnv *, jclass, jlong, jbyteArray);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreatePixelShader
 * Signature: (J[B)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreatePixelShader
  (JNIEnv *, jclass, jlong, jbyteArray);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetPixelShader
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetPixelShader
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetVertexShader
 * Signature: (JJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetVertexShader
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetPixelShaderConstantF
 * Signature: (JIJI)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetPixelShaderConstantF
  (JNIEnv *, jclass, jlong, jint, jlong, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetVertexShaderConstantF
 * Signature: (JIJI)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetVertexShaderConstantF
  (JNIEnv *, jclass, jlong, jint, jlong, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    CreateEventQuery
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_jagdx_IDirect3DDevice_CreateEventQuery
  (JNIEnv *, jclass, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    Clear
 * Signature: (JIIFI)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_Clear
  (JNIEnv *, jclass, jlong, jint, jint, jfloat, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    BeginScene
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_BeginScene
  (JNIEnv *, jclass, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    EndScene
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_EndScene
  (JNIEnv *, jclass, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetTransform
 * Signature: (JI[F)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetTransform
  (JNIEnv *, jclass, jlong, jint, jfloatArray);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetScissorRect
 * Signature: (JIIII)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetScissorRect
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetViewport
 * Signature: (JIIIIFF)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetViewport
  (JNIEnv *, jclass, jlong, jint, jint, jint, jint, jfloat, jfloat);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetRenderState
 * Signature: (JII)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetRenderState
  (JNIEnv *, jclass, jlong, jint, jint);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetRenderStatef
 * Signature: (JIF)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetRenderStatef
  (JNIEnv *, jclass, jlong, jint, jfloat);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetRenderStateb
 * Signature: (JIZ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetRenderStateb
  (JNIEnv *, jclass, jlong, jint, jboolean);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    SetLight
 * Signature: (JIJ)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_SetLight
  (JNIEnv *, jclass, jlong, jint, jlong);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    LightEnable
 * Signature: (JIZ)Z
 */
JNIEXPORT jboolean JNICALL Java_jagdx_IDirect3DDevice_LightEnable
  (JNIEnv *, jclass, jlong, jint, jboolean);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    Reset
 * Signature: (JLjagdx/D3DPRESENT_PARAMETERS;)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_Reset
  (JNIEnv *, jclass, jlong, jobject);

/*
 * Class:     jagdx_IDirect3DDevice
 * Method:    TestCooperativeLevel
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_jagdx_IDirect3DDevice_TestCooperativeLevel
  (JNIEnv *, jclass, jlong);

#ifdef __cplusplus
}
#endif
#endif
