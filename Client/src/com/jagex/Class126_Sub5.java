package com.jagex;

import com.jagex.Class124;
import com.jagex.Class124_Sub2;
import com.jagex.Class126;
import com.jagex.Class132;
import com.jagex.Class133;
import com.jagex.Class140;
import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public class Class126_Sub5 extends Class126 {
   static final String aString8967 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
   static final String aString8971 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
   boolean aBool8969 = false;
   boolean aBool8970 = false;
   Class132 aClass132_8966;
   Class133 aClass133_8968;

   void method1506(boolean var1) {
      Class124_Sub2 var2 = this.aClass174_Sub2_1598.method8626();
      if(this.aBool8970 && var2 != null) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641(var2);
         this.aClass174_Sub2_1598.method8677(0);
         this.aClass174_Sub2_1598.method8641(this.aClass132_8966.aClass124_Sub4_1631);
         int var3 = this.aClass133_8968.anInt1635;
         OpenGL.glUseProgram(var3);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "normalSampler"), 0);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "envMapSampler"), 1);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var3, "sunDir"), -this.aClass174_Sub2_1598.aFloatArray9657[0], -this.aClass174_Sub2_1598.aFloatArray9657[1], -this.aClass174_Sub2_1598.aFloatArray9657[2]);
         OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var3, "sunColour"), this.aClass174_Sub2_1598.aFloat9567, this.aClass174_Sub2_1598.aFloat9583, this.aClass174_Sub2_1598.aFloat9626, 1.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var3, "sunExponent"), 96.0F + Math.abs(this.aClass174_Sub2_1598.aFloatArray9657[1]) * 928.0F);
         this.aBool8969 = true;
      }

   }

   boolean method1505() {
      return this.aBool8970;
   }

   void method1507(boolean var1) {
   }

   void method1514() {
      if(this.aBool8969) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         OpenGL.glUseProgram(0);
         this.aBool8969 = false;
      }

   }

   void method1518(Class124 var1, int var2) {
      if(!this.aBool8969) {
         this.aClass174_Sub2_1598.method8641(var1);
         this.aClass174_Sub2_1598.method8672(var2);
      }

   }

   void method1504(boolean var1) {
   }

   Class126_Sub5(Class174_Sub2 var1, Class132 var2) {
      super(var1);
      this.aClass132_8966 = var2;
      if(this.aClass132_8966.aClass124_Sub4_1631 != null && this.aClass174_Sub2_1598.aBool9639 && this.aClass174_Sub2_1598.aBool9641) {
         Class140 var3 = Class140.method1651(this.aClass174_Sub2_1598, '\u8b31', "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
         Class140 var4 = Class140.method1651(this.aClass174_Sub2_1598, '\u8b30', "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
         this.aClass133_8968 = Class133.method1629(this.aClass174_Sub2_1598, new Class140[]{var3, var4});
         this.aBool8970 = this.aClass133_8968 != null;
      }

   }

   boolean method1511() {
      return this.aBool8970;
   }

   void method1510(boolean var1) {
      Class124_Sub2 var2 = this.aClass174_Sub2_1598.method8626();
      if(this.aBool8970 && var2 != null) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641(var2);
         this.aClass174_Sub2_1598.method8677(0);
         this.aClass174_Sub2_1598.method8641(this.aClass132_8966.aClass124_Sub4_1631);
         int var3 = this.aClass133_8968.anInt1635;
         OpenGL.glUseProgram(var3);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "normalSampler"), 0);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "envMapSampler"), 1);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var3, "sunDir"), -this.aClass174_Sub2_1598.aFloatArray9657[0], -this.aClass174_Sub2_1598.aFloatArray9657[1], -this.aClass174_Sub2_1598.aFloatArray9657[2]);
         OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var3, "sunColour"), this.aClass174_Sub2_1598.aFloat9567, this.aClass174_Sub2_1598.aFloat9583, this.aClass174_Sub2_1598.aFloat9626, 1.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var3, "sunExponent"), 96.0F + Math.abs(this.aClass174_Sub2_1598.aFloatArray9657[1]) * 928.0F);
         this.aBool8969 = true;
      }

   }

   void method1509(int var1, int var2) {
      if(this.aBool8969) {
         int var3 = 1 << (var1 & 3);
         float var4 = (float)(1 << (var1 >> 3 & 7)) / 32.0F;
         int var5 = var2 & '\uffff';
         float var6 = (float)(var2 >> 16 & 3) / 8.0F;
         int var7 = this.aClass133_8968.anInt1635;
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "time"), (float)(var3 * this.aClass174_Sub2_1598.anInt9473 % '\u9c40') / 40000.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "scale"), var4);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterDepth"), (float)var5);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterOffset"), var6);
      }

   }

   void method1512() {
      if(this.aBool8969) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         OpenGL.glUseProgram(0);
         this.aBool8969 = false;
      }

   }

   void method1508() {
      if(this.aBool8969) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         OpenGL.glUseProgram(0);
         this.aBool8969 = false;
      }

   }

   void method1515(int var1, int var2) {
      if(this.aBool8969) {
         int var3 = 1 << (var1 & 3);
         float var4 = (float)(1 << (var1 >> 3 & 7)) / 32.0F;
         int var5 = var2 & '\uffff';
         float var6 = (float)(var2 >> 16 & 3) / 8.0F;
         int var7 = this.aClass133_8968.anInt1635;
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "time"), (float)(var3 * this.aClass174_Sub2_1598.anInt9473 % '\u9c40') / 40000.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "scale"), var4);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterDepth"), (float)var5);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterOffset"), var6);
      }

   }

   void method1516(int var1, int var2) {
      if(this.aBool8969) {
         int var3 = 1 << (var1 & 3);
         float var4 = (float)(1 << (var1 >> 3 & 7)) / 32.0F;
         int var5 = var2 & '\uffff';
         float var6 = (float)(var2 >> 16 & 3) / 8.0F;
         int var7 = this.aClass133_8968.anInt1635;
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "time"), (float)(var3 * this.aClass174_Sub2_1598.anInt9473 % '\u9c40') / 40000.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "scale"), var4);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterDepth"), (float)var5);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterOffset"), var6);
      }

   }

   void method1517(Class124 var1, int var2) {
      if(!this.aBool8969) {
         this.aClass174_Sub2_1598.method8641(var1);
         this.aClass174_Sub2_1598.method8672(var2);
      }

   }

   void method1520(Class124 var1, int var2) {
      if(!this.aBool8969) {
         this.aClass174_Sub2_1598.method8641(var1);
         this.aClass174_Sub2_1598.method8672(var2);
      }

   }

   void method1519(Class124 var1, int var2) {
      if(!this.aBool8969) {
         this.aClass174_Sub2_1598.method8641(var1);
         this.aClass174_Sub2_1598.method8672(var2);
      }

   }

   void method1513(Class124 var1, int var2) {
      if(!this.aBool8969) {
         this.aClass174_Sub2_1598.method8641(var1);
         this.aClass174_Sub2_1598.method8672(var2);
      }

   }
}
