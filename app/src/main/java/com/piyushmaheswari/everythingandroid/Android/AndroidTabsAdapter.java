package com.piyushmaheswari.everythingandroid.Android;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class AndroidTabsAdapter extends FragmentPagerAdapter {

    public AndroidTabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                BasicsFragment basicsFragment=new BasicsFragment();
                return basicsFragment;
            case 1:
                ActivityFragment activityFragment=new ActivityFragment();
                return activityFragment;

            case 2:
                IntentFragment intentFragment=new IntentFragment();
                return intentFragment;

            case 3:
                ServicesFragment servicesFragment=new ServicesFragment();
                return servicesFragment;

            case 4:
                DatabaseFragment databaseFragment=new DatabaseFragment();
                return databaseFragment;

            case 5:
                UIFragment uiFragment=new UIFragment();
                return uiFragment;

            case 6:
                LocationFragment locationFragment=new LocationFragment();
                return locationFragment;

            case 7:
                ManifestFragment manifestFragment=new ManifestFragment();
                return manifestFragment;

            case 8:
                AdvanceFragment advanceFragment=new AdvanceFragment();
                return advanceFragment;


            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 9;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Basics";

            case 1:
                return "Activity";

            case 2:
                return "Intents";

            case 3:
                return "Services";

            case 4:
                return "Database";

            case 5:
                return "User Interface";

            case 6:
                return "Location";

            case 7:
                return "Manifest";

            case 8:
                return "Advance";

            default:
                return null;
        }

    }
}
