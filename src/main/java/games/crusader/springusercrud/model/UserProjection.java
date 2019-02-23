package games.crusader.springusercrud.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "UserProjection", types={User.class})
public interface UserProjection {
    Long getId();
    String getFirstName();
    String getLastName();
    String getUsername();
}
