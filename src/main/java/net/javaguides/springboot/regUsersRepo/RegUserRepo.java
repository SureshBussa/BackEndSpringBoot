package net.javaguides.springboot.regUsersRepo;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.javaguides.springboot.regusersmodel.RegUser;


@Repository
public interface RegUserRepo extends JpaRepository<RegUser, Long>{
	
    List<RegUser> findByEmailAndPassword(String email,String password);

    List<RegUser> findByEmail(String email);

}
