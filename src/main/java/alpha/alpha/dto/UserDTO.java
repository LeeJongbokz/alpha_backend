package alpha.alpha.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserDTO {

    private final String id;
    private final String name;
    private final String email;
    private final String password;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public static class Builder {

        private String id;
        private String name;
        private String email;
        private String password;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Builder id(String val){
            id = val;
            return this;
        }
        public Builder name(String val){
            name = val;
            return this;
        }
        public Builder email(String val){
            email = val;
            return this;
        }
        public Builder password(String val){
            password = val;
            return this;
        }
        public Builder createdAt(LocalDateTime val){
            createdAt = val;
            return this;
        }
        public Builder updatedAt(LocalDateTime val){
            updatedAt = val;
            return this;
        }

        public UserDTO build(){
            return new UserDTO(this);
        }
    }

    private UserDTO(Builder builder){
        id = builder.id;
        name = builder.name;
        email = builder.email;
        password = builder.password;
        createdAt = builder.createdAt;
        updatedAt = builder.updatedAt;
    }

}
