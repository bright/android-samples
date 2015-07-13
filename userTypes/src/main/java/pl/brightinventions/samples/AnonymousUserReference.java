package pl.brightinventions.samples;

import android.support.annotation.NonNull;

//NullObject
class AnonymousUserReference implements UserReference {
    @Override
    public int getId() {
        return -1;
    }

    @Override
    public void dispatchBehavior(@NonNull UserBehavior userBehavior) {
        userBehavior.onAnonymous(this);
    }

}
