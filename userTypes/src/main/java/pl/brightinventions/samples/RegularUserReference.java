package pl.brightinventions.samples;

import android.support.annotation.NonNull;

class RegularUserReference implements UserReference {
    private final User _user;

    public RegularUserReference(User user) {
        _user = user;
    }
    @Override
    public int getId() {
        return _user.getId();
    }

    @Override
    public void dispatchBehavior(@NonNull UserBehavior userBehavior) {
        userBehavior.onRegular(this);
    }

}
