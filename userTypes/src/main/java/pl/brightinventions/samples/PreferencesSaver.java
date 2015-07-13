package pl.brightinventions.samples;

import android.content.Context;
import android.content.SharedPreferences;

class PreferencesSaver {
    private static final String USER = "user";
    private final Context _context;

    public PreferencesSaver(Context context) {
        _context = context;
    }

    public void savePreferences(CurrentUserProvider userProvider, AppConfig appConfig){
        String keyPrefix =  "appConfig." + userProvider.getCurrentUserReference().getId();
        SharedPreferences preferences = _context.getSharedPreferences(keyPrefix, Context.MODE_PRIVATE);
        preferences.edit()
                .putBoolean("useFeatureA", appConfig.useFeatureA)
                .putBoolean("useFeatureB", appConfig.useFeatureB)
                .apply();
    }
}
