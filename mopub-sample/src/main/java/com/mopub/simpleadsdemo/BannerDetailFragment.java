// Copyright 2018 Twitter, Inc.
// Licensed under the MoPub SDK License Agreement
// http://www.mopub.com/legal/sdk-license-agreement/

package com.mopub.simpleadsdemo;

public class BannerDetailFragment extends AbstractBannerDetailFragment {

    @Override
    public int getWidth() {
        return (int) getResources().getDimension(R.dimen.banner_width);
    }

    @Override
    public int getHeight() {
        return (int) getResources().getDimension(R.dimen.banner_height);
    }
}
