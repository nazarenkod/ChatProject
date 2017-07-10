package entities;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by nazarenkod on 10-Jul-17.
 */
@Builder
public class User {
    @Getter
    private String login;
    @Getter
    private String password;
    @Getter
    private String proxy;
}
