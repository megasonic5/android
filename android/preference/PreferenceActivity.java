package android.preference;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

@Deprecated
public abstract class PreferenceActivity extends Activity {
    private PreferenceManager mPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPreferenceManager = PreferenceManager.create(this);
    }

    public void addPreferencesFromResource(int preferencesResId) {
        requirePreferenceManager();
        setPreferenceScreen(mPreferenceManager.inflateFromResource(this, preferencesResId, getPreferenceScreen()));
    }

    public PreferenceScreen getPreferenceScreen() {
        return mPreferenceManager.getPreferenceScreen();
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        mPreferenceManager.setPreferences(preferenceScreen);
        // Typically, this will bind the preferences to a ListView
    }

    public ListView getListView() {
        // Return the ListView showing preferences
        return findViewById(android.R.id.list);
    }

    private void requirePreferenceManager() {
        if (mPreferenceManager == null) {
            throw new IllegalStateException("PreferenceActivity has not been created yet");
        }
    }
}
