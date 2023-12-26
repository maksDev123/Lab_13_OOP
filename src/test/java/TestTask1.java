



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.task1.Users.FacebookUser;
import com.example.task1.Users.MessageSender;
import com.example.task1.Users.MyFacebookUser;
import com.example.task1.Users.MyTwitterUser;
import com.example.task1.Users.TwitterUser;
import com.example.task1.Users.UserAdapter;

public class TestTask1 {

    @org.junit.jupiter.api.Test
    public void testNoReturn() {
        FacebookUser user_f_1 = new FacebookUser();
        MyFacebookUser user_f = new MyFacebookUser(user_f_1);
        UserAdapter user_1 = new UserAdapter(user_f);

        TwitterUser user_t_1 = new TwitterUser();
        MyTwitterUser user_t = new MyTwitterUser(user_t_1);
        UserAdapter user_2 = new UserAdapter(user_t);

        assertTrue(MessageSender.send_message(user_1, "test"));
        assertTrue(MessageSender.send_message(user_2, "test"));

    }

}