package murraco.model.nosql;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppUser implements Serializable {

  @Id
  private String id;


  private String username;


  private String email;

 
  private String password;


  List<AppUserRole> appUserRoles;

}
