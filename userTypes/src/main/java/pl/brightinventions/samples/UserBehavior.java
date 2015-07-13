package pl.brightinventions.samples;

public abstract class UserBehavior {
    private boolean shouldRunDefault;

    public void byDefault(UserReference reference){}

    public void onAnonymous(UserReference user){
        shouldRunDefault = true;
    }
    public void onRegular(RegularUserReference user) {
        shouldRunDefault = true;
    }
    public void onPremium(RegularUserReference user) {
        shouldRunDefault = true;
    }

    public void dispatch(CurrentUserProvider provider){
        UserReference userReference = provider.getCurrentUserReference();
        shouldRunDefault = false;
        userReference.dispatchBehavior(this);
        if(shouldRunDefault){
            shouldRunDefault = false;
            byDefault(userReference);
        }
    }
}

