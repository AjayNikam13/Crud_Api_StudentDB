package JpaRepoP;

import org.springframework.data.jpa.repository.JpaRepository;

import EntityP.Stud;

public interface UserRepo extends JpaRepository<Stud, Integer>
{

}
