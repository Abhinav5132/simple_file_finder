package org.example;

import org.junit.Test;
import org.example.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class UserServiceTest {
    
    @Test
    public void createUser_ShouldSaveNewUser_WhenUsernameNotTaken() {
        UserRepo repo = mock(UserRepo.class);
        UserService service = new UserService(repo);
        PasswordRepo pwdRepo = mock(PasswordRepo.class);

        when(repo.findByUsername("Bob")).thenReturn(null);

        User create = service.createUser("Bob", "pass123", pwdRepo);

        assertNotNull(create);
        assertEquals("Bob", create.getUsername());

        verify(repo).saveUser(any(User.class));
    }
}
