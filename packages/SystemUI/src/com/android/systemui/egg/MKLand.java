/*
 * Copyright (C) 2014-2015 The MoKee OpenSource Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.egg;

import com.android.systemui.R;

import android.content.Context;
import android.util.AttributeSet;

public class MKLand extends LLand {
    public static final String TAG = "MKLand";

    public MKLand(Context context) {
        super(context, null);
    }

    public MKLand(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public MKLand(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getEggPlayer() {
        return R.drawable.mokee;
    }

    @Override
    protected boolean isMK () {
        return true;
    }
}
