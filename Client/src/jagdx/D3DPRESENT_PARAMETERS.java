package jagdx;

import java.awt.Component;

public class D3DPRESENT_PARAMETERS {
   public static final int anInt1151 = Integer.MIN_VALUE;
   public boolean Windowed;
   public boolean EnableAutoDepthStencil;
   public int Flags;
   public int FullScreen_RefreshRateInHz;
   public int BackBufferWidth = 0;
   public int BackBufferHeight = 0;
   public int BackBufferFormat = 0;
   public int BackBufferCount = 0;
   public int MultiSampleType = 0;
   public int MultiSampleQuality = 0;
   public int SwapEffect = 1;
   public int AutoDepthStencilFormat = 0;
   public int PresentationInterval = Integer.MIN_VALUE;
   public Component DeviceWindow;

   public D3DPRESENT_PARAMETERS(Component var1) {
      this.DeviceWindow = var1;
   }
}
