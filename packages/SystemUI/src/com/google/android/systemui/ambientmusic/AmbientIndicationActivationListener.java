package com.google.android.systemui.ambientmusic;

import com.android.systemui.statusbar.phone.DoubleTapHelper;
import com.google.android.systemui.ambientmusic.AmbientIndicationContainerPlay;

public class AmbientIndicationActivationListener
implements DoubleTapHelper.ActivationListener {
    private Object mContainer;

    private void updateActive(boolean bl) {
        ((AmbientIndicationContainerPlay)this.mContainer).setActive(bl);
    }

    public AmbientIndicationActivationListener(Object object) {
        this.mContainer = object;
    }

    @Override
    public void onActiveChanged(boolean bl) {
        this.updateActive(bl);
    }
}
