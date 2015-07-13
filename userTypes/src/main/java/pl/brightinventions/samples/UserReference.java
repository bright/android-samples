package pl.brightinventions.samples;

import android.support.annotation.NonNull;

interface UserReference {
    int getId();
    void dispatchBehavior(@NonNull UserBehavior userBehavior);
}
