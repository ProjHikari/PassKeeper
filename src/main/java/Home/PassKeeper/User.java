package Home.PassKeeper;

import lombok.*;

@Data
@Builder
public class User {
    
    private int id;

    private String name;

    private String acc_name;

    private String acc_pass;


}
