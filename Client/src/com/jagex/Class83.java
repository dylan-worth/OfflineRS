package com.jagex;

public class Class83 implements Interface12, Interface5 {
   static int anInt846;
   Class454 aClass454_845;
   public int anInt843;
   public boolean aBool844 = true;
   public String aString842;

   public boolean method1167(int var1) {
      return Class454.aClass454_4997 == this.aClass454_845;
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-592914654);
         if(var3 == 0) {
            return;
         }

         this.method1173(var1, var3, (byte)98);
      }
   }

   public void method81(int var1) {
   }

   public void method49(int var1, int var2) {
   }

   public void method85() {
   }

   public boolean method1168() {
      return Class454.aClass454_4997 == this.aClass454_845;
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1114545041);
         if(var2 == 0) {
            return;
         }

         this.method1173(var1, var2, (byte)57);
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1965634942);
         if(var2 == 0) {
            return;
         }

         this.method1173(var1, var2, (byte)121);
      }
   }

   public boolean method1169() {
      return Class454.aClass454_4997 == this.aClass454_845;
   }

   public void method50(int var1) {
   }

   public void method51(int var1) {
   }

   void method1170(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         char var3 = Class69.method1087(var1.readByte(), (short)10053);
         this.aClass454_845 = Class454.method5388(var3, -1900017564);
      } else if(var2 == 2) {
         this.anInt843 = var1.readInt() * 1363298209;
      } else if(4 == var2) {
         this.aBool844 = false;
      } else if(var2 == 5) {
         this.aString842 = var1.readString(1918846472);
      } else if(101 == var2) {
         this.aClass454_845 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(), (byte)0);
      }

   }

   void method1171(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         char var3 = Class69.method1087(var1.readByte(), (short)6622);
         this.aClass454_845 = Class454.method5388(var3, -1786913459);
      } else if(var2 == 2) {
         this.anInt843 = var1.readInt() * 1363298209;
      } else if(4 == var2) {
         this.aBool844 = false;
      } else if(var2 == 5) {
         this.aString842 = var1.readString(426890634);
      } else if(101 == var2) {
         this.aClass454_845 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(), (byte)-80);
      }

   }

   public boolean method1172() {
      return Class454.aClass454_4997 == this.aClass454_845;
   }

   void method1173(RSByteBuffer var1, int var2, byte var3) {
      if(1 == var2) {
         char var4 = Class69.method1087(var1.readByte(), (short)1796);
         this.aClass454_845 = Class454.method5388(var4, -1478341284);
      } else if(var2 == 2) {
         this.anInt843 = var1.readInt() * 1363298209;
      } else if(4 == var2) {
         this.aBool844 = false;
      } else if(var2 == 5) {
         this.aString842 = var1.readString(1832610513);
      } else if(101 == var2) {
         this.aClass454_845 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var1.readSmart(), (byte)-126);
      }

   }

   public static Class397 method1174(RSByteBuffer var0, int var1) {
      int var2 = var0.readUnsignedByte(-1188710561);
      Class384 var3 = Class711_Sub33.method10141((byte)-5)[var0.readUnsignedByte(-1487628862)];
      Class389 var4 = Class331.method4251((byte)15)[var0.readUnsignedByte(2086366966)];
      int var5 = var0.readShort();
      int var6 = var0.readShort();
      int var7 = var0.readUnsignedShort();
      int var8 = var0.readUnsignedShort();
      int var9 = var0.readInt();
      int var10 = var0.readInt();
      int var11 = var0.readInt();
      boolean var12 = var0.readUnsignedByte(1565516935) == 1;
      return new Class397(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }
}
