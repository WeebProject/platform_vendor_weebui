package com.weeb.android.systemui;

import android.content.Context;

import com.weeb.android.systemui.dagger.DaggerGlobalRootComponentWeeb;
import com.weeb.android.systemui.dagger.GlobalRootComponentWeeb;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class SystemUIWeebFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerGlobalRootComponentWeeb.builder()
                .context(context)
                .build();
    }
}
