package pl.brightinventions.samples;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

public interface CurrentUserProvider {
    @NonNull
    UserReference getCurrentUserReference();
}

@Singleton
class InMemoryUserSession implements CurrentUserProvider {
    UserReference _currentUser = new AnonymousUserReference();

    @NonNull
    @Override
    public UserReference getCurrentUserReference() {
        return _currentUser;
    }

    public void setNewUser(User user){
        _currentUser = new RegularUserReference(user);
    }

}

