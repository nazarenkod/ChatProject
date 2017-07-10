package entities;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by nazarenkod on 10.07.17.
 */

public class Model {
    private String nickname;
    public String getNickname() {
        return nickname;
    }

    public Model(String nickname) {
        this.nickname = nickname;
    }




}
