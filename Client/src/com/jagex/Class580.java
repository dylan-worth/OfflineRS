package com.jagex;

public class Class580 implements Interface12, Interface5 {
   public static Interface24 anInterface24_7751;
   int anInt7748 = -1998058945;
   int[] anIntArray7746;
   int anInt7747 = 1860339145;
   Class583 aClass583_7749;
   int anInt7750;

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(1127533189);
         if(var3 == 0) {
            return;
         }

         this.method6962(var1, var3, (byte)30);
      }
   }

   public void method85() {
   }

   public void method49(int var1, int var2) {
   }

   public void method81(int var1) {
   }

   void method6962(RSByteBuffer var1, int var2, byte var3) {
      if(1 == var2) {
         this.anInt7748 = var1.readUnsignedShort() * 1998058945;
      } else if(2 == var2) {
         this.anIntArray7746 = new int[var1.readUnsignedByte(1725715421)];

         for(int var4 = 0; var4 < this.anIntArray7746.length; ++var4) {
            this.anIntArray7746[var4] = var1.readUnsignedShort();
         }
      } else if(3 == var2) {
         this.anInt7747 = var1.readUnsignedByte(1562238767) * -1860339145;
      } else if(4 == var2) {
         this.aClass583_7749 = (Class583)Class561.findIdentifiable(Class171.method2156((byte)-40), var1.readUnsignedByte(-1572763424), (byte)-27);
      } else if(5 == var2) {
         this.anInt7750 = var1.readBigSmart() * 368318275;
      } else if(6 == var2) {
         var1.readBigSmart();
      }

   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1515418368);
         if(var2 == 0) {
            return;
         }

         this.method6962(var1, var2, (byte)73);
      }
   }

   public void method50(int var1) {
   }

   Class580() {
      this.aClass583_7749 = Class583.aClass583_7779;
      this.anInt7750 = -368318275;
   }

   public void method51(int var1) {
   }

   void method6963(RSByteBuffer var1, int var2) {
      if(1 == var2) {
         this.anInt7748 = var1.readUnsignedShort() * 1998058945;
      } else if(2 == var2) {
         this.anIntArray7746 = new int[var1.readUnsignedByte(-1058074550)];

         for(int var3 = 0; var3 < this.anIntArray7746.length; ++var3) {
            this.anIntArray7746[var3] = var1.readUnsignedShort();
         }
      } else if(3 == var2) {
         this.anInt7747 = var1.readUnsignedByte(-801372323) * -1860339145;
      } else if(4 == var2) {
         this.aClass583_7749 = (Class583)Class561.findIdentifiable(Class171.method2156((byte)16), var1.readUnsignedByte(523544063), (byte)-9);
      } else if(5 == var2) {
         this.anInt7750 = var1.readBigSmart() * 368318275;
      } else if(6 == var2) {
         var1.readBigSmart();
      }

   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1331477745);
         if(var2 == 0) {
            return;
         }

         this.method6962(var1, var2, (byte)69);
      }
   }

   static final void method6964(Class681 var0, int var1) {
      String var2;
      if(Class451.localPlayer != null && Class451.localPlayer.aString12175 != null) {
         var2 = Class451.localPlayer.method10969(false, -404037222);
      } else {
         var2 = "";
      }

      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2;
   }

   public static int method6965(int var0, int var1, int var2, int var3) {
      int var4 = 255 - var2;
      var1 = ((var1 & 16711935) * var2 & -16711936 | var2 * (var1 & '\uff00') & 16711680) >>> 8;
      return var1 + ((var4 * (var0 & 16711935) & -16711936 | var4 * (var0 & '\uff00') & 16711680) >>> 8);
   }

   static final void method6966(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-63);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class552.method6649(var3, var4, var0, -1057046888);
   }
}
