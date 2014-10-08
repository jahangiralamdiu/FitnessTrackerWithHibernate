import junit.framework.TestCase;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by lenovo on 08/10/2014.
 */
public class PasswordHash extends TestCase {

    public void testBcryptHash()
    {
        String password = "secret";
       BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println(hashedPassword);
    }

    public void testMD5Hash()
    {
        String password = "secret";
        Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
        String hashedPassword = passwordEncoder.encodePassword(password, null);
        System.out.println(hashedPassword);
    }
}
